package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n2d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22792a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ n2d(Function0 function0, long j, long j2, byte b) {
        this.f22792a = b;
        this.b = function0;
        this.c = j;
        this.d = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        long j;
        byte b = this.f22792a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                g7zVar.a();
                fhl.u(g7zVar, fbc.P(((Number) function0.invoke()).floatValue(), this.c, this.d), 0L, 0L, 0.0f, null, null, 9, 62);
                return Unit.f46060a;
            default:
                long j2 = this.d;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                float fFloatValue = ((Number) function0.invoke()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / 2.0f;
                w03 w03VarA = z03.a();
                jge0 jge0VarR = k9x.r(0L, fhlVar.d());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                w03.b(w03VarA, r8x.t(jge0VarR.f16474a, jge0VarR.b, jge0VarR.c, jge0VarR.d, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))));
                fhl.C0(fhlVar, w03VarA, this.c, 0.0f, null, 60);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() >> 32)) * fFloatValue;
                nr nrVarA0 = fhlVar.A0();
                long jP = nrVarA0.p();
                nrVarA0.i().l();
                try {
                    ((fvt0) nrVarA0.b).i(w03VarA);
                    try {
                        fhl.u(fhlVar, j2, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32), 0.0f, null, null, 0, 120);
                        defpackage.c.g(nrVarA0, jP);
                        return Unit.f46060a;
                    } catch (Throwable th) {
                        th = th;
                        j = jP;
                        defpackage.c.g(nrVarA0, j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = jP;
                }
                break;
        }
    }
}
