package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jpj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jpj0 f16905a;
    public static final jpj0 b;
    public static final jpj0 c;
    public static final /* synthetic */ jpj0[] d;

    static {
        jpj0 jpj0Var = new jpj0("START", 0);
        f16905a = jpj0Var;
        jpj0 jpj0Var2 = new jpj0("STOP", 1);
        b = jpj0Var2;
        jpj0 jpj0Var3 = new jpj0("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = jpj0Var3;
        d = new jpj0[]{jpj0Var, jpj0Var2, jpj0Var3};
    }

    public static jpj0 valueOf(String str) {
        return (jpj0) Enum.valueOf(jpj0.class, str);
    }

    public static jpj0[] values() {
        return (jpj0[]) d.clone();
    }
}
