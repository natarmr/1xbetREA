package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class d2f0<T> {
    public static final b2f0 Companion = new b2f0();
    public static final zna0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5354a;
    public final String b;
    public final String c;

    static {
        zna0 zna0Var = new zna0("org.xplatform.registration.core.data.models.RegistrationRequest", null, 3);
        zna0Var.j("Data", false);
        zna0Var.j("CaptchaId", false);
        zna0Var.j("ImageText", false);
        d = zna0Var;
    }

    public /* synthetic */ d2f0(Object obj, String str, int i, String str2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, d);
            throw null;
        }
        this.f5354a = obj;
        this.b = str;
        this.c = str2;
    }

    public d2f0(jo20 jo20Var, String str, String str2) {
        this.f5354a = jo20Var;
        this.b = str;
        this.c = str2;
    }
}
