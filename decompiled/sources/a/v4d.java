package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class v4d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f36771a = new zfn(new zxb((byte) 27), (byte) 1);
    public static final zfn b = new zfn(new zxb((byte) 28), (byte) 1);

    public static final long a(t4d t4dVar, long j) {
        long j2 = t4dVar.f33315a;
        long j3 = t4dVar.U;
        long j4 = t4dVar.Q;
        long j5 = t4dVar.M;
        long j6 = t4dVar.q;
        int i = y3d.h;
        if (h2t0.a(j, j2)) {
            return t4dVar.b;
        }
        if (h2t0.a(j, t4dVar.f)) {
            return t4dVar.g;
        }
        if (h2t0.a(j, t4dVar.j)) {
            return t4dVar.k;
        }
        if (h2t0.a(j, t4dVar.n)) {
            return t4dVar.o;
        }
        if (h2t0.a(j, t4dVar.w)) {
            return t4dVar.x;
        }
        if (h2t0.a(j, t4dVar.c)) {
            return t4dVar.d;
        }
        if (h2t0.a(j, t4dVar.h)) {
            return t4dVar.i;
        }
        if (h2t0.a(j, t4dVar.l)) {
            return t4dVar.m;
        }
        if (h2t0.a(j, t4dVar.y)) {
            return t4dVar.z;
        }
        if (h2t0.a(j, t4dVar.u)) {
            return t4dVar.v;
        }
        if (h2t0.a(j, t4dVar.p)) {
            return j6;
        }
        if (h2t0.a(j, t4dVar.r)) {
            return t4dVar.s;
        }
        if (h2t0.a(j, t4dVar.D) || h2t0.a(j, t4dVar.F) || h2t0.a(j, t4dVar.G) || h2t0.a(j, t4dVar.H) || h2t0.a(j, t4dVar.I) || h2t0.a(j, t4dVar.J) || h2t0.a(j, t4dVar.E)) {
            return j6;
        }
        if (h2t0.a(j, t4dVar.K) || h2t0.a(j, t4dVar.L)) {
            return j5;
        }
        if (h2t0.a(j, t4dVar.O) || h2t0.a(j, t4dVar.P)) {
            return j4;
        }
        if (h2t0.a(j, t4dVar.S) || h2t0.a(j, t4dVar.T)) {
            return j3;
        }
        int i2 = y3d.h;
        return y3d.g;
    }

    public static final long b(long j, fet fetVar) {
        fetVar.e0(89374938);
        long jA = a((t4d) fetVar.k(f36771a), j);
        if (jA == 16) {
            jA = ((y3d) fetVar.k(yde.f42431a)).f41946a;
        }
        fetVar.r(false);
        return jA;
    }

    public static final long c(t4d t4dVar, u4d u4dVar) {
        switch (u4dVar.ordinal()) {
            case 0:
                return t4dVar.n;
            case 1:
                return t4dVar.w;
            case 2:
                return t4dVar.y;
            case 3:
                return t4dVar.v;
            case 4:
                return t4dVar.e;
            case 5:
                return t4dVar.u;
            case 6:
                return t4dVar.o;
            case 7:
                return t4dVar.x;
            case 8:
                return t4dVar.z;
            case 9:
                return t4dVar.b;
            case 10:
                return t4dVar.d;
            case 11:
                return t4dVar.M;
            case 12:
                return t4dVar.N;
            case 13:
                return t4dVar.g;
            case 14:
                return t4dVar.i;
            case 15:
                return t4dVar.Q;
            case 16:
                return t4dVar.R;
            case 17:
                return t4dVar.q;
            case 18:
                return t4dVar.s;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return t4dVar.k;
            case 20:
                return t4dVar.m;
            case 21:
                return t4dVar.U;
            case 22:
                return t4dVar.V;
            case 23:
                return t4dVar.A;
            case 24:
                return t4dVar.B;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return t4dVar.f33315a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return t4dVar.c;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return t4dVar.K;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return t4dVar.L;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return t4dVar.C;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return t4dVar.f;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return t4dVar.h;
            case 32:
                return t4dVar.O;
            case 33:
                return t4dVar.P;
            case 34:
                return t4dVar.p;
            case 35:
                return t4dVar.D;
            case 36:
                return t4dVar.F;
            case 37:
                return t4dVar.G;
            case 38:
                return t4dVar.H;
            case 39:
                return t4dVar.I;
            case 40:
                return t4dVar.J;
            case 41:
                return t4dVar.E;
            case 42:
                return t4dVar.t;
            case 43:
                return t4dVar.r;
            case 44:
                return t4dVar.j;
            case 45:
                return t4dVar.l;
            case 46:
                return t4dVar.S;
            case 47:
                return t4dVar.T;
            default:
                t9f.b();
                return 0L;
        }
    }

    public static final long d(u4d u4dVar, fet fetVar) {
        return c((t4d) fetVar.k(f36771a), u4dVar);
    }
}
