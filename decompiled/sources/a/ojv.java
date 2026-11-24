package a;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class ojv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ncs0 f25379a;
    public final boolean b;
    public final boolean c;
    public final z55 f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public long l;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public njv m = new njv();
    public njv n = new njv();
    public boolean k = false;
    public boolean o = false;

    public ojv(ncs0 ncs0Var, boolean z, boolean z2) {
        this.f25379a = ncs0Var;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new z55(bArr, 0, 0);
        njv njvVar = this.n;
        njvVar.b = false;
        njvVar.f23654a = false;
    }
}
