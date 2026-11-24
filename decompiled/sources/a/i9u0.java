package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class i9u0 extends w46 {
    public final i1w0 b;
    public final u8u c;
    public final bbw0 d;
    public final ilp0 e;
    public final mne f;
    public final p7m0 g;
    public final qoj0 h;
    public final ra10 i;
    public final ra10 j;

    public i9u0(i1w0 i1w0Var, int i, u8u u8uVar, bbw0 bbw0Var, ilp0 ilp0Var, mne mneVar, sa10 sa10Var) {
        i1w0Var.getClass();
        this.b = i1w0Var;
        this.c = u8uVar;
        this.d = bbw0Var;
        this.e = ilp0Var;
        this.f = mneVar;
        this.g = q7m0.a(e9u0.f7441a);
        this.h = ckb.F();
        pb10 pb10Var = pb10.g;
        this.i = sa10.b(sa10Var, pb10Var, R.string.data_is_missing, R.string.refresh_data, new avs0(0, this, i9u0.class, "onRefreshData", "onRefreshData()V", 0, (byte) 2), 16);
        this.j = sa10.b(sa10Var, pb10Var, R.string.data_retrieval_error, R.string.refresh_data, new avs0(0, this, i9u0.class, "onRefreshData", "onRefreshData()V", 0, (byte) 3), 16);
        mbu0.b.getClass();
        mbu0 mbu0VarA = svs0.a(i);
        if (mbu0VarA != mbu0.UNKNOWN) {
            i1w0Var.d(new c9u0(this, mbu0VarA, (byte) 0));
        }
    }
}
