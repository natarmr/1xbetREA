package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vna {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vna f37710a;
    public static final vna b;
    public static final vna c;
    public static final /* synthetic */ vna[] d;

    static {
        vna vnaVar = new vna("Left", 0);
        f37710a = vnaVar;
        vna vnaVar2 = new vna("Right", 1);
        b = vnaVar2;
        vna vnaVar3 = new vna("Any", 2);
        c = vnaVar3;
        d = new vna[]{vnaVar, vnaVar2, vnaVar3};
    }

    public static vna valueOf(String str) {
        return (vna) Enum.valueOf(vna.class, str);
    }

    public static vna[] values() {
        return (vna[]) d.clone();
    }
}
