package a;

import com.google.android.flexbox.FlexboxLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class hkq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13220a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public hkq(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public final void a() {
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (!flexboxLayoutManager.k() && flexboxLayoutManager.t) {
            this.c = this.e ? flexboxLayoutManager.B.i() : flexboxLayoutManager.n - flexboxLayoutManager.B.m();
            return;
        }
        boolean z = this.e;
        pa80 pa80Var = flexboxLayoutManager.B;
        this.c = z ? pa80Var.i() : pa80Var.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f13220a = -1;
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.f = false;
        this.g = false;
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        boolean zK = flexboxLayoutManager.k();
        boolean z = flexboxLayoutManager.q;
        if (zK) {
            if (z == 0) {
                this.e = flexboxLayoutManager.p == 1;
                return;
            } else {
                this.e = z == 2;
                return;
            }
        }
        if (z == 0) {
            this.e = flexboxLayoutManager.p == 3;
        } else {
            this.e = z == 2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.f13220a);
        sb.append(", mFlexLinePosition=");
        sb.append(this.b);
        sb.append(", mCoordinate=");
        sb.append(this.c);
        sb.append(", mPerpendicularCoordinate=");
        sb.append(this.d);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.e);
        sb.append(", mValid=");
        sb.append(this.f);
        sb.append(", mAssignedFromSavedState=");
        return brm0.o(sb, this.g, '}');
    }
}
