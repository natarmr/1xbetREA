package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class wuy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wuy f39812a;
    public static final wuy b;
    public static final wuy c;
    public static final wuy d;
    public static final /* synthetic */ wuy[] e;

    static {
        wuy wuyVar = new wuy("READY_FOR_INTERVAL", 0);
        f39812a = wuyVar;
        wuy wuyVar2 = new wuy("IN_INTERVAL", 1);
        b = wuyVar2;
        wuy wuyVar3 = new wuy("READY_FOR_BLOCK", 2);
        c = wuyVar3;
        wuy wuyVar4 = new wuy("IN_BLOCK", 3);
        d = wuyVar4;
        e = new wuy[]{wuyVar, wuyVar2, wuyVar3, wuyVar4};
    }

    public static wuy valueOf(String str) {
        return (wuy) Enum.valueOf(wuy.class, str);
    }

    public static wuy[] values() {
        return (wuy[]) e.clone();
    }
}
