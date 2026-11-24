package a;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes3.dex */
public final class pu9 extends f5r {
    public final boolean m;
    public final long n;
    public final boolean o;

    public pu9(yr10 yr10Var, boolean z, long j, boolean z2) {
        super(yr10Var.C(), yr10Var.u1);
        this.m = z;
        this.n = j;
        this.o = z2;
    }

    @Override // a.f5r
    public final Fragment B(int i) {
        boolean z = this.m;
        if (i == 0) {
            z880.U1.getClass();
            z880 z880Var = new z880();
            iiy[] iiyVarArr = z880.V1;
            z880Var.Q1.x(z880Var, iiyVarArr[1], "UPDATE_CONTENT_REQUEST_KEY");
            z880Var.R1.v(z880Var, iiyVarArr[2], z);
            return z880Var;
        }
        if (i == 1 && this.o) {
            wq9.S1.getClass();
            wq9 wq9Var = new wq9();
            iiy[] iiyVarArr2 = wq9.U1;
            wq9Var.P1.x(wq9Var, iiyVarArr2[0], "UPDATE_CONTENT_REQUEST_KEY");
            wq9Var.Q1.v(wq9Var, iiyVarArr2[1], z);
            wq9Var.R1.j(wq9Var, iiyVarArr2[2], this.n);
            return wq9Var;
        }
        if (i != 1) {
            itt0.a();
            return null;
        }
        br9.S1.getClass();
        br9 br9Var = new br9();
        iiy[] iiyVarArr3 = br9.U1;
        br9Var.P1.x(br9Var, iiyVarArr3[1], "UPDATE_CONTENT_REQUEST_KEY");
        br9Var.Q1.v(br9Var, iiyVarArr3[2], z);
        return br9Var;
    }
}
