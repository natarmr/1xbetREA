package a;

/* JADX INFO: loaded from: classes2.dex */
public final class kf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jw20 f18184a;
    public volatile a8z c;
    public final String e;
    public final n0o0 b = maz.b(new sz2(this, 17));
    public final n0o0 d = maz.b(w7f.o);

    public kf60(jw20 jw20Var) {
        this.f18184a = jw20Var;
        this.c = ((wut0) jw20Var.b).i;
        this.e = (String) ((wut0) jw20Var.b).q.invoke();
    }

    public final void a(String str) {
        ((wut0) this.f18184a.b).g.b(vv00.VERBOSE, "[SET CREDENTIALS IN API] ".concat(((rnh0) this.d.getValue()).a(str)), null);
    }
}
