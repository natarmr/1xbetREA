package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class vdk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37236a;
    public final wdk b;

    public /* synthetic */ vdk(wdk wdkVar, byte b) {
        this.f37236a = b;
        this.b = wdkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37236a;
        wdk wdkVar = this.b;
        switch (b) {
            case 0:
                return wdkVar.D(wdkVar.b);
            case 1:
                return xtt0.d(wdkVar.b);
            default:
                return wdkVar;
        }
    }
}
