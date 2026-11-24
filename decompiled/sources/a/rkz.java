package a;

/* JADX INFO: loaded from: classes.dex */
public final class rkz implements blz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final skz f30672a;
    public final clz b;

    public rkz(clz clzVar, skz skzVar) {
        this.b = clzVar;
        this.f30672a = skzVar;
    }

    @kh60(kkz.ON_DESTROY)
    public void onDestroy(clz clzVar) {
        this.f30672a.l(clzVar);
    }

    @kh60(kkz.ON_START)
    public void onStart(clz clzVar) {
        this.f30672a.g(clzVar);
    }

    @kh60(kkz.ON_STOP)
    public void onStop(clz clzVar) {
        this.f30672a.h(clzVar);
    }
}
