package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class isy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15329a;
    public final ksy b;

    public /* synthetic */ isy(ksy ksyVar, byte b) {
        this.f15329a = b;
        this.b = ksyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15329a;
        ksy ksyVar = this.b;
        switch (b) {
            case 0:
                return new jsy(ksyVar);
            default:
                return xvw.G(ksyVar, ksyVar.p());
        }
    }
}
