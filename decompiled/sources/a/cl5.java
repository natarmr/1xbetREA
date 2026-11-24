package a;

import android.content.Intent;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.authsdk.YandexAuthToken;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class cl5 implements jg9, cy9, kotlin.coroutines.f, uw00, d3h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4540a;

    public /* synthetic */ cl5(byte b) {
        this.f4540a = b;
    }

    public static double q(double d, double d2, double d3, boolean z) {
        double dAbs = z ? (Math.abs(1.0d / (1.0d - d2)) + 1.0d) * d : m7x.q(d, d2);
        return (d3 >= dAbs || d3 == 0.0d) ? dAbs : d3;
    }

    public static mvc r(String str) {
        Object next;
        c0o c0oVar = mvc.B;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (!((mvc) next).f22451a.equals(str));
        mvc mvcVar = (mvc) next;
        return mvcVar == null ? mvc.CMS_CODE_POPULAR : mvcVar;
    }

    public static ipb s(mcy mcyVar) {
        if (mcyVar != null) {
            if (mcyVar instanceof jdy) {
                jdy jdyVar = (jdy) mcyVar;
                if (jdyVar.c()) {
                    return ipb.e;
                }
                scx scxVar = ncy.f23316a;
                if (wsm0.b(jdyVar.b()) != null) {
                    return ipb.b;
                }
                return ncy.g(jdyVar) != null ? ipb.d : ipb.e;
            }
            if (mcyVar instanceof yby) {
                return ipb.c;
            }
            if (!(mcyVar instanceof edy) && !(mcyVar instanceof bdy)) {
                t9f.b();
                return null;
            }
        }
        return ipb.e;
    }

    public static double t(double d, double d2, double d3, boolean z, int i, q4f q4fVar) {
        q4fVar.getClass();
        int iOrdinal = q4fVar.ordinal();
        if (iOrdinal == 1) {
            return q(d, d2, d3, z);
        }
        if (iOrdinal != 3) {
            return q(d, d2, d3, false);
        }
        if (i == 0) {
            return 0.0d;
        }
        return m7x.p(m7x.q(d, d2), i);
    }

    @Override // a.d3h0
    public String a() {
        return "0";
    }

    @Override // a.d3h0
    public String b() {
        return "0";
    }

    @Override // a.cy9
    public int c() {
        return 1;
    }

    @Override // a.jg9
    public byte[] e(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // a.cy9
    public eoo0 f() {
        return eoo0.b;
    }

    @Override // a.cy9
    public long h() {
        return -1L;
    }

    @Override // a.d3h0
    public boolean i() {
        return false;
    }

    @Override // a.d3h0
    public boolean j() {
        return false;
    }

    @Override // a.uw00
    public YandexAuthToken k(Intent intent) {
        intent.getClass();
        return (YandexAuthToken) x2x.U(intent, "com.yandex.authsdk.EXTRA_TOKEN", YandexAuthToken.class);
    }

    @Override // a.uw00
    public d2w0 l(Intent intent) {
        intent.getClass();
        return (d2w0) x2x.V(intent);
    }

    @Override // a.cy9
    public zx9 m() {
        return zx9.f45147a;
    }

    @Override // a.cy9
    public ay9 o() {
        return ay9.f1660a;
    }

    @Override // a.cy9
    public yx9 p() {
        return yx9.f43409a;
    }

    public String toString() {
        switch (this.f4540a) {
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return "Empty";
            default:
                return super.toString();
        }
    }
}
