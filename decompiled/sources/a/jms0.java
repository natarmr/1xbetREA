package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fwo f16780a;
    public final e8k0 b;
    public final isb c;
    public final k1h0 d;
    public final boolean e;
    public final Map f;

    /* JADX WARN: Illegal instructions before constructor call */
    public jms0(fwo fwoVar, e8k0 e8k0Var, isb isbVar, k1h0 k1h0Var, LinkedHashMap linkedHashMap, int i) {
        fwoVar = (i & 1) != 0 ? null : fwoVar;
        e8k0Var = (i & 2) != 0 ? null : e8k0Var;
        isbVar = (i & 4) != 0 ? null : isbVar;
        k1h0Var = (i & 8) != 0 ? null : k1h0Var;
        boolean z = (i & 32) == 0;
        Map map = linkedHashMap;
        if ((i & 64) != 0) {
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            map = lunVar;
        }
        this(fwoVar, e8k0Var, isbVar, k1h0Var, z, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jms0)) {
            return false;
        }
        jms0 jms0Var = (jms0) obj;
        return Intrinsics.d(this.f16780a, jms0Var.f16780a) && Intrinsics.d(this.b, jms0Var.b) && Intrinsics.d(this.c, jms0Var.c) && Intrinsics.d(this.d, jms0Var.d) && this.e == jms0Var.e && Intrinsics.d(this.f, jms0Var.f);
    }

    public final int hashCode() {
        fwo fwoVar = this.f16780a;
        int iHashCode = (fwoVar == null ? 0 : fwoVar.hashCode()) * 31;
        e8k0 e8k0Var = this.b;
        int iHashCode2 = (iHashCode + (e8k0Var == null ? 0 : e8k0Var.hashCode())) * 31;
        isb isbVar = this.c;
        int iHashCode3 = (iHashCode2 + (isbVar == null ? 0 : isbVar.hashCode())) * 31;
        k1h0 k1h0Var = this.d;
        return this.f.hashCode() + brm0.e((iHashCode3 + (k1h0Var != null ? k1h0Var.hashCode() : 0)) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f16780a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + Separators.RPAREN;
    }

    public jms0(fwo fwoVar, e8k0 e8k0Var, isb isbVar, k1h0 k1h0Var, boolean z, Map map) {
        this.f16780a = fwoVar;
        this.b = e8k0Var;
        this.c = isbVar;
        this.d = k1h0Var;
        this.e = z;
        this.f = map;
    }
}
