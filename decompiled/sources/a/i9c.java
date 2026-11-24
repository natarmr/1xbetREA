package a;

import java.util.List;
import kotlin.jvm.functions.Function1;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class i9c extends vw5 {
    public final ApplicationLoader d;
    public final mne e;
    public final nhf0 f;
    public final kh3 g;
    public final gsd h;
    public final List i;
    public final p7m0 j;
    public Function1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9c(o8f o8fVar, nkt nktVar, ApplicationLoader applicationLoader, mne mneVar, nhf0 nhf0Var, pru pruVar, gst gstVar, ntu ntuVar, gst gstVar2, tqt tqtVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        nktVar.getClass();
        this.d = applicationLoader;
        this.e = mneVar;
        this.f = nhf0Var;
        this.g = kh3.CONFIG;
        this.h = gsd.APP_UPDATE;
        this.i = kotlin.collections.a.c(nktVar);
        this.j = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.j.o(null, i8d.b);
        sac.V(sjeVar, new h6c(this, sjeVar, (byte) 2), null, this.e.c, new jtb(this, sjeVar, null, (byte) 7), 10);
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.g;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.j;
    }

    @Override // a.vw5
    public final List d() {
        return this.i;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.h;
    }
}
