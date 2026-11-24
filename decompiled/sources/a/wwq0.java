package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wwq0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f39898a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ugd c;

    public wwq0(float f, long j, ugd ugdVar) {
        this.f39898a = f;
        this.b = j;
        this.c = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            lh80 lh80Var = xwq0.f41622a;
            mm40 mm40VarI = s5x0.I(o7k0.r(jm40.b, 40.0f, 24.0f, this.f39898a, 8), xwq0.f41622a);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iX = e3c.x(fetVar);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarI);
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
            obc.e(new l5d0[]{yde.f42431a.a(new y3d(this.b)), v8q0.f37000a.a(k1t0.a(fv90.d, fetVar))}, this.c, fetVar, 8);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
