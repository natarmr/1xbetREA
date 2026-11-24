package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fz20 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10389a = 0;
    public final /* synthetic */ kz20 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ fz20(float f, kz20 kz20Var, Function1 function1) {
        this.c = f;
        this.b = kz20Var;
        this.d = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f10389a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Object[] objArr = 0;
        byte b2 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), StaticColors.INSTANCE.m64getBlack100d7_KjU(), jd8.n);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarQ, 40.0f);
                    float f = this.c;
                    mm40 mm40VarN = s5x0.N(mm40VarE, f, 0.0f, 0.0f, 0.0f, 14);
                    boolean zD = fetVar.d(f);
                    Object objP = fetVar.P();
                    if (zD || objP == cl5Var) {
                        objP = new mbh0(8.0f, 0.0f, f, y3d.f);
                        fetVar.o0(objP);
                    }
                    kz20 kz20Var = this.b;
                    boolean z = kz20Var.h;
                    uts0 uts0VarM0 = ro4.m0(Response.OK, 0, null, 6);
                    ugd ugdVar = b34.m;
                    ugd ugdVar2 = b34.n;
                    Function1 function1 = this.d;
                    cvm0.a(mm40VarN, kz20Var, (mbh0) objP, z, uts0VarM0, function1, ugdVar, ugdVar2, u1c.M(2025967316, new iz20(kz20Var, function1, objArr == true ? 1 : 0), fetVar), null, u1c.M(-1128904967, new k82(f, (byte) 3), fetVar), fetVar, 114843648, 6, 512);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
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
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(mm40VarD, 48.0f);
                    ugd ugdVar3 = j47.d;
                    ugd ugdVar4 = j47.e;
                    kz20 kz20Var2 = this.b;
                    float f2 = this.c;
                    j2e.l(mm40VarE2, kz20Var2, f2, f2, this.d, ugdVar3, ugdVar4, fetVar2, 1769472);
                    mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarE3 = o7k0.e(mm40VarD2, 40.0f);
                    Object objP2 = fetVar3.P();
                    float f3 = this.c;
                    if (objP2 == cl5Var) {
                        mbh0 mbh0Var = new mbh0(0.0f, 0.0f, f3, y3d.f);
                        fetVar3.o0(mbh0Var);
                        objP2 = mbh0Var;
                    }
                    ugd ugdVar5 = j47.f;
                    ugd ugdVar6 = j47.g;
                    kz20 kz20Var3 = this.b;
                    Function1 function2 = this.d;
                    cvm0.a(mm40VarE3, kz20Var3, (mbh0) objP2, false, null, function2, ugdVar5, ugdVar6, u1c.M(757549908, new yjm(f3, kz20Var3, function2, b2), fetVar3), j47.h, null, fetVar3, 920125824, 0, 1048);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ fz20(kz20 kz20Var, float f, Function1 function1) {
        this.b = kz20Var;
        this.c = f;
        this.d = function1;
    }

    public /* synthetic */ fz20(kz20 kz20Var, Function1 function1, float f) {
        this.b = kz20Var;
        this.d = function1;
        this.c = f;
    }
}
