package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class te80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f33807a;
    public final LinkedHashMap b;
    public final o03 c;
    public final LinkedHashMap d;

    public te80(ArrayList arrayList, LinkedHashMap linkedHashMap, o03 o03Var, LinkedHashMap linkedHashMap2) {
        this.f33807a = arrayList;
        this.b = linkedHashMap;
        this.c = o03Var;
        this.d = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te80)) {
            return false;
        }
        te80 te80Var = (te80) obj;
        return this.f33807a.equals(te80Var.f33807a) && this.b.equals(te80Var.b) && Intrinsics.d(this.c, te80Var.c) && this.d.equals(te80Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f33807a.hashCode() * 31)) * 31;
        o03 o03Var = this.c;
        return this.d.hashCode() + ((iHashCode + (o03Var == null ? 0 : o03Var.hashCode())) * 31);
    }

    public final String toString() {
        return "OutputConfigurations(all=" + this.f33807a + ", deferred=" + this.b + ", postviewOutput=" + this.c + ", outputSurfaceMap=" + this.d + ')';
    }
}
