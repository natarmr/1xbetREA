package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes2.dex */
public final class tek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xj f33825a;
    public final /* synthetic */ byte b;

    public tek(xj xjVar, byte b) {
        this.b = b;
        xjVar.getClass();
        this.f33825a = xjVar;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0226 A[ADDED_TO_REGION, LOOP:1: B:129:0x0226->B:141:0x0257, LOOP_START, PHI: r12
  0x0226: PHI (r12v1 a.vjj) = (r12v0 a.vjj), (r12v2 a.vjj) binds: [B:127:0x0223, B:141:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x0228  */
    /* JADX WARN: Code duplicated, block: B:132:0x022b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0257 A[LOOP:1: B:129:0x0226->B:141:0x0257, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [a.vjj] */
    /* JADX WARN: Type inference failed for: r11v0, types: [a.akj, a.vjj] */
    /* JADX WARN: Type inference failed for: r11v1, types: [a.vjj] */
    /* JADX WARN: Type inference failed for: r11v2, types: [a.vjj] */
    /* JADX WARN: Type inference failed for: r11v3, types: [a.vjj] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final boolean a(vde0 vde0Var, akj akjVar, vjj vjjVar) {
        vjj vjjVarI;
        wm40 wm40Var;
        switch (this.b) {
            case 0:
                if (vjjVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", RemoteMessageConst.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                }
                if (oek.r(akjVar) && oek.e(vjjVar) != jdk0.b) {
                    return uek.d(akjVar, vjjVar);
                }
                if (akjVar instanceof x4e) {
                    ((x4e) akjVar).j();
                }
                while (akjVar != 0) {
                    akjVar = akjVar.j();
                    if (((akjVar instanceof wm40) && !oek.l(akjVar)) || (akjVar instanceof mg80)) {
                        if (akjVar == 0) {
                            return false;
                        }
                        while (vjjVar != null) {
                            if (akjVar != vjjVar) {
                                if (!(vjjVar instanceof mg80)) {
                                    vjjVar = vjjVar.j();
                                } else if ((akjVar instanceof mg80) || !((ng80) ((mg80) akjVar)).f.equals(((ng80) ((mg80) vjjVar)).f) || !oek.c(vjjVar).equals(oek.c(akjVar))) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        return false;
                    }
                }
                if (akjVar == 0) {
                    return false;
                }
                while (vjjVar != null) {
                    if (akjVar != vjjVar) {
                        if (!(vjjVar instanceof mg80)) {
                            return akjVar instanceof mg80 ? false : false;
                        }
                        vjjVar = vjjVar.j();
                    }
                    return true;
                }
                return false;
            case 1:
                if (vjjVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", RemoteMessageConst.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                }
                if (!uek.f35533a.a(vde0Var, akjVar, vjjVar)) {
                    return false;
                }
                if (vde0Var == uek.m) {
                    return true;
                }
                if (vde0Var == uek.l || (vjjVarI = oek.i(akjVar, wm40.class, true)) == null || !(vde0Var instanceof k4x)) {
                    return false;
                }
                return ((k4x) vde0Var).f17690a.S().equals(vjjVarI.o1());
            case 2:
                if (vjjVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", RemoteMessageConst.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                wm40 wm40Var2 = (wm40) oek.i(akjVar, wm40.class, true);
                wm40 wm40Var3 = (wm40) oek.i(vjjVar, wm40.class, false);
                if (wm40Var3 == null) {
                    return false;
                }
                if (wm40Var2 == null || !oek.l(wm40Var2) || (wm40Var = (wm40) oek.i(wm40Var2, wm40.class, true)) == null || !oek.q(wm40Var3.I(), wm40Var.S())) {
                    ?? S = akjVar instanceof mp9 ? oek.s((mp9) akjVar) : akjVar;
                    wm40 wm40Var4 = (wm40) oek.i(S, wm40.class, true);
                    if (wm40Var4 == null) {
                        return false;
                    }
                    if (oek.q(wm40Var3.I(), wm40Var4.S()) && vde0Var != uek.n) {
                        if ((S instanceof mp9) && !(S instanceof x4e) && vde0Var != uek.m) {
                            if (vde0Var != uek.l && vde0Var != null) {
                                wsy type = vde0Var.getType();
                                if (!oek.q(type, wm40Var3)) {
                                    type.j0();
                                }
                            }
                        }
                    }
                    return a(vde0Var, akjVar, wm40Var3.j());
                }
                return true;
            case 3:
                if (vjjVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", RemoteMessageConst.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                }
                if (!oek.c(vjjVar).Z(oek.c(akjVar))) {
                    return false;
                }
                uek.o.getClass();
                return true;
            case 4:
                if (vjjVar != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", RemoteMessageConst.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case 5:
                if (vjjVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", RemoteMessageConst.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                if (vjjVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", RemoteMessageConst.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 7:
                if (vjjVar != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", RemoteMessageConst.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            case 8:
                if (vjjVar != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", RemoteMessageConst.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
            case 9:
                if (vjjVar != null) {
                    return w8y.b(akjVar, vjjVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", RemoteMessageConst.FROM, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 10:
                if (vjjVar != null) {
                    return w8y.c(vde0Var, akjVar, vjjVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", RemoteMessageConst.FROM, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (vjjVar != null) {
                    return w8y.c(vde0Var, akjVar, vjjVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", RemoteMessageConst.FROM, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    public final String toString() {
        return this.f33825a.e();
    }
}
