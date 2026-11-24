package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xra;", "La/yx5;", "<init>", "()V", "a/cl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xra extends yx5 {
    public final a8z K1;
    public final yzn0 L1;
    public final n0o0 M1;
    public final a8z N1;
    public final s0r O1;
    public final a8z P1;
    public final a8z Q1;
    public final a8z R1;
    public final a8z S1;
    public final a8z U1;
    public final a8z V1;
    public final a8z W1;
    public static final /* synthetic */ iiy[] Y1 = {new ez40(xra.class, "startSection", "getStartSection()Lorg/xplatform/favorites/api/presentation/models/FavoriteSectionTag;", 0), new j0d0(xra.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final cl5 X1 = new cl5((byte) 18);

    public xra() {
        super(R.layout.compose_fragment);
        mn9 mn9Var = new mn9((byte) 25);
        wez wezVar = wez.b;
        this.K1 = maz.a(wezVar, mn9Var);
        this.L1 = new yzn0("FAVORITE_SECTION_KEY");
        this.M1 = maz.b(new sra(this, (byte) 8));
        this.N1 = maz.a(wezVar, new sra(this, (byte) 9));
        this.O1 = ltt0.o(this, wra.f39630a);
        tre0 tre0Var = sre0.f32672a;
        this.P1 = xbc.a0(this, tre0Var.b(wsa.class), null, new sra(this, (byte) 10), 14);
        this.Q1 = xbc.a0(this, tre0Var.b(bm2.class), null, new sra(this, (byte) 11), 14);
        this.R1 = xbc.a0(this, tre0Var.b(hh2.class), null, new sra(this, (byte) 12), 14);
        this.S1 = xbc.a0(this, tre0Var.b(qi2.class), null, new sra(this, (byte) 13), 14);
        this.U1 = xbc.a0(this, tre0Var.b(fk2.class), null, new sra(this, (byte) 14), 14);
        this.V1 = xbc.a0(this, tre0Var.b(yn2.class), null, new sra(this, (byte) 15), 14);
        this.W1 = xbc.a0(this, tre0Var.b(ul2.class), null, new sra(this, (byte) 0), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ujd ujdVarD = N0().b.d();
        x1x.x(ujdVarD);
        final byte b = 0;
        ujdVarD.c(this, new lr2(), new Function1(this) { // from class: a.tra
            public final /* synthetic */ xra b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                xra xraVar = this.b;
                switch (b2) {
                    case 0:
                        uid uidVar = (uid) obj;
                        cl5 cl5Var = xra.X1;
                        uidVar.getClass();
                        xraVar.S0().x(new jm2(uidVar));
                        xraVar.P0().x(new sf2(uidVar));
                        xraVar.O0().x(new hra(uidVar));
                        break;
                    default:
                        long jLongValue = ((Long) obj).longValue();
                        cl5 cl5Var2 = xra.X1;
                        xraVar.S0().x(new dm2(jLongValue));
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        Object objN = this.O1.n(Y1[1], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(-1665996658, true, new bna(this, b2)));
        ccq0.V(this, "REMOVE_ALL_VIEWED_RESULT", new sra(this, (byte) 3));
        ccq0.V(this, "REMOVE_ALL_COEF_TRACK_RESULT", new sra(this, (byte) 4));
        ccq0.V(this, "REMOVE_ALL_TEAM_RESULT", new sra(this, (byte) 5));
        ccq0.V(this, "REMOVE_ALL_TOURNAMENTS_RESULT", new sra(this, (byte) 6));
        C().u0("REMOVE_ALL_SPORT_EVENTS_RESULT", this, new gne(this, (byte) 23));
        ccq0.V(this, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY", new sra(this, b2));
        ccq0.V(this, "REQUEST_CLEAR_GROUPS_DIALOG_KEY", new sra(this, (byte) 2));
        o2t.e(F(), this, new Function1(this) { // from class: a.tra
            public final /* synthetic */ xra b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                xra xraVar = this.b;
                switch (b3) {
                    case 0:
                        uid uidVar = (uid) obj;
                        cl5 cl5Var = xra.X1;
                        uidVar.getClass();
                        xraVar.S0().x(new jm2(uidVar));
                        xraVar.P0().x(new sf2(uidVar));
                        xraVar.O0().x(new hra(uidVar));
                        break;
                    default:
                        long jLongValue = ((Long) obj).longValue();
                        cl5 cl5Var2 = xra.X1;
                        xraVar.S0().x(new dm2(jLongValue));
                        break;
                }
                return Unit.f46060a;
            }
        }, new sra(this, (byte) 7), null, 18);
    }

    public final void G0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        xra xraVar;
        vne vneVar;
        fetVar.g0(-953898195);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(bzlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(this) : fetVar.i(this) ? 32 : 16;
        }
        boolean z = true;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            a8z a8zVar = this.Q1;
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar2 = (vne) objP;
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !fetVar.i(this))) {
                z = false;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                vneVar = vneVar2;
                objP2 = new wzu0(1, this, xra.class, "handleAltSportsContainerSideEffect", "handleAltSportsContainerSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sports_container/models/AltSportsContainerSideEffect;)V", 0, (byte) 20);
                fetVar.o0(objP2);
            } else {
                vneVar = vneVar2;
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0Var) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0Var, function1, b);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            am2 am2Var = (am2) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
            Object obj2 = (k3t0) a8zVar.getValue();
            boolean zI2 = fetVar.i(obj2);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new li8(1, obj2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24);
                fetVar.o0(objP4);
            }
            hew0.a(null, am2Var, (Function1) ((jhy) objP4), u1c.M(-252178178, new ec30(this, bzlVar, (byte) 15), fetVar), fetVar, 3072);
        } else {
            xraVar = this;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ura(xraVar, bzlVar, i, (byte) 0);
        }
    }

    public final void H0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        xra xraVar;
        bzl bzlVar2;
        Object li8Var;
        vne vneVar;
        fetVar.g0(1362664321);
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
            vg2 vg2Var = (vg2) ((i3t0) P0()).y(fetVar).getValue();
            k3t0 k3t0VarP0 = P0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar2 = (vne) objP;
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(this))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                vneVar = vneVar2;
                li8Var = new li8(1, this, xra.class, "handleAltSportEventsSideEffect", "handleAltSportEventsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_events/models/AltSportEventsSideEffect;)V", 0, (byte) 25);
                fetVar.o0(li8Var);
            } else {
                vneVar = vneVar2;
                li8Var = objP2;
            }
            Function1 function1 = (Function1) ((jhy) li8Var);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarP0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarP0, function1, (byte) 3);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            O0().x(new fra(new ysa(vg2Var.e)));
            zcl zclVar = qmk.f28987a;
            bdz bdzVar = (bdz) this.K1.getValue();
            Object objP0 = P0();
            boolean zI2 = fetVar.i(objP0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new li8(1, objP0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 26);
                fetVar.o0(objP4);
            }
            bzlVar2 = bzlVar;
            xraVar = this;
            f1t0.c(null, bdzVar, bzlVar2, vg2Var, 0.0f, (Function1) ((jhy) objP4), fetVar, (i3 << 6) & 896, 1);
        } else {
            xraVar = this;
            bzlVar2 = bzlVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ura(xraVar, bzlVar2, i, (byte) 1);
        }
    }

    public final void I0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        xra xraVar;
        bzl bzlVar2;
        Object li8Var;
        vne vneVar;
        fetVar.g0(2121312720);
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
            fi2 fi2Var = (fi2) ((i3t0) Q0()).y(fetVar).getValue();
            k3t0 k3t0VarQ0 = Q0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar2 = (vne) objP;
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(this))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                vneVar = vneVar2;
                li8Var = new li8(1, this, xra.class, "handleAltSportTeamsSideEffect", "handleAltSportTeamsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_teams/models/AltSportTeamsSideEffect;)V", 0, (byte) 27);
                fetVar.o0(li8Var);
            } else {
                vneVar = vneVar2;
                li8Var = objP2;
            }
            Function1 function1 = (Function1) ((jhy) li8Var);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarQ0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarQ0, function1, (byte) 4);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            O0().x(new fra(new zsa(fi2Var.e)));
            zcl zclVar = qmk.f28987a;
            bdz bdzVar = (bdz) this.K1.getValue();
            Object objQ0 = Q0();
            boolean zI2 = fetVar.i(objQ0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new li8(1, objQ0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 28);
                fetVar.o0(objP4);
            }
            bzlVar2 = bzlVar;
            xraVar = this;
            phu0.b(null, bdzVar, bzlVar2, fi2Var, 0.0f, (Function1) ((jhy) objP4), fetVar, (i3 << 6) & 896);
        } else {
            xraVar = this;
            bzlVar2 = bzlVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ura(xraVar, bzlVar2, i, (byte) 5);
        }
    }

    public final void J0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        xra xraVar;
        bzl bzlVar2;
        fetVar.g0(1965368540);
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
            qj2 qj2Var = (qj2) ((i3t0) R0()).y(fetVar).getValue();
            k3t0 k3t0VarR0 = R0();
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
                objP2 = new li8(1, this, xra.class, "handleAltSportTournamentsSideEffect", "handleAltSportTournamentsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_tournaments/models/AltSportTournamentsSideEffect;)V", 0, (byte) 29);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarR0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarR0, function1, (byte) 5);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            O0().x(new fra(new ata(qj2Var.e)));
            zcl zclVar = qmk.f28987a;
            bdz bdzVar = (bdz) this.K1.getValue();
            Object objR0 = R0();
            boolean zI2 = fetVar.i(objR0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                Object vraVar = new vra(1, objR0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 0);
                fetVar.o0(vraVar);
                objP4 = vraVar;
            }
            bzlVar2 = bzlVar;
            xraVar = this;
            i4w0.b(null, bdzVar, bzlVar2, qj2Var, 0.0f, (Function1) ((jhy) objP4), fetVar, (i3 << 6) & 896);
        } else {
            xraVar = this;
            bzlVar2 = bzlVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ura(xraVar, bzlVar2, i, (byte) 3);
        }
    }

    public final void K0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        xra xraVar;
        bzl bzlVar2;
        Object vraVar;
        vne vneVar;
        fetVar.g0(-228408228);
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
            ol2 ol2Var = (ol2) ((i3t0) M0()).y(fetVar).getValue();
            k3t0 k3t0VarM0 = M0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar2 = (vne) objP;
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(this))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                vneVar = vneVar2;
                vraVar = new vra(1, this, xra.class, "handleAltSportTrackedSideEffect", "handleAltSportTrackedSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_tracked/models/AltSportTrackedSideEffect;)V", 0, (byte) 1);
                fetVar.o0(vraVar);
            } else {
                vneVar = vneVar2;
                vraVar = objP2;
            }
            Function1 function1 = (Function1) ((jhy) vraVar);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarM0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            byte b = 6;
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarM0, function1, b);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            O0().x(new fra(new bta(ol2Var.f)));
            zcl zclVar = qmk.f28987a;
            bdz bdzVar = (bdz) this.K1.getValue();
            Object objM0 = M0();
            boolean zI2 = fetVar.i(objM0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new vra(1, objM0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 2);
                fetVar.o0(objP4);
            }
            bzlVar2 = bzlVar;
            xraVar = this;
            vbw0.c(null, bdzVar, bzlVar2, ol2Var, 0.0f, (Function1) ((jhy) objP4), fetVar, (i3 << 6) & 896, 1);
        } else {
            xraVar = this;
            bzlVar2 = bzlVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ura(xraVar, bzlVar2, i, (byte) 2);
        }
    }

    public final void L0(bzl bzlVar, fet fetVar, int i) {
        int i2;
        bzl bzlVar2;
        Object vraVar;
        vne vneVar;
        fetVar.g0(-1552494283);
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
            pn2 pn2Var = (pn2) ((i3t0) S0()).y(fetVar).getValue();
            k3t0 k3t0VarS0 = S0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar2 = (vne) objP;
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(this))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                vneVar = vneVar2;
                vraVar = new vra(1, this, xra.class, "handleViewedTabSideEffect", "handleViewedTabSideEffect(Lorg/xplatform/favorites/impl/presentation/viewed/compose/models/AltViewedSideEffect;)V", 0, (byte) 3);
                fetVar.o0(vraVar);
            } else {
                vneVar = vneVar2;
                vraVar = objP2;
            }
            Function1 function1 = (Function1) ((jhy) vraVar);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(vneVar) | fetVar.i(k3t0VarS0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new et(vneVar, k3t0VarS0, function1, (byte) 7);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            r2.O0().x(new fra(new cta(pn2Var.d)));
            zcl zclVar = qmk.f28987a;
            bdz bdzVar = (bdz) r2.K1.getValue();
            Object objS0 = r2.S0();
            boolean zI2 = fetVar.i(objS0);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new vra(1, objS0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                fetVar.o0(objP4);
            }
            bzlVar2 = bzlVar;
            nnw0.o(null, bzlVar2, bdzVar, pn2Var, 0.0f, (Function1) ((jhy) objP4), fetVar, (i3 << 3) & 112, 1);
        } else {
            bzlVar2 = bzlVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ura(this, bzlVar2, i, (byte) 4);
        }
    }

    public final k3t0 M0() {
        return (k3t0) this.W1.getValue();
    }

    public final pbi N0() {
        return (pbi) this.M1.getValue();
    }

    public final k3t0 O0() {
        return (k3t0) this.P1.getValue();
    }

    public final k3t0 P0() {
        return (k3t0) this.R1.getValue();
    }

    public final k3t0 Q0() {
        return (k3t0) this.S1.getValue();
    }

    public final k3t0 R0() {
        return (k3t0) this.U1.getValue();
    }

    public final k3t0 S0() {
        return (k3t0) this.V1.getValue();
    }

    public final void T0(String str) {
        ii iiVar = N0().d;
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
        x1x.x(N0().b.d());
        ujd.a(this);
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        wdk0.l(N0().f, this, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        wdk0.a(N0().f, this);
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getK1() {
        return true;
    }
}
