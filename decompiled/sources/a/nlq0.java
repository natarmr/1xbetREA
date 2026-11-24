package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class nlq0 extends w46 {
    public final dnt0 b;
    public final pyu c;
    public final usd d;
    public final wyu e;
    public final xyu f;
    public final yyu g;
    public final xyu h;
    public final boolean i;
    public final p7m0 j;
    public final p7m0 k;
    public final p7m0 l;
    public final p7m0 m;
    public final p7m0 n;
    public final p7m0 o;
    public final p7m0 p;
    public final ol60 q;
    public boolean r;

    public nlq0(dnt0 dnt0Var, pyu pyuVar, usd usdVar, wyu wyuVar, xyu xyuVar, yyu yyuVar, xyu xyuVar2, boolean z) {
        wyuVar.getClass();
        this.b = dnt0Var;
        this.c = pyuVar;
        this.d = usdVar;
        this.e = wyuVar;
        this.f = xyuVar;
        this.g = yyuVar;
        this.h = xyuVar2;
        this.i = z;
        List listR0 = iun.f15405a;
        this.j = q7m0.a(new z860(0, 0, listR0));
        for (int i = 0; i < 60; i++) {
            listR0 = CollectionsKt.r0(listR0, Integer.valueOf(i));
        }
        z860 z860VarW = w(listR0);
        this.k = q7m0.a(z860VarW == null ? new z860(0, 0, iun.f15405a) : z860VarW);
        this.l = q7m0.a(new z860(0, 0, iun.f15405a));
        this.m = q7m0.a(0);
        this.n = q7m0.a(0);
        this.o = q7m0.a(0);
        this.p = q7m0.a(Boolean.FALSE);
        this.q = new ol60(3);
        this.r = true;
    }

    public static z860 w(List list) {
        if (list.isEmpty()) {
            return null;
        }
        int iIntValue = ((Number) CollectionsKt.U(list)).intValue();
        int iIntValue2 = ((Number) CollectionsKt.d0(list)).intValue();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.b0(2, String.valueOf(((Number) it.next()).intValue())));
        }
        return new z860(iIntValue, iIntValue2, arrayList);
    }
}
