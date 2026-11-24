package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yjf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42737a;
    public final /* synthetic */ ekf0 b;

    public /* synthetic */ yjf0(ekf0 ekf0Var, byte b) {
        this.f42737a = b;
        this.b = ekf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jH;
        long j;
        byte b = this.f42737a;
        float fZ = 0.0f;
        ekf0 ekf0Var = this.b;
        switch (b) {
            case 0:
                gkf0 gkf0VarB = ekf0Var.b();
                if (gkf0VarB != null) {
                    mcz mczVar = (mcz) ekf0Var.f7949a.e().f15470a;
                    int iOrdinal = mczVar.q.ordinal();
                    if (iOrdinal == 0) {
                        jH = mczVar.h() & 4294967295L;
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        jH = mczVar.h() >> 32;
                    }
                    long jA = gkf0VarB.a();
                    fZ = (((int) jH) - zdx.z((((long) Float.floatToRawIntBits((int) (jA >> 32))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((int) (jA & 4294967295L)))), ekf0Var.d())) - 1.0f;
                }
                return Float.valueOf(fZ);
            case 1:
                gkf0 gkf0VarB2 = ekf0Var.b();
                if (gkf0VarB2 != null) {
                    long jA2 = gkf0VarB2.a();
                    float fZ2 = zdx.z((((long) Float.floatToRawIntBits((int) (jA2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jA2 & 4294967295L))) & 4294967295L), ekf0Var.d());
                    long jB = gkf0VarB2.b();
                    int iOrdinal2 = ekf0Var.d().ordinal();
                    if (iOrdinal2 == 0) {
                        j = jB & 4294967295L;
                    } else {
                        if (iOrdinal2 != 1) {
                            t9f.b();
                            return null;
                        }
                        j = jB >> 32;
                    }
                    fZ = (fZ2 + ((int) j)) - 1.0f;
                }
                return Float.valueOf(fZ);
            case 2:
                return Boolean.valueOf(((hgk0) ekf0Var.j).getValue() != null);
            default:
                return ekf0Var.f7949a.e();
        }
    }
}
