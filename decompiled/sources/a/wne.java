package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class wne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wne f39444a;
    public static final wne b;
    public static final wne c;
    public static final /* synthetic */ wne[] d;

    static {
        wne wneVar = new wne("COROUTINE_SUSPENDED", 0);
        f39444a = wneVar;
        wne wneVar2 = new wne("UNDECIDED", 1);
        b = wneVar2;
        wne wneVar3 = new wne("RESUMED", 2);
        c = wneVar3;
        d = new wne[]{wneVar, wneVar2, wneVar3};
    }

    public static wne valueOf(String str) {
        return (wne) Enum.valueOf(wne.class, str);
    }

    public static wne[] values() {
        return (wne[]) d.clone();
    }
}
