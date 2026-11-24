package a;

import android.os.Build;
import android.os.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/g5b;", "La/yx5;", "<init>", "()V", "a/gl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class g5b extends yx5 {
    public final a8z K1;
    public final yzn0 L1;
    public final khf0 M1;
    public final n0o0 N1;
    public final a8z O1;
    public final a8z P1;
    public final a8z Q1;
    public final s0r R1;
    public final a8z S1;
    public final a8z U1;
    public final a8z V1;
    public final a8z W1;
    public final a8z X1;
    public final a8z Y1;
    public final a8z Z1;
    public final a8z a2;
    public final a8z b2;
    public static final /* synthetic */ iiy[] d2 = {new ez40(g5b.class, "startSection", "getStartSection()Lorg/xplatform/favorites/api/presentation/models/FavoriteSectionTag;", 0), new ez40(g5b.class, "currentTab", "getCurrentTab()Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;", 0), new j0d0(g5b.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gl5 c2 = new gl5(19);

    public g5b() {
        super(R.layout.compose_fragment);
        e0b e0bVar = new e0b((byte) 3);
        wez wezVar = wez.b;
        this.K1 = maz.a(wezVar, e0bVar);
        this.L1 = new yzn0("FAVORITE_SECTION_KEY");
        this.M1 = new khf0("BUNDLE_CURRENT_TAB");
        this.N1 = maz.b(new a5b(this, (byte) 18));
        this.O1 = maz.a(wezVar, new a5b(this, (byte) 19));
        this.P1 = maz.a(wezVar, new a5b(this, (byte) 20));
        this.Q1 = maz.a(wezVar, new a5b(this, (byte) 21));
        this.R1 = ltt0.o(this, e5b.f7226a);
        tre0 tre0Var = sre0.f32672a;
        this.S1 = xbc.a0(this, tre0Var.b(w5b.class), null, new a5b(this, (byte) 0), 14);
        this.U1 = xbc.a0(this, tre0Var.b(bep.class), null, new a5b(this, (byte) 1), 14);
        this.V1 = xbc.a0(this, tre0Var.b(gfp.class), null, new a5b(this, (byte) 2), 14);
        this.W1 = xbc.a0(this, tre0Var.b(yn2.class), null, new a5b(this, (byte) 3), 14);
        this.X1 = xbc.a0(this, tre0Var.b(bm2.class), null, new a5b(this, (byte) 4), 14);
        this.Y1 = xbc.a0(this, tre0Var.b(hh2.class), null, new a5b(this, (byte) 13), 14);
        this.Z1 = xbc.a0(this, tre0Var.b(qi2.class), null, new a5b(this, (byte) 15), 14);
        this.a2 = xbc.a0(this, tre0Var.b(fk2.class), null, new a5b(this, (byte) 16), 14);
        this.b2 = xbc.a0(this, tre0Var.b(ul2.class), null, new a5b(this, (byte) 17), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ujd ujdVarD = R0().b.d();
        x1x.x(ujdVarD);
        final byte b = 1;
        ujdVarD.c(this, new lr2(), new b5b(this, b));
        Object objN = this.R1.n(d2[2], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(1106173963, true, new bna(this, (byte) 17)));
        x1x.x(((aii) this.P1.getValue()).f924a.b());
        afm0.s(this, new b5b(this, (byte) 2));
        n0().r().u0("REQUEST_KEY_CLOSE_GAME", this, new k4r(this) { // from class: a.c5b
            public final /* synthetic */ g5b b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b2 = b;
                g5b g5bVar = this.b;
                switch (b2) {
                    case 0:
                        gl5 gl5Var = g5b.c2;
                        str.getClass();
                        List parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle2.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT", FavoriteGroupHeaderUiItem.class) : bundle2.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT");
                        if (parcelableArrayList == null) {
                            parcelableArrayList = iun.f15405a;
                        }
                        if (!parcelableArrayList.isEmpty()) {
                            g5bVar.T0().x(new yf2(parcelableArrayList));
                        }
                        break;
                    default:
                        gl5 gl5Var2 = g5b.c2;
                        str.getClass();
                        g5bVar.Q0().x(q4b.f28089a);
                        break;
                }
            }
        });
        ccq0.V(this, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY", new a5b(this, (byte) 5));
        ccq0.V(this, "REQUEST_CLEAR_GROUPS_DIALOG_KEY", new a5b(this, (byte) 6));
        ccq0.V(this, "REMOVE_ALL_COEF_TRACK_RESULT", new a5b(this, (byte) 7));
        ccq0.V(this, "REMOVE_ALL_TEAM_RESULT", new a5b(this, (byte) 8));
        ccq0.V(this, "REMOVE_ALL_TOURNAMENTS_RESULT", new a5b(this, (byte) 9));
        ccq0.V(this, "REMOVE_ALL_FAVORITES_AGGREGATOR_RESULT", new a5b(this, (byte) 10));
        ccq0.V(this, "REMOVE_ALL_FAVORITES_XGAMES_RESULT", new a5b(this, (byte) 11));
        ccq0.V(this, "REMOVE_ALL_VIEWED_RESULT", new a5b(this, (byte) 12));
        final byte b2 = 0;
        C().u0("REMOVE_ALL_SPORT_EVENTS_RESULT", this, new k4r(this) { // from class: a.c5b
            public final /* synthetic */ g5b b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b3 = b2;
                g5b g5bVar = this.b;
                switch (b3) {
                    case 0:
                        gl5 gl5Var = g5b.c2;
                        str.getClass();
                        List parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle2.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT", FavoriteGroupHeaderUiItem.class) : bundle2.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT");
                        if (parcelableArrayList == null) {
                            parcelableArrayList = iun.f15405a;
                        }
                        if (!parcelableArrayList.isEmpty()) {
                            g5bVar.T0().x(new yf2(parcelableArrayList));
                        }
                        break;
                    default:
                        gl5 gl5Var2 = g5b.c2;
                        str.getClass();
                        g5bVar.Q0().x(q4b.f28089a);
                        break;
                }
            }
        });
    }

    public final void G0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        bzl bzlVar2;
        g5b g5bVar = this;
        fetVar.g0(1181475903);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(bzlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(g5bVar) : fetVar.i(g5bVar) ? 32 : 16;
        }
        int i3 = i2;
        byte b = 0;
        boolean z = true;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            k3t0 k3t0VarO0 = g5bVar.O0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !fetVar.i(g5bVar))) {
                z = false;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new vra(1, g5bVar, g5b.class, "handleAggregatorSideEffect", "handleAggregatorSideEffect(Lorg/xplatform/favorites/impl/presentation/aggregator/models/AggregatorSideEffect;)V", 0, (byte) 11);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarO0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarO0, function1, (byte) 9);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            f2p f2pVar = (f2p) ((i3t0) g5bVar.O0()).y(fetVar).getValue();
            g5bVar.Q0().x(new o4b(new cx70(f2pVar.b)));
            bdz bdzVarS0 = g5bVar.S0();
            Object objO0 = g5bVar.O0();
            boolean zI2 = fetVar.i(objO0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                Object vraVar = new vra(1, objO0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                fetVar.o0(vraVar);
                objP4 = vraVar;
            }
            bzlVar2 = bzlVar;
            uc9.y(null, bzlVar2, bdzVarS0, f2pVar, (Function1) ((jhy) objP4), fetVar, (i3 << 3) & 112);
        } else {
            g5bVar = g5bVar;
            bzlVar2 = bzlVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d5b(g5bVar, bzlVar2, i, b);
        }
    }

    public final void H0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        bzl bzlVar2;
        g5b g5bVar = this;
        fetVar.g0(-160132354);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(bzlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(g5bVar) : fetVar.i(g5bVar) ? 32 : 16;
        }
        int i3 = i2;
        boolean z = false;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            k3t0 k3t0VarT0 = g5bVar.T0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(g5bVar))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new vra(1, g5bVar, g5b.class, "handleAltSportEventsSideEffect", "handleAltSportEventsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_events/models/AltSportEventsSideEffect;)V", 0, (byte) 13);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarT0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarT0, function1, (byte) 10);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            vg2 vg2Var = (vg2) ((i3t0) g5bVar.T0()).y(fetVar).getValue();
            g5bVar.Q0().x(new o4b(new ex70(vg2Var.e)));
            zcl zclVar = qmk.f28987a;
            bdz bdzVarS0 = g5bVar.S0();
            Object objT0 = g5bVar.T0();
            boolean zI2 = fetVar.i(objT0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new vra(1, objT0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 14);
                fetVar.o0(objP4);
            }
            bzlVar2 = bzlVar;
            f1t0.c(null, bdzVarS0, bzlVar2, vg2Var, 0.0f, (Function1) ((jhy) objP4), fetVar, (i3 << 6) & 896, 1);
        } else {
            g5bVar = g5bVar;
            bzlVar2 = bzlVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d5b(g5bVar, bzlVar2, i, (byte) 5);
        }
    }

    public final void I0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        g5b g5bVar;
        bzl bzlVar2;
        fetVar.g0(598516045);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(bzlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(this) : fetVar.i(this) ? 32 : 16;
        }
        int i3 = i2;
        boolean z = false;
        byte b = 6;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            k3t0 k3t0VarU0 = U0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(this))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new vra(1, this, g5b.class, "handleAltSportTeamsSideEffect", "handleAltSportTeamsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_teams/models/AltSportTeamsSideEffect;)V", 0, (byte) 15);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarU0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarU0, function1, (byte) 11);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            fi2 fi2Var = (fi2) ((i3t0) U0()).y(fetVar).getValue();
            Q0().x(new o4b(new fx70(fi2Var.e)));
            zcl zclVar = qmk.f28987a;
            bdz bdzVarS0 = S0();
            Object objU0 = U0();
            boolean zI2 = fetVar.i(objU0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                Object vraVar = new vra(1, objU0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                fetVar.o0(vraVar);
                objP4 = vraVar;
            }
            bzlVar2 = bzlVar;
            g5bVar = this;
            phu0.b(null, bdzVarS0, bzlVar2, fi2Var, 0.0f, (Function1) ((jhy) objP4), fetVar, (i3 << 6) & 896);
        } else {
            g5bVar = this;
            bzlVar2 = bzlVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d5b(g5bVar, bzlVar2, i, b);
        }
    }

    public final void J0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        g5b g5bVar;
        bzl bzlVar2;
        fetVar.g0(442571865);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(bzlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(this) : fetVar.i(this) ? 32 : 16;
        }
        int i3 = i2;
        boolean z = false;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            k3t0 k3t0VarV0 = V0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(this))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new vra(1, this, g5b.class, "handleAltSportTournamentsSideEffect", "handleAltSportTournamentsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_tournaments/models/AltSportTournamentsSideEffect;)V", 0, (byte) 17);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarV0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarV0, function1, (byte) 12);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            qj2 qj2Var = (qj2) ((i3t0) V0()).y(fetVar).getValue();
            Q0().x(new o4b(new gx70(qj2Var.e)));
            zcl zclVar = qmk.f28987a;
            bdz bdzVarS0 = S0();
            Object objV0 = V0();
            boolean zI2 = fetVar.i(objV0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                Object vraVar = new vra(1, objV0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                fetVar.o0(vraVar);
                objP4 = vraVar;
            }
            bzlVar2 = bzlVar;
            g5bVar = this;
            i4w0.b(null, bdzVarS0, bzlVar2, qj2Var, 0.0f, (Function1) ((jhy) objP4), fetVar, (i3 << 6) & 896);
        } else {
            g5bVar = this;
            bzlVar2 = bzlVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d5b(g5bVar, bzlVar2, i, b);
        }
    }

    public final void K0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        bzl bzlVar2;
        g5b g5bVar = this;
        fetVar.g0(-1751204903);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(bzlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(g5bVar) : fetVar.i(g5bVar) ? 32 : 16;
        }
        int i3 = i2;
        boolean z = false;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            k3t0 k3t0VarP0 = g5bVar.P0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(g5bVar))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new vra(1, g5bVar, g5b.class, "handleAltSportTrackedSideEffect", "handleAltSportTrackedSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_tracked/models/AltSportTrackedSideEffect;)V", 0, (byte) 19);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarP0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarP0, function1, (byte) 13);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            ol2 ol2Var = (ol2) ((i3t0) g5bVar.P0()).y(fetVar).getValue();
            g5bVar.Q0().x(new o4b(new hx70(ol2Var.f)));
            zcl zclVar = qmk.f28987a;
            bdz bdzVarS0 = g5bVar.S0();
            Object objP0 = g5bVar.P0();
            boolean zI2 = fetVar.i(objP0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new vra(1, objP0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                fetVar.o0(objP4);
            }
            bzlVar2 = bzlVar;
            vbw0.c(null, bdzVarS0, bzlVar2, ol2Var, 0.0f, (Function1) ((jhy) objP4), fetVar, (i3 << 6) & 896, 1);
        } else {
            g5bVar = g5bVar;
            bzlVar2 = bzlVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d5b(g5bVar, bzlVar2, i, (byte) 7);
        }
    }

    public final void L0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        g5b g5bVar;
        vne vneVar;
        fetVar.g0(929824117);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(bzlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(this) : fetVar.i(this) ? 32 : 16;
        }
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            a8z a8zVar = this.X1;
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar2 = (vne) objP;
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(this))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                vneVar = vneVar2;
                objP2 = new wzu0(1, this, g5b.class, "handleAltSportsContainerSideEffect", "handleAltSportsContainerSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sports_container/models/AltSportsContainerSideEffect;)V", 0, (byte) 21);
                fetVar.o0(objP2);
            } else {
                vneVar = vneVar2;
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0Var) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0Var, function1, (byte) 14);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
            vcp vcpVar = vcp.Classic;
            k3t0Var2.x(new xl2());
            am2 am2Var = (am2) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
            Object obj2 = (k3t0) a8zVar.getValue();
            boolean zI2 = fetVar.i(obj2);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new vra(1, obj2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                fetVar.o0(objP4);
            }
            hew0.a(null, am2Var, (Function1) ((jhy) objP4), u1c.M(-775827132, new ec30(this, bzlVar, b), fetVar), fetVar, 3072);
        } else {
            g5bVar = this;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d5b(g5bVar, bzlVar, i, (byte) 1);
        }
    }

    public final void M0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        g5b g5bVar;
        bzl bzlVar2;
        fetVar.g0(1219676338);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(bzlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(this) : fetVar.i(this) ? 32 : 16;
        }
        int i3 = i2;
        boolean z = false;
        byte b = 3;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            k3t0 k3t0VarW0 = W0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(this))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new vra(1, this, g5b.class, "handleViewedTabSideEffect", "handleViewedTabSideEffect(Lorg/xplatform/favorites/impl/presentation/viewed/compose/models/AltViewedSideEffect;)V", 0, (byte) 22);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarW0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarW0, function1, (byte) 15);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            pn2 pn2Var = (pn2) ((i3t0) W0()).y(fetVar).getValue();
            Q0().x(new o4b(new ix70(pn2Var.d)));
            zcl zclVar = qmk.f28987a;
            bdz bdzVarS0 = S0();
            Object objW0 = W0();
            boolean zI2 = fetVar.i(objW0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                Object vraVar = new vra(1, objW0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                fetVar.o0(vraVar);
                objP4 = vraVar;
            }
            bzlVar2 = bzlVar;
            g5bVar = this;
            nnw0.o(null, bzlVar2, bdzVarS0, pn2Var, 12.0f, (Function1) ((jhy) objP4), fetVar, (i3 << 3) & 112, 1);
        } else {
            g5bVar = this;
            bzlVar2 = bzlVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d5b(g5bVar, bzlVar2, i, b);
        }
    }

    public final void N0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        bzl bzlVar2;
        vne vneVar;
        g5b g5bVar = this;
        fetVar.g0(1837491359);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(bzlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(g5bVar) : fetVar.i(g5bVar) ? 32 : 16;
        }
        int i3 = i2;
        boolean z = false;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            k3t0 k3t0VarX0 = g5bVar.X0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar2 = (vne) objP;
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(g5bVar))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                vneVar = vneVar2;
                Object vraVar = new vra(1, g5bVar, g5b.class, "handleXGamesSideEffect", "handleXGamesSideEffect(Lorg/xplatform/favorites/impl/presentation/games/nodels/GamesSideEffect;)V", 0, (byte) 24);
                fetVar.o0(vraVar);
                objP2 = vraVar;
            } else {
                vneVar = vneVar2;
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarX0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarX0, function1, b);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            j9p j9pVar = (j9p) ((i3t0) g5bVar.X0()).y(fetVar).getValue();
            g5bVar.Q0().x(new o4b(new dx70(j9pVar.b)));
            bdz bdzVarS0 = g5bVar.S0();
            Object objX0 = g5bVar.X0();
            boolean zI2 = fetVar.i(objX0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new vra(1, objX0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                fetVar.o0(objP4);
            }
            bzlVar2 = bzlVar;
            q8a.q(null, bzlVar2, j9pVar, bdzVarS0, (Function1) ((jhy) objP4), fetVar, (i3 << 3) & 112);
        } else {
            g5bVar = g5bVar;
            bzlVar2 = bzlVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d5b(g5bVar, bzlVar2, i, (byte) 2);
        }
    }

    public final k3t0 O0() {
        return (k3t0) this.U1.getValue();
    }

    public final k3t0 P0() {
        return (k3t0) this.b2.getValue();
    }

    public final k3t0 Q0() {
        return (k3t0) this.S1.getValue();
    }

    public final aci R0() {
        return (aci) this.N1.getValue();
    }

    public final bdz S0() {
        return (bdz) this.K1.getValue();
    }

    public final k3t0 T0() {
        return (k3t0) this.Y1.getValue();
    }

    public final k3t0 U0() {
        return (k3t0) this.Z1.getValue();
    }

    public final k3t0 V0() {
        return (k3t0) this.a2.getValue();
    }

    public final k3t0 W0() {
        return (k3t0) this.W1.getValue();
    }

    public final k3t0 X0() {
        return (k3t0) this.V1.getValue();
    }

    public final void Y0(String str) {
        ii iiVar = R0().d;
        String strH = H(R.string.clear);
        String strH2 = H(R.string.confirm_delete_all_actions);
        String strH3 = H(R.string.clear);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, H(R.string.cancel), (String) null, str, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        x1x.x(R0().b.d());
        ujd.a(this);
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        wdk0.l(R0().f, this, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        wdk0.a(R0().f, this);
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getK1() {
        return true;
    }
}
