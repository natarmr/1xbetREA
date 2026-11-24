package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ome implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25499a;
    public final /* synthetic */ djz b;

    public /* synthetic */ ome(djz djzVar, byte b) {
        this.f25499a = b;
        this.b = djzVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f25499a;
        djz djzVar = this.b;
        switch (b) {
            case 0:
                j6z j6zVar = (j6z) obj;
                b9q0 b9q0VarD = djzVar.d();
                if (b9q0VarD != null) {
                    b9q0VarD.c = j6zVar;
                }
                return Unit.f46060a;
            case 1:
                pz40 pz40Var = djzVar.t;
                a8q0 a8q0Var = (a8q0) obj;
                String str = a8q0Var.f440a.b;
                j83 j83Var = djzVar.j;
                if (!Intrinsics.d(str, j83Var != null ? j83Var.b : null)) {
                    ((hgk0) djzVar.k).setValue(dmv.f6336a);
                    if (((Boolean) ((hgk0) pz40Var).getValue()).booleanValue()) {
                        ((hgk0) pz40Var).setValue(Boolean.FALSE);
                    } else {
                        ((hgk0) djzVar.s).setValue(Boolean.FALSE);
                    }
                }
                long j = o9q0.b;
                djzVar.f(j);
                djzVar.e(j);
                djzVar.u.invoke(a8q0Var);
                yfe0 yfe0Var = djzVar.b;
                zfe0 zfe0Var = yfe0Var.f42538a;
                if (zfe0Var != null) {
                    zfe0Var.e(yfe0Var, null);
                }
                return Unit.f46060a;
            case 2:
                djzVar.r.b(((j3x) obj).f15856a);
                return Unit.f46060a;
            case 3:
                return Boolean.valueOf(djzVar.r.b(((j3x) obj).f15856a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((hgk0) djzVar.q).setValue(bool);
                return Unit.f46060a;
        }
    }
}
