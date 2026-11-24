package a;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ino0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15085a;
    public final /* synthetic */ xk80 b;

    public /* synthetic */ ino0(xk80 xk80Var, byte b) {
        this.f15085a = b;
        this.b = xk80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iK;
        byte b = this.f15085a;
        xk80 xk80Var = this.b;
        switch (b) {
            case 0:
                return new Pair(Integer.valueOf(xk80Var.q()), Boolean.valueOf(xk80Var.k.a()));
            case 1:
                iK = xk80Var.k();
                break;
            case 2:
                return new Pair(Integer.valueOf(xk80Var.q()), Boolean.valueOf(xk80Var.k.a()));
            case 3:
                iK = xk80Var.k();
                break;
            default:
                iK = xk80Var.k();
                break;
        }
        return Integer.valueOf(iK);
    }
}
