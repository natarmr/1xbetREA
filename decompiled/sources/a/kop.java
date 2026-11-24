package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kop implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18640a;
    public final /* synthetic */ j700 b;

    public /* synthetic */ kop(j700 j700Var, byte b) {
        this.f18640a = b;
        this.b = j700Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18640a;
        j700 j700Var = this.b;
        switch (b) {
            case 0:
                nek nekVar = rop.a2;
                break;
            case 1:
                nek nekVar2 = rop.a2;
                break;
            default:
                nek nekVar3 = rop.a2;
                break;
        }
        return j700Var.name();
    }
}
