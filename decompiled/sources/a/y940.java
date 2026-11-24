package a;

/* JADX INFO: loaded from: classes3.dex */
public final class y940 implements kuw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Integer f42227a;

    public y940(Integer num) {
        this.f42227a = num;
    }

    @Override // a.kuw
    public final int getErrorCode() {
        Integer num = this.f42227a;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
