package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ioi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gii0 f15118a;
    public final knf0 b;
    public final mne c;
    public final n5d0 d;
    public final n5d0 e;
    public final n5d0 f;
    public final n5d0 g;
    public final n5d0 h;
    public final n5d0 i;
    public final n5d0 j;
    public final n5d0 k;

    public ioi(mne mneVar, gii0 gii0Var, knf0 knf0Var) {
        this.f15118a = gii0Var;
        this.b = knf0Var;
        this.c = mneVar;
        byte b = 11;
        this.d = mbl.b(new omi(this, 1, b));
        this.e = mbl.b(new omi(this, 0, b));
        this.f = mbl.b(new omi(this, 3, b));
        this.g = mbl.b(new omi(this, 2, b));
        this.h = mbl.b(new omi(this, 5, b));
        this.i = mbl.b(new omi(this, 4, b));
        this.j = mbl.b(new omi(this, 7, b));
        this.k = mbl.b(new omi(this, 6, b));
    }

    public final vdn a() {
        return (vdn) this.i.get();
    }

    public final ien b() {
        return (ien) this.g.get();
    }
}
