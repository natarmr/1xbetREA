package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fs40 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10046a;
    public final /* synthetic */ lms0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fs40(lms0 lms0Var, byte b) {
        super(1);
        this.f10046a = b;
        this.b = lms0Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float interpolation;
        byte b = this.f10046a;
        lms0 lms0Var = this.b;
        switch (b) {
            case 0:
                long j = ((ne60) obj).f23370a;
                fms0 fms0Var = lms0Var.f20314a.i;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                yls0 yls0Var = fms0Var.f;
                boolean z = false;
                if (yls0Var != null) {
                    String str = yls0Var.d;
                    if (str == null) {
                        z = true;
                    } else {
                        ems0 ems0Var = (ems0) fms0Var.b.get(str);
                        if (ems0Var == null) {
                            System.err.println("mLimitBoundsTo target is null");
                        } else {
                            vdv0 vdv0Var = ems0Var.c;
                            if (fIntBitsToFloat >= vdv0Var.b && fIntBitsToFloat < vdv0Var.d && fIntBitsToFloat2 >= vdv0Var.c && fIntBitsToFloat2 < vdv0Var.e) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                long jLongValue = ((Number) obj).longValue();
                yls0 yls0Var2 = lms0Var.f20314a.i.f;
                if (yls0Var2 != null) {
                    interpolation = yls0Var2.c.getInterpolation((jLongValue - yls0Var2.q) * 1.0E-9f);
                    if (yls0Var2.c.b()) {
                        interpolation = yls0Var2.o;
                    }
                } else {
                    interpolation = 0.0f;
                }
                return Float.valueOf(interpolation);
        }
    }
}
