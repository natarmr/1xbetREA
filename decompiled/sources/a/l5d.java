package a;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l5d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19448a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long g;

    public /* synthetic */ l5d(float f, long j, boolean z, float f2, float f3, float f4) {
        this.c = f;
        this.g = j;
        this.b = z;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char c;
        byte b = this.f19448a;
        long j = this.g;
        float f = this.f;
        float f2 = this.e;
        float f3 = this.d;
        float f4 = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                int iU = fbc.U(f4 > 0.0f ? y3d.c(f4, j) : j);
                int iU2 = fbc.U(y3d.c(0.0f, j));
                x5a x5aVarI = fhlVar.A0().i();
                if (z) {
                    x5aVarI.f((-fhlVar.w0(f3)) * 2.0f, ((-fhlVar.w0(f3)) * 2.0f) - fhlVar.w0(f2), (fhlVar.w0(f3) * 2.0f) + Float.intBitsToFloat((int) (fhlVar.d() >> 32)), Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)), 1);
                }
                ucs0 ucs0VarD = saj.D();
                Paint paint = (Paint) ucs0VarD.c;
                paint.setColor(iU2);
                paint.setShadowLayer(fhlVar.w0(f3), fhlVar.w0(0.0f), fhlVar.w0(f2), iU);
                x5aVarI.d(0.0f, 0.0f, Float.intBitsToFloat((int) (fhlVar.d() >> 32)), Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)), fhlVar.w0(f), fhlVar.w0(f), ucs0VarD);
                break;
            default:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                x5a x5aVarI2 = fhlVar2.A0().i();
                if (z) {
                    c = ' ';
                    x5aVarI2.f((-fhlVar2.w0(f4)) * 2.0f, ((-fhlVar2.w0(f4)) * 2.0f) - fhlVar2.w0(f3), (fhlVar2.w0(f4) * 2.0f) + Float.intBitsToFloat((int) (fhlVar2.d() >> 32)), Float.intBitsToFloat((int) (fhlVar2.d() & 4294967295L)), 1);
                } else {
                    c = ' ';
                }
                ucs0 ucs0VarD2 = saj.D();
                Paint paint2 = (Paint) ucs0VarD2.c;
                float fW0 = fhlVar2.w0(f2);
                float f5 = 0.0f - fW0;
                float fW1 = fhlVar2.w0(0.0f) + f5;
                float fW2 = fhlVar2.w0(f3) + f5;
                float fW3 = fhlVar2.w0(0.0f) + Float.intBitsToFloat((int) (fhlVar2.d() >> c)) + fW0;
                float fW4 = fhlVar2.w0(f3) + Float.intBitsToFloat((int) (fhlVar2.d() & 4294967295L)) + fW0;
                if (!ycl.b(f, 0.0f)) {
                    paint2.setMaskFilter(new BlurMaskFilter(fhlVar2.w0(f4), BlurMaskFilter.Blur.NORMAL));
                }
                paint2.setColor(fbc.U(j));
                x5aVarI2.d(fW1, fW2, fW3, fW4, fhlVar2.w0(f), fhlVar2.w0(f), ucs0VarD2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ l5d(boolean z, float f, float f2, float f3, float f4, long j) {
        this.b = z;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = j;
    }
}
