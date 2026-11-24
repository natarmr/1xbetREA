package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pp8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27365a;
    public final /* synthetic */ xpj0 b;

    public /* synthetic */ pp8(xpj0 xpj0Var, byte b) {
        this.f27365a = b;
        this.b = xpj0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27365a;
        xpj0 xpj0Var = this.b;
        uag0 uag0Var = (uag0) obj;
        switch (b) {
            case 0:
                float fL = ((agk0) xpj0Var.e.l).l();
                float fC = xpj0Var.e.j().c();
                float f = fL < fC ? fC - fL : 0.0f;
                uag0Var.y(f > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (uag0Var.r & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & uag0Var.r))) : 1.0f);
                uag0Var.G(osm0.e(0.5f, 0.0f));
                break;
            default:
                float fL2 = ((agk0) xpj0Var.e.l).l();
                float fC2 = xpj0Var.e.j().c();
                float f2 = fL2 < fC2 ? fC2 - fL2 : 0.0f;
                uag0Var.y(f2 > 0.0f ? (Float.intBitsToFloat((int) (uag0Var.r & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & uag0Var.r)) : 1.0f);
                uag0Var.G(osm0.e(0.5f, 0.0f));
                break;
        }
        return Unit.f46060a;
    }
}
