package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/m4p;", "La/yx5;", "<init>", "()V", "a/bek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m4p extends yx5 {
    public final boolean K1;
    public final khf0 L1;
    public final s0r M1;
    public final n0o0 N1;
    public sgi O1;
    public wdk0 P1;
    public ujd Q1;
    public final a8z R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(m4p.class, "params", "getParams()Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;", 0), new j0d0(m4p.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final bek S1 = new bek();

    public m4p() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        this.L1 = new khf0("category_state_param_key");
        this.M1 = ltt0.o(this, j4p.f15895a);
        this.N1 = maz.b(new i4p(this, (byte) 0));
        this.R1 = xbc.a0(this, sre0.f32672a.b(org.xplatform.favorites.impl.presentation.category.a.class), null, new i4p(this, (byte) 1), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new i4p(this, (byte) 2));
        Object objN = this.M1.n(U1[1], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(1467607041, true, new f5o(this, (byte) 13)));
    }

    @Override // a.yx5
    public final void C0() {
        tgi tgiVar = (tgi) this.N1.getValue();
        this.O1 = (sgi) tgiVar.y.get();
        this.P1 = tgiVar.t;
        ujd ujdVarD = tgiVar.g.d();
        x1x.x(ujdVarD);
        this.Q1 = ujdVarD;
    }

    public final k3t0 G0() {
        return (k3t0) this.R1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        wdk0 wdk0Var = this.P1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.K1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        ms2 cq2Var;
        super.g0();
        ujd ujdVar = this.Q1;
        if (ujdVar == null) {
            Intrinsics.h("gameCardFragmentDelegate");
            throw null;
        }
        int iOrdinal = org.xplatform.favorites.impl.presentation.category.b.a((FavoriteCategoryUiState) this.L1.n(this, U1[0])).ordinal();
        if (iOrdinal == 0) {
            cq2Var = new cq2();
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            cq2Var = new aq2();
        }
        ujdVar.c(this, cq2Var, new yhn((Object) this, (byte) 27));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.K1;
    }
}
