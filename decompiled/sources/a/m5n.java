package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m5n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21228a;
    public final /* synthetic */ long b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ m5n(long j, l7m0 l7m0Var, byte b) {
        this.f21228a = b;
        this.b = j;
        this.c = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f21228a;
        l7m0 l7m0Var = this.c;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                fhl.o0(fhlVar, ((y3d) l7m0Var.getValue()).f41946a, 0L, 0L, this.b, null, 246);
                break;
            case 1:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                float fW0 = fhlVar2.w0(((ycl) l7m0Var.getValue()).f42389a);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) & 4294967295L) | (Float.floatToRawIntBits(fW0) << 32);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar2.d() & 4294967295L)) - (fhlVar2.w0(((ycl) l7m0Var.getValue()).f42389a) * 2.0f);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
                long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L;
                fhl.o0(fhlVar2, this.b, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32), h7k0.a(fhlVar2.d(), 0.0f, fhlVar2.w0(1.0f) + (fhlVar2.w0(((ycl) l7m0Var.getValue()).f42389a) * 2.0f), 1), jFloatToRawIntBits, null, 240);
                break;
            default:
                fhl.u((fhl) obj, this.b, 0L, 0L, l1e0.c(((Number) l7m0Var.getValue()).floatValue(), 0.0f, 1.0f), null, null, 0, 118);
                break;
        }
        return Unit.f46060a;
    }
}
