package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yvn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yvn f43329a;
    public static final yvn b;
    public static final yvn c;
    public static final yvn d;
    public static final yvn e;
    public static final yvn f;
    public static final yvn g;
    public static final /* synthetic */ yvn[] h;

    static {
        yvn yvnVar = new yvn("ERROR_CORRECTION", 0);
        f43329a = yvnVar;
        yvn yvnVar2 = new yvn("CHARACTER_SET", 1);
        b = yvnVar2;
        yvn yvnVar3 = new yvn("DATA_MATRIX_SHAPE", 2);
        yvn yvnVar4 = new yvn("DATA_MATRIX_COMPACT", 3);
        yvn yvnVar5 = new yvn("MIN_SIZE", 4);
        yvn yvnVar6 = new yvn("MAX_SIZE", 5);
        yvn yvnVar7 = new yvn("MARGIN", 6);
        c = yvnVar7;
        yvn yvnVar8 = new yvn("PDF417_COMPACT", 7);
        yvn yvnVar9 = new yvn("PDF417_COMPACTION", 8);
        yvn yvnVar10 = new yvn("PDF417_DIMENSIONS", 9);
        yvn yvnVar11 = new yvn("PDF417_AUTO_ECI", 10);
        yvn yvnVar12 = new yvn("AZTEC_LAYERS", 11);
        yvn yvnVar13 = new yvn("QR_VERSION", 12);
        d = yvnVar13;
        yvn yvnVar14 = new yvn("QR_MASK_PATTERN", 13);
        e = yvnVar14;
        yvn yvnVar15 = new yvn("QR_COMPACT", 14);
        f = yvnVar15;
        yvn yvnVar16 = new yvn("GS1_FORMAT", 15);
        g = yvnVar16;
        h = new yvn[]{yvnVar, yvnVar2, yvnVar3, yvnVar4, yvnVar5, yvnVar6, yvnVar7, yvnVar8, yvnVar9, yvnVar10, yvnVar11, yvnVar12, yvnVar13, yvnVar14, yvnVar15, yvnVar16, new yvn("FORCE_CODE_SET", 16), new yvn("FORCE_C40", 17), new yvn("CODE128_COMPACT", 18)};
    }

    public static yvn valueOf(String str) {
        return (yvn) Enum.valueOf(yvn.class, str);
    }

    public static yvn[] values() {
        return (yvn[]) h.clone();
    }
}
