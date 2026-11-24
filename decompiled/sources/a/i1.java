package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i1 extends r5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(eu00 eu00Var) {
        super(eu00Var);
        if (eu00Var != null) {
        } else {
            j(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void j(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // a.iys0
    public final ary c() {
        ary aryVarE = rek.e(k());
        if (aryVarE != null) {
            return aryVarE;
        }
        j(1);
        throw null;
    }

    @Override // a.r5
    public final wsy d() {
        wm40 wm40VarK = k();
        if (wm40VarK == null) {
            ary.a(107);
            throw null;
        }
        g950 g950Var = ary.e;
        if (ary.b(wm40VarK, i4m0.f14153a) || ary.b(wm40VarK, i4m0.b)) {
            return null;
        }
        return c().e();
    }

    @Override // a.r5
    public final boolean h(foc focVar) {
        boolean z;
        if (focVar instanceof wm40) {
            wm40 wm40VarK = k();
            wm40VarK.getClass();
            if (!Intrinsics.d(wm40VarK.getName(), focVar.getName())) {
                z = false;
                break;
            }
            vjj vjjVarJ = wm40VarK.j();
            vjj vjjVarJ2 = focVar.j();
            while (true) {
                if (vjjVarJ != null && vjjVarJ2 != null) {
                    if (!(vjjVarJ instanceof ym40)) {
                        if (!(vjjVarJ2 instanceof ym40)) {
                            if (vjjVarJ instanceof mg80) {
                                if (!(vjjVarJ2 instanceof mg80) || !Intrinsics.d(((ng80) ((mg80) vjjVarJ)).f, ((ng80) ((mg80) vjjVarJ2)).f)) {
                                    break;
                                }
                            } else if (!(vjjVarJ2 instanceof mg80) && Intrinsics.d(vjjVarJ.getName(), vjjVarJ2.getName())) {
                                vjjVarJ = vjjVarJ.j();
                                vjjVarJ2 = vjjVarJ2.j();
                            }
                        }
                        z = false;
                        break;
                    }
                    z = vjjVarJ2 instanceof ym40;
                    break;
                }
                z = true;
                break;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public abstract wm40 k();
}
