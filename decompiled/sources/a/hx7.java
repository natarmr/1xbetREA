package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class hx7 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk0 f13801a;
    public final agk0 b;
    public final pz40 c;
    public final ArrayList d;
    public final ArrayList e;

    public hx7(pz40 pz40Var, agk0 agk0Var, agk0 agk0Var2) {
        agk0Var.getClass();
        agk0Var2.getClass();
        pz40Var.getClass();
        this.f13801a = agk0Var;
        this.b = agk0Var2;
        this.c = pz40Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        Object obj;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.d;
        if (size > 1) {
            obj = x9h0.f40510a;
        } else {
            obj = arrayList2.size() > 1 ? aah0.f525a : null;
        }
        this.c.setValue(obj);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) > 0.0f) {
            arrayList.add(Float.valueOf(Float.intBitsToFloat(i2)));
            if (arrayList.size() <= 1) {
                return 0L;
            }
            arrayList2.clear();
            return 0L;
        }
        arrayList2.add(Float.valueOf(Float.intBitsToFloat(i2)));
        if (arrayList2.size() > 1) {
            arrayList.clear();
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        agk0 agk0Var = this.b;
        float fC = l1e0.c(agk0Var.l() - fIntBitsToFloat, 0.0f, this.f13801a.l());
        float fL = fC - agk0Var.l();
        agk0Var.m(fC);
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(-fL)) & 4294967295L);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        int i2 = (int) (4294967295L & j2);
        if (Float.intBitsToFloat(i2) <= 0.0f || this.e.isEmpty()) {
            return 0L;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        agk0 agk0Var = this.b;
        float fC = l1e0.c(agk0Var.l() - fIntBitsToFloat2, 0.0f, this.f13801a.l());
        float fL = fC - agk0Var.l();
        agk0Var.m(fC);
        Float.floatToRawIntBits(fIntBitsToFloat);
        Float.floatToRawIntBits(-fL);
        return 0L;
    }
}
