package a;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class hac implements guo, huo, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12717a;
    public long b;
    public Object c;

    public /* synthetic */ hac(wvw0 wvw0Var, long j) {
        this.f12717a = (byte) 8;
        this.c = wvw0Var;
        s0x.E("health_monitor");
        s0x.C(j > 0);
        this.b = j;
    }

    public static long u(hac hacVar, long j, float f) {
        long jF = ne60.f(hacVar.b, j);
        hacVar.b = jF;
        float fD = ((ma80) hacVar.c) == null ? ne60.d(jF) : Math.abs(hacVar.w(jF));
        if (fD <= 0.0f || fD < f) {
            return 9205357640488583168L;
        }
        ma80 ma80Var = (ma80) hacVar.c;
        long j2 = hacVar.b;
        if (ma80Var == null) {
            return ne60.e(hacVar.b, ne60.g(f, ne60.b(ne60.d(j2), j2)));
        }
        float fW = hacVar.w(j2) - (Math.signum(hacVar.w(hacVar.b)) * f);
        long j3 = hacVar.b;
        ma80 ma80Var2 = (ma80) hacVar.c;
        ma80 ma80Var3 = ma80.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ma80Var2 == ma80Var3 ? j3 & 4294967295L : j3 >> 32));
        if (((ma80) hacVar.c) == ma80Var3) {
            return (((long) Float.floatToRawIntBits(fW)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fW)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    public void A() {
        wvw0 wvw0Var = (wvw0) this.c;
        wvw0Var.m1();
        ((kxw0) wvw0Var.b).k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = wvw0Var.q1().edit();
        editorEdit.remove("health_monitor:count");
        editorEdit.remove("health_monitor:value");
        editorEdit.putLong("health_monitor:start", jCurrentTimeMillis);
        editorEdit.apply();
    }

    @Override // a.guo
    public boolean a(int i, boolean z) {
        return ((guo) this.c).a(i, true);
    }

    @Override // a.guo
    public boolean b(byte[] bArr, int i, int i2, boolean z) {
        return ((guo) this.c).b(bArr, i, i2, z);
    }

    @Override // a.huo
    public void f(fvh0 fvh0Var) {
        ((huo) this.c).f(new j5m0(this, fvh0Var, fvh0Var));
    }

    @Override // a.guo
    public void g() {
        ((guo) this.c).g();
    }

    @Override // a.guo
    public long getLength() {
        return ((guo) this.c).getLength() - this.b;
    }

    @Override // a.guo
    public long getPosition() {
        return ((guo) this.c).getPosition() - this.b;
    }

    @Override // a.guo
    public boolean h(byte[] bArr, int i, int i2, boolean z) {
        return ((guo) this.c).h(bArr, 0, i2, z);
    }

    @Override // a.guo
    public long i() {
        return ((guo) this.c).i() - this.b;
    }

    @Override // a.guo
    public void j(int i) {
        ((guo) this.c).j(i);
    }

    @Override // a.guo
    public int k(int i) {
        return ((guo) this.c).k(i);
    }

    @Override // a.guo
    public int l(byte[] bArr, int i, int i2) {
        return ((guo) this.c).l(bArr, i, i2);
    }

    @Override // a.guo
    public void m(int i) {
        ((guo) this.c).m(i);
    }

    @Override // a.guo
    public void n(byte[] bArr, int i, int i2) {
        ((guo) this.c).n(bArr, i, i2);
    }

    @Override // a.huo
    public void o() {
        ((huo) this.c).o();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ConnectionResult connectionResult;
        switch (this.f12717a) {
            case 6:
                xex xexVar = (xex) this.c;
                long j = this.b;
                xexVar.getClass();
                Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
                if ((exc instanceof qa3) && (connectionResult = ((qa3) exc).getStatus().d) != null && connectionResult.b == 24) {
                    ((AtomicLong) xexVar.b).set(j);
                    break;
                }
                break;
            default:
                ((AtomicLong) ((ykv0) this.c).c).set(this.b);
                break;
        }
    }

    public void p(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        hac hacVar = (hac) this.c;
        if (hacVar != null) {
            hacVar.p(i - 64);
        }
    }

    @Override // a.huo
    public ncs0 q(int i, int i2) {
        return ((huo) this.c).q(i, i2);
    }

    public int r(int i) {
        hac hacVar = (hac) this.c;
        if (hacVar == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + hacVar.r(i - 64);
    }

    @Override // a.bbj
    public int read(byte[] bArr, int i, int i2) {
        return ((guo) this.c).read(bArr, i, i2);
    }

    @Override // a.guo
    public void readFully(byte[] bArr, int i, int i2) {
        ((guo) this.c).readFully(bArr, i, i2);
    }

    public void s() {
        if (((hac) this.c) == null) {
            this.c = new hac();
        }
    }

    public boolean t(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        s();
        return ((hac) this.c).t(i - 64);
    }

    public String toString() {
        switch (this.f12717a) {
            case 0:
                if (((hac) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((hac) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public void v(int i, boolean z) {
        if (i >= 64) {
            s();
            ((hac) this.c).v(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            z(i);
        } else {
            p(i);
        }
        if (z2 || ((hac) this.c) != null) {
            s();
            ((hac) this.c).v(0, z2);
        }
    }

    public float w(long j) {
        return Float.intBitsToFloat((int) (((ma80) this.c) == ma80.b ? j >> 32 : j & 4294967295L));
    }

    public boolean x(int i) {
        if (i >= 64) {
            s();
            return ((hac) this.c).x(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        hac hacVar = (hac) this.c;
        if (hacVar != null) {
            if (hacVar.t(0)) {
                z(63);
            }
            ((hac) this.c).x(0);
        }
        return z;
    }

    public void y() {
        this.b = 0L;
        hac hacVar = (hac) this.c;
        if (hacVar != null) {
            hacVar.y();
        }
    }

    public void z(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            s();
            ((hac) this.c).z(i - 64);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hac(ma80 ma80Var) {
        this((Object) ma80Var, 0L, (byte) 5);
        this.f12717a = (byte) 5;
    }

    public /* synthetic */ hac(Object obj, long j, byte b) {
        this.f12717a = b;
        this.c = obj;
        this.b = j;
    }

    public /* synthetic */ hac(long j, Object obj, byte b) {
        this.f12717a = b;
        this.b = j;
        this.c = obj;
    }

    public hac(guo guoVar, long j) {
        this.f12717a = (byte) 3;
        this.c = guoVar;
        x0x.A(guoVar.getPosition() >= j);
        this.b = j;
    }

    public hac() {
        this.f12717a = (byte) 0;
        this.b = 0L;
    }
}
