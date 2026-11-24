package a;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public enum iwb0 {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g950 f15481a;
    public final g950 b;
    public final a8z c;
    public final a8z d;
    public static final Set e = tx3.l0(new iwb0[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    iwb0(String str) {
        this.f15481a = g950.e(str);
        this.b = g950.e(str.concat("Array"));
        wez wezVar = wez.f39042a;
        this.c = maz.a(wezVar, new hwb0(this, (byte) 0));
        this.d = maz.a(wezVar, new hwb0(this, (byte) 1));
    }
}
