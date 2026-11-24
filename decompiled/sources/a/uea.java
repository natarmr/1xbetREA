package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class uea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uea f35515a;
    public static final uea b;
    public static final uea c;
    public static final uea d;
    public static final uea e;
    public static final uea f;
    public static final uea g;
    public static final /* synthetic */ uea[] h;

    static {
        uea ueaVar = new uea("PRE_MATCH", 0);
        f35515a = ueaVar;
        uea ueaVar2 = new uea("FIRST_OPPONENT_TURN", 1);
        b = ueaVar2;
        uea ueaVar3 = new uea("SECOND_OPPONENT_TURN", 2);
        c = ueaVar3;
        uea ueaVar4 = new uea("BREAK", 3);
        d = ueaVar4;
        uea ueaVar5 = new uea("FIRST_OPPONENT_WIN", 4);
        e = ueaVar5;
        uea ueaVar6 = new uea("SECOND_OPPONENT_WIN", 5);
        f = ueaVar6;
        uea ueaVar7 = new uea("DRAW", 6);
        g = ueaVar7;
        h = new uea[]{ueaVar, ueaVar2, ueaVar3, ueaVar4, ueaVar5, ueaVar6, ueaVar7};
    }

    public static uea valueOf(String str) {
        return (uea) Enum.valueOf(uea.class, str);
    }

    public static uea[] values() {
        return (uea[]) h.clone();
    }
}
