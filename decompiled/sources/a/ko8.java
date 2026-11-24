package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ko8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18619a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ wdr f;

    public /* synthetic */ ko8(a4x a4xVar, float f, float f2, float f3, Function1 function1) {
        this.e = a4xVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18619a;
        wdr wdrVar = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                f1t0.l((mm40) obj3, this.b, this.c, this.d, (ugd) wdrVar, (fet) obj, x8x.L(24577));
                break;
            default:
                a4x a4xVar = (a4x) obj3;
                Function1 function1 = (Function1) wdrVar;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    boolean zG = fetVar.g(a4xVar);
                    float f = this.b;
                    boolean zD = zG | fetVar.d(f);
                    float f2 = this.c;
                    boolean zD2 = zD | fetVar.d(f2);
                    float f3 = this.d;
                    boolean zD3 = zD2 | fetVar.d(f3);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zD3 || objP == cl5Var) {
                        objP = new t900(a4xVar, f, f2, f3);
                        fetVar.o0(objP);
                    }
                    tj30 tj30Var = (tj30) objP;
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30Var, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -1378364118, a4xVar);
                    while (itO.hasNext()) {
                        a4x<nea0> a4xVar2 = (a4x) itO.next();
                        fetVar.e0(-1378362865);
                        for (nea0 nea0Var : a4xVar2) {
                            boolean zG2 = fetVar.g(function1) | fetVar.g(nea0Var);
                            Object objP2 = fetVar.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new mbz(function1, nea0Var, (byte) 9);
                                fetVar.o0(objP2);
                            }
                            s0x.p(nea0Var, (Function0) objP2, fetVar, 0);
                        }
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ko8(mm40 mm40Var, float f, float f2, float f3, ugd ugdVar, int i) {
        this.e = mm40Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.f = ugdVar;
    }
}
