package a;

/* JADX INFO: loaded from: classes4.dex */
public final class pbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26733a;
    public final qbz b;
    public int d;
    public pbz e;
    public boolean f;
    public int c = -1;
    public final pz40 g = androidx.compose.runtime.e.e(null);

    public pbz(Object obj, qbz qbzVar) {
        this.f26733a = obj;
        this.b = qbzVar;
    }

    public final pbz a() {
        if (this.f) {
            adx.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.f28462a.add(this);
            pbz pbzVar = (pbz) ((hgk0) this.g).getValue();
            if (pbzVar != null) {
                pbzVar.a();
            } else {
                pbzVar = null;
            }
            this.e = pbzVar;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            adx.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.f28462a.remove(this);
            pbz pbzVar = this.e;
            if (pbzVar != null) {
                pbzVar.b();
            }
            this.e = null;
        }
    }
}
