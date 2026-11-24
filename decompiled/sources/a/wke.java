package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class wke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wke f39304a;
    public static final wke b;
    public static final wke c;
    public static final /* synthetic */ wke[] d;

    static {
        wke wkeVar = new wke("Closed", 0);
        f39304a = wkeVar;
        wke wkeVar2 = new wke("Transition", 1);
        b = wkeVar2;
        wke wkeVar3 = new wke("Opened", 2);
        c = wkeVar3;
        d = new wke[]{wkeVar, wkeVar2, wkeVar3};
    }

    public static wke valueOf(String str) {
        return (wke) Enum.valueOf(wke.class, str);
    }

    public static wke[] values() {
        return (wke[]) d.clone();
    }
}
