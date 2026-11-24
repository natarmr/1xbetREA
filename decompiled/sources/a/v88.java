package a;

/* JADX INFO: loaded from: classes3.dex */
public final class v88 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r990 f36969a;
    public final duj b;
    public final ieu c;
    public final abu d;
    public final drm0 e;
    public i1w0 f;
    public final sje g;
    public boolean h;
    public long i;

    public v88(r990 r990Var, duj dujVar, ieu ieuVar, abu abuVar, drm0 drm0Var, v6k v6kVar, mne mneVar) {
        this.f36969a = r990Var;
        this.b = dujVar;
        this.c = ieuVar;
        this.d = abuVar;
        this.e = drm0Var;
        this.g = d5c.a(mneVar.b);
    }

    public static /* synthetic */ void b(v88 v88Var, i1w0 i1w0Var, long j, int i) {
        if ((i & 4) != 0) {
            j = 0;
        }
        v88Var.a(i1w0Var, true, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(i1w0 i1w0Var, boolean z, long j) {
        i1w0Var.getClass();
        this.f = i1w0Var;
        this.h = z;
        this.i = j;
        yje yjeVar = null;
        sje sjeVar = this.g;
        if (z) {
            sac.V(sjeVar, new t88(this, (byte) 0), null, null, new u88((Object) this, (boolean) (0 == true ? 1 : 0), yjeVar, (byte) (0 == true ? 1 : 0)), 14);
        } else {
            sac.V(sjeVar, new t88(this, (byte) 1), null, null, new qv3(this, yjeVar, (byte) 15), 14);
        }
    }
}
