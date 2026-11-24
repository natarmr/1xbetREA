package a;

import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/y82;", "La/yx5;", "<init>", "()V", "a/qek0", "", "isMulti", "isErrorHeader", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y82 extends yx5 {
    public final e9o0 K1;
    public vrk0 L1;
    public wdk0 M1;
    public final zz2 N1;
    public final phf0 O1;
    public final boolean P1;
    public final boolean Q1;
    public final s0r R1;
    public final a8z S1;
    public final a8z U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(y82.class, "specialEventId", "getSpecialEventId()I", 0), new ez40(y82.class, "specialEventTitle", "getSpecialEventTitle()Ljava/lang/String;", 0), new j0d0(y82.class, "viewBinding", "getViewBinding()Lorg/xplatform/special_event/impl/databinding/FragmentAltDesignLSpecialEventBinding;", 0)};
    public static final qek0 V1 = new qek0();
    public static final String X1 = y82.class.getSimpleName();

    public y82() {
        super(R.layout.fragment_alt_design_l_special_event);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.N1 = new zz2("SPECIAL_EVENT_ID_BUNDLE_KEY");
        this.O1 = new phf0("SPECIAL_EVENT_TITLE_BUNDLE_KEY");
        this.P1 = true;
        this.Q1 = true;
        this.R1 = ltt0.o(this, x82.f40442a);
        this.S1 = maz.a(wez.b, new m82(this, (byte) 0));
        this.U1 = xbc.a0(this, sre0.f32672a.b(n92.class), null, new m82(this, (byte) 3), 14);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final boolean getQ1() {
        return this.Q1;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.R1.n(W1[2], this);
        objN.getClass();
        pkd.h(((xxq) objN).b, qek0.h, null, new ugd(-1087217933, true, new j82(this, (byte) 0)));
        wdk0 wdk0Var = this.M1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.P1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.yx5
    public final void C0() {
        fui fuiVarG0 = G0();
        this.L1 = (vrk0) fuiVarG0.L.get();
        this.M1 = fuiVarG0.f10164a;
        LinkedHashMap linkedHashMap = h3l.f12390a;
        g3l g3lVar = G0().u;
        h3l.f12390a.put(h3l.a(H0(), efx.v(this).f4046a), g3lVar);
        LinkedHashMap linkedHashMap2 = tz00.f34782a;
        sz00 sz00Var = G0().s;
        tz00.f34782a.put(tz00.a(H0(), efx.v(this).f4046a), sz00Var);
        LinkedHashMap linkedHashMap3 = ih9.f14769a;
        hh9 hh9Var = G0().t;
        ih9.f14769a.put(ih9.a(H0(), efx.v(this).f4046a), hh9Var);
        LinkedHashMap linkedHashMap4 = xpk0.f41274a;
        wpk0 wpk0Var = G0().w;
        xpk0.f41274a.put(xpk0.a(H0(), efx.v(this).f4046a), wpk0Var);
    }

    public final fui G0() {
        return (fui) this.S1.getValue();
    }

    public final int H0() {
        return this.N1.n(this, W1[0]).intValue();
    }

    public final k3t0 I0() {
        return (k3t0) this.U1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        I0().x(a82.f403a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        if (!sj3.h0(this, X1)) {
            String str = efx.v(this).f4046a;
            LinkedHashMap linkedHashMap = xnk0.f41174a;
            xnk0.a(H0(), str);
            LinkedHashMap linkedHashMap2 = xbv0.f40619a;
            xbv0.a(H0(), str);
            LinkedHashMap linkedHashMap3 = h3l.f12390a;
            h3l.f12390a.remove(h3l.a(H0(), str));
            LinkedHashMap linkedHashMap4 = tz00.f34782a;
            tz00.f34782a.remove(tz00.a(H0(), str));
            LinkedHashMap linkedHashMap5 = ih9.f14769a;
            ih9.f14769a.remove(ih9.a(H0(), str));
            LinkedHashMap linkedHashMap6 = xpk0.f41274a;
            xpk0.f41274a.remove(xpk0.a(H0(), str));
            LinkedHashMap linkedHashMap7 = n8l0.f23096a;
            n8l0.a(H0(), str);
        }
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
