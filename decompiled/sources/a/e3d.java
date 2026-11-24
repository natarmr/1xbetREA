package a;

/* JADX INFO: loaded from: classes5.dex */
public final class e3d implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f3d f7128a;

    public e3d(f3d f3dVar) {
        this.f7128a = f3dVar;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        return 0L;
    }

    @Override // a.vj50
    public final Object I0(long j, yje yjeVar) {
        return new g6u0(0L);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        int i2 = (int) (4294967295L & j2);
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        f3d f3dVar = this.f7128a;
        if (fIntBitsToFloat < 0.0f && f3dVar.f8856a.l() < f3dVar.d.l()) {
            return f3dVar.c(j2);
        }
        if (Float.intBitsToFloat(i2) > 0.0f) {
            return f3dVar.c(j2);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        d3d d3dVar;
        if (zjeVar instanceof d3d) {
            d3dVar = (d3d) zjeVar;
            int i = d3dVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                d3dVar.m = i - Integer.MIN_VALUE;
            } else {
                d3dVar = new d3d(this, zjeVar);
            }
        } else {
            d3dVar = new d3d(this, zjeVar);
        }
        d3d d3dVar2 = d3dVar;
        Object obj = d3dVar2.k;
        Object obj2 = wne.f39444a;
        int i2 = d3dVar2.m;
        if (i2 == 0) {
            z1x.P(obj);
            d3dVar2.i = j;
            d3dVar2.j = j2;
            d3dVar2.m = 1;
            if (this.f7128a.e(d3dVar2) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = d3dVar2.j;
        j = d3dVar2.i;
        z1x.P(obj);
        d3dVar2.i = j;
        d3dVar2.j = j2;
        d3dVar2.m = 2;
        Object objG = super.g(j, j2, d3dVar2);
        return objG == obj2 ? obj2 : objG;
    }
}
