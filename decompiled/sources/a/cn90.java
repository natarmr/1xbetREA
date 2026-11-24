package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class cn90 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4644a;
    public final /* synthetic */ dn90 b;
    public final /* synthetic */ hn90 c;

    public /* synthetic */ cn90(dn90 dn90Var, hn90 hn90Var, byte b) {
        this.f4644a = b;
        this.b = dn90Var;
        this.c = hn90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4644a;
        hn90 hn90Var = this.c;
        dn90 dn90Var = this.b;
        switch (b) {
            case 0:
                int i = dn90.m2;
                ((k3t0) dn90Var.l2.getValue()).x(new bn90(hn90Var.f13340a));
                break;
            default:
                int i2 = dn90.m2;
                ((k3t0) dn90Var.l2.getValue()).x(new bn90(hn90Var.f13340a));
                break;
        }
        return Unit.f46060a;
    }
}
