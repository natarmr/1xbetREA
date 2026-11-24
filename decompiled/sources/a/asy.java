package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class asy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1410a = 1;
    public final bsy b;
    public final ihy c;

    public asy(ihy ihyVar, bsy bsyVar) {
        this.c = ihyVar;
        this.b = bsyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1410a;
        ihy ihyVar = this.c;
        bsy bsyVar = this.b;
        switch (b) {
            case 0:
                xgy xgyVar = ihyVar instanceof xgy ? (xgy) ihyVar : null;
                nzs0 nzs0VarD = xgyVar != null ? ((vgy) xgyVar.c.getValue()).d() : null;
                nzs0 nzs0Var = nzs0.d;
                return msm0.k(bsyVar.j.c, nzs0VarD, bsyVar, bqe0.d(ihyVar.j()));
            default:
                fqy fqyVar = bsyVar.j.h;
                if (fqyVar != null) {
                    return jwb.Z(fqyVar, bqe0.d(ihyVar.j()), bsyVar.C(), new zry(bsyVar, (byte) 1), 4);
                }
                Intrinsics.h("returnType");
                throw null;
        }
    }

    public asy(bsy bsyVar, ihy ihyVar) {
        this.b = bsyVar;
        this.c = ihyVar;
    }
}
