package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rbg implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30184a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ rbg(int i, h7h h7hVar, l7m0 l7m0Var, wbg wbgVar, ngk0 ngk0Var, b7h b7hVar, Function1 function1) {
        this.b = i;
        this.d = h7hVar;
        this.e = l7m0Var;
        this.f = wbgVar;
        this.g = ngk0Var;
        this.h = b7hVar;
        this.c = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f30184a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                h7h h7hVar = (h7h) obj8;
                l7m0 l7m0Var = (l7m0) obj7;
                wbg wbgVar = (wbg) obj6;
                ngk0 ngk0Var = (ngk0) obj5;
                b7h b7hVar = (b7h) obj4;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    int i = q3d.i(h7hVar.g);
                    int i2 = this.b;
                    boolean z = i2 == i;
                    boolean zG = fetVar.g(l7m0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = jgk0.b(new eka(l7m0Var, (byte) 13));
                        fetVar.o0(objP);
                    }
                    l7m0 l7m0Var2 = (l7m0) objP;
                    if (wbgVar.b || ((Boolean) l7m0Var2.getValue()).booleanValue()) {
                        fetVar.e0(1310477425);
                        mm40 mm40VarQ = knx.Q(lgb.K(jm40.b), new y26((Object) ngk0Var, i2, (Object) l7m0Var, (byte) 2));
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarM = s5x0.M(mm40VarQ, 8.0f, 2.0f, 8.0f, z ? 2.0f : 0.0f);
                        x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, x5dVarA, gqw0.x);
                        jpm0.o(fetVar, bh90VarM, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC0, gqw0.v);
                        uzb.i(null, b7hVar, fetVar, 0);
                        uzb.f(null, b7hVar, this.c, fetVar, 0, 1);
                        fetVar.r(true);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1311402868);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj8;
                fqm fqmVar = (fqm) obj7;
                xdr xdrVar = (xdr) obj6;
                Function2 function2 = (Function2) obj5;
                Function0 function0 = (Function0) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    y860.N(null, arrayList, fqmVar, this.b, xdrVar, function2, function0, this.c, fetVar2, 512);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ rbg(ArrayList arrayList, fqm fqmVar, int i, xdr xdrVar, Function2 function2, Function0 function0, Function1 function1) {
        this.d = arrayList;
        this.e = fqmVar;
        this.b = i;
        this.f = xdrVar;
        this.g = function2;
        this.h = function0;
        this.c = function1;
    }
}
