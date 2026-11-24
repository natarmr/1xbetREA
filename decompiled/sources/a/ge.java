package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ge f11126a;
    public static final ge b;
    public static final ge c;
    public static final ge d;
    public static final ge e;
    public static final ge f;
    public static final /* synthetic */ ge[] g;

    static {
        ge geVar = new ge("PRIMARY_STYLE", 0);
        f11126a = geVar;
        ge geVar2 = new ge("SECONDARY_STYLE", 1);
        b = geVar2;
        ge geVar3 = new ge("TERTIARY_STYLE", 2);
        c = geVar3;
        ge geVar4 = new ge("QUATERNARY_STYLE", 3);
        d = geVar4;
        ge geVar5 = new ge("QUINARY_STYLE", 4);
        e = geVar5;
        ge geVar6 = new ge("SENARY_STYLE", 5);
        f = geVar6;
        g = new ge[]{geVar, geVar2, geVar3, geVar4, geVar5, geVar6};
    }

    public static ge valueOf(String str) {
        return (ge) Enum.valueOf(ge.class, str);
    }

    public static ge[] values() {
        return (ge[]) g.clone();
    }
}
