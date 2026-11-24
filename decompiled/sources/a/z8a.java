package a;

/* JADX INFO: loaded from: classes.dex */
public final class z8a implements bmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ odd f43957a;

    public z8a(odd oddVar) {
        this.f43957a = oddVar;
    }

    @Override // a.bmf0
    public final void q(cmf0 cmf0Var) {
        cmf0Var.getClass();
        this.f43957a.b0(new ozw(3, "Capture request is cancelled because camera is closed", null));
    }

    @Override // a.bmf0
    public final void w(gnf0 gnf0Var, long j, qmf0 qmf0Var) {
        this.f43957a.b0(new ozw(2, "Capture request failed with reason " + qmf0Var.L(), null));
    }

    @Override // a.bmf0
    public final void y(gnf0 gnf0Var, long j, oz2 oz2Var) {
        this.f43957a.N(null);
    }
}
