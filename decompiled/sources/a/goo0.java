package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class goo0 {

    /* JADX INFO: Fake field, exist only in values array */
    goo0 EF5;
    public static final /* synthetic */ goo0[] b = {new goo0("PRIMARY", 0), new goo0("SECONDARY", 1), new goo0("LIGHT", 2), new goo0("RED", 3), new goo0("GREEN", 4), new goo0("VIOLET", 5), new goo0("PURPLE", 6), new goo0("BLUE", 7), new goo0("TEAL", 8), new goo0("YELLOW", 9), new goo0("ORANGE", 10), new goo0("DARK_ORANGE", 11), new goo0("PINK", 12), new goo0("DARK_PINK", 13), new goo0("GRAY", 14), new goo0("DARK_GRAY", 15), new goo0("WHITE", 16)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s2m0 f11641a = new s2m0();

    public static goo0 valueOf(String str) {
        return (goo0) Enum.valueOf(goo0.class, str);
    }

    public static goo0[] values() {
        return (goo0[]) b.clone();
    }
}
