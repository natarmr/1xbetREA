package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ht30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ht30[] f13613a;
    public static final /* synthetic */ c0o b;

    /* JADX INFO: Fake field, exist only in values array */
    ht30 EF5;

    static {
        ht30[] ht30VarArr = {new ht30("FOOTBALL", 0), new ht30("HOCKEY", 1), new ht30("BASKETBALL", 2), new ht30("TENNIS", 3), new ht30("BOXING", 4), new ht30("RUGBY", 5), new ht30("AMERICAN_FOOTBALL", 6), new ht30("VOLLEYBALL", 7), new ht30("GAME_MIX", 8)};
        f13613a = ht30VarArr;
        b = new c0o(ht30VarArr);
    }

    public static ht30 valueOf(String str) {
        return (ht30) Enum.valueOf(ht30.class, str);
    }

    public static ht30[] values() {
        return (ht30[]) f13613a.clone();
    }

    public final int getId() {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 9;
            case 5:
                return 7;
            case 6:
                return 13;
            case 7:
                return 6;
            case 8:
                return 666;
            default:
                t9f.b();
                return 0;
        }
    }
}
