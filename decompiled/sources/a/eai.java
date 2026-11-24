package a;

/* JADX INFO: loaded from: classes3.dex */
public final class eai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gii0 f7465a;
    public final xyt b;
    public final knf0 c;
    public final us3 d;
    public final mne e;
    public final n5d0 f;
    public final n5d0 g;
    public final n5d0 h;
    public final n5d0 i;
    public final n5d0 j;
    public final n5d0 k;

    public eai(mne mneVar, gii0 gii0Var, knf0 knf0Var, xyt xytVar, us3 us3Var) {
        this.f7465a = gii0Var;
        this.b = xytVar;
        this.c = knf0Var;
        this.d = us3Var;
        this.e = mneVar;
        byte b = 16;
        this.f = mbl.b(new r5i(this, 1, b));
        this.g = mbl.b(new r5i(this, 2, b));
        this.h = mbl.b(new r5i(this, 0, b));
        this.i = mbl.b(new r5i(this, 3, b));
        this.j = mbl.b(new r5i(this, 5, b));
        this.k = mbl.b(new r5i(this, 4, b));
    }

    public final b8h0 a() {
        return (b8h0) this.k.get();
    }
}
