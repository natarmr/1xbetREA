package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class vh00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee60 f37409a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ wh00 d;

    public vh00(wh00 wh00Var, ee60 ee60Var) {
        this.d = wh00Var;
        this.f37409a = ee60Var;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        wh00 wh00Var = this.d;
        int i2 = wh00Var.c;
        wh00Var.c = i + i2;
        if (!wh00Var.d) {
            wh00Var.d = true;
            while (true) {
                try {
                    int i3 = wh00Var.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        wh00Var.g();
                    } else if (z3) {
                        wh00Var.h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    wh00Var.d = false;
                    throw th;
                }
            }
            wh00Var.d = false;
        }
        if (this.b) {
            wh00Var.c(this);
        }
    }

    public boolean c(clz clzVar) {
        return false;
    }

    public boolean d() {
        return true;
    }

    public void b() {
    }
}
