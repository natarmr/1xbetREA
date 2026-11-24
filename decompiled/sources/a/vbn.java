package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/vbn;", "La/iw5;", "<init>", "()V", "a/nek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vbn extends iw5 {
    public fiu0 k2;
    public final yzn0 l2 = new yzn0("DUEL_BUILDER_DIALOG_TEAM_NUMBER_KEY");
    public final a8z m2 = xbc.b0(this, sre0.f32672a.b(ccn.class), new sbn(this, 1));
    public static final /* synthetic */ iiy[] o2 = {new ez40(vbn.class, "duelTeamType", "getDuelTeamType()Lorg/xplatform/playersduel/impl/domain/models/DuelTeamType;", 0)};
    public static final nek n2 = new nek();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        final vbn vbnVar;
        fetVar.e0(353909178);
        a8z a8zVar = this.m2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            vbnVar = this;
            Object k0lVar = new k0l(1, vbnVar, vbn.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/playersduel/impl/presentation/dialogs/duel_builder/DuelBuilderSideEffect;)V", 0, (byte) 24);
            fetVar.o0(k0lVar);
            objP = k0lVar;
        } else {
            vbnVar = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(vbnVar) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new g6g(k3t0Var, vbnVar, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, vbnVar, (Function2) objP2);
        final pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
        final byte b = 1;
        final byte b2 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-1080831319, new v7i0(pz40VarY, (byte) 26), fetVar), u1c.M(570981489, new xdr() { // from class: a.rbn
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b3 = b2;
                cl5 cl5Var = ukd.f35823a;
                jm40 jm40Var = jm40.b;
                byte b4 = 2;
                vbn vbnVar2 = vbnVar;
                l7m0 l7m0Var = pz40VarY;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        nek nekVar = vbn.n2;
                        ((ir8) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                            int iHashCode = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM = fetVar2.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
                            mkd.c0.getClass();
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(e7z.u1);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, x5dVarA, gqw0.x);
                            jpm0.o(fetVar2, bh90VarM, gqw0.w);
                            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                            jpm0.n(fetVar2);
                            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                            mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
                            wul wulVar = ((zbn) l7m0Var.getValue()).c;
                            boolean zI3 = fetVar2.i(vbnVar2);
                            Object objP3 = fetVar2.P();
                            if (zI3 || objP3 == cl5Var) {
                                objP3 = new sbn(vbnVar2, b4);
                                fetVar2.o0(objP3);
                            }
                            qzb.n(mm40VarK, wulVar, (Function0) objP3, fetVar2, 0, 0);
                            fetVar2.r(true);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        nek nekVar2 = vbn.n2;
                        ((y5d) obj2).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
                            mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA, fetVar3), null);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarL = s5x0.L(mm40VarV, 4.0f, 0.0f, 2);
                            lh80 lh80VarT = s5x0.t(0.0f, 16.0f, 1);
                            boolean zG = fetVar3.g(l7m0Var) | fetVar3.i(vbnVar2);
                            Object objP4 = fetVar3.P();
                            if (zG || objP4 == cl5Var) {
                                objP4 = new dpl((Object) l7m0Var, (Object) vbnVar2, (byte) 25);
                                fetVar3.o0(objP4);
                            }
                            b8k0.e(mm40VarL, xczVarA, lh80VarT, null, null, null, false, null, (Function1) objP4, fetVar3, 0, Response.SERVER_TIMEOUT);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), u1c.M(-1744823637, new xdr() { // from class: a.rbn
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b3 = b;
                cl5 cl5Var = ukd.f35823a;
                jm40 jm40Var = jm40.b;
                byte b4 = 2;
                vbn vbnVar2 = vbnVar;
                l7m0 l7m0Var = pz40VarY;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        nek nekVar = vbn.n2;
                        ((ir8) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                            int iHashCode = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM = fetVar2.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
                            mkd.c0.getClass();
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(e7z.u1);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, x5dVarA, gqw0.x);
                            jpm0.o(fetVar2, bh90VarM, gqw0.w);
                            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                            jpm0.n(fetVar2);
                            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                            mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
                            wul wulVar = ((zbn) l7m0Var.getValue()).c;
                            boolean zI3 = fetVar2.i(vbnVar2);
                            Object objP3 = fetVar2.P();
                            if (zI3 || objP3 == cl5Var) {
                                objP3 = new sbn(vbnVar2, b4);
                                fetVar2.o0(objP3);
                            }
                            qzb.n(mm40VarK, wulVar, (Function0) objP3, fetVar2, 0, 0);
                            fetVar2.r(true);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        nek nekVar2 = vbn.n2;
                        ((y5d) obj2).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
                            mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA, fetVar3), null);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarL = s5x0.L(mm40VarV, 4.0f, 0.0f, 2);
                            lh80 lh80VarT = s5x0.t(0.0f, 16.0f, 1);
                            boolean zG = fetVar3.g(l7m0Var) | fetVar3.i(vbnVar2);
                            Object objP4 = fetVar3.P();
                            if (zG || objP4 == cl5Var) {
                                objP4 = new dpl((Object) l7m0Var, (Object) vbnVar2, (byte) 25);
                                fetVar3.o0(objP4);
                            }
                            b8k0.e(mm40VarL, xczVarA, lh80VarT, null, null, null, false, null, (Function1) objP4, fetVar3, 0, Response.SERVER_TIMEOUT);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), 2);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(xdn.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof xdn)) {
                ze3Var = null;
            }
            xdn xdnVar = (xdn) ze3Var;
            if (xdnVar != null) {
                androidx.fragment.app.e eVarF = F();
                while (eVarF != null) {
                    for (int iP = eVarF.P() - 1; iP >= 0; iP--) {
                        Fragment fragmentJ = eVarF.J(eVarF.O(iP).i);
                        if (fragmentJ instanceof ka9) {
                            ioi ioiVarH0 = ((ka9) fragmentJ).H0();
                            androidx.fragment.app.e eVarF2 = F();
                            while (eVarF2 != null) {
                                for (int iP2 = eVarF2.P() - 1; iP2 >= 0; iP2--) {
                                    i0h0 i0h0VarJ = eVarF2.J(eVarF2.O(iP2).i);
                                    if (i0h0VarJ instanceof ocl0) {
                                        pcl0 pcl0VarU = ((ocl0) i0h0VarJ).u(new sbn(this, (byte) 0));
                                        wdn wdnVar = (wdn) this.l2.n(this, o2[0]);
                                        pcl0VarU.getClass();
                                        cad cadVar = xdnVar.f40702a;
                                        ctf0 ctf0Var = xdnVar.b;
                                        ctf0Var.getClass();
                                        esg0 esg0Var = new esg0();
                                        esg0Var.f8326a = cadVar;
                                        esg0Var.b = ctf0Var;
                                        esg0Var.c = wdnVar;
                                        esg0Var.d = ioiVarH0;
                                        esg0Var.e = pcl0VarU;
                                        esg0Var.f = new yei(esg0Var, (byte) 16);
                                        this.k2 = new fiu0(Collections.singletonMap(ccn.class, (yei) esg0Var.f));
                                        return;
                                    }
                                }
                                Fragment fragment = this.y;
                                eVarF2 = fragment != null ? fragment.F() : null;
                            }
                            jf4.n("Can't find feature provider!");
                            return;
                        }
                    }
                    Fragment fragment2 = this.y;
                    eVarF = fragment2 != null ? fragment2.F() : null;
                }
                jf4.n("Can't find feature provider!");
                return;
            }
        }
        jf4.n(b1j.i(xdn.class, "Cannot create dependency "));
    }
}
