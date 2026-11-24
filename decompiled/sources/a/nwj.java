package a;

import androidx.media3.common.Timeline$Window;

/* JADX INFO: loaded from: classes.dex */
public final class nwj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24237a;
    public int b;
    public long c;
    public final vn30 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ owj g;

    public nwj(owj owjVar, String str, int i, vn30 vn30Var) {
        this.g = owjVar;
        this.f24237a = str;
        this.b = i;
        this.c = vn30Var == null ? -1L : vn30Var.d;
        if (vn30Var == null || !vn30Var.c()) {
            return;
        }
        this.d = vn30Var;
    }

    public final boolean a(ft2 ft2Var) {
        vn30 vn30Var = ft2Var.d;
        bmq0 bmq0Var = ft2Var.b;
        if (vn30Var == null) {
            return this.b != ft2Var.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (vn30Var.d > j) {
            return true;
        }
        vn30 vn30Var2 = this.d;
        if (vn30Var2 == null) {
            return false;
        }
        int i = vn30Var2.b;
        int iB = bmq0Var.b(vn30Var.f37698a);
        int iB2 = bmq0Var.b(vn30Var2.f37698a);
        if (vn30Var.d < vn30Var2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!vn30Var.c()) {
            int i2 = vn30Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = vn30Var.b;
        int i4 = vn30Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > vn30Var2.c;
        }
        return true;
    }

    public final boolean b(bmq0 bmq0Var, bmq0 bmq0Var2) {
        vn30 vn30Var;
        int i = this.b;
        if (i < bmq0Var.o()) {
            owj owjVar = this.g;
            Timeline$Window timeline$Window = owjVar.f25968a;
            bmq0Var.n(i, timeline$Window);
            int i2 = timeline$Window.m;
            while (true) {
                if (i2 > timeline$Window.n) {
                    i = -1;
                    break;
                }
                int iB = bmq0Var2.b(bmq0Var.l(i2));
                if (iB != -1) {
                    i = bmq0Var2.f(iB, owjVar.b, false).c;
                    break;
                }
                i2++;
            }
        } else if (i >= bmq0Var2.o()) {
            i = -1;
            break;
        }
        this.b = i;
        return i != -1 && ((vn30Var = this.d) == null || bmq0Var2.b(vn30Var.f37698a) != -1);
    }
}
