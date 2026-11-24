package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sfz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32137a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ float c;

    public /* synthetic */ sfz(a4x a4xVar, float f, byte b) {
        this.f32137a = b;
        this.b = a4xVar;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f32137a;
        float f = this.c;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                zcl zclVar = qmk.f28987a;
                float density = pi9Var.getDensity() * 8.0f;
                w03 w03VarA = z03.a();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(density)) << 32) | (((long) Float.floatToRawIntBits(density)) & 4294967295L);
                w03.b(w03VarA, r8x.t(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))));
                return pi9Var.a(new ny2((Object) w03VarA, (Object) a4xVar, f, (byte) 8));
            default:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                List listD0 = CollectionsKt.D0(a4xVar, 3);
                hczVar.f(listD0.size(), null, new vdr0(listD0, (byte) 13), new ugd(802480018, true, new y1t0(listD0, f)));
                return Unit.f46060a;
        }
    }
}
