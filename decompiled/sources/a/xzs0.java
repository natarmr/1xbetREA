package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xzs0 {
    public static final xzs0 b = new xzs0(vzs0.f38313a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vzs0 f41769a;

    public xzs0(vzs0 vzs0Var) {
        this.f41769a = vzs0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                case 32:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = Payload.TYPE;
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[0] = "originalProjection";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[0] = "originalType";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            break;
                        default:
                            switch (i) {
                                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static t3u0 b(t3u0 t3u0Var, t3u0 t3u0Var2) {
        if (t3u0Var == null) {
            a(38);
            throw null;
        }
        if (t3u0Var2 == null) {
            a(39);
            throw null;
        }
        t3u0 t3u0Var3 = t3u0.c;
        if (t3u0Var == t3u0Var3) {
            if (t3u0Var2 != null) {
                return t3u0Var2;
            }
            a(40);
            throw null;
        }
        if (t3u0Var2 == t3u0Var3) {
            if (t3u0Var != null) {
                return t3u0Var;
            }
            a(41);
            throw null;
        }
        if (t3u0Var == t3u0Var2) {
            if (t3u0Var2 != null) {
                return t3u0Var2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + t3u0Var + "' and projection kind '" + t3u0Var2 + "' cannot be combined");
    }

    public static int c(t3u0 t3u0Var, t3u0 t3u0Var2) {
        t3u0 t3u0Var3 = t3u0.d;
        if (t3u0Var == t3u0Var3 && t3u0Var2 == t3u0.e) {
            return 3;
        }
        return (t3u0Var == t3u0.e && t3u0Var2 == t3u0Var3) ? 2 : 1;
    }

    public static xzs0 d(wsy wsyVar) {
        if (wsyVar == null) {
            a(6);
            throw null;
        }
        return new xzs0(lys0.b.a(wsyVar.S(), wsyVar.J()));
    }

    public static xzs0 e(vzs0 vzs0Var, vzs0 vzs0Var2) {
        if (vzs0Var == null) {
            a(3);
            throw null;
        }
        if (vzs0Var2 == null) {
            a(4);
            throw null;
        }
        if (vzs0Var.e()) {
            vzs0Var = vzs0Var2;
        } else if (!vzs0Var2.e()) {
            vzs0Var = new dvk(vzs0Var, vzs0Var2);
        }
        return new xzs0(vzs0Var);
    }

    public static String g(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (vic.B(th)) {
                throw th;
            }
            return ohs0.q("[Exception while computing toString(): ", "]", th);
        }
    }

    public final wsy f(wsy wsyVar, t3u0 t3u0Var) {
        if (wsyVar == null) {
            a(9);
            throw null;
        }
        if (this.f41769a.e()) {
            return wsyVar;
        }
        try {
            wsy wsyVarB = i(new q4m0(wsyVar, t3u0Var), null, 0).b();
            if (wsyVarB != null) {
                return wsyVarB;
            }
            a(12);
            throw null;
        } catch (wzs0 e) {
            return f2o.c(c2o.k, e.getMessage());
        }
    }

    public final wsy h(wsy wsyVar, t3u0 t3u0Var) throws wzs0 {
        if (wsyVar == null) {
            a(14);
            throw null;
        }
        if (t3u0Var == null) {
            a(15);
            throw null;
        }
        vzs0 vzs0Var = this.f41769a;
        pzs0 q4m0Var = new q4m0(vzs0Var.f(wsyVar, t3u0Var), t3u0Var);
        if (!vzs0Var.e()) {
            try {
                q4m0Var = i(q4m0Var, null, 0);
            } catch (wzs0 unused) {
                q4m0Var = null;
            }
        }
        if (vzs0Var.a() || vzs0Var.b()) {
            boolean zB = vzs0Var.b();
            if (q4m0Var == null) {
                q4m0Var = null;
            } else if (!q4m0Var.c()) {
                wsy wsyVarB = q4m0Var.b();
                wsyVarB.getClass();
                if (e0t0.c(wsyVarB, i13.p, null)) {
                    t3u0 t3u0VarA = q4m0Var.a();
                    t3u0VarA.getClass();
                    if (t3u0VarA == t3u0.e) {
                        q4m0Var = new q4m0((wsy) o2e.W(wsyVarB).b, t3u0VarA);
                    } else if (zB) {
                        q4m0Var = new q4m0((wsy) o2e.W(wsyVarB).f10195a, t3u0VarA);
                    } else {
                        aaa aaaVar = new aaa();
                        xzs0 xzs0Var = new xzs0(aaaVar);
                        if (!aaaVar.e()) {
                            try {
                                q4m0Var = xzs0Var.i(q4m0Var, null, 0);
                            } catch (wzs0 unused2) {
                                q4m0Var = null;
                            }
                        }
                    }
                }
            }
        }
        if (q4m0Var == null) {
            return null;
        }
        return q4m0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0202  */
    /* JADX WARN: Code duplicated, block: B:105:0x0218  */
    /* JADX WARN: Code duplicated, block: B:107:0x0220  */
    /* JADX WARN: Code duplicated, block: B:108:0x0223  */
    /* JADX WARN: Code duplicated, block: B:110:0x0226  */
    /* JADX WARN: Code duplicated, block: B:111:0x0229  */
    /* JADX WARN: Code duplicated, block: B:113:0x022c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0230  */
    /* JADX WARN: Code duplicated, block: B:118:0x0238  */
    /* JADX WARN: Code duplicated, block: B:119:0x0247  */
    /* JADX WARN: Code duplicated, block: B:124:0x026a  */
    /* JADX WARN: Code duplicated, block: B:126:0x028e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0291  */
    /* JADX WARN: Code duplicated, block: B:131:0x0295  */
    /* JADX WARN: Code duplicated, block: B:133:0x029b  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0141  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x017e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0192 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x019e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f4  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final pzs0 i(pzs0 pzs0Var, hzs0 hzs0Var, int i) throws wzs0 {
        wsy wsyVarB;
        t3u0 t3u0VarA;
        tft0 tft0VarJ0;
        p pVar;
        kzj0 kzj0Var;
        List parameters;
        List listJ;
        ArrayList arrayList;
        boolean z;
        wsy wsyVarY;
        hzs0 hzs0Var2;
        pzs0 pzs0Var2;
        pzs0 pzs0VarI;
        int iE;
        char c;
        t3u0 t3u0VarT;
        t3u0 t3u0Var;
        xzs0 xzs0Var;
        g5x g5xVar;
        int iC;
        aty atyVarJ0;
        fyf fyfVar;
        wsy wsyVarI;
        g93 g93VarC;
        int iE2;
        wsy wsyVarH = null;
        if (pzs0Var == null) {
            a(18);
            throw null;
        }
        vzs0 vzs0Var = this.f41769a;
        if (i > 100) {
            e9d0.k("Recursion too deep. Most likely infinite loop while substituting ", g(pzs0Var), "; substitution: ", g(vzs0Var));
            return null;
        }
        if (!pzs0Var.c()) {
            wsy wsyVarB2 = pzs0Var.b();
            if (wsyVarB2 instanceof g0t0) {
                g0t0 g0t0Var = (g0t0) wsyVarB2;
                tft0 origin = g0t0Var.getOrigin();
                wsy wsyVarP = g0t0Var.p();
                pzs0 pzs0VarI2 = i(new q4m0(origin, pzs0Var.a()), hzs0Var, i + 1);
                return pzs0VarI2.c() ? pzs0VarI2 : new q4m0(xsm0.z(pzs0VarI2.b().j0(), h(wsyVarP, pzs0Var.a())), pzs0VarI2.a());
            }
            wsyVarB2.getClass();
            wsyVarB2.j0();
            if (!(wsyVarB2.j0() instanceof dae0)) {
                pzs0 pzs0VarD = vzs0Var.d(wsyVarB2);
                if (pzs0VarD == null) {
                    pzs0VarD = null;
                } else if (wsyVarB2.getAnnotations().z0(i4m0.y)) {
                    iys0 iys0VarS = pzs0VarD.b().S();
                    if (iys0VarS instanceof zl50) {
                        pzs0 pzs0Var3 = ((zl50) iys0VarS).f44565a;
                        t3u0 t3u0VarA2 = pzs0Var3.a();
                        if (c(pzs0Var.a(), t3u0VarA2) == 3) {
                            pzs0VarD = new q4m0(pzs0Var3.b());
                        } else if (hzs0Var != null && c(hzs0Var.t(), t3u0VarA2) == 3) {
                            pzs0VarD = new q4m0(pzs0Var3.b());
                        }
                    }
                }
                t3u0 t3u0VarA3 = pzs0Var.a();
                if (pzs0VarD == null && (wsyVarB2.j0() instanceof kkq)) {
                    aty atyVarJ1 = wsyVarB2.j0();
                    fyf fyfVar2 = atyVarJ1 instanceof fyf ? (fyf) atyVarJ1 : null;
                    if (!(fyfVar2 != null ? fyfVar2.r() : false)) {
                        kkq kkqVar = (kkq) wsyVarB2.j0();
                        kzj0 kzj0Var2 = kkqVar.c;
                        kzj0 kzj0Var3 = kkqVar.b;
                        int i2 = i + 1;
                        pzs0 pzs0VarI3 = i(new q4m0(kzj0Var3, t3u0VarA3), hzs0Var, i2);
                        pzs0 pzs0VarI4 = i(new q4m0(kzj0Var2, t3u0VarA3), hzs0Var, i2);
                        t3u0 t3u0VarA4 = pzs0VarI3.a();
                        if (pzs0VarI3.b() != kzj0Var3 || pzs0VarI4.b() != kzj0Var2) {
                            return new q4m0(ucx.W(qsm0.s(pzs0VarI3.b()), qsm0.s(pzs0VarI4.b())), t3u0VarA4);
                        }
                    } else if (!ary.F(wsyVarB2)) {
                        if (pzs0VarD != null) {
                            iC = c(t3u0VarA3, pzs0VarD.a());
                            if (!(wsyVarB2.S() instanceof baa)) {
                                iE2 = hne.E(iC);
                                if (iE2 != 1) {
                                    return new q4m0(wsyVarB2.S().c().p(), t3u0.e);
                                }
                                if (iE2 == 2) {
                                    throw new wzs0("Out-projection in in-position");
                                }
                            }
                            atyVarJ0 = wsyVarB2.j0();
                            if (atyVarJ0 instanceof fyf) {
                                fyfVar = (fyf) atyVarJ0;
                            } else {
                                fyfVar = null;
                            }
                            if (fyfVar != null) {
                                fyfVar = null;
                            } else {
                                fyfVar = null;
                            }
                            if (pzs0VarD.c()) {
                                return pzs0VarD;
                            }
                            if (fyfVar != null) {
                                wsyVarI = fyfVar.g(pzs0VarD.b());
                            } else {
                                wsyVarI = e0t0.i(pzs0VarD.b(), wsyVarB2.U());
                            }
                            if (!wsyVarB2.getAnnotations().isEmpty()) {
                                g93VarC = vzs0Var.c(wsyVarB2.getAnnotations());
                                if (g93VarC != null) {
                                    a(33);
                                    throw null;
                                }
                                if (g93VarC.z0(i4m0.y)) {
                                    g93VarC = new a5q(g93VarC, new pnk0((byte) 23));
                                }
                                wsyVarI = vsm0.y(wsyVarI, new i93(tx3.g0(new g93[]{wsyVarI.getAnnotations(), g93VarC}), (byte) 1));
                            }
                            if (iC == 1) {
                                t3u0VarA3 = b(t3u0VarA3, pzs0VarD.a());
                            }
                            return new q4m0(wsyVarI, t3u0VarA3);
                        }
                        wsyVarB = pzs0Var.b();
                        t3u0VarA = pzs0Var.a();
                        if (!(wsyVarB.S().n() instanceof hzs0)) {
                            tft0VarJ0 = wsyVarB.j0();
                            if (tft0VarJ0 instanceof p) {
                                pVar = (p) tft0VarJ0;
                            } else {
                                pVar = null;
                            }
                            if (pVar != null) {
                                kzj0Var = pVar.c;
                            } else {
                                kzj0Var = null;
                            }
                            if (kzj0Var != null) {
                                if (vzs0Var instanceof g5x) {
                                    g5xVar = (g5x) vzs0Var;
                                    if (g5xVar.d) {
                                        xzs0Var = new xzs0(new g5x(g5xVar.b, g5xVar.c, false));
                                    } else {
                                        xzs0Var = this;
                                    }
                                } else {
                                    xzs0Var = this;
                                }
                                wsyVarH = xzs0Var.h(kzj0Var, t3u0.c);
                            }
                            parameters = wsyVarB.S().getParameters();
                            listJ = wsyVarB.J();
                            arrayList = new ArrayList(parameters.size());
                            z = false;
                            for (int i3 = 0; i3 < parameters.size(); i3++) {
                                hzs0Var2 = (hzs0) parameters.get(i3);
                                pzs0Var2 = (pzs0) listJ.get(i3);
                                pzs0VarI = i(pzs0Var2, hzs0Var2, i + 1);
                                iE = hne.E(c(hzs0Var2.t(), pzs0VarI.a()));
                                if (iE != 0) {
                                    if (iE != 1) {
                                        c = 2;
                                        if (iE == 2) {
                                        }
                                    } else {
                                        c = 2;
                                    }
                                    pzs0VarI = e0t0.k(hzs0Var2);
                                } else {
                                    c = 2;
                                    t3u0VarT = hzs0Var2.t();
                                    t3u0Var = t3u0.c;
                                    if (t3u0VarT != t3u0Var) {
                                        pzs0VarI = new q4m0(pzs0VarI.b(), t3u0Var);
                                    }
                                }
                                if (pzs0VarI != pzs0Var2) {
                                    z = true;
                                }
                                arrayList.add(pzs0VarI);
                            }
                            if (z) {
                                listJ = arrayList;
                            }
                            g93 g93VarC2 = vzs0Var.c(wsyVarB.getAnnotations());
                            listJ.getClass();
                            g93VarC2.getClass();
                            wsyVarY = qsm0.y(wsyVarB, listJ, g93VarC2, 4);
                            if (wsyVarY instanceof kzj0) {
                                wsyVarY = q7x.L((kzj0) wsyVarY, (kzj0) wsyVarH);
                            }
                            return new q4m0(wsyVarY, t3u0VarA);
                        }
                    }
                } else if (!ary.F(wsyVarB2) && !bdx.k0(wsyVarB2)) {
                    if (pzs0VarD != null) {
                        iC = c(t3u0VarA3, pzs0VarD.a());
                        if (!(wsyVarB2.S() instanceof baa)) {
                            iE2 = hne.E(iC);
                            if (iE2 != 1) {
                                return new q4m0(wsyVarB2.S().c().p(), t3u0.e);
                            }
                            if (iE2 == 2) {
                                throw new wzs0("Out-projection in in-position");
                            }
                        }
                        atyVarJ0 = wsyVarB2.j0();
                        if (atyVarJ0 instanceof fyf) {
                            fyfVar = (fyf) atyVarJ0;
                        } else {
                            fyfVar = null;
                        }
                        if (fyfVar != null || !fyfVar.r()) {
                            fyfVar = null;
                        }
                        if (pzs0VarD.c()) {
                            return pzs0VarD;
                        }
                        if (fyfVar != null) {
                            wsyVarI = fyfVar.g(pzs0VarD.b());
                        } else {
                            wsyVarI = e0t0.i(pzs0VarD.b(), wsyVarB2.U());
                        }
                        if (!wsyVarB2.getAnnotations().isEmpty()) {
                            g93VarC = vzs0Var.c(wsyVarB2.getAnnotations());
                            if (g93VarC != null) {
                                a(33);
                                throw null;
                            }
                            if (g93VarC.z0(i4m0.y)) {
                                g93VarC = new a5q(g93VarC, new pnk0((byte) 23));
                            }
                            wsyVarI = vsm0.y(wsyVarI, new i93(tx3.g0(new g93[]{wsyVarI.getAnnotations(), g93VarC}), (byte) 1));
                        }
                        if (iC == 1) {
                            t3u0VarA3 = b(t3u0VarA3, pzs0VarD.a());
                        }
                        return new q4m0(wsyVarI, t3u0VarA3);
                    }
                    wsyVarB = pzs0Var.b();
                    t3u0VarA = pzs0Var.a();
                    if (!(wsyVarB.S().n() instanceof hzs0)) {
                        tft0VarJ0 = wsyVarB.j0();
                        if (tft0VarJ0 instanceof p) {
                            pVar = (p) tft0VarJ0;
                        } else {
                            pVar = null;
                        }
                        if (pVar != null) {
                            kzj0Var = pVar.c;
                        } else {
                            kzj0Var = null;
                        }
                        if (kzj0Var != null) {
                            if (vzs0Var instanceof g5x) {
                                g5xVar = (g5x) vzs0Var;
                                if (g5xVar.d) {
                                    xzs0Var = this;
                                } else {
                                    xzs0Var = new xzs0(new g5x(g5xVar.b, g5xVar.c, false));
                                }
                            } else {
                                xzs0Var = this;
                            }
                            wsyVarH = xzs0Var.h(kzj0Var, t3u0.c);
                        }
                        parameters = wsyVarB.S().getParameters();
                        listJ = wsyVarB.J();
                        arrayList = new ArrayList(parameters.size());
                        z = false;
                        while (i3 < parameters.size()) {
                            hzs0Var2 = (hzs0) parameters.get(i3);
                            pzs0Var2 = (pzs0) listJ.get(i3);
                            pzs0VarI = i(pzs0Var2, hzs0Var2, i + 1);
                            iE = hne.E(c(hzs0Var2.t(), pzs0VarI.a()));
                            if (iE != 0) {
                                if (iE != 1) {
                                    c = 2;
                                    if (iE == 2) {
                                    }
                                } else {
                                    c = 2;
                                }
                                pzs0VarI = e0t0.k(hzs0Var2);
                            } else {
                                c = 2;
                                t3u0VarT = hzs0Var2.t();
                                t3u0Var = t3u0.c;
                                if (t3u0VarT != t3u0Var && !pzs0VarI.c()) {
                                    pzs0VarI = new q4m0(pzs0VarI.b(), t3u0Var);
                                }
                            }
                            if (pzs0VarI != pzs0Var2) {
                                z = true;
                            }
                            arrayList.add(pzs0VarI);
                        }
                        if (z) {
                            listJ = arrayList;
                        }
                        g93 g93VarC3 = vzs0Var.c(wsyVarB.getAnnotations());
                        listJ.getClass();
                        g93VarC3.getClass();
                        wsyVarY = qsm0.y(wsyVarB, listJ, g93VarC3, 4);
                        if ((wsyVarY instanceof kzj0) && (wsyVarH instanceof kzj0)) {
                            wsyVarY = q7x.L((kzj0) wsyVarY, (kzj0) wsyVarH);
                        }
                        return new q4m0(wsyVarY, t3u0VarA);
                    }
                }
            }
        }
        return pzs0Var;
    }
}
