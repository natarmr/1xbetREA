package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nkk f23684a;
    public static final nkk b;
    public static final nkk c;
    public static final nkk d;
    public static final /* synthetic */ nkk[] e;

    static {
        nkk nkkVar = new nkk("FIRST_PLAYER_WIN", 0);
        f23684a = nkkVar;
        nkk nkkVar2 = new nkk("SECOND_PLAYER_WIN", 1);
        b = nkkVar2;
        nkk nkkVar3 = new nkk("DRAW", 2);
        c = nkkVar3;
        nkk nkkVar4 = new nkk("GAME", 3);
        d = nkkVar4;
        e = new nkk[]{nkkVar, nkkVar2, nkkVar3, nkkVar4};
    }

    public static nkk valueOf(String str) {
        return (nkk) Enum.valueOf(nkk.class, str);
    }

    public static nkk[] values() {
        return (nkk[]) e.clone();
    }
}
