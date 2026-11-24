package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class b580 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f1990a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Function1 d;

    public b580(List list, long j, long j2, Function1 function1) {
        this.f1990a = list;
        this.b = j;
        this.c = j2;
        this.d = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            q380 q380Var = (q380) this.f1990a.get(iIntValue);
            fetVar.e0(1942324803);
            pz40 pz40VarF = androidx.compose.runtime.e.f(q380Var, fetVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.L(jm40.b, qmk.a(fetVar).c, 0.0f, 2), 1.0f), 60.0f);
            boolean zG = fetVar.g(pz40VarF) | fetVar.f(this.b) | fetVar.f(this.c);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                z480 z480Var = new z480(pz40VarF, this.b, this.c);
                fetVar.o0(z480Var);
                objP = z480Var;
            }
            w9x.h(rq8.L(mm40VarE, (Function1) objP), pz40VarF, this.d, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
