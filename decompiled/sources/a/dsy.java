package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dsy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6636a;
    public final osy b;

    public /* synthetic */ dsy(osy osyVar, byte b) {
        this.f6636a = b;
        this.b = osyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6636a;
        osy osyVar = this.b;
        switch (b) {
            case 0:
                dqy dqyVar = osyVar.f;
                fqy fqyVar = dqyVar.f;
                if (j24.t.m(j24.f15764a[45], dqyVar)) {
                    return null;
                }
                return fqyVar;
            case 1:
                osy osyVar2 = this.b;
                return w9x.B(osyVar2, osyVar2.f.h, (fqy) osyVar2.g.getValue(), iun.f15405a, (nzs0) osyVar2.k.getValue(), true);
            case 2:
                osy osyVar3 = this.b;
                return fre0.W(osyVar3) ? w9x.B(osyVar3, osyVar3.f.h, (fqy) osyVar3.g.getValue(), iun.f15405a, (nzs0) osyVar3.k.getValue(), false) : osyVar3.a();
            case 3:
                fqy fqyVar2 = osyVar.f.j;
                if (fqyVar2 != null) {
                    return jwb.Z(fqyVar2, bqe0.d(osyVar.c.j()), (nzs0) osyVar.k.getValue(), xvw.R(osyVar) ? null : new dsy(osyVar, (byte) 6), 4);
                }
                Intrinsics.h("returnType");
                throw null;
            case 4:
                ihy ihyVar = osyVar.c;
                xgy xgyVar = ihyVar instanceof xgy ? (xgy) ihyVar : null;
                nzs0 nzs0VarD = xgyVar != null ? ((vgy) xgyVar.c.getValue()).d() : null;
                nzs0 nzs0Var = nzs0.d;
                return msm0.k(osyVar.f.e, nzs0VarD, osyVar, bqe0.d(ihyVar.j()));
            case 5:
                boolean zR = xvw.R(osyVar);
                dqy dqyVar2 = osyVar.f;
                if (zR) {
                    return null;
                }
                ihy ihyVar2 = osyVar.c;
                dqyVar2.getClass();
                tey teyVar = j0x.v(dqyVar2).b;
                if (teyVar == null) {
                    return null;
                }
                if (ihyVar2 instanceof zhy) {
                    try {
                        return ((zhy) ihyVar2).b.getDeclaredField(teyVar.b);
                    } catch (NoSuchFieldException unused) {
                        return null;
                    }
                }
                StringBuilder sb = new StringBuilder("javaField is only supported for top-level properties for now: ");
                sb.append(ihyVar2);
                hny.r(sb, dqyVar2.b, osyVar.d);
                return null;
            default:
                return osyVar.x().getReturnType();
        }
    }
}
