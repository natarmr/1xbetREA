package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xplatform.secret.impl.KeysImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ot10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pxs0 f25809a;
    public final azk b;
    public final drm0 c;
    public final z8w0 d;
    public final zjh0 e;
    public final wsb0 f;
    public final yyk g;
    public final nr00 h;
    public final mmy i;

    public ot10(pxs0 pxs0Var, azk azkVar, drm0 drm0Var, z8w0 z8w0Var, zjh0 zjh0Var, wsb0 wsb0Var, yyk yykVar, nr00 nr00Var, mmy mmyVar) {
        this.f25809a = pxs0Var;
        this.b = azkVar;
        this.c = drm0Var;
        this.d = z8w0Var;
        this.e = zjh0Var;
        this.f = wsb0Var;
        this.g = yykVar;
        this.h = nr00Var;
        this.i = mmyVar;
    }

    public static qyk a(double d, ylq0 ylq0Var, boolean z, boolean z2) {
        if (z2) {
            return qyk.VIP;
        }
        if (ylq0Var == ylq0.f42857a && !z) {
            return qyk.URAL_PLUS;
        }
        if (ylq0Var == ylq0.b && !z) {
            return qyk.URAL_MINUS;
        }
        ylq0 ylq0Var2 = ylq0.c;
        if (ylq0Var == ylq0Var2 && d > -10000.0d && z) {
            return qyk.PARTNER_LOW_THEN_10K;
        }
        if (ylq0Var == ylq0Var2 && d < -10000.0d && z) {
            return qyk.PARTNER_MORE_THEN_10K;
        }
        if (ylq0Var != ylq0Var2 || d <= -1000.0d || z) {
            return (ylq0Var != ylq0Var2 || d >= -1000.0d || z) ? qyk.DEFAULT : qyk.MORE_THEN_1K;
        }
        return qyk.LOW_THEN_1K;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum b(ylq0 ylq0Var, zje zjeVar) {
        dt10 dt10Var;
        Integer intOrNull;
        if (zjeVar instanceof dt10) {
            dt10Var = (dt10) zjeVar;
            int i = dt10Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                dt10Var.l = i - Integer.MIN_VALUE;
            } else {
                dt10Var = new dt10(this, zjeVar);
            }
        } else {
            dt10Var = new dt10(this, zjeVar);
        }
        Object objD = dt10Var.j;
        wne wneVar = wne.f39444a;
        int i2 = dt10Var.l;
        yyk yykVar = this.g;
        wsb0 wsb0Var = this.f;
        try {
            if (i2 == 0) {
                z1x.P(objD);
                String strC = ((twb0) wsb0Var).f34643a.c("NewSomeShitForUser2", "");
                z8w0 z8w0Var = this.d;
                dt10Var.i = ylq0Var;
                dt10Var.l = 1;
                objD = z8w0Var.d(dt10Var, strC, true);
                if (objD == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ylq0Var = dt10Var.i;
                z1x.P(objD);
            }
            List listSplit$default = StringsKt__StringsKt.split$default((String) objD, new String[]{Separators.STAR}, false, 0, 6, null);
            if (!Intrinsics.d(CollectionsKt.firstOrNull(listSplit$default), (String) ((zf3) this.e).e.getValue())) {
                return a(0.0d, ylq0Var, yykVar.isPartner(), false);
            }
            String str = (String) CollectionsKt.f0(listSplit$default);
            if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                return a(0.0d, ylq0Var, yykVar.isPartner(), false);
            }
            int iIntValue = intOrNull.intValue();
            if ((iIntValue & 16777216) != 0) {
                iIntValue = 16777216;
            }
            if (iIntValue == 1) {
                return qyk.URAL_PLUS;
            }
            if (iIntValue == 16) {
                return qyk.URAL_MINUS;
            }
            if (iIntValue == 256) {
                return qyk.PARTNER_LOW_THEN_10K;
            }
            if (iIntValue == 4096) {
                return qyk.LOW_THEN_1K;
            }
            if (iIntValue == 65536) {
                return qyk.PARTNER_MORE_THEN_10K;
            }
            if (iIntValue != 1048576) {
                return iIntValue != 16777216 ? qyk.DEFAULT : qyk.VIP;
            }
            return qyk.MORE_THEN_1K;
        } catch (Exception e) {
            e.printStackTrace();
            ((twb0) wsb0Var).f34643a.h("NewSomeShitForUser2", "");
            return a(0.0d, ylq0Var, yykVar.isPartner(), false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        if (r13 == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ot10.c(int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r6 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.gt10
            if (r0 == 0) goto L13
            r0 = r6
            a.gt10 r0 = (a.gt10) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.gt10 r0 = new a.gt10
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L5c
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r6)
            goto L4b
        L35:
            a.z1x.P(r6)
            java.lang.String r6 = r5.e()
            int r2 = r6.length()
            if (r2 != 0) goto L60
            r0.k = r4
            java.lang.Object r6 = r5.i(r0)
            if (r6 != r1) goto L4b
            goto L5b
        L4b:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r2 = r6.length()
            if (r2 != 0) goto L5e
            r0.k = r3
            java.lang.Object r6 = r5.j(r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            java.lang.String r6 = (java.lang.String) r6
        L5e:
            java.lang.String r6 = (java.lang.String) r6
        L60:
            r6.getClass()
            a.drm0 r5 = r5.c
            java.lang.Object r5 = r5.f6568a
            a.wsb0 r5 = (a.wsb0) r5
            a.twb0 r5 = (a.twb0) r5
            a.vwb0 r5 = r5.f34643a
            java.lang.String r0 = "SAFE_DOMAIN"
            r5.h(r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ot10.d(a.zje):java.lang.Object");
    }

    public final String e() {
        yyk yykVar = this.g;
        return (yykVar.getSinglUrl().length() == 0 && (yykVar.isTest() || yykVar.getDebug()) && !yykVar.getTestDomainEnabled() && yykVar.getManualTestDomain().length() == 0) ? "https://hfoweytnvkf.com" : yykVar.getSinglUrl();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Serializable f(qyk qykVar, zje zjeVar) {
        bt10 bt10Var;
        ?? r6;
        ?? r7;
        ?? r8;
        ?? r9;
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r5;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r20;
        ?? r21;
        ?? r22;
        if (zjeVar instanceof bt10) {
            bt10Var = (bt10) zjeVar;
            int i = bt10Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                bt10Var.m = i - Integer.MIN_VALUE;
            } else {
                bt10Var = new bt10(this, zjeVar);
            }
        } else {
            bt10Var = new bt10(this, zjeVar);
        }
        Object objL = bt10Var.k;
        wne wneVar = wne.f39444a;
        switch (bt10Var.m) {
            case 0:
                z1x.P(objL);
                int i2 = zs10.b[qykVar.ordinal()];
                mmy mmyVar = this.i;
                switch (i2) {
                    case 1:
                        String[] strArr = new String[1];
                        bt10Var.i = strArr;
                        bt10Var.j = strArr;
                        bt10Var.m = 1;
                        objL = ((KeysImpl) mmyVar).L(bt10Var);
                        if (objL != wneVar) {
                            r6 = strArr;
                            r5 = strArr;
                            r5[0] = objL;
                            return r6;
                        }
                        return wneVar;
                    case 2:
                        String[] strArr2 = new String[1];
                        bt10Var.i = strArr2;
                        bt10Var.j = strArr2;
                        bt10Var.m = 2;
                        objL = ((KeysImpl) mmyVar).M(bt10Var);
                        if (objL != wneVar) {
                            r7 = strArr2;
                            r15 = strArr2;
                            r15[0] = objL;
                            return r7;
                        }
                        return wneVar;
                    case 3:
                        String[] strArr3 = new String[1];
                        bt10Var.i = strArr3;
                        bt10Var.j = strArr3;
                        bt10Var.m = 3;
                        objL = ((KeysImpl) mmyVar).E(bt10Var);
                        if (objL != wneVar) {
                            r8 = strArr3;
                            r16 = strArr3;
                            r16[0] = objL;
                            return r8;
                        }
                        return wneVar;
                    case 4:
                        String[] strArr4 = new String[1];
                        bt10Var.i = strArr4;
                        bt10Var.j = strArr4;
                        bt10Var.m = 4;
                        objL = ((KeysImpl) mmyVar).H(bt10Var);
                        if (objL != wneVar) {
                            r9 = strArr4;
                            r17 = strArr4;
                            r17[0] = objL;
                            return r9;
                        }
                        return wneVar;
                    case 5:
                        String[] strArr5 = new String[1];
                        bt10Var.i = strArr5;
                        bt10Var.j = strArr5;
                        bt10Var.m = 5;
                        objL = ((KeysImpl) mmyVar).Y(bt10Var);
                        if (objL != wneVar) {
                            r10 = strArr5;
                            r18 = strArr5;
                            r18[0] = objL;
                            return r10;
                        }
                        return wneVar;
                    case 6:
                        String[] strArr6 = new String[1];
                        bt10Var.i = strArr6;
                        bt10Var.j = strArr6;
                        bt10Var.m = 6;
                        objL = ((KeysImpl) mmyVar).X(bt10Var);
                        if (objL != wneVar) {
                            r11 = strArr6;
                            r19 = strArr6;
                            r19[0] = objL;
                            return r11;
                        }
                        return wneVar;
                    case 7:
                        String[] strArr7 = new String[1];
                        bt10Var.i = strArr7;
                        bt10Var.j = strArr7;
                        bt10Var.m = 7;
                        objL = ((KeysImpl) mmyVar).a0(bt10Var);
                        if (objL != wneVar) {
                            r12 = strArr7;
                            r20 = strArr7;
                            r20[0] = objL;
                            return r12;
                        }
                        return wneVar;
                    case 8:
                        if (this.g.isPartner()) {
                            String[] strArr8 = new String[1];
                            bt10Var.i = strArr8;
                            bt10Var.j = strArr8;
                            bt10Var.m = 8;
                            objL = ((KeysImpl) mmyVar).L(bt10Var);
                            if (objL != wneVar) {
                                r14 = strArr8;
                                r21 = strArr8;
                                r21[0] = objL;
                                return r14;
                            }
                        } else {
                            String[] strArr9 = new String[1];
                            bt10Var.i = strArr9;
                            bt10Var.j = strArr9;
                            bt10Var.m = 9;
                            objL = ((KeysImpl) mmyVar).E(bt10Var);
                            if (objL != wneVar) {
                                r13 = strArr9;
                                r22 = strArr9;
                                r22[0] = objL;
                                return r13;
                            }
                        }
                        return wneVar;
                    default:
                        t9f.b();
                        return null;
                }
            case 1:
                String[] strArr10 = bt10Var.j;
                String[] strArr11 = bt10Var.i;
                z1x.P(objL);
                r5 = strArr10;
                r6 = strArr11;
                r5[0] = objL;
                return r6;
            case 2:
                String[] strArr12 = bt10Var.j;
                String[] strArr13 = bt10Var.i;
                z1x.P(objL);
                r15 = strArr12;
                r7 = strArr13;
                r15[0] = objL;
                return r7;
            case 3:
                String[] strArr14 = bt10Var.j;
                String[] strArr15 = bt10Var.i;
                z1x.P(objL);
                r16 = strArr14;
                r8 = strArr15;
                r16[0] = objL;
                return r8;
            case 4:
                String[] strArr16 = bt10Var.j;
                String[] strArr17 = bt10Var.i;
                z1x.P(objL);
                r17 = strArr16;
                r9 = strArr17;
                r17[0] = objL;
                return r9;
            case 5:
                String[] strArr18 = bt10Var.j;
                String[] strArr19 = bt10Var.i;
                z1x.P(objL);
                r18 = strArr18;
                r10 = strArr19;
                r18[0] = objL;
                return r10;
            case 6:
                String[] strArr20 = bt10Var.j;
                String[] strArr21 = bt10Var.i;
                z1x.P(objL);
                r19 = strArr20;
                r11 = strArr21;
                r19[0] = objL;
                return r11;
            case 7:
                String[] strArr22 = bt10Var.j;
                String[] strArr23 = bt10Var.i;
                z1x.P(objL);
                r20 = strArr22;
                r12 = strArr23;
                r20[0] = objL;
                return r12;
            case 8:
                String[] strArr24 = bt10Var.j;
                String[] strArr25 = bt10Var.i;
                z1x.P(objL);
                r21 = strArr24;
                r14 = strArr25;
                r21[0] = objL;
                return r14;
            case 9:
                String[] strArr26 = bt10Var.j;
                String[] strArr27 = bt10Var.i;
                z1x.P(objL);
                r22 = strArr26;
                r13 = strArr27;
                r22[0] = objL;
                return r13;
            default:
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(zje zjeVar) {
        at10 at10Var;
        String strE;
        wsb0 wsb0Var;
        if (zjeVar instanceof at10) {
            at10Var = (at10) zjeVar;
            int i = at10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                at10Var.k = i - Integer.MIN_VALUE;
            } else {
                at10Var = new at10(this, zjeVar);
            }
        } else {
            at10Var = new at10(this, zjeVar);
        }
        Object objJ = at10Var.i;
        Object obj = wne.f39444a;
        int i2 = at10Var.k;
        if (i2 == 0) {
            z1x.P(objJ);
            strE = e();
            if (strE.length() == 0) {
                at10Var.k = 1;
                objJ = j(at10Var);
                if (objJ == obj) {
                    return obj;
                }
            }
            wsb0Var = (wsb0) ((ilp0) this.h.f23980a).f14992a;
            if (((twb0) wsb0Var).f34643a.b().getInt("ATTEMPTS_VALUE", 0) != 0) {
                ((twb0) wsb0Var).f34643a.f(0, "ATTEMPTS_VALUE");
            }
            strE.getClass();
            ((twb0) ((wsb0) this.c.f6568a)).f34643a.h("SAFE_DOMAIN", strE);
            return strE;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objJ);
        strE = (String) objJ;
        wsb0Var = (wsb0) ((ilp0) this.h.f23980a).f14992a;
        if (((twb0) wsb0Var).f34643a.b().getInt("ATTEMPTS_VALUE", 0) != 0) {
            ((twb0) wsb0Var).f34643a.f(0, "ATTEMPTS_VALUE");
        }
        strE.getClass();
        ((twb0) ((wsb0) this.c.f6568a)).f34643a.h("SAFE_DOMAIN", strE);
        return strE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    public final Serializable h(qyk qykVar, zje zjeVar) {
        ct10 ct10Var;
        ?? r5;
        ?? r6;
        ?? r7;
        ?? r8;
        ?? r9;
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r20;
        if (zjeVar instanceof ct10) {
            ct10Var = (ct10) zjeVar;
            int i = ct10Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ct10Var.m = i - Integer.MIN_VALUE;
            } else {
                ct10Var = new ct10(this, zjeVar);
            }
        } else {
            ct10Var = new ct10(this, zjeVar);
        }
        Object objE = ct10Var.k;
        wne wneVar = wne.f39444a;
        switch (ct10Var.m) {
            case 0:
                z1x.P(objE);
                int i2 = zs10.b[qykVar.ordinal()];
                mmy mmyVar = this.i;
                switch (i2) {
                    case 1:
                        String[] strArr = new String[1];
                        ct10Var.i = strArr;
                        ct10Var.j = strArr;
                        ct10Var.m = 1;
                        objE = ((KeysImpl) mmyVar).E(ct10Var);
                        if (objE != wneVar) {
                            r5 = strArr;
                            r13 = strArr;
                            r5[0] = objE;
                            return r13;
                        }
                        return wneVar;
                    case 2:
                        String[] strArr2 = new String[1];
                        ct10Var.i = strArr2;
                        ct10Var.j = strArr2;
                        ct10Var.m = 2;
                        objE = ((KeysImpl) mmyVar).H(ct10Var);
                        if (objE != wneVar) {
                            r6 = strArr2;
                            r14 = strArr2;
                            r6[0] = objE;
                            return r14;
                        }
                        return wneVar;
                    case 3:
                        String[] strArr3 = new String[1];
                        ct10Var.i = strArr3;
                        ct10Var.j = strArr3;
                        ct10Var.m = 3;
                        objE = ((KeysImpl) mmyVar).E(ct10Var);
                        if (objE != wneVar) {
                            r7 = strArr3;
                            r15 = strArr3;
                            r7[0] = objE;
                            return r15;
                        }
                        return wneVar;
                    case 4:
                        String[] strArr4 = new String[1];
                        ct10Var.i = strArr4;
                        ct10Var.j = strArr4;
                        ct10Var.m = 4;
                        objE = ((KeysImpl) mmyVar).H(ct10Var);
                        if (objE != wneVar) {
                            r8 = strArr4;
                            r16 = strArr4;
                            r8[0] = objE;
                            return r16;
                        }
                        return wneVar;
                    case 5:
                        String[] strArr5 = new String[1];
                        ct10Var.i = strArr5;
                        ct10Var.j = strArr5;
                        ct10Var.m = 5;
                        objE = ((KeysImpl) mmyVar).Y(ct10Var);
                        if (objE != wneVar) {
                            r9 = strArr5;
                            r17 = strArr5;
                            r9[0] = objE;
                            return r17;
                        }
                        return wneVar;
                    case 6:
                        String[] strArr6 = new String[1];
                        ct10Var.i = strArr6;
                        ct10Var.j = strArr6;
                        ct10Var.m = 6;
                        objE = ((KeysImpl) mmyVar).X(ct10Var);
                        if (objE != wneVar) {
                            r10 = strArr6;
                            r18 = strArr6;
                            r10[0] = objE;
                            return r18;
                        }
                        return wneVar;
                    case 7:
                        String[] strArr7 = new String[1];
                        ct10Var.i = strArr7;
                        ct10Var.j = strArr7;
                        ct10Var.m = 7;
                        objE = ((KeysImpl) mmyVar).a0(ct10Var);
                        if (objE != wneVar) {
                            r11 = strArr7;
                            r19 = strArr7;
                            r11[0] = objE;
                            return r19;
                        }
                        return wneVar;
                    case 8:
                        String[] strArr8 = new String[1];
                        ct10Var.i = strArr8;
                        ct10Var.j = strArr8;
                        ct10Var.m = 8;
                        objE = ((KeysImpl) mmyVar).E(ct10Var);
                        if (objE != wneVar) {
                            r12 = strArr8;
                            r20 = strArr8;
                            r12[0] = objE;
                            return r20;
                        }
                        return wneVar;
                    default:
                        t9f.b();
                        return null;
                }
            case 1:
                String[] strArr9 = ct10Var.j;
                String[] strArr10 = ct10Var.i;
                z1x.P(objE);
                r5 = strArr9;
                r13 = strArr10;
                r5[0] = objE;
                return r13;
            case 2:
                String[] strArr11 = ct10Var.j;
                String[] strArr12 = ct10Var.i;
                z1x.P(objE);
                r6 = strArr11;
                r14 = strArr12;
                r6[0] = objE;
                return r14;
            case 3:
                String[] strArr13 = ct10Var.j;
                String[] strArr14 = ct10Var.i;
                z1x.P(objE);
                r7 = strArr13;
                r15 = strArr14;
                r7[0] = objE;
                return r15;
            case 4:
                String[] strArr15 = ct10Var.j;
                String[] strArr16 = ct10Var.i;
                z1x.P(objE);
                r8 = strArr15;
                r16 = strArr16;
                r8[0] = objE;
                return r16;
            case 5:
                String[] strArr17 = ct10Var.j;
                String[] strArr18 = ct10Var.i;
                z1x.P(objE);
                r9 = strArr17;
                r17 = strArr18;
                r9[0] = objE;
                return r17;
            case 6:
                String[] strArr19 = ct10Var.j;
                String[] strArr20 = ct10Var.i;
                z1x.P(objE);
                r10 = strArr19;
                r18 = strArr20;
                r10[0] = objE;
                return r18;
            case 7:
                String[] strArr21 = ct10Var.j;
                String[] strArr22 = ct10Var.i;
                z1x.P(objE);
                r11 = strArr21;
                r19 = strArr22;
                r11[0] = objE;
                return r19;
            case 8:
                String[] strArr23 = ct10Var.j;
                String[] strArr24 = ct10Var.i;
                z1x.P(objE);
                r12 = strArr23;
                r20 = strArr24;
                r12[0] = objE;
                return r20;
            default:
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(zje zjeVar) {
        ht10 ht10Var;
        if (zjeVar instanceof ht10) {
            ht10Var = (ht10) zjeVar;
            int i = ht10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ht10Var.k = i - Integer.MIN_VALUE;
            } else {
                ht10Var = new ht10(this, zjeVar);
            }
        } else {
            ht10Var = new ht10(this, zjeVar);
        }
        Object objB = ht10Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ht10Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            String strC = ((twb0) ((wsb0) this.c.f6568a)).f34643a.c("SAFE_DOMAIN", "");
            if (strC.length() != 0) {
                String statusJsonUrlPart = this.g.getStatusJsonUrlPart();
                ht10Var.k = 1;
                objB = this.f25809a.b(strC, statusJsonUrlPart, "https://", ht10Var);
                if (objB == wneVar) {
                    return wneVar;
                }
            }
            return "";
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objB);
        o9c o9cVar = (o9c) objB;
        if (!o9cVar.getBanned()) {
            return o9cVar.getDomain();
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r1 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        if (r1 == r3) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(a.zje r19) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ot10.j(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.io.Serializable, java.lang.Object[]] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ad -> B:33:0x00ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable k(a.zje r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof a.ft10
            if (r0 == 0) goto L13
            r0 = r12
            a.ft10 r0 = (a.ft10) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            a.ft10 r0 = new a.ft10
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.o
            a.wne r1 = a.wne.f39444a
            int r2 = r0.q
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L41
            if (r2 != r3) goto L3b
            int r2 = r0.n
            int r7 = r0.m
            java.util.Collection r8 = r0.l
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Collection r9 = r0.k
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.String[] r10 = r0.j
            a.z1x.P(r12)
            goto Lae
        L3b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r4
        L41:
            int r2 = r0.m
            java.lang.String[] r7 = r0.j
            java.lang.String[] r8 = r0.i
            a.z1x.P(r12)
            goto L6d
        L4b:
            a.z1x.P(r12)
            a.yyk r12 = r11.g
            boolean r2 = r12.getTestDomainEnabled()
            if (r2 == 0) goto L70
            java.lang.String[] r7 = new java.lang.String[r6]
            r0.i = r7
            r0.j = r7
            r0.m = r5
            r0.q = r6
            a.mmy r12 = r11.i
            org.xplatform.secret.impl.KeysImpl r12 = (org.xplatform.secret.impl.KeysImpl) r12
            java.lang.Object r12 = r12.W(r0)
            if (r12 != r1) goto L6b
            goto Lac
        L6b:
            r2 = r5
            r8 = r7
        L6d:
            r7[r2] = r12
            goto L85
        L70:
            java.lang.String r2 = r12.getManualTestDomain()
            int r2 = r2.length()
            if (r2 <= 0) goto L83
            java.lang.String[] r8 = new java.lang.String[r6]
            java.lang.String r12 = r12.getManualTestDomain()
            r8[r5] = r12
            goto L85
        L83:
            java.lang.String[] r8 = new java.lang.String[r5]
        L85:
            java.util.ArrayList r12 = new java.util.ArrayList
            int r2 = r8.length
            r12.<init>(r2)
            int r2 = r8.length
            r7 = r5
            r10 = r8
            r8 = r12
        L8f:
            if (r7 >= r2) goto Lb6
            r12 = r10[r7]
            r0.i = r4
            r0.j = r10
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            r0.k = r9
            r0.l = r9
            r0.m = r7
            r0.n = r2
            r0.q = r3
            a.z8w0 r9 = r11.d
            java.lang.Object r12 = r9.d(r0, r12, r6)
            if (r12 != r1) goto Lad
        Lac:
            return r1
        Lad:
            r9 = r8
        Lae:
            java.lang.String r12 = (java.lang.String) r12
            r8.add(r12)
            int r7 = r7 + r6
            r8 = r9
            goto L8f
        Lb6:
            java.util.List r8 = (java.util.List) r8
            java.lang.String[] r11 = new java.lang.String[r5]
            java.lang.Object[] r11 = r8.toArray(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ot10.k(a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:0x014d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0156  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x014d -> B:62:0x014e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable l(a.zje r14) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ot10.l(a.zje):java.io.Serializable");
    }
}
