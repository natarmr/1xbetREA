package a;

import android.gov.nist.core.Separators;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vs8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ts8 f37937a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public Rect f;
    public final vs8 g;

    public vs8(ts8 ts8Var) {
        ts8Var.getClass();
        this.f37937a = ts8Var;
        this.f = new Rect();
        List list = ts8Var.f34449a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new vs8((ts8) it.next()));
        }
        this.b = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((vs8) it2.next()).g = this;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vs8) && Intrinsics.d(this.f37937a, ((vs8) obj).f37937a);
    }

    public final int hashCode() {
        return this.f37937a.hashCode();
    }

    public final String toString() {
        return "BracketNodeViewData(model=" + this.f37937a + Separators.RPAREN;
    }
}
