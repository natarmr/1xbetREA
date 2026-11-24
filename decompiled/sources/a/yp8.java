package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yp8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xpj0 f43020a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function2 g;

    public yp8(xpj0 xpj0Var, vne vneVar, boolean z, String str, String str2, String str3, Function2 function2) {
        this.f43020a = xpj0Var;
        this.b = vneVar;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            xpj0 xpj0Var = this.f43020a;
            boolean zG = fetVar.g(xpj0Var);
            vne vneVar = this.b;
            boolean zI = zG | fetVar.i(vneVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new vp8(xpj0Var, vneVar, (byte) 0);
                fetVar.o0(objP);
            }
            mm40 mm40VarX = y860.X((Function0) objP);
            boolean zG2 = fetVar.g(xpj0Var) | fetVar.h(this.c) | fetVar.g(this.d) | fetVar.i(vneVar) | fetVar.g(this.e) | fetVar.g(this.f);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                wp8 wp8Var = new wp8((byte) 0, this.f43020a, this.d, this.e, this.f, this.b, this.c);
                fetVar.o0(wp8Var);
                objP2 = wp8Var;
            }
            mm40 mm40VarA = pai0.a(mm40VarX, true, (Function1) objP2);
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
            h97.q(0, fetVar, this.g, true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
