package a;

import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xfh0;", "La/yx5;", "<init>", "()V", "a/cge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xfh0 extends yx5 {
    public oll0 K1;
    public ujd L1;
    public rsi M1;
    public wdk0 N1;
    public final boolean O1;
    public final s0r P1;
    public final a8z Q1;
    public final n0o0 R1;
    public final zz2 S1;
    public final zz2 U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(xfh0.class, "viewBinding", "getViewBinding()Lorg/xplatform/special_event/impl/databinding/ComposeScreenViewBinding;", 0), new ez40(xfh0.class, "eventId", "getEventId()I", 0), new ez40(xfh0.class, "searchEntryPointOrdinal", "getSearchEntryPointOrdinal()I", 0)};
    public static final cge0 V1 = new cge0((byte) 14);
    public static final String X1 = xfh0.class.getSimpleName();

    public xfh0() {
        super(R.layout.compose_screen_view);
        this.O1 = true;
        this.P1 = ltt0.o(this, wfh0.f39071a);
        this.Q1 = xbc.a0(this, sre0.f32672a.b(sih0.class), null, new ufh0(this, (byte) 0), 14);
        this.R1 = maz.b(new ufh0(this, (byte) 1));
        this.S1 = new zz2("SEARCH_FRAGMENT_EVENT_ID_BUNDLE_KEY");
        this.U1 = new zz2("SEARCH_FRAGMENT_ENTRY_POINT_BUNDLE_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ujd ujdVar = this.L1;
        if (ujdVar == null) {
            Intrinsics.h("altDesignGameCardFragmentDelegate");
            throw null;
        }
        iiy[] iiyVarArr = W1;
        ujdVar.c(this, new yr2(this.S1.n(this, iiyVarArr[1]).intValue()), new vfh0(this, (byte) 0));
        G0().x(oeh0.f25122a);
        Object objN = this.P1.n(iiyVarArr[0], this);
        objN.getClass();
        pkd.k(((ekd) objN).b, ((ssi) this.R1.getValue()).t.f8531a, new ugd(-2012953209, true, new iob0((Object) this, (byte) 8)));
    }

    @Override // a.yx5
    public final void C0() {
        ssi ssiVar = (ssi) this.R1.getValue();
        this.K1 = ((g45) ssiVar.f32727a.f45137a).K();
        ujd ujdVarD = ssiVar.b.d();
        x1x.x(ujdVarD);
        this.L1 = ujdVarD;
        this.M1 = (rsi) ssiVar.w.get();
        this.N1 = ssiVar.s;
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        if (this.L1 == null) {
            Intrinsics.h("altDesignGameCardFragmentDelegate");
            throw null;
        }
        ujd.a(this);
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        wdk0 wdk0Var = this.N1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.O1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
