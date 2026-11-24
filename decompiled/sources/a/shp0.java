package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class shp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32225a;
    public final String b;
    public final ArrayList c;

    public shp0(String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.f32225a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shp0)) {
            return false;
        }
        shp0 shp0Var = (shp0) obj;
        return Intrinsics.d(this.f32225a, shp0Var.f32225a) && Intrinsics.d(this.b, shp0Var.b) && this.c.equals(shp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f32225a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.n(b1j.n("TeamRatingScreenStateModel(currentFIFARanking=", this.f32225a, ", averagePosition=", this.b, ", pointList="), this.c, Separators.RPAREN);
    }
}
