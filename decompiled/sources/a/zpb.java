package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class zpb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zpb f44752a;
    public static final zpb b;
    public static final zpb c;
    public static final zpb d;
    public static final zpb e;
    public static final zpb f;
    public static final zpb g;
    public static final /* synthetic */ zpb[] h;

    static {
        zpb zpbVar = new zpb("EMPTY", 0);
        f44752a = zpbVar;
        zpb zpbVar2 = new zpb("LOGIN_SAVED", 1);
        b = zpbVar2;
        zpb zpbVar3 = new zpb("LOGIN_CHANGED", 2);
        c = zpbVar3;
        zpb zpbVar4 = new zpb("INCORRECT_LOGIN", 3);
        d = zpbVar4;
        zpb zpbVar5 = new zpb("LOGIN_HAS_MORE_THEN_NEED_SYMBOLS", 4);
        e = zpbVar5;
        zpb zpbVar6 = new zpb("LOGIN_HAS_LESS_THEN_NEED_SYMBOLS", 5);
        zpb zpbVar7 = new zpb("LOGIN_HAS_SPECIAL_SYMBOLS", 6);
        f = zpbVar7;
        zpb zpbVar8 = new zpb("LOGIN_STARTS_WITH_NUM", 7);
        g = zpbVar8;
        h = new zpb[]{zpbVar, zpbVar2, zpbVar3, zpbVar4, zpbVar5, zpbVar6, zpbVar7, zpbVar8};
    }

    public static zpb valueOf(String str) {
        return (zpb) Enum.valueOf(zpb.class, str);
    }

    public static zpb[] values() {
        return (zpb[]) h.clone();
    }
}
