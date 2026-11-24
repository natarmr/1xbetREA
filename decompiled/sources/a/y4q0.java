package a;

/* JADX INFO: loaded from: classes.dex */
public final class y4q0 implements v4q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42016a;
    public final /* synthetic */ z4q0 b;

    public y4q0(z4q0 z4q0Var, long j) {
        this.b = z4q0Var;
        this.f42016a = j;
    }

    @Override // a.v4q0
    public final u4q0 G() {
        return etm0.k(this.b);
    }

    @Override // a.v4q0
    public final long L0(j6z j6zVar) {
        j6z j6zVar2 = (j6z) ((hgk0) this.b.r).getValue();
        if (j6zVar2 != null) {
            if (j6zVar2.h()) {
                return j6zVar.C(j6zVar2.R(this.f42016a));
            }
            return 0L;
        }
        adx.d("Tried to open context menu before the anchor was placed.");
        csj.b();
        return 0L;
    }

    @Override // a.v4q0
    public final jge0 y0(j6z j6zVar) {
        return k9x.r(L0(j6zVar), 0L);
    }
}
