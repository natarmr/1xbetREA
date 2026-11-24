package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class why implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39189a;
    public final zhy b;

    public /* synthetic */ why(zhy zhyVar, byte b) {
        this.f39189a = b;
        this.b = zhyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39189a;
        zhy zhyVar = this.b;
        switch (b) {
            case 0:
                return new yhy(zhyVar);
            default:
                return zvw.N(zhyVar.b);
        }
    }
}
