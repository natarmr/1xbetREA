package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hmn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13317a;
    public final /* synthetic */ kmn b;

    public /* synthetic */ hmn(kmn kmnVar, byte b) {
        this.f13317a = b;
        this.b = kmnVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13317a;
        kmn kmnVar = this.b;
        switch (b) {
            case 0:
                xak xakVar = kmn.Q1;
                fiu0 fiu0Var = kmnVar.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                xak xakVar2 = kmn.Q1;
                kmnVar.G0().x(kkn.f18449a);
                return Unit.f46060a;
            case 2:
                xak xakVar3 = kmn.Q1;
                kmnVar.G0().x(okn.f25412a);
                return Unit.f46060a;
            case 3:
                xak xakVar4 = kmn.Q1;
                kmnVar.G0().x(ikn.f14935a);
                return Unit.f46060a;
            case 4:
                xak xakVar5 = kmn.Q1;
                kmnVar.G0().x(hkn.f13215a);
                return Unit.f46060a;
            case 5:
                xak xakVar6 = kmn.Q1;
                kmnVar.G0().x(ekn.f7960a);
                return Unit.f46060a;
            case 6:
                xak xakVar7 = kmn.Q1;
                kmnVar.G0().x(dkn.f6239a);
                return Unit.f46060a;
            default:
                xak xakVar8 = kmn.Q1;
                kmnVar.G0().x(jkn.f16678a);
                return Unit.f46060a;
        }
    }
}
