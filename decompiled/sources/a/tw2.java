package a;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tw2 extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34627a;
    public final c1a b;
    public final int c;
    public final long d;
    public final cao0 e;
    public final gx9 f;
    public final ex9 g;
    public final jx9 h;
    public final qcq0 i;
    public final x34 j;
    public final CameraDevice.StateCallback k;
    public final chf0 l;
    public final int m;
    public final Object n;
    public boolean o;
    public sw2 p;
    public boolean q;
    public final CountDownLatch r;
    public final long s;
    public doq0 t;
    public final p7m0 u;

    public tw2(String str, c1a c1aVar, int i, long j, cao0 cao0Var, gx9 gx9Var, ex9 ex9Var, jx9 jx9Var, qcq0 qcq0Var, x34 x34Var, CameraDevice.StateCallback stateCallback, chf0 chf0Var) {
        str.getClass();
        c1aVar.getClass();
        cao0Var.getClass();
        gx9Var.getClass();
        ex9Var.getClass();
        jx9Var.getClass();
        qcq0Var.getClass();
        x34Var.getClass();
        this.f34627a = str;
        this.b = c1aVar;
        this.c = i;
        this.d = j;
        this.e = cao0Var;
        this.f = gx9Var;
        this.g = ex9Var;
        this.h = jx9Var;
        this.i = qcq0Var;
        this.j = x34Var;
        this.k = stateCallback;
        this.l = chf0Var;
        z04 z04Var = inu0.b;
        z04Var.getClass();
        this.m = z04.b.incrementAndGet(z04Var);
        this.n = new Object();
        this.r = new CountDownLatch(1);
        this.u = q7m0.a(y2a.f41894a);
        Log.i("CXCP", "Opening " + ((Object) g0a.b(str)));
        this.s = i != 1 ? SystemClock.elapsedRealtimeNanos() : j;
    }

    public static boolean e(jx9 jx9Var, String str, az9 az9Var) {
        jx9Var.getClass();
        str.getClass();
        jx9Var.b.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            return false;
        }
        b1a b1aVar = c1a.a0;
        c1a c1aVarA = jx9Var.f17293a.a(str);
        b1aVar.getClass();
        return b1a.c(c1aVarA) && az9Var == null;
    }

    public final void a() {
        p2a p2aVar = (p2a) this.u.getValue();
        yy9 yy9Var = p2aVar instanceof u2a ? ((u2a) p2aVar).f34935a : null;
        b(yy9Var != null ? (CameraDevice) yy9Var.H(sre0.f32672a.b(CameraDevice.class)) : null, new sw2(evc.f8460a, null, null, 14));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    public final void b(CameraDevice cameraDevice, sw2 sw2Var) {
        tw2 tw2Var;
        p2a p2aVar = (p2a) this.u.getValue();
        yy9 yy9Var = p2aVar instanceof u2a ? ((u2a) p2aVar).f34935a : null;
        synchronized (this.n) {
            if (this.p == null) {
                this.p = sw2Var;
                if (this.o) {
                    sw2Var = null;
                }
            } else {
                sw2Var = null;
            }
        }
        if (sw2Var != null) {
            az9 az9Var = sw2Var.c;
            if (az9Var != null && sw2Var.f32900a != evc.f) {
                this.f.a(this.f34627a, az9Var.f1706a, false);
            }
            this.u.o(null, new t2a(sw2Var.c));
            if (sw2Var.f32900a != evc.c) {
                jx9 jx9Var = this.h;
                String str = this.f34627a;
                boolean z = e(jx9Var, str, sw2Var.c) && jx9Var.a(str);
                if (z) {
                    synchronized (this.n) {
                        this.q = true;
                    }
                }
                tw2Var = this;
                this.g.a(yy9Var, cameraDevice, tw2Var, this.j, z, e(this.h, this.f34627a, sw2Var.c));
            } else {
                tw2Var = this;
            }
            tw2Var.u.o(null, tw2Var.c(sw2Var));
        }
    }

    public final s2a c(sw2 sw2Var) {
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        doq0 doq0Var = this.t;
        long j = sw2Var.b;
        zen zenVar = doq0Var != null ? new zen(doq0Var.f6426a - this.d) : null;
        zen zenVar2 = doq0Var != null ? new zen(doq0Var.f6426a - this.s) : null;
        zen zenVar3 = doq0Var == null ? null : new zen(j - doq0Var.f6426a);
        long j2 = jElapsedRealtimeNanos - j;
        evc evcVar = sw2Var.f32900a;
        int i = this.c - 1;
        return new s2a(this.f34627a, evcVar, Integer.valueOf(i), zenVar, sw2Var.d, zenVar2, zenVar3, new zen(j2), sw2Var.c);
    }

    public final void d(CameraDevice cameraDevice) {
        Trace.beginSection(((Object) g0a.b(this.f34627a)) + "#onFinalized");
        Log.d("CXCP", this + ": onFinalized");
        b(cameraDevice, new sw2(evc.c, null, null, 14));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        if (!Intrinsics.d(cameraDevice.getId(), this.f34627a)) {
            jf4.n("Check failed.");
            return;
        }
        Log.d("CXCP", ((Object) g0a.b(this.f34627a)) + ": onClosed");
        this.r.countDown();
        synchronized (this.n) {
            if (!this.q) {
                d(cameraDevice);
                return;
            }
            Log.i("CXCP", this + "#onClosed: Delaying finalizing.");
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.f34627a;
        if (!Intrinsics.d(id, str)) {
            jf4.n("Check failed.");
            return;
        }
        Trace.beginSection(((Object) g0a.b(str)) + "#onDisconnected");
        Log.d("CXCP", ((Object) g0a.b(str)) + ": onDisconnected");
        this.r.countDown();
        b(cameraDevice, new sw2(evc.d, new az9(6), null, 10));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.f34627a;
        if (!Intrinsics.d(id, str)) {
            jf4.n("Check failed.");
            return;
        }
        Trace.beginSection(((Object) g0a.b(str)) + "#onError-" + i);
        Log.d("CXCP", ((Object) g0a.b(str)) + ": onError " + i);
        this.r.countDown();
        evc evcVar = evc.e;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            jf4.o(twn.m(i, "Unexpected StateCallback error code: "));
                            return;
                        }
                    }
                }
            }
        }
        b(cameraDevice, new sw2(evcVar, new az9(i2), null, 10));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onError(cameraDevice, i);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        String strJ;
        sw2 sw2Var;
        sw2 sw2Var2;
        cameraDevice.getClass();
        if (!Intrinsics.d(cameraDevice.getId(), this.f34627a)) {
            jf4.n("Check failed.");
            return;
        }
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.t = new doq0(jElapsedRealtimeNanos);
        Trace.beginSection(((Object) g0a.b(this.f34627a)) + "#onOpened");
        long j = jElapsedRealtimeNanos - this.s;
        long j2 = jElapsedRealtimeNanos - this.d;
        int i = this.c;
        String str = this.f34627a;
        yje yjeVar = null;
        if (i == 1) {
            StringBuilder sb = new StringBuilder("Opened ");
            sb.append((Object) g0a.b(str));
            sb.append(" in ");
            strJ = cs0.o(new Object[]{Double.valueOf(j / 1000000.0d)}, 1, null, "%.3f ms", sb);
        } else {
            StringBuilder sb2 = new StringBuilder("Opened ");
            sb2.append((Object) g0a.b(str));
            sb2.append(" in ");
            sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1)));
            sb2.append(" (");
            sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1)));
            sb2.append(" total) after ");
            strJ = rz4.j(this.c, " attempts.", sb2);
        }
        Log.i("CXCP", strJ);
        synchronized (this.n) {
            sw2Var = this.p;
            if (sw2Var == null) {
                this.o = true;
            }
        }
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onOpened(cameraDevice);
        }
        if (sw2Var != null) {
            ex9 ex9Var = this.g;
            x34 x34Var = this.j;
            jx9 jx9Var = this.h;
            String str2 = this.f34627a;
            ex9Var.a(null, cameraDevice, this, x34Var, e(jx9Var, str2, sw2Var.c) && jx9Var.a(str2), e(this.h, this.f34627a, sw2Var.c));
            return;
        }
        nw2 nw2Var = new nw2(this.b, cameraDevice, this.f34627a, this.f, this.l, this.i);
        x34 x34Var2 = this.j;
        x34Var2.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            synchronized (x34Var2.c) {
                x34Var2.e.add(nw2Var);
                y34 y34VarA = x34Var2.a();
                if (y34VarA != null) {
                    vqc vqcVar = x34Var2.b;
                    sje sjeVar = x34Var2.f40198a;
                    cm3 cm3Var = new cm3(nw2Var, y34VarA, yjeVar, (byte) 5);
                    vqcVar.getClass();
                    sjeVar.getClass();
                    qjj.W(sjeVar, null, yne.d, new o3s((Object) vqcVar, (Object) cm3Var, yjeVar, (byte) 21), 1);
                }
            }
        }
        this.u.o(null, new u2a(nw2Var));
        synchronized (this.n) {
            this.o = false;
            sw2Var2 = this.p;
        }
        if (sw2Var2 != null) {
            this.u.o(null, new t2a(sw2Var2.c));
            ex9 ex9Var2 = this.g;
            x34 x34Var3 = this.j;
            jx9 jx9Var2 = this.h;
            String str3 = this.f34627a;
            ex9Var2.a(nw2Var, cameraDevice, this, x34Var3, e(jx9Var2, str3, sw2Var2.c) && jx9Var2.a(str3), e(this.h, this.f34627a, sw2Var2.c));
            this.u.o(null, c(sw2Var2));
        }
        Trace.endSection();
    }

    public final String toString() {
        return "CameraState-" + this.m;
    }
}
