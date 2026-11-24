package a;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class uq30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36099a;
    public final xq30 b;
    public final z3 c;
    public final int d;

    public /* synthetic */ uq30(xq30 xq30Var, z3 z3Var, int i, byte b) {
        this.f36099a = b;
        this.b = xq30Var;
        this.c = z3Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listL0;
        byte b = this.f36099a;
        int i = this.d;
        z3 z3Var = this.c;
        xq30 xq30Var = this.b;
        switch (b) {
            case 0:
                g45 g45Var = xq30Var.f41296a;
                v0 v0VarA = xq30Var.a((vjj) g45Var.c);
                listL0 = v0VarA != null ? CollectionsKt.L0(((m83) ((f6i) g45Var.f10647a).g).l(v0VarA, z3Var, i)) : null;
                return listL0 == null ? iun.f15405a : listL0;
            default:
                g45 g45Var2 = xq30Var.f41296a;
                v0 v0VarA2 = xq30Var.a((vjj) g45Var2.c);
                listL0 = v0VarA2 != null ? ((m83) ((f6i) g45Var2.f10647a).g).d(v0VarA2, z3Var, i) : null;
                return listL0 == null ? iun.f15405a : listL0;
        }
    }
}
