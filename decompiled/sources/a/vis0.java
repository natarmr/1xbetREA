package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vis0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37496a;
    public final /* synthetic */ zis0 b;

    public /* synthetic */ vis0(zis0 zis0Var, byte b) {
        this.f37496a = b;
        this.b = zis0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37496a;
        zis0 zis0Var = this.b;
        switch (b) {
            case 0:
                g2v g2vVar = zis0Var.k2;
                if (g2vVar != null) {
                    return g2v.b(g2vVar, pb10.v, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                }
                Intrinsics.h("lottieEmptyConfigurator");
                throw null;
            default:
                y2m0 y2m0Var = zis0.m2;
                j120.Y(zis0Var);
                return Unit.f46060a;
        }
    }
}
