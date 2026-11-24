package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ac0 f604a;
    public static final ac0 b;
    public static final /* synthetic */ ac0[] c;
    public static final /* synthetic */ c0o d;

    static {
        ac0 ac0Var = new ac0("COMPACT", 0);
        f604a = ac0Var;
        ac0 ac0Var2 = new ac0("LINE", 1);
        b = ac0Var2;
        ac0[] ac0VarArr = {ac0Var, ac0Var2};
        c = ac0VarArr;
        d = new c0o(ac0VarArr);
    }

    public static ac0 valueOf(String str) {
        return (ac0) Enum.valueOf(ac0.class, str);
    }

    public static ac0[] values() {
        return (ac0[]) c.clone();
    }
}
