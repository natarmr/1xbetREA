package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kxr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19071a;

    static {
        zcl zclVar = qmk.f28987a;
        f19071a = 47.0f;
    }

    public static final ArrayList a(a4x a4xVar) {
        ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
        Iterator<E> it = a4xVar.iterator();
        while (it.hasNext()) {
            rwr0 rwr0Var = (rwr0) it.next();
            lc00 lc00VarB = kotlin.collections.a.b();
            zcl zclVar = qmk.f28987a;
            lc00VarB.add(new fxr0(34.0f));
            lc00VarB.addAll(rwr0Var.b);
            i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
            pr8 pr8Var = rwr0Var.f31230a;
            pr8Var.getClass();
            i4VarR0.getClass();
            arrayList.add(new rwr0(pr8Var, i4VarR0));
        }
        return arrayList;
    }
}
