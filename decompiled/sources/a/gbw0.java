package a;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class gbw0 extends qnw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kxw0 f11033a;
    public final b1x0 b;

    public gbw0(kxw0 kxw0Var) {
        s0x.H(kxw0Var);
        this.f11033a = kxw0Var;
        b1x0 b1x0Var = kxw0Var.m;
        kxw0.f(b1x0Var);
        this.b = b1x0Var;
    }

    @Override // a.d1x0
    public final void a(Bundle bundle) {
        b1x0 b1x0Var = this.b;
        ((kxw0) b1x0Var.b).k.getClass();
        b1x0Var.y1(bundle, System.currentTimeMillis());
    }

    @Override // a.d1x0
    public final void b(String str) {
        kxw0 kxw0Var = this.f11033a;
        dqw0 dqw0Var = kxw0Var.n;
        kxw0.d(dqw0Var);
        kxw0Var.k.getClass();
        dqw0Var.o1(SystemClock.elapsedRealtime(), str);
    }

    @Override // a.d1x0
    public final void c(String str) {
        kxw0 kxw0Var = this.f11033a;
        dqw0 dqw0Var = kxw0Var.n;
        kxw0.d(dqw0Var);
        kxw0Var.k.getClass();
        dqw0Var.n1(SystemClock.elapsedRealtime(), str);
    }

    @Override // a.d1x0
    public final int d(String str) {
        b1x0 b1x0Var = this.b;
        b1x0Var.getClass();
        s0x.E(str);
        bkw0 bkw0Var = ((kxw0) b1x0Var.b).d;
        return 25;
    }

    @Override // a.d1x0
    public final void e(Bundle bundle, String str, String str2) {
        this.b.p1(bundle, str, str2);
    }

    @Override // a.d1x0
    public final Map f(String str, String str2, boolean z) {
        b1x0 b1x0Var = this.b;
        kxw0 kxw0Var = (kxw0) b1x0Var.b;
        fxw0 fxw0Var = kxw0Var.g;
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.g(fxw0Var);
        if (fxw0Var.s1()) {
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (svs0.e()) {
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        fxw0 fxw0Var2 = kxw0Var.g;
        kxw0.g(fxw0Var2);
        fxw0Var2.w1(atomicReference, 5000L, "get user properties", new mzw0(b1x0Var, atomicReference, str, str2, z));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            kxw0.g(uuw0Var);
            uuw0Var.g.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        gx3 gx3Var = new gx3(list.size());
        for (zzpl zzplVar : list) {
            Object objM = zzplVar.m();
            if (objM != null) {
                gx3Var.put(zzplVar.b, objM);
            }
        }
        return gx3Var;
    }

    @Override // a.d1x0
    public final void g(Bundle bundle, String str, String str2) {
        b1x0 b1x0Var = this.f11033a.m;
        kxw0.f(b1x0Var);
        b1x0Var.z1(bundle, str, str2);
    }

    @Override // a.d1x0
    public final List h(String str, String str2) {
        b1x0 b1x0Var = this.b;
        kxw0 kxw0Var = (kxw0) b1x0Var.b;
        fxw0 fxw0Var = kxw0Var.g;
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.g(fxw0Var);
        if (fxw0Var.s1()) {
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (svs0.e()) {
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        fxw0 fxw0Var2 = kxw0Var.g;
        kxw0.g(fxw0Var2);
        fxw0Var2.w1(atomicReference, 5000L, "get conditional user properties", new pb90(b1x0Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return x6x0.g2(list);
        }
        kxw0.g(uuw0Var);
        uuw0Var.g.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // a.d1x0
    public final String zzh() {
        c2x0 c2x0Var = ((kxw0) this.b.b).l;
        kxw0.f(c2x0Var);
        r1x0 r1x0Var = c2x0Var.d;
        if (r1x0Var != null) {
            return r1x0Var.f29705a;
        }
        return null;
    }

    @Override // a.d1x0
    public final String zzi() {
        c2x0 c2x0Var = ((kxw0) this.b.b).l;
        kxw0.f(c2x0Var);
        r1x0 r1x0Var = c2x0Var.d;
        if (r1x0Var != null) {
            return r1x0Var.b;
        }
        return null;
    }

    @Override // a.d1x0
    public final String zzj() {
        return (String) this.b.h.get();
    }

    @Override // a.d1x0
    public final String zzk() {
        return this.b.A1();
    }

    @Override // a.d1x0
    public final long zzl() {
        x6x0 x6x0Var = this.f11033a.i;
        kxw0.e(x6x0Var);
        return x6x0Var.k2();
    }
}
