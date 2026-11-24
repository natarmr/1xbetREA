package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class q63 extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y5d f28181a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ pzn d;
    public final /* synthetic */ alo e;
    public final /* synthetic */ String f;
    public final /* synthetic */ ugd g;
    public final /* synthetic */ int h;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q63(y5d y5dVar, boolean z, mm40 mm40Var, pzn pznVar, alo aloVar, String str, ugd ugdVar, int i, int i2) {
        super(2);
        this.f28181a = y5dVar;
        this.b = z;
        this.c = mm40Var;
        this.d = pznVar;
        this.e = aloVar;
        this.f = str;
        this.g = ugdVar;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        b34.e(this.f28181a, this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1), this.i);
        return Unit.f46060a;
    }
}
