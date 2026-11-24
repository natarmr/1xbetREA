package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class idh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vdh f14586a;
    public final String b;

    public idh(vdh vdhVar, String str) {
        vdhVar.getClass();
        this.f14586a = vdhVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idh)) {
            return false;
        }
        idh idhVar = (idh) obj;
        return Intrinsics.d(this.f14586a, idhVar.f14586a) && this.b.equals(idhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14586a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberSportTipModel(screen=" + this.f14586a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
