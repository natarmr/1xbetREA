package a;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class vq30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq30 f37836a;
    public final boolean b;
    public final p3d0 c;

    public vq30(xq30 xq30Var, boolean z, p3d0 p3d0Var) {
        this.f37836a = xq30Var;
        this.b = z;
        this.c = p3d0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listL0;
        xq30 xq30Var = this.f37836a;
        g45 g45Var = xq30Var.f41296a;
        v0 v0VarA = xq30Var.a((vjj) g45Var.c);
        if (v0VarA != null) {
            f6i f6iVar = (f6i) g45Var.f10647a;
            boolean z = this.b;
            p3d0 p3d0Var = this.c;
            listL0 = z ? CollectionsKt.L0(((m83) f6iVar.g).e(v0VarA, p3d0Var)) : CollectionsKt.L0(((m83) f6iVar.g).j(v0VarA, p3d0Var));
        } else {
            listL0 = null;
        }
        return listL0 == null ? iun.f15405a : listL0;
    }
}
