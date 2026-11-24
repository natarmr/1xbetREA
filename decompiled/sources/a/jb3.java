package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jb3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16219a;
    public final /* synthetic */ oyq0 b;

    public /* synthetic */ jb3(oyq0 oyq0Var, byte b) {
        this.f16219a = b;
        this.b = oyq0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f16219a;
        oyq0 oyq0Var = this.b;
        i73 i73Var = (i73) obj;
        switch (b) {
            case 0:
                oyq0Var.c(((Number) ((hgk0) i73Var.e).getValue()).floatValue());
                break;
            case 1:
                i73Var.getClass();
                oyq0Var.c(((Number) ((hgk0) i73Var.e).getValue()).floatValue());
                break;
            case 2:
                i73Var.getClass();
                oyq0Var.c(((Number) ((hgk0) i73Var.e).getValue()).floatValue());
                break;
            case 3:
                i73Var.getClass();
                oyq0Var.c(((Number) ((hgk0) i73Var.e).getValue()).floatValue());
                break;
            default:
                i73Var.getClass();
                oyq0Var.c(((Number) ((hgk0) i73Var.e).getValue()).floatValue());
                break;
        }
        return Unit.f46060a;
    }
}
