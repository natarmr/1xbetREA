package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y2g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41902a;
    public final /* synthetic */ x3m b;

    public /* synthetic */ y2g(x3m x3mVar, byte b) {
        this.f41902a = b;
        this.b = x3mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41902a;
        x3m x3mVar = this.b;
        switch (b) {
            case 0:
                float fL = x3mVar.d.f.l();
                if (x3mVar.c() != ((y3m) x3mVar.d.e.getValue()) || Float.isNaN(fL)) {
                    return null;
                }
                return new f3g(x3mVar.c(), fL, x3mVar.c.l());
            default:
                return x3mVar.c();
        }
    }
}
