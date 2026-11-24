package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class azn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final azn f1725a;
    public static final azn b;
    public static final azn c;
    public static final /* synthetic */ azn[] d;

    static {
        azn aznVar = new azn("PreEnter", 0);
        f1725a = aznVar;
        azn aznVar2 = new azn("Visible", 1);
        b = aznVar2;
        azn aznVar3 = new azn("PostExit", 2);
        c = aznVar3;
        d = new azn[]{aznVar, aznVar2, aznVar3};
    }

    public static azn valueOf(String str) {
        return (azn) Enum.valueOf(azn.class, str);
    }

    public static azn[] values() {
        return (azn[]) d.clone();
    }
}
