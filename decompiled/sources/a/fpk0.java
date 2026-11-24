package a;

import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"La/fpk0;", "La/yx5;", "<init>", "()V", "a/zie0", "La/wnk0;", "collapsingHeader", "La/z1d;", "collapsingHeaderBackground", "La/owk0;", "toolbarContent", "La/mwk0;", "tabsUiState", "La/kwk0;", "tabsContentUiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fpk0 extends yx5 {
    public final e9o0 K1;
    public vrk0 L1;
    public wdk0 M1;
    public final zz2 N1;
    public final phf0 O1;
    public final s0r P1;
    public final a8z Q1;
    public final a8z R1;
    public final boolean S1;
    public final boolean U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(fpk0.class, "specialEventId", "getSpecialEventId()I", 0), new ez40(fpk0.class, "specialEventTitle", "getSpecialEventTitle()Ljava/lang/String;", 0), new j0d0(fpk0.class, "viewBinding", "getViewBinding()Lorg/xplatform/special_event/impl/databinding/FragmentSpecialEventMainBinding;", 0)};
    public static final zie0 V1 = new zie0();
    public static final String X1 = fpk0.class.getSimpleName();

    public fpk0() {
        super(R.layout.fragment_special_event_main);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.N1 = new zz2("SPECIAL_EVENT_ID_BUNDLE_KEY");
        this.O1 = new phf0("SPECIAL_EVENT_TITLE_BUNDLE_KEY");
        this.P1 = ltt0.o(this, epk0.f8192a);
        this.Q1 = maz.a(wez.b, new cpk0(this, (byte) 0));
        this.R1 = xbc.a0(this, sre0.f32672a.b(tpk0.class), null, new cpk0(this, (byte) 2), 14);
        this.S1 = true;
        this.U1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final boolean getU1() {
        return this.U1;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.P1.n(W1[2], this);
        objN.getClass();
        pkd.h(((w4r) objN).b, qek0.h, null, new ugd(1590485848, true, new iob0((Object) this, (byte) 9)));
        wdk0 wdk0Var = this.M1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.S1);
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
        return (fui) this.Q1.getValue();
    }

    public final int H0() {
        return this.N1.n(this, W1[0]).intValue();
    }

    public final k3t0 I0() {
        return (k3t0) this.R1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        if (sj3.h0(this, X1)) {
            return;
        }
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

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getS1() {
        return this.S1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
