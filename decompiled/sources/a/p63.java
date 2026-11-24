package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class p63 extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26434a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pzn c;
    public final /* synthetic */ alo d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p63(boolean z, mm40 mm40Var, pzn pznVar, alo aloVar, String str, ugd ugdVar, int i, int i2) {
        super(2);
        this.f26434a = z;
        this.b = mm40Var;
        this.c = pznVar;
        this.d = aloVar;
        this.e = str;
        this.f = ugdVar;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        b34.h(this.f26434a, this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1), this.h);
        return Unit.f46060a;
    }
}
