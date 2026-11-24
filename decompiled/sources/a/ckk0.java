package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ckk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ckk0 f4511a;
    public static final ckk0 b;
    public static final ckk0 c;
    public static final ckk0 d;
    public static final ckk0 e;
    public static final ckk0 f;
    public static final ckk0 g;
    public static final /* synthetic */ ckk0[] h;

    static {
        ckk0 ckk0Var = new ckk0("RestorePassword", 0);
        f4511a = ckk0Var;
        ckk0 ckk0Var2 = new ckk0("RestorePasswordWithAuth", 1);
        b = ckk0Var2;
        ckk0 ckk0Var3 = new ckk0("Migration", 2);
        c = ckk0Var3;
        ckk0 ckk0Var4 = new ckk0("ResendPush", 3);
        d = ckk0Var4;
        ckk0 ckk0Var5 = new ckk0("ConfirmByAuthenticator", 4);
        e = ckk0Var5;
        ckk0 ckk0Var6 = new ckk0("NewPlaceAuthorization", 5);
        f = ckk0Var6;
        ckk0 ckk0Var7 = new ckk0("ChangePassword", 6);
        g = ckk0Var7;
        h = new ckk0[]{ckk0Var, ckk0Var2, ckk0Var3, ckk0Var4, ckk0Var5, ckk0Var6, ckk0Var7};
    }

    public static ckk0 valueOf(String str) {
        return (ckk0) Enum.valueOf(ckk0.class, str);
    }

    public static ckk0[] values() {
        return (ckk0[]) h.clone();
    }

    public final String a() {
        switch (ordinal()) {
            case 0:
                bkk0[] bkk0VarArr = bkk0.f2753a;
                return "http://company.com/Feeds/Authenticator/ApprovePasswordRepair.json?v=1";
            case 1:
                bkk0[] bkk0VarArr2 = bkk0.f2753a;
                return "http://company.com/Feeds/Authenticator/ApproveOperation.json?v=1";
            case 2:
                bkk0[] bkk0VarArr3 = bkk0.f2753a;
                return "http://company.com/Feeds/Authenticator/ApproveOperation.json?v=1";
            case 3:
                bkk0[] bkk0VarArr4 = bkk0.f2753a;
                return "http://company.com/Feeds/Authenticator/ResendPush.json?v=1";
            case 4:
                bkk0[] bkk0VarArr5 = bkk0.f2753a;
                return "http://company.com/Feeds/Authenticator/ApproveOperation.json?v=1";
            case 5:
                bkk0[] bkk0VarArr6 = bkk0.f2753a;
                return "http://company.com/Feeds/Authenticator/ApproveNewPlaceAuth.json?v=1";
            case 6:
                bkk0[] bkk0VarArr7 = bkk0.f2753a;
                return "http://company.com/Feeds/Authenticator/ApproveOperation.json?v=1";
            default:
                t9f.b();
                return null;
        }
    }
}
