package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ca40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3990a;
    public final /* synthetic */ uz40 b;

    public /* synthetic */ ca40(uz40 uz40Var, byte b) {
        this.f3990a = b;
        this.b = uz40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3990a;
        uz40 uz40Var = this.b;
        switch (b) {
            case 0:
                uz40Var.o1(Boolean.valueOf(!((Boolean) ((hgk0) uz40Var.d).getValue()).booleanValue()));
                return Unit.f46060a;
            case 1:
                uz40Var.o1(Boolean.valueOf(!((Boolean) ((hgk0) uz40Var.d).getValue()).booleanValue()));
                return Unit.f46060a;
            default:
                return Boolean.valueOf(uz40Var.n1() && ((Boolean) ((hgk0) uz40Var.c).getValue()).booleanValue());
        }
    }
}
