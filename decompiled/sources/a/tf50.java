package a;

import android.javax.sip.message.Request;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class tf50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tf50 f33851a;
    public static final tf50 b;
    public static final tf50 c;
    public static final /* synthetic */ tf50[] d;

    static {
        tf50 tf50Var = new tf50("GAME_BOARD", 0);
        f33851a = tf50Var;
        tf50 tf50Var2 = new tf50("BROADCAST", 1);
        b = tf50Var2;
        tf50 tf50Var3 = new tf50(Request.INFO, 2);
        c = tf50Var3;
        d = new tf50[]{tf50Var, tf50Var2, tf50Var3};
    }

    public static tf50 valueOf(String str) {
        return (tf50) Enum.valueOf(tf50.class, str);
    }

    public static tf50[] values() {
        return (tf50[]) d.clone();
    }
}
