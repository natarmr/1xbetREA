package a;

/* JADX INFO: loaded from: classes.dex */
public class x460 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xz40 f40250a = new xz40(new n460[16]);
    public final vy40 b = new vy40(10);

    public boolean a(u710 u710Var, j6z j6zVar, cgx0 cgx0Var, boolean z) {
        xz40 xz40Var = this.f40250a;
        Object[] objArr = xz40Var.f41739a;
        int i = xz40Var.c;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((n460) objArr[i2]).a(u710Var, j6zVar, cgx0Var, z) || z2;
        }
        return z2;
    }

    public void b(cgx0 cgx0Var) {
        xz40 xz40Var = this.f40250a;
        int i = xz40Var.c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((n460) xz40Var.f41739a[i]).d.b == 0) {
                xz40Var.k(i);
            }
        }
    }
}
