package a;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ixr0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15557a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ wdr g;
    public final /* synthetic */ wdr h;
    public final /* synthetic */ wdr i;

    public /* synthetic */ ixr0(mm40 mm40Var, wul wulVar, wul wulVar2, wul wulVar3, long j, Function0 function0, Function0 function1, Function0 function2, int i) {
        vul vulVar = vul.f38053a;
        this.b = mm40Var;
        this.d = wulVar;
        this.e = wulVar2;
        this.f = wulVar3;
        this.c = j;
        this.g = function0;
        this.h = function1;
        this.i = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        Object o6s0Var;
        int i;
        long j2;
        t33 t33Var;
        long j3;
        byte b = this.f15557a;
        wdr wdrVar = this.i;
        wdr wdrVar2 = this.h;
        wdr wdrVar3 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                nsm0 nsm0Var = (nsm0) obj5;
                pwr0 pwr0Var = (pwr0) obj4;
                k6z k6zVar = (k6z) obj3;
                Function2 function2 = (Function2) wdrVar3;
                Function1 function1 = (Function1) wdrVar2;
                Function1 function3 = (Function1) wdrVar;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    WeakHashMap weakHashMap = djv0.w;
                    q33 q33Var = zcm0.i(fetVar).e;
                    zfn zfnVar = bmd.h;
                    int i2 = q33Var.e().d;
                    w6k w6kVar = (w6k) fetVar.k(zfnVar);
                    zcl zclVar = qmk.f28987a;
                    int iB = si30.b(w6kVar.w0(104.0f)) + i2;
                    fetVar.e0(1882746977);
                    int iB2 = si30.b(((w6k) fetVar.k(zfnVar)).w0(xfn.a(fetVar).d));
                    fetVar.r(false);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = androidx.compose.runtime.e.e(new qkx(0L));
                        fetVar.o0(objP);
                    }
                    pz40 pz40Var = (pz40) objP;
                    Object objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = androidx.compose.runtime.e.e(new qkx(0L));
                        fetVar.o0(objP2);
                    }
                    pz40 pz40Var2 = (pz40) objP2;
                    Object[] objArr = new Object[0];
                    v0h0 v0h0Var = fre0.o;
                    Object objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = new yqr0((byte) 6);
                        fetVar.o0(objP3);
                    }
                    ngk0 ngk0Var = (ngk0) e9x.R(objArr, v0h0Var, (Function0) objP3, fetVar, 384);
                    long j4 = this.c;
                    boolean zF = fetVar.f(j4) | fetVar.g(ngk0Var) | fetVar.e(iB2) | fetVar.e(iB);
                    Object objP4 = fetVar.P();
                    if (zF || objP4 == cl5Var) {
                        j = j4;
                        i = iB2;
                        j2 = 0;
                        o6s0Var = new o6s0(j, ngk0Var, i, iB, new jxr0(pz40Var, (byte) 0), new jxr0(pz40Var2, (byte) 1));
                        fetVar.o0(o6s0Var);
                    } else {
                        i = iB2;
                        j = j4;
                        j2 = 0;
                        o6s0Var = objP4;
                    }
                    o6s0 o6s0Var2 = (o6s0) o6s0Var;
                    ne60 ne60Var = (ne60) r18.get(Long.valueOf(j));
                    long j5 = ne60Var != null ? ne60Var.f23370a : j2;
                    sjj sjjVarA = wzk0.a(fetVar);
                    long j6 = j;
                    boolean zF2 = fetVar.f(j6);
                    Object objP5 = fetVar.P();
                    if (zF2 || objP5 == cl5Var) {
                        objP5 = new t33(new ne60(j5), hp4.o, null, 12);
                        fetVar.o0(objP5);
                    }
                    t33 t33Var2 = (t33) objP5;
                    Object objP6 = fetVar.P();
                    if (objP6 == cl5Var) {
                        objP6 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                        fetVar.o0(objP6);
                    }
                    vne vneVar = (vne) objP6;
                    Object objP7 = fetVar.P();
                    if (objP7 == cl5Var) {
                        objP7 = androidx.compose.runtime.e.e(null);
                        fetVar.o0(objP7);
                    }
                    pz40 pz40Var3 = (pz40) objP7;
                    Long lValueOf = Long.valueOf(j6);
                    boolean zI = fetVar.i(t33Var2) | fetVar.g(r18) | fetVar.f(j6);
                    Object objP8 = fetVar.P();
                    if (zI || objP8 == cl5Var) {
                        t33Var = t33Var2;
                        objP8 = new f6n0(t33Var, ngk0Var, j6, null, (byte) 1);
                        j3 = j6;
                        fetVar.o0(objP8);
                    } else {
                        t33Var = t33Var2;
                        j3 = j6;
                    }
                    m0x0.t(fetVar, lValueOf, (Function2) objP8);
                    mm40 mm40VarK = lgb.K(this.b.e(o7k0.c));
                    boolean zG = fetVar.g(o6s0Var2);
                    Object objP9 = fetVar.P();
                    if (zG || objP9 == cl5Var) {
                        objP9 = new b8q0((Object) o6s0Var2, (Object) pz40Var, (byte) 23);
                        fetVar.o0(objP9);
                    }
                    mm40 mm40VarY = fre0.Y(mm40VarK, (Function1) objP9);
                    mm40VarY.getClass();
                    o6s0Var2.getClass();
                    t33Var.getClass();
                    vneVar.getClass();
                    sjjVarA.getClass();
                    pz40Var3.getClass();
                    mm40 mm40VarA = fnn0.a(mm40VarY, Long.valueOf(j3), new p5s0(pz40Var3, vneVar, t33Var, o6s0Var2, sjjVarA, ngk0Var, j3));
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    Object objP10 = fetVar.P();
                    if (objP10 == cl5Var) {
                        objP10 = new dbo0(pz40Var2, (byte) 7);
                        fetVar.o0(objP10);
                    }
                    iom0.c(nsm0Var, pwr0Var, k6zVar, j5, o6s0Var2, i, function2, function1, function3, (Function1) objP10, fetVar, 6);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                vul vulVar = vul.f38053a;
                ((Integer) obj2).getClass();
                hkb.j(this.b, (wul) obj5, (wul) obj4, (wul) obj3, this.c, (Function0) wdrVar3, (Function0) wdrVar2, (Function0) wdrVar, (fet) obj, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ixr0(long j, mm40 mm40Var, nsm0 nsm0Var, pwr0 pwr0Var, k6z k6zVar, Function2 function2, Function1 function1, Function1 function3) {
        this.c = j;
        this.b = mm40Var;
        this.d = nsm0Var;
        this.e = pwr0Var;
        this.f = k6zVar;
        this.g = function2;
        this.h = function1;
        this.i = function3;
    }
}
