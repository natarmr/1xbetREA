package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes2.dex */
public final class wz4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wz4 f40004a = new wz4();
    public static final sqp b = new sqp("projectNumber", rz4.q(rw2.r(a5d0.class, new v04(1))));
    public static final sqp c = new sqp("messageId", rz4.q(rw2.r(a5d0.class, new v04(2))));
    public static final sqp d = new sqp("instanceId", rz4.q(rw2.r(a5d0.class, new v04(3))));
    public static final sqp e = new sqp("messageType", rz4.q(rw2.r(a5d0.class, new v04(4))));
    public static final sqp f = new sqp("sdkPlatform", rz4.q(rw2.r(a5d0.class, new v04(5))));
    public static final sqp g = new sqp(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, rz4.q(rw2.r(a5d0.class, new v04(6))));
    public static final sqp h = new sqp(RemoteMessageConst.COLLAPSE_KEY, rz4.q(rw2.r(a5d0.class, new v04(7))));
    public static final sqp i = new sqp(RemoteMessageConst.Notification.PRIORITY, rz4.q(rw2.r(a5d0.class, new v04(8))));
    public static final sqp j = new sqp("ttl", rz4.q(rw2.r(a5d0.class, new v04(9))));
    public static final sqp k = new sqp("topic", rz4.q(rw2.r(a5d0.class, new v04(10))));
    public static final sqp l = new sqp("bulkId", rz4.q(rw2.r(a5d0.class, new v04(11))));
    public static final sqp m = new sqp("event", rz4.q(rw2.r(a5d0.class, new v04(12))));
    public static final sqp n = new sqp("analyticsLabel", rz4.q(rw2.r(a5d0.class, new v04(13))));
    public static final sqp o = new sqp("campaignId", rz4.q(rw2.r(a5d0.class, new v04(14))));
    public static final sqp p = new sqp("composerLabel", rz4.q(rw2.r(a5d0.class, new v04(15))));

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        r940 r940Var = (r940) obj;
        t960 t960Var = (t960) obj2;
        t960Var.c(b, r940Var.f30060a);
        t960Var.a(c, r940Var.b);
        t960Var.a(d, r940Var.c);
        t960Var.a(e, r940Var.d);
        t960Var.a(f, q940.ANDROID);
        t960Var.a(g, r940Var.e);
        t960Var.a(h, r940Var.f);
        t960Var.d(i, r940Var.g);
        t960Var.d(j, r940Var.h);
        t960Var.a(k, r940Var.i);
        t960Var.c(l, 0L);
        t960Var.a(m, o940.MESSAGE_DELIVERED);
        t960Var.a(n, r940Var.j);
        t960Var.c(o, 0L);
        t960Var.a(p, r940Var.k);
    }
}
