package a;

import android.gov.nist.core.Separators;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rt8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ss8 f31065a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public Rect f;
    public final rt8 g;
    public or8 h;

    public rt8(ss8 ss8Var) {
        ss8Var.getClass();
        this.f31065a = ss8Var;
        this.f = new Rect();
        List list = ss8Var.f32713a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new rt8((ss8) it.next()));
        }
        this.b = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((rt8) it2.next()).g = this;
        }
    }

    public final boolean a() {
        or8 or8Var = this.h;
        return (or8Var != null ? or8Var.getParent() : null) != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt8) && Intrinsics.d(this.f31065a, ((rt8) obj).f31065a);
    }

    public final int hashCode() {
        return this.f31065a.hashCode();
    }

    public final String toString() {
        return "BracketViewData(bracketModel=" + this.f31065a + Separators.RPAREN;
    }
}
