package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vak implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37092a;
    public final /* synthetic */ bbk b;

    public /* synthetic */ vak(bbk bbkVar, byte b) {
        this.f37092a = b;
        this.b = bbkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37092a;
        bbk bbkVar = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = bbk.O1;
                i1w0 i1w0VarF = a4n0.f(bbkVar);
                jfi jfiVar = bbkVar.K1;
                if (jfiVar != null) {
                    return new ry3(i1w0VarF, jfiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                iiy[] iiyVarArr2 = bbk.O1;
                bbkVar.G0().w();
                return Unit.f46060a;
        }
    }
}
