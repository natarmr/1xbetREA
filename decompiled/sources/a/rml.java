package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class rml implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f30749a;
    public final /* synthetic */ pzh b;
    public final /* synthetic */ pzh c;
    public final /* synthetic */ pzh d;
    public final /* synthetic */ pzh e;
    public final /* synthetic */ cgk0 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ y9q0 h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ pz40 j;
    public final /* synthetic */ l7m0 k;
    public final /* synthetic */ l7m0 l;
    public final /* synthetic */ l7m0 m;

    public rml(List list, pzh pzhVar, pzh pzhVar2, pzh pzhVar3, pzh pzhVar4, cgk0 cgk0Var, float f, y9q0 y9q0Var, Function1 function1, pz40 pz40Var, l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3) {
        this.f30749a = list;
        this.b = pzhVar;
        this.c = pzhVar2;
        this.d = pzhVar3;
        this.e = pzhVar4;
        this.f = cgk0Var;
        this.g = f;
        this.h = y9q0Var;
        this.i = function1;
        this.j = pz40Var;
        this.k = l7m0Var;
        this.l = l7m0Var2;
        this.m = l7m0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Integer num;
        Integer num2;
        Integer num3;
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
        boolean z = true;
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            gzh gzhVar = (gzh) this.f30749a.get(iIntValue);
            fetVar.e0(880612657);
            gzhVar.getClass();
            ezh ezhVar = (ezh) gzhVar;
            if (((Boolean) this.j.getValue()).booleanValue()) {
                z = false;
            } else {
                pzh pzhVar = this.c;
                pzh pzhVar2 = this.b;
                if (!pzhVar2.equals(pzhVar) ? !pzhVar2.equals(this.d) ? !pzhVar2.equals(this.e) || (num = (Integer) this.m.getValue()) == null || iIntValue != num.intValue() : (num2 = (Integer) this.l.getValue()) == null || iIntValue != num2.intValue() : (num3 = (Integer) this.k.getValue()) == null || iIntValue != num3.intValue()) {
                    z = false;
                }
            }
            cgk0 cgk0Var = this.f;
            int iL = cgk0Var.l();
            mm40 mm40VarY = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (iL == 0) {
                fetVar.e0(881145639);
                boolean zG = fetVar.g(cgk0Var);
                Object objP = fetVar.P();
                if (zG || objP == cl5Var) {
                    objP = new w0(cgk0Var, (byte) 20);
                    fetVar.o0(objP);
                }
                mm40VarY = fre0.Y(mm40VarY, (Function1) objP);
                fetVar.r(false);
            } else {
                fetVar.e0(881390725);
                fetVar.r(false);
            }
            yyh yyhVar = new yyh(this.g, this.h);
            boolean zH = fetVar.h(z);
            Function1 function1 = this.i;
            boolean zG2 = zH | fetVar.g(function1) | fetVar.i(ezhVar);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new up7(z, function1, ezhVar);
                fetVar.o0(objP2);
            }
            gq80.p(mm40VarY, ezhVar, yyhVar, (Function1) objP2, null, fetVar, 0, 16);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
