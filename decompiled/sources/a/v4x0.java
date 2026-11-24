package a;

/* JADX INFO: loaded from: classes2.dex */
public final class v4x0 extends b5x0 {
    public volatile long e;
    public final long f;

    public v4x0(String str, fbv fbvVar, long j) {
        super(str, fbvVar);
        this.f = j;
    }

    @Override // a.b5x0
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.f);
    }

    @Override // a.b5x0
    public final /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // a.b5x0
    public final /* synthetic */ Object c(Object obj) {
        return (Long) obj;
    }

    @Override // a.b5x0
    public final /* synthetic */ Object d() {
        return Long.valueOf(this.e);
    }

    @Override // a.b5x0
    public final /* synthetic */ void e(Object obj) {
        this.e = ((Long) obj).longValue();
    }
}
