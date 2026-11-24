package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class lbu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19768a;
    public final Object b;
    public final Object c;

    public lbu(gii0 gii0Var, byte b) {
        this.f19768a = b;
        gii0Var.getClass();
        switch (b) {
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                this.b = gii0Var;
                this.c = new y2x(this, (byte) 20);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            default:
                this.b = gii0Var;
                this.c = new bdv(this, (byte) 22);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                this.b = gii0Var;
                this.c = new rcz(this, (byte) 3);
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                this.b = gii0Var;
                this.c = new rcz(this, (byte) 21);
                break;
        }
    }

    public static Serializable k(lbu lbuVar, int i, yje yjeVar, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return cdu.c((cdu) lbuVar.b, i, ((ntu) lbuVar.c).a(), yjeVar, 8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, zje zjeVar) {
        w4z w4zVar;
        if (zjeVar instanceof w4z) {
            w4zVar = (w4z) zjeVar;
            int i = w4zVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                w4zVar.k = i - Integer.MIN_VALUE;
            } else {
                w4zVar = new w4z(this, zjeVar);
            }
        } else {
            w4zVar = new w4z(this, zjeVar);
        }
        Object objA = w4zVar.i;
        wne wneVar = wne.f39444a;
        int i2 = w4zVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            reu reuVar = (reu) this.b;
            w4zVar.k = 1;
            objA = ((njg) reuVar.b).a(str, w4zVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        ljg ljgVar = (ljg) objA;
        if (ljgVar.b.c.length() != 0 && ljgVar.c.c.length() != 0) {
            return ljgVar;
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(zje zjeVar) throws j7t0 {
        jbu jbuVar;
        if (zjeVar instanceof jbu) {
            jbuVar = (jbu) zjeVar;
            int i = jbuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbuVar.k = i - Integer.MIN_VALUE;
            } else {
                jbuVar = new jbu(this, zjeVar);
            }
        } else {
            jbuVar = new jbu(this, zjeVar);
        }
        Object objA = jbuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = jbuVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            eqx eqxVar = (eqx) this.c;
            jbuVar.k = 1;
            objA = eqxVar.a(jbuVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        Integer intOrNull = StringsKt.toIntOrNull(((m2c0) objA).c);
        if (intOrNull == null || intOrNull.intValue() == 0) {
            throw new j7t0(0);
        }
        return intOrNull;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object c(double d, long j, long j2, zje zjeVar) {
        xwu xwuVar;
        double d2;
        long j3;
        long j4;
        vyu0 vyu0Var;
        double d3;
        if (zjeVar instanceof xwu) {
            xwuVar = (xwu) zjeVar;
            int i = xwuVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                xwuVar.p = i - Integer.MIN_VALUE;
            } else {
                xwuVar = new xwu(this, zjeVar);
            }
        } else {
            xwuVar = new xwu(this, zjeVar);
        }
        xwu xwuVar2 = xwuVar;
        Object objS = xwuVar2.n;
        wne wneVar = wne.f39444a;
        int i2 = xwuVar2.p;
        if (i2 == 0) {
            z1x.P(objS);
            qrt qrtVar = (qrt) this.b;
            xwuVar2.i = j;
            xwuVar2.j = j2;
            xwuVar2.k = d;
            xwuVar2.p = 1;
            objS = qrtVar.f29227a.s(d, j, j2, xwuVar2);
            if (objS != wneVar) {
                d2 = d;
                j3 = j;
                j4 = j2;
            }
            return wneVar;
        }
        if (i2 == 1) {
            d2 = xwuVar2.k;
            j4 = xwuVar2.j;
            j3 = xwuVar2.i;
            z1x.P(objS);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d3 = xwuVar2.l;
            vyu0Var = xwuVar2.m;
            z1x.P(objS);
        }
        return new vyu0(d3, vyu0Var.c, (String) objS);
        vyu0 vyu0Var2 = (vyu0) objS;
        double d4 = vyu0Var2.f38268a;
        q0u q0uVar = (q0u) this.c;
        String str = vyu0Var2.b;
        xwuVar2.m = vyu0Var2;
        xwuVar2.i = j3;
        xwuVar2.j = j4;
        xwuVar2.k = d2;
        xwuVar2.l = d4;
        xwuVar2.p = 2;
        Object objA = q0uVar.a(str, xwuVar2);
        if (objA != wneVar) {
            objS = objA;
            vyu0Var = vyu0Var2;
            d3 = d4;
            return new vyu0(d3, vyu0Var.c, (String) objS);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public Object d(long j, zje zjeVar) {
        upu upuVar;
        long j2;
        long j3;
        double d;
        boolean z;
        Object objI;
        long j4 = j;
        g45 g45Var = (g45) ((wsf0) this.c).b;
        if (zjeVar instanceof upu) {
            upuVar = (upu) zjeVar;
            int i = upuVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                upuVar.m = i - Integer.MIN_VALUE;
            } else {
                upuVar = new upu(this, zjeVar);
            }
        } else {
            upuVar = new upu(this, zjeVar);
        }
        upu upuVar2 = upuVar;
        Object objA = upuVar2.k;
        wne wneVar = wne.f39444a;
        int i2 = upuVar2.m;
        if (i2 == 0) {
            z1x.P(objA);
            nrt nrtVarQ = g45Var.q();
            upuVar2.i = j4;
            upuVar2.m = 1;
            objA = nrt.a(nrtVarQ, j4, upuVar2);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            j4 = upuVar2.i;
            z1x.P(objA);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    z1x.P(objA);
                    return objA;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = upuVar2.j;
            j2 = upuVar2.i;
            z1x.P(objA);
        }
        xuf xufVar = (xuf) objA;
        xfu xfuVar = (xfu) this.b;
        double d2 = xufVar.i;
        d = xufVar.m;
        if (d == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        upuVar2.i = j2;
        upuVar2.j = j3;
        upuVar2.m = 3;
        objI = ((pv00) xfuVar.f40810a).i(j2, d2, d, !z, upuVar2);
        if (objI != wneVar) {
            return wneVar;
        }
        return objI;
        long j5 = ((ql5) objA).e;
        m0u m0uVarT = g45Var.t();
        upuVar2.i = j4;
        upuVar2.j = j5;
        upuVar2.m = 2;
        objA = m0uVarT.f20973a.c(j5, upuVar2);
        if (objA != wneVar) {
            j2 = j4;
            j3 = j5;
            xuf xufVar2 = (xuf) objA;
            xfu xfuVar2 = (xfu) this.b;
            double d3 = xufVar2.i;
            d = xufVar2.m;
            if (d == 0.0d) {
                z = true;
            } else {
                z = false;
            }
            upuVar2.i = j2;
            upuVar2.j = j3;
            upuVar2.m = 3;
            objI = ((pv00) xfuVar2.f40810a).i(j2, d3, d, !z, upuVar2);
            if (objI != wneVar) {
                return objI;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public Object e(zje zjeVar) throws j7t0 {
        kbu kbuVar;
        e1u e1uVar;
        hqu hquVar;
        guu guuVar;
        xsu xsuVar;
        byte b = this.f19768a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (zjeVar instanceof kbu) {
                    kbuVar = (kbu) zjeVar;
                    int i = kbuVar.l;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kbuVar.l = i - Integer.MIN_VALUE;
                    } else {
                        kbuVar = new kbu(this, zjeVar);
                    }
                } else {
                    kbuVar = new kbu(this, zjeVar);
                }
                Object obj3 = kbuVar.j;
                Object obj4 = wne.f39444a;
                int i2 = kbuVar.l;
                if (i2 == 0) {
                    z1x.P(obj3);
                    e1u e1uVar2 = (e1u) obj2;
                    kbuVar.i = e1uVar2;
                    kbuVar.l = 1;
                    Object objB = b(kbuVar);
                    if (objB == obj4) {
                        return obj4;
                    }
                    obj3 = objB;
                    e1uVar = e1uVar2;
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e1uVar = kbuVar.i;
                    z1x.P(obj3);
                }
                int iIntValue = ((Number) obj3).intValue();
                List listSplit$default = StringsKt__StringsKt.split$default(((vwb0) ((es) e1uVar.b).f8305a).c("FOLLOWED_COUNTRY_IDS", ""), new String[]{Separators.COMMA}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList();
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                    if (intOrNull != null) {
                        arrayList.add(intOrNull);
                    }
                }
                Set setP0 = CollectionsKt.P0(arrayList);
                if (setP0.isEmpty()) {
                    setP0 = cui0.b(Integer.valueOf(iIntValue));
                }
                return setP0;
            case 10:
                if (zjeVar instanceof hqu) {
                    hquVar = (hqu) zjeVar;
                    int i3 = hquVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        hquVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        hquVar = new hqu(this, zjeVar);
                    }
                } else {
                    hquVar = new hqu(this, zjeVar);
                }
                Object objJ = hquVar.i;
                wne wneVar = wne.f39444a;
                int i4 = hquVar.k;
                if (i4 == 0) {
                    z1x.P(objJ);
                    hquVar.k = 1;
                    objJ = ((qgd) obj2).J((2 & 1) != 0, null, hquVar);
                    if (objJ != wneVar) {
                    }
                    return wneVar;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        z1x.P(objJ);
                        return objJ;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objJ);
                List listD0 = CollectionsKt.D0((Iterable) objJ, 3);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listD0.iterator();
                while (it2.hasNext()) {
                    vrc0 vrc0Var = (vrc0) CollectionsKt.firstOrNull(((asc0) it2.next()).c);
                    if (vrc0Var != null) {
                        arrayList2.add(vrc0Var);
                    }
                }
                hquVar.k = 2;
                Serializable serializableW = ((a6u) obj).w(hquVar, "static/img/android/promo_store/showcase/square", arrayList2);
                if (serializableW != wneVar) {
                    return serializableW;
                }
                return wneVar;
            default:
                if (zjeVar instanceof guu) {
                    guuVar = (guu) zjeVar;
                    int i5 = guuVar.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        guuVar.l = i5 - Integer.MIN_VALUE;
                    } else {
                        guuVar = new guu(this, zjeVar);
                    }
                } else {
                    guuVar = new guu(this, zjeVar);
                }
                Object objC = guuVar.j;
                wne wneVar2 = wne.f39444a;
                int i6 = guuVar.l;
                if (i6 == 0) {
                    z1x.P(objC);
                    xsuVar = (xsu) obj;
                    guuVar.i = xsuVar;
                    guuVar.l = 1;
                    objC = ((x0u) obj2).c(guuVar);
                    if (objC != wneVar2) {
                    }
                    return wneVar2;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        z1x.P(objC);
                        return objC;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xsuVar = guuVar.i;
                z1x.P(objC);
                int iIntValue2 = ((Number) objC).intValue();
                guuVar.i = null;
                guuVar.l = 2;
                Serializable serializableS = ((fvt0) xsuVar.f41434a).s(iIntValue2, guuVar);
                if (serializableS != wneVar2) {
                    return serializableS;
                }
                return wneVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public Object f(String str, zje zjeVar) {
        adu aduVar;
        lvu lvuVar;
        z220 z220Var;
        String str2;
        byte b = this.f19768a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                yxs yxsVar = (yxs) obj2;
                if (zjeVar instanceof adu) {
                    aduVar = (adu) zjeVar;
                    int i = aduVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aduVar.k = i - Integer.MIN_VALUE;
                    } else {
                        aduVar = new adu(this, zjeVar);
                    }
                } else {
                    aduVar = new adu(this, zjeVar);
                }
                Object objB = aduVar.i;
                wne wneVar = wne.f39444a;
                int i2 = aduVar.k;
                if (i2 == 0) {
                    z1x.P(objB);
                    boolean zA = ((gst0) obj).a();
                    aduVar.k = 1;
                    objB = yxsVar.b(aduVar, str, zA);
                    if (objB != wneVar) {
                    }
                    return wneVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        z1x.P(objB);
                        return objB;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objB);
                vxs vxsVar = (vxs) objB;
                String str3 = vxsVar.b;
                if (StringsKt.W(str3)) {
                    return vxsVar.f38217a;
                }
                aduVar.k = 2;
                Object objA = yxsVar.a(str3, aduVar);
                if (objA != wneVar) {
                    return objA;
                }
                return wneVar;
            default:
                if (zjeVar instanceof lvu) {
                    lvuVar = (lvu) zjeVar;
                    int i3 = lvuVar.m;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        lvuVar.m = i3 - Integer.MIN_VALUE;
                    } else {
                        lvuVar = new lvu(this, zjeVar);
                    }
                } else {
                    lvuVar = new lvu(this, zjeVar);
                }
                Object obj3 = lvuVar.k;
                wne wneVar2 = wne.f39444a;
                int i4 = lvuVar.m;
                if (i4 == 0) {
                    z1x.P(obj3);
                    z220 z220Var2 = (z220) obj2;
                    lvuVar.i = str;
                    lvuVar.j = z220Var2;
                    lvuVar.m = 1;
                    Serializable serializableD = ((sjl0) obj).d(lvuVar);
                    if (serializableD != wneVar2) {
                        z220Var = z220Var2;
                        obj3 = serializableD;
                        str2 = str;
                    }
                    return wneVar2;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        z1x.P(obj3);
                        return obj3;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z220Var = lvuVar.j;
                str2 = lvuVar.i;
                z1x.P(obj3);
                lvuVar.i = null;
                lvuVar.j = null;
                lvuVar.m = 2;
                Serializable serializableW = z220Var.w(lvuVar, str2, (List) obj3);
                if (serializableW != wneVar2) {
                    return serializableW;
                }
                return wneVar2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:13|14|67|23|(1:26)|62) */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        r6 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r2;
        r2 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        if (r7.f != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c5, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
    
        if (a.hic.C(r0) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ce, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d0, code lost:
    
        if (r12 > 3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r12, "error (", "): ", r0));
        r14.j = r6;
        r14.i = r2;
        r14.k = r13;
        r14.l = r12;
        r14.o = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f2, code lost:
    
        if (a.qcc.O(3000, r14) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f5, code lost:
    
        r12 = a.j0g0.b;
        r0 = new a.g0g0(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00f2 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(boolean r13, a.zje r14) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lbu.g(boolean, a.zje):java.lang.Object");
    }

    public BigDecimal h() {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(((pzu) ((ivn) this.b).f15453a).G().k));
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(((hrc) this.c).a());
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimalValueOf);
        bigDecimalMultiply.getClass();
        return bigDecimalMultiply;
    }

    public List i() {
        return ((gst0) this.b).a() ? ((pv00) this.c).d() : iun.f15405a;
    }

    public boolean j() {
        byte b = this.f19768a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 23:
                vff0 vff0Var = (vff0) obj2;
                j1q0 j1q0Var = (j1q0) obj;
                cgx0 cgx0Var = vff0Var.a(j1q0Var.b(), j1q0Var.f15748a.q()).f32117a.n;
                String string = vff0Var.c.a().getString(CommonConstant.RETKEY.COUNTRYCODE, "");
                String str = string != null ? string : "";
                boolean zContains = ((List) cgx0Var.d).contains(str);
                if (!zContains || str.length() <= 0) {
                    if (!cgx0Var.b) {
                        return true;
                    }
                } else if (!zContains) {
                    return true;
                }
                return false;
            default:
                q7d0 q7d0Var = (q7d0) obj2;
                return ((pru) obj).a().w0 && q7d0Var.a().getBoolean("FIRST_REGISTRATION_SUCCESS", false) && !q7d0Var.a().getBoolean("KZ_GREETING_SHOWED", false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object l(long j, zje zjeVar, String str) {
        x4z x4zVar;
        ljg ljgVar;
        if (zjeVar instanceof x4z) {
            x4zVar = (x4z) zjeVar;
            int i = x4zVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                x4zVar.n = i - Integer.MIN_VALUE;
            } else {
                x4zVar = new x4z(this, zjeVar);
            }
        } else {
            x4zVar = new x4z(this, zjeVar);
        }
        x4z x4zVar2 = x4zVar;
        Object objA = x4zVar2.l;
        wne wneVar = wne.f39444a;
        int i2 = x4zVar2.n;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                e0g0 e0g0Var = j0g0.b;
                x4zVar2.i = this;
                x4zVar2.k = j;
                x4zVar2.n = 1;
                objA = a(str, x4zVar2);
                if (objA == wneVar) {
                }
                return wneVar;
            }
            if (i2 == 1) {
                j = x4zVar2.k;
                this = x4zVar2.i;
                z1x.P(objA);
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ljgVar = x4zVar2.j;
                z1x.P(objA);
            }
            lk40 lk40Var = new lk40(ljgVar, (ypl0) objA);
            e0g0 e0g0Var2 = j0g0.b;
            return lk40Var;
            ljg ljgVar2 = (ljg) objA;
            j3c j3cVar = (j3c) this.c;
            x4zVar2.i = null;
            x4zVar2.j = ljgVar2;
            x4zVar2.k = j;
            x4zVar2.n = 2;
            Object objA2 = j3cVar.a(40L, j, x4zVar2);
            if (objA2 != wneVar) {
                objA = objA2;
                ljgVar = ljgVar2;
                lk40 lk40Var2 = new lk40(ljgVar, (ypl0) objA);
                e0g0 e0g0Var3 = j0g0.b;
                return lk40Var2;
            }
            return wneVar;
        } catch (Throwable th) {
            e0g0 e0g0Var4 = j0g0.b;
            return new g0g0(th);
        }
    }

    public int m(int i, int i2) {
        int i3 = ((short[]) this.b)[(i2 * 3) + i] >> 2;
        return i3 * i3;
    }

    public lbu(q7d0 q7d0Var, pru pruVar) {
        this.f19768a = (byte) 24;
        q7d0Var.getClass();
        this.b = q7d0Var;
        this.c = pruVar;
    }

    public lbu(nwd nwdVar, vff0 vff0Var, j1q0 j1q0Var) {
        this.f19768a = (byte) 23;
        vff0Var.getClass();
        j1q0Var.getClass();
        this.b = vff0Var;
        this.c = j1q0Var;
    }

    public lbu(yxs yxsVar, gst0 gst0Var) {
        this.f19768a = (byte) 1;
        yxsVar.getClass();
        gst0Var.getClass();
        this.b = yxsVar;
        this.c = gst0Var;
    }

    public lbu(z220 z220Var, sjl0 sjl0Var) {
        this.f19768a = (byte) 12;
        sjl0Var.getClass();
        this.b = z220Var;
        this.c = sjl0Var;
    }

    public lbu(h0q0 h0q0Var, gst0 gst0Var) {
        this.f19768a = (byte) 16;
        gst0Var.getClass();
        this.b = h0q0Var;
        this.c = gst0Var;
    }

    public lbu(gst0 gst0Var, pv00 pv00Var) {
        this.f19768a = (byte) 5;
        gst0Var.getClass();
        this.b = gst0Var;
        this.c = pv00Var;
    }

    public lbu(cu5 cu5Var, j1q0 j1q0Var, wsz wszVar) {
        this.f19768a = (byte) 14;
        cu5Var.getClass();
        j1q0Var.getClass();
        this.b = cu5Var;
        this.c = j1q0Var;
    }

    public /* synthetic */ lbu(Object obj, Object obj2, byte b) {
        this.f19768a = b;
        this.b = obj;
        this.c = obj2;
    }

    public lbu(j1q0 j1q0Var, n31 n31Var) {
        this.f19768a = (byte) 4;
        j1q0Var.getClass();
        n31Var.getClass();
        this.b = j1q0Var;
        this.c = n31Var;
    }

    public lbu(j1q0 j1q0Var, z220 z220Var) {
        this.f19768a = (byte) 8;
        j1q0Var.getClass();
        this.b = j1q0Var;
        this.c = z220Var;
    }

    public lbu(svu svuVar, m1e m1eVar) {
        this.f19768a = (byte) 17;
        m1eVar.getClass();
        this.b = svuVar;
        this.c = m1eVar;
    }

    public lbu(u6t u6tVar, gst0 gst0Var) {
        this.f19768a = (byte) 2;
        u6tVar.getClass();
        gst0Var.getClass();
        this.b = u6tVar;
        this.c = gst0Var;
    }

    public lbu() {
        this.f19768a = (byte) 19;
        this.b = new short[40];
        this.c = new short[13];
    }
}
