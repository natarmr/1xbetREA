package a;

import android.gov.nist.core.Separators;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class kfy implements hfk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rey f18214a;
    public final rey b;
    public final jre0 c;

    public kfy(jre0 jre0Var, m3d0 m3d0Var, ify ifyVar, boolean z, gfk gfkVar) {
        jre0Var.getClass();
        m3d0Var.getClass();
        ifyVar.getClass();
        rey reyVar = new rey(rey.b(bqe0.a(jre0Var.f16999a)));
        cry cryVar = jre0Var.b;
        rey reyVar2 = null;
        String str = ((bry) cryVar.c) != bry.MULTIFILE_CLASS_PART ? null : (String) cryVar.h;
        if (str != null && str.length() > 0) {
            reyVar2 = new rey(str);
        }
        new wrb0(z);
        this.f18214a = reyVar;
        this.b = reyVar2;
        this.c = jre0Var;
        ijt ijtVar = dgy.k;
        ijtVar.getClass();
        Integer num = (Integer) h8x.L(m3d0Var, ijtVar);
        if (num != null) {
            ifyVar.getString(num.intValue());
        }
    }

    public final qlc a() {
        swq swqVar;
        rey reyVar = this.f18214a;
        String str = reyVar.f30360a;
        int iLastIndexOf = str.lastIndexOf(Separators.SLASH);
        if (iLastIndexOf == -1) {
            swqVar = swq.c;
            if (swqVar == null) {
                rey.a(9);
                throw null;
            }
        } else {
            swqVar = new swq(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String str2 = reyVar.f30360a;
        if (str2 != null) {
            return new qlc(swqVar, g950.e(StringsKt.o0('/', str2, str2)));
        }
        rey.a(10);
        throw null;
    }

    @Override // a.hfk
    public final String b() {
        return axq.m(new StringBuilder("Class '"), a().a().f32934a.f34663a, '\'');
    }

    public final String toString() {
        return kfy.class.getSimpleName() + ": " + this.f18214a;
    }
}
