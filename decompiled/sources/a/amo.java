package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class amo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1118a = 1;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public amo() {
        d();
    }

    public void a() {
        boolean z = this.d;
        pa80 pa80Var = (pa80) this.f;
        this.c = z ? pa80Var.i() : pa80Var.m();
    }

    public void b(View view, int i) {
        int iO = ((pa80) this.f).o();
        if (iO >= 0) {
            boolean z = this.d;
            pa80 pa80Var = (pa80) this.f;
            if (z) {
                this.c = ((pa80) this.f).o() + pa80Var.d(view);
            } else {
                this.c = pa80Var.g(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        pa80 pa80Var2 = (pa80) this.f;
        if (!z2) {
            int iG = pa80Var2.g(view);
            int iM = iG - ((pa80) this.f).m();
            this.c = iG;
            if (iM > 0) {
                int i2 = (((pa80) this.f).i() - Math.min(0, (((pa80) this.f).i() - iO) - ((pa80) this.f).d(view))) - (((pa80) this.f).e(view) + iG);
                if (i2 < 0) {
                    this.c -= Math.min(iM, -i2);
                    return;
                }
                return;
            }
            return;
        }
        int i3 = (pa80Var2.i() - iO) - ((pa80) this.f).d(view);
        this.c = ((pa80) this.f).i() - i3;
        if (i3 > 0) {
            int iE = this.c - ((pa80) this.f).e(view);
            int iM2 = ((pa80) this.f).m();
            int iMin = iE - (Math.min(((pa80) this.f).g(view) - iM2, 0) + iM2);
            if (iMin < 0) {
                this.c = Math.min(i3, -iMin) + this.c;
            }
        }
    }

    public void c(int i) {
        this.d |= i > 0;
        this.b += i;
    }

    public void d() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public String toString() {
        switch (this.f1118a) {
            case 1:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.b);
                sb.append(", mCoordinate=");
                sb.append(this.c);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.d);
                sb.append(", mValid=");
                return brm0.o(sb, this.e, '}');
            default:
                return super.toString();
        }
    }

    public amo(yx90 yx90Var) {
        this.f = yx90Var;
    }
}
