package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class p43 extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f26330a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ u12 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ ydr g;
    public final /* synthetic */ int h;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p43(Object obj, mm40 mm40Var, Function1 function1, u12 u12Var, String str, Function1 function2, ydr ydrVar, int i, int i2) {
        super(2);
        this.f26330a = obj;
        this.b = mm40Var;
        this.c = function1;
        this.d = u12Var;
        this.e = str;
        this.f = function2;
        this.g = ydrVar;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ay3.f(this.f26330a, this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1), this.i);
        return Unit.f46060a;
    }
}
