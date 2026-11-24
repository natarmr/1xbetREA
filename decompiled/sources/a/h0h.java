package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12235a;
    public final List b;

    public h0h(String str, List list) {
        list.getClass();
        this.f12235a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0h)) {
            return false;
        }
        h0h h0hVar = (h0h) obj;
        return this.f12235a.equals(h0hVar.f12235a) && Intrinsics.d(this.b, h0hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12235a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CyberGroupModel(groupName=", this.f12235a, ", teamModels=", this.b, Separators.RPAREN);
    }
}
