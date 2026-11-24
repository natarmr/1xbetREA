package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kkz {
    private static final /* synthetic */ a0o $ENTRIES;
    private static final /* synthetic */ kkz[] $VALUES;
    public static final ikz Companion;
    public static final kkz ON_ANY;
    public static final kkz ON_CREATE;
    public static final kkz ON_DESTROY;
    public static final kkz ON_PAUSE;
    public static final kkz ON_RESUME;
    public static final kkz ON_START;
    public static final kkz ON_STOP;

    static {
        kkz kkzVar = new kkz("ON_CREATE", 0);
        ON_CREATE = kkzVar;
        kkz kkzVar2 = new kkz("ON_START", 1);
        ON_START = kkzVar2;
        kkz kkzVar3 = new kkz("ON_RESUME", 2);
        ON_RESUME = kkzVar3;
        kkz kkzVar4 = new kkz("ON_PAUSE", 3);
        ON_PAUSE = kkzVar4;
        kkz kkzVar5 = new kkz("ON_STOP", 4);
        ON_STOP = kkzVar5;
        kkz kkzVar6 = new kkz("ON_DESTROY", 5);
        ON_DESTROY = kkzVar6;
        kkz kkzVar7 = new kkz("ON_ANY", 6);
        ON_ANY = kkzVar7;
        kkz[] kkzVarArr = {kkzVar, kkzVar2, kkzVar3, kkzVar4, kkzVar5, kkzVar6, kkzVar7};
        $VALUES = kkzVarArr;
        $ENTRIES = new c0o(kkzVarArr);
        Companion = new ikz();
    }

    public static kkz valueOf(String str) {
        return (kkz) Enum.valueOf(kkz.class, str);
    }

    public static kkz[] values() {
        return (kkz[]) $VALUES.clone();
    }

    public final lkz a() {
        switch (jkz.f16692a[ordinal()]) {
            case 1:
            case 2:
                return lkz.c;
            case 3:
            case 4:
                return lkz.d;
            case 5:
                return lkz.e;
            case 6:
                return lkz.f20223a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                t9f.b();
                return null;
        }
    }
}
