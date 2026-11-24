package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vxl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vxl f38204a;
    public static final vxl b;
    public static final vxl c;
    public static final /* synthetic */ vxl[] d;

    static {
        vxl vxlVar = new vxl("PRIMARY", 0);
        f38204a = vxlVar;
        vxl vxlVar2 = new vxl("SECONDARY", 1);
        b = vxlVar2;
        vxl vxlVar3 = new vxl("TERTIARY", 2);
        vxl vxlVar4 = new vxl("OVERLAY", 3);
        c = vxlVar4;
        d = new vxl[]{vxlVar, vxlVar2, vxlVar3, vxlVar4};
    }

    public static vxl valueOf(String str) {
        return (vxl) Enum.valueOf(vxl.class, str);
    }

    public static vxl[] values() {
        return (vxl[]) d.clone();
    }
}
