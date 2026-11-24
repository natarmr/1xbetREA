package a;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ix7 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xcz f15527a;
    public final float b;
    public final agk0 c;
    public final pz40 d;
    public final ArrayList e;
    public final ArrayList f;

    public ix7(xcz xczVar, float f, agk0 agk0Var, pz40 pz40Var) {
        xczVar.getClass();
        agk0Var.getClass();
        pz40Var.getClass();
        this.f15527a = xczVar;
        this.b = f;
        this.c = agk0Var;
        this.d = pz40Var;
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        Object obj;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        ArrayList arrayList2 = this.e;
        if (size > 1) {
            obj = z9h0.f44019a;
        } else {
            obj = arrayList2.size() > 1 ? cah0.f4011a : null;
        }
        this.d.setValue(obj);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) > 0.0f) {
            arrayList.add(Float.valueOf(Float.intBitsToFloat(i2)));
            if (arrayList.size() > 1) {
                arrayList2.clear();
                return 0L;
            }
        } else {
            arrayList2.add(Float.valueOf(Float.intBitsToFloat(i2)));
            if (arrayList2.size() > 1) {
                arrayList.clear();
            }
            xcz xczVar = this.f15527a;
            ncz nczVar = (ncz) CollectionsKt.firstOrNull(xczVar.j().l);
            if ((nczVar != null ? nczVar.l : null) != dja.BROADCASTING_ZONE) {
                ncz nczVar2 = (ncz) CollectionsKt.firstOrNull(xczVar.j().l);
                if ((nczVar2 != null ? nczVar2.l : null) != dja.BROADCASTING_VIDEO) {
                    float fIntBitsToFloat = Float.intBitsToFloat(i2);
                    agk0 agk0Var = this.c;
                    float fC = l1e0.c(agk0Var.l() - fIntBitsToFloat, 0.0f, this.b);
                    float fL = fC - agk0Var.l();
                    agk0Var.m(fC);
                    return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(-fL)) & 4294967295L);
                }
            }
        }
        return 0L;
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        int i2 = (int) (4294967295L & j2);
        if (Float.intBitsToFloat(i2) <= 0.0f || this.f.isEmpty()) {
            return 0L;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        agk0 agk0Var = this.c;
        float fC = l1e0.c(agk0Var.l() - fIntBitsToFloat2, 0.0f, this.b);
        float fL = fC - agk0Var.l();
        agk0Var.m(fC);
        Float.floatToRawIntBits(fIntBitsToFloat);
        Float.floatToRawIntBits(-fL);
        return 0L;
    }
}
