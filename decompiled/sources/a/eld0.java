package a;

import android.gov.nist.core.Separators;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class eld0 {
    public static final eld0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7991a;
    public int b;
    public int c;

    static {
        int i = 0;
        d = new eld0(i, i, (byte) 0);
    }

    public /* synthetic */ eld0(int i, int i2, byte b) {
        this.f7991a = b;
        this.b = i;
        this.c = i2;
    }

    public int a() {
        int i = this.c;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void b(xhe0 xhe0Var) {
        View view = xhe0Var.f40887a;
        this.b = view.getLeft();
        this.c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public d3g0 c() {
        return new d3g0(this.b, this.c);
    }

    public String toString() {
        switch (this.f7991a) {
            case 0:
                StringBuilder sb = new StringBuilder(eld0.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return rz4.j(this.c, "]", sb);
            case 3:
                StringBuilder sb2 = new StringBuilder(Separators.LESS_THAN);
                sb2.append(this.b);
                sb2.append(' ');
                return brm0.n(sb2, this.c, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ eld0(byte b) {
        this.f7991a = b;
    }
}
