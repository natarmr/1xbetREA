package android.gov.nist.javax.sip.clientauthutils;

import a.hny;
import android.gov.nist.javax.sip.stack.SIPStackTimerTask;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import android.javax.sip.header.AuthorizationHeader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class CredentialsCache {
    private ConcurrentHashMap<String, List<AuthorizationHeader>> authorizationHeaders = new ConcurrentHashMap<>();
    private SipTimer timer;

    public class TimeoutTask extends SIPStackTimerTask {
        String callId;
        String userName;

        public TimeoutTask(String str, String str2) {
            this.callId = str2;
            this.userName = str;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            CredentialsCache.this.authorizationHeaders.remove(this.callId);
        }
    }

    public CredentialsCache(SipTimer sipTimer) {
        this.timer = sipTimer;
    }

    public void cacheAuthorizationHeader(String str, AuthorizationHeader authorizationHeader, int i) {
        String username = authorizationHeader.getUsername();
        if (str == null) {
            hny.u("Call ID is null!");
            return;
        }
        List<AuthorizationHeader> linkedList = this.authorizationHeaders.get(str);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.authorizationHeaders.put(str, linkedList);
        } else {
            String realm = authorizationHeader.getRealm();
            ListIterator<AuthorizationHeader> listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                if (realm.equals(listIterator.next().getRealm())) {
                    listIterator.remove();
                }
            }
        }
        linkedList.add(authorizationHeader);
        TimeoutTask timeoutTask = new TimeoutTask(str, username);
        if (i != -1) {
            this.timer.schedule(timeoutTask, i * 1000);
        }
    }

    public Collection<AuthorizationHeader> getCachedAuthorizationHeaders(String str) {
        if (str != null) {
            return this.authorizationHeaders.get(str);
        }
        hny.u("Null arg!");
        return null;
    }

    public void removeAuthenticationHeader(String str) {
        this.authorizationHeaders.remove(str);
    }
}
