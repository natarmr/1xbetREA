package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xlw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41097a = new ArrayList();
    public final /* synthetic */ byte b;

    public xlw0(byte b) {
        this.b = b;
    }

    public static xkw0 c(h0q0 h0q0Var, ArrayList arrayList) {
        smw0 smw0Var = smw0.ADD;
        pvm0.E("FN", arrayList, 2);
        jlw0 jlw0VarS = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
        jlw0 jlw0VarS2 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1));
        if (!(jlw0VarS2 instanceof rew0)) {
            jf4.o(kng0.k("FN requires an ArrayValue of parameter names found ", jlw0VarS2.getClass().getCanonicalName()));
            return null;
        }
        List listI = ((rew0) jlw0VarS2).i();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new xkw0(jlw0VarS.zzc(), (ArrayList) listI, arrayList2, h0q0Var);
    }

    public static boolean d(jlw0 jlw0Var, jlw0 jlw0Var2) {
        if (jlw0Var instanceof qjw0) {
            jlw0Var = new slw0(jlw0Var.zzc());
        }
        if (jlw0Var2 instanceof qjw0) {
            jlw0Var2 = new slw0(jlw0Var2.zzc());
        }
        if ((jlw0Var instanceof slw0) && (jlw0Var2 instanceof slw0)) {
            return ((slw0) jlw0Var).f32420a.compareTo(((slw0) jlw0Var2).f32420a) < 0;
        }
        double dDoubleValue = jlw0Var.zzd().doubleValue();
        double dDoubleValue2 = jlw0Var2.zzd().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static jlw0 e(nmw0 nmw0Var, jlw0 jlw0Var, jlw0 jlw0Var2) {
        if (jlw0Var instanceof Iterable) {
            return g(nmw0Var, ((Iterable) jlw0Var).iterator(), jlw0Var2);
        }
        jf4.o("Non-iterable type in for...of loop.");
        return null;
    }

    public static boolean f(jlw0 jlw0Var, jlw0 jlw0Var2) {
        if (jlw0Var.getClass().equals(jlw0Var2.getClass())) {
            if ((jlw0Var instanceof wlw0) || (jlw0Var instanceof okw0)) {
                return true;
            }
            if (jlw0Var instanceof ihw0) {
                return (Double.isNaN(jlw0Var.zzd().doubleValue()) || Double.isNaN(jlw0Var2.zzd().doubleValue()) || jlw0Var.zzd().doubleValue() != jlw0Var2.zzd().doubleValue()) ? false : true;
            }
            if (jlw0Var instanceof slw0) {
                return jlw0Var.zzc().equals(jlw0Var2.zzc());
            }
            if (jlw0Var instanceof pfw0) {
                return jlw0Var.zze().equals(jlw0Var2.zze());
            }
            return jlw0Var == jlw0Var2;
        }
        if (((jlw0Var instanceof wlw0) || (jlw0Var instanceof okw0)) && ((jlw0Var2 instanceof wlw0) || (jlw0Var2 instanceof okw0))) {
            return true;
        }
        boolean z = jlw0Var instanceof ihw0;
        if (z && (jlw0Var2 instanceof slw0)) {
            return f(jlw0Var, new ihw0(jlw0Var2.zzd()));
        }
        boolean z2 = jlw0Var instanceof slw0;
        if (z2 && (jlw0Var2 instanceof ihw0)) {
            return f(new ihw0(jlw0Var.zzd()), jlw0Var2);
        }
        if (jlw0Var instanceof pfw0) {
            return f(new ihw0(jlw0Var.zzd()), jlw0Var2);
        }
        if (jlw0Var2 instanceof pfw0) {
            return f(jlw0Var, new ihw0(jlw0Var2.zzd()));
        }
        if ((z2 || z) && (jlw0Var2 instanceof qjw0)) {
            return f(jlw0Var, new slw0(jlw0Var2.zzc()));
        }
        if ((jlw0Var instanceof qjw0) && ((jlw0Var2 instanceof slw0) || (jlw0Var2 instanceof ihw0))) {
            return f(new slw0(jlw0Var.zzc()), jlw0Var2);
        }
        return false;
    }

    public static jlw0 g(nmw0 nmw0Var, Iterator it, jlw0 jlw0Var) {
        if (it != null) {
            while (it.hasNext()) {
                jlw0 jlw0VarH = nmw0Var.g((jlw0) it.next()).H((rew0) jlw0Var);
                if (jlw0VarH instanceof kgw0) {
                    kgw0 kgw0Var = (kgw0) jlw0VarH;
                    String str = kgw0Var.b;
                    if ("break".equals(str)) {
                        return jlw0.V0;
                    }
                    if ("return".equals(str)) {
                        return kgw0Var;
                    }
                }
            }
        }
        return jlw0.V0;
    }

    public static boolean h(jlw0 jlw0Var, jlw0 jlw0Var2) {
        if (jlw0Var instanceof qjw0) {
            jlw0Var = new slw0(jlw0Var.zzc());
        }
        if (jlw0Var2 instanceof qjw0) {
            jlw0Var2 = new slw0(jlw0Var2.zzc());
        }
        return (((jlw0Var instanceof slw0) && (jlw0Var2 instanceof slw0)) || !(Double.isNaN(jlw0Var.zzd().doubleValue()) || Double.isNaN(jlw0Var2.zzd().doubleValue()))) && !d(jlw0Var2, jlw0Var);
    }

    /* JADX WARN: Code duplicated, block: B:398:0x0bb6  */
    /* JADX WARN: Code duplicated, block: B:562:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v315 */
    /* JADX WARN: Type inference failed for: r12v320 */
    /* JADX WARN: Type inference failed for: r12v340, types: [a.rew0] */
    /* JADX WARN: Type inference failed for: r12v347, types: [a.akw0] */
    /* JADX WARN: Type inference failed for: r12v382 */
    /* JADX WARN: Type inference failed for: r12v383 */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.h0q0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v47, types: [a.jlw0] */
    public final jlw0 a(String str, h0q0 h0q0Var, ArrayList arrayList) {
        boolean zF;
        boolean zF2;
        jlw0 jlw0Var;
        jlw0 jlw0VarH;
        wlw0 wlw0Var;
        kgw0 kgw0Var;
        jlw0 slw0Var;
        ?? rew0Var;
        String str2;
        byte b = 20;
        byte b2 = 18;
        int i = 0;
        switch (this.b) {
            case 0:
                smw0 smw0Var = smw0.ADD;
                switch (pvm0.H(str).ordinal()) {
                    case 4:
                        pvm0.D("BITWISE_AND", arrayList, 2);
                        return new ihw0(Double.valueOf(pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue()) & pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue())));
                    case 5:
                        pvm0.D("BITWISE_LEFT_SHIFT", arrayList, 2);
                        return new ihw0(Double.valueOf(pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue()) << ((int) (((long) pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue())) & 31))));
                    case 6:
                        pvm0.D("BITWISE_NOT", arrayList, 1);
                        return new ihw0(Double.valueOf(~pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue())));
                    case 7:
                        pvm0.D("BITWISE_OR", arrayList, 2);
                        return new ihw0(Double.valueOf(pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue()) | pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue())));
                    case 8:
                        pvm0.D("BITWISE_RIGHT_SHIFT", arrayList, 2);
                        return new ihw0(Double.valueOf(pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue()) >> ((int) (((long) pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue())) & 31))));
                    case 9:
                        pvm0.D("BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList, 2);
                        return new ihw0(Double.valueOf((((long) pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue())) & 4294967295L) >>> ((int) (((long) pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue())) & 31))));
                    case 10:
                        pvm0.D("BITWISE_XOR", arrayList, 2);
                        return new ihw0(Double.valueOf(pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue()) ^ pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
            case 1:
                pvm0.D(pvm0.H(str).name(), arrayList, 2);
                jlw0 jlw0VarS = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
                jlw0 jlw0VarS2 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1));
                int iOrdinal = pvm0.H(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zF2 = f(jlw0VarS, jlw0VarS2);
                    } else if (iOrdinal == 42) {
                        zF = d(jlw0VarS, jlw0VarS2);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zF = d(jlw0VarS2, jlw0VarS);
                                break;
                            case 38:
                                zF = h(jlw0VarS2, jlw0VarS);
                                break;
                            case 39:
                                zF = pvm0.I(jlw0VarS, jlw0VarS2);
                                break;
                            case 40:
                                zF2 = pvm0.I(jlw0VarS, jlw0VarS2);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        zF = h(jlw0VarS, jlw0VarS2);
                    }
                    zF = !zF2;
                } else {
                    zF = f(jlw0VarS, jlw0VarS2);
                }
                return zF ? jlw0.a1 : jlw0.b1;
            case 2:
                smw0 smw0Var2 = smw0.ADD;
                int iOrdinal2 = pvm0.H(str).ordinal();
                if (iOrdinal2 == 2) {
                    pvm0.D("APPLY", arrayList, 3);
                    jlw0 jlw0Var2 = (jlw0) arrayList.get(0);
                    okt0 okt0Var = (okt0) h0q0Var.b;
                    okt0 okt0Var2 = (okt0) h0q0Var.b;
                    jlw0 jlw0VarS3 = okt0Var.s(h0q0Var, jlw0Var2);
                    String strZzc = okt0Var2.s(h0q0Var, (jlw0) arrayList.get(1)).zzc();
                    jlw0 jlw0VarS4 = okt0Var2.s(h0q0Var, (jlw0) arrayList.get(2));
                    if (!(jlw0VarS4 instanceof rew0)) {
                        jf4.o(kng0.k("Function arguments for Apply are not a list found ", jlw0VarS4.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!strZzc.isEmpty()) {
                        return jlw0VarS3.c(strZzc, h0q0Var, (ArrayList) ((rew0) jlw0VarS4).i());
                    }
                    jf4.o("Function name for apply is undefined");
                    return null;
                }
                if (iOrdinal2 == 15) {
                    pvm0.D("BREAK", arrayList, 0);
                    return jlw0.X0;
                }
                if (iOrdinal2 == 25) {
                    return c(h0q0Var, arrayList);
                }
                if (iOrdinal2 == 41) {
                    pvm0.E("IF", arrayList, 2);
                    jlw0 jlw0Var3 = (jlw0) arrayList.get(0);
                    okt0 okt0Var3 = (okt0) h0q0Var.b;
                    okt0 okt0Var4 = (okt0) h0q0Var.b;
                    jlw0 jlw0VarS5 = okt0Var3.s(h0q0Var, jlw0Var3);
                    jlw0 jlw0VarS6 = okt0Var4.s(h0q0Var, (jlw0) arrayList.get(1));
                    jlw0 jlw0VarS7 = arrayList.size() > 2 ? okt0Var4.s(h0q0Var, (jlw0) arrayList.get(2)) : null;
                    wlw0 wlw0Var2 = jlw0.V0;
                    if (!jlw0VarS5.zze().booleanValue()) {
                        if (jlw0VarS7 != null) {
                            jlw0VarH = h0q0Var.H((rew0) jlw0VarS7);
                        } else {
                            jlw0Var = wlw0Var2;
                        }
                        if (true != (jlw0Var instanceof kgw0)) {
                            return wlw0Var2;
                        }
                        return jlw0Var;
                    }
                    jlw0VarH = h0q0Var.H((rew0) jlw0VarS6);
                    jlw0Var = jlw0VarH;
                    if (true != (jlw0Var instanceof kgw0)) {
                        return wlw0Var2;
                    }
                    return jlw0Var;
                }
                if (iOrdinal2 == 54) {
                    return new rew0(arrayList);
                }
                if (iOrdinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return jlw0.Z0;
                    }
                    pvm0.D("RETURN", arrayList, 1);
                    return new kgw0("return", ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)));
                }
                if (iOrdinal2 != 19) {
                    if (iOrdinal2 == 20) {
                        pvm0.E("DEFINE_FUNCTION", arrayList, 2);
                        xkw0 xkw0VarC = c(h0q0Var, arrayList);
                        String str3 = xkw0VarC.f11369a;
                        if (str3 == null) {
                            h0q0Var.M("", xkw0VarC);
                            return xkw0VarC;
                        }
                        h0q0Var.M(str3, xkw0VarC);
                        return xkw0VarC;
                    }
                    if (iOrdinal2 == 60) {
                        pvm0.D("SWITCH", arrayList, 3);
                        jlw0 jlw0Var4 = (jlw0) arrayList.get(0);
                        okt0 okt0Var5 = (okt0) h0q0Var.b;
                        okt0 okt0Var6 = (okt0) h0q0Var.b;
                        jlw0 jlw0VarS8 = okt0Var5.s(h0q0Var, jlw0Var4);
                        jlw0 jlw0VarS9 = okt0Var6.s(h0q0Var, (jlw0) arrayList.get(1));
                        jlw0 jlw0VarS10 = okt0Var6.s(h0q0Var, (jlw0) arrayList.get(2));
                        if (!(jlw0VarS9 instanceof rew0)) {
                            jf4.o("Malformed SWITCH statement, cases are not a list");
                            return null;
                        }
                        if (!(jlw0VarS10 instanceof rew0)) {
                            jf4.o("Malformed SWITCH statement, case statements are not a list");
                            return null;
                        }
                        rew0 rew0Var2 = (rew0) jlw0VarS9;
                        rew0 rew0Var3 = (rew0) jlw0VarS10;
                        boolean z = false;
                        for (int i2 = 0; i2 < rew0Var2.k(); i2++) {
                            if (z || jlw0VarS8.equals(okt0Var6.s(h0q0Var, rew0Var2.l(i2)))) {
                                jlw0 jlw0VarS11 = okt0Var6.s(h0q0Var, rew0Var3.l(i2));
                                if (jlw0VarS11 instanceof kgw0) {
                                    return ((kgw0) jlw0VarS11).b.equals("break") ? jlw0.V0 : jlw0VarS11;
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (rew0Var2.k() + 1 == rew0Var3.k()) {
                            jlw0 jlw0VarS12 = okt0Var6.s(h0q0Var, rew0Var3.l(rew0Var2.k()));
                            if (jlw0VarS12 instanceof kgw0) {
                                String str4 = ((kgw0) jlw0VarS12).b;
                                if (str4.equals("return") || str4.equals("continue")) {
                                    return jlw0VarS12;
                                }
                            }
                        }
                        return jlw0.V0;
                    }
                    if (iOrdinal2 == 61) {
                        pvm0.D("TERNARY", arrayList, 3);
                        jlw0 jlw0Var5 = (jlw0) arrayList.get(0);
                        okt0 okt0Var7 = (okt0) h0q0Var.b;
                        okt0 okt0Var8 = (okt0) h0q0Var.b;
                        return okt0Var7.s(h0q0Var, jlw0Var5).zze().booleanValue() ? okt0Var8.s(h0q0Var, (jlw0) arrayList.get(1)) : okt0Var8.s(h0q0Var, (jlw0) arrayList.get(2));
                    }
                    switch (iOrdinal2) {
                        case 11:
                            return h0q0Var.J().H(new rew0(arrayList));
                        case 12:
                            pvm0.D("BREAK", arrayList, 0);
                            return jlw0.Y0;
                        case 13:
                            break;
                        default:
                            b(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return jlw0.V0;
                }
                jlw0 jlw0VarS13 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
                return jlw0VarS13 instanceof rew0 ? h0q0Var.H((rew0) jlw0VarS13) : jlw0.V0;
            case 3:
                smw0 smw0Var3 = smw0.ADD;
                int iOrdinal3 = pvm0.H(str).ordinal();
                if (iOrdinal3 == 1) {
                    pvm0.D("AND", arrayList, 2);
                    jlw0 jlw0VarS14 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
                    if (jlw0VarS14.zze().booleanValue()) {
                        return ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1));
                    }
                    return jlw0VarS14;
                }
                if (iOrdinal3 == 47) {
                    pvm0.D("NOT", arrayList, 1);
                    return new pfw0(Boolean.valueOf(!((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zze().booleanValue()));
                }
                if (iOrdinal3 != 50) {
                    b(str);
                    throw null;
                }
                pvm0.D("OR", arrayList, 2);
                jlw0 jlw0VarS15 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
                if (jlw0VarS15.zze().booleanValue()) {
                    return jlw0VarS15;
                }
                return ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1));
            case 4:
                smw0 smw0Var4 = smw0.ADD;
                int iOrdinal4 = pvm0.H(str).ordinal();
                if (iOrdinal4 == 65) {
                    pvm0.D("WHILE", arrayList, 4);
                    jlw0 jlw0Var6 = (jlw0) arrayList.get(0);
                    jlw0 jlw0Var7 = (jlw0) arrayList.get(1);
                    jlw0 jlw0Var8 = (jlw0) arrayList.get(2);
                    jlw0 jlw0Var9 = (jlw0) arrayList.get(3);
                    okt0 okt0Var9 = (okt0) h0q0Var.b;
                    okt0 okt0Var10 = (okt0) h0q0Var.b;
                    jlw0 jlw0VarS16 = okt0Var9.s(h0q0Var, jlw0Var9);
                    if (okt0Var10.s(h0q0Var, jlw0Var8).zze().booleanValue()) {
                        jlw0 jlw0VarH2 = h0q0Var.H((rew0) jlw0VarS16);
                        if (jlw0VarH2 instanceof kgw0) {
                            kgw0 kgw0Var2 = (kgw0) jlw0VarH2;
                            String str5 = kgw0Var2.b;
                            if ("break".equals(str5)) {
                                return jlw0.V0;
                            }
                            if ("return".equals(str5)) {
                                return kgw0Var2;
                            }
                        }
                    }
                    while (okt0Var10.s(h0q0Var, jlw0Var6).zze().booleanValue()) {
                        jlw0 jlw0VarH3 = h0q0Var.H((rew0) jlw0VarS16);
                        if (jlw0VarH3 instanceof kgw0) {
                            kgw0 kgw0Var3 = (kgw0) jlw0VarH3;
                            String str6 = kgw0Var3.b;
                            if ("break".equals(str6)) {
                                return jlw0.V0;
                            }
                            if ("return".equals(str6)) {
                                return kgw0Var3;
                            }
                        }
                        h0q0Var.B(jlw0Var7);
                    }
                    return jlw0.V0;
                }
                switch (iOrdinal4) {
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        pvm0.D("FOR_IN", arrayList, 3);
                        if (!(arrayList.get(0) instanceof slw0)) {
                            jf4.o("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String strZzc2 = ((jlw0) arrayList.get(0)).zzc();
                        jlw0 jlw0VarS17 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1));
                        jlw0 jlw0VarS18 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(2));
                        Iterator itZzf = jlw0VarS17.zzf();
                        if (itZzf != null) {
                            while (itZzf.hasNext()) {
                                h0q0Var.N(strZzc2, (jlw0) itZzf.next());
                                jlw0 jlw0VarH4 = h0q0Var.H((rew0) jlw0VarS18);
                                if (jlw0VarH4 instanceof kgw0) {
                                    kgw0Var = (kgw0) jlw0VarH4;
                                    String str7 = kgw0Var.b;
                                    if ("break".equals(str7)) {
                                        wlw0Var = jlw0.V0;
                                    } else if ("return".equals(str7)) {
                                        return kgw0Var;
                                    }
                                }
                            }
                            wlw0Var = jlw0.V0;
                        } else {
                            wlw0Var = jlw0.V0;
                        }
                        return wlw0Var;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        pvm0.D("FOR_IN_CONST", arrayList, 3);
                        if (arrayList.get(0) instanceof slw0) {
                            return g(new hcp0((Object) h0q0Var, ((jlw0) arrayList.get(0)).zzc(), b2), ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzf(), ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(2)));
                        }
                        jf4.o("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        pvm0.D("FOR_IN_LET", arrayList, 3);
                        if (!(arrayList.get(0) instanceof slw0)) {
                            jf4.o("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String strZzc3 = ((jlw0) arrayList.get(0)).zzc();
                        jlw0 jlw0VarS19 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1));
                        jlw0 jlw0VarS20 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(2));
                        Iterator itZzf2 = jlw0VarS19.zzf();
                        if (itZzf2 != null) {
                            while (itZzf2.hasNext()) {
                                jlw0 jlw0Var10 = (jlw0) itZzf2.next();
                                h0q0 h0q0VarJ = h0q0Var.J();
                                h0q0VarJ.N(strZzc3, jlw0Var10);
                                jlw0 jlw0VarH5 = h0q0VarJ.H((rew0) jlw0VarS20);
                                if (jlw0VarH5 instanceof kgw0) {
                                    kgw0Var = (kgw0) jlw0VarH5;
                                    String str8 = kgw0Var.b;
                                    if ("break".equals(str8)) {
                                        wlw0Var = jlw0.V0;
                                    } else if ("return".equals(str8)) {
                                        return kgw0Var;
                                    }
                                }
                            }
                            wlw0Var = jlw0.V0;
                        } else {
                            wlw0Var = jlw0.V0;
                        }
                        return wlw0Var;
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        pvm0.D("FOR_LET", arrayList, 4);
                        jlw0 jlw0Var11 = (jlw0) arrayList.get(0);
                        okt0 okt0Var11 = (okt0) h0q0Var.b;
                        okt0 okt0Var12 = (okt0) h0q0Var.b;
                        jlw0 jlw0VarS21 = okt0Var11.s(h0q0Var, jlw0Var11);
                        if (!(jlw0VarS21 instanceof rew0)) {
                            jf4.o("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        rew0 rew0Var4 = (rew0) jlw0VarS21;
                        jlw0 jlw0Var12 = (jlw0) arrayList.get(1);
                        jlw0 jlw0Var13 = (jlw0) arrayList.get(2);
                        jlw0 jlw0VarS22 = okt0Var12.s(h0q0Var, (jlw0) arrayList.get(3));
                        h0q0 h0q0VarJ2 = h0q0Var.J();
                        for (int i3 = 0; i3 < rew0Var4.k(); i3++) {
                            String strZzc4 = rew0Var4.l(i3).zzc();
                            h0q0VarJ2.M(strZzc4, h0q0Var.O(strZzc4));
                        }
                        while (okt0Var12.s(h0q0Var, jlw0Var12).zze().booleanValue()) {
                            jlw0 jlw0VarH6 = h0q0Var.H((rew0) jlw0VarS22);
                            if (jlw0VarH6 instanceof kgw0) {
                                kgw0 kgw0Var4 = (kgw0) jlw0VarH6;
                                String str9 = kgw0Var4.b;
                                if ("break".equals(str9)) {
                                    return jlw0.V0;
                                }
                                if ("return".equals(str9)) {
                                    return kgw0Var4;
                                }
                            }
                            h0q0 h0q0VarJ3 = h0q0Var.J();
                            for (int i4 = 0; i4 < rew0Var4.k(); i4++) {
                                String strZzc5 = rew0Var4.l(i4).zzc();
                                h0q0VarJ3.M(strZzc5, h0q0VarJ2.O(strZzc5));
                            }
                            h0q0VarJ3.B(jlw0Var13);
                            h0q0VarJ2 = h0q0VarJ3;
                        }
                        return jlw0.V0;
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        pvm0.D("FOR_OF", arrayList, 3);
                        if (arrayList.get(0) instanceof slw0) {
                            return e(new fuj0((Object) h0q0Var, ((jlw0) arrayList.get(0)).zzc()), ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)), ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(2)));
                        }
                        jf4.o("Variable name in FOR_OF must be a string");
                        return null;
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        pvm0.D("FOR_OF_CONST", arrayList, 3);
                        if (arrayList.get(0) instanceof slw0) {
                            return e(new hcp0((Object) h0q0Var, ((jlw0) arrayList.get(0)).zzc(), b2), ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)), ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(2)));
                        }
                        jf4.o("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 32:
                        pvm0.D("FOR_OF_LET", arrayList, 3);
                        if (arrayList.get(0) instanceof slw0) {
                            return e(new trm0(h0q0Var, ((jlw0) arrayList.get(0)).zzc(), b), ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)), ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(2)));
                        }
                        jf4.o("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        b(str);
                        throw null;
                }
            case 5:
                smw0 smw0Var5 = smw0.ADD;
                int iOrdinal5 = pvm0.H(str).ordinal();
                if (iOrdinal5 == 0) {
                    pvm0.D("ADD", arrayList, 2);
                    jlw0 jlw0VarS23 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
                    jlw0 jlw0VarS24 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1));
                    slw0Var = ((jlw0VarS23 instanceof qjw0) || (jlw0VarS23 instanceof slw0) || (jlw0VarS24 instanceof qjw0) || (jlw0VarS24 instanceof slw0)) ? new slw0(String.valueOf(jlw0VarS23.zzc()).concat(String.valueOf(jlw0VarS24.zzc()))) : new ihw0(Double.valueOf(jlw0VarS24.zzd().doubleValue() + jlw0VarS23.zzd().doubleValue()));
                } else if (iOrdinal5 == 21) {
                    pvm0.D("DIVIDE", arrayList, 2);
                    slw0Var = new ihw0(Double.valueOf(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue() / ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue()));
                } else {
                    if (iOrdinal5 == 59) {
                        pvm0.D("SUBTRACT", arrayList, 2);
                        return new ihw0(Double.valueOf(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue() + (-((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue())));
                    }
                    if (iOrdinal5 == 52 || iOrdinal5 == 53) {
                        pvm0.D(str, arrayList, 2);
                        jlw0 jlw0VarS25 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
                        h0q0Var.B((jlw0) arrayList.get(1));
                        return jlw0VarS25;
                    }
                    if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                        pvm0.D(str, arrayList, 1);
                        return ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
                    }
                    switch (iOrdinal5) {
                        case 44:
                            pvm0.D("MODULUS", arrayList, 2);
                            slw0Var = new ihw0(Double.valueOf(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue() % ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue()));
                            break;
                        case 45:
                            pvm0.D("MULTIPLY", arrayList, 2);
                            return new ihw0(Double.valueOf(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue() * ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue()));
                        case 46:
                            pvm0.D("NEGATE", arrayList, 1);
                            return new ihw0(Double.valueOf(-((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return slw0Var;
            case 6:
                if (str == null || str.isEmpty() || !h0q0Var.L(str)) {
                    jf4.o(kng0.k("Command not found: ", str));
                    return null;
                }
                jlw0 jlw0VarO = h0q0Var.O(str);
                if (jlw0VarO instanceof giw0) {
                    return ((giw0) jlw0VarO).a(h0q0Var, arrayList);
                }
                jf4.o(kng0.l("Function ", str, " is not defined"));
                return null;
            default:
                smw0 smw0Var6 = smw0.ADD;
                int iOrdinal6 = pvm0.H(str).ordinal();
                if (iOrdinal6 == 3) {
                    pvm0.D("ASSIGN", arrayList, 2);
                    jlw0 jlw0VarS26 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
                    if (!(jlw0VarS26 instanceof slw0)) {
                        jf4.o(kng0.k("Expected string for assign var. got ", jlw0VarS26.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((slw0) jlw0VarS26).f32420a;
                    if (!h0q0Var.L(str10)) {
                        jf4.o(kng0.k("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    jlw0 jlw0VarS27 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1));
                    h0q0Var.M(str10, jlw0VarS27);
                    return jlw0VarS27;
                }
                if (iOrdinal6 == 14) {
                    pvm0.E("CONST", arrayList, 2);
                    if (arrayList.size() % 2 != 0) {
                        jf4.o(twn.m(arrayList.size(), "CONST requires an even number of arguments, found "));
                        return null;
                    }
                    while (i < arrayList.size() - 1) {
                        jlw0 jlw0VarS28 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(i));
                        if (!(jlw0VarS28 instanceof slw0)) {
                            jf4.o(kng0.k("Expected string for const name. got ", jlw0VarS28.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((slw0) jlw0VarS28).f32420a;
                        h0q0Var.N(str11, ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(i + 1)));
                        ((HashMap) h0q0Var.d).put(str11, Boolean.TRUE);
                        i += 2;
                    }
                    return jlw0.V0;
                }
                if (iOrdinal6 == 24) {
                    pvm0.E("EXPRESSION_LIST", arrayList, 1);
                    rew0Var = jlw0.V0;
                    while (i < arrayList.size()) {
                        jlw0 jlw0VarS29 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(i));
                        if (jlw0VarS29 instanceof kgw0) {
                            jf4.n("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i++;
                        rew0Var = jlw0VarS29;
                    }
                } else {
                    if (iOrdinal6 == 33) {
                        pvm0.D("GET", arrayList, 1);
                        jlw0 jlw0VarS30 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
                        if (jlw0VarS30 instanceof slw0) {
                            return h0q0Var.O(((slw0) jlw0VarS30).f32420a);
                        }
                        jf4.o(kng0.k("Expected string for get var. got ", jlw0VarS30.getClass().getCanonicalName()));
                        return null;
                    }
                    if (iOrdinal6 == 49) {
                        pvm0.D("NULL", arrayList, 0);
                        return jlw0.W0;
                    }
                    if (iOrdinal6 == 58) {
                        pvm0.D("SET_PROPERTY", arrayList, 3);
                        jlw0 jlw0Var14 = (jlw0) arrayList.get(0);
                        okt0 okt0Var13 = (okt0) h0q0Var.b;
                        okt0 okt0Var14 = (okt0) h0q0Var.b;
                        jlw0 jlw0VarS31 = okt0Var13.s(h0q0Var, jlw0Var14);
                        jlw0 jlw0VarS32 = okt0Var14.s(h0q0Var, (jlw0) arrayList.get(1));
                        jlw0 jlw0VarS33 = okt0Var14.s(h0q0Var, (jlw0) arrayList.get(2));
                        if (jlw0VarS31 == jlw0.V0 || jlw0VarS31 == jlw0.W0) {
                            jf4.n(ua80.i("Can't set property ", jlw0VarS32.zzc(), " of ", jlw0VarS31.zzc()));
                            return null;
                        }
                        if ((jlw0VarS31 instanceof rew0) && (jlw0VarS32 instanceof ihw0)) {
                            ((rew0) jlw0VarS31).m(((ihw0) jlw0VarS32).f14801a.intValue(), jlw0VarS33);
                        } else if (jlw0VarS31 instanceof qjw0) {
                            ((qjw0) jlw0VarS31).f(jlw0VarS32.zzc(), jlw0VarS33);
                        }
                        return jlw0VarS33;
                    }
                    if (iOrdinal6 != 17) {
                        if (iOrdinal6 != 18) {
                            if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                                pvm0.D("GET_PROPERTY", arrayList, 2);
                                jlw0 jlw0VarS34 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
                                jlw0 jlw0VarS35 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1));
                                if ((jlw0VarS34 instanceof rew0) && pvm0.G(jlw0VarS35)) {
                                    return ((rew0) jlw0VarS34).l(jlw0VarS35.zzd().intValue());
                                }
                                if (jlw0VarS34 instanceof qjw0) {
                                    return ((qjw0) jlw0VarS34).b(jlw0VarS35.zzc());
                                }
                                if (jlw0VarS34 instanceof slw0) {
                                    if ("length".equals(jlw0VarS35.zzc())) {
                                        return new ihw0(Double.valueOf(((slw0) jlw0VarS34).f32420a.length()));
                                    }
                                    if (pvm0.G(jlw0VarS35)) {
                                        double dDoubleValue = jlw0VarS35.zzd().doubleValue();
                                        String str12 = ((slw0) jlw0VarS34).f32420a;
                                        if (dDoubleValue < str12.length()) {
                                            return new slw0(String.valueOf(str12.charAt(jlw0VarS35.zzd().intValue())));
                                        }
                                    }
                                }
                                return jlw0.V0;
                            }
                            switch (iOrdinal6) {
                                case 62:
                                    pvm0.D("TYPEOF", arrayList, 1);
                                    jlw0 jlw0VarS36 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
                                    if (jlw0VarS36 instanceof wlw0) {
                                        str2 = "undefined";
                                    } else if (jlw0VarS36 instanceof pfw0) {
                                        str2 = "boolean";
                                    } else if (jlw0VarS36 instanceof ihw0) {
                                        str2 = "number";
                                    } else if (jlw0VarS36 instanceof slw0) {
                                        str2 = "string";
                                    } else if (jlw0VarS36 instanceof xkw0) {
                                        str2 = "function";
                                    } else {
                                        if ((jlw0VarS36 instanceof plw0) || (jlw0VarS36 instanceof kgw0)) {
                                            jf4.l("Unsupported value type %s in typeof", new Object[]{jlw0VarS36});
                                            return null;
                                        }
                                        str2 = "object";
                                    }
                                    return new slw0(str2);
                                case 63:
                                    pvm0.D("UNDEFINED", arrayList, 0);
                                    return jlw0.V0;
                                case 64:
                                    pvm0.E("VAR", arrayList, 1);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        jlw0 jlw0VarS37 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) it.next());
                                        if (!(jlw0VarS37 instanceof slw0)) {
                                            jf4.o(kng0.k("Expected string for var name. got ", jlw0VarS37.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        h0q0Var.N(((slw0) jlw0VarS37).f32420a, jlw0.V0);
                                    }
                                    return jlw0.V0;
                                default:
                                    b(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new akw0();
                        }
                        if (arrayList.size() % 2 != 0) {
                            jf4.o(twn.m(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                        rew0Var = new akw0();
                        while (i < arrayList.size() - 1) {
                            jlw0 jlw0VarS38 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(i));
                            jlw0 jlw0VarS39 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(i + 1));
                            if ((jlw0VarS38 instanceof kgw0) || (jlw0VarS39 instanceof kgw0)) {
                                jf4.n("Failed to evaluate map entry");
                                return null;
                            }
                            rew0Var.f(jlw0VarS38.zzc(), jlw0VarS39);
                            i += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new rew0();
                        }
                        rew0Var = new rew0();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            jlw0 jlw0VarS40 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) it2.next());
                            if (jlw0VarS40 instanceof kgw0) {
                                jf4.n("Failed to evaluate array element");
                                return null;
                            }
                            rew0Var.m(i, jlw0VarS40);
                            i++;
                        }
                    }
                }
                return rew0Var;
        }
    }

    public final void b(String str) {
        if (!this.f41097a.contains(pvm0.H(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
