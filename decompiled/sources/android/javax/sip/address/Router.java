package android.javax.sip.address;

import android.javax.sip.message.Request;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public interface Router {
    Hop getNextHop(Request request);

    ListIterator getNextHops(Request request);

    Hop getOutboundProxy();
}
