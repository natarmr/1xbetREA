package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class vd40 extends e28 {
    public static final vd40 g;
    public static final vd40 h;
    public final boolean f;

    static {
        vd40 vd40Var = new vd40(new int[]{2, 4, 0}, false);
        g = vd40Var;
        int i = vd40Var.c;
        int i2 = vd40Var.b;
        h = (i2 == 1 && i == 9) ? new vd40(new int[]{2, 0, 0}, false) : new vd40(new int[]{i2, i + 1, 0}, false);
        new vd40(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd40(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f = z;
    }
}
