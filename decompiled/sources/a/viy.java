package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class viy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final viy f37504a;
    public static final viy b;
    public static final viy c;
    public static final viy d;
    public static final /* synthetic */ viy[] e;

    static {
        viy viyVar = new viy("PUBLIC", 0);
        f37504a = viyVar;
        viy viyVar2 = new viy("PROTECTED", 1);
        b = viyVar2;
        viy viyVar3 = new viy("INTERNAL", 2);
        c = viyVar3;
        viy viyVar4 = new viy("PRIVATE", 3);
        d = viyVar4;
        e = new viy[]{viyVar, viyVar2, viyVar3, viyVar4};
    }

    public static viy valueOf(String str) {
        return (viy) Enum.valueOf(viy.class, str);
    }

    public static viy[] values() {
        return (viy[]) e.clone();
    }
}
