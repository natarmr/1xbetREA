package a;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/xnb;", "La/iw5;", "<init>", "()V", "a/kj5", "La/dob;", "balanceEventFlow", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xnb extends iw5 {
    public final yzn0 k2 = new yzn0("BALANCE_TYPE");
    public final phf0 l2 = new phf0("DIALOG_TEXT");
    public final phf0 m2 = new phf0("TITLE");
    public final phf0 n2 = new phf0("SUBTITLE");
    public final cgx0 o2 = new cgx0("SHOW_BONUS_ACCOUNTS");
    public final phf0 p2 = new phf0("REQUEST_KEY");
    public final cgx0 q2 = new cgx0("ENABLE_GAME_BONUS");
    public final cgx0 r2 = new cgx0("CAN_ADD_ACCOUNTS");
    public final cgx0 s2 = new cgx0("UPDATE_BALANCE");
    public fiu0 t2;
    public ctf0 u2;
    public final kiu0 v2;
    public static final /* synthetic */ iiy[] x2 = {new ez40(xnb.class, "balanceScreenType", "getBalanceScreenType()Lorg/xplatform/balance/model/BalanceScreenType;", 0), new ez40(xnb.class, ParameterNames.TEXT, "getText()Ljava/lang/String;", 0), new ez40(xnb.class, "dialogTitle", "getDialogTitle()Ljava/lang/String;", 0), new ez40(xnb.class, "dialogSubtitle", "getDialogSubtitle()Ljava/lang/String;", 0), new ez40(xnb.class, "showBonusAccounts", "getShowBonusAccounts()Z", 0), new ez40(xnb.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(xnb.class, "enableGameBonus", "getEnableGameBonus()Z", 0), new ez40(xnb.class, "canAddAccounts", "getCanAddAccounts()Z", 0), new ez40(xnb.class, "updateBalance", "getUpdateBalance()Z", 0)};
    public static final kj5 w2 = new kj5();

    public xnb() {
        byte b = 4;
        this.v2 = agc.G(this, sre0.f32672a.b(gob.class), new sz2(new sz2(this, b), (byte) 5), new snb(this, b), new snb(this, (byte) 3));
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-2030421802);
        final byte b = 0;
        final pz40 pz40VarQ = gkb.Q(S0().u, null, fetVar, 0, 7);
        final byte b2 = 1;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), (xdr) null, u1c.M(-1841608313, new xdr(this) { // from class: a.unb
            public final /* synthetic */ xnb b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                xx7 xx7Var;
                int i;
                byte b3 = b;
                jm40 jm40Var = jm40.b;
                l7m0 l7m0Var = pz40VarQ;
                switch (b3) {
                    case 0:
                        xnb xnbVar = this.b;
                        phf0 phf0Var = xnbVar.n2;
                        y5d y5dVar = (y5d) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kj5 kj5Var = xnb.w2;
                        xx7 xx7Var2 = gqw0.n;
                        y5dVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar2.U(1 & iIntValue, (iIntValue & 19) != 18)) {
                            if (((dob) l7m0Var.getValue()) instanceof bob) {
                                xx7Var = xx7Var2;
                                i = 2;
                                fetVar2.e0(559485499);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(559093411);
                                mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), xx7Var2);
                                zcl zclVar = qmk.f28987a;
                                mm40 mm40VarN = s5x0.N(mm40VarA, 0.0f, 28.0f, 0.0f, 8.0f, 5);
                                ctf0 ctf0Var = xnbVar.u2;
                                if (ctf0Var == null) {
                                    Intrinsics.h("resourceManager");
                                    throw null;
                                }
                                xx7Var = xx7Var2;
                                wwb.i(mm40VarN, ctf0Var.b.a(R.string.select_acc_new, Arrays.copyOf(new Object[0], 0)), 0L, 0, 0L, fetVar2, 0, 28);
                                fetVar2 = fetVar2;
                                fetVar2.r(false);
                                i = 2;
                            }
                            iiy[] iiyVarArr = xnb.x2;
                            if (phf0Var.n(xnbVar, iiyVarArr[3]).length() <= 0 || (((dob) l7m0Var.getValue()) instanceof aob)) {
                                fetVar2.e0(560041019);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(559641243);
                                mm40 mm40VarA2 = y5dVar.a(o7k0.d(jm40Var, 1.0f), xx7Var);
                                zcl zclVar2 = qmk.f28987a;
                                fet fetVar3 = fetVar2;
                                kkb.m(s5x0.L(mm40VarA2, 16.0f, 0.0f, i), phf0Var.n(xnbVar, iiyVarArr[3]), null, 3, 0L, 0L, fetVar3, 0, 52);
                                fetVar3.r(false);
                            }
                        } else {
                            fetVar2.X();
                        }
                        return Unit.f46060a;
                    default:
                        fet fetVar4 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        kj5 kj5Var2 = xnb.w2;
                        ((y5d) obj).getClass();
                        if (fetVar4.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                            dob dobVar = (dob) l7m0Var.getValue();
                            if (dobVar != null) {
                                if (dobVar instanceof bob) {
                                    fetVar4.e0(843106322);
                                    sj3.m(0, 0L, fetVar4, null);
                                    fetVar4.r(false);
                                } else {
                                    boolean z = dobVar instanceof cob;
                                    xnb xnbVar2 = this.b;
                                    cl5 cl5Var = ukd.f35823a;
                                    if (z) {
                                        fetVar4.e0(843266964);
                                        cob cobVar = (cob) dobVar;
                                        boolean z2 = cobVar.d;
                                        gob gobVarS0 = xnbVar2.S0();
                                        boolean zI = fetVar4.i(gobVarS0);
                                        Object objP = fetVar4.P();
                                        if (zI || objP == cl5Var) {
                                            pw4 pw4Var = new pw4(0, gobVarS0, gob.class, "openPaymentActivityClick", "openPaymentActivityClick()V", 0, (byte) 15);
                                            fetVar4.o0(pw4Var);
                                            objP = pw4Var;
                                        }
                                        Function0 function0 = (Function0) ((jhy) objP);
                                        gob gobVarS1 = xnbVar2.S0();
                                        boolean zI2 = fetVar4.i(gobVarS1);
                                        Object objP2 = fetVar4.P();
                                        if (zI2 || objP2 == cl5Var) {
                                            pw4 pw4Var2 = new pw4(0, gobVarS1, gob.class, "addAccountClick", "addAccountClick()V", 0, (byte) 16);
                                            fetVar4.o0(pw4Var2);
                                            objP2 = pw4Var2;
                                        }
                                        xnbVar2.P0(null, z2, function0, (Function0) ((jhy) objP2), fetVar4, 0);
                                        xnbVar2.Q0(cobVar, fetVar4, 8);
                                        fetVar4.r(false);
                                    } else if (dobVar instanceof aob) {
                                        fetVar4.e0(843710729);
                                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                        boolean zI3 = fetVar4.i(dobVar) | fetVar4.i(xnbVar2);
                                        Object objP3 = fetVar4.P();
                                        if (zI3 || objP3 == cl5Var) {
                                            objP3 = new op7(dobVar, xnbVar2, (byte) 26);
                                            fetVar4.o0(objP3);
                                        }
                                        b8k0.e(mm40VarD, null, null, null, null, null, false, null, (Function1) objP3, fetVar4, 6, 510);
                                        fetVar4.r(false);
                                    }
                                }
                            }
                            throw b1j.f(2105404620, fetVar4, false);
                        }
                        fetVar4.X();
                        return Unit.f46060a;
                }
            }
        }, fetVar), (xdr) null, u1c.M(458056261, new xdr(this) { // from class: a.unb
            public final /* synthetic */ xnb b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                xx7 xx7Var;
                int i;
                byte b3 = b2;
                jm40 jm40Var = jm40.b;
                l7m0 l7m0Var = pz40VarQ;
                switch (b3) {
                    case 0:
                        xnb xnbVar = this.b;
                        phf0 phf0Var = xnbVar.n2;
                        y5d y5dVar = (y5d) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kj5 kj5Var = xnb.w2;
                        xx7 xx7Var2 = gqw0.n;
                        y5dVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar2.U(1 & iIntValue, (iIntValue & 19) != 18)) {
                            if (((dob) l7m0Var.getValue()) instanceof bob) {
                                xx7Var = xx7Var2;
                                i = 2;
                                fetVar2.e0(559485499);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(559093411);
                                mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), xx7Var2);
                                zcl zclVar = qmk.f28987a;
                                mm40 mm40VarN = s5x0.N(mm40VarA, 0.0f, 28.0f, 0.0f, 8.0f, 5);
                                ctf0 ctf0Var = xnbVar.u2;
                                if (ctf0Var == null) {
                                    Intrinsics.h("resourceManager");
                                    throw null;
                                }
                                xx7Var = xx7Var2;
                                wwb.i(mm40VarN, ctf0Var.b.a(R.string.select_acc_new, Arrays.copyOf(new Object[0], 0)), 0L, 0, 0L, fetVar2, 0, 28);
                                fetVar2 = fetVar2;
                                fetVar2.r(false);
                                i = 2;
                            }
                            iiy[] iiyVarArr = xnb.x2;
                            if (phf0Var.n(xnbVar, iiyVarArr[3]).length() <= 0 || (((dob) l7m0Var.getValue()) instanceof aob)) {
                                fetVar2.e0(560041019);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(559641243);
                                mm40 mm40VarA2 = y5dVar.a(o7k0.d(jm40Var, 1.0f), xx7Var);
                                zcl zclVar2 = qmk.f28987a;
                                fet fetVar3 = fetVar2;
                                kkb.m(s5x0.L(mm40VarA2, 16.0f, 0.0f, i), phf0Var.n(xnbVar, iiyVarArr[3]), null, 3, 0L, 0L, fetVar3, 0, 52);
                                fetVar3.r(false);
                            }
                        } else {
                            fetVar2.X();
                        }
                        return Unit.f46060a;
                    default:
                        fet fetVar4 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        kj5 kj5Var2 = xnb.w2;
                        ((y5d) obj).getClass();
                        if (fetVar4.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                            dob dobVar = (dob) l7m0Var.getValue();
                            if (dobVar != null) {
                                if (dobVar instanceof bob) {
                                    fetVar4.e0(843106322);
                                    sj3.m(0, 0L, fetVar4, null);
                                    fetVar4.r(false);
                                } else {
                                    boolean z = dobVar instanceof cob;
                                    xnb xnbVar2 = this.b;
                                    cl5 cl5Var = ukd.f35823a;
                                    if (z) {
                                        fetVar4.e0(843266964);
                                        cob cobVar = (cob) dobVar;
                                        boolean z2 = cobVar.d;
                                        gob gobVarS0 = xnbVar2.S0();
                                        boolean zI = fetVar4.i(gobVarS0);
                                        Object objP = fetVar4.P();
                                        if (zI || objP == cl5Var) {
                                            pw4 pw4Var = new pw4(0, gobVarS0, gob.class, "openPaymentActivityClick", "openPaymentActivityClick()V", 0, (byte) 15);
                                            fetVar4.o0(pw4Var);
                                            objP = pw4Var;
                                        }
                                        Function0 function0 = (Function0) ((jhy) objP);
                                        gob gobVarS1 = xnbVar2.S0();
                                        boolean zI2 = fetVar4.i(gobVarS1);
                                        Object objP2 = fetVar4.P();
                                        if (zI2 || objP2 == cl5Var) {
                                            pw4 pw4Var2 = new pw4(0, gobVarS1, gob.class, "addAccountClick", "addAccountClick()V", 0, (byte) 16);
                                            fetVar4.o0(pw4Var2);
                                            objP2 = pw4Var2;
                                        }
                                        xnbVar2.P0(null, z2, function0, (Function0) ((jhy) objP2), fetVar4, 0);
                                        xnbVar2.Q0(cobVar, fetVar4, 8);
                                        fetVar4.r(false);
                                    } else if (dobVar instanceof aob) {
                                        fetVar4.e0(843710729);
                                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                        boolean zI3 = fetVar4.i(dobVar) | fetVar4.i(xnbVar2);
                                        Object objP3 = fetVar4.P();
                                        if (zI3 || objP3 == cl5Var) {
                                            objP3 = new op7(dobVar, xnbVar2, (byte) 26);
                                            fetVar4.o0(objP3);
                                        }
                                        b8k0.e(mm40VarD, null, null, null, null, null, false, null, (Function1) objP3, fetVar4, 6, 510);
                                        fetVar4.r(false);
                                    }
                                }
                            }
                            throw b1j.f(2105404620, fetVar4, false);
                        }
                        fetVar4.X();
                        return Unit.f46060a;
                }
            }
        }, fetVar));
        fetVar.r(false);
        return bw5Var;
    }

    public final void P0(mm40 mm40Var, boolean z, final Function0 function0, final Function0 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1073481410);
        int i2 = i | 6 | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(this) ? 16384 : 8192);
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new snb(this, b);
                fetVar.o0(objP);
            }
            final Function0 function2 = (Function0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new snb(this, b2);
                fetVar.o0(objP2);
            }
            final Function0 function3 = (Function0) objP2;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String strH = H(R.string.refill_account);
            strH.getClass();
            boolean z2 = (i2 & 896) == 256;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                final byte b3 = 0;
                objP3 = new Function0() { // from class: a.tnb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b3;
                        Function0 function4 = function0;
                        Function0 function5 = function2;
                        switch (b4) {
                            case 0:
                                kj5 kj5Var = xnb.w2;
                                function5.invoke();
                                function4.invoke();
                                break;
                            default:
                                kj5 kj5Var2 = xnb.w2;
                                function5.invoke();
                                function4.invoke();
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP3);
            }
            mm40Var2 = jm40Var;
            xia0.g(null, strH, R.drawable.ic_glyph_replenish_balance, (Function0) objP3, fetVar, 0);
            if (z) {
                fetVar.e0(-1718996693);
                String strH2 = H(R.string.add_wallet_title);
                strH2.getClass();
                boolean z3 = (i2 & 7168) == 2048;
                Object objP4 = fetVar.P();
                if (z3 || objP4 == cl5Var) {
                    final byte b4 = 1;
                    objP4 = new Function0() { // from class: a.tnb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = b4;
                            Function0 function4 = function1;
                            Function0 function5 = function3;
                            switch (b5) {
                                case 0:
                                    kj5 kj5Var = xnb.w2;
                                    function5.invoke();
                                    function4.invoke();
                                    break;
                                default:
                                    kj5 kj5Var2 = xnb.w2;
                                    function5.invoke();
                                    function4.invoke();
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP4);
                }
                xia0.g(null, strH2, R.drawable.ic_glyph_replenish_account_small_balance, (Function0) objP4, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-1718664714);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0(this, mm40Var2, z, function0, function1, i);
        }
    }

    public final void Q0(cob cobVar, fet fetVar, int i) {
        fetVar.g0(-240923073);
        byte b = 16;
        int i2 = (fetVar.i(cobVar) ? 4 : 2) | i | (fetVar.i(this) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new lya(this, (byte) 9);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            mm40 mm40VarS = o050.S(o2e.e0(jm40.b, "BalanceScreenLazyListNew"));
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(4.0f, 0.0f, 4.0f, 8.0f, 2);
            boolean zI = fetVar.i(this) | ((i2 & 14) == 4 || fetVar.i(cobVar));
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new sw8((Object) cobVar, (Object) this, (Object) function1, (byte) 3);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarS, null, lh80VarU, null, null, null, false, null, (Function1) objP2, fetVar, 0, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(this, cobVar, i, b);
        }
    }

    public final String R0() {
        return this.p2.n(this, x2[5]);
    }

    public final gob S0() {
        return (gob) this.v2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(rnb.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            rnb rnbVar = (rnb) (ze3Var instanceof rnb ? ze3Var : null);
            if (rnbVar != null) {
                iiy[] iiyVarArr = x2;
                Boolean boolN = this.s2.n(this, iiyVarArr[8]);
                bm5 bm5Var = (bm5) this.k2.n(this, iiyVarArr[0]);
                Boolean boolN2 = this.o2.n(this, iiyVarArr[4]);
                Boolean boolN3 = this.r2.n(this, iiyVarArr[7]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                g2v g2vVar = rnbVar.e;
                v88 v88Var = rnbVar.f30781a;
                wxs0 wxs0Var = rnbVar.f;
                wsf0 wsf0Var = rnbVar.d;
                ih5 ih5Var = rnbVar.b;
                zg zgVar = rnbVar.c;
                eqx eqxVar = rnbVar.g;
                l7k l7kVar = rnbVar.h;
                mne mneVar = rnbVar.i;
                ctf0 ctf0Var = rnbVar.j;
                cmt cmtVar = rnbVar.k;
                ctf0Var.getClass();
                this.t2 = new fiu0(Collections.singletonMap(gob.class, (pai) new h6i(wsf0Var, bm5Var, boolN, boolN2, boolN3, i1w0VarF, v88Var, wxs0Var, ih5Var, zgVar, g2vVar, eqxVar, mneVar, l7kVar, ctf0Var, cmtVar).c));
                this.u2 = ctf0Var;
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(rnb.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        n0().r().u0("ADD_BALANCE_KEY", K(), new gne(this, (byte) 26));
        L0().N(3);
        L0().K = true;
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        vcc.f0(i120.V(new Pair("RESULT_ON_DISMISS_KEY", "")), this, R0());
        super.onDismiss(dialogInterface);
    }
}
