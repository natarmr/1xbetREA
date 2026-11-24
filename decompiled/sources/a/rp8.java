package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rp8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bq8 f30873a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ yjj0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ ugd j;

    public rp8(bq8 bq8Var, float f, float f2, boolean z, yjj0 yjj0Var, long j, long j2, float f3, Function2 function2, ugd ugdVar) {
        this.f30873a = bq8Var;
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = yjj0Var;
        this.f = j;
        this.g = j2;
        this.h = f3;
        this.i = function2;
        this.j = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            epv0.H(this.f30873a.f3015a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
