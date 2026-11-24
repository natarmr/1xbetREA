package a;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public abstract class z03 {
    public static final w03 a() {
        return new w03(new Path());
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final Path.Direction c(x190 x190Var) {
        int iOrdinal = x190Var.ordinal();
        if (iOrdinal == 0) {
            return Path.Direction.CCW;
        }
        if (iOrdinal == 1) {
            return Path.Direction.CW;
        }
        t9f.b();
        return null;
    }
}
