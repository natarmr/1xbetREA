package a;

import android.text.Spannable;
import android.text.SpannableString;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes6.dex */
public final class jtj implements vo9, vke, btn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17103a;
    public Object b;
    public Object c;

    public jtj() {
        this.f17103a = (byte) 4;
        this.b = new or30();
        this.c = new or30();
    }

    public static Serializable l(jtj jtjVar, zje zjeVar) {
        return ((jdu) jtjVar.b).a(zjeVar, ((ntu) jtjVar.c).a(), false, true);
    }

    @Override // a.btn
    public boolean a(CharSequence charSequence, int i, int i2, u0t0 u0t0Var) {
        if ((u0t0Var.c & 4) > 0) {
            return true;
        }
        if (((let0) this.b) == null) {
            this.b = new let0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((xak) this.c).getClass();
        ((let0) this.b).setSpan(new v0t0(u0t0Var), i, i2, 33);
        return true;
    }

    @Override // a.btn
    public Object b() {
        return (let0) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, String str2, String str3, zje zjeVar) {
        eyo eyoVar;
        if (zjeVar instanceof eyo) {
            eyoVar = (eyo) zjeVar;
            int i = eyoVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                eyoVar.k = i - Integer.MIN_VALUE;
            } else {
                eyoVar = new eyo(this, zjeVar);
            }
        } else {
            eyoVar = new eyo(this, zjeVar);
        }
        Object objA = eyoVar.i;
        wne wneVar = wne.f39444a;
        int i2 = eyoVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            kyo kyoVar = new kyo(new jyo(String.valueOf(jCurrentTimeMillis), wxs0.g(jCurrentTimeMillis, str2), wxs0.g(jCurrentTimeMillis, str)), str3);
            fhj fhjVar = (fhj) this.b;
            String strA = ((btt0) this.c).a();
            eyoVar.k = 1;
            objA = ((xxo) ((ntl) fhjVar.b).invoke()).a(strA, kyoVar, eyoVar);
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
        nyo nyoVar = (nyo) ((q16) objA).a();
        String str4 = nyoVar.d;
        if (str4 == null || str4.length() <= 0) {
            str4 = null;
        }
        if (str4 == null && !Intrinsics.d(nyoVar.f24337a, Boolean.TRUE)) {
            jf4.k(null);
            return null;
        }
        String str5 = nyoVar.b;
        if (str5 == null) {
            str5 = "";
        }
        return new oyo(str5, str4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object d(List list, zje zjeVar) {
        dwp dwpVar;
        ArrayList arrayList;
        Object g0g0Var;
        bwp bwpVar = (bwp) this.c;
        if (zjeVar instanceof dwp) {
            dwpVar = (dwp) zjeVar;
            int i = dwpVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                dwpVar.l = i - Integer.MIN_VALUE;
            } else {
                dwpVar = new dwp(this, zjeVar);
            }
        } else {
            dwpVar = new dwp(this, zjeVar);
        }
        Object objQ = dwpVar.j;
        wne wneVar = wne.f39444a;
        int i2 = dwpVar.l;
        if (i2 == 0) {
            z1x.P(objQ);
            bwpVar.getClass();
            list.getClass();
            LinkedHashSet linkedHashSet = bwpVar.f3336a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedHashSet) {
                if (list.contains(Long.valueOf(((wvp) obj).f39848a))) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                axq.t(((wvp) it.next()).f39848a, arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list) {
                if (!arrayList3.contains(new Long(((Number) obj2).longValue()))) {
                    arrayList4.add(obj2);
                }
            }
            if (arrayList4.isEmpty()) {
                return arrayList2;
            }
            try {
                e0g0 e0g0Var = j0g0.b;
                try {
                    fhj fhjVar = (fhj) this.b;
                    dwpVar.i = arrayList2;
                    dwpVar.l = 1;
                    objQ = fhjVar.q(arrayList4, dwpVar);
                    if (objQ == wneVar) {
                        return wneVar;
                    }
                    arrayList = arrayList2;
                } catch (Throwable th) {
                    th = th;
                    arrayList = arrayList2;
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = dwpVar.i;
            try {
                z1x.P(objQ);
            } catch (Throwable th3) {
                th = th3;
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        }
        g0g0Var = (List) objQ;
        e0g0 e0g0Var4 = j0g0.b;
        if (!(g0g0Var instanceof g0g0)) {
            List<zvp> list2 = (List) g0g0Var;
            ArrayList arrayList5 = new ArrayList(r3d.q(list2, 10));
            for (zvp zvpVar : list2) {
                zvpVar.getClass();
                Long l = zvpVar.f45069a;
                long jLongValue = l != null ? l.longValue() : 0L;
                String str = zvpVar.b;
                if (str == null) {
                    str = "";
                }
                arrayList5.add(new wvp(jLongValue, str));
            }
            bwpVar.getClass();
            bwpVar.f3336a.addAll(arrayList5);
            g0g0Var = CollectionsKt.q0(arrayList5, arrayList);
        }
        return g0g0Var instanceof g0g0 ? arrayList : g0g0Var;
    }

    @Override // a.vo9
    public Type e() {
        return (Type) this.b;
    }

    @Override // a.vo9
    public Object f(jf60 jf60Var) {
        Executor executor = (Executor) this.c;
        return executor == null ? jf60Var : new ktj(executor, jf60Var);
    }

    public l0d g(double d, boolean z) {
        double dI = ((hsj) this.b).i();
        if (((ave) ((tqc) this.c).f34374a.c).h) {
            return l0d.e;
        }
        if (z) {
            return l0d.f19195a;
        }
        if (dI == 0.0d || d == 0.0d) {
            return l0d.f19195a;
        }
        if (dI > d) {
            return l0d.b;
        }
        return dI < d ? l0d.c : l0d.f19195a;
    }

    public ose h() {
        q4f q4fVarE = ((vqc) ((a7q) this.c).f384a).e();
        int size = ((pq) this.b).f27394a.i().size();
        q4f.f28094a.getClass();
        boolean z = size >= nwd.c(q4fVarE) && q4fVarE != q4f.c;
        List listJ = q3d.j(q4f.j, q4f.k, q4f.e);
        if (z) {
            return listJ.contains(q4fVarE) ? new mse(q4fVarE) : lse.f20575a;
        }
        return nse.f24047a;
    }

    public gmq i(String str, boolean z, boolean z2) {
        str.getClass();
        dn0 dn0Var = (dn0) this.b;
        dn0Var.getClass();
        return ulb.L(new yop(new fnq(dn0Var.c.e, new lm0(dn0Var, str, z, z2, null, (byte) 0)), (byte) 3), ((mne) this.c).b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable j(zje zjeVar, String str, boolean z, boolean z2) throws Throwable {
        bcu bcuVar;
        if (zjeVar instanceof bcu) {
            bcuVar = (bcu) zjeVar;
            int i = bcuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bcuVar.l = i - Integer.MIN_VALUE;
            } else {
                bcuVar = new bcu(this, zjeVar);
            }
        } else {
            bcuVar = new bcu(this, zjeVar);
        }
        Object objR = bcuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = bcuVar.l;
        if (i2 == 0) {
            z1x.P(objR);
            p4u p4uVar = (p4u) this.c;
            String strA = ((ntu) this.b).a();
            bcuVar.i = z;
            bcuVar.l = 1;
            objR = ((fhj) p4uVar.f26374a).r(bcuVar, str, strA, z2);
            if (objR == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = bcuVar.i;
            z1x.P(objR);
        }
        Map map = (Map) objR;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((mas) obj).i) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
            linkedHashMap.put(key, list);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public Object k(zje zjeVar) {
        i4k i4kVar;
        cut cutVar;
        hie0 hie0Var;
        hie0 hie0Var2;
        hie0 hie0Var3;
        switch (this.f17103a) {
            case 1:
                g45 g45Var = (g45) this.c;
                lye lyeVar = (lye) g45Var.f10647a;
                if (zjeVar instanceof i4k) {
                    i4kVar = (i4k) zjeVar;
                    int i = i4kVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        i4kVar.k = i - Integer.MIN_VALUE;
                    } else {
                        i4kVar = new i4k(this, zjeVar);
                    }
                } else {
                    i4kVar = new i4k(this, zjeVar);
                }
                Object obj = i4kVar.i;
                wne wneVar = wne.f39444a;
                int i2 = i4kVar.k;
                if (i2 == 0) {
                    z1x.P(obj);
                    lyeVar.d.clear();
                    chf0 chf0Var = (chf0) this.b;
                    i4kVar.k = 1;
                    if (chf0Var.s(i4kVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                cit0 cit0VarJ = knm0.j();
                lyeVar.getClass();
                lyeVar.b = cit0VarJ;
                iun iunVar = iun.f15405a;
                iunVar.getClass();
                m0f m0fVar = (m0f) g45Var.b;
                m0fVar.getClass();
                ArrayList arrayList = m0fVar.b;
                arrayList.clear();
                arrayList.addAll(iunVar);
                ((ave) g45Var.c).b = 0L;
                return Unit.f46060a;
            default:
                if (zjeVar instanceof cut) {
                    cutVar = (cut) zjeVar;
                    int i3 = cutVar.n;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        cutVar.n = i3 - Integer.MIN_VALUE;
                    } else {
                        cutVar = new cut(this, zjeVar);
                    }
                } else {
                    cutVar = new cut(this, zjeVar);
                }
                Object obj2 = cutVar.l;
                wne wneVar2 = wne.f39444a;
                int i4 = cutVar.n;
                if (i4 == 0) {
                    z1x.P(obj2);
                    hie0 hie0Var4 = new hie0();
                    hie0Var = new hie0();
                    hie0 hie0Var5 = new hie0();
                    pbt pbtVar = (pbt) this.b;
                    boolean zA = ((gst0) this.c).a();
                    cutVar.i = hie0Var4;
                    cutVar.j = hie0Var;
                    cutVar.k = hie0Var5;
                    cutVar.n = 1;
                    Object objK = pbtVar.k(zA, cutVar);
                    if (objK == wneVar2) {
                        return wneVar2;
                    }
                    hie0Var2 = hie0Var4;
                    obj2 = objK;
                    hie0Var3 = hie0Var5;
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hie0Var3 = cutVar.k;
                    hie0Var = cutVar.j;
                    hie0Var2 = cutVar.i;
                    z1x.P(obj2);
                }
                for (rq60 rq60Var : (Iterable) obj2) {
                    evz evzVar = d270.b;
                    int i5 = rq60Var.f30917a;
                    evzVar.getClass();
                    int iOrdinal = evz.c(i5).ordinal();
                    if (iOrdinal == 0) {
                        hie0Var3.f13108a = true;
                    } else if (iOrdinal == 1) {
                        hie0Var2.f13108a = true;
                    } else if (iOrdinal == 3) {
                        hie0Var.f13108a = true;
                    }
                }
                ArrayList arrayListL = q3d.l(mf8.d, mf8.h, mf8.e, mf8.f);
                if (hie0Var3.f13108a) {
                    arrayListL.add(mf8.g);
                }
                return new of8(arrayListL, hie0Var2.f13108a && hie0Var.f13108a && hie0Var3.f13108a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object m(zje zjeVar) {
        fcs fcsVar;
        if (zjeVar instanceof fcs) {
            fcsVar = (fcs) zjeVar;
            int i = fcsVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fcsVar.k = i - Integer.MIN_VALUE;
            } else {
                fcsVar = new fcs(this, zjeVar);
            }
        } else {
            fcsVar = new fcs(this, zjeVar);
        }
        Object obj = fcsVar.i;
        wne wneVar = wne.f39444a;
        int i2 = fcsVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            xfq0 xfq0Var = ((kgq0) this.c).c.f2464a;
            fq fqVar = (fq) this.b;
            ly5 ly5Var = new ly5(xfq0Var.g, lnm0.b, false, xfq0Var.h, 1.0d, xfq0Var.d.f4905a.f3145a, xfq0Var.e);
            fcsVar.k = 1;
            if (fqVar.f(ly5Var, fcsVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public void n() throws IOException {
        String str = (String) this.b;
        if (((FileChannel) this.c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.c = null;
            hny.q(kng0.l("Unable to lock file: '", str, "'."), th);
        }
    }

    @Override // a.vke
    public Object o(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        responseBody.getClass();
        lhi0 lhi0Var = (lhi0) this.c;
        return lhi0Var.f20057a.b((jiy) this.b, responseBody.k());
    }

    public void p(String str, boolean z, boolean z2) {
        str.getClass();
        ((qu) this.b).f29324a.a("add_bet_express", xp20.f(new Pair("express_line", str), new Pair("option", z ? "live" : "line"), new Pair("action", z2 ? "bet" : "coupon_add")));
        ((x20) this.c).f40143a.a(tx3.l0(new k1p[]{new i1p(Integer.parseInt(str), (byte) 2), new j1p(z2 ? "bet" : "coupon_add", (byte) 0), new j1p(z ? "live" : "line", (byte) 1)}), 3211L);
    }

    public jtj(nvu nvuVar, k7u k7uVar) {
        this.f17103a = (byte) 15;
        k7uVar.getClass();
        this.b = nvuVar;
        this.c = k7uVar;
    }

    public /* synthetic */ jtj(Object obj, Object obj2, byte b) {
        this.f17103a = b;
        this.b = obj;
        this.c = obj2;
    }

    public jtj(nwd nwdVar, vff0 vff0Var, j1q0 j1q0Var) {
        this.f17103a = (byte) 24;
        vff0Var.getClass();
        j1q0Var.getClass();
        this.b = vff0Var;
        this.c = j1q0Var;
    }

    public jtj(igl iglVar, y5s y5sVar) {
        this.f17103a = (byte) 5;
        iglVar.getClass();
        y5sVar.getClass();
        this.b = iglVar;
        this.c = y5sVar;
    }

    public jtj(bek bekVar, nek nekVar, qu quVar, x20 x20Var) {
        this.f17103a = (byte) 7;
        this.b = quVar;
        this.c = x20Var;
    }

    public jtj(wyu wyuVar, ntu ntuVar) {
        this.f17103a = (byte) 17;
        wyuVar.getClass();
        this.b = wyuVar;
        this.c = ntuVar;
    }

    public jtj(gii0 gii0Var) {
        this.f17103a = (byte) 9;
        gii0Var.getClass();
        this.b = gii0Var;
        this.c = new yip(this, (byte) 1);
    }

    public jtj(fhj fhjVar, bwp bwpVar) {
        this.f17103a = (byte) 10;
        bwpVar.getClass();
        this.b = fhjVar;
        this.c = bwpVar;
    }

    public jtj(sb6 sb6Var, gst0 gst0Var) {
        this.f17103a = (byte) 18;
        gst0Var.getClass();
        this.b = sb6Var;
        this.c = gst0Var;
    }

    public jtj(pbt pbtVar, gst0 gst0Var) {
        this.f17103a = (byte) 19;
        pbtVar.getClass();
        gst0Var.getClass();
        this.b = pbtVar;
        this.c = gst0Var;
    }

    public jtj(dn0 dn0Var, mne mneVar) {
        this.f17103a = (byte) 26;
        dn0Var.getClass();
        this.b = dn0Var;
        this.c = mneVar;
    }

    public jtj(fhj fhjVar, wxs0 wxs0Var, btt0 btt0Var) {
        this.f17103a = (byte) 8;
        btt0Var.getClass();
        this.b = fhjVar;
        this.c = btt0Var;
    }

    public jtj(h7q h7qVar, uzc uzcVar) {
        this.f17103a = (byte) 27;
        h7qVar.getClass();
        this.b = h7qVar;
        this.c = uzcVar;
    }

    public jtj(String str) {
        this.f17103a = (byte) 11;
        this.b = str.concat(".lck");
    }
}
