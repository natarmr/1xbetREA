package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c2d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3619a;
    public final /* synthetic */ e2d b;

    public /* synthetic */ c2d(e2d e2dVar, byte b) {
        this.f3619a = b;
        this.b = e2dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3619a;
        e2d e2dVar = this.b;
        switch (b) {
            case 0:
                return jgk0.b(new c2d(e2dVar, (byte) 4));
            case 1:
                return jgk0.b(new c2d(e2dVar, (byte) 3));
            case 2:
                return new yw9((Function0) ((hgk0) e2dVar.d).getValue(), e2dVar, (byte) 16);
            case 3:
                oyq0 oyq0Var = e2dVar.f7077a;
                oyq0Var.c.l();
                return Float.valueOf(oyq0Var.a());
            case 4:
                oyq0 oyq0Var2 = e2dVar.f7077a;
                oyq0Var2.c.l();
                return Boolean.valueOf(oyq0Var2.a() >= 0.99f);
            case 5:
                return Boolean.valueOf(((Number) ((l7m0) e2dVar.g.getValue()).getValue()).floatValue() > 0.0f);
            case 6:
                return Boolean.valueOf(((Number) ((l7m0) e2dVar.g.getValue()).getValue()).floatValue() < 1.0f);
            default:
                return Float.valueOf(1.0f - ((Number) ((l7m0) e2dVar.g.getValue()).getValue()).floatValue());
        }
    }
}
