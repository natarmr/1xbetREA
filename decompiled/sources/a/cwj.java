package a;

import android.os.Handler;
import com.journeyapps.barcodescanner.CaptureActivity;

/* JADX INFO: loaded from: classes.dex */
public final class cwj implements bm30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5083a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public cwj(CaptureActivity captureActivity, z7a z7aVar) {
        this.f5083a = false;
        this.c = captureActivity;
        this.f = z7aVar;
        this.d = new md3(this, (byte) 6);
        this.e = new Handler();
    }

    @Override // a.bm30
    public void a(zx90 zx90Var) {
        bm30 bm30Var = (bm30) this.f;
        if (bm30Var != null) {
            bm30Var.a(zx90Var);
            zx90Var = ((bm30) this.f).d();
        }
        ((d4m0) this.c).a(zx90Var);
    }

    @Override // a.bm30
    public boolean b() {
        if (this.f5083a) {
            return false;
        }
        bm30 bm30Var = (bm30) this.f;
        bm30Var.getClass();
        return bm30Var.b();
    }

    public void c() {
        ((Handler) this.e).removeCallbacksAndMessages(null);
        if (this.f5083a) {
            ((CaptureActivity) this.c).unregisterReceiver((md3) this.d);
            this.f5083a = false;
        }
    }

    @Override // a.bm30
    public zx90 d() {
        bm30 bm30Var = (bm30) this.f;
        return bm30Var != null ? bm30Var.d() : ((d4m0) this.c).e;
    }

    @Override // a.bm30
    public long e() {
        if (this.f5083a) {
            return ((d4m0) this.c).e();
        }
        bm30 bm30Var = (bm30) this.f;
        bm30Var.getClass();
        return bm30Var.e();
    }

    public void f(j16 j16Var) throws dlo {
        bm30 bm30Var;
        bm30 bm30VarJ = j16Var.j();
        if (bm30VarJ == null || bm30VarJ == (bm30Var = (bm30) this.f)) {
            return;
        }
        if (bm30Var != null) {
            throw new dlo(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f = bm30VarJ;
        this.e = j16Var;
        ((fm30) bm30VarJ).a(((d4m0) this.c).e);
    }

    public cwj(dmo dmoVar, l9o0 l9o0Var) {
        this.d = dmoVar;
        this.c = new d4m0(l9o0Var);
        this.f5083a = true;
    }
}
