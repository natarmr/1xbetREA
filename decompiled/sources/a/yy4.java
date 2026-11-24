package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes2.dex */
public final class yy4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yy4 f43450a = new yy4();
    public static final sqp b = sqp.a(Payload.TYPE);
    public static final sqp c = sqp.a("reason");
    public static final sqp d = sqp.a("frames");
    public static final sqp e = sqp.a("causedBy");
    public static final sqp f = sqp.a("overflowCount");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        b9f b9fVar = (b9f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ((s25) b9fVar).f31485a);
        s25 s25Var = (s25) b9fVar;
        t960Var.a(c, s25Var.b);
        t960Var.a(d, s25Var.c);
        t960Var.a(e, s25Var.d);
        t960Var.d(f, s25Var.e);
    }
}
