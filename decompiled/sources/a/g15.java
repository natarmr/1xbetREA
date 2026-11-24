package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g15 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10493a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ g15(String str, String str2, mm40 mm40Var, int i) {
        this.f10493a = (byte) 4;
        this.c = str;
        this.d = str2;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar;
        String str;
        String str2;
        long j;
        Object next;
        byte b = this.f10493a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        byte b2 = 2;
        String str3 = this.d;
        String str4 = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar2 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objP = fetVar2.P();
                    if (objP == cl5Var) {
                        objP = androidx.compose.runtime.e.e(new daq0(idm0.t(16)));
                        fetVar2.o0(objP);
                    }
                    pz40 pz40Var = (pz40) objP;
                    thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar2, 54);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    x7z x7zVar = new x7z(1.0f, false);
                    y9q0 y9q0VarT = ibm0.t(g1t0.j(), fetVar2);
                    n05 n05Var = new n05(qmk.q, qmk.s, qmk.n);
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = new we(pz40Var, (byte) 23);
                        fetVar2.o0(objP2);
                    }
                    aad.e(this.c, x7zVar, y9q0VarT, (Function1) objP2, 2, false, 1, 0, null, n05Var, fetVar2, 27648, Response.UNSUPPORTED_URI_SCHEME);
                    v8q0.a(this.d, s5x0.N(jm40.b, 2.0f, 0.0f, 0.0f, 0.0f, 14), 0L, null, ((daq0) pz40Var.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.t(g1t0.j(), fetVar2), fetVar2, 0, 24576, 114668);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                q8a.a(x8x.L(3079), (fet) obj, mm40Var, str4, str3);
                break;
            case 2:
                ((Integer) obj2).getClass();
                x8f.C(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ffb0.d(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                cwr0.g(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 5:
                ((Integer) obj2).getClass();
                rsr0.H(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 6:
                ((Integer) obj2).getClass();
                cwr0.B(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 7:
                ((Integer) obj2).getClass();
                d18.c(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 8:
                ((Integer) obj2).getClass();
                ac8.c(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 9:
                ((Integer) obj2).getClass();
                p8a.H(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 10:
                ((Integer) obj2).getClass();
                rsr0.y(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ro4.H(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 12:
                ((Integer) obj2).getClass();
                ieb.D(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 13:
                ((Integer) obj2).getClass();
                lmc.w(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 14:
                ((Integer) obj2).getClass();
                kkb.g(x8x.L(7), (fet) obj, mm40Var, str4, str3);
                break;
            case 15:
                ((Integer) obj2).getClass();
                kkb.F(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 16:
                ((Integer) obj2).getClass();
                feb.z(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 17:
                ((Integer) obj2).getClass();
                fbc.k(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 18:
                fet fetVar3 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.l, fetVar3, 48);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40Var);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    jm40 jm40Var = jm40.b;
                    String str5 = this.c;
                    String str6 = this.d;
                    if (str5 == null || str5.length() == 0) {
                        fetVar = fetVar3;
                        fetVar.e0(-361984773);
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        pz40 pz40Var2 = s6t0.f31722a;
                        v8q0.a(str6, mm40VarD, StaticColors.INSTANCE.m123getWhite0d7_KjU(), new n05(qmk.r, g1t0.o().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.o(), fetVar, 48, 24960, 110576);
                        fetVar.r(false);
                    } else {
                        fetVar3.e0(-361350730);
                        long j2 = qmk.r;
                        pz40 pz40Var3 = s6t0.f31722a;
                        long j3 = new y9q0(0L, qmk.A, null, j1t0.f15753a, 0L, null, 0, 0, qmk.L, 16646109).f42262a.b;
                        float fB = pkd.b(280.0f, fetVar3);
                        float fB2 = pkd.b(6.0f, fetVar3);
                        g9q0 g9q0VarN = pym0.n(fetVar3);
                        daq0 daq0Var = new daq0(j3);
                        Object objP3 = fetVar3.P();
                        if (objP3 == cl5Var) {
                            objP3 = new xjl(b2);
                            fetVar3.o0(objP3);
                        }
                        Sequence sequenceE = lgi0.e((Function1) objP3, daq0Var);
                        boolean zF = fetVar3.f(j2);
                        Object objP4 = fetVar3.P();
                        if (zF || objP4 == cl5Var) {
                            objP4 = new nme((byte) 11, j2);
                            fetVar3.o0(objP4);
                        }
                        Function1 function1 = (Function1) objP4;
                        sequenceE.getClass();
                        function1.getClass();
                        b5q b5qVar = new b5q(new tjt(sequenceE, function1));
                        while (true) {
                            if (b5qVar.hasNext()) {
                                next = b5qVar.next();
                                long j4 = ((daq0) next).f5764a;
                                pz40 pz40Var4 = s6t0.f31722a;
                                j = j2;
                                str2 = str6;
                                int i = (int) (g9q0.a(g9q0VarN, str6, y9q0.a(g1t0.o(), 0L, j4, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 0, 0L, null, 1020).c >> 32);
                                g9q0 g9q0Var = g9q0VarN;
                                String str7 = str5;
                                a9q0 a9q0VarA = g9q0.a(g9q0Var, str7, y9q0.a(g1t0.o(), 0L, j4, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 0, 0L, null, 1020);
                                str = str7;
                                g9q0VarN = g9q0Var;
                                if (i + ((int) (a9q0VarA.c >> 32)) + fB2 > fB) {
                                    str6 = str2;
                                    str5 = str;
                                    j2 = j;
                                }
                            } else {
                                str = str5;
                                str2 = str6;
                                j = j2;
                                next = null;
                            }
                        }
                        daq0 daq0Var2 = (daq0) next;
                        long j5 = daq0Var2 != null ? daq0Var2.f5764a : j;
                        x7z x7zVar2 = new x7z(1.0f, false);
                        pz40 pz40Var5 = s6t0.f31722a;
                        y9q0 y9q0VarO = g1t0.o();
                        StaticColors staticColors = StaticColors.INSTANCE;
                        v8q0.a(str2, x7zVar2, staticColors.m123getWhite0d7_KjU(), null, j5, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarO, fetVar3, 0, 24960, 110568);
                        zcl zclVar = qmk.f28987a;
                        v8q0.a(str, s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), staticColors.m123getWhite0d7_KjU(), null, j5, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.o(), fetVar3, 0, 24576, 114664);
                        fetVar = fetVar3;
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar3.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                saj.d(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 20:
                ((Integer) obj2).getClass();
                fxb.l(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 21:
                ((Integer) obj2).getClass();
                dyb.p(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 22:
                ((Integer) obj2).getClass();
                wzb.p(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 23:
                ((Integer) obj2).getClass();
                nam.b(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case 24:
                ((Integer) obj2).getClass();
                uzb.M(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                wzb.I(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                aac.w(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                ebc.I(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                bkb.p(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
            default:
                ((Integer) obj2).getClass();
                gkb.t(x8x.L(1), (fet) obj, mm40Var, str4, str3);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ g15(mm40 mm40Var, String str, String str2, int i, byte b) {
        this.f10493a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
    }

    public /* synthetic */ g15(mm40 mm40Var, String str, String str2, byte b) {
        this.f10493a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
    }
}
