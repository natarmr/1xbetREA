package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public abstract class bsn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uts0 f3138a;
    public static final uts0 b;
    public static final uts0 c;

    static {
        zsf zsfVar = new zsf(0.4f, 0.0f, 0.6f, 1.0f);
        f3138a = new uts0(120, 0, ihn.f14788a);
        b = new uts0(150, 0, zsfVar);
        c = new uts0(120, 0, zsfVar);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
  0x0009: PHI (r1v3 a.uts0) = (r1v0 a.uts0), (r1v0 a.uts0), (r1v0 a.uts0), (r1v4 a.uts0), (r1v4 a.uts0), (r1v4 a.uts0), (r1v4 a.uts0) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(t33 t33Var, float f, nlx nlxVar, nlx nlxVar2, zje zjeVar) {
        uts0 uts0Var;
        uts0 uts0Var2 = null;
        if (nlxVar2 != null) {
            boolean z = nlxVar2 instanceof jub0;
            uts0Var = f3138a;
            if (z || (nlxVar2 instanceof nel) || (nlxVar2 instanceof rsw) || (nlxVar2 instanceof qpq)) {
                uts0Var2 = uts0Var;
            }
        } else if (nlxVar != null) {
            boolean z2 = nlxVar instanceof jub0;
            uts0Var = b;
            if (z2 || (nlxVar instanceof nel)) {
                uts0Var2 = uts0Var;
            } else if (nlxVar instanceof rsw) {
                uts0Var2 = c;
            } else if (nlxVar instanceof qpq) {
                uts0Var2 = uts0Var;
            }
        }
        uts0 uts0Var3 = uts0Var2;
        if (uts0Var3 != null) {
            Object objA = t33.a(t33Var, new ycl(f), uts0Var3, null, null, zjeVar, 12);
            return objA == wne.f39444a ? objA : Unit.f46060a;
        }
        Object objF = t33Var.f(zjeVar, new ycl(f));
        return objF == wne.f39444a ? objF : Unit.f46060a;
    }
}
