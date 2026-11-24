package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class yir {

    /* JADX INFO: Fake field, exist only in values array */
    yir EF5;
    public static final /* synthetic */ yir[] b = {new yir("Index", 0), new yir("Lobby", 1), new yir("Game", 2), new yir("Promotion", 3), new yir("Authorization", 4), new yir("Registration", 5), new yir("Recharge", 6), new yir("Back", 7), new yir("Bonuses", 8)};
    public static final xir Companion = new xir();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f42708a = maz.a(wez.f39042a, new s9r(16));

    public static yir valueOf(String str) {
        return (yir) Enum.valueOf(yir.class, str);
    }

    public static yir[] values() {
        return (yir[]) b.clone();
    }
}
