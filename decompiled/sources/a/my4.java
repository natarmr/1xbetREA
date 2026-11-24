package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes2.dex */
public final class my4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final my4 f22587a = new my4();
    public static final sqp b = sqp.a("sdkVersion");
    public static final sqp c = sqp.a("gmpAppId");
    public static final sqp d = sqp.a("platform");
    public static final sqp e = sqp.a("installationUuid");
    public static final sqp f = sqp.a("firebaseInstallationId");
    public static final sqp g = sqp.a("firebaseAuthenticationToken");
    public static final sqp h = sqp.a("appQualitySessionId");
    public static final sqp i = sqp.a("buildVersion");
    public static final sqp j = sqp.a("displayVersion");
    public static final sqp k = sqp.a(ParameterNames.SESSION);
    public static final sqp l = sqp.a("ndkPayload");
    public static final sqp m = sqp.a("appExitInfo");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        r9f r9fVar = (r9f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ((w15) r9fVar).b);
        w15 w15Var = (w15) r9fVar;
        t960Var.a(c, w15Var.c);
        t960Var.d(d, w15Var.d);
        t960Var.a(e, w15Var.e);
        t960Var.a(f, w15Var.f);
        t960Var.a(g, w15Var.g);
        t960Var.a(h, w15Var.h);
        t960Var.a(i, w15Var.i);
        t960Var.a(j, w15Var.j);
        t960Var.a(k, w15Var.k);
        t960Var.a(l, w15Var.l);
        t960Var.a(m, w15Var.m);
    }
}
