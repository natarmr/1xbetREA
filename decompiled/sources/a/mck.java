package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class mck implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21556a;
    public final ock b;

    public /* synthetic */ mck(ock ockVar, byte b) {
        this.f21556a = b;
        this.b = ockVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21556a;
        ock ockVar = this.b;
        switch (b) {
            case 0:
                return xtt0.d(ockVar.z());
            case 1:
                return ockVar.p(true);
            case 2:
                return fre0.W(ockVar) ? ockVar.p(false) : ockVar.a();
            default:
                return fre0.c0(ockVar, ockVar.u());
        }
    }
}
