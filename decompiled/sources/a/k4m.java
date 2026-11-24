package a;

import android.javax.sip.message.Response;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f17676a = q3d.j(100, 0, 75, 0, 0, 0, 75, 0, 100);
    public static final List b = q3d.j(0, 2, 6, 8);
    public static final float c;
    public static final float d;

    static {
        zcl zclVar = qmk.f28987a;
        c = 36.0f;
        d = 32.0f;
    }

    public static final a9q0 a(w6k w6kVar, g9q0 g9q0Var, String str) {
        float f;
        long j = qmk.p;
        long j2 = qmk.o;
        long j3 = qmk.n;
        float f2 = c;
        float fW0 = w6kVar.w0(f2);
        float fC = daq0.c(j);
        a9q0 a9q0VarA = g9q0.a(g9q0Var, str, new y9q0(0L, j, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), 0, 1, 0L, null, 1004);
        float f3 = fC;
        while (true) {
            f = (int) (a9q0VarA.c >> 32);
            if (f <= fW0 || f3 <= daq0.c(j2)) {
                break;
            }
            float fC2 = f3 - daq0.c(j3);
            f3 = fC2;
            a9q0VarA = g9q0.a(g9q0Var, str, y9q0.a(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), 0L, idm0.v(fC2, 4294967296L), null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 1, 0L, null, 1004);
        }
        if (f <= fW0) {
            return a9q0VarA;
        }
        return g9q0.a(g9q0Var, str, y9q0.a(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), 0L, idm0.v(f3, 4294967296L), null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 2, 1, lgb.O(0, w6kVar.T(f2), w6kVar.T(12.0f), w6kVar.T(12.0f)), null, 968);
    }

    public static final int b(w4m w4mVar) {
        n0o0 n0o0Var = u4m.f35057a;
        Iterator<E> it = w4mVar.f38547a.iterator();
        if (!it.hasNext()) {
            itt0.a();
            return 0;
        }
        int iAbs = Math.abs(((v4m) it.next()).b);
        while (it.hasNext()) {
            int iAbs2 = Math.abs(((v4m) it.next()).b);
            if (iAbs < iAbs2) {
                iAbs = iAbs2;
            }
        }
        int i = 100;
        int i2 = 1000;
        if (iAbs <= 1000) {
            i2 = 1;
        } else if (iAbs <= 10000) {
            i2 = 10;
        } else if (iAbs <= 100000) {
            i2 = 100;
        } else if (iAbs > 1000000) {
            i2 = 10000;
        }
        if (iAbs <= i2 * 100) {
            i = 25;
        } else if (iAbs <= i2 * Response.OK) {
            i = 50;
        } else if (iAbs > i2 * Response.BAD_REQUEST) {
            if (iAbs <= i2 * Response.BUSY_EVERYWHERE) {
                i = 150;
            } else if (iAbs <= i2 * 800) {
                i = Response.OK;
            } else {
                i = iAbs <= i2 * 1000 ? 250 : 500;
            }
        }
        return i * i2;
    }
}
