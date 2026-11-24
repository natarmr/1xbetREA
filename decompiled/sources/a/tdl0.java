package a;

/* JADX INFO: loaded from: classes5.dex */
public final class tdl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he1 f33774a;
    public final dpi0 b;
    public final k3h0 c;
    public final jym0 d;
    public final i9s e;
    public final xyt f;
    public final knf0 g;
    public final pc90 h;
    public final mne i;
    public final m530 j;
    public final x2b k;
    public final us3 l;
    public final yr20 m;
    public final nf6 n;

    public tdl0(he1 he1Var, dpi0 dpi0Var, k3h0 k3h0Var, jym0 jym0Var, i9s i9sVar, xyt xytVar, knf0 knf0Var, pc90 pc90Var, mne mneVar, m530 m530Var, x2b x2bVar, us3 us3Var, yr20 yr20Var, nf6 nf6Var) {
        k3h0Var.getClass();
        jym0Var.getClass();
        i9sVar.getClass();
        knf0Var.getClass();
        pc90Var.getClass();
        m530Var.getClass();
        x2bVar.getClass();
        us3Var.getClass();
        yr20Var.getClass();
        nf6Var.getClass();
        this.f33774a = he1Var;
        this.b = dpi0Var;
        this.c = k3h0Var;
        this.d = jym0Var;
        this.e = i9sVar;
        this.f = xytVar;
        this.g = knf0Var;
        this.h = pc90Var;
        this.i = mneVar;
        this.j = m530Var;
        this.k = x2bVar;
        this.l = us3Var;
        this.m = yr20Var;
        this.n = nf6Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(qdl0 qdl0Var, are areVar, boolean z, boolean z2, int i, zje zjeVar) {
        rdl0 rdl0Var;
        if (zjeVar instanceof rdl0) {
            rdl0Var = (rdl0) zjeVar;
            int i2 = rdl0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rdl0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                rdl0Var = new rdl0(this, zjeVar);
            }
        } else {
            rdl0Var = new rdl0(this, zjeVar);
        }
        rdl0 rdl0Var2 = rdl0Var;
        Object objD0 = rdl0Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = rdl0Var2.k;
        try {
            if (i3 == 0) {
                z1x.P(objD0);
                e0g0 e0g0Var = j0g0.b;
                dvj dvjVar = this.i.b;
                sdl0 sdl0Var = new sdl0(this, qdl0Var, areVar, i, z2, z, null);
                rdl0Var2.k = 1;
                objD0 = qjj.d0(dvjVar, sdl0Var, rdl0Var2);
                if (objD0 == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objD0);
            }
            k9s k9sVar = (k9s) objD0;
            e0g0 e0g0Var2 = j0g0.b;
            return k9sVar;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            return new g0g0(th);
        }
    }
}
