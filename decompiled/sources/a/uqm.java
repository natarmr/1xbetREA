package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/uqm;", "La/um40;", "La/tqm;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class uqm extends um40 {
    public final List b;

    public uqm(List list) {
        list.getClass();
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqm) && Intrinsics.d(this.b, ((uqm) obj).b);
    }

    @Override // a.um40
    public final lm40 f() {
        return new tqm(this.b);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        tqm tqmVar = (tqm) lm40Var;
        tqmVar.getClass();
        List list = this.b;
        list.getClass();
        ArrayList arrayList = tqmVar.p;
        if (Intrinsics.d(arrayList, list)) {
            return;
        }
        arrayList.clear();
        arrayList.addAll(list);
        vfc.J(tqmVar);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return twn.r(this.b, "DsShadowEffectItemNodeElement(configList=", Separators.RPAREN);
    }
}
