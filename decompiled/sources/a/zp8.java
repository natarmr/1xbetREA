package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class zp8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xpj0 f44746a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ vne d;
    public final /* synthetic */ boolean e;

    public zp8(xpj0 xpj0Var, Function2 function2, ugd ugdVar, vne vneVar, boolean z) {
        this.f44746a = xpj0Var;
        this.b = function2;
        this.c = ugdVar;
        this.d = vneVar;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            mm40 mm40VarT = i4w0.T(o7k0.d(jm40.b, 1.0f), new pp8(this.f44746a, (byte) 0));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iX = e3c.x(fetVar);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarT);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            shd shdVar = gqw0.y;
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar, iX, shdVar);
            }
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Function2 function2 = this.b;
            if (function2 != null) {
                fetVar.e0(-1044068159);
                tpj0.a(u1c.M(-511691176, new yp8(this.f44746a, this.d, this.e, jtt0.j(R.string.m3c_bottom_sheet_expand_description, fetVar), jtt0.j(R.string.m3c_bottom_sheet_collapse_description, fetVar), jtt0.j(R.string.m3c_bottom_sheet_dismiss_description, fetVar), function2), fetVar), fetVar, 54);
                fetVar.r(false);
            } else {
                fetVar.e0(-1040260677);
                fetVar.r(false);
            }
            vqd.t(6, this.c, y5d.f42040a, fetVar, true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
