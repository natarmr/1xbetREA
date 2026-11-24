package a;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/om70;", "La/sf70;", "<init>", "()V", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class om70 extends sf70 {
    public static final /* synthetic */ int Q1 = 0;
    public final i9o0 N1 = i9o0.f14396a;
    public s6i O1;
    public final kiu0 P1;

    public om70() {
        pl70 pl70Var = new pl70(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new gg70(new gg70(this, (byte) 20), (byte) 21));
        this.P1 = agc.G(this, sre0.f32672a.b(qm70.class), new ph70(a8zVarA, (byte) 16), new ph70(a8zVarA, (byte) 17), pl70Var);
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVar;
        Fragment fragment;
        Fragment fragment2 = this.y;
        Fragment fragment3 = (fragment2 == null || (fragment = fragment2.y) == null) ? null : fragment.y;
        bn70 bn70Var = fragment3 instanceof bn70 ? (bn70) fragment3 : null;
        if (bn70Var == null || (h5tVar = bn70Var.L1) == null) {
            return;
        }
        h5tVar.g(this);
    }

    @Override // a.sf70
    public final uf70 H0() {
        return (qm70) this.P1.getValue();
    }

    @Override // a.sf70, a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.N1;
    }
}
