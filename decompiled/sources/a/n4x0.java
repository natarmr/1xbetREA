package a;

/* JADX INFO: loaded from: classes2.dex */
public final class n4x0 extends b5x0 {
    public volatile boolean e;
    public final boolean f;

    public n4x0(String str, fbv fbvVar, boolean z) {
        super(str, fbvVar);
        this.f = z;
    }

    @Override // a.b5x0
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.f);
    }

    @Override // a.b5x0
    public final /* synthetic */ Object d() {
        return Boolean.valueOf(this.e);
    }

    @Override // a.b5x0
    public final /* synthetic */ void e(Object obj) {
        this.e = ((Boolean) obj).booleanValue();
    }
}
