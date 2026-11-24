package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class wvs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wvs f39854a;
    public static final wvs b;
    public static final wvs c;
    public static final /* synthetic */ wvs[] d;

    static {
        wvs wvsVar = new wvs("MULTI_TEAM", 0);
        f39854a = wvsVar;
        wvs wvsVar2 = new wvs("TWO_TEAM", 1);
        b = wvsVar2;
        wvs wvsVar3 = new wvs("SINGLE_EVENT", 2);
        c = wvsVar3;
        d = new wvs[]{wvsVar, wvsVar2, wvsVar3};
    }

    public static wvs valueOf(String str) {
        return (wvs) Enum.valueOf(wvs.class, str);
    }

    public static wvs[] values() {
        return (wvs[]) d.clone();
    }
}
