package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g8a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10855a;
    public final /* synthetic */ l1a b;

    public /* synthetic */ g8a(l1a l1aVar, byte b) {
        this.f10855a = b;
        this.b = l1aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zC0;
        byte b = this.f10855a;
        l1a l1aVar = this.b;
        switch (b) {
            case 0:
                zC0 = lgb.c0(l1aVar);
                break;
            default:
                b1a b1aVar = c1a.a0;
                c1a c1aVar = l1aVar.b;
                b1aVar.getClass();
                zC0 = b1a.c(c1aVar);
                break;
        }
        return Boolean.valueOf(zC0);
    }
}
