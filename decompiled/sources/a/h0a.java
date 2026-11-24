package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h0a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12224a;
    public final y35 b;

    public h0a(ArrayList arrayList, y35 y35Var) {
        this.f12224a = arrayList;
        this.b = y35Var;
        z1x.t("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final String a() {
        ArrayList arrayList = this.f12224a;
        z1x.y("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) CollectionsKt.U(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0a)) {
            return false;
        }
        h0a h0aVar = (h0a) obj;
        return this.f12224a.equals(h0aVar.f12224a) && Intrinsics.d(this.b, h0aVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f12224a.hashCode() * 31;
        y35 y35Var = this.b;
        return iHashCode + (y35Var != null ? y35Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(CollectionsKt.b0(this.f12224a, Separators.COMMA, null, null, null, 62));
        y35 y35Var = this.b;
        if (y35Var != null) {
            str = ", compatId=" + y35Var;
        } else {
            str = "";
        }
        return axq.m(sb, str, '}');
    }
}
