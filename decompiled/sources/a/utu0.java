package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class utu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final utu0 f36274a;
    public static final utu0 b;
    public static final utu0 c;
    public static final /* synthetic */ utu0[] d;

    static {
        utu0 utu0Var = new utu0("Main", 0);
        f36274a = utu0Var;
        utu0 utu0Var2 = new utu0("Markets", 1);
        b = utu0Var2;
        utu0 utu0Var3 = new utu0("Remark", 2);
        c = utu0Var3;
        d = new utu0[]{utu0Var, utu0Var2, utu0Var3};
    }

    public static utu0 valueOf(String str) {
        return (utu0) Enum.valueOf(utu0.class, str);
    }

    public static utu0[] values() {
        return (utu0[]) d.clone();
    }
}
