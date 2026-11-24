package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kk9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f18425a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final qrm0 f;
    public final fot0 g;
    public final HashMap h;
    public final srm0 i;
    public final srm0 j;

    public kk9(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, qrm0 qrm0Var, fot0 fot0Var, HashMap map, srm0 srm0Var, srm0 srm0Var2) {
        srm0Var.getClass();
        this.f18425a = linkedHashSet;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = qrm0Var;
        this.g = fot0Var;
        this.h = map;
        this.i = srm0Var;
        this.j = srm0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk9)) {
            return false;
        }
        kk9 kk9Var = (kk9) obj;
        return this.f18425a.equals(kk9Var.f18425a) && this.b.equals(kk9Var.b) && this.c.equals(kk9Var.c) && this.d.equals(kk9Var.d) && this.e.equals(kk9Var.e) && Intrinsics.d(this.f, kk9Var.f) && Intrinsics.d(this.g, kk9Var.g) && this.h.equals(kk9Var.h) && Intrinsics.d(this.i, kk9Var.i) && Intrinsics.d(this.j, kk9Var.j);
    }

    public final int hashCode() {
        int iG = twn.g(this.e, twn.g(this.d, twn.g(this.c, twn.g(this.b, this.f18425a.hashCode() * 31, 31), 31), 31), 31);
        qrm0 qrm0Var = this.f;
        int iHashCode = (iG + (qrm0Var == null ? 0 : qrm0Var.hashCode())) * 31;
        fot0 fot0Var = this.g;
        int iHashCode2 = (this.i.hashCode() + ((this.h.hashCode() + ((iHashCode + (fot0Var == null ? 0 : fot0Var.hashCode())) * 31)) * 31)) * 31;
        srm0 srm0Var = this.j;
        return iHashCode2 + (srm0Var != null ? srm0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.f18425a + ", cameraUseCases=" + this.b + ", cameraUseCasesToAttach=" + this.c + ", cameraUseCasesToKeep=" + this.d + ", cameraUseCasesToDetach=" + this.e + ", streamSharing=" + this.f + ", placeholderForExtensions=" + this.g + ", useCaseConfigs=" + this.h + ", primaryStreamSpecResult=" + this.i + ", secondaryStreamSpecResult=" + this.j + ')';
    }
}
