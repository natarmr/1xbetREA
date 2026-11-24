package a;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class lzj0 extends kzj0 {
    public final iys0 b;
    public final List c;
    public final boolean d;
    public final cr30 e;
    public final Function1 f;

    public lzj0(iys0 iys0Var, List list, boolean z, cr30 cr30Var, Function1 function1) {
        iys0Var.getClass();
        list.getClass();
        cr30Var.getClass();
        this.b = iys0Var;
        this.c = list;
        this.d = z;
        this.e = cr30Var;
        this.f = function1;
        if (!(cr30Var instanceof t1o) || (cr30Var instanceof gdq0)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + cr30Var + '\n' + iys0Var);
    }

    @Override // a.wsy
    public final List J() {
        return this.c;
    }

    @Override // a.wsy
    public final ays0 K() {
        ays0.b.getClass();
        return ays0.c;
    }

    @Override // a.wsy
    public final iys0 S() {
        return this.b;
    }

    @Override // a.wsy
    public final boolean U() {
        return this.d;
    }

    @Override // a.wsy
    public final wsy f0(cty ctyVar) {
        kzj0 kzj0Var = (kzj0) this.f.invoke(ctyVar);
        return kzj0Var == null ? this : kzj0Var;
    }

    @Override // a.tft0
    /* JADX INFO: renamed from: l0 */
    public final tft0 f0(cty ctyVar) {
        kzj0 kzj0Var = (kzj0) this.f.invoke(ctyVar);
        return kzj0Var == null ? this : kzj0Var;
    }

    @Override // a.kzj0, a.tft0
    /* JADX INFO: renamed from: n0 */
    public final kzj0 k0(boolean z) {
        if (z == this.d) {
            return this;
        }
        return z ? new s660(this, (byte) 1) : new s660(this, (byte) 0);
    }

    @Override // a.tft0
    /* JADX INFO: renamed from: o0 */
    public final kzj0 m0(ays0 ays0Var) {
        ays0Var.getClass();
        return ays0Var.isEmpty() ? this : new nzj0(this, ays0Var);
    }

    @Override // a.wsy
    public final cr30 y() {
        return this.e;
    }
}
