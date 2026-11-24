package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class r9y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30109a;
    public final j9y b;

    public /* synthetic */ r9y(j9y j9yVar, byte b) {
        this.f30109a = b;
        this.b = j9yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30109a;
        j9y j9yVar = this.b;
        switch (b) {
            case 0:
                return new zwj(j9yVar.e);
            default:
                return uvw.q(j9yVar, false);
        }
    }
}
