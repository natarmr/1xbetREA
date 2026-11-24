package a;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ako0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1032a;
    public final Map b;
    public final Set c;
    public final Set d;

    public ako0(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.f1032a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ako0)) {
            return false;
        }
        ako0 ako0Var = (ako0) obj;
        if (!this.f1032a.equals(ako0Var.f1032a) || !this.b.equals(ako0Var.b) || !Intrinsics.d(this.c, ako0Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = ako0Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ohs0.f(this.b, this.f1032a.hashCode() * 31, 31);
    }

    public final String toString() {
        Collection collectionA0;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f1032a);
        sb.append("',\n            |    columns = {");
        sb.append(j5n0.A(CollectionsKt.A0(this.b.values(), new tgo0((byte) 3))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(j5n0.A(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        if (set == null || (collectionA0 = CollectionsKt.A0(set, new tgo0((byte) 5))) == null) {
            collectionA0 = iun.f15405a;
        }
        sb.append(j5n0.A(collectionA0));
        sb.append("\n            |}\n        ");
        return ntm0.d(sb.toString());
    }
}
