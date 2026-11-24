package a;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ex5 implements jbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8561a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public mbj d;

    public ex5(boolean z) {
        this.f8561a = z;
    }

    @Override // a.jbj
    public final void c(rsj rsjVar) {
        rsjVar.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(rsjVar)) {
            return;
        }
        arrayList.add(rsjVar);
        this.c++;
    }

    public final void f(int i) {
        mbj mbjVar = this.d;
        String str = vtt0.f38024a;
        for (int i2 = 0; i2 < this.c; i2++) {
            rsj rsjVar = (rsj) this.b.get(i2);
            boolean z = this.f8561a;
            synchronized (rsjVar) {
                rcf0 rcf0Var = rsj.p;
                if (z && (mbjVar.g & 8) != 8) {
                    rsjVar.i += (long) i;
                }
            }
        }
    }

    public final void o() {
        mbj mbjVar = this.d;
        String str = vtt0.f38024a;
        for (int i = 0; i < this.c; i++) {
            rsj rsjVar = (rsj) this.b.get(i);
            boolean z = this.f8561a;
            synchronized (rsjVar) {
                try {
                    rcf0 rcf0Var = rsj.p;
                    if (z && (mbjVar.g & 8) != 8) {
                        x0x.K(rsjVar.g > 0);
                        rsjVar.d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i2 = (int) (jElapsedRealtime - rsjVar.h);
                        rsjVar.j += (long) i2;
                        long j = rsjVar.k;
                        long j2 = rsjVar.i;
                        rsjVar.k = j + j2;
                        if (i2 > 0) {
                            rsjVar.f.a((j2 * 8000.0f) / i2, (int) Math.sqrt(j2));
                            if (rsjVar.j >= 2000 || rsjVar.k >= 524288) {
                                rsjVar.l = (long) rsjVar.f.i();
                            }
                            rsjVar.c(i2, rsjVar.i, rsjVar.l);
                            rsjVar.h = jElapsedRealtime;
                            rsjVar.i = 0L;
                        }
                        rsjVar.g--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = null;
    }

    public final void p() {
        for (int i = 0; i < this.c; i++) {
            ((rsj) this.b.get(i)).getClass();
        }
    }

    public final void q(mbj mbjVar) {
        this.d = mbjVar;
        for (int i = 0; i < this.c; i++) {
            rsj rsjVar = (rsj) this.b.get(i);
            boolean z = this.f8561a;
            synchronized (rsjVar) {
                try {
                    rcf0 rcf0Var = rsj.p;
                    if (z && (mbjVar.g & 8) != 8) {
                        if (rsjVar.g == 0) {
                            rsjVar.d.getClass();
                            rsjVar.h = SystemClock.elapsedRealtime();
                        }
                        rsjVar.g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
