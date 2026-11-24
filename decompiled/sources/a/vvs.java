package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class vvs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vvs f38117a;
    public static final vvs b;
    public static final /* synthetic */ vvs[] c;

    static {
        vvs vvsVar = new vvs("Main", 0);
        f38117a = vvsVar;
        vvs vvsVar2 = new vvs("Team", 1);
        b = vvsVar2;
        c = new vvs[]{vvsVar, vvsVar2};
    }

    public static vvs valueOf(String str) {
        return (vvs) Enum.valueOf(vvs.class, str);
    }

    public static vvs[] values() {
        return (vvs[]) c.clone();
    }
}
