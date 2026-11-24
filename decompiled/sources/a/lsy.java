package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class lsy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20603a;
    public final nsy b;

    public /* synthetic */ lsy(nsy nsyVar, byte b) {
        this.f20603a = b;
        this.b = nsyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f20603a;
        nsy nsyVar = this.b;
        switch (b) {
            case 0:
                return new msy(nsyVar);
            default:
                return nsyVar.p();
        }
    }
}
