package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vrs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vrs f37917a;
    public static final vrs b;
    public static final vrs c;
    public static final /* synthetic */ vrs[] d;

    static {
        vrs vrsVar = new vrs("DEFAULT", 0);
        f37917a = vrsVar;
        vrs vrsVar2 = new vrs("IN_PROCESS", 1);
        b = vrsVar2;
        vrs vrsVar3 = new vrs("FINISHED", 2);
        c = vrsVar3;
        d = new vrs[]{vrsVar, vrsVar2, vrsVar3};
    }

    public static vrs valueOf(String str) {
        return (vrs) Enum.valueOf(vrs.class, str);
    }

    public static vrs[] values() {
        return (vrs[]) d.clone();
    }

    public final boolean a() {
        return this == b;
    }
}
