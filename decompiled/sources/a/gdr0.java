package a;

import androidx.compose.ui.platform.AndroidComposeView;
import com.huawei.hms.api.ConnectionResult;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gdr0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11115a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gdr0(ftr ftrVar, Function1 function1, Function1 function2) {
        this.f11115a = (byte) 20;
        this.b = ftrVar;
        this.c = function1;
        this.d = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11115a;
        Object[] objArr = 0;
        byte b2 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                gq80.X((mm40) obj5, (llb0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                gq80.S((mm40) obj5, (sok0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                vsm0.g((mm40) obj5, (fak0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                wha0.E((mm40) obj5, (air0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                iym0.g((mm40) obj5, (nyq0) obj3, (ugd) obj4, (fet) obj, x8x.L(385));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ro4.W((mm40) obj5, (aur0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 6:
                mm40 mm40Var = (mm40) obj5;
                pwr0 pwr0Var = (pwr0) obj3;
                Function1 function1 = (Function1) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarK = rq8.K(o7k0.d(mm40Var, 1.0f), new t9r0((byte) 23));
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarK, 0.0f, 36.0f, 0.0f, 0.0f, 13);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    boolean z = fetVar.S;
                    pcy pcyVar = e7z.u1;
                    if (z) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar, tj30VarC, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar, numValueOf, shdVar3);
                    jpm0.n(fetVar);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC0, shdVar4);
                    mm40 mm40VarS = o050.S(jm40.b);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    hhm0.g(pwr0Var, function1, fetVar, 0);
                    hhm0.h(pwr0Var, fetVar, 0);
                    fetVar.r(true);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                rsm0.l((mm40) obj5, (cyr0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                zsm0.c((mm40) obj5, (lzr0) obj3, (Function1) obj4, (fet) obj, x8x.L(385));
                break;
            case 9:
                ((Integer) obj2).getClass();
                btm0.i((mm40) obj5, (o1s0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                iym0.h((mm40) obj5, (a4x) obj3, (zzr0) obj4, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                pym0.f((mm40) obj5, (y7s0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                yqm0.e((wks0) obj5, (Function0) obj3, (Function1) obj4, (fet) obj, x8x.L(433));
                break;
            case 13:
                ((Integer) obj2).getClass();
                u4n0.i((String) obj5, (wnq0) obj3, (String) obj4, (fet) obj, x8x.L(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                yqm0.f((mm40) obj5, (o6u0) obj3, (Function0) obj4, (fet) obj, x8x.L(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                lv00.P((mm40) obj5, (ggv0) obj3, (Function1) obj4, (fet) obj, x8x.L(7));
                break;
            case 16:
                yqv0 yqv0Var = (yqv0) obj5;
                skd skdVar = (skd) obj3;
                ugd ugdVar = (ugd) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AndroidComposeView androidComposeView = yqv0Var.f43094a;
                    boolean zI = fetVar2.i(yqv0Var);
                    Object objP = fetVar2.P();
                    yje yjeVar = null;
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        objP = new xqv0(yqv0Var, yjeVar, objArr == true ? 1 : 0);
                        fetVar2.o0(objP);
                    }
                    m0x0.t(fetVar2, androidComposeView, (Function2) objP);
                    boolean zI2 = fetVar2.i(yqv0Var);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new xqv0(yqv0Var, yjeVar, b2);
                        fetVar2.o0(objP2);
                    }
                    m0x0.t(fetVar2, androidComposeView, (Function2) objP2);
                    skdVar.a(androidComposeView, ugdVar, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                ((hsv0) obj3).a((mm40) obj5, (Set) obj4, (fet) obj, x8x.L(1));
                break;
            case 18:
                qtv0 qtv0Var = (qtv0) obj5;
                l7m0 l7m0Var = (l7m0) obj3;
                l7m0 l7m0Var2 = (l7m0) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    jtv0 jtv0Var = (jtv0) l7m0Var.getValue();
                    long j = zsm0.j(qtv0Var);
                    long backgroundContent = ((jtv0) l7m0Var.getValue()).b;
                    if (backgroundContent == 16) {
                        backgroundContent = ((cxv0) l7m0Var2.getValue()).f5144a;
                        if (backgroundContent == 16) {
                            pz40 pz40Var = s6t0.f31722a;
                            backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                        }
                    }
                    btm0.a(null, jtv0Var, j, backgroundContent, fetVar3, 0, 1);
                } else {
                    fetVar3.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                yum0.b((mm40) obj5, (Function1) obj4, (ugd) obj3, (fet) obj, x8x.L(3073));
                break;
            default:
                ftr ftrVar = (ftr) obj5;
                i8z i8zVar = (i8z) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                i8zVar.getClass();
                i8z.d(i8zVar, new uli0(iIntValue4, (byte) 9), xf0.p);
                uzb.U(i8zVar, ftrVar, new ru80((Function1) obj4, (byte) 25), new szu0((Function1) obj3, (byte) 13), null, 8);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ gdr0(mm40 mm40Var, Function1 function1, ugd ugdVar, int i) {
        this.f11115a = (byte) 19;
        this.b = mm40Var;
        this.c = function1;
        this.d = ugdVar;
    }

    public /* synthetic */ gdr0(hsv0 hsv0Var, mm40 mm40Var, Set set, int i) {
        this.f11115a = (byte) 17;
        this.d = hsv0Var;
        this.b = mm40Var;
        this.c = set;
    }

    public /* synthetic */ gdr0(Object obj, Object obj2, Object obj3, byte b) {
        this.f11115a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public /* synthetic */ gdr0(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f11115a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
