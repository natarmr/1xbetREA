package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class emn0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mm40 f8056a;
    public final /* synthetic */ yjj0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ dn8 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ ugd g;

    public emn0(mm40 mm40Var, yjj0 yjj0Var, long j, float f, dn8 dn8Var, float f2, ugd ugdVar) {
        this.f8056a = mm40Var;
        this.b = yjj0Var;
        this.c = j;
        this.d = f;
        this.e = dn8Var;
        this.f = f2;
        this.g = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            mm40 mm40VarC = gmn0.c(this.f8056a, this.b, gmn0.d(this.c, this.d, fetVar), this.e, ((w6k) fetVar.k(bmd.h)).w0(this.f));
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new rgn0((byte) 2);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarC, false, (Function1) objP);
            Unit unit = Unit.f46060a;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = i54.m;
                fetVar.o0(objP2);
            }
            mm40 mm40VarA2 = fnn0.a(mm40VarA, unit, (PointerInputEventHandler) objP2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, true);
            int iX = e3c.x(fetVar);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA2);
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
            twn.v(0, this.g, fetVar, true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
