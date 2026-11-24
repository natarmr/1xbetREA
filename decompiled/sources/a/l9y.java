package a;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class l9y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19680a;
    public final n9y b;

    public /* synthetic */ l9y(n9y n9yVar, byte b) {
        this.f19680a = b;
        this.b = n9yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        rv9 rv9Var;
        byte b = this.f19680a;
        n9y n9yVar = this.b;
        switch (b) {
            case 0:
                return ufx.x(n9yVar);
            case 1:
                return n9yVar.B().getTypeParameters();
            case 2:
                gi2 gi2Var = two.f34660a;
                rgy rgyVar = n9yVar.f8277a;
                if (!rgyVar.c()) {
                    ihy ihyVar = n9yVar.c;
                    xgy xgyVar = ihyVar instanceof xgy ? (xgy) ihyVar : null;
                    return xgyVar == null ? iun.f15405a : two.b(xgyVar, two.h(n9yVar, j0o.f15691a));
                }
                List<dre0> list = rgyVar.f;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (dre0 dre0Var : list) {
                    dre0Var.getClass();
                    arrayList.add((gre0) dre0Var);
                }
                return arrayList;
            default:
                if (Modifier.isStatic(n9yVar.B().getModifiers())) {
                    Method methodB = n9yVar.B();
                    if (fre0.W(n9yVar)) {
                        return new qv9(methodB, false, fre0.P(n9yVar));
                    }
                    rv9Var = new rv9((byte) 2, 6, methodB, false);
                } else {
                    Method methodB2 = n9yVar.B();
                    if (fre0.W(n9yVar)) {
                        return new ov9(methodB2, fre0.P(n9yVar));
                    }
                    rv9Var = new rv9((byte) 0, 6, methodB2, false);
                }
                return rv9Var;
        }
    }
}
