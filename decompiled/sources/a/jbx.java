package a;

/* JADX INFO: loaded from: classes5.dex */
public final class jbx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nv20 f16251a;
    public final rrc b;

    public jbx(nv20 nv20Var, rrc rrcVar) {
        this.f16251a = nv20Var;
        this.b = rrcVar;
    }

    public final void a() {
        of6 of6Var = (of6) this.f16251a.f24171a;
        boolean z = false;
        if (axq.z(of6Var.f25150a, "bannerFeedManuallyChanged", false)) {
            return;
        }
        rrc rrcVar = this.b;
        if (!((Boolean) ((tgk) rrcVar.b).i.getValue()).booleanValue() && !rrcVar.F()) {
            z = true;
        }
        of6Var.f25150a.d("SHOW_BANNER_FEED_ENABLE", z);
        of6Var.f25150a.d("showBannerFeed", z);
    }
}
