package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h15 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12265a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ h15(mm40 mm40Var, long j, long j2, long j3, String str, y9q0 y9q0Var, String str2) {
        this.b = mm40Var;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.h = y9q0Var;
        this.g = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f12265a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                String str = (String) obj5;
                y9q0 y9q0Var = (y9q0) obj3;
                String str2 = (String) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objP = fetVar.P();
                    long j = this.c;
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = androidx.compose.runtime.e.e(new daq0(j));
                        fetVar.o0(objP);
                    }
                    pz40 pz40Var = (pz40) objP;
                    thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar, 54);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, this.b);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    mm40 mm40VarI = hne.i(1.0f, false, "SUM_VALUE_TEST_TAG");
                    long j2 = this.d;
                    boolean zF = fetVar.f(j2);
                    Object objP2 = fetVar.P();
                    if (zF || objP2 == cl5Var) {
                        objP2 = new f15((byte) 2, j2);
                        fetVar.o0(objP2);
                    }
                    n4d n4dVar = (n4d) objP2;
                    n05 n05Var = new n05(this.e, j, qmk.n);
                    Object objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = new we(pz40Var, (byte) 24);
                        fetVar.o0(objP3);
                    }
                    aad.e(str, mm40VarI, y9q0Var, (Function1) objP3, 2, false, 1, 0, n4dVar, n05Var, fetVar, 27648, 160);
                    v8q0.a(str2, o2e.e0(s5x0.N(jm40.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), "CURRENCY_VALUE_TEST_TAG"), j2, null, ((daq0) pz40Var.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24576, 114664);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ozb.h(this.b, this.c, this.d, this.e, (Function0) obj5, (Function0) obj4, (ugd) obj3, (fet) obj, x8x.L(1572871));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ h15(mm40 mm40Var, long j, long j2, long j3, Function0 function0, Function0 function1, ugd ugdVar, int i) {
        this.b = mm40Var;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = function0;
        this.g = function1;
        this.h = ugdVar;
    }
}
