package a;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes.dex */
public final class piu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f27059a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f27059a;
        Map mapN = xp20.n(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapN.values().iterator();
        while (it.hasNext()) {
            ((diu0) it.next()).t();
        }
    }

    public final String toString() {
        String strJ = sre0.f32672a.b(piu0.class).J();
        if (strJ == null) {
            strJ = "ViewModelStore";
        }
        String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        string.getClass();
        return strJ + Separators.AT + string + "(keys=" + CollectionsKt.P0(this.f27059a.keySet()) + Separators.RPAREN;
    }
}
