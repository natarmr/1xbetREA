package a;

/* JADX INFO: loaded from: classes5.dex */
public final class hff0 implements kb10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12971a;
    public final /* synthetic */ n5a b;

    public /* synthetic */ hff0(n5a n5aVar, byte b) {
        this.f12971a = b;
        this.b = n5aVar;
    }

    @Override // a.kb10
    public final void onResult(Object obj) {
        byte b = this.f12971a;
        n5a n5aVar = this.b;
        switch (b) {
            case 0:
                if (!n5aVar.x()) {
                    e0g0 e0g0Var = j0g0.b;
                    n5aVar.resumeWith(obj);
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                if (!n5aVar.x()) {
                    e0g0 e0g0Var2 = j0g0.b;
                    th.getClass();
                    n5aVar.resumeWith(new g0g0(th));
                }
                break;
        }
    }
}
