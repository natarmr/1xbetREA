package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ofb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25157a;
    public final String b;
    public final String c;
    public final List d;

    public ofb(List list, String str, String str2, String str3) {
        list.getClass();
        this.f25157a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofb)) {
            return false;
        }
        ofb ofbVar = (ofb) obj;
        return this.f25157a.equals(ofbVar.f25157a) && this.b.equals(ofbVar.b) && this.c.equals(ofbVar.c) && Intrinsics.d(this.d, ofbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f25157a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return rw2.m(this.c, ", menus=", Separators.RPAREN, b1j.n("ChampStatisticInfoModel(id=", this.f25157a, ", title=", this.b, ", logo="), this.d);
    }
}
