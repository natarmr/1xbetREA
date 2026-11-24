package a;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k9a implements l9a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f17905a;
    public final Map b;

    public k9a(Map map, Map map2) {
        this.f17905a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9a)) {
            return false;
        }
        k9a k9aVar = (k9a) obj;
        return this.f17905a.equals(k9aVar.f17905a) && this.b.equals(k9aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17905a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(deferred=" + this.f17905a + ", outputSurfaceMap=" + this.b + ')';
    }
}
