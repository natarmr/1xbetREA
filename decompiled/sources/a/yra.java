package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yra implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43111a;
    public final /* synthetic */ bzl b;

    public /* synthetic */ yra(bzl bzlVar, byte b) {
        this.f43111a = b;
        this.b = bzlVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43111a;
        bzl bzlVar = this.b;
        switch (b) {
            case 0:
                zcl zclVar = qmk.f28987a;
                return new ycl((1.0f - ((Number) ((l7m0) bzlVar.f.getValue()).getValue()).floatValue()) * 24.0f);
            case 1:
                zcl zclVar2 = qmk.f28987a;
                return new ycl((1.0f - ((Number) ((l7m0) bzlVar.f.getValue()).getValue()).floatValue()) * 24.0f);
            case 2:
                return jgk0.b(new yra(bzlVar, (byte) 3));
            case 3:
                oyq0 oyq0Var = bzlVar.f3474a;
                oyq0Var.c.l();
                return Float.valueOf(oyq0Var.a());
            case 4:
                return Float.valueOf(1.0f - ((Number) ((l7m0) bzlVar.f.getValue()).getValue()).floatValue());
            default:
                return Float.valueOf(1.0f - ((Number) ((l7m0) bzlVar.f.getValue()).getValue()).floatValue());
        }
    }
}
