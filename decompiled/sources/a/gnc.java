package a;

import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/gnc;", "La/yx5;", "<init>", "()V", "a/kl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gnc extends yx5 {
    public final a8z K1;
    public final yzn0 L1;
    public final khf0 M1;
    public final n0o0 N1;
    public final n0o0 O1;
    public final a8z P1;
    public final a8z Q1;
    public final a8z R1;
    public final a8z S1;
    public final a8z U1;
    public final a8z V1;
    public final a8z W1;
    public final s0r X1;
    public final a8z Y1;
    public static final /* synthetic */ iiy[] a2 = {new ez40(gnc.class, "startSection", "getStartSection()Lorg/xplatform/favorites/api/presentation/models/FavoriteSectionTag;", 0), new ez40(gnc.class, "currentAltTab", "getCurrentAltTab()Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;", 0), new j0d0(gnc.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final kl5 Z1 = new kl5();

    public gnc() {
        super(R.layout.compose_fragment);
        zxb zxbVar = new zxb((byte) 18);
        wez wezVar = wez.b;
        this.K1 = maz.a(wezVar, zxbVar);
        this.L1 = new yzn0("FAVORITE_SECTION_KEY");
        this.M1 = new khf0("BUNDLE_CURRENT_ALT_TAB");
        this.N1 = maz.b(new zmc(this, (byte) 13));
        this.O1 = maz.b(new zmc(this, (byte) 14));
        this.P1 = maz.a(wezVar, new zmc(this, (byte) 15));
        this.Q1 = maz.a(wezVar, new zmc(this, (byte) 16));
        this.R1 = maz.a(wezVar, new zmc(this, (byte) 17));
        tre0 tre0Var = sre0.f32672a;
        this.S1 = xbc.a0(this, tre0Var.b(yn2.class), null, new zmc(this, (byte) 18), 14);
        this.U1 = xbc.a0(this, tre0Var.b(boc.class), null, new zmc(this, (byte) 0), 14);
        this.V1 = xbc.a0(this, tre0Var.b(ul2.class), null, new zmc(this, (byte) 1), 14);
        this.W1 = xbc.a0(this, tre0Var.b(hh2.class), null, new zmc(this, (byte) 2), 14);
        this.X1 = ltt0.o(this, fnc.f9828a);
        this.Y1 = xbc.a0(this, tre0Var.b(ccp.class), null, new zmc(this, (byte) 12), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ujd ujdVarD = N0().f9838a.d();
        x1x.x(ujdVarD);
        final byte b = 0;
        ujdVarD.c(this, new xq2(), new bnc(this, b));
        x1x.x(N0().I.b());
        final byte b2 = 1;
        afm0.s(this, new bnc(this, b2));
        ccq0.V(this, "REMOVE_ALL_COEF_TRACK_RESULT", new zmc(this, (byte) 3));
        ccq0.V(this, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY", new zmc(this, (byte) 4));
        final byte b3 = 2;
        Object objN = this.X1.n(a2[2], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(1277592871, true, new cnc(this, b)));
        ccq0.V(this, "REQUEST_OTHER_CLEAR_GROUPS_DIALOG_KEY", new zmc(this, (byte) 8));
        ccq0.T(this, "REQUEST_OTHER_CLEAR_GROUPS_DIALOG_KEY", new zmc(this, (byte) 9));
        ccq0.V(this, "REQUEST_EVENTS_CLEAR_GROUPS_DIALOG_KEY", new zmc(this, (byte) 10));
        ccq0.V(this, "REMOVE_ALL_VIEWED_RESULT", new zmc(this, (byte) 5));
        ccq0.V(this, "REMOVE_ALL_COEF_TRACK_RESULT", new zmc(this, (byte) 6));
        ccq0.V(this, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY", new zmc(this, (byte) 7));
        C().u0("REMOVE_ALL_SPORT_EVENTS_RESULT", this, new k4r(this) { // from class: a.anc
            public final /* synthetic */ gnc b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b4 = b3;
                gnc gncVar = this.b;
                switch (b4) {
                    case 0:
                        kl5 kl5Var = gnc.Z1;
                        str.getClass();
                        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle2.getParcelableArrayList("REQUEST_KEY_OTHER_CLEAR", FavoriteGroupHeaderUiItem.class) : bundle2.getParcelableArrayList("REQUEST_KEY_OTHER_CLEAR");
                        List listL0 = parcelableArrayList != null ? CollectionsKt.L0(parcelableArrayList) : null;
                        if (listL0 == null) {
                            listL0 = iun.f15405a;
                        }
                        if (!listL0.isEmpty()) {
                            gncVar.O0().x(new vb80(listL0));
                        }
                        break;
                    case 1:
                        kl5 kl5Var2 = gnc.Z1;
                        str.getClass();
                        gncVar.M0().x(pmc.f27224a);
                        break;
                    default:
                        kl5 kl5Var3 = gnc.Z1;
                        str.getClass();
                        List parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundle2.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT", FavoriteGroupHeaderUiItem.class) : bundle2.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT");
                        if (parcelableArrayList2 == null) {
                            parcelableArrayList2 = iun.f15405a;
                        }
                        if (!parcelableArrayList2.isEmpty()) {
                            gncVar.P0().x(new yf2(parcelableArrayList2));
                        }
                        break;
                }
            }
        });
        C().u0("REQUEST_KEY_OTHER_CLEAR", this, new k4r(this) { // from class: a.anc
            public final /* synthetic */ gnc b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b4 = b;
                gnc gncVar = this.b;
                switch (b4) {
                    case 0:
                        kl5 kl5Var = gnc.Z1;
                        str.getClass();
                        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle2.getParcelableArrayList("REQUEST_KEY_OTHER_CLEAR", FavoriteGroupHeaderUiItem.class) : bundle2.getParcelableArrayList("REQUEST_KEY_OTHER_CLEAR");
                        List listL0 = parcelableArrayList != null ? CollectionsKt.L0(parcelableArrayList) : null;
                        if (listL0 == null) {
                            listL0 = iun.f15405a;
                        }
                        if (!listL0.isEmpty()) {
                            gncVar.O0().x(new vb80(listL0));
                        }
                        break;
                    case 1:
                        kl5 kl5Var2 = gnc.Z1;
                        str.getClass();
                        gncVar.M0().x(pmc.f27224a);
                        break;
                    default:
                        kl5 kl5Var3 = gnc.Z1;
                        str.getClass();
                        List parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundle2.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT", FavoriteGroupHeaderUiItem.class) : bundle2.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT");
                        if (parcelableArrayList2 == null) {
                            parcelableArrayList2 = iun.f15405a;
                        }
                        if (!parcelableArrayList2.isEmpty()) {
                            gncVar.P0().x(new yf2(parcelableArrayList2));
                        }
                        break;
                }
            }
        });
        n0().r().u0("REQUEST_KEY_CLOSE_GAME", this, new k4r(this) { // from class: a.anc
            public final /* synthetic */ gnc b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b4 = b2;
                gnc gncVar = this.b;
                switch (b4) {
                    case 0:
                        kl5 kl5Var = gnc.Z1;
                        str.getClass();
                        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle2.getParcelableArrayList("REQUEST_KEY_OTHER_CLEAR", FavoriteGroupHeaderUiItem.class) : bundle2.getParcelableArrayList("REQUEST_KEY_OTHER_CLEAR");
                        List listL0 = parcelableArrayList != null ? CollectionsKt.L0(parcelableArrayList) : null;
                        if (listL0 == null) {
                            listL0 = iun.f15405a;
                        }
                        if (!listL0.isEmpty()) {
                            gncVar.O0().x(new vb80(listL0));
                        }
                        break;
                    case 1:
                        kl5 kl5Var2 = gnc.Z1;
                        str.getClass();
                        gncVar.M0().x(pmc.f27224a);
                        break;
                    default:
                        kl5 kl5Var3 = gnc.Z1;
                        str.getClass();
                        List parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundle2.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT", FavoriteGroupHeaderUiItem.class) : bundle2.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT");
                        if (parcelableArrayList2 == null) {
                            parcelableArrayList2 = iun.f15405a;
                        }
                        if (!parcelableArrayList2.isEmpty()) {
                            gncVar.P0().x(new yf2(parcelableArrayList2));
                        }
                        break;
                }
            }
        });
    }

    public final void G0(int i, fet fetVar) {
        int i2;
        gnc gncVar = this;
        fetVar.g0(-581177001);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(gncVar) : fetVar.i(gncVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        boolean z = true;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            k3t0 k3t0VarO0 = gncVar.O0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !fetVar.i(gncVar))) {
                z = false;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new zhb(1, gncVar, gnc.class, "handleOtherSideEffects", "handleOtherSideEffects(Lorg/xplatform/favorites/impl/presentation/other/models/OtherSideEffect;)V", 0, (byte) 28);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarO0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarO0, function1, (byte) 18);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            pz40 pz40VarY = ((i3t0) gncVar.O0()).y(fetVar);
            gncVar.M0().x(new omc(new iw70(((ld80) pz40VarY.getValue()).d, ((ld80) pz40VarY.getValue()).c)));
            bdz bdzVar = (bdz) gncVar.K1.getValue();
            Object objO0 = gncVar.O0();
            boolean zI2 = fetVar.i(objO0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                Object zhbVar = new zhb(1, objO0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                fetVar.o0(zhbVar);
                objP4 = zhbVar;
            }
            epv0.z(null, pz40VarY, bdzVar, (Function1) ((jhy) objP4), fetVar, 0);
        } else {
            gncVar = gncVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dnc(gncVar, i, b);
        }
    }

    public final void H0(int i, fet fetVar) {
        int i2;
        fetVar.g0(-1281925717);
        char c = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(this) : fetVar.i(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            k3t0 k3t0VarP0 = P0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(this))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new enc(1, this, gnc.class, "handleAltSportEventsSideEffect", "handleAltSportEventsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_events/models/AltSportEventsSideEffect;)V", 0, (byte) 0);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarP0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarP0, function1, (byte) 19);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            vg2 vg2Var = (vg2) ((i3t0) P0()).y(fetVar).getValue();
            M0().x(new omc(new jw70(vg2Var.e)));
            bdz bdzVar = (bdz) this.K1.getValue();
            Object objP0 = P0();
            boolean zI2 = fetVar.i(objP0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new enc(1, objP0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                fetVar.o0(objP4);
            }
            f1t0.c(null, bdzVar, null, vg2Var, 0.0f, (Function1) ((jhy) objP4), fetVar, 384, 17);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dnc(this, i, c);
        }
    }

    public final void I0(int i, fet fetVar) {
        int i2;
        fetVar.g0(-1092001210);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(this) : fetVar.i(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            k3t0 k3t0VarK0 = K0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(this))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new enc(1, this, gnc.class, "handleAltSportTrackedSideEffect", "handleAltSportTrackedSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_tracked/models/AltSportTrackedSideEffect;)V", 0, (byte) 2);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarK0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarK0, function1, (byte) 20);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            ol2 ol2Var = (ol2) ((i3t0) K0()).y(fetVar).getValue();
            M0().x(new omc(new kw70(ol2Var.f, ol2Var.e)));
            bdz bdzVar = (bdz) this.K1.getValue();
            Object objK0 = K0();
            boolean zI2 = fetVar.i(objK0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new enc(1, objK0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                fetVar.o0(objP4);
            }
            vbw0.c(null, bdzVar, null, ol2Var, 0.0f, (Function1) ((jhy) objP4), fetVar, 384, 17);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dnc(this, i, (byte) 3);
        }
    }

    public final void J0(int i, fet fetVar) {
        int i2;
        fetVar.g0(453200991);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(this) : fetVar.i(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        boolean z2 = true;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            k3t0 k3t0VarR0 = R0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(this))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new enc(1, this, gnc.class, "handleViewedTabSideEffect", "handleViewedTabSideEffect(Lorg/xplatform/favorites/impl/presentation/viewed/compose/models/AltViewedSideEffect;)V", 0, (byte) 4);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarR0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarR0, function1, (byte) 21);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            pn2 pn2Var = (pn2) ((i3t0) R0()).y(fetVar).getValue();
            M0().x(new omc(new lw70(pn2Var.d, pn2Var.e)));
            zcl zclVar = qmk.f28987a;
            bdz bdzVar = (bdz) this.K1.getValue();
            Object objR0 = R0();
            boolean zI2 = fetVar.i(objR0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new enc(1, objR0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 5);
                fetVar.o0(objP4);
            }
            nnw0.o(null, null, bdzVar, pn2Var, 16.0f, (Function1) ((jhy) objP4), fetVar, 48, 1);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dnc(this, i, z2);
        }
    }

    public final k3t0 K0() {
        return (k3t0) this.V1.getValue();
    }

    public final kgi L0() {
        return (kgi) this.N1.getValue();
    }

    public final k3t0 M0() {
        return (k3t0) this.U1.getValue();
    }

    public final fni N0() {
        return (fni) this.O1.getValue();
    }

    public final k3t0 O0() {
        return (k3t0) this.Y1.getValue();
    }

    public final k3t0 P0() {
        return (k3t0) this.W1.getValue();
    }

    public final ogi Q0() {
        return (ogi) this.Q1.getValue();
    }

    public final k3t0 R0() {
        return (k3t0) this.S1.getValue();
    }

    public final void S0(String str) {
        ii iiVar = L0().c;
        String strH = H(R.string.clear);
        String strH2 = H(R.string.confirm_delete_all_actions);
        String strH3 = H(R.string.clear);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, H(R.string.cancel), (String) null, str, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        hxm0.m(q0());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(q0());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        wdk0.l(L0().b, this, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        wdk0.a(L0().b, this);
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getK1() {
        return true;
    }
}
