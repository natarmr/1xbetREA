package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b5m implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2009a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ b5m(Function0 function0, Function1 function1) {
        this.b = function0;
        this.c = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f2009a;
        Function1 function1 = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                vj30Var.getClass();
                pj30Var.getClass();
                pu90 pu90VarS = pj30Var.S(((p4e) obj3).f26347a);
                function1.invoke(Integer.valueOf(pu90VarS.b));
                float fC = l1e0.c(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f);
                return vj30.x(vj30Var, pu90VarS.f27604a, si30.b((1.0f - fC) * pu90VarS.b), new j3d(fC, pu90VarS));
            default:
                fet fetVar = (fet) obj2;
                ((Integer) obj3).getClass();
                fetVar.e0(759876635);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = jgk0.b(function0);
                    fetVar.o0(objP);
                }
                l7m0 l7m0Var = (l7m0) objP;
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    ne60 ne60Var = (ne60) l7m0Var.getValue();
                    long j = ne60Var.f23370a;
                    objP2 = new t33(ne60Var, i5i0.b, new ne60(i5i0.c), 8);
                    fetVar.o0(objP2);
                }
                t33 t33Var = (t33) objP2;
                Unit unit = Unit.f46060a;
                boolean zI = fetVar.i(t33Var);
                Object objP3 = fetVar.P();
                if (zI || objP3 == cl5Var) {
                    objP3 = new kmg0((Object) l7m0Var, (Object) t33Var, (yje) null, (byte) 29);
                    fetVar.o0(objP3);
                }
                m0x0.t(fetVar, unit, (Function2) objP3);
                l73 l73Var = t33Var.c;
                boolean zG = fetVar.g(l73Var);
                Object objP4 = fetVar.P();
                if (zG || objP4 == cl5Var) {
                    objP4 = new f7f0(l73Var, (byte) 8);
                    fetVar.o0(objP4);
                }
                mm40 mm40Var = (mm40) function1.invoke((Function0) objP4);
                fetVar.r(false);
                return mm40Var;
        }
    }

    public /* synthetic */ b5m(Function1 function1, Function0 function0) {
        this.c = function1;
        this.b = function0;
    }
}
