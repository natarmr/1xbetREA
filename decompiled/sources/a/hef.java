package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class hef extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f12921a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ cfq c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hef(Object obj, mm40 mm40Var, cfq cfqVar, String str, ugd ugdVar, int i, int i2) {
        super(2);
        this.f12921a = obj;
        this.b = mm40Var;
        this.c = cfqVar;
        this.d = str;
        this.e = ugdVar;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        jwb.e(this.f12921a, this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1), this.g);
        return Unit.f46060a;
    }
}
