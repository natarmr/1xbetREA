package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kxb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19046a;
    public final ArrayList b;
    public final int c;

    public kxb(int i, ArrayList arrayList, List list) {
        list.getClass();
        this.f19046a = list;
        this.b = arrayList;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxb)) {
            return false;
        }
        kxb kxbVar = (kxb) obj;
        return Intrinsics.d(this.f19046a, kxbVar.f19046a) && this.b.equals(kxbVar.b) && this.c == kxbVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.g(this.b, this.f19046a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultMessageListContainer(messages=");
        sb.append(this.f19046a);
        sb.append(", uiItems=");
        sb.append(this.b);
        sb.append(", scrollPosition=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
