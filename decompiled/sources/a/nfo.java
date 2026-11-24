package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class nfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nfo f23446a;
    public static final nfo b;
    public static final /* synthetic */ nfo[] c;

    static {
        nfo nfoVar = new nfo("STARTING_WITH_PLAYER_NAME", 0);
        f23446a = nfoVar;
        nfo nfoVar2 = new nfo("ENDING_WITH_PLAYER_NAME", 1);
        b = nfoVar2;
        c = new nfo[]{nfoVar, nfoVar2};
    }

    public static nfo valueOf(String str) {
        return (nfo) Enum.valueOf(nfo.class, str);
    }

    public static nfo[] values() {
        return (nfo[]) c.clone();
    }
}
