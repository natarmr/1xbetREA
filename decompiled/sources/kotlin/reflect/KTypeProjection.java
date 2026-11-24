package kotlin.reflect;

import a.c99;
import a.kiy;
import a.piy;
import a.qiy;
import a.t9f;
import a.uiy;
import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "c", "a/piy", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class KTypeProjection {
    public static final piy c = new piy(null);
    public static final KTypeProjection d = new KTypeProjection(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uiy f46069a;
    public final kiy b;

    public KTypeProjection(kiy kiyVar, uiy uiyVar) {
        String str;
        this.f46069a = uiyVar;
        this.b = kiyVar;
        if ((uiyVar == null) == (kiyVar == null)) {
            return;
        }
        if (uiyVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + uiyVar + " requires type to be specified.";
        }
        c99.s(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.f46069a == kTypeProjection.f46069a && Intrinsics.d(this.b, kTypeProjection.b);
    }

    public final int hashCode() {
        uiy uiyVar = this.f46069a;
        int iHashCode = (uiyVar == null ? 0 : uiyVar.hashCode()) * 31;
        kiy kiyVar = this.b;
        return iHashCode + (kiyVar != null ? kiyVar.hashCode() : 0);
    }

    public final String toString() {
        uiy uiyVar = this.f46069a;
        int i = uiyVar == null ? -1 : qiy.f28811a[uiyVar.ordinal()];
        if (i == -1) {
            return Separators.STAR;
        }
        kiy kiyVar = this.b;
        if (i == 1) {
            return String.valueOf(kiyVar);
        }
        if (i == 2) {
            return "in " + kiyVar;
        }
        if (i != 3) {
            t9f.b();
            return null;
        }
        return "out " + kiyVar;
    }
}
