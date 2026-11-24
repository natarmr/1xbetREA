package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class k1t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f17545a = new zfn(new xns0((byte) 10), (byte) 1);

    public static final y9q0 a(i1t0 i1t0Var, fet fetVar) {
        h1t0 h1t0Var = (h1t0) fetVar.k(f17545a);
        switch (i1t0Var.ordinal()) {
            case 0:
                return h1t0Var.j;
            case 1:
                return h1t0Var.k;
            case 2:
                return h1t0Var.l;
            case 3:
                return h1t0Var.f12301a;
            case 4:
                return h1t0Var.b;
            case 5:
                return h1t0Var.c;
            case 6:
                return h1t0Var.d;
            case 7:
                return h1t0Var.e;
            case 8:
                return h1t0Var.f;
            case 9:
                return h1t0Var.m;
            case 10:
                return h1t0Var.n;
            case 11:
                return h1t0Var.o;
            case 12:
                return h1t0Var.g;
            case 13:
                return h1t0Var.h;
            case 14:
                return h1t0Var.i;
            case 15:
                return h1t0Var.y;
            case 16:
                return h1t0Var.z;
            case 17:
                return h1t0Var.A;
            case 18:
                return h1t0Var.p;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return h1t0Var.q;
            case 20:
                return h1t0Var.r;
            case 21:
                return h1t0Var.s;
            case 22:
                return h1t0Var.t;
            case 23:
                return h1t0Var.u;
            case 24:
                return h1t0Var.B;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return h1t0Var.C;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return h1t0Var.D;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return h1t0Var.v;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return h1t0Var.w;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return h1t0Var.x;
            default:
                t9f.b();
                return null;
        }
    }
}
