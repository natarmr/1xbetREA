package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class y480 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w03 f41989a;
    public final /* synthetic */ long b;
    public final /* synthetic */ v12 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public y480(w03 w03Var, long j, v12 v12Var, long j2, float f, float f2) {
        this.f41989a = w03Var;
        this.b = j;
        this.c = v12Var;
        this.d = j2;
        this.e = f;
        this.f = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fhl fhlVar = (fhl) obj;
        fhlVar.getClass();
        fhl.C0(fhlVar, this.f41989a, this.b, 0.0f, null, 60);
        v12 v12Var = v12.f36608a;
        v12 v12Var2 = this.c;
        if (v12Var2 == v12Var || v12Var2 == v12.b) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
            float f = this.f / 2.0f;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.e)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - f)) & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - f;
            fhl.Q(fhlVar, this.d, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat3))), this.f, 0, null, 496);
        }
        return Unit.f46060a;
    }
}
