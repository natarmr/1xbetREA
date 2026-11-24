package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class swb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32914a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ swb(float f, xwb xwbVar, List list, int i, float f2, g9q0 g9q0Var) {
        this.c = f;
        this.e = xwbVar;
        this.f = list;
        this.b = i;
        this.d = f2;
        this.g = g9q0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iRound;
        byte b = this.f32914a;
        Object obj2 = this.g;
        float f = this.d;
        float f2 = this.c;
        int i = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                xwb xwbVar = (xwb) obj4;
                g9q0 g9q0Var = (g9q0) obj2;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                float fW0 = fhlVar.w0(f2);
                float fW1 = fhlVar.w0(40.0f);
                Iterator it = ((List) obj3).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    float f3 = (((iIntValue - i) / f) * fW0) + fW1;
                    a9q0 a9q0VarB = g9q0.b(g9q0Var, new j83(String.valueOf(iIntValue)), xwbVar.e, 0, false, 0, 0L, null, null, null, 2044);
                    long j = a9q0VarB.c;
                    long j2 = xwbVar.f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - ((int) (j >> 32));
                    zcl zclVar = qmk.f28987a;
                    v2n0.o(fhlVar, a9q0VarB, j2, (Float.floatToRawIntBits(fIntBitsToFloat - fhlVar.w0(16.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f3 - (((int) (j & 4294967295L)) / 2.0f)))), 248);
                }
                return Unit.f46060a;
            default:
                t33 t33Var = (t33) obj4;
                agk0 agk0Var = (agk0) obj3;
                t33 t33Var2 = (t33) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                if (((Number) t33Var.d()).floatValue() == 0.0f) {
                    iRound = Math.round((((Number) t33Var2.d()).floatValue() * ((((iIntValue2 - i) - f2) - f) - agk0Var.l())) + agk0Var.l());
                } else {
                    iRound = Math.round((1.0f - ((Number) t33Var.d()).floatValue()) * agk0Var.l());
                }
                return Integer.valueOf(iRound);
        }
    }

    public /* synthetic */ swb(t33 t33Var, agk0 agk0Var, int i, float f, float f2, t33 t33Var2) {
        this.e = t33Var;
        this.f = agk0Var;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.g = t33Var2;
    }
}
