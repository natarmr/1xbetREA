package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class fch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fch f9312a;
    public static final fch b;
    public static final /* synthetic */ fch[] c;

    static {
        fch fchVar = new fch("TopBar", 0);
        f9312a = fchVar;
        fch fchVar2 = new fch("MainContent", 1);
        b = fchVar2;
        c = new fch[]{fchVar, fchVar2};
    }

    public static fch valueOf(String str) {
        return (fch) Enum.valueOf(fch.class, str);
    }

    public static fch[] values() {
        return (fch[]) c.clone();
    }
}
