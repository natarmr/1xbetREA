package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fmn0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mm40 f9793a;
    public final /* synthetic */ yjj0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ dn8 e;
    public final /* synthetic */ gy40 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ ugd j;

    public fmn0(mm40 mm40Var, yjj0 yjj0Var, long j, float f, dn8 dn8Var, gy40 gy40Var, boolean z, Function0 function0, float f2, ugd ugdVar) {
        this.f9793a = mm40Var;
        this.b = yjj0Var;
        this.c = j;
        this.d = f;
        this.e = dn8Var;
        this.f = gy40Var;
        this.g = z;
        this.h = function0;
        this.i = f2;
        this.j = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            ykw ykwVar = rlx.f30719a;
            mm40 mm40VarE = y860.W(gmn0.c(this.f9793a.e(tg40.b), this.b, gmn0.d(this.c, this.d, fetVar), this.e, ((w6k) fetVar.k(bmd.h)).w0(this.i)), this.f, lcg0.a(0.0f, 7), this.g, null, this.h, 24).e(new mac(new e6c((byte) 4)));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, true);
            int iX = e3c.x(fetVar);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            twn.v(0, this.j, fetVar, true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
