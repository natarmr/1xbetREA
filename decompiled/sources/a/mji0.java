package a;

import java.io.Serializable;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public interface mji0 extends Serializable, Cloneable {
    Vector getAttributes(boolean z);

    Vector getBandwidths(boolean z);

    j1e getConnection();

    Vector getEmails(boolean z);

    f8x getInfo();

    sjy getKey();

    Vector getMediaDescriptions(boolean z);

    ta80 getOrigin();

    Vector getPhones(boolean z);

    cki0 getSessionName();

    Vector getTimeDescriptions(boolean z);

    o2t0 getURI();

    vbu0 getVersion();

    Vector getZoneAdjustments(boolean z);
}
