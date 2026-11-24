package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pg f26929a;
    public static final pg b;
    public static final pg c;
    public static final pg d;
    public static final /* synthetic */ pg[] e;

    static {
        pg pgVar = new pg("ACTIVE", 0);
        f26929a = pgVar;
        pg pgVar2 = new pg("NOT_ACTIVE", 1);
        b = pgVar2;
        pg pgVar3 = new pg("BONUS", 2);
        c = pgVar3;
        pg pgVar4 = new pg("NOT_SET", 3);
        d = pgVar4;
        e = new pg[]{pgVar, pgVar2, pgVar3, pgVar4};
    }

    public static pg valueOf(String str) {
        return (pg) Enum.valueOf(pg.class, str);
    }

    public static pg[] values() {
        return (pg[]) e.clone();
    }
}
