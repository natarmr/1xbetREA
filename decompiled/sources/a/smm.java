package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class smm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final smm f32453a;
    public static final smm b;
    public static final /* synthetic */ smm[] c;

    static {
        smm smmVar = new smm("Primary", 0);
        f32453a = smmVar;
        smm smmVar2 = new smm("PrimaryBackground", 1);
        smm smmVar3 = new smm("Overlay", 2);
        b = smmVar3;
        c = new smm[]{smmVar, smmVar2, smmVar3, new smm("OverlayBackground", 3)};
    }

    public static smm valueOf(String str) {
        return (smm) Enum.valueOf(smm.class, str);
    }

    public static smm[] values() {
        return (smm[]) c.clone();
    }
}
