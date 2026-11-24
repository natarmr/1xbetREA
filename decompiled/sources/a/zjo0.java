package a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zjo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44491a;
    public final Map b;
    public final Set c;
    public final Set d;

    public zjo0(String str, Map map, Set set, Set set2) {
        str.getClass();
        map.getClass();
        set.getClass();
        this.f44491a = str;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjo0)) {
            return false;
        }
        zjo0 zjo0Var = (zjo0) obj;
        if (!Intrinsics.d(this.f44491a, zjo0Var.f44491a) || !Intrinsics.d(this.b, zjo0Var.b) || !Intrinsics.d(this.c, zjo0Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = zjo0Var.d) == null) {
            return true;
        }
        return Intrinsics.d(set2, set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ohs0.f(this.b, this.f44491a.hashCode() * 31, 31);
    }

    public final String toString() {
        Collection collectionA0;
        String strM = u4n0.m(CollectionsKt.A0(this.b.values(), new tgo0((byte) 2)));
        String strM2 = u4n0.m(this.c);
        Set set = this.d;
        if (set == null || (collectionA0 = CollectionsKt.A0(set, new tgo0((byte) 4))) == null) {
            collectionA0 = iun.f15405a;
        }
        String strM3 = u4n0.m(collectionA0);
        StringBuilder sbN = b1j.n("\n            |TableInfo {\n            |    name = '", this.f44491a, "',\n            |    columns = {", strM, "\n            |    foreignKeys = {");
        sbN.append(strM2);
        sbN.append("\n            |    indices = {");
        sbN.append(strM3);
        sbN.append("\n            |}\n        ");
        return ntm0.d(sbN.toString());
    }
}
