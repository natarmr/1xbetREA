package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/w74;", "La/iw5;", "<init>", "()V", "a/rek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class w74 extends iw5 {
    public final phf0 k2 = new phf0("EXTRA_REQUEST_KEY");
    public final phf0 l2 = new phf0("EXTRA_TITLE");
    public final cgx0 m2 = new cgx0("EXTRA_HAS_AUTHENTICATOR");
    public final r34 n2 = new r34("EXTRA_TIME");
    public final zz2 o2 = new zz2("EXTRA_ICON");
    public final phf0 p2 = new phf0("EXTRA_ID");
    public final cgx0 q2 = new cgx0("EXTRA_CURRENT_SESSION");
    public static final /* synthetic */ iiy[] s2 = {new ez40(w74.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(w74.class, "title", "getTitle()Ljava/lang/String;", 0), new ez40(w74.class, "hasAuthenticator", "getHasAuthenticator()Z", 0), new ez40(w74.class, CrashHianalyticsData.TIME, "getTime()J", 0), new ez40(w74.class, "icon", "getIcon()I", 0), new ez40(w74.class, ParameterNames.ID, "getId()Ljava/lang/String;", 0), new ez40(w74.class, "currentSession", "getCurrentSession()Z", 0)};
    public static final rek0 r2 = new rek0((byte) 25);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1934303889);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), y0x0.b, (ugd) null, u1c.M(1471105568, new un6(this, (byte) 20), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final boolean P0() {
        return this.q2.n(this, s2[6]).booleanValue();
    }
}
