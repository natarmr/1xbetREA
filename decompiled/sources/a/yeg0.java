package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yeg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lme0 f42484a;
    public static final yeg0 b;
    public static final /* synthetic */ yeg0[] c;

    static {
        yeg0 yeg0Var = new yeg0("ZERO", 0);
        b = yeg0Var;
        c = new yeg0[]{yeg0Var, new yeg0("ONE", 1), new yeg0("TWO", 2), new yeg0("THREE", 3), new yeg0("FOUR", 4), new yeg0("FIVE", 5), new yeg0("SIX", 6), new yeg0("SEVEN", 7), new yeg0("EIGHT", 8), new yeg0("NINE", 9), new yeg0("TEN", 10), new yeg0("ELEVEN", 11), new yeg0("TWELVE", 12)};
        f42484a = new lme0((byte) 10);
    }

    public static yeg0 valueOf(String str) {
        return (yeg0) Enum.valueOf(yeg0.class, str);
    }

    public static yeg0[] values() {
        return (yeg0[]) c.clone();
    }

    public final float a() {
        switch (ordinal()) {
            case 0:
                return 155.0f;
            case 1:
                return 20.0f;
            case 2:
                return 300.0f;
            case 3:
                return 70.0f;
            case 4:
                return 185.0f;
            case 5:
                return 130.0f;
            case 6:
                return 240.0f;
            case 7:
                return 270.0f;
            case 8:
                return 355.0f;
            case 9:
                return 325.0f;
            case 10:
                return 45.0f;
            case 11:
                return 210.0f;
            case 12:
                return 100.0f;
            default:
                t9f.b();
                return 0.0f;
        }
    }
}
