package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p1d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26195a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p1d(float f, o2s o2sVar) {
        this.f26195a = (byte) 1;
        this.b = f;
        this.c = o2sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fC;
        byte b = this.f26195a;
        float f = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                agk0 agk0Var = ((rv2) obj).f;
                fC = l1e0.c(1.0f - ((Float.isNaN(agk0Var.l()) ? 0.0f : agk0Var.l()) / f), 0.0f, 1.0f);
                break;
            case 1:
                fC = l1e0.c(((Number) ((o2s) obj).d.d()).floatValue() * f, 0.0f, f);
                break;
            case 2:
                xk80 xk80Var = (xk80) obj;
                int iK = xk80Var.k();
                float fL = xk80Var.l();
                if (fL > f) {
                    iK++;
                } else if (fL < (-f)) {
                    iK--;
                }
                return Integer.valueOf(iK);
            default:
                oyq0 oyq0Var = ((zyn) obj).f45214a;
                float f2 = -f;
                if (oyq0Var.f26070a != f2) {
                    oyq0Var.f26070a = f2;
                }
                return Unit.f46060a;
        }
        return Float.valueOf(fC);
    }

    public /* synthetic */ p1d(Object obj, float f, byte b) {
        this.f26195a = b;
        this.c = obj;
        this.b = f;
    }
}
