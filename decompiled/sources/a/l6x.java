package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l6x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19529a;
    public final /* synthetic */ s4u0 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;

    public /* synthetic */ l6x(s4u0 s4u0Var, cms0 cms0Var, Object obj, cms0 cms0Var2, byte b) {
        this.f19529a = b;
        this.b = s4u0Var;
        this.c = cms0Var;
        this.d = cms0Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f19529a;
        l7m0 l7m0Var = this.d;
        l7m0 l7m0Var2 = this.c;
        s4u0 s4u0Var = this.b;
        fhl fhlVar = (fhl) obj;
        switch (b) {
            case 0:
                fhlVar.getClass();
                float fW0 = fhlVar.w0(((ycl) l7m0Var2.getValue()).f42389a);
                i6x i6xVar = i6x.f14263a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - fhlVar.w0(3.0f);
                ((fvt0) fhlVar.A0().b).A(fW0, fIntBitsToFloat);
                try {
                    float fW1 = fhlVar.w0(((ycl) l7m0Var.getValue()).f42389a);
                    s4u0Var.e(fhlVar, (((long) Float.floatToRawIntBits(fhlVar.w0(3.0f))) & 4294967295L) | (Float.floatToRawIntBits(fW1) << 32), 1.0f, null);
                    return Unit.f46060a;
                } finally {
                    ((fvt0) fhlVar.A0().b).A(-fW0, -fIntBitsToFloat);
                }
            default:
                fhlVar.getClass();
                float fW2 = fhlVar.w0(((ycl) l7m0Var2.getValue()).f42389a);
                j6x j6xVar = j6x.f16011a;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - fhlVar.w0(2.0f);
                ((fvt0) fhlVar.A0().b).A(fW2, fIntBitsToFloat2);
                try {
                    float fW3 = fhlVar.w0(((ycl) l7m0Var.getValue()).f42389a);
                    s4u0Var.e(fhlVar, (((long) Float.floatToRawIntBits(fhlVar.w0(2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fW3) << 32), 1.0f, null);
                    return Unit.f46060a;
                } finally {
                    ((fvt0) fhlVar.A0().b).A(-fW2, -fIntBitsToFloat2);
                }
        }
    }
}
