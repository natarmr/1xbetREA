package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w5m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38592a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w5m(mm40 mm40Var, a6m a6mVar, boolean z, float f, float f2, int i) {
        this.e = mm40Var;
        this.f = a6mVar;
        this.d = z;
        this.b = f;
        this.c = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38592a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                gkb.E((mm40) obj4, (a6m) obj3, this.d, this.b, this.c, (fet) obj, iL);
                break;
            default:
                prm prmVar = (prm) obj3;
                dpa0 dpa0Var = (dpa0) obj;
                dpa0Var.getClass();
                long j = dpa0Var.c;
                prmVar.getClass();
                ((Function1) obj4).invoke(Float.valueOf(qcc.N(j, this.b, this.c, prmVar.d, this.d)));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ w5m(Function1 function1, prm prmVar, float f, float f2, boolean z) {
        this.e = function1;
        this.f = prmVar;
        this.b = f;
        this.c = f2;
        this.d = z;
    }
}
