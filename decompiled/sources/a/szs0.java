package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class szs0 implements kiy {
    public static final rzs0 d = new rzs0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fhy f33085a;
    public final List b;
    public final boolean c;

    public szs0(fhy fhyVar, List list, boolean z) {
        fhyVar.getClass();
        list.getClass();
        this.f33085a = fhyVar;
        this.b = list;
        this.c = z;
    }

    @Override // a.kiy
    public final List M() {
        return this.b;
    }

    public final String c(boolean z) {
        String name;
        fhy fhyVar = this.f33085a;
        sgy sgyVar = fhyVar instanceof sgy ? (sgy) fhyVar : null;
        Class clsG = sgyVar != null ? azw.G(sgyVar) : null;
        if (clsG == null) {
            name = fhyVar.toString();
        } else if (!clsG.isArray()) {
            name = (z && clsG.isPrimitive()) ? azw.H((sgy) fhyVar).getName() : clsG.getName();
        } else if (clsG.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsG.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsG.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsG.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsG.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsG.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsG.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsG.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        return w6x.q(name, this.b.isEmpty() ? "" : CollectionsKt.b0(this.b, ", ", Separators.LESS_THAN, Separators.GREATER_THAN, new qzs0(this), 24), h() ? Separators.QUESTION : "");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof szs0)) {
            return false;
        }
        szs0 szs0Var = (szs0) obj;
        return Intrinsics.d(this.f33085a, szs0Var.f33085a) && Intrinsics.d(this.b, szs0Var.b) && this.c == szs0Var.c;
    }

    @Override // a.pgy
    public final List getAnnotations() {
        return iun.f15405a;
    }

    @Override // a.kiy
    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c ? 1 : 0) + dw9.a(this.f33085a.hashCode() * 31, 31, this.b);
    }

    @Override // a.kiy
    public final fhy o() {
        return this.f33085a;
    }

    public final String toString() {
        return c(false).concat(" (Kotlin reflection is not available)");
    }
}
