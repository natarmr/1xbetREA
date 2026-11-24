package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final class zcg0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f44165a;
    public final /* synthetic */ int b;
    public final /* synthetic */ edg0 c;
    public final /* synthetic */ ddg0 d;
    public final /* synthetic */ k6z e;

    public zcg0(pz40 pz40Var, int i, edg0 edg0Var, ddg0 ddg0Var, k6z k6zVar) {
        this.f44165a = pz40Var;
        this.b = i;
        this.c = edg0Var;
        this.d = ddg0Var;
        this.e = k6zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fhl fhlVar = (fhl) obj;
        fhlVar.getClass();
        int i = ((apm) this.f44165a.getValue()).c;
        int i2 = this.b;
        edg0 edg0Var = this.c;
        long j = i == i2 ? edg0Var.f7616a : edg0Var.b;
        zcl zclVar = qmk.f28987a;
        float fW0 = fhlVar.w0(16.0f);
        fhl.o0(fhlVar, j, 0L, 0L, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), null, 246);
        if (this.d.a()) {
            float fT = fhlVar.T(12.0f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(this.e == k6z.b ? 0.0f : Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fT)) << 32);
            float f = fT / 2.0f;
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) + f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) + f)) & 4294967295L);
            pz40 pz40Var = s6t0.f31722a;
            fhl.E(fhlVar, StaticColors.INSTANCE.m121getTransparent0d7_KjU(), f, jFloatToRawIntBits2, 0.0f, null, 56);
        }
        return Unit.f46060a;
    }
}
