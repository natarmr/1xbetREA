package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fpz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9950a;
    public final /* synthetic */ hpz b;

    public /* synthetic */ fpz(hpz hpzVar, byte b) {
        this.f9950a = b;
        this.b = hpzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9950a;
        hpz hpzVar = this.b;
        switch (b) {
            case 0:
                tqt tqtVar = hpz.O1;
                fiu0 fiu0Var = hpzVar.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                tqt tqtVar2 = hpz.O1;
                hpzVar.G0().x(zoz.f44737a);
                return Unit.f46060a;
            case 2:
                tqt tqtVar3 = hpz.O1;
                hpzVar.G0().x(apz.f1273a);
                return Unit.f46060a;
            default:
                tqt tqtVar4 = hpz.O1;
                hpzVar.G0().x(bpz.f3006a);
                return Unit.f46060a;
        }
    }
}
