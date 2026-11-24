package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zxn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45168a;
    public final /* synthetic */ ayn b;

    public /* synthetic */ zxn(ayn aynVar, byte b) {
        this.f45168a = b;
        this.b = aynVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45168a;
        ayn aynVar = this.b;
        switch (b) {
            case 0:
                sek sekVar = ayn.c2;
                fiu0 fiu0Var = aynVar.Y1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                sek sekVar2 = ayn.c2;
                aynVar.I0().x(vxn.f38208a);
                return Unit.f46060a;
            default:
                sek sekVar3 = ayn.c2;
                aynVar.I0().x(wxn.f39939a);
                return Unit.f46060a;
        }
    }
}
