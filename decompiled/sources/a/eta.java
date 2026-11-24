package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eta implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8367a;
    public final /* synthetic */ cgk0 b;
    public final /* synthetic */ cgk0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ t33 e;
    public final /* synthetic */ l7m0 f;

    public /* synthetic */ eta(cgk0 cgk0Var, cgk0 cgk0Var2, int i, t33 t33Var, l7m0 l7m0Var, byte b) {
        this.f8367a = b;
        this.b = cgk0Var;
        this.c = cgk0Var2;
        this.d = i;
        this.e = t33Var;
        this.f = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long jM123getWhite0d7_KjU;
        long jM123getWhite0d7_KjU2;
        byte b = this.f8367a;
        l7m0 l7m0Var = this.f;
        t33 t33Var = this.e;
        int i = this.d;
        cgk0 cgk0Var = this.c;
        cgk0 cgk0Var2 = this.b;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(360.0f);
                long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(fW0))) | (((long) Float.floatToRawIntBits(fW0)) << 32);
                if (cgk0Var2.l() == -1 || cgk0Var.l() == -1) {
                    jM123getWhite0d7_KjU = i == ((Number) l7m0Var.getValue()).intValue() ? StaticColors.INSTANCE.m123getWhite0d7_KjU() : StaticColors.INSTANCE.m129getWhite400d7_KjU();
                } else if (i == cgk0Var2.l()) {
                    float fFloatValue = cgk0Var.l() > cgk0Var2.l() ? ((Number) t33Var.d()).floatValue() : 1.0f - ((Number) t33Var.d()).floatValue();
                    StaticColors staticColors = StaticColors.INSTANCE;
                    jM123getWhite0d7_KjU = j120.W(fFloatValue, staticColors.m123getWhite0d7_KjU(), staticColors.m129getWhite400d7_KjU());
                } else if (i == cgk0Var.l()) {
                    float fFloatValue2 = cgk0Var.l() > cgk0Var2.l() ? ((Number) t33Var.d()).floatValue() : 1.0f - ((Number) t33Var.d()).floatValue();
                    StaticColors staticColors2 = StaticColors.INSTANCE;
                    jM123getWhite0d7_KjU = j120.W(fFloatValue2, staticColors2.m129getWhite400d7_KjU(), staticColors2.m123getWhite0d7_KjU());
                } else {
                    jM123getWhite0d7_KjU = StaticColors.INSTANCE.m129getWhite400d7_KjU();
                }
                fhl.o0(fhlVar, jM123getWhite0d7_KjU, 0L, fhlVar.d(), jFloatToRawIntBits, null, 242);
                break;
            default:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                zcl zclVar2 = qmk.f28987a;
                float fW1 = fhlVar2.w0(14.0f);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fW1)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fW1)));
                if (cgk0Var2.l() == -1 || cgk0Var.l() == -1) {
                    jM123getWhite0d7_KjU2 = i == ((Number) l7m0Var.getValue()).intValue() ? StaticColors.INSTANCE.m123getWhite0d7_KjU() : StaticColors.INSTANCE.m129getWhite400d7_KjU();
                } else if (i == cgk0Var2.l()) {
                    float fFloatValue3 = cgk0Var.l() > cgk0Var2.l() ? ((Number) t33Var.d()).floatValue() : 1.0f - ((Number) t33Var.d()).floatValue();
                    StaticColors staticColors3 = StaticColors.INSTANCE;
                    jM123getWhite0d7_KjU2 = o050.O(fFloatValue3, staticColors3.m123getWhite0d7_KjU(), staticColors3.m129getWhite400d7_KjU());
                } else if (i == cgk0Var.l()) {
                    float fFloatValue4 = cgk0Var.l() > cgk0Var2.l() ? ((Number) t33Var.d()).floatValue() : 1.0f - ((Number) t33Var.d()).floatValue();
                    StaticColors staticColors4 = StaticColors.INSTANCE;
                    jM123getWhite0d7_KjU2 = o050.O(fFloatValue4, staticColors4.m129getWhite400d7_KjU(), staticColors4.m123getWhite0d7_KjU());
                } else {
                    jM123getWhite0d7_KjU2 = StaticColors.INSTANCE.m129getWhite400d7_KjU();
                }
                fhl.o0(fhlVar2, jM123getWhite0d7_KjU2, 0L, fhlVar2.d(), jFloatToRawIntBits2, null, 242);
                break;
        }
        return Unit.f46060a;
    }
}
