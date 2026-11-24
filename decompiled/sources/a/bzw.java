package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bzw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bzw f3493a;
    public static final bzw b;
    public static final /* synthetic */ bzw[] c;

    /* JADX INFO: Fake field, exist only in values array */
    bzw EF1;

    static {
        bzw bzwVar = new bzw("CLEAR", 0);
        bzw bzwVar2 = new bzw("SRC", 1);
        bzw bzwVar3 = new bzw("DST", 2);
        bzw bzwVar4 = new bzw("SRC_OVER", 3);
        bzw bzwVar5 = new bzw("DST_OVER", 4);
        bzw bzwVar6 = new bzw("SRC_IN", 5);
        f3493a = bzwVar6;
        bzw bzwVar7 = new bzw("DST_IN", 6);
        bzw bzwVar8 = new bzw("SRC_OUT", 7);
        bzw bzwVar9 = new bzw("DST_OUT", 8);
        bzw bzwVar10 = new bzw("SRC_ATOP", 9);
        bzw bzwVar11 = new bzw("DST_ATOP", 10);
        bzw bzwVar12 = new bzw("XOR", 11);
        bzw bzwVar13 = new bzw("PLUS", 12);
        bzw bzwVar14 = new bzw("MODULATE", 13);
        bzw bzwVar15 = new bzw("SCREEN", 14);
        bzw bzwVar16 = new bzw("OVERLAY", 15);
        bzw bzwVar17 = new bzw("DARKEN", 16);
        bzw bzwVar18 = new bzw("LIGHTEN", 17);
        bzw bzwVar19 = new bzw("COLOR_DODGE", 18);
        bzw bzwVar20 = new bzw("COLOR_BURN", 19);
        bzw bzwVar21 = new bzw("HARD_LIGHT", 20);
        bzw bzwVar22 = new bzw("SOFT_LIGHT", 21);
        bzw bzwVar23 = new bzw("DIFFERENCE", 22);
        bzw bzwVar24 = new bzw("EXCLUSION", 23);
        bzw bzwVar25 = new bzw("MULTIPLY", 24);
        bzw bzwVar26 = new bzw("HUE", 25);
        bzw bzwVar27 = new bzw("SATURATION", 26);
        bzw bzwVar28 = new bzw("COLOR", 27);
        bzw bzwVar29 = new bzw("LUMINOSITY", 28);
        b = bzwVar29;
        c = new bzw[]{bzwVar, bzwVar2, bzwVar3, bzwVar4, bzwVar5, bzwVar6, bzwVar7, bzwVar8, bzwVar9, bzwVar10, bzwVar11, bzwVar12, bzwVar13, bzwVar14, bzwVar15, bzwVar16, bzwVar17, bzwVar18, bzwVar19, bzwVar20, bzwVar21, bzwVar22, bzwVar23, bzwVar24, bzwVar25, bzwVar26, bzwVar27, bzwVar28, bzwVar29};
    }

    public static bzw valueOf(String str) {
        return (bzw) Enum.valueOf(bzw.class, str);
    }

    public static bzw[] values() {
        return (bzw[]) c.clone();
    }
}
