package a;

import android.javax.sip.message.Request;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xw90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xw90 f41599a;
    public static final xw90 b;
    public static final xw90 c;
    public static final xw90 d;
    public static final xw90 e;
    public static final /* synthetic */ xw90[] f;

    static {
        xw90 xw90Var = new xw90("REGISTRATION", 0);
        f41599a = xw90Var;
        xw90 xw90Var2 = new xw90("AUTH", 1);
        b = xw90Var2;
        xw90 xw90Var3 = new xw90("PLAY", 2);
        c = xw90Var3;
        xw90 xw90Var4 = new xw90("DEPOSIT", 3);
        d = xw90Var4;
        xw90 xw90Var5 = new xw90(Request.CANCEL, 4);
        e = xw90Var5;
        f = new xw90[]{xw90Var, xw90Var2, xw90Var3, xw90Var4, xw90Var5};
    }

    public static xw90 valueOf(String str) {
        return (xw90) Enum.valueOf(xw90.class, str);
    }

    public static xw90[] values() {
        return (xw90[]) f.clone();
    }
}
