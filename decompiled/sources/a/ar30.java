package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ar30 implements eyb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1325a;
    public final String b;

    public /* synthetic */ ar30(String str, byte b) {
        this.f1325a = b;
        this.b = str;
    }

    @Override // a.eyb
    public final /* bridge */ String a(u9y u9yVar) {
        switch (this.f1325a) {
            case 0:
                break;
        }
        return dyb.d0(this, u9yVar);
    }

    @Override // a.eyb
    public final String getDescription() {
        byte b = this.f1325a;
        return this.b;
    }
}
