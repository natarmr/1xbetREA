package a;

/* JADX INFO: loaded from: classes2.dex */
public final class r4x0 extends b5x0 {
    public volatile double e;

    @Override // a.b5x0
    public final /* synthetic */ Object b(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // a.b5x0
    public final /* synthetic */ Object c(Object obj) {
        return (Double) obj;
    }

    @Override // a.b5x0
    public final /* synthetic */ Object d() {
        return Double.valueOf(this.e);
    }

    @Override // a.b5x0
    public final /* synthetic */ void e(Object obj) {
        this.e = ((Double) obj).doubleValue();
    }
}
