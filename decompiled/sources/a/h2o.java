package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h2o {
    public static kuw a(int i) {
        Object next;
        i2o i2oVar;
        String strValueOf = String.valueOf(i);
        c0o c0oVar = i2o.P4;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
            i2oVar = (i2o) next;
            if (Intrinsics.d(i2oVar.f14059a, strValueOf)) {
                break;
            }
        } while (!i2oVar.b.contains(strValueOf));
        i2o i2oVar2 = (i2o) next;
        return i2oVar2 != null ? i2oVar2 : ujn.n;
    }

    public final jiy serializer() {
        return j2o.f15790a;
    }
}
