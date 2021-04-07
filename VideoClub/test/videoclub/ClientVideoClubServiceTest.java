package videoclub;

import org.easymock.EasyMock;
import junit.framework.TestCase;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ClientVideoClubServiceTest extends TestCase {

    private IVideoClubService remoteVideoClubServiceMock;
    private IVideo Video28Mock;

    protected void setUp() throws Exception {
        super.setUp();
        Video28Mock = EasyMock.createMock(IVideo.class);
        remoteVideoClubServiceMock
                = EasyMock.createMock(IVideoClubService.class);
    }

    public void testClientVideoClubService() {
        try {
            new ClientVideoClubService(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
// expected
        }
        new ClientVideoClubService(remoteVideoClubServiceMock);
    }

    /**
     * Test of getVideo of class ClientVideoClubService.
     */
    public void testGetVideo() throws Exception {
        EasyMock.expect(remoteVideoClubServiceMock.getVideo(28))
                .andReturn(Video28Mock);
        EasyMock.replay(remoteVideoClubServiceMock);
        IVideoClubService clientVideoClubService
                = new ClientVideoClubService(remoteVideoClubServiceMock);
        IVideo result = clientVideoClubService.getVideo(28);
        assertEquals(Video28Mock, result);
        EasyMock.verify(remoteVideoClubServiceMock);
    }
}
