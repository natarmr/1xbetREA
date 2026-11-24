package a;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zck implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44170a;
    public final adk b;

    public /* synthetic */ zck(adk adkVar, byte b) {
        this.f44170a = b;
        this.b = adkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44170a;
        adk adkVar = this.b;
        switch (b) {
            case 0:
                return xtt0.d(adkVar.z());
            default:
                go80 go80VarZ = adkVar.z();
                ock ockVar = adkVar.f683a;
                if (!(go80VarZ instanceof c8z) || !Intrinsics.d(xtt0.h(ockVar), go80VarZ) || (!ockVar.f8277a.c() && ockVar.z().l() != 2)) {
                    return (Type) ockVar.x().a().get(adkVar.b);
                }
                ihy ihyVarK = ockVar.K();
                xgy xgyVar = ihyVarK instanceof xgy ? (xgy) ihyVarK : null;
                if (xgyVar != null) {
                    return azw.G(xgyVar);
                }
                ohq.u(go80VarZ, "Cannot determine receiver Java type of inherited declaration: ");
                return null;
        }
    }
}
