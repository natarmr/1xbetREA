package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yrw implements uqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43142a;
    public final String b;
    public final ArrayList c;
    public final boolean d;
    public final jmo e;
    public final boolean f;

    public yrw(String str, String str2, ArrayList arrayList, boolean z, jmo jmoVar, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f43142a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = z;
        this.e = jmoVar;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrw)) {
            return false;
        }
        yrw yrwVar = (yrw) obj;
        return Intrinsics.d(this.f43142a, yrwVar.f43142a) && Intrinsics.d(this.b, yrwVar.b) && this.c.equals(yrwVar.c) && this.d == yrwVar.d && this.e.equals(yrwVar.e) && this.f == yrwVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + brm0.e(twn.g(this.c, ua80.b(this.f43142a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HostVsGuestUiModel(hostName=", this.f43142a, ", guestName=", this.b, ", itemList=");
        sbN.append(this.c);
        sbN.append(", expanded=");
        sbN.append(this.d);
        sbN.append(", btnUiModel=");
        sbN.append(this.e);
        sbN.append(", rtlSupport=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
