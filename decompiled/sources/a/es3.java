package a;

import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class es3 implements qvj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ApplicationLoader f8310a;

    public es3(ApplicationLoader applicationLoader) {
        this.f8310a = applicationLoader;
    }

    @Override // a.qvj
    public final void onStart(clz clzVar) {
        z7z z7zVar = this.f8310a.y;
        yje yjeVar = null;
        if (z7zVar == null) {
            Intrinsics.h("authObserver");
            throw null;
        }
        o1w0 o1w0Var = (o1w0) z7zVar.get();
        mne mneVar = o1w0Var.e;
        sje sjeVar = o1w0Var.f;
        c4m0 c4m0Var = o1w0Var.h;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            o1w0Var.h = sac.T(new fnq(o1w0Var.f24503a.a(), new l1w0(o1w0Var, yjeVar, (byte) 0), (byte) 4), d5c.S(sjeVar, mneVar.f22085a), m1w0.h);
        }
        bby bbyVar = o1w0Var.i;
        if (bbyVar == null || !bbyVar.isActive()) {
            o1w0Var.i = sac.V(sjeVar, n1w0.f22773a, null, mneVar.b, new l1w0(o1w0Var, yjeVar, b), 10);
        }
    }

    @Override // a.qvj
    public final void onStop(clz clzVar) {
        z7z z7zVar = this.f8310a.y;
        if (z7zVar == null) {
            Intrinsics.h("authObserver");
            throw null;
        }
        o1w0 o1w0Var = (o1w0) z7zVar.get();
        e3c.n(o1w0Var.h);
        e3c.n(o1w0Var.i);
    }
}
