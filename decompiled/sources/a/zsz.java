package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zsz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44930a;
    public final /* synthetic */ ctz b;

    public /* synthetic */ zsz(ctz ctzVar, byte b) {
        this.f44930a = b;
        this.b = ctzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44930a;
        ctz ctzVar = this.b;
        switch (b) {
            case 0:
                atz atzVar = ctz.O1;
                fiu0 fiu0Var = ctzVar.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                atz atzVar2 = ctz.O1;
                ctzVar.G0().x(lsz.f20604a);
                return Unit.f46060a;
        }
    }
}
