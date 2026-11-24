package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.api.presentation.models.GameVideoUiConfig;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cbr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4073a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cbr(l1z l1zVar, Function1 function1, Function1 function2, Function0 function0, int i) {
        this.f4073a = (byte) 14;
        this.b = l1zVar;
        this.e = function1;
        this.c = function2;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4073a;
        byte b2 = 2;
        final byte b3 = 0;
        final byte b4 = 1;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                oja0.x((mm40) obj6, (hdz) obj5, (l4b) obj4, (Function1) obj3, (fet) obj, x8x.L(65));
                return Unit.f46060a;
            case 1:
                mm40 mm40Var = (mm40) obj6;
                final trr trrVar = (trr) obj5;
                final Function2 function2 = (Function2) obj4;
                y5d y5dVar = (y5d) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarK0 = q8a.k0(mm40Var, enx.b);
                    zcl zclVar = qmk.f28987a;
                    vzb.n(s5x0.L(mm40VarK0, 0.0f, 8.0f, 1), q3d.j(u1c.M(1181417048, new xdr() { // from class: a.drr
                        @Override // a.xdr
                        public final Object F(Object obj7, Object obj8, Object obj9) {
                            byte b5 = b3;
                            Function2 function3 = function2;
                            trr trrVar2 = trrVar;
                            mm40 mm40Var2 = (mm40) obj7;
                            fet fetVar2 = (fet) obj8;
                            int iIntValue2 = ((Integer) obj9).intValue();
                            switch (b5) {
                                case 0:
                                    mm40Var2.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= fetVar2.g(mm40Var2) ? 4 : 2;
                                    }
                                    if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        fem0.c(mm40Var2, trrVar2.b, u1c.M(-636638437, new naa(function3, (byte) 7), fetVar2), fetVar2, (iIntValue2 & 14) | 24576);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    mm40Var2.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= fetVar2.g(mm40Var2) ? 4 : 2;
                                    }
                                    if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        fem0.c(mm40Var2, trrVar2.c, u1c.M(-1332017379, new naa(function3, (byte) 8), fetVar2), fetVar2, (iIntValue2 & 14) | 24576);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), u1c.M(-1313756071, new rgh(y5dVar, trrVar, (byte) 18), fetVar), u1c.M(486038106, new xdr() { // from class: a.drr
                        @Override // a.xdr
                        public final Object F(Object obj7, Object obj8, Object obj9) {
                            byte b5 = b4;
                            Function2 function3 = function2;
                            trr trrVar2 = trrVar;
                            mm40 mm40Var2 = (mm40) obj7;
                            fet fetVar2 = (fet) obj8;
                            int iIntValue2 = ((Integer) obj9).intValue();
                            switch (b5) {
                                case 0:
                                    mm40Var2.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= fetVar2.g(mm40Var2) ? 4 : 2;
                                    }
                                    if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        fem0.c(mm40Var2, trrVar2.b, u1c.M(-636638437, new naa(function3, (byte) 7), fetVar2), fetVar2, (iIntValue2 & 14) | 24576);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    mm40Var2.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= fetVar2.g(mm40Var2) ? 4 : 2;
                                    }
                                    if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        fem0.c(mm40Var2, trrVar2.c, u1c.M(-1332017379, new naa(function3, (byte) 8), fetVar2), fetVar2, (iIntValue2 & 14) | 24576);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar)), fetVar);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                xvm0 xvm0Var = (xvm0) obj6;
                r7s r7sVarA = r7s.a((r7s) obj2, 0L, null, null, false, 0L, xvm0Var.getId(), null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, xvm0Var, (js20) obj5, (Long) obj4, null, null, null, null, null, null, false, -33, 1044991);
                vzg0 vzg0Var = ((g9s) obj3).o;
                vzg0Var.e("KEY_SUB_GAME_ID", Long.valueOf(r7sVarA.f));
                vzg0Var.e("KEY_CATEGORY_ID", r7sVarA.R);
                return r7sVarA;
            case 3:
                xvm0 xvm0Var2 = (xvm0) obj6;
                njs njsVarA = njs.a((njs) obj2, 0L, null, null, false, 0L, xvm0Var2.getId(), null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, xvm0Var2, (js20) obj5, (Long) obj4, null, null, null, null, null, null, -33, 65087);
                vzg0 vzg0Var2 = ((yks) obj3).o;
                vzg0Var2.e("KEY_SUB_GAME_ID", Long.valueOf(njsVarA.f));
                vzg0Var2.e("KEY_CATEGORY_ID", njsVarA.O);
                return njsVarA;
            case 4:
                ((Integer) obj2).getClass();
                ((nek) obj5).e((mm40) obj6, (GameBroadcastingParams) obj4, (GameVideoUiConfig) obj3, (fet) obj, x8x.L(71));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                fxb.s((hrv) obj6, (qdz) obj5, (Function0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                agc.y((mm40) obj6, (w2d) obj5, (ugd) obj4, (ugd) obj3, (fet) obj, x8x.L(3521));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                v3c.x((mm40) obj6, (mjw) obj5, (pz40) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                obc.A((mm40) obj6, (fpw) obj5, (Function1) obj3, (ugd) obj4, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                r8x.y((kn5) obj6, (wul) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                e9x.v((rx6) obj6, (wul) obj5, (Function1) obj3, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                e9x.A((nn5) obj6, (wul) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                saj.x((mm40) obj6, (h72) obj5, (qdz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                a4x a4xVar = (a4x) obj6;
                xk80 xk80Var = (xk80) obj5;
                vne vneVar = (vne) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(o7k0.w(jm40.b, null, false, 3), 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD, 12.0f, 4.0f, 12.0f, 0.0f, 8);
                    boolean zG = fetVar2.g(xk80Var);
                    Object objP = fetVar2.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new s39(xk80Var, (byte) 10);
                        fetVar2.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zI = fetVar2.i(vneVar) | fetVar2.g(function1) | fetVar2.g(xk80Var);
                    Object objP2 = fetVar2.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new bwh(vneVar, function1, xk80Var, b2);
                        fetVar2.o0(objP2);
                    }
                    ibc.n(mm40VarN, a4xVar, gxh0.f12078a, axh0.f1625a, false, function0, (Function1) objP2, fetVar2, 3504, 16);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                ntr.F((l1z) obj6, (Function1) obj3, (Function1) obj5, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                t9x.f((Function0) obj5, (mm40) obj6, (tbz) obj4, (ibz) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                unh0.H((mm40) obj6, (String) obj5, (d4d) obj4, (d4d) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                fww.d((mm40) obj6, (oea0) obj5, (l7m0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                phu0.s((g2v) obj6, (qdz) obj5, (b310) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                c3x.d((mm40) obj6, (tr10) obj5, (Function1) obj3, (ugd) obj4, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 20:
                ln20 ln20Var = (ln20) obj6;
                List list = (List) obj5;
                txu txuVar = (txu) obj4;
                String str = (String) obj3;
                sg20 sg20Var = (sg20) obj2;
                qvj0 qvj0Var = sg20Var.e;
                jwo0 jwo0VarA = jwo0.a(qvj0Var.c, ln20Var.M.c().f24244a || !list.isEmpty(), false, txuVar.i, list, 6);
                String strP = ln20Var.P();
                str.getClass();
                return sg20.a(sg20Var, null, null, null, qvj0.a(qvj0Var, null, new lnb0(true, strP, str), jwo0VarA, null, 25), null, false, ((ovo0) ln20Var.a0.f27815a).f25934a || !list.isEmpty(), false, 0, 1775);
            case 21:
                nn20 nn20Var = (nn20) obj6;
                List list2 = (List) obj5;
                txu txuVar2 = (txu) obj4;
                String str2 = (String) obj3;
                b820 b820Var = (b820) obj2;
                rvj0 rvj0Var = b820Var.d;
                kwo0 kwo0VarA = kwo0.a(rvj0Var.c, nn20Var.y.c().f24244a || !list2.isEmpty(), false, txuVar2.i, list2, 20);
                String strH0 = nn20Var.h0(b820Var.d.f31171a.b.p);
                str2.getClass();
                return b820.a(b820Var, null, null, null, rvj0.a(rvj0Var, null, new mnb0(true, strH0, str2), kwo0VarA, null, null, 25), null, null, null, false, false, false, ((ovo0) nn20Var.H0.f27815a).f25934a || !list2.isEmpty(), false, 7159);
            case 22:
                on20 on20Var = (on20) obj6;
                List list3 = (List) obj5;
                txu txuVar3 = (txu) obj4;
                String str3 = (String) obj3;
                a820 a820Var = (a820) obj2;
                pvj0 pvj0Var = a820Var.e;
                return a820.a(a820Var, null, null, null, pvj0.a(pvj0Var, null, knb0.a(on20Var.h0(pvj0Var.f27665a.b.p, Double.valueOf(txuVar3.g.b)), str3, on20Var.r0()), iwo0.a(pvj0Var.c, on20Var.u.c().f24244a || !list3.isEmpty(), false, txuVar3.i, list3, 20), null, null, false, 57), null, null, null, false, null, 0.0f, false, null, 0, false, ((ovo0) on20Var.X0.f27815a).f25934a || !list3.isEmpty(), false, 229359);
            case 23:
                ((Integer) obj2).getClass();
                zdx.f((mm40) obj6, (xdr) obj5, (ugd) obj4, (xdr) obj3, (fet) obj, x8x.L(3505));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                q0x.l((mm40) obj6, (xf30) obj5, (Function1) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                s0x.l((mm40) obj6, (zf30) obj5, (Function1) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                j47.a0((mm40) obj6, (i72) obj5, (qdz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                rq8.p((mm40) obj6, (j72) obj5, (qdz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                p8a.z((mm40) obj6, (String) obj5, (String) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                u7x.f((mm40) obj6, (xcz) obj5, (or90) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ cbr(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f4073a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ cbr(Object obj, mm40 mm40Var, Object obj2, Object obj3, int i, byte b) {
        this.f4073a = b;
        this.c = obj;
        this.b = mm40Var;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ cbr(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f4073a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ cbr(Object obj, Object obj2, Function1 function1, wdr wdrVar, int i, byte b) {
        this.f4073a = b;
        this.b = obj;
        this.c = obj2;
        this.e = function1;
        this.d = wdrVar;
    }
}
