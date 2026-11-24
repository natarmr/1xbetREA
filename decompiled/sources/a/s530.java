package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class s530 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2s f31637a;
    public final agk0 b;
    public final pz40 c;
    public final pz40 d;
    public final ArrayList e;
    public final ArrayList f;

    public s530(k2s k2sVar, agk0 agk0Var, pz40 pz40Var, pz40 pz40Var2) {
        agk0Var.getClass();
        pz40Var.getClass();
        pz40Var2.getClass();
        this.f31637a = k2sVar;
        this.b = agk0Var;
        this.c = pz40Var;
        this.d = pz40Var2;
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
            obj = y9h0.f42246a;
        } else {
            obj = arrayList2.size() > 1 ? bah0.f2257a : null;
        }
        this.c.setValue(obj);
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
            if (!((Boolean) this.d.getValue()).booleanValue()) {
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(a(Float.intBitsToFloat(i2)))) & 4294967295L);
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
        float fA = a(Float.intBitsToFloat(i2));
        Float.floatToRawIntBits(fIntBitsToFloat);
        Float.floatToRawIntBits(fA);
        return 0L;
    }

    public final float a(float f) {
        agk0 agk0Var = this.b;
        float fC = l1e0.c(agk0Var.l() - f, 0.0f, ((Number) this.f31637a.invoke()).floatValue());
        float fL = fC - agk0Var.l();
        agk0Var.m(fC);
        return -fL;
    }
}
