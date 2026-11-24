package a;

import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ahk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Configuration f879a;
    public final w6k b;
    public final erq c;
    public final t9o0 d;
    public final sly e;
    public final boolean f;

    public ahk(Configuration configuration, w6k w6kVar, erq erqVar, t9o0 t9o0Var, sly slyVar, boolean z) {
        this.f879a = configuration;
        this.b = w6kVar;
        this.c = erqVar;
        this.d = t9o0Var;
        this.e = slyVar;
        this.f = z;
    }

    public static ahk a(ahk ahkVar, Configuration configuration, z6k z6kVar, erq erqVar, t9o0 t9o0Var, sly slyVar, int i) {
        if ((i & 1) != 0) {
            configuration = ahkVar.f879a;
        }
        Configuration configuration2 = configuration;
        w6k w6kVar = z6kVar;
        if ((i & 2) != 0) {
            w6kVar = ahkVar.b;
        }
        w6k w6kVar2 = w6kVar;
        if ((i & 4) != 0) {
            erqVar = ahkVar.c;
        }
        erq erqVar2 = erqVar;
        if ((i & 8) != 0) {
            t9o0Var = ahkVar.d;
        }
        t9o0 t9o0Var2 = t9o0Var;
        if ((i & 16) != 0) {
            slyVar = ahkVar.e;
        }
        boolean z = ahkVar.f;
        ahkVar.getClass();
        return new ahk(configuration2, w6kVar2, erqVar2, t9o0Var2, slyVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahk)) {
            return false;
        }
        ahk ahkVar = (ahk) obj;
        return this.f879a.equals((Object) ahkVar.f879a) && this.b.equals(ahkVar.b) && Intrinsics.d(this.c, ahkVar.c) && this.d.equals(ahkVar.d) && this.e.equals(ahkVar.e) && this.f == ahkVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f879a.hashCode() * 31)) * 31;
        erq erqVar = this.c;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (erqVar == null ? 0 : erqVar.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DeviceInputs(configuration=" + this.f879a + ", density=" + this.b + ", foldingFeature=" + this.c + ", insets=" + this.d + ", keyboardLiftState=" + this.e + ", isFoldableHardware=" + this.f + Separators.RPAREN;
    }
}
