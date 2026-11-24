package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bm40 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2821a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ xpj0 c;
    public final /* synthetic */ em40 d;
    public final /* synthetic */ t33 e;
    public final /* synthetic */ vne f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ mm40 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ yjj0 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ Function2 o;
    public final /* synthetic */ ugd p;

    public bm40(long j, Function0 function0, xpj0 xpj0Var, em40 em40Var, t33 t33Var, vne vneVar, Function1 function1, mm40 mm40Var, float f, boolean z, yjj0 yjj0Var, long j2, long j3, Function2 function2, Function2 function3, ugd ugdVar) {
        this.f2821a = j;
        this.b = function0;
        this.c = xpj0Var;
        this.d = em40Var;
        this.e = t33Var;
        this.f = vneVar;
        this.g = function1;
        this.h = mm40Var;
        this.i = f;
        this.j = z;
        this.k = yjj0Var;
        this.l = j2;
        this.m = j3;
        this.n = function2;
        this.o = function3;
        this.p = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            mm40 mm40VarP = o050.P(o7k0.c);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new da40((byte) 7);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarP, false, (Function1) objP);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iX = e3c.x(fetVar);
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
            shd shdVar = gqw0.y;
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar, iX, shdVar);
            }
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            xpj0 xpj0Var = this.c;
            boolean z = ((ypj0) ((zbk) xpj0Var.e.k).getValue()) != ypj0.f43033a;
            this.d.getClass();
            long j = this.f2821a;
            Function0 function0 = this.b;
            dm40.c(j, function0, z, fetVar, 0);
            dm40.b(this.e, this.f, function0, this.g, this.h, xpj0Var, this.i, this.j, this.k, this.l, this.m, 0.0f, this.n, this.o, this.p, fetVar, 70);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
