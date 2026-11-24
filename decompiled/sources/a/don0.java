package a;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.swipex.impl.presentation.dialogs.confirmation.models.SwipeActionConfirmationParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/don0;", "La/iw5;", "<init>", "()V", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class don0 extends iw5 {
    public final khf0 k2 = new khf0("BUNDLE_KEY_BOTTOM_SHEET_PARAMS");
    public final a8z l2 = maz.a(wez.b, new con0(this, (byte) 0));
    public final a8z m2 = xbc.a0(this, sre0.f32672a.b(qon0.class), null, new con0(this, (byte) 1), 14);
    public static final /* synthetic */ iiy[] o2 = {new ez40(don0.class, "params", "getParams()Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;", 0)};
    public static final m6m0 n2 = new m6m0((byte) 7);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        clz clzVar;
        fetVar.e0(1600618627);
        final pz40 pz40VarY = ((i3t0) Q0()).y(fetVar);
        k3t0 k3t0VarQ0 = Q0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            objP = new j1l0(this, (byte) 26);
            fetVar.o0(objP);
        }
        clz clzVar2 = (clz) fetVar.k(or00.f25714a);
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
        boolean zI2 = fetVar.i(k3t0VarQ0) | fetVar.i(clzVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            clzVar = clzVar2;
            Object kc70Var = new kc70(k3t0VarQ0, clzVar, pz40VarF, null, (byte) 20);
            fetVar.o0(kc70Var);
            objP2 = kc70Var;
        } else {
            clzVar = clzVar2;
        }
        m0x0.t(fetVar, clzVar, (Function2) objP2);
        final byte b = 1;
        final byte b2 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-2059252044, new tft(pz40VarY, (byte) 23), fetVar), u1c.M(364512236, new xdr() { // from class: a.bon0
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b3 = b2;
                cl5 cl5Var = ukd.f35823a;
                l7m0 l7m0Var = pz40VarY;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        m6m0 m6m0Var = don0.n2;
                        ((ir8) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            vul vulVar = vul.f38053a;
                            wul wulVar = ((oon0) l7m0Var.getValue()).f;
                            wul wulVar2 = ((oon0) l7m0Var.getValue()).e;
                            don0 don0Var = this;
                            boolean zI3 = fetVar2.i(don0Var);
                            Object objP3 = fetVar2.P();
                            if (zI3 || objP3 == cl5Var) {
                                objP3 = new con0(don0Var, (byte) 2);
                                fetVar2.o0(objP3);
                            }
                            Function0 function0 = (Function0) objP3;
                            boolean zI4 = fetVar2.i(don0Var);
                            Object objP4 = fetVar2.P();
                            if (zI4 || objP4 == cl5Var) {
                                objP4 = new con0(don0Var, (byte) 3);
                                fetVar2.o0(objP4);
                            }
                            gkb.i(null, vulVar, wulVar, wulVar2, 0L, function0, (Function0) objP4, fetVar2, 48, 17);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        m6m0 m6m0Var2 = don0.n2;
                        ((y5d) obj2).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            zcl zclVar = qmk.f28987a;
                            wvb.o(null, 4.0f, 0L, fetVar3, 0, 5);
                            kkb.m(null, ((oon0) l7m0Var.getValue()).b, null, 0, 0L, 0L, fetVar3, 0, 61);
                            wvb.o(null, 8.0f, 0L, fetVar3, 0, 5);
                            String str = ((oon0) l7m0Var.getValue()).c;
                            yvl yvlVar = ((oon0) l7m0Var.getValue()).d;
                            don0 don0Var2 = this;
                            boolean zI5 = fetVar3.i(don0Var2);
                            Object objP5 = fetVar3.P();
                            if (zI5 || objP5 == cl5Var) {
                                objP5 = new con0(don0Var2, (byte) 4);
                                fetVar3.o0(objP5);
                            }
                            don0Var2.P0(str, yvlVar, (Function0) objP5, fetVar3, 0);
                            wvb.o(null, 12.0f, 0L, fetVar3, 0, 5);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), u1c.M(-2116117390, new xdr() { // from class: a.bon0
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b3 = b;
                cl5 cl5Var = ukd.f35823a;
                l7m0 l7m0Var = pz40VarY;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        m6m0 m6m0Var = don0.n2;
                        ((ir8) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            vul vulVar = vul.f38053a;
                            wul wulVar = ((oon0) l7m0Var.getValue()).f;
                            wul wulVar2 = ((oon0) l7m0Var.getValue()).e;
                            don0 don0Var = this;
                            boolean zI3 = fetVar2.i(don0Var);
                            Object objP3 = fetVar2.P();
                            if (zI3 || objP3 == cl5Var) {
                                objP3 = new con0(don0Var, (byte) 2);
                                fetVar2.o0(objP3);
                            }
                            Function0 function0 = (Function0) objP3;
                            boolean zI4 = fetVar2.i(don0Var);
                            Object objP4 = fetVar2.P();
                            if (zI4 || objP4 == cl5Var) {
                                objP4 = new con0(don0Var, (byte) 3);
                                fetVar2.o0(objP4);
                            }
                            gkb.i(null, vulVar, wulVar, wulVar2, 0L, function0, (Function0) objP4, fetVar2, 48, 17);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        m6m0 m6m0Var2 = don0.n2;
                        ((y5d) obj2).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            zcl zclVar = qmk.f28987a;
                            wvb.o(null, 4.0f, 0L, fetVar3, 0, 5);
                            kkb.m(null, ((oon0) l7m0Var.getValue()).b, null, 0, 0L, 0L, fetVar3, 0, 61);
                            wvb.o(null, 8.0f, 0L, fetVar3, 0, 5);
                            String str = ((oon0) l7m0Var.getValue()).c;
                            yvl yvlVar = ((oon0) l7m0Var.getValue()).d;
                            don0 don0Var2 = this;
                            boolean zI5 = fetVar3.i(don0Var2);
                            Object objP5 = fetVar3.P();
                            if (zI5 || objP5 == cl5Var) {
                                objP5 = new con0(don0Var2, (byte) 4);
                                fetVar3.o0(objP5);
                            }
                            don0Var2.P0(str, yvlVar, (Function0) objP5, fetVar3, 0);
                            wvb.o(null, 12.0f, 0L, fetVar3, 0, 5);
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

    public final void P0(String str, yvl yvlVar, Function0 function0, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-217088679);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(yvlVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = y860.W(s5x0.L(o7k0.g(mm40VarD, 40.0f, 0.0f, 2), 16.0f, 0.0f, 2), null, null, false, null, function0, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            fetVar2.b0(982865387, yvlVar.f43325a);
            nia0.v(null, yvlVar, function0, fetVar2, i2 & 1008, 1);
            fetVar2.r(false);
            x7z x7zVar = new x7z(1.0f, true);
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, x7zVar, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, i2 & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 8, i, this, str, yvlVar, function0);
        }
    }

    public final k3t0 Q0() {
        return (k3t0) this.m2.getValue();
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        Q0().x(fon0.f9891a);
        iiy[] iiyVarArr = o2;
        iiy iiyVar = iiyVarArr[0];
        khf0 khf0Var = this.k2;
        vcc.f0(i120.V(new Pair(((SwipeActionConfirmationParams) khf0Var.n(this, iiyVarArr[0])).b, Boolean.FALSE)), this, ((SwipeActionConfirmationParams) khf0Var.n(this, iiyVar)).f47116a);
    }
}
