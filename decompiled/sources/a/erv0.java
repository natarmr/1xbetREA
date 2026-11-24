package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class erv0 implements jlz, fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nld f8300a;

    public erv0(nld nldVar) {
        this.f8300a = nldVar;
    }

    @Override // a.fer
    public final wdr b() {
        return new rer(1, this.f8300a, nld.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof jlz) && (obj instanceof fer)) {
            return b().equals(((fer) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
