package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tz9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34794a;
    public final List b;
    public final List c;
    public final ArrayList d;
    public final e3a e;
    public final int f;
    public final Map g;
    public final int h;
    public final Map i;
    public final List j;
    public final List k;
    public final Map l;
    public final ud40 m;
    public final vz9 n;

    public tz9(String str, List list, List list2, ArrayList arrayList, e3a e3aVar, int i, LinkedHashMap linkedHashMap, int i2, jo20 jo20Var, List list3, List list4, vz9 vz9Var) {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        ud40 ud40Var = new ud40();
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.f34794a = str;
        this.b = list;
        this.c = list2;
        this.d = arrayList;
        this.e = e3aVar;
        this.f = i;
        this.g = linkedHashMap;
        this.h = i2;
        this.i = jo20Var;
        this.j = list3;
        this.k = list4;
        this.l = lunVar;
        this.m = ud40Var;
        this.n = vz9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz9)) {
            return false;
        }
        tz9 tz9Var = (tz9) obj;
        return Intrinsics.d(this.f34794a, tz9Var.f34794a) && Intrinsics.d(this.b, tz9Var.b) && this.c.equals(tz9Var.c) && Intrinsics.d(this.d, tz9Var.d) && Intrinsics.d(this.e, tz9Var.e) && this.f == tz9Var.f && this.g.equals(tz9Var.g) && this.h == tz9Var.h && this.i.equals(tz9Var.i) && this.j.equals(tz9Var.j) && this.k.equals(tz9Var.k) && this.l.equals(tz9Var.l) && this.m.equals(tz9Var.m) && this.n.equals(tz9Var.n);
    }

    public final int hashCode() {
        int iA = dw9.a(dw9.a(this.f34794a.hashCode() * 31, 31, this.b), 31, this.c);
        ArrayList arrayList = this.d;
        int iHashCode = (iA + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        e3a e3aVar = this.e;
        return (this.n.hashCode() + ((this.m.hashCode() + ohs0.f(this.l, dw9.a(dw9.a(ohs0.f(this.i, twn.a(1, twn.a(this.h, ohs0.f(this.g, twn.a(this.f, (iHashCode + (e3aVar != null ? e3aVar.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31, this.j), 31, this.k), 29791)) * 31)) * 31;
    }

    public final String toString() {
        return "Config(camera=" + ((Object) g0a.b(this.f34794a)) + ", streams=" + this.b + ", exclusiveStreamGroups=" + this.c + ", input=" + this.d + ", postviewStream=" + this.e + ", sessionTemplate=" + ((Object) onf0.b(this.f)) + ", sessionParameters=" + this.g + ", sessionMode=" + ((Object) dwi0.S(this.h)) + ", defaultTemplate=" + ((Object) onf0.b(1)) + ", defaultParameters=" + this.i + ", defaultListeners=" + this.j + ", graphStateListeners=" + this.k + ", requiredParameters=" + this.l + ", cameraBackendId=null, customCameraBackend=null, metadataTransform=" + this.m + ", flags=" + this.n + ", sessionColorSpace=null)";
    }
}
