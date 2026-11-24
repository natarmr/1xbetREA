package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f9a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f9a0 f9146a;
    public static final f9a0 b;
    public static final f9a0 c;
    public static final /* synthetic */ f9a0[] d;

    static {
        f9a0 f9a0Var = new f9a0("FIRST_PLAYER_MOVE", 0);
        f9146a = f9a0Var;
        f9a0 f9a0Var2 = new f9a0("SECOND_PLAYER_MOVE", 1);
        b = f9a0Var2;
        f9a0 f9a0Var3 = new f9a0("PAUSE", 2);
        c = f9a0Var3;
        d = new f9a0[]{f9a0Var, f9a0Var2, f9a0Var3};
    }

    public static f9a0 valueOf(String str) {
        return (f9a0) Enum.valueOf(f9a0.class, str);
    }

    public static f9a0[] values() {
        return (f9a0[]) d.clone();
    }
}
