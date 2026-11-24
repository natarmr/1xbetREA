package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class amq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1123a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;

    static {
        hne.s(0, 1, 2, 3, 4);
        vtt0.H(5);
        vtt0.H(6);
    }

    public amq0() {
        uo uoVar = uo.c;
    }

    public final long a(int i, int i2) {
        so soVarA = uo.c.a(i);
        if (soVarA.f32518a != -1) {
            return soVarA.e[i2];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        so soVarA;
        int i;
        uo uoVar = uo.c;
        long j2 = this.d;
        int i2 = uoVar.f35986a;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                uoVar.a(i3).getClass();
                uoVar.a(i3).getClass();
                if (0 > j && ((i = (soVarA = uoVar.a(i3)).f32518a) == -1 || soVarA.a(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                if (j2 != -9223372036854775807L) {
                    uoVar.a(i3).getClass();
                    if (0 <= j2) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    public final int c(long j) {
        uo uoVar = uo.c;
        int i = uoVar.f35986a;
        int i2 = i - 1;
        if (i2 == i - 1) {
            uoVar.a(i2).getClass();
        }
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            uoVar.a(i2).getClass();
            if (j >= 0) {
                break;
            }
            i2--;
        }
        if (i2 >= 0) {
            so soVarA = uoVar.a(i2);
            int i3 = soVarA.f32518a;
            if (i3 != -1) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = soVarA.d[i4];
                    if (i5 != 0 && i5 != 1) {
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    public final long d(int i) {
        uo.c.a(i).getClass();
        return 0L;
    }

    public final int e(int i) {
        return uo.c.a(i).a(-1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !amq0.class.equals(obj.getClass())) {
            return false;
        }
        amq0 amq0Var = (amq0) obj;
        if (!Objects.equals(this.f1123a, amq0Var.f1123a) || !Objects.equals(this.b, amq0Var.b) || this.c != amq0Var.c || this.d != amq0Var.d || this.e != amq0Var.e || this.f != amq0Var.f) {
            return false;
        }
        uo uoVar = uo.c;
        return uoVar.equals(uoVar);
    }

    public final boolean f(int i) {
        uo uoVar = uo.c;
        int i2 = uoVar.f35986a;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        uoVar.a(i).getClass();
        return false;
    }

    public final boolean g(int i) {
        uo.c.a(i).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i, long j, long j2, boolean z) {
        uo uoVar = uo.c;
        this.f1123a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final int hashCode() {
        Object obj = this.f1123a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j = this.d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        return uo.c.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
