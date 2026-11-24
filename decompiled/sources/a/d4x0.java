package a;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class d4x0 extends u5x0 {
    public final HashMap e;
    public final rvw0 f;
    public final rvw0 g;
    public final rvw0 h;
    public final rvw0 i;
    public final rvw0 j;
    public final rvw0 k;

    public d4x0(m6x0 m6x0Var) {
        super(m6x0Var);
        this.e = new HashMap();
        wvw0 wvw0Var = ((kxw0) this.b).e;
        kxw0.e(wvw0Var);
        this.f = new rvw0(wvw0Var, "last_delete_stale", 0L);
        wvw0 wvw0Var2 = ((kxw0) this.b).e;
        kxw0.e(wvw0Var2);
        this.g = new rvw0(wvw0Var2, "last_delete_stale_batch", 0L);
        wvw0 wvw0Var3 = ((kxw0) this.b).e;
        kxw0.e(wvw0Var3);
        this.h = new rvw0(wvw0Var3, "backoff", 0L);
        wvw0 wvw0Var4 = ((kxw0) this.b).e;
        kxw0.e(wvw0Var4);
        this.i = new rvw0(wvw0Var4, "last_upload", 0L);
        wvw0 wvw0Var5 = ((kxw0) this.b).e;
        kxw0.e(wvw0Var5);
        this.j = new rvw0(wvw0Var5, "last_upload_attempt", 0L);
        wvw0 wvw0Var6 = ((kxw0) this.b).e;
        kxw0.e(wvw0Var6);
        this.k = new rvw0(wvw0Var6, "midnight_offset", 0L);
    }

    public final Pair q1(com.google.android.gms.measurement.internal.zzr zzrVar, xyw0 xyw0Var) {
        String str = zzrVar.f45550a;
        s0x.E(str);
        return (xyw0Var.i(wyw0.AD_STORAGE) && zzrVar.n) ? r1(str) : new Pair("", Boolean.FALSE);
    }

    public final Pair r1(String str) throws Throwable {
        c4x0 c4x0Var;
        t40 t40VarA;
        m1();
        kxw0 kxw0Var = (kxw0) this.b;
        lwf lwfVar = kxw0Var.k;
        bkw0 bkw0Var = kxw0Var.d;
        lwfVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.e;
        c4x0 c4x0Var2 = (c4x0) map.get(str);
        if (c4x0Var2 != null && jElapsedRealtime < c4x0Var2.c) {
            return new Pair(c4x0Var2.f3744a, Boolean.valueOf(c4x0Var2.b));
        }
        long jU1 = bkw0Var.u1(str, btw0.b) + jElapsedRealtime;
        try {
            try {
                t40VarA = u40.a(kxw0Var.f19080a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (c4x0Var2 != null && jElapsedRealtime < c4x0Var2.c + bkw0Var.u1(str, btw0.c)) {
                    return new Pair(c4x0Var2.f3744a, Boolean.valueOf(c4x0Var2.b));
                }
                t40VarA = null;
            }
            if (t40VarA == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = t40VarA.c;
            c4x0Var = str2 != null ? new c4x0(str2, jU1, t40VarA.b) : new c4x0("", jU1, t40VarA.b);
            map.put(str, c4x0Var);
            return new Pair(c4x0Var.f3744a, Boolean.valueOf(c4x0Var.b));
        } catch (Exception e) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.n.b(e, "Unable to get advertising id");
            c4x0Var = new c4x0("", jU1, false);
        }
    }

    public final String s1(com.google.android.gms.measurement.internal.zzr zzrVar, xyw0 xyw0Var) {
        String str = zzrVar.f45550a;
        s0x.E(str);
        if (!xyw0Var.i(wyw0.AD_STORAGE) || !zzrVar.n) {
            return "";
        }
        m1();
        String str2 = (String) r1(str).first;
        MessageDigest messageDigestF1 = x6x0.F1();
        if (messageDigestF1 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestF1.digest(str2.getBytes())));
    }

    @Override // a.u5x0
    public final void p1() {
    }
}
