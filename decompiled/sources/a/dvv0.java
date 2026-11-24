package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dvv0 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ywv0 f6764a;
    public final l7m0 b;
    public boolean c;
    public boolean d;

    public dvv0(ywv0 ywv0Var, l7m0 l7m0Var) {
        ywv0Var.getClass();
        l7m0Var.getClass();
        this.f6764a = ywv0Var;
        this.b = l7m0Var;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!((Boolean) this.b.getValue()).booleanValue() || i != 1 || this.c) {
            return 0L;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        boolean z = this.d;
        ywv0 ywv0Var = this.f6764a;
        if (z) {
            ywv0Var.l.a(-fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        } else {
            hu5 hu5Var = (hu5) ywv0Var.c.d;
            if (hu5Var == null) {
                return 0L;
            }
            float f = hu5Var.c;
            if (fIntBitsToFloat >= 0.0f || ((Number) ((t33) ywv0Var.d.c).d()).floatValue() >= f) {
                return 0L;
            }
            this.d = true;
            ywv0Var.l.a(-fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        }
        return (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32);
    }

    @Override // a.vj50
    public final Object I0(long j, yje yjeVar) {
        List list;
        boolean z = this.c;
        long jA = 0;
        ywv0 ywv0Var = this.f6764a;
        if (z) {
            this.c = false;
            this.d = false;
            if (((Boolean) ((hgk0) ((pz40) ywv0Var.f.f21959a)).getValue()).booleanValue()) {
                ((q99) ywv0Var.l.j.c).f(new qxv0(0.0f));
            }
            return new g6u0(0L);
        }
        this.c = false;
        this.d = false;
        mkt0 mkt0Var = ywv0Var.f;
        hcp0 hcp0Var = ywv0Var.l.j;
        if (((Boolean) ((hgk0) ((pz40) mkt0Var.f21959a)).getValue()).booleanValue()) {
            fht0 fht0Var = ywv0Var.c;
            float fFloatValue = ((Number) ((t33) ywv0Var.d.c).d()).floatValue();
            hu5 hu5Var = (hu5) fht0Var.d;
            if (hu5Var == null || ((list = (List) hu5Var.e) != null && list.isEmpty())) {
                ((q99) hcp0Var.c).f(new qxv0(g6u0.c(j)));
                jA = g6u0.a(j, 0.0f, 0.0f, 2);
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (Math.abs(((fsv0) it.next()).b - fFloatValue) < 1.0f) {
                        ((q99) hcp0Var.c).f(new qxv0(0.0f));
                    }
                }
                ((q99) hcp0Var.c).f(new qxv0(g6u0.c(j)));
                jA = g6u0.a(j, 0.0f, 0.0f, 2);
            }
        }
        return new g6u0(jA);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        if (!((Boolean) this.b.getValue()).booleanValue() || i != 1) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (j & 4294967295L)) != 0.0f) {
            this.c = true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
        if (this.c || this.d || fIntBitsToFloat <= 0.0f) {
            return 0L;
        }
        this.d = true;
        this.f6764a.l.a(-fIntBitsToFloat);
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        this.c = false;
        this.d = false;
        return new g6u0(0L);
    }
}
