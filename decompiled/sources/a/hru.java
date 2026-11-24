package a;

import android.app.NotificationManager;
import android.gov.nist.core.Separators;
import android.os.Build;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.EOFException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class hru implements n1x, pp9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13549a;

    public hru(v0 v0Var, Class cls) {
        if (((Map) v0Var.c).keySet().contains(cls) || Void.class.equals(cls)) {
            this.f13549a = v0Var;
        } else {
            jf4.o(ua80.i("Given internalKeyMananger ", v0Var.toString(), " does not support primitive class ", cls.getName()));
            throw null;
        }
    }

    public long a() {
        Map mapS = ((rkr0) this.f13549a).s();
        if (!mapS.isEmpty()) {
            ArrayList arrayList = new ArrayList(mapS.size());
            Iterator it = mapS.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((Set) ((Map.Entry) it.next()).getValue()).size()));
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = Long.valueOf(((Number) next).longValue() * ((Number) it2.next()).longValue());
                }
                return ((Number) next).longValue();
            }
            v4i0.p("Empty collection can't be reduced.");
        }
        return 0L;
    }

    public xae0 b(boolean z) {
        u5g0 u5g0Var = (u5g0) ((nv20) this.f13549a).f24171a;
        return vtb.N(z ? u5g0Var.b : u5g0Var.f35093a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public Serializable c(double d, double d2, int i, int i2, long j, zje zjeVar, qvo0 qvo0Var) throws Throwable {
        sxu sxuVar;
        Object g0g0Var;
        double d3;
        double d4;
        hru hruVar = this;
        dgu dguVar = (dgu) hruVar.f13549a;
        if (zjeVar instanceof sxu) {
            sxuVar = (sxu) zjeVar;
            int i3 = sxuVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sxuVar.n = i3 - Integer.MIN_VALUE;
            } else {
                sxuVar = new sxu(hruVar, zjeVar);
            }
        } else {
            sxuVar = new sxu(hruVar, zjeVar);
        }
        sxu sxuVar2 = sxuVar;
        Object objK = sxuVar2.l;
        wne wneVar = wne.f39444a;
        int i4 = sxuVar2.n;
        try {
            if (i4 == 0) {
                z1x.P(objK);
                if (!((ovo0) dguVar.b).f25934a) {
                    return hxu.h;
                }
                e0g0 e0g0Var = j0g0.b;
                sxuVar2.k = hruVar;
                sxuVar2.i = d;
                sxuVar2.j = d2;
                sxuVar2.n = 1;
                objK = dguVar.k(d, d2, i, i2, j, sxuVar2, qvo0Var);
                if (objK == wneVar) {
                    return wneVar;
                }
                d3 = d;
                d4 = d2;
            } else {
                if (i4 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d4 = sxuVar2.j;
                d3 = sxuVar2.i;
                hruVar = sxuVar2.k;
                z1x.P(objK);
            }
            hxu hxuVar = (hxu) objK;
            hruVar.getClass();
            BigDecimal scale = new BigDecimal(hxuVar.f.b - (d3 * d4)).setScale(2, RoundingMode.HALF_UP);
            g0g0Var = hxu.a(hxuVar, null, (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).doubleValue(), 63);
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            if (thA instanceof zhi0) {
                if (((zhi0) thA).c == i2o.TaxNotAvailable) {
                    ((ovo0) dguVar.b).f25934a = false;
                }
                g0g0Var = hxu.h;
            } else {
                if (thA instanceof CancellationException) {
                    throw thA;
                }
                g0g0Var = hxu.h;
            }
        }
        return (hxu) g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(q7f0 q7f0Var, zje zjeVar) {
        gru gruVar;
        Object next;
        if (zjeVar instanceof gru) {
            gruVar = (gru) zjeVar;
            int i = gruVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                gruVar.l = i - Integer.MIN_VALUE;
            } else {
                gruVar = new gru(this, zjeVar);
            }
        } else {
            gruVar = new gru(this, zjeVar);
        }
        Object objA = gruVar.j;
        Object obj = wne.f39444a;
        int i2 = gruVar.l;
        if (i2 == 0) {
            z1x.P(objA);
            g8f0 g8f0Var = (g8f0) this.f13549a;
            gruVar.i = q7f0Var;
            gruVar.l = 1;
            objA = g8f0Var.a(gruVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q7f0Var = gruVar.i;
            z1x.P(objA);
        }
        Iterator it = ((Iterable) objA).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((b1f0) next).f1803a != q7f0Var);
        b1f0 b1f0Var = (b1f0) next;
        ArrayList arrayList = b1f0Var != null ? b1f0Var.b : null;
        return arrayList == null ? iun.f15405a : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object e(List list, zje zjeVar) {
        ytu ytuVar;
        qtc0 qtc0Var;
        op1 op1Var = (op1) this.f13549a;
        if (zjeVar instanceof ytu) {
            ytuVar = (ytu) zjeVar;
            int i = ytuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ytuVar.l = i - Integer.MIN_VALUE;
            } else {
                ytuVar = new ytu(this, zjeVar);
            }
        } else {
            ytuVar = new ytu(this, zjeVar);
        }
        Object objB = ytuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = ytuVar.l;
        if (i2 == 0) {
            z1x.P(objB);
            ytuVar.i = list;
            ytuVar.l = 1;
            objB = op1Var.b(ytuVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = ytuVar.i;
            z1x.P(objB);
        }
        List list2 = (List) objB;
        if (!list2.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            ysw yswVar = ((ykg0) obj).c;
            if (StringsKt.W(yswVar.f43189a)) {
                qtc0Var = null;
            } else {
                String str = yswVar.f43189a;
                ykg0 ykg0Var = (ykg0) CollectionsKt.W(i3 - 1, list);
                String str2 = ykg0Var != null ? ykg0Var.b : null;
                if (str2 == null) {
                    str2 = "";
                }
                qtc0Var = new qtc0(str, str2, yswVar.d);
            }
            if (qtc0Var != null) {
                arrayList.add(qtc0Var);
            }
            i3 = i4;
        }
        op1Var.f25617a.o(null, arrayList);
        return arrayList;
    }

    public ArrayList f(uaq0 uaq0Var) {
        rh00 rh00Var = (rh00) this.f13549a;
        List list = rh00.d;
        int i = 0;
        boolean zO = StringsKt.O(rh00Var.c.c(), "ru", false);
        String strValueOf = String.valueOf(1);
        list.getClass();
        strValueOf.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ph00 ph00Var = (ph00) obj;
            String strValueOf2 = String.valueOf(i2);
            String str = zO ? "/ru/" : "/en/";
            uaq0.f35345a.getClass();
            String str2 = "_l";
            if (!s9m0.j(uaq0Var)) {
                if (s9m0.i(uaq0Var)) {
                    str2 = "_d";
                } else if (s9m0.k(uaq0Var)) {
                    str2 = "_n";
                }
            }
            arrayList.add(new oh00(ph00Var, axq.n(b1j.n("static/img/android/instructions/onboarding_casino", Separators.SLASH.concat(strValueOf), "/live", str, strValueOf2), str2, ".webp")));
            i = i2;
        }
        return arrayList;
    }

    @Override // a.pp9
    public void g(to9 to9Var, jtf0 jtf0Var) {
        n5a n5aVar = (n5a) this.f13549a;
        e0g0 e0g0Var = j0g0.b;
        n5aVar.resumeWith(jtf0Var);
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        k6y k6yVar = (k6y) this.f13549a;
        sqt sqtVar = k6y.Q1;
        t6y t6yVarH0 = k6yVar.H0();
        p7m0 p7m0Var = t6yVarH0.o;
        p7m0 p7m0Var2 = t6yVarH0.n;
        boolean z = t6yVarH0.m;
        if (!z) {
            n6y n6yVar = new n6y(sa10.b(t6yVarH0.e, pb10.g, R.string.data_retrieval_error, 0, null, 28));
            p7m0Var.getClass();
            p7m0Var.o(null, n6yVar);
        } else if (z && !(p7m0Var2.getValue() instanceof p6y)) {
            p7m0Var.getClass();
            p7m0Var.o(null, m6y.f21294a);
        } else if (t6yVarH0.m) {
            p7m0Var2.getValue();
        }
    }

    public boolean i() {
        tgk tgkVar = (tgk) ((rrc) this.f13549a).b;
        if (Build.VERSION.SDK_INT < 26) {
            return new o760(tgkVar.f33916a).b.areNotificationsEnabled();
        }
        NotificationManager notificationManager = (NotificationManager) tgkVar.h.getValue();
        if (notificationManager != null && !notificationManager.areNotificationsEnabled()) {
            return false;
        }
        NotificationManager notificationManager2 = (NotificationManager) tgkVar.h.getValue();
        List notificationChannels = notificationManager2 != null ? notificationManager2.getNotificationChannels() : null;
        if (notificationChannels == null) {
            notificationChannels = iun.f15405a;
        }
        Iterator it = notificationChannels.iterator();
        while (it.hasNext()) {
            if (c0g.b(it.next()).getImportance() == 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object j(s470 s470Var, zje zjeVar) {
        fp00 fp00Var;
        kgq0 kgq0Var = (kgq0) this.f13549a;
        if (zjeVar instanceof fp00) {
            fp00Var = (fp00) zjeVar;
            int i = fp00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fp00Var.k = i - Integer.MIN_VALUE;
            } else {
                fp00Var = new fp00(this, zjeVar);
            }
        } else {
            fp00Var = new fp00(this, zjeVar);
        }
        Object objB = fp00Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fp00Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            fp00Var.k = 1;
            objB = kgq0Var.b(s470Var, fp00Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        List list = (List) objB;
        kgq0Var.e(list);
        return list;
    }

    public fky l(og9 og9Var) throws GeneralSecurityException {
        v0 v0Var = (v0) this.f13549a;
        try {
            p4 p4VarS = v0Var.s();
            x3 x3VarG0 = p4VarS.G0(og9Var);
            p4VarS.M0(x3VarG0);
            x3 x3VarT0 = p4VarS.t0(x3VarG0);
            dky dkyVarB = fky.B();
            String strQ = v0Var.q();
            dkyVarB.e();
            ((fky) dkyVarB.b).D(strQ);
            kg9 kg9VarF = x3VarT0.f();
            dkyVarB.e();
            ((fky) dkyVarB.b).E(kg9VarF);
            eky ekyVarT = v0Var.t();
            dkyVarB.e();
            ((fky) dkyVarB.b).C(ekyVarT);
            return (fky) dkyVarB.b();
        } catch (ynx e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // a.pp9
    public void m(to9 to9Var, Throwable th) {
        n5a n5aVar = (n5a) this.f13549a;
        e0g0 e0g0Var = j0g0.b;
        n5aVar.resumeWith(new g0g0(th));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:1: B:4:0x0009->B:51:?, LOOP_END, SYNTHETIC] */
    public ed40 n(guo guoVar, cxw cxwVar, int i) {
        int i2;
        fq80 fq80Var = (fq80) this.f13549a;
        int i3 = 0;
        ed40 ed40VarQ = null;
        while (true) {
            int i4 = 0;
            while (true) {
                i2 = i4 % 10;
                int i5 = i2 + 10;
                if (i2 == 0 && i4 != 0) {
                    byte[] bArr = fq80Var.f9961a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i6 = i4 == 0 ? 10 : 1;
                try {
                    guoVar.n(fq80Var.f9961a, i5 - i6, i6);
                    fq80Var.M(i2);
                    fq80Var.L(i5);
                    if (fq80Var.a() < 3) {
                        ohq.g(fq80Var.b, fq80Var.c, ", limit=", "position=");
                        return null;
                    }
                    int iC = fq80Var.C();
                    fq80Var.b -= 3;
                    if (iC == 4801587) {
                        fq80Var.N(3);
                        int iZ = fq80Var.z();
                        if (iZ < 2 || iZ > 4) {
                            if (i4 == 0) {
                                fq80Var.c(20);
                            }
                            i4++;
                            if (i4 > i) {
                            }
                        }
                    } else if (saj.S(fq80Var.i()) == -1) {
                        if (i4 == 0) {
                            fq80Var.c(20);
                        }
                        i4++;
                        if (i4 > i) {
                        }
                    }
                    guoVar.g();
                    guoVar.j(i3);
                    return ed40VarQ;
                } catch (EOFException unused) {
                }
            }
            fq80Var.M(i2);
            int i7 = fq80Var.b;
            fq80Var.N(6);
            int iY = fq80Var.y();
            int i8 = iY + 10;
            if (guoVar.getLength() != -1 && guoVar.i() + ((long) iY) > guoVar.getLength()) {
                StringBuilder sbM = b1j.m(i8, "Skipping ID3 tag with tagLength=", " greater than input length=");
                sbM.append(guoVar.getLength());
                f1t0.g0("Id3Peeker", sbM.toString());
                guoVar.g();
                guoVar.j(i3);
                return ed40VarQ;
            }
            if (ed40VarQ == null) {
                byte[] bArr2 = new byte[i8];
                System.arraycopy(fq80Var.f9961a, i7, bArr2, 0, 10);
                guoVar.n(bArr2, 10, iY);
                ed40VarQ = new exw(cxwVar).Q(bArr2, i8);
            } else {
                guoVar.j(iY);
            }
            i3 += i8;
        }
    }

    public hru(umx umxVar) {
        umxVar.getClass();
        this.f13549a = umxVar;
    }

    public hru(wu00 wu00Var) {
        wu00Var.getClass();
        this.f13549a = wu00Var;
    }

    public hru(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 16:
                this.f13549a = new tpv(gii0Var, (byte) 2);
                break;
            default:
                this.f13549a = new tpv(gii0Var, (byte) 0);
                break;
        }
    }

    public /* synthetic */ hru(Object obj) {
        this.f13549a = obj;
    }

    public hru(byte b) {
        switch (b) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                this.f13549a = new xz40(new paz[16]);
                break;
            default:
                this.f13549a = new fq80(10);
                break;
        }
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
    }
}
