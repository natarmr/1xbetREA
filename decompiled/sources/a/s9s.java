package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class s9s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s9s f31862a;
    public static final s9s b;
    public static final s9s c;
    public static final s9s d;
    public static final s9s e;
    public static final /* synthetic */ s9s[] f;

    static {
        s9s s9sVar = new s9s("HOSTS_VS_GUESTS", 0);
        f31862a = s9sVar;
        s9s s9sVar2 = new s9s("TWO_PLAYERS_VS_TWO_PLAYERS", 1);
        b = s9sVar2;
        s9s s9sVar3 = new s9s("MULTITUDE_VS_MULTITUDE", 2);
        c = s9sVar3;
        s9s s9sVar4 = new s9s("SINGLE_TEAM", 3);
        d = s9sVar4;
        s9s s9sVar5 = new s9s("ONE_PLAYER_VS_ONE_PLAYER", 4);
        e = s9sVar5;
        f = new s9s[]{s9sVar, s9sVar2, s9sVar3, s9sVar4, s9sVar5};
    }

    public static s9s valueOf(String str) {
        return (s9s) Enum.valueOf(s9s.class, str);
    }

    public static s9s[] values() {
        return (s9s[]) f.clone();
    }
}
