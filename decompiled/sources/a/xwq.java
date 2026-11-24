package a;

import androidx.fragment.app.Fragment;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class xwq extends dxq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uyn f41621a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ bsr0 c;
    public final /* synthetic */ wn d;
    public final /* synthetic */ Fragment e;

    public xwq(Fragment fragment, uyn uynVar, AtomicReference atomicReference, bsr0 bsr0Var, wn wnVar) {
        this.e = fragment;
        this.f41621a = uynVar;
        this.b = atomicReference;
        this.c = bsr0Var;
        this.d = wnVar;
    }

    @Override // a.dxq
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        Fragment fragment = this.e;
        sb.append(fragment.f);
        sb.append("_rq#");
        sb.append(fragment.C1.getAndIncrement());
        this.b.set(((yfd) this.f41621a.mo11apply(null)).c(sb.toString(), fragment, this.c, this.d));
    }
}
