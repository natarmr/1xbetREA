package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class aav {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aav f550a;
    public static final aav b;
    public static final aav c;
    public static final aav d;
    public static final /* synthetic */ aav[] e;

    static {
        aav aavVar = new aav("PRE_MATCH", 0);
        f550a = aavVar;
        aav aavVar2 = new aav("FIRST_PLAYER_WIN", 1);
        b = aavVar2;
        aav aavVar3 = new aav("SECOND_PLAYER_WIN", 2);
        c = aavVar3;
        aav aavVar4 = new aav("GAME", 3);
        d = aavVar4;
        e = new aav[]{aavVar, aavVar2, aavVar3, aavVar4};
    }

    public static aav valueOf(String str) {
        return (aav) Enum.valueOf(aav.class, str);
    }

    public static aav[] values() {
        return (aav[]) e.clone();
    }
}
