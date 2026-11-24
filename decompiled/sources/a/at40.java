package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class at40 extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s3e f1418a;
    public final /* synthetic */ s3e b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ mm40 g;
    public final /* synthetic */ pz40 h;
    public final /* synthetic */ nie0 i;
    public final /* synthetic */ lwf j;
    public final /* synthetic */ ugd k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at40(s3e s3eVar, s3e s3eVar2, float f, boolean z, boolean z2, boolean z3, mm40 mm40Var, pz40 pz40Var, nie0 nie0Var, lwf lwfVar, ugd ugdVar, int i) {
        super(2);
        this.f1418a = s3eVar;
        this.b = s3eVar2;
        this.c = f;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = mm40Var;
        this.h = pz40Var;
        this.i = nie0Var;
        this.j = lwfVar;
        this.k = ugdVar;
        this.l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        n6x.b(this.f1418a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (fet) obj, x8x.L(this.l | 1));
        return Unit.f46060a;
    }
}
