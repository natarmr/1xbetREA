package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes2.dex */
public final class uy4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uy4 f36471a = new uy4();
    public static final sqp b = sqp.a("generator");
    public static final sqp c = sqp.a("identifier");
    public static final sqp d = sqp.a("appQualitySessionId");
    public static final sqp e = sqp.a("startedAt");
    public static final sqp f = sqp.a("endedAt");
    public static final sqp g = sqp.a("crashed");
    public static final sqp h = sqp.a(Payload.TYPE_APP);
    public static final sqp i = sqp.a("user");
    public static final sqp j = sqp.a("os");
    public static final sqp k = sqp.a("device");
    public static final sqp l = sqp.a("events");
    public static final sqp m = sqp.a("generatorType");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        q9f q9fVar = (q9f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ((h25) q9fVar).f12314a);
        h25 h25Var = (h25) q9fVar;
        t960Var.a(c, h25Var.b.getBytes(r9f.f30077a));
        t960Var.a(d, h25Var.c);
        t960Var.c(e, h25Var.d);
        t960Var.a(f, h25Var.e);
        t960Var.f(g, h25Var.f);
        t960Var.a(h, h25Var.g);
        t960Var.a(i, h25Var.h);
        t960Var.a(j, h25Var.i);
        t960Var.a(k, h25Var.j);
        t960Var.a(l, h25Var.k);
        t960Var.d(m, h25Var.l);
    }
}
