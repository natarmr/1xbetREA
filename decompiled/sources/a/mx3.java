package a;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class mx3 extends r2e {
    public final Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx3(List list, Function1 function1) {
        super(list);
        list.getClass();
        this.b = function1;
    }

    @Override // a.r2e
    public final wsy a(ym40 ym40Var) {
        ym40Var.getClass();
        wsy wsyVar = (wsy) this.b.invoke(ym40Var);
        if (!ary.z(wsyVar) && !ary.G(wsyVar) && !ary.C(wsyVar, i4m0.W.f32934a) && !ary.C(wsyVar, i4m0.X.f32934a) && !ary.C(wsyVar, i4m0.Y.f32934a)) {
            ary.C(wsyVar, i4m0.Z.f32934a);
        }
        return wsyVar;
    }
}
