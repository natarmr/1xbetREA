package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class og80 implements pg80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25205a;

    public og80(ArrayList arrayList) {
        this.f25205a = arrayList;
    }

    @Override // a.pg80
    public final void a(swq swqVar, ArrayList arrayList) {
        swqVar.getClass();
        for (Object obj : this.f25205a) {
            if (Intrinsics.d(((ng80) ((mg80) obj)).f, swqVar)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // a.pg80
    public final boolean b(swq swqVar) {
        swqVar.getClass();
        ArrayList arrayList = this.f25205a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((ng80) ((mg80) it.next())).f, swqVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // a.pg80
    public final Collection n(swq swqVar, Function1 function1) {
        swqVar.getClass();
        return pgi0.t(pgi0.h(pgi0.p(new sx3(this.f25205a, (byte) 1), b180.d), new ald(swqVar, (byte) 1)));
    }
}
