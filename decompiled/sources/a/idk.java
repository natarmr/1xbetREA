package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class idk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14589a;
    public final kdk b;

    public /* synthetic */ idk(kdk kdkVar, byte b) {
        this.f14589a = b;
        this.b = kdkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14589a;
        kdk kdkVar = this.b;
        switch (b) {
            case 0:
                return new jdk(kdkVar);
            default:
                return xvw.G(kdkVar, kdkVar.A());
        }
    }
}
