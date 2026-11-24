package a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class syj {
    public static final ia80 k = new xcd(new l13((byte) 7));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dmo f33026a;
    public rsj b;
    public final Context c;
    public final pek0 d;
    public nyj e;
    public nyj f;
    public volatile Thread g;
    public o24 h;
    public m24 i;
    public Boolean j;

    public syj(Context context) {
        pek0 pek0Var = new pek0();
        nyj nyjVar = nyj.H;
        this.c = context != null ? context.getApplicationContext() : null;
        this.d = pek0Var;
        if (nyjVar == null) {
            nyjVar.getClass();
            myj myjVar = new myj(nyjVar);
            myjVar.c(nyjVar);
            nyjVar = new nyj(myjVar);
        }
        this.e = nyjVar;
        this.f = nyjVar;
        this.i = m24.b;
        if (nyjVar.C && context == null) {
            f1t0.g0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(sp20 sp20Var, nyj nyjVar, emo[] emoVarArr) {
        int i = sp20Var.f32571a;
        for (int i2 = 0; i2 < i; i2++) {
            dcs0 dcs0Var = sp20Var.c[i2];
            Map map = (Map) nyjVar.F.get(i2);
            if (map != null && map.containsKey(dcs0Var)) {
                Map map2 = (Map) nyjVar.F.get(i2);
                if (map2 != null && map2.get(dcs0Var) != null) {
                    hny.b();
                    return;
                }
                emoVarArr[i2] = null;
            }
        }
    }

    public static void b(sp20 sp20Var, nyj nyjVar, emo[] emoVarArr) {
        for (int i = 0; i < sp20Var.f32571a; i++) {
            int i2 = sp20Var.b[i];
            if (nyjVar.G.get(i) || nyjVar.x.contains(Integer.valueOf(i2))) {
                emoVarArr[i] = null;
            }
        }
    }

    public static void c(sp20 sp20Var, nyj nyjVar, emo[] emoVarArr) {
        int i = sp20Var.f32571a;
        dcs0[] dcs0VarArr = sp20Var.c;
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            d(dcs0VarArr[i2], nyjVar, map);
        }
        d(sp20Var.f, nyjVar, map);
        for (int i3 = 0; i3 < i; i3++) {
            pcs0 pcs0Var = (pcs0) map.get(Integer.valueOf(sp20Var.b[i3]));
            if (pcs0Var != null) {
                ccs0 ccs0Var = pcs0Var.f26775a;
                b4x b4xVar = pcs0Var.b;
                emoVarArr[i3] = (b4xVar.isEmpty() || dcs0VarArr[i3].b(ccs0Var) == -1) ? null : new emo(ccs0Var, n6x.m0(b4xVar));
            }
        }
    }

    public static void d(dcs0 dcs0Var, scs0 scs0Var, HashMap map) {
        for (int i = 0; i < dcs0Var.f5860a; i++) {
            pcs0 pcs0Var = (pcs0) scs0Var.w.get(dcs0Var.a(i));
            if (pcs0Var != null) {
                ccs0 ccs0Var = pcs0Var.f26775a;
                pcs0 pcs0Var2 = (pcs0) map.get(Integer.valueOf(ccs0Var.c));
                if (pcs0Var2 == null || (pcs0Var2.b.isEmpty() && !pcs0Var.b.isEmpty())) {
                    map.put(Integer.valueOf(ccs0Var.c), pcs0Var);
                }
            }
        }
    }

    public static Pair e(emo[] emoVarArr, int i) {
        for (int i2 = 0; i2 < emoVarArr.length; i2++) {
            emo emoVar = emoVarArr[i2];
            if (emoVar != null && emoVar.f8057a.c == i) {
                return Pair.create(emoVar, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static int f(androidx.media3.common.b bVar, b4x b4xVar) {
        for (int i = 0; i < b4xVar.size(); i++) {
            for (int i2 = 0; i2 < bVar.c.size(); i2++) {
                if (((uty) bVar.c.get(i2)).b.equals(b4xVar.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int g(androidx.media3.common.b bVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(bVar.d)) {
            return 4;
        }
        String strH = h(str);
        String strH2 = h(bVar.d);
        if (strH2 == null || strH == null) {
            return (z && strH2 == null) ? 1 : 0;
        }
        if (strH2.startsWith(strH) || strH.startsWith(strH2)) {
            return 3;
        }
        String str2 = vtt0.f38024a;
        return strH2.split("-", 2)[0].equals(strH.split("-", 2)[0]) ? 2 : 0;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    public static emo j(dcs0 dcs0Var, int[][] iArr, nyj nyjVar) {
        nyjVar.q.getClass();
        ccs0 ccs0Var = null;
        lyj lyjVar = null;
        int i = 0;
        for (int i2 = 0; i2 < dcs0Var.f5860a; i2++) {
            ccs0 ccs0VarA = dcs0Var.a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < ccs0VarA.f4128a; i3++) {
                if (j16.n(iArr2[i3], nyjVar.D)) {
                    lyj lyjVar2 = new lyj(ccs0VarA.d[i3], iArr2[i3]);
                    if (lyjVar != null) {
                        if (gdd.f11100a.c(lyjVar2.b, lyjVar.b).c(lyjVar2.f20864a, lyjVar.f20864a).e() > 0) {
                            ccs0Var = ccs0VarA;
                            i = i3;
                            lyjVar = lyjVar2;
                        }
                    } else {
                        ccs0Var = ccs0VarA;
                        i = i3;
                        lyjVar = lyjVar2;
                    }
                }
            }
        }
        if (ccs0Var == null) {
            return null;
        }
        return new emo(ccs0Var, i);
    }

    public static Pair k(int i, sp20 sp20Var, int[][][] iArr, pyj pyjVar, Comparator comparator) {
        int i2;
        RandomAccess randomAccessT;
        sp20 sp20Var2 = sp20Var;
        ArrayList arrayList = new ArrayList();
        int i3 = sp20Var2.f32571a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == sp20Var2.b[i4]) {
                dcs0 dcs0Var = sp20Var2.c[i4];
                for (int i5 = 0; i5 < dcs0Var.f5860a; i5++) {
                    ccs0 ccs0VarA = dcs0Var.a(i5);
                    rcf0 rcf0VarA = pyjVar.a(i4, ccs0VarA, iArr[i4][i5]);
                    int i6 = ccs0VarA.f4128a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        qyj qyjVar = (qyj) rcf0VarA.get(i7);
                        int iA = qyjVar.a();
                        if (zArr[i7] || iA == 0) {
                            i2 = i3;
                        } else {
                            if (iA == 1) {
                                randomAccessT = b4x.t(qyjVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(qyjVar);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    qyj qyjVar2 = (qyj) rcf0VarA.get(i8);
                                    int i9 = i3;
                                    if (qyjVar2.a() == 2 && qyjVar.b(qyjVar2)) {
                                        arrayList2.add(qyjVar2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccessT = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccessT);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            sp20Var2 = sp20Var;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((qyj) list.get(i10)).c;
        }
        qyj qyjVar3 = (qyj) list.get(0);
        return Pair.create(new emo(qyjVar3.b, iArr2), Integer.valueOf(qyjVar3.f29537a));
    }

    public final void i(scs0 scs0Var) {
        if (scs0Var == null) {
            return;
        }
        if (scs0Var instanceof nyj) {
            this.f = (nyj) scs0Var;
            return;
        }
        myj myjVar = new myj(this.f);
        myjVar.c(scs0Var);
        this.f = new nyj(myjVar);
    }

    public final void l(scs0 scs0Var) {
        if (scs0Var instanceof nyj) {
            m((nyj) scs0Var);
        }
        myj myjVar = new myj(this.e);
        myjVar.c(scs0Var);
        m(new nyj(myjVar));
    }

    public final void m(nyj nyjVar) {
        boolean zEquals = this.e.equals(nyjVar);
        this.e = nyjVar;
        if (zEquals) {
            return;
        }
        if (nyjVar.C && this.c == null) {
            f1t0.g0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        dmo dmoVar = this.f33026a;
        if (dmoVar != null) {
            dmoVar.g.c(10, nyjVar).b();
        }
    }
}
