package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i5r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i5r f14206a;
    public static final i5r b;
    public static final i5r c;
    public static final i5r d;
    public static final i5r e;
    public static final i5r f;
    public static final i5r g;
    public static final /* synthetic */ i5r[] h;

    static {
        i5r i5rVar = new i5r("PENALTY_LOG", 0);
        f14206a = i5rVar;
        i5r i5rVar2 = new i5r("PENALTY_DEATH", 1);
        b = i5rVar2;
        i5r i5rVar3 = new i5r("DETECT_FRAGMENT_REUSE", 2);
        c = i5rVar3;
        i5r i5rVar4 = new i5r("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = i5rVar4;
        i5r i5rVar5 = new i5r("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = i5rVar5;
        i5r i5rVar6 = new i5r("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = i5rVar6;
        i5r i5rVar7 = new i5r("DETECT_SET_USER_VISIBLE_HINT", 6);
        i5r i5rVar8 = new i5r("DETECT_TARGET_FRAGMENT_USAGE", 7);
        i5r i5rVar9 = new i5r("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        g = i5rVar9;
        h = new i5r[]{i5rVar, i5rVar2, i5rVar3, i5rVar4, i5rVar5, i5rVar6, i5rVar7, i5rVar8, i5rVar9};
    }

    public static i5r valueOf(String str) {
        return (i5r) Enum.valueOf(i5r.class, str);
    }

    public static i5r[] values() {
        return (i5r[]) h.clone();
    }
}
