package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class jkd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f16664a;
    public final Class b;

    public jkd0(Class cls, Class cls2) {
        this.f16664a = cls;
        this.b = cls2;
    }

    public static jkd0 a(Class cls) {
        return new jkd0(ikd0.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jkd0.class != obj.getClass()) {
            return false;
        }
        jkd0 jkd0Var = (jkd0) obj;
        if (this.b.equals(jkd0Var.b)) {
            return this.f16664a.equals(jkd0Var.f16664a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16664a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.f16664a;
        if (cls2 == ikd0.class) {
            return cls.getName();
        }
        return Separators.AT + cls2.getName() + Separators.SP + cls.getName();
    }
}
