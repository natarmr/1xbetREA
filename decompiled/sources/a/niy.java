package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class niy extends miy implements jys0, jzs0 {
    public final oiy c;
    public final String d;
    public final uiy e;
    public final hzs0 f;
    public volatile List g;

    /* JADX WARN: Illegal instructions before constructor call */
    public niy(oiy oiyVar, hzs0 hzs0Var) {
        uiy uiyVar;
        oiyVar.getClass();
        hzs0Var.getClass();
        String strB = hzs0Var.getName().b();
        strB.getClass();
        t3u0 t3u0VarT = hzs0Var.t();
        t3u0VarT.getClass();
        int iOrdinal = t3u0VarT.ordinal();
        if (iOrdinal == 0) {
            uiyVar = uiy.f35755a;
        } else if (iOrdinal == 1) {
            uiyVar = uiy.b;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                throw null;
            }
            uiyVar = uiy.c;
        }
        hzs0Var.q();
        this(hzs0Var, oiyVar, strB, uiyVar);
        List upperBounds = hzs0Var.getUpperBounds();
        upperBounds.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new wdk((wsy) it.next(), null));
        }
        this.g = arrayList;
    }

    @Override // a.miy
    public final List getUpperBounds() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        Intrinsics.h("upperBounds");
        throw null;
    }

    public niy(hzs0 hzs0Var, oiy oiyVar, String str, uiy uiyVar) {
        super(oiyVar);
        this.c = oiyVar;
        this.d = str;
        this.e = uiyVar;
        this.f = hzs0Var;
    }
}
