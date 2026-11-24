package a;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class t3a implements lx9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ap f33257a;
    public final ap b;
    public final ipt0 c;
    public final h0a d;
    public final wy9 g;
    public wju0 h;
    public final hy9 k;
    public fot0 o;
    public qrm0 p;
    public final c5k q;
    public final c5k r;
    public final trm0 t;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public List i = Collections.EMPTY_LIST;
    public Range j = h55.h;
    public final Object l = new Object();
    public boolean m = true;
    public drd n = null;
    public final kd30 s = new kd30((byte) 27);

    public t3a(s0a s0aVar, s0a s0aVar2, zo zoVar, zo zoVar2, c5k c5kVar, c5k c5kVar2, wy9 wy9Var, trm0 trm0Var, ipt0 ipt0Var) {
        this.k = zoVar.c;
        this.f33257a = new ap(s0aVar, zoVar);
        if (s0aVar2 == null || zoVar2 == null) {
            this.b = null;
        } else {
            this.b = new ap(s0aVar2, zoVar2);
        }
        this.q = c5kVar;
        this.r = c5kVar2;
        this.g = wy9Var;
        this.c = ipt0Var;
        this.d = xf0.M(zoVar, zoVar2);
        this.t = trm0Var;
    }

    public static void B(HashMap map) {
        HashSet hashSet;
        for (Map.Entry entry : map.entrySet()) {
            fot0 fot0Var = (fot0) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                fot0Var.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            fot0Var.h = hashSet;
        }
    }

    public static ArrayList C(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fot0) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw rw2.h(it2);
            }
        }
        return arrayList2;
    }

    public static HashMap j(LinkedHashSet linkedHashSet, wsf0 wsf0Var) {
        HashMap map = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            fot0 fot0Var = (fot0) it.next();
            map.put(fot0Var, fot0Var.h);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = wsf0Var != null ? (LinkedHashSet) wsf0Var.b : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            fot0Var.h = hashSet;
        }
        return map;
    }

    public static Matrix t(Rect rect, Size size) {
        z1x.t("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static HashMap w(ArrayList arrayList, ipt0 ipt0Var, ipt0 ipt0Var2, Range range) {
        fpt0 fpt0VarG;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fot0 fot0Var = (fot0) it.next();
            if (fot0Var instanceof qrm0) {
                qrm0 qrm0Var = (qrm0) fot0Var;
                pub0 pub0Var = new pub0(b780.j(new gyw((byte) 2).b));
                w0x.t(pub0Var);
                oub0 oub0Var = new oub0(pub0Var);
                oub0Var.s = oub0.z;
                fpt0 fpt0VarG2 = oub0Var.g(false, ipt0Var);
                if (fpt0VarG2 == null) {
                    fpt0VarG = null;
                } else {
                    wy40 wy40VarP = wy40.p(fpt0VarG2);
                    wy40VarP.z(xto0.A0);
                    fpt0VarG = ((eyg0) qrm0Var.n(wy40VarP)).e();
                }
            } else {
                fpt0VarG = fot0Var.g(false, ipt0Var);
            }
            fpt0 fpt0VarG3 = fot0Var.g(true, ipt0Var2);
            wy40 wy40VarP2 = fpt0VarG3 != null ? wy40.p(fpt0VarG3) : wy40.l();
            wy40VarP2.y(fpt0.H0, 0);
            if (!h55.h.equals(range)) {
                wy40VarP2.x(fpt0.I0, crd.b, range);
                wy40VarP2.y(fpt0.J0, Boolean.TRUE);
            }
            fpt0 fpt0VarE = fot0Var.n(wy40VarP2).e();
            p3a p3aVar = new p3a();
            p3aVar.f26290a = fpt0VarG;
            p3aVar.b = fpt0VarE;
            map.put(fot0Var, p3aVar);
        }
        return map;
    }

    public final void A(ArrayList arrayList) {
        synchronized (this.l) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((fot0) it.next()).h = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.e);
            linkedHashSet.removeAll(arrayList);
            i(s(linkedHashSet, this.b != null));
        }
    }

    @Override // a.lx9
    public final j0a a() {
        return this.f33257a.b;
    }

    public final void c(Collection collection, wsf0 wsf0Var) {
        l8x.U("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + wsf0Var);
        synchronized (this.l) {
            try {
                ap apVar = this.f33257a;
                hy9 hy9Var = this.k;
                apVar.f(hy9Var);
                ap apVar2 = this.b;
                if (apVar2 != null) {
                    apVar2.f(hy9Var);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.e);
                linkedHashSet.addAll(collection);
                HashMap mapJ = j(linkedHashSet, wsf0Var);
                try {
                    i(s(linkedHashSet, this.b != null));
                } catch (IllegalArgumentException e) {
                    B(mapJ);
                    throw new n3a(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(kk9 kk9Var) {
        Map map = kk9Var.i.f32685a;
        ArrayList<fot0> arrayList = kk9Var.b;
        synchronized (this.l) {
            try {
                if (this.h != null && !arrayList.isEmpty()) {
                    boolean z = this.f33257a.b.f8539a.h() == 0;
                    Rect rectG = this.f33257a.b.f8539a.g();
                    wju0 wju0Var = this.h;
                    Rational rational = wju0Var.b;
                    int iB = this.f33257a.b.f8539a.B(wju0Var.c);
                    wju0 wju0Var2 = this.h;
                    HashMap mapX = j5n0.x(rectG, z, rational, iB, wju0Var2.f39281a, wju0Var2.d, map);
                    for (fot0 fot0Var : arrayList) {
                        Rect rect = (Rect) mapX.get(fot0Var);
                        rect.getClass();
                        fot0Var.C(rect);
                    }
                }
                for (fot0 fot0Var2 : arrayList) {
                    Rect rectG2 = this.f33257a.b.f8539a.g();
                    h55 h55Var = (h55) map.get(fot0Var2);
                    h55Var.getClass();
                    fot0Var2.B(t(rectG2, h55Var.f12463a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        List list = this.i;
        ArrayList arrayList2 = kk9Var.b;
        LinkedHashSet linkedHashSet = kk9Var.f18425a;
        ArrayList arrayListC = C(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList arrayListC2 = C(arrayList3, arrayListC);
        if (!arrayListC2.isEmpty()) {
            l8x.E0("CameraUseCaseAdapter", "Unused effects: " + arrayListC2);
        }
        Iterator it = kk9Var.e.iterator();
        while (it.hasNext()) {
            ((fot0) it.next()).D(this.f33257a);
        }
        this.f33257a.n(kk9Var.e);
        if (this.b != null) {
            for (fot0 fot0Var3 : kk9Var.e) {
                ap apVar = this.b;
                Objects.requireNonNull(apVar);
                fot0Var3.D(apVar);
            }
            ap apVar2 = this.b;
            Objects.requireNonNull(apVar2);
            apVar2.n(kk9Var.e);
        }
        if (kk9Var.e.isEmpty()) {
            for (fot0 fot0Var4 : kk9Var.d) {
                Map map2 = kk9Var.i.f32685a;
                if (map2.containsKey(fot0Var4)) {
                    h55 h55Var2 = (h55) map2.get(fot0Var4);
                    Objects.requireNonNull(h55Var2);
                    drd drdVar = h55Var2.f;
                    if (drdVar != null) {
                        xii0 xii0Var = fot0Var4.p;
                        b780 b780Var = xii0Var.g.b;
                        Objects.requireNonNull(drdVar);
                        if (drdVar.c().size() == xii0Var.g.b.c().size()) {
                            Iterator it2 = drdVar.c().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    u15 u15Var = (u15) it2.next();
                                    if (!b780Var.f2093a.containsKey(u15Var) || !Objects.equals(b780Var.d(u15Var), drdVar.d(u15Var))) {
                                    }
                                }
                            }
                        }
                        fot0Var4.j = fot0Var4.y(drdVar);
                        if (this.m) {
                            this.f33257a.i(fot0Var4);
                            ap apVar3 = this.b;
                            if (apVar3 != null) {
                                apVar3.i(fot0Var4);
                            }
                        }
                    }
                }
            }
        }
        for (fot0 fot0Var5 : kk9Var.c) {
            p3a p3aVar = (p3a) kk9Var.h.get(fot0Var5);
            Objects.requireNonNull(p3aVar);
            ap apVar4 = this.b;
            ap apVar5 = this.f33257a;
            fpt0 fpt0Var = p3aVar.f26290a;
            if (apVar4 != null) {
                fot0Var5.b(apVar5, apVar4, fpt0Var, p3aVar.b);
                h55 h55Var3 = (h55) kk9Var.i.f32685a.get(fot0Var5);
                h55Var3.getClass();
                srm0 srm0Var = kk9Var.j;
                srm0Var.getClass();
                fot0Var5.F(h55Var3, (h55) srm0Var.f32685a.get(fot0Var5));
            } else {
                fot0Var5.b(apVar5, null, fpt0Var, p3aVar.b);
                h55 h55Var4 = (h55) kk9Var.i.f32685a.get(fot0Var5);
                h55Var4.getClass();
                fot0Var5.F(h55Var4, null);
            }
        }
        if (this.m) {
            this.f33257a.o(kk9Var.c);
            ap apVar6 = this.b;
            if (apVar6 != null) {
                apVar6.o(kk9Var.c);
            }
        }
        Iterator it3 = kk9Var.c.iterator();
        while (it3.hasNext()) {
            ((fot0) it3.next()).s();
        }
        this.e.clear();
        this.e.addAll(kk9Var.f18425a);
        this.f.clear();
        this.f.addAll(kk9Var.b);
        this.o = kk9Var.g;
        this.p = kk9Var.f;
    }

    public final void l() {
        synchronized (this.l) {
            try {
                if (!this.m) {
                    if (!this.f.isEmpty()) {
                        this.f33257a.f(this.k);
                        ap apVar = this.b;
                        if (apVar != null) {
                            apVar.f(this.k);
                        }
                    }
                    this.f33257a.o(this.f);
                    ap apVar2 = this.b;
                    if (apVar2 != null) {
                        apVar2.o(this.f);
                    }
                    synchronized (this.l) {
                        try {
                            drd drdVar = this.n;
                            if (drdVar != null) {
                                this.f33257a.c.g(drdVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        ((fot0) it.next()).s();
                    }
                    this.m = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x02e9  */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015d, code lost:
    
        if (r3 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0163, code lost:
    
        return s(r25, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.kk9 s(java.util.LinkedHashSet r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.t3a.s(java.util.LinkedHashSet, boolean):a.kk9");
    }

    public final void u() {
        synchronized (this.l) {
            try {
                if (this.m) {
                    this.f33257a.n(new ArrayList(this.f));
                    ap apVar = this.b;
                    if (apVar != null) {
                        apVar.n(new ArrayList(this.f));
                    }
                    synchronized (this.l) {
                        yo yoVar = this.f33257a.c;
                        this.n = yoVar.b.f();
                        yoVar.i();
                    }
                    this.m = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int v() {
        boolean z;
        synchronized (this.l) {
            try {
                wy9 wy9Var = this.g;
                synchronized (wy9Var.b) {
                    z = wy9Var.f;
                }
                return z == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet x(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.l) {
            Iterator it = this.i.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i = z ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            fot0 fot0Var = (fot0) it2.next();
            z1x.t("Only support one level of sharing for now.", !(fot0Var instanceof qrm0));
            Iterator it3 = fot0Var.l().iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Integer) it3.next()).intValue();
                if ((i & iIntValue) == iIntValue) {
                    hashSet.add(fot0Var);
                    break;
                }
            }
        }
        return hashSet;
    }

    public final List y() {
        ArrayList arrayList;
        synchronized (this.l) {
            arrayList = new ArrayList(this.e);
        }
        return arrayList;
    }

    public final void z() {
        synchronized (this.l) {
            this.k.o();
        }
    }
}
