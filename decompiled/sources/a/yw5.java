package a;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class yw5 implements y2e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4e f43354a;

    public yw5(b4e b4eVar) {
        b4eVar.getClass();
        this.f43354a = b4eVar;
    }

    @Override // a.y2e
    public final boolean a(ppv0 ppv0Var) {
        return b(ppv0Var) && e(this.f43354a.d());
    }

    @Override // a.y2e
    public final bq9 c(o4e o4eVar) {
        o4eVar.getClass();
        return nkb.y(new xw5(this, null, (byte) 0));
    }

    public int d() {
        return 7;
    }

    public boolean e(Object obj) {
        pl50 pl50Var = (pl50) obj;
        pl50Var.getClass();
        boolean z = pl50Var.e;
        boolean z2 = pl50Var.f27167a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z2 && pl50Var.c && !z) ? false : true;
        }
        wv00.f().a(cl50.b, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z2 || z;
    }
}
