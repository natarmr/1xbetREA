package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rrf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30982a;
    public final /* synthetic */ srf0 b;
    public final /* synthetic */ mrf0 c;

    public /* synthetic */ rrf0(srf0 srf0Var, mrf0 mrf0Var, byte b) {
        this.f30982a = b;
        this.b = srf0Var;
        this.c = mrf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30982a;
        mrf0 mrf0Var = this.c;
        srf0 srf0Var = this.b;
        switch (b) {
            case 0:
                return srf0.b(srf0Var, mrf0Var);
            case 1:
                return srf0.c(srf0Var, mrf0Var);
            default:
                return srf0.d(srf0Var, mrf0Var);
        }
    }
}
