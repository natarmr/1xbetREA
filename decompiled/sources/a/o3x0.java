package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o3x0 extends giw0 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3x0(String str, byte b) {
        super(str);
        this.c = b;
    }

    @Override // a.giw0
    public final jlw0 a(h0q0 h0q0Var, List list) {
        byte b = this.c;
        wlw0 wlw0Var = jlw0.V0;
        switch (b) {
            case 0:
                return wlw0Var;
            case 1:
            case 2:
                return this;
            case 3:
                return new ihw0(Double.valueOf(0.0d));
            default:
                return wlw0Var;
        }
    }
}
