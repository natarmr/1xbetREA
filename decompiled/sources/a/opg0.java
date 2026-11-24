package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class opg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final opg0 f25641a;
    public static final opg0 b;
    public static final opg0 c;
    public static final opg0 d;
    public static final /* synthetic */ opg0[] e;

    static {
        opg0 opg0Var = new opg0("FIRST_PLAYER_WINNER", 0);
        f25641a = opg0Var;
        opg0 opg0Var2 = new opg0("SECOND_PLAYER_WINNER", 1);
        b = opg0Var2;
        opg0 opg0Var3 = new opg0("DRAW", 2);
        c = opg0Var3;
        opg0 opg0Var4 = new opg0("UNDEFINED", 3);
        d = opg0Var4;
        e = new opg0[]{opg0Var, opg0Var2, opg0Var3, opg0Var4};
    }

    public static opg0 valueOf(String str) {
        return (opg0) Enum.valueOf(opg0.class, str);
    }

    public static opg0[] values() {
        return (opg0[]) e.clone();
    }
}
