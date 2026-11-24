package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a8a implements iu5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b8a f417a;

    public a8a(b8a b8aVar) {
        this.f417a = b8aVar;
    }

    @Override // a.iu5
    public final void b(lu5 lu5Var) {
        this.f417a.b.d();
        kb6 kb6Var = this.f417a.i;
        synchronized (kb6Var) {
            if (kb6Var.b) {
                kb6Var.a();
            }
        }
        this.f417a.j.post(new fy2(this, lu5Var, (byte) 22));
    }

    @Override // a.iu5
    public final void a(List list) {
    }
}
