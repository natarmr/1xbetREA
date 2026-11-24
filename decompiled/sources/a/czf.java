package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class czf implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5221a;
    public final /* synthetic */ dzf b;

    public /* synthetic */ czf(dzf dzfVar, byte b) {
        this.f5221a = b;
        this.b = dzfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5221a;
        dzf dzfVar = this.b;
        switch (b) {
            case 0:
                return (nzf) dzfVar.f6940a.e(sre0.f32672a.b(nzf.class), "https://track.customer.io");
            default:
                return (nzf) dzfVar.f6940a.e(sre0.f32672a.b(nzf.class), dzfVar.b);
        }
    }
}
