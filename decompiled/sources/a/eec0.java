package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eec0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7666a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ eec0(float f, lm6 lm6Var, pz40 pz40Var, kz20 kz20Var, float f2, Function1 function1) {
        this.b = f;
        this.e = lm6Var;
        this.f = pz40Var;
        this.g = kz20Var;
        this.c = f2;
        this.d = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        ugd ugdVar;
        byte b = this.f7666a;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        byte b2 = 1;
        switch (b) {
            case 0:
                kec0 kec0Var = (kec0) obj6;
                xcz xczVar = (xcz) obj5;
                hjm hjmVar = (hjm) obj4;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zIsEmpty = kec0Var.c.isEmpty();
                    float f = this.b;
                    Function1 function1 = this.d;
                    cl5 cl5Var = ukd.f35823a;
                    if (zIsEmpty) {
                        fetVar.e0(2075455351);
                        n0q n0qVar = o7k0.c;
                        zcl zclVar = qmk.f28987a;
                        lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 32.0f, 7);
                        boolean zD = fetVar.d(f) | fetVar.g(kec0Var);
                        float f2 = this.c;
                        boolean zD2 = fetVar.d(f2) | zD | fetVar.g(hjmVar) | fetVar.g(function1);
                        Object objP = fetVar.P();
                        if (zD2 || objP == cl5Var) {
                            objP = new cec0(kec0Var, f, f2, hjmVar, function1);
                            fetVar.o0(objP);
                        }
                        b8k0.e(n0qVar, xczVar, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 6, Response.SERVER_TIMEOUT);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(2074406466);
                        n0q n0qVar2 = o7k0.c;
                        zcl zclVar2 = qmk.f28987a;
                        float f3 = f + 12.0f;
                        ch80 ch80VarF = h97.f(f3, 8.0f, f3, 32.0f, fetVar);
                        qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                        boolean zG = fetVar.g(kec0Var) | fetVar.g(function1);
                        Object objP2 = fetVar.P();
                        if (zG || objP2 == cl5Var) {
                            objP2 = new oac0(kec0Var, function1, b2);
                            fetVar.o0(objP2);
                        }
                        b8k0.e(n0qVar2, xczVar, ch80VarF, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 6, Response.NOT_ACCEPTABLE_HERE);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            default:
                lm6 lm6Var = (lm6) obj6;
                pz40 pz40Var = (pz40) obj5;
                kz20 kz20Var = (kz20) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarQ = i120.Q(o7k0.e(mm40VarD, 48.0f), StaticColors.INSTANCE.m64getBlack100d7_KjU(), jd8.n);
                    boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
                    float f4 = rf6.f30371a;
                    float f5 = this.c;
                    float f6 = this.b;
                    Function1 function2 = this.d;
                    ugd ugdVarM = u1c.M(-2008086481, new ez20(kz20Var, f5, f6, function2, (byte) 1), fetVar2);
                    if (lm6Var != null) {
                        fetVar2.e0(1967945122);
                        ugd ugdVarM2 = u1c.M(-925560437, new eyn(lm6Var, function2, pz40Var, (byte) 23), fetVar2);
                        fetVar2.r(false);
                        ugdVar = ugdVarM2;
                    } else {
                        fetVar2.e0(1968935541);
                        fetVar2.r(false);
                        ugdVar = null;
                    }
                    cwr0.l(mm40VarQ, zBooleanValue, f4, f6, f6, ugdVarM, ugdVar, lm6Var != null ? b34.l : null, fetVar2, 196608);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ eec0(kec0 kec0Var, float f, xcz xczVar, Function1 function1, float f2, hjm hjmVar) {
        this.e = kec0Var;
        this.b = f;
        this.f = xczVar;
        this.d = function1;
        this.c = f2;
        this.g = hjmVar;
    }
}
