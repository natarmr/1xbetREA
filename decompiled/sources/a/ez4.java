package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes2.dex */
public final class ez4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ez4 f8656a = new ez4();
    public static final sqp b = sqp.a("timestamp");
    public static final sqp c = sqp.a(Payload.TYPE);
    public static final sqp d = sqp.a(Payload.TYPE_APP);
    public static final sqp e = sqp.a("device");
    public static final sqp f = sqp.a("log");
    public static final sqp g = sqp.a("rollouts");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        n9f n9fVar = (n9f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.c(b, ((n25) n9fVar).f22783a);
        n25 n25Var = (n25) n9fVar;
        t960Var.a(c, n25Var.b);
        t960Var.a(d, n25Var.c);
        t960Var.a(e, n25Var.d);
        t960Var.a(f, n25Var.e);
        t960Var.a(g, n25Var.f);
    }
}
