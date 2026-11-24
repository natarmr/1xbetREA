package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sp8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bq8 f32578a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ yjj0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ ugd l;
    public final /* synthetic */ xdr m;

    public sp8(bq8 bq8Var, Function2 function2, ugd ugdVar, float f, float f2, boolean z, yjj0 yjj0Var, long j, long j2, float f3, Function2 function3, ugd ugdVar2, xdr xdrVar) {
        this.f32578a = bq8Var;
        this.b = function2;
        this.c = ugdVar;
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = yjj0Var;
        this.h = j;
        this.i = j2;
        this.j = f3;
        this.k = function3;
        this.l = ugdVar2;
        this.m = xdrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            bq8 bq8Var = this.f32578a;
            xpj0 xpj0Var = bq8Var.f3015a;
            ugd ugdVarM = u1c.M(-519581786, new qp8(this.c, this.d), fetVar);
            ugd ugdVarM2 = u1c.M(-815624571, new rp8(this.f32578a, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l), fetVar);
            ugd ugdVarM3 = u1c.M(-1111667356, new a8(this.m, bq8Var, (byte) 6), fetVar);
            boolean zG = fetVar.g(bq8Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new vb8(bq8Var, (byte) 6);
                fetVar.o0(objP);
            }
            epv0.h(this.b, ugdVarM, ugdVarM2, ugdVarM3, (Function0) objP, xpj0Var, fetVar, 3504);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
