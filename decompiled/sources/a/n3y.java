package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n3y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22872a;
    public final /* synthetic */ o3y b;

    public /* synthetic */ n3y(o3y o3yVar, byte b) {
        this.f22872a = b;
        this.b = o3yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22872a;
        o3y o3yVar = this.b;
        switch (b) {
            case 0:
                jji jjiVar = o3yVar.k2;
                if (jjiVar != null) {
                    return new q0h0(jjiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                int i = o3y.q2;
                ((k3t0) o3yVar.p2.getValue()).x(l3y.f19378a);
                return Unit.f46060a;
        }
    }
}
