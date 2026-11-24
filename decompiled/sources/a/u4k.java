package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class u4k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u4k f35053a;
    public static final u4k b;
    public static final u4k c;
    public static final u4k d;
    public static final /* synthetic */ u4k[] e;

    static {
        u4k u4kVar = new u4k("CAN_DELETE", 0);
        f35053a = u4kVar;
        u4k u4kVar2 = new u4k("MULTI_BET_ERROR", 1);
        b = u4kVar2;
        u4k u4kVar3 = new u4k("CONDITION_BET_EVENTS_COUNT_ERROR", 2);
        c = u4kVar3;
        u4k u4kVar4 = new u4k("CONDITION_BET_BLOCKS_COUNT_ERROR", 3);
        d = u4kVar4;
        e = new u4k[]{u4kVar, u4kVar2, u4kVar3, u4kVar4};
    }

    public static u4k valueOf(String str) {
        return (u4k) Enum.valueOf(u4k.class, str);
    }

    public static u4k[] values() {
        return (u4k[]) e.clone();
    }
}
