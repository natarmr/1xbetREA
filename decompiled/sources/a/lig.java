package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20103a;
    public final wcb b;
    public final List c;
    public final String d;
    public final boolean e;
    public final List f;
    public final boolean g;
    public final Map h;

    public lig(List list, wcb wcbVar, List list2, String str, boolean z, List list3, boolean z2, Map map) {
        b1j.B(list, list2, list3);
        this.f20103a = list;
        this.b = wcbVar;
        this.c = list2;
        this.d = str;
        this.e = z;
        this.f = list3;
        this.g = z2;
        this.h = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lig)) {
            return false;
        }
        lig ligVar = (lig) obj;
        return Intrinsics.d(this.f20103a, ligVar.f20103a) && this.b.equals(ligVar.b) && Intrinsics.d(this.c, ligVar.c) && this.d.equals(ligVar.d) && this.e == ligVar.e && Intrinsics.d(this.f, ligVar.f) && this.g == ligVar.g && this.h.equals(ligVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e(dw9.a(brm0.e(ua80.b(dw9.a((this.b.hashCode() + (this.f20103a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberChampsPageContent(champs=");
        sb.append(this.f20103a);
        sb.append(", champImagesHolder=");
        sb.append(this.b);
        sb.append(", favoriteIds=");
        h97.y(", searchQuery=", this.d, ", isMultiselectEnabled=", sb, this.c);
        vqd.y(sb, ", selectedChampIds=", this.f, ", maxCountSelected=", this.e);
        sb.append(this.g);
        sb.append(", cyberDisciplineIcons=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
