package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n5m0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22951a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ n5m0(t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, y9q0 y9q0Var, long j, String str) {
        this.c = t33Var;
        this.d = t33Var2;
        this.e = t33Var3;
        this.f = t33Var4;
        this.g = y9q0Var;
        this.b = j;
        this.h = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22951a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                t33 t33Var = (t33) obj8;
                t33 t33Var2 = (t33) obj7;
                t33 t33Var3 = (t33) obj6;
                t33 t33Var4 = (t33) obj5;
                y9q0 y9q0Var = (y9q0) obj4;
                String str = (String) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = fetVar.g(t33Var);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new n53(t33Var, (byte) 3);
                        fetVar.o0(objP);
                    }
                    n4d n4dVar = (n4d) objP;
                    boolean zI = fetVar.i(t33Var2) | fetVar.i(t33Var3) | fetVar.i(t33Var4);
                    Object objP2 = fetVar.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new gy7(t33Var2, t33Var3, t33Var4, (byte) 1);
                        fetVar.o0(objP2);
                    }
                    aad.e(str, i4w0.T(jm40.b, (Function1) objP2), y9q0.a(y9q0Var, 0L, this.b, null, null, null, 0L, null, k5q0.d, 0, 1, 0L, null, null, 16707581), null, 0, false, 0, 0, n4dVar, null, fetVar, 0, 760);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jpm0.g((mm40) obj8, (nsm0) obj7, this.b, (pwr0) obj6, (Function2) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ n5m0(mm40 mm40Var, nsm0 nsm0Var, long j, pwr0 pwr0Var, Function2 function2, Function1 function1, Function1 function3, int i) {
        this.c = mm40Var;
        this.d = nsm0Var;
        this.b = j;
        this.e = pwr0Var;
        this.f = function2;
        this.g = function1;
        this.h = function3;
    }
}
