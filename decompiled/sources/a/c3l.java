package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class c3l {
    public static final /* synthetic */ c3l[] e;
    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f3681a;
    public final float b;
    public final float c;
    public final j6l d;

    /* JADX INFO: Fake field, exist only in values array */
    c3l EF0;

    static {
        j6l j6lVar = j6l.b;
        c3l c3lVar = new c3l("DIRE_BOTTOM_RANGED", 0, 0, 81.1f, 25.6f, j6lVar);
        c3l c3lVar2 = new c3l("DIRE_BOTTOM_MELEE", 1, 1, 86.1f, 25.6f, j6lVar);
        c3l c3lVar3 = new c3l("DIRE_MIDDLE_RANGED", 2, 2, 71.7f, 20.0f, j6lVar);
        c3l c3lVar4 = new c3l("DIRE_MIDDLE_MELEE", 3, 3, 75.0f, 23.3f, j6lVar);
        c3l c3lVar5 = new c3l("DIRE_TOP_RANGED", 4, 4, 70.0f, 11.1f, j6lVar);
        c3l c3lVar6 = new c3l("DIRE_TOP_MELEE", 5, 5, 70.0f, 15.0f, j6lVar);
        j6l j6lVar2 = j6l.f15993a;
        c3l[] c3lVarArr = {c3lVar, c3lVar2, c3lVar3, c3lVar4, c3lVar5, c3lVar6, new c3l("RADIANT_BOTTOM_RANGED", 6, 6, 22.2f, 78.3f, j6lVar2), new c3l("RADIANT_BOTTOM_MELEE", 7, 7, 22.2f, 82.8f, j6lVar2), new c3l("RADIANT_MIDDLE_RANGED", 8, 8, 17.2f, 68.9f, j6lVar2), new c3l("RADIANT_MIDDLE_MELEE", 9, 9, 20.0f, 72.8f, j6lVar2), new c3l("RADIANT_TOP_RANGED", 10, 10, 6.7f, 67.8f, j6lVar2), new c3l("RADIANT_TOP_MELEE", 11, 11, 11.7f, 67.8f, j6lVar2)};
        e = c3lVarArr;
        f = new c0o(c3lVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c3l(String str, int i, int i2, float f2, float f3, j6l j6lVar) {
        super(str, i);
        this.f3681a = i2;
        this.b = f2;
        this.c = f3;
        this.d = j6lVar;
    }

    public static c3l valueOf(String str) {
        return (c3l) Enum.valueOf(c3l.class, str);
    }

    public static c3l[] values() {
        return (c3l[]) e.clone();
    }
}
