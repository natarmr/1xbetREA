package a;

import android.util.Log;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class vjq implements jot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1a f37542a;
    public final i7m0 b;
    public final tpt0 c;
    public final dgr0 d;
    public final vpt0 e;
    public pot0 f;
    public volatile int g;
    public volatile kzw h;
    public odd i;

    public vjq(l1a l1aVar, i7m0 i7m0Var, tpt0 tpt0Var, dgr0 dgr0Var, vpt0 vpt0Var) {
        l1aVar.getClass();
        i7m0Var.getClass();
        tpt0Var.getClass();
        dgr0Var.getClass();
        this.f37542a = l1aVar;
        this.b = i7m0Var;
        this.c = tpt0Var;
        this.d = dgr0Var;
        this.e = vpt0Var;
        this.g = 2;
        ozb.j(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v1, types: [int, short] */
    public final Object a(long j, zje zjeVar) {
        pjq pjqVar;
        vjq vjqVar;
        odd oddVar;
        long j2;
        if (zjeVar instanceof pjq) {
            pjqVar = (pjq) zjeVar;
            int i = pjqVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjqVar.m = i - Integer.MIN_VALUE;
            } else {
                pjqVar = new pjq(this, zjeVar);
            }
        } else {
            pjqVar = new pjq(this, zjeVar);
        }
        Object obj = pjqVar.k;
        wne wneVar = wne.f39444a;
        int i2 = pjqVar.m;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(obj);
            odd oddVar2 = new odd();
            viq viqVar = new viq(oddVar2, b);
            rwj rwjVar = tvk.f34603a;
            vs10 vs10Var = ys10.f43147a;
            vjqVar = this;
            qjq qjqVar = new qjq(j, vjqVar, viqVar, null);
            pjqVar.j = oddVar2;
            pjqVar.i = (int) j;
            pjqVar.m = 1;
            if (qjj.d0(vs10Var, qjqVar, pjqVar) == wneVar) {
                return wneVar;
            }
            oddVar = oddVar2;
            j2 = j;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = pjqVar.i;
            oddVar = pjqVar.j;
            z1x.P(obj);
            vjqVar = this;
        }
        return qjj.M(vjqVar.c.f34352a, null, new rjq(oddVar, j2, (yje) null), 3);
    }

    @Override // a.jot0
    public final void b(pot0 pot0Var) {
        this.f = pot0Var;
        d(this.g, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zje zjeVar) {
        sjq sjqVar;
        int i;
        if (zjeVar instanceof sjq) {
            sjqVar = (sjq) zjeVar;
            int i2 = sjqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sjqVar.l = i2 - Integer.MIN_VALUE;
            } else {
                sjqVar = new sjq(this, zjeVar);
            }
        } else {
            sjqVar = new sjq(this, zjeVar);
        }
        Object obj = sjqVar.j;
        wne wneVar = wne.f39444a;
        int i3 = sjqVar.l;
        if (i3 == 0) {
            z1x.P(obj);
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "FlashControl: Waiting for any ongoing update to be completed");
            }
            int i4 = this.g;
            odd oddVarJ = this.i;
            if (oddVarJ == null) {
                oddVarJ = ozb.j(Unit.f46060a);
            }
            sjqVar.i = i4;
            sjqVar.l = 1;
            if (oddVarJ.join(sjqVar) == wneVar) {
                return wneVar;
            }
            i = i4;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = sjqVar.i;
            z1x.P(obj);
        }
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "awaitFlashModeUpdate: initialFlashMode = " + i);
        }
        return new Integer(i);
    }

    public final odd d(int i, boolean z) {
        if (l8x.f0("CXCP")) {
            StringBuilder sbM = b1j.m(i, "setFlashAsync: flashMode = ", ", requestControl = ");
            sbM.append(this.f);
            Log.d("CXCP", sbM.toString());
        }
        odd oddVar = new odd();
        if (this.f == null) {
            dw9.z("Camera is not active.", oddVar);
            return oddVar;
        }
        this.g = i;
        odd oddVar2 = this.i;
        if (z) {
            if (oddVar2 != null) {
                dw9.z("There is a new flash mode being set or camera was closed", oddVar2);
            }
            this.i = null;
        } else if (oddVar2 != null) {
            vzb.g0(oddVar, oddVar2);
        }
        this.i = oddVar;
        i7m0 i7m0Var = this.b;
        synchronized (i7m0Var.d) {
            i7m0Var.h = i;
        }
        vzb.g0(i7m0Var.f(), oddVar);
        return oddVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
    
        if (a.qjj.N(r7, r1) == r2) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(a.zje r10) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vjq.e(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(zje zjeVar) {
        ujq ujqVar;
        if (zjeVar instanceof ujq) {
            ujqVar = (ujq) zjeVar;
            int i = ujqVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ujqVar.k = i - Integer.MIN_VALUE;
            } else {
                ujqVar = new ujq(this, zjeVar);
            }
        } else {
            ujqVar = new ujq(this, zjeVar);
        }
        Object obj = ujqVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ujqVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            rwj rwjVar = tvk.f34603a;
            vs10 vs10Var = ys10.f43147a;
            cin cinVar = new cin(this, yjeVar, (byte) 7);
            ujqVar.k = 1;
            if (qjj.d0(vs10Var, cinVar, ujqVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        if (b34.m0(this.f37542a.b)) {
            i7m0 i7m0Var = this.b;
            synchronized (i7m0Var.d) {
                i7m0Var.j = false;
            }
            i7m0Var.f();
        }
        if (this.e.h()) {
            this.d.a(0, true, (6 & 4) == 0);
        }
        return Unit.f46060a;
    }

    @Override // a.jot0
    public final void reset() {
        this.g = 2;
        this.h = null;
        odd oddVar = this.i;
        if (oddVar != null) {
            dw9.z("There is a new flash mode being set or camera was closed", oddVar);
        }
        this.i = null;
        d(2, true);
    }
}
