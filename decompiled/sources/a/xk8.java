package a;

/* JADX INFO: loaded from: classes.dex */
public final class xk8 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c3d f41019a;
    public final /* synthetic */ c3d b;
    public final /* synthetic */ wom c;

    public xk8(c3d c3dVar, wom womVar) {
        this.b = c3dVar;
        this.c = womVar;
        this.f41019a = c3dVar;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        if (this.c.c() <= 0.0f || i != 1 || Float.intBitsToFloat((int) (4294967295L & j)) >= 0.0f) {
            return this.b.C(i, j);
        }
        return 0L;
    }

    @Override // a.vj50
    public final Object I0(long j, yje yjeVar) {
        return this.f41019a.I0(j, yjeVar);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        return this.f41019a.S(i, j, j2);
    }

    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        return this.f41019a.g(j, j2, zjeVar);
    }
}
