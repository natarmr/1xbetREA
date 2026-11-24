package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class fck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fck f9316a;
    public static final fck b;
    public static final fck c;
    public static final fck d;
    public static final /* synthetic */ fck[] e;

    static {
        fck fckVar = new fck("WIN", 0);
        f9316a = fckVar;
        fck fckVar2 = new fck("GOALS", 1);
        b = fckVar2;
        fck fckVar3 = new fck("RED_CARD", 2);
        c = fckVar3;
        fck fckVar4 = new fck("YELLOW_CARD", 3);
        d = fckVar4;
        e = new fck[]{fckVar, fckVar2, fckVar3, fckVar4};
    }

    public static fck valueOf(String str) {
        return (fck) Enum.valueOf(fck.class, str);
    }

    public static fck[] values() {
        return (fck[]) e.clone();
    }
}
