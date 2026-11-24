package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c63 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3799a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c63(long j, ArrayList arrayList, float f) {
        this.b = j;
        this.d = arrayList;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3799a;
        float f = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                long j = this.b;
                int i = p4e.i(j) / 2;
                int iH = p4e.h(j) / 2;
                pu90 pu90Var = (pu90) CollectionsKt.f0((ArrayList) obj2);
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, si30.b(i - (f / 2.0f)), iH - (pu90Var.b / 2), 0.0f);
                }
                break;
            case 1:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                for (st8 st8Var : (List) obj2) {
                    float f2 = st8Var.f32761a;
                    float f3 = st8Var.b;
                    float f4 = st8Var.c;
                    float f5 = st8Var.d;
                    boolean z = false;
                    boolean z2 = 0.0f <= f2 && f2 <= fIntBitsToFloat && f3 >= 0.0f && f3 <= fIntBitsToFloat2;
                    if (0.0f <= f4 && f4 <= fIntBitsToFloat && f5 >= 0.0f && f5 <= fIntBitsToFloat2) {
                        z = true;
                    }
                    if (z2 || z) {
                        fhl.Q(fhlVar, this.b, (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), this.c, 0, null, 496);
                    }
                }
                break;
            default:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                float fC = l1e0.c(((Number) ((t33) ((ywv0) obj2).d.c).d()).floatValue() / f, 0.0f, 1.0f);
                if (fC > 0.0f) {
                    fhl.u(fhlVar2, this.b, 0L, 0L, fC, null, null, 0, 118);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ c63(ywv0 ywv0Var, float f, long j) {
        this.d = ywv0Var;
        this.c = f;
        this.b = j;
    }

    public /* synthetic */ c63(List list, long j, float f) {
        this.d = list;
        this.b = j;
        this.c = f;
    }
}
