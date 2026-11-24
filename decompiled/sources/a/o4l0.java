package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o4l0 implements c5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24643a;
    public final List b;
    public final amb0 c;
    public final ms2 d;

    public o4l0(String str, List list, amb0 amb0Var, ms2 ms2Var) {
        list.getClass();
        this.f24643a = str;
        this.b = list;
        this.c = amb0Var;
        this.d = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4l0)) {
            return false;
        }
        o4l0 o4l0Var = (o4l0) obj;
        return this.f24643a.equals(o4l0Var.f24643a) && Intrinsics.d(this.b, o4l0Var.b) && this.c == o4l0Var.c && this.d.equals(o4l0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + dw9.a(this.f24643a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("Initialize(screen=", this.f24643a, ", topEventList=", this.b, ", tabType=");
        sbF.append(this.c);
        sbF.append(", entryPointType=");
        sbF.append(this.d);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
