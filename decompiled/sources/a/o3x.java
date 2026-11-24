package a;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class o3x extends hzj {
    public final /* synthetic */ byte n = 1;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3x(pmn0 pmn0Var, Size size) {
        super(34, size);
        this.o = pmn0Var;
    }

    @Override // a.hzj
    public final ig00 f() {
        byte b = this.n;
        Object obj = this.o;
        switch (b) {
            case 0:
                return ro4.a0((Surface) obj);
            default:
                return ((pmn0) obj).f;
        }
    }

    public o3x(Surface surface, Size size, int i) {
        super(i, size);
        this.o = surface;
    }
}
