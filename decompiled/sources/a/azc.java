package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class azc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final azc f1709a;
    public static final azc b;
    public static final azc c;
    public static final azc d;
    public static final /* synthetic */ azc[] e;

    static {
        azc azcVar = new azc("NONE", 0);
        f1709a = azcVar;
        azc azcVar2 = new azc("CHANGE_UP", 1);
        b = azcVar2;
        azc azcVar3 = new azc("CHANGE_DOWN", 2);
        c = azcVar3;
        azc azcVar4 = new azc("BLOCKED", 3);
        d = azcVar4;
        e = new azc[]{azcVar, azcVar2, azcVar3, azcVar4};
    }

    public static azc valueOf(String str) {
        return (azc) Enum.valueOf(azc.class, str);
    }

    public static azc[] values() {
        return (azc[]) e.clone();
    }
}
