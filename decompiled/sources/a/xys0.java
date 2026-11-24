package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vys0 f41720a;
    public static final tys0 b;
    public static final wys0 c;
    public static final uys0 d;
    public static final /* synthetic */ xys0[] e;

    static {
        vys0 vys0Var = new vys0();
        f41720a = vys0Var;
        tys0 tys0Var = new tys0();
        b = tys0Var;
        wys0 wys0Var = new wys0();
        c = wys0Var;
        uys0 uys0Var = new uys0();
        d = uys0Var;
        e = new xys0[]{vys0Var, tys0Var, wys0Var, uys0Var};
    }

    public static xys0 b(tft0 tft0Var) {
        tft0Var.getClass();
        if (tft0Var.U()) {
            return b;
        }
        return uc9.X(gqw0.C1.L0(), thb.P(tft0Var), fys0.b) ? d : c;
    }

    public static xys0 valueOf(String str) {
        return (xys0) Enum.valueOf(xys0.class, str);
    }

    public static xys0[] values() {
        return (xys0[]) e.clone();
    }

    public xys0 a(tft0 tft0Var) {
        tft0Var.getClass();
        return b(tft0Var);
    }
}
