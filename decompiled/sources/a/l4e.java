package a;

import android.gov.nist.core.Separators;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l4e extends k4e {
    public int B0;
    public int C0;
    public int x0;
    public ArrayList u0 = new ArrayList();
    public phf0 v0 = new phf0(this);
    public h7k w0 = new h7k(this);
    public r96 y0 = null;
    public boolean z0 = false;
    public p900 A0 = new p900();
    public int D0 = 0;
    public int E0 = 0;
    public lbb[] F0 = new lbb[4];
    public lbb[] G0 = new lbb[4];
    public int H0 = 257;
    public boolean I0 = false;
    public boolean J0 = false;
    public WeakReference K0 = null;
    public WeakReference L0 = null;
    public WeakReference M0 = null;
    public WeakReference N0 = null;
    public HashSet O0 = new HashSet();
    public q96 P0 = new q96();

    public static void c0(k4e k4eVar, r96 r96Var, q96 q96Var) {
        int i;
        int i2;
        if (r96Var == null) {
            return;
        }
        int i3 = k4eVar.i0;
        int[] iArr = k4eVar.u;
        if (i3 == 8 || (k4eVar instanceof qiv) || (k4eVar instanceof zu5)) {
            q96Var.e = 0;
            q96Var.f = 0;
            return;
        }
        j4e[] j4eVarArr = k4eVar.U;
        q96Var.f28332a = j4eVarArr[0];
        q96Var.b = j4eVarArr[1];
        q96Var.c = k4eVar.s();
        q96Var.d = k4eVar.m();
        q96Var.i = false;
        q96Var.j = 0;
        j4e j4eVar = q96Var.f28332a;
        j4e j4eVar2 = j4e.c;
        boolean z = j4eVar == j4eVar2;
        boolean z2 = q96Var.b == j4eVar2;
        boolean z3 = z && k4eVar.Y > 0.0f;
        boolean z4 = z2 && k4eVar.Y > 0.0f;
        j4e j4eVar3 = j4e.b;
        j4e j4eVar4 = j4e.f15879a;
        if (z && k4eVar.v(0) && k4eVar.s == 0 && !z3) {
            q96Var.f28332a = j4eVar3;
            if (z2 && k4eVar.t == 0) {
                q96Var.f28332a = j4eVar4;
            }
            z = false;
        }
        if (z2 && k4eVar.v(1) && k4eVar.t == 0 && !z4) {
            q96Var.b = j4eVar3;
            if (z && k4eVar.s == 0) {
                q96Var.b = j4eVar4;
            }
            z2 = false;
        }
        if (k4eVar.C()) {
            q96Var.f28332a = j4eVar4;
            z = false;
        }
        if (k4eVar.D()) {
            q96Var.b = j4eVar4;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                q96Var.f28332a = j4eVar4;
            } else if (!z2) {
                if (q96Var.b == j4eVar4) {
                    i2 = q96Var.d;
                } else {
                    q96Var.f28332a = j4eVar3;
                    r96Var.b(k4eVar, q96Var);
                    i2 = q96Var.f;
                }
                q96Var.f28332a = j4eVar4;
                q96Var.c = (int) (k4eVar.Y * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                q96Var.b = j4eVar4;
            } else if (!z) {
                if (q96Var.f28332a == j4eVar4) {
                    i = q96Var.c;
                } else {
                    q96Var.b = j4eVar3;
                    r96Var.b(k4eVar, q96Var);
                    i = q96Var.e;
                }
                q96Var.b = j4eVar4;
                int i4 = k4eVar.Z;
                float f = k4eVar.Y;
                if (i4 == -1) {
                    q96Var.d = (int) (i / f);
                } else {
                    q96Var.d = (int) (f * i);
                }
            }
        }
        r96Var.b(k4eVar, q96Var);
        k4eVar.T(q96Var.e);
        k4eVar.O(q96Var.f);
        k4eVar.F = q96Var.h;
        k4eVar.K(q96Var.g);
        q96Var.j = 0;
    }

    @Override // a.k4e
    public final void E() {
        this.A0.t();
        this.B0 = 0;
        this.C0 = 0;
        this.u0.clear();
        super.E();
    }

    @Override // a.k4e
    public final void H(nr nrVar) {
        super.H(nrVar);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            ((k4e) this.u0.get(i)).H(nrVar);
        }
    }

    @Override // a.k4e
    public final void U(boolean z, boolean z2) {
        super.U(z, z2);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            ((k4e) this.u0.get(i)).U(z, z2);
        }
    }

    public final void W(k4e k4eVar) {
        this.u0.add(k4eVar);
        k4e k4eVar2 = k4eVar.V;
        if (k4eVar2 != null) {
            ((l4e) k4eVar2).u0.remove(k4eVar);
            k4eVar.E();
        }
        k4eVar.V = this;
    }

    public final void X(k4e k4eVar, int i) {
        if (i == 0) {
            int i2 = this.D0 + 1;
            lbb[] lbbVarArr = this.G0;
            if (i2 >= lbbVarArr.length) {
                lbbVarArr = (lbb[]) Arrays.copyOf(lbbVarArr, lbbVarArr.length * 2);
                this.G0 = lbbVarArr;
            }
            int i3 = this.D0;
            lbbVarArr[i3] = new lbb(k4eVar, 0, this.z0);
            this.D0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.E0 + 1;
            lbb[] lbbVarArr2 = this.F0;
            if (i4 >= lbbVarArr2.length) {
                lbbVarArr2 = (lbb[]) Arrays.copyOf(lbbVarArr2, lbbVarArr2.length * 2);
                this.F0 = lbbVarArr2;
            }
            int i5 = this.E0;
            lbbVarArr2[i5] = new lbb(k4eVar, 1, this.z0);
            this.E0 = i5 + 1;
        }
    }

    public final void Y(p900 p900Var) {
        l4e l4eVar;
        p900 p900Var2;
        HashSet hashSet = this.O0;
        boolean zD0 = d0(64);
        c(p900Var, zD0);
        int size = this.u0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            k4e k4eVar = (k4e) this.u0.get(i);
            boolean[] zArr = k4eVar.T;
            zArr[0] = false;
            zArr[1] = false;
            if (k4eVar instanceof zu5) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                k4e k4eVar2 = (k4e) this.u0.get(i2);
                if (k4eVar2 instanceof zu5) {
                    zu5 zu5Var = (zu5) k4eVar2;
                    for (int i3 = 0; i3 < zu5Var.v0; i3++) {
                        k4e k4eVar3 = zu5Var.u0[i3];
                        if (zu5Var.x0 || k4eVar3.d()) {
                            int i4 = zu5Var.w0;
                            if (i4 == 0 || i4 == 1) {
                                k4eVar3.T[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                k4eVar3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            k4e k4eVar4 = (k4e) this.u0.get(i5);
            k4eVar4.getClass();
            boolean z2 = k4eVar4 instanceof zru0;
            if (z2 || (k4eVar4 instanceof qiv)) {
                if (z2) {
                    hashSet.add(k4eVar4);
                } else {
                    k4eVar4.c(p900Var, zD0);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                zru0 zru0Var = (zru0) ((k4e) it.next());
                for (int i6 = 0; i6 < zru0Var.v0; i6++) {
                    if (hashSet.contains(zru0Var.u0[i6])) {
                        zru0Var.c(p900Var, zD0);
                        hashSet.remove(zru0Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((k4e) it2.next()).c(p900Var, zD0);
                }
                hashSet.clear();
            }
        }
        boolean z3 = p900.q;
        j4e j4eVar = j4e.b;
        if (z3) {
            HashSet<k4e> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                k4e k4eVar5 = (k4e) this.u0.get(i7);
                k4eVar5.getClass();
                if (!(k4eVar5 instanceof zru0) && !(k4eVar5 instanceof qiv)) {
                    hashSet2.add(k4eVar5);
                }
            }
            l4eVar = this;
            p900Var2 = p900Var;
            l4eVar.b(this, p900Var2, hashSet2, this.U[0] == j4eVar ? 0 : 1, false);
            for (k4e k4eVar6 : hashSet2) {
                f1t0.M(l4eVar, p900Var2, k4eVar6);
                k4eVar6.c(p900Var2, zD0);
            }
        } else {
            l4eVar = this;
            p900Var2 = p900Var;
            for (int i8 = 0; i8 < size; i8++) {
                k4e k4eVar7 = (k4e) l4eVar.u0.get(i8);
                if (k4eVar7 instanceof l4e) {
                    j4e[] j4eVarArr = k4eVar7.U;
                    j4e j4eVar2 = j4eVarArr[0];
                    j4e j4eVar3 = j4eVarArr[1];
                    j4e j4eVar4 = j4e.f15879a;
                    if (j4eVar2 == j4eVar) {
                        k4eVar7.P(j4eVar4);
                    }
                    if (j4eVar3 == j4eVar) {
                        k4eVar7.R(j4eVar4);
                    }
                    k4eVar7.c(p900Var2, zD0);
                    if (j4eVar2 == j4eVar) {
                        k4eVar7.P(j4eVar2);
                    }
                    if (j4eVar3 == j4eVar) {
                        k4eVar7.R(j4eVar3);
                    }
                } else {
                    f1t0.M(l4eVar, p900Var2, k4eVar7);
                    if (!(k4eVar7 instanceof zru0) && !(k4eVar7 instanceof qiv)) {
                        k4eVar7.c(p900Var2, zD0);
                    }
                }
            }
        }
        if (l4eVar.D0 > 0) {
            cfx0.A(l4eVar, p900Var2, null, 0);
        }
        if (l4eVar.E0 > 0) {
            cfx0.A(l4eVar, p900Var2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    public final boolean Z(int i, boolean z) {
        boolean z2;
        j4e j4eVar;
        h7k h7kVar = this.w0;
        ArrayList<hev0> arrayList = (ArrayList) h7kVar.f;
        l4e l4eVar = (l4e) h7kVar.d;
        boolean z3 = false;
        j4e j4eVarL = l4eVar.l(0);
        j4e j4eVarL2 = l4eVar.l(1);
        int iT = l4eVar.t();
        int iU = l4eVar.u();
        j4e j4eVar2 = j4e.f15879a;
        if (z && (j4eVarL == (j4eVar = j4e.b) || j4eVarL2 == j4eVar)) {
            for (hev0 hev0Var : arrayList) {
                if (hev0Var.f == i && !hev0Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && j4eVarL == j4eVar) {
                    l4eVar.P(j4eVar2);
                    l4eVar.T(h7kVar.d(l4eVar, 0));
                    l4eVar.d.e.d(l4eVar.s());
                }
            } else if (z && j4eVarL2 == j4eVar) {
                l4eVar.R(j4eVar2);
                l4eVar.O(h7kVar.d(l4eVar, 1));
                l4eVar.e.e.d(l4eVar.m());
            }
        }
        j4e[] j4eVarArr = l4eVar.U;
        j4e j4eVar3 = j4e.d;
        if (i == 0) {
            j4e j4eVar4 = j4eVarArr[0];
            if (j4eVar4 == j4eVar2 || j4eVar4 == j4eVar3) {
                int iS = l4eVar.s() + iT;
                l4eVar.d.i.d(iS);
                l4eVar.d.e.d(iS - iT);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            j4e j4eVar5 = j4eVarArr[1];
            if (j4eVar5 == j4eVar2 || j4eVar5 == j4eVar3) {
                int iM = l4eVar.m() + iU;
                l4eVar.e.i.d(iM);
                l4eVar.e.e.d(iM - iU);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        h7kVar.w();
        for (hev0 hev0Var2 : arrayList) {
            if (hev0Var2.f == i && (hev0Var2.b != l4eVar || hev0Var2.g)) {
                hev0Var2.e();
            }
        }
        for (hev0 hev0Var3 : arrayList) {
            if (hev0Var3.f == i && (z2 || hev0Var3.b != l4eVar)) {
                if (!hev0Var3.h.j || !hev0Var3.i.j || (!(hev0Var3 instanceof nbb) && !hev0Var3.e.j)) {
                    l4eVar.P(j4eVarL);
                    l4eVar.R(j4eVarL2);
                    return z3;
                }
            }
        }
        z3 = true;
        l4eVar.P(j4eVarL);
        l4eVar.R(j4eVarL2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:362:0x0644  */
    /* JADX WARN: Code duplicated, block: B:365:0x0650  */
    /* JADX WARN: Code duplicated, block: B:370:0x0661  */
    /* JADX WARN: Code duplicated, block: B:373:0x0667  */
    /* JADX WARN: Code duplicated, block: B:374:0x066e  */
    /* JADX WARN: Code duplicated, block: B:380:0x0679  */
    /* JADX WARN: Code duplicated, block: B:384:0x0688  */
    /* JADX WARN: Code duplicated, block: B:386:0x068e  */
    /* JADX WARN: Code duplicated, block: B:391:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:397:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:401:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:404:0x06cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:406:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:409:0x06da  */
    /* JADX WARN: Code duplicated, block: B:413:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:416:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:418:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:422:0x0706  */
    /* JADX WARN: Code duplicated, block: B:427:0x071a A[Catch: Exception -> 0x0728, LOOP:12: B:426:0x0718->B:427:0x071a, LOOP_END, TryCatch #4 {Exception -> 0x0728, blocks: (B:425:0x0710, B:427:0x071a, B:430:0x072f), top: B:560:0x0710 }] */
    /* JADX WARN: Code duplicated, block: B:433:0x0736 A[Catch: Exception -> 0x076b, TryCatch #1 {Exception -> 0x076b, blocks: (B:431:0x0732, B:433:0x0736, B:435:0x073c), top: B:554:0x0732 }] */
    /* JADX WARN: Code duplicated, block: B:451:0x076d  */
    /* JADX WARN: Code duplicated, block: B:454:0x0773 A[Catch: Exception -> 0x075b, TryCatch #0 {Exception -> 0x075b, blocks: (B:440:0x0754, B:452:0x076f, B:454:0x0773, B:456:0x0779, B:457:0x0793, B:459:0x0797, B:461:0x079d, B:465:0x07b3, B:468:0x07be, B:470:0x07c2, B:472:0x07c8), top: B:552:0x0754 }] */
    /* JADX WARN: Code duplicated, block: B:459:0x0797 A[Catch: Exception -> 0x075b, TryCatch #0 {Exception -> 0x075b, blocks: (B:440:0x0754, B:452:0x076f, B:454:0x0773, B:456:0x0779, B:457:0x0793, B:459:0x0797, B:461:0x079d, B:465:0x07b3, B:468:0x07be, B:470:0x07c2, B:472:0x07c8), top: B:552:0x0754 }] */
    /* JADX WARN: Code duplicated, block: B:470:0x07c2 A[Catch: Exception -> 0x075b, TryCatch #0 {Exception -> 0x075b, blocks: (B:440:0x0754, B:452:0x076f, B:454:0x0773, B:456:0x0779, B:457:0x0793, B:459:0x0797, B:461:0x079d, B:465:0x07b3, B:468:0x07be, B:470:0x07c2, B:472:0x07c8), top: B:552:0x0754 }] */
    /* JADX WARN: Code duplicated, block: B:484:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:491:0x0814  */
    /* JADX WARN: Code duplicated, block: B:493:0x082d  */
    /* JADX WARN: Code duplicated, block: B:495:0x0843  */
    /* JADX WARN: Code duplicated, block: B:497:0x0847  */
    /* JADX WARN: Code duplicated, block: B:500:0x0852  */
    /* JADX WARN: Code duplicated, block: B:502:0x0859 A[LOOP:15: B:501:0x0857->B:502:0x0859, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:506:0x086c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:522:0x08e1 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:525:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:528:0x0913  */
    /* JADX WARN: Code duplicated, block: B:529:0x091f  */
    /* JADX WARN: Code duplicated, block: B:531:0x0922  */
    /* JADX WARN: Code duplicated, block: B:533:0x092a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:536:0x0932  */
    /* JADX WARN: Code duplicated, block: B:539:0x0944 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:543:0x095a A[PHI: r14 r24
  0x095a: PHI (r14v9 ??) = (r14v8 ??), (r14v13 ??), (r14v13 ??), (r14v13 ??) binds: [B:530:0x0920, B:538:0x0942, B:539:0x0944, B:541:0x094a] A[DONT_GENERATE, DONT_INLINE]
  0x095a: PHI (r24v6 boolean) = (r24v5 boolean), (r24v7 boolean), (r24v7 boolean), (r24v7 boolean) binds: [B:530:0x0920, B:538:0x0942, B:539:0x0944, B:541:0x094a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:545:0x0960  */
    /* JADX WARN: Code duplicated, block: B:549:0x0972  */
    /* JADX WARN: Code duplicated, block: B:618:0x06fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x0961 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x065b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x064a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v104 */
    /* JADX WARN: Type inference failed for: r14v105 */
    /* JADX WARN: Type inference failed for: r14v106 */
    /* JADX WARN: Type inference failed for: r14v107 */
    /* JADX WARN: Type inference failed for: r14v108 */
    /* JADX WARN: Type inference failed for: r14v109 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r14v97 */
    /* JADX WARN: Type inference failed for: r14v98 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r34v0, types: [a.k4e, a.l4e] */
    public final void a0() {
        w2e w2eVar;
        w2e w2eVar2;
        p900 p900Var;
        int i;
        boolean z;
        boolean z2;
        char c;
        j4e[] j4eVarArr;
        boolean z3;
        int i2;
        boolean zD0;
        boolean z4;
        int i3;
        ?? r14;
        boolean z5;
        int i4;
        boolean z6;
        boolean z7;
        ?? r26;
        int i5;
        boolean z8;
        int i6;
        boolean z9;
        int iMax;
        boolean z10;
        int iMax2;
        ?? r13;
        ?? r15;
        int i7;
        ?? r16;
        boolean zD1;
        int size;
        int i8;
        boolean z11;
        k4e k4eVar;
        ?? r17;
        int i9;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        w2e w2eVar3;
        k4e k4eVar2;
        ydv0 ydv0Var;
        int i10;
        ydv0 ydv0Var2;
        int i11;
        int iM;
        int i12;
        int iB;
        int i13;
        ArrayList arrayList;
        ydv0 ydv0Var3;
        ydv0 ydv0Var4;
        boolean z12;
        ArrayList arrayList2;
        int i14;
        w2e w2eVar4;
        boolean[] zArr = f1t0.h;
        p900 p900Var2 = this.A0;
        this.a0 = 0;
        this.b0 = 0;
        this.I0 = false;
        this.J0 = false;
        int size2 = this.u0.size();
        int iMax3 = Math.max(0, s());
        int iMax4 = Math.max(0, m());
        j4e[] j4eVarArr2 = this.U;
        j4e j4eVar = j4eVarArr2[1];
        j4e j4eVar2 = j4eVarArr2[0];
        int i15 = this.x0;
        j4e j4eVar3 = j4e.c;
        w2e w2eVar5 = this.K;
        w2e w2eVar6 = this.J;
        j4e j4eVar4 = j4e.f15879a;
        if (i15 == 0 && f1t0.S(this.H0, 1)) {
            r96 r96Var = this.y0;
            j4e[] j4eVarArr3 = this.U;
            int i16 = 1;
            j4e j4eVar5 = j4eVarArr3[0];
            j4e j4eVar6 = j4eVarArr3[1];
            G();
            ArrayList arrayList3 = this.u0;
            int size3 = arrayList3.size();
            for (int i17 = 0; i17 < size3; i17++) {
                ((k4e) arrayList3.get(i17)).G();
            }
            boolean z13 = this.z0;
            if (j4eVar5 == j4eVar4) {
                M(0, s());
            } else {
                w2eVar6.l(0);
                this.a0 = 0;
            }
            boolean z14 = false;
            int i18 = 0;
            boolean z15 = false;
            while (i18 < size3) {
                boolean z16 = z14;
                k4e k4eVar3 = (k4e) arrayList3.get(i18);
                int i19 = i18;
                if (k4eVar3 instanceof qiv) {
                    qiv qivVar = (qiv) k4eVar3;
                    w2eVar4 = w2eVar6;
                    if (qivVar.y0 == i16) {
                        int i20 = qivVar.v0;
                        if (i20 != -1) {
                            qivVar.W(i20);
                        } else if (qivVar.w0 != -1 && C()) {
                            qivVar.W(s() - qivVar.w0);
                        } else if (C()) {
                            qivVar.W((int) ((qivVar.u0 * s()) + 0.5f));
                        }
                        z16 = true;
                    }
                } else {
                    w2eVar4 = w2eVar6;
                    if ((k4eVar3 instanceof zu5) && ((zu5) k4eVar3).a0() == 0) {
                        z14 = z16;
                        z15 = true;
                    }
                    i18 = i19 + 1;
                    w2eVar6 = w2eVar4;
                    i16 = 1;
                }
                z14 = z16;
                i18 = i19 + 1;
                w2eVar6 = w2eVar4;
                i16 = 1;
            }
            w2eVar = w2eVar6;
            if (z14) {
                for (int i21 = 0; i21 < size3; i21 = i14 + 1) {
                    k4e k4eVar4 = (k4e) arrayList3.get(i21);
                    if (k4eVar4 instanceof qiv) {
                        qiv qivVar2 = (qiv) k4eVar4;
                        i14 = i21;
                        if (qivVar2.y0 == 1) {
                            aad.P(0, r96Var, qivVar2, z13);
                        }
                    } else {
                        i14 = i21;
                    }
                }
            }
            aad.P(0, r96Var, this, z13);
            if (z15) {
                for (int i22 = 0; i22 < size3; i22++) {
                    k4e k4eVar5 = (k4e) arrayList3.get(i22);
                    if (k4eVar5 instanceof zu5) {
                        zu5 zu5Var = (zu5) k4eVar5;
                        if (zu5Var.a0() == 0 && zu5Var.Z()) {
                            aad.P(1, r96Var, zu5Var, z13);
                        }
                    }
                }
            }
            if (j4eVar6 == j4eVar4) {
                N(0, m());
            } else {
                w2eVar5.l(0);
                this.b0 = 0;
            }
            int i23 = 0;
            boolean z17 = false;
            boolean z18 = false;
            while (i23 < size3) {
                k4e k4eVar6 = (k4e) arrayList3.get(i23);
                int i24 = i23;
                if (k4eVar6 instanceof qiv) {
                    qiv qivVar3 = (qiv) k4eVar6;
                    if (qivVar3.y0 == 0) {
                        int i25 = qivVar3.v0;
                        if (i25 != -1) {
                            qivVar3.W(i25);
                        } else if (qivVar3.w0 != -1 && D()) {
                            qivVar3.W(m() - qivVar3.w0);
                        } else if (D()) {
                            qivVar3.W((int) ((qivVar3.u0 * m()) + 0.5f));
                        }
                        z17 = true;
                    }
                } else if ((k4eVar6 instanceof zu5) && ((zu5) k4eVar6).a0() == 1) {
                    z18 = true;
                }
                i23 = i24 + 1;
            }
            if (z17) {
                for (int i26 = 0; i26 < size3; i26++) {
                    k4e k4eVar7 = (k4e) arrayList3.get(i26);
                    if (k4eVar7 instanceof qiv) {
                        qiv qivVar4 = (qiv) k4eVar7;
                        if (qivVar4.y0 == 0) {
                            aad.g0(1, r96Var, qivVar4);
                        }
                    }
                }
            }
            aad.g0(0, r96Var, this);
            if (z18) {
                for (int i27 = 0; i27 < size3; i27++) {
                    k4e k4eVar8 = (k4e) arrayList3.get(i27);
                    if (k4eVar8 instanceof zu5) {
                        zu5 zu5Var2 = (zu5) k4eVar8;
                        if (zu5Var2.a0() == 1 && zu5Var2.Z()) {
                            aad.g0(1, r96Var, zu5Var2);
                        }
                    }
                }
            }
            for (int i28 = 0; i28 < size3; i28++) {
                k4e k4eVar9 = (k4e) arrayList3.get(i28);
                if (k4eVar9.B() && aad.I(k4eVar9)) {
                    c0(k4eVar9, r96Var, aad.k);
                    if (!(k4eVar9 instanceof qiv)) {
                        aad.P(0, r96Var, k4eVar9, z13);
                        aad.g0(0, r96Var, k4eVar9);
                    } else if (((qiv) k4eVar9).y0 == 0) {
                        aad.g0(0, r96Var, k4eVar9);
                    } else {
                        aad.P(0, r96Var, k4eVar9, z13);
                    }
                }
            }
            for (int i29 = 0; i29 < size2; i29++) {
                k4e k4eVar10 = (k4e) this.u0.get(i29);
                if (k4eVar10.B() && !(k4eVar10 instanceof qiv) && !(k4eVar10 instanceof zu5) && !(k4eVar10 instanceof zru0) && !k4eVar10.G) {
                    j4e j4eVarL = k4eVar10.l(0);
                    j4e j4eVarL2 = k4eVar10.l(1);
                    if (j4eVarL != j4eVar3 || k4eVar10.s == 1 || j4eVarL2 != j4eVar3 || k4eVar10.t == 1) {
                        c0(k4eVar10, this.y0, new q96());
                    }
                }
            }
        } else {
            p900Var2 = p900Var2;
            w2eVar = w2eVar6;
        }
        j4e j4eVar7 = j4e.b;
        if (size2 <= 2 || !((j4eVar2 == j4eVar7 || j4eVar == j4eVar7) && f1t0.S(this.H0, 1024))) {
            w2eVar2 = w2eVar5;
            p900Var = p900Var2;
        } else {
            r96 r96Var2 = this.y0;
            ArrayList arrayList4 = this.u0;
            int size4 = arrayList4.size();
            int i30 = 0;
            while (true) {
                if (i30 < size4) {
                    k4e k4eVar11 = (k4e) arrayList4.get(i30);
                    j4e[] j4eVarArr4 = this.U;
                    j4e j4eVar8 = j4eVarArr4[0];
                    j4e j4eVar9 = j4eVarArr4[1];
                    int i31 = i30;
                    j4e[] j4eVarArr5 = k4eVar11.U;
                    w2eVar2 = w2eVar5;
                    if (lmc.c0(j4eVar8, j4eVar9, j4eVarArr5[0], j4eVarArr5[1]) && !(k4eVar11 instanceof hmq)) {
                        i30 = i31 + 1;
                        w2eVar5 = w2eVar2;
                    }
                } else {
                    w2eVar2 = w2eVar5;
                    int i32 = 0;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    while (i32 < size4) {
                        int i33 = i32;
                        k4e k4eVar12 = (k4e) arrayList4.get(i32);
                        ArrayList arrayList11 = arrayList5;
                        j4e[] j4eVarArr6 = this.U;
                        j4e j4eVar10 = j4eVarArr6[0];
                        ArrayList arrayList12 = arrayList6;
                        j4e j4eVar11 = j4eVarArr6[1];
                        ArrayList arrayList13 = arrayList7;
                        j4e[] j4eVarArr7 = k4eVar12.U;
                        ArrayList arrayList14 = arrayList8;
                        if (!lmc.c0(j4eVar10, j4eVar11, j4eVarArr7[0], j4eVarArr7[1])) {
                            c0(k4eVar12, r96Var2, this.P0);
                        }
                        boolean z19 = k4eVar12 instanceof qiv;
                        if (z19) {
                            qiv qivVar5 = (qiv) k4eVar12;
                            if (qivVar5.y0 == 0) {
                                arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList7.add(qivVar5);
                            } else {
                                arrayList7 = arrayList13;
                            }
                            z12 = z19;
                            if (qivVar5.y0 == 1) {
                                arrayList2 = arrayList11 == null ? new ArrayList() : arrayList11;
                                arrayList2.add(qivVar5);
                            } else {
                                arrayList2 = arrayList11;
                            }
                        } else {
                            z12 = z19;
                            arrayList2 = arrayList11;
                            arrayList7 = arrayList13;
                        }
                        if (!(k4eVar12 instanceof jvv)) {
                            arrayList6 = arrayList12;
                            arrayList8 = arrayList14;
                        } else if (k4eVar12 instanceof zu5) {
                            zu5 zu5Var3 = (zu5) k4eVar12;
                            if (zu5Var3.a0() == 0) {
                                ArrayList arrayList15 = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList15.add(zu5Var3);
                                arrayList12 = arrayList15;
                            }
                            if (zu5Var3.a0() == 1) {
                                arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList8.add(zu5Var3);
                            } else {
                                arrayList8 = arrayList14;
                            }
                            arrayList6 = arrayList12;
                        } else {
                            jvv jvvVar = (jvv) k4eVar12;
                            arrayList6 = arrayList12 == null ? new ArrayList() : arrayList12;
                            arrayList6.add(jvvVar);
                            arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                            arrayList8.add(jvvVar);
                        }
                        if (k4eVar12.J.f == null && k4eVar12.L.f == null && !z12 && !(k4eVar12 instanceof zu5)) {
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                            }
                            ArrayList arrayList16 = arrayList9;
                            arrayList16.add(k4eVar12);
                            arrayList9 = arrayList16;
                        }
                        if (k4eVar12.K.f == null && k4eVar12.M.f == null && k4eVar12.N.f == null && !z12 && !(k4eVar12 instanceof zu5)) {
                            if (arrayList10 == null) {
                                arrayList10 = new ArrayList();
                            }
                            ArrayList arrayList17 = arrayList10;
                            arrayList17.add(k4eVar12);
                            arrayList10 = arrayList17;
                        }
                        i32 = i33 + 1;
                        arrayList5 = arrayList2;
                    }
                    ArrayList arrayList18 = arrayList5;
                    ArrayList<jvv> arrayList19 = arrayList6;
                    ArrayList arrayList20 = arrayList7;
                    ArrayList<jvv> arrayList21 = arrayList8;
                    ArrayList<ydv0> arrayList22 = new ArrayList();
                    if (arrayList18 != null) {
                        Iterator it = arrayList18.iterator();
                        while (it.hasNext()) {
                            lmc.H((qiv) it.next(), 0, arrayList22, null);
                        }
                    }
                    ydv0 ydv0Var5 = null;
                    int i34 = 0;
                    if (arrayList19 != null) {
                        for (jvv jvvVar2 : arrayList19) {
                            ydv0 ydv0VarH = lmc.H(jvvVar2, i34, arrayList22, ydv0Var5);
                            jvvVar2.X(i34, ydv0VarH, arrayList22);
                            ydv0VarH.a(arrayList22);
                            ydv0Var5 = null;
                            i34 = 0;
                        }
                    }
                    HashSet hashSet = k(2).f38443a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            lmc.H(((w2e) it2.next()).d, 0, arrayList22, null);
                        }
                    }
                    HashSet hashSet2 = k(4).f38443a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            lmc.H(((w2e) it3.next()).d, 0, arrayList22, null);
                        }
                    }
                    HashSet hashSet3 = k(7).f38443a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            lmc.H(((w2e) it4.next()).d, 0, arrayList22, null);
                        }
                    }
                    ydv0 ydv0Var6 = null;
                    if (arrayList9 != null) {
                        Iterator it5 = arrayList9.iterator();
                        while (it5.hasNext()) {
                            lmc.H((k4e) it5.next(), 0, arrayList22, null);
                        }
                    }
                    if (arrayList20 != null) {
                        Iterator it6 = arrayList20.iterator();
                        while (it6.hasNext()) {
                            lmc.H((qiv) it6.next(), 1, arrayList22, null);
                        }
                    }
                    int i35 = 1;
                    if (arrayList21 != null) {
                        for (jvv jvvVar3 : arrayList21) {
                            ydv0 ydv0VarH2 = lmc.H(jvvVar3, i35, arrayList22, ydv0Var6);
                            jvvVar3.X(i35, ydv0VarH2, arrayList22);
                            ydv0VarH2.a(arrayList22);
                            ydv0Var6 = null;
                            i35 = 1;
                        }
                    }
                    HashSet hashSet4 = k(3).f38443a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            lmc.H(((w2e) it7.next()).d, 1, arrayList22, null);
                        }
                    }
                    HashSet hashSet5 = k(6).f38443a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            lmc.H(((w2e) it8.next()).d, 1, arrayList22, null);
                        }
                    }
                    HashSet hashSet6 = k(5).f38443a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            lmc.H(((w2e) it9.next()).d, 1, arrayList22, null);
                        }
                    }
                    HashSet hashSet7 = k(7).f38443a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            lmc.H(((w2e) it10.next()).d, 1, arrayList22, null);
                        }
                    }
                    char c2 = 1;
                    if (arrayList10 != null) {
                        Iterator it11 = arrayList10.iterator();
                        while (it11.hasNext()) {
                            lmc.H((k4e) it11.next(), 1, arrayList22, null);
                        }
                    }
                    int i36 = 0;
                    while (i36 < size4) {
                        k4e k4eVar13 = (k4e) arrayList4.get(i36);
                        j4e[] j4eVarArr8 = k4eVar13.U;
                        if (j4eVarArr8[0] == j4eVar3 && j4eVarArr8[c2] == j4eVar3) {
                            int i37 = k4eVar13.s0;
                            int size5 = arrayList22.size();
                            int i38 = 0;
                            while (true) {
                                if (i38 >= size5) {
                                    i13 = i36;
                                    arrayList = arrayList4;
                                    ydv0Var3 = null;
                                    break;
                                }
                                i13 = i36;
                                ydv0Var3 = (ydv0) arrayList22.get(i38);
                                arrayList = arrayList4;
                                if (i37 == ydv0Var3.b) {
                                    break;
                                }
                                i38++;
                                arrayList4 = arrayList;
                                i36 = i13;
                            }
                            int i39 = k4eVar13.t0;
                            int size6 = arrayList22.size();
                            int i40 = 0;
                            while (true) {
                                if (i40 >= size6) {
                                    ydv0Var4 = null;
                                    break;
                                }
                                ydv0Var4 = (ydv0) arrayList22.get(i40);
                                if (i39 == ydv0Var4.b) {
                                    break;
                                } else {
                                    i40++;
                                }
                            }
                            if (ydv0Var3 != null && ydv0Var4 != null) {
                                ydv0Var3.c(0, ydv0Var4);
                                ydv0Var4.c = 2;
                                arrayList22.remove(ydv0Var3);
                            }
                        } else {
                            i13 = i36;
                            arrayList = arrayList4;
                        }
                        i36 = i13 + 1;
                        arrayList4 = arrayList;
                        c2 = 1;
                    }
                    if (arrayList22.size() > 1) {
                        int i41 = 0;
                        if (this.U[0] == j4eVar7) {
                            int i42 = 0;
                            ydv0Var = null;
                            for (ydv0 ydv0Var7 : arrayList22) {
                                if (ydv0Var7.c != 1) {
                                    p900 p900Var3 = p900Var2;
                                    int iB2 = ydv0Var7.b(p900Var3, i41);
                                    if (iB2 > i42) {
                                        ydv0Var = ydv0Var7;
                                        i42 = iB2;
                                    }
                                    p900Var2 = p900Var3;
                                    i41 = 0;
                                }
                            }
                            p900Var = p900Var2;
                            if (ydv0Var != null) {
                                P(j4eVar4);
                                T(i42);
                            }
                            i10 = 1;
                            if (this.U[1] == j4eVar7) {
                                i12 = 0;
                                ydv0Var2 = null;
                                for (ydv0 ydv0Var8 : arrayList22) {
                                    if (ydv0Var8.c != 0) {
                                        iB = ydv0Var8.b(p900Var, i10);
                                        if (iB > i12) {
                                            ydv0Var2 = ydv0Var8;
                                            i12 = iB;
                                        }
                                        i10 = 1;
                                    }
                                }
                                if (ydv0Var2 != null) {
                                    R(j4eVar4);
                                    O(i12);
                                } else {
                                    ydv0Var2 = null;
                                }
                            } else {
                                ydv0Var2 = null;
                            }
                            if (ydv0Var == null || ydv0Var2 != null) {
                                if (j4eVar2 == j4eVar7) {
                                    if (iMax3 < s() || iMax3 <= 0) {
                                        iMax3 = s();
                                    } else {
                                        T(iMax3);
                                        this.I0 = true;
                                    }
                                }
                                if (j4eVar == j4eVar7) {
                                    i11 = iMax4;
                                    if (i11 < m() || i11 <= 0) {
                                        iM = m();
                                    } else {
                                        O(i11);
                                        this.J0 = true;
                                    }
                                    iMax4 = iM;
                                    i = iMax3;
                                    z = true;
                                } else {
                                    i11 = iMax4;
                                }
                                iM = i11;
                                iMax4 = iM;
                                i = iMax3;
                                z = true;
                            }
                            if (!d0(64) || d0(128)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            p900Var.getClass();
                            p900Var.h = false;
                            if (this.H0 == 0 && z2) {
                                c = 1;
                                p900Var.h = true;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList23 = this.u0;
                            j4eVarArr = this.U;
                            if (j4eVarArr[0] != j4eVar7 || j4eVarArr[c] == j4eVar7) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.D0 = 0;
                            this.E0 = 0;
                            for (i2 = 0; i2 < size2; i2++) {
                                k4eVar2 = (k4e) this.u0.get(i2);
                                if (k4eVar2 instanceof l4e) {
                                    ((l4e) k4eVar2).a0();
                                }
                            }
                            zD0 = d0(64);
                            z4 = z;
                            i3 = 0;
                            r14 = 1;
                            while (r14 != 0) {
                                i4 = i3 + 1;
                                try {
                                    p900Var.t();
                                    z6 = z3;
                                    try {
                                        this.D0 = 0;
                                        this.E0 = 0;
                                        i(p900Var);
                                        for (i9 = 0; i9 < size2; i9++) {
                                            ((k4e) this.u0.get(i9)).i(p900Var);
                                        }
                                        Y(p900Var);
                                        try {
                                            weakReference = this.K0;
                                            if (weakReference != null || weakReference.get() == null) {
                                                z7 = z4;
                                            } else {
                                                w2e w2eVar7 = w2eVar2;
                                                try {
                                                    try {
                                                        w2eVar2 = w2eVar7;
                                                        z7 = z4;
                                                        try {
                                                            p900Var.f(p900Var.k((w2e) this.K0.get()), p900Var.k(w2eVar7), 0, 5);
                                                            this.K0 = null;
                                                        } catch (Exception e) {
                                                            e = e;
                                                            r17 = 1;
                                                            e.printStackTrace();
                                                            r26 = r17;
                                                            System.out.println("EXCEPTION : " + e);
                                                            if (r26 != 0) {
                                                                zArr[2] = false;
                                                                zD1 = d0(64);
                                                                V(p900Var, zD1);
                                                                size = this.u0.size();
                                                                i8 = 0;
                                                                z11 = false;
                                                                while (i8 < size) {
                                                                    int i43 = size;
                                                                    k4eVar = (k4e) this.u0.get(i8);
                                                                    k4eVar.V(p900Var, zD1);
                                                                    boolean z20 = zD1;
                                                                    int i44 = i8;
                                                                    if (k4eVar.h == -1) {
                                                                        z11 = true;
                                                                    } else {
                                                                        z11 = true;
                                                                    }
                                                                    i8 = i44 + 1;
                                                                    size = i43;
                                                                    zD1 = z20;
                                                                    z11 = z11;
                                                                }
                                                                z8 = z11;
                                                            } else {
                                                                V(p900Var, zD0);
                                                                for (i5 = 0; i5 < size2; i5++) {
                                                                    ((k4e) this.u0.get(i5)).V(p900Var, zD0);
                                                                }
                                                                z8 = false;
                                                            }
                                                            if (z6) {
                                                                i6 = size2;
                                                                z9 = zD0;
                                                            } else {
                                                                i6 = size2;
                                                                z9 = zD0;
                                                            }
                                                            iMax = Math.max(this.d0, s());
                                                            z10 = z8;
                                                            if (iMax > s()) {
                                                                T(iMax);
                                                                this.U[0] = j4eVar4;
                                                                z10 = true;
                                                                z7 = true;
                                                            }
                                                            iMax2 = Math.max(this.e0, m());
                                                            if (iMax2 > m()) {
                                                                O(iMax2);
                                                                r13 = 1;
                                                                this.U[1] = j4eVar4;
                                                                r15 = 1;
                                                                z7 = true;
                                                            } else {
                                                                r13 = 1;
                                                                r15 = z10;
                                                            }
                                                            if (z7) {
                                                                z4 = z7;
                                                                i7 = 8;
                                                                r16 = r15;
                                                            } else {
                                                                r15 = r15;
                                                                r15 = r15;
                                                                if (this.U[0] == j4eVar7) {
                                                                    r15 = r15;
                                                                    if (s() > i) {
                                                                        this.I0 = r13;
                                                                        this.U[0] = j4eVar4;
                                                                        T(i);
                                                                        ?? r18 = r13;
                                                                        z7 = r18 == true ? 1 : 0;
                                                                        r15 = r18;
                                                                    }
                                                                }
                                                                if (this.U[r13] == j4eVar7) {
                                                                    z4 = z7;
                                                                    i7 = 8;
                                                                    r16 = r15;
                                                                } else {
                                                                    z4 = z7;
                                                                    i7 = 8;
                                                                    r16 = r15;
                                                                }
                                                            }
                                                            if (i4 > i7) {
                                                                r16 = 0;
                                                            }
                                                            i3 = i4;
                                                            z3 = z6;
                                                            size2 = i6;
                                                            zD0 = z9;
                                                            r14 = r16;
                                                        }
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        w2eVar2 = w2eVar7;
                                                        z7 = z4;
                                                        r17 = 1;
                                                        e.printStackTrace();
                                                        r26 = r17;
                                                        System.out.println("EXCEPTION : " + e);
                                                        if (r26 != 0) {
                                                            zArr[2] = false;
                                                            zD1 = d0(64);
                                                            V(p900Var, zD1);
                                                            size = this.u0.size();
                                                            i8 = 0;
                                                            z11 = false;
                                                            while (i8 < size) {
                                                                int i45 = size;
                                                                k4eVar = (k4e) this.u0.get(i8);
                                                                k4eVar.V(p900Var, zD1);
                                                                boolean z21 = zD1;
                                                                int i46 = i8;
                                                                if (k4eVar.h == -1) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = true;
                                                                }
                                                                i8 = i46 + 1;
                                                                size = i45;
                                                                zD1 = z21;
                                                                z11 = z11;
                                                            }
                                                            z8 = z11;
                                                        } else {
                                                            V(p900Var, zD0);
                                                            while (i5 < size2) {
                                                                ((k4e) this.u0.get(i5)).V(p900Var, zD0);
                                                            }
                                                            z8 = false;
                                                        }
                                                        if (z6) {
                                                            i6 = size2;
                                                            z9 = zD0;
                                                        } else {
                                                            i6 = size2;
                                                            z9 = zD0;
                                                        }
                                                        iMax = Math.max(this.d0, s());
                                                        z10 = z8;
                                                        if (iMax > s()) {
                                                            T(iMax);
                                                            this.U[0] = j4eVar4;
                                                            z10 = true;
                                                            z7 = true;
                                                        }
                                                        iMax2 = Math.max(this.e0, m());
                                                        if (iMax2 > m()) {
                                                            O(iMax2);
                                                            r13 = 1;
                                                            this.U[1] = j4eVar4;
                                                            r15 = 1;
                                                            z7 = true;
                                                        } else {
                                                            r13 = 1;
                                                            r15 = z10;
                                                        }
                                                        if (z7) {
                                                            r15 = r15;
                                                            r15 = r15;
                                                            if (this.U[0] == j4eVar7) {
                                                                r15 = r15;
                                                                if (s() > i) {
                                                                    this.I0 = r13;
                                                                    this.U[0] = j4eVar4;
                                                                    T(i);
                                                                    ?? r19 = r13;
                                                                    z7 = r19 == true ? 1 : 0;
                                                                    r15 = r19;
                                                                }
                                                            }
                                                            if (this.U[r13] == j4eVar7) {
                                                                z4 = z7;
                                                                i7 = 8;
                                                                r16 = r15;
                                                            } else {
                                                                z4 = z7;
                                                                i7 = 8;
                                                                r16 = r15;
                                                            }
                                                        } else {
                                                            z4 = z7;
                                                            i7 = 8;
                                                            r16 = r15;
                                                        }
                                                        if (i4 > i7) {
                                                            r16 = 0;
                                                        }
                                                        i3 = i4;
                                                        z3 = z6;
                                                        size2 = i6;
                                                        zD0 = z9;
                                                        r14 = r16;
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    w2eVar2 = w2eVar7;
                                                }
                                            }
                                            weakReference2 = this.M0;
                                            if (weakReference2 != null && weakReference2.get() != null) {
                                                p900Var.f(p900Var.k(this.M), p900Var.k((w2e) this.M0.get()), 0, 5);
                                                this.M0 = null;
                                            }
                                            weakReference3 = this.L0;
                                            if (weakReference3 != null && weakReference3.get() != null) {
                                                w2eVar3 = w2eVar;
                                                try {
                                                    w2eVar = w2eVar3;
                                                    p900Var.f(p900Var.k((w2e) this.L0.get()), p900Var.k(w2eVar3), 0, 5);
                                                    this.L0 = null;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    w2eVar = w2eVar3;
                                                    r17 = 1;
                                                    e.printStackTrace();
                                                    r26 = r17;
                                                    System.out.println("EXCEPTION : " + e);
                                                    if (r26 != 0) {
                                                        zArr[2] = false;
                                                        zD1 = d0(64);
                                                        V(p900Var, zD1);
                                                        size = this.u0.size();
                                                        i8 = 0;
                                                        z11 = false;
                                                        while (i8 < size) {
                                                            int i47 = size;
                                                            k4eVar = (k4e) this.u0.get(i8);
                                                            k4eVar.V(p900Var, zD1);
                                                            boolean z22 = zD1;
                                                            int i48 = i8;
                                                            if (k4eVar.h == -1) {
                                                                z11 = true;
                                                            } else {
                                                                z11 = true;
                                                            }
                                                            i8 = i48 + 1;
                                                            size = i47;
                                                            zD1 = z22;
                                                            z11 = z11;
                                                        }
                                                        z8 = z11;
                                                    } else {
                                                        V(p900Var, zD0);
                                                        while (i5 < size2) {
                                                            ((k4e) this.u0.get(i5)).V(p900Var, zD0);
                                                        }
                                                        z8 = false;
                                                    }
                                                    if (z6) {
                                                        i6 = size2;
                                                        z9 = zD0;
                                                    } else {
                                                        i6 = size2;
                                                        z9 = zD0;
                                                    }
                                                    iMax = Math.max(this.d0, s());
                                                    z10 = z8;
                                                    if (iMax > s()) {
                                                        T(iMax);
                                                        this.U[0] = j4eVar4;
                                                        z10 = true;
                                                        z7 = true;
                                                    }
                                                    iMax2 = Math.max(this.e0, m());
                                                    if (iMax2 > m()) {
                                                        O(iMax2);
                                                        r13 = 1;
                                                        this.U[1] = j4eVar4;
                                                        r15 = 1;
                                                        z7 = true;
                                                    } else {
                                                        r13 = 1;
                                                        r15 = z10;
                                                    }
                                                    if (z7) {
                                                        r15 = r15;
                                                        r15 = r15;
                                                        if (this.U[0] == j4eVar7) {
                                                            r15 = r15;
                                                            if (s() > i) {
                                                                this.I0 = r13;
                                                                this.U[0] = j4eVar4;
                                                                T(i);
                                                                ?? r110 = r13;
                                                                z7 = r110 == true ? 1 : 0;
                                                                r15 = r110;
                                                            }
                                                        }
                                                        if (this.U[r13] == j4eVar7) {
                                                            z4 = z7;
                                                            i7 = 8;
                                                            r16 = r15;
                                                        } else {
                                                            z4 = z7;
                                                            i7 = 8;
                                                            r16 = r15;
                                                        }
                                                    } else {
                                                        z4 = z7;
                                                        i7 = 8;
                                                        r16 = r15;
                                                    }
                                                    if (i4 > i7) {
                                                        r16 = 0;
                                                    }
                                                    i3 = i4;
                                                    z3 = z6;
                                                    size2 = i6;
                                                    zD0 = z9;
                                                    r14 = r16;
                                                }
                                            }
                                            weakReference4 = this.N0;
                                            if (weakReference4 == null && weakReference4.get() != null) {
                                                try {
                                                    try {
                                                        p900Var.f(p900Var.k(this.L), p900Var.k((w2e) this.N0.get()), 0, 5);
                                                        try {
                                                            this.N0 = null;
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            r17 = 1;
                                                            e.printStackTrace();
                                                            r26 = r17;
                                                            System.out.println("EXCEPTION : " + e);
                                                        }
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        r17 = 1;
                                                        e.printStackTrace();
                                                        r26 = r17;
                                                        System.out.println("EXCEPTION : " + e);
                                                        if (r26 != 0) {
                                                            zArr[2] = false;
                                                            zD1 = d0(64);
                                                            V(p900Var, zD1);
                                                            size = this.u0.size();
                                                            i8 = 0;
                                                            z11 = false;
                                                            while (i8 < size) {
                                                                int i49 = size;
                                                                k4eVar = (k4e) this.u0.get(i8);
                                                                k4eVar.V(p900Var, zD1);
                                                                boolean z23 = zD1;
                                                                int i410 = i8;
                                                                if (k4eVar.h == -1) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = true;
                                                                }
                                                                i8 = i410 + 1;
                                                                size = i49;
                                                                zD1 = z23;
                                                                z11 = z11;
                                                            }
                                                            z8 = z11;
                                                        } else {
                                                            V(p900Var, zD0);
                                                            while (i5 < size2) {
                                                                ((k4e) this.u0.get(i5)).V(p900Var, zD0);
                                                            }
                                                            z8 = false;
                                                        }
                                                        if (z6) {
                                                            i6 = size2;
                                                            z9 = zD0;
                                                        } else {
                                                            i6 = size2;
                                                            z9 = zD0;
                                                        }
                                                        iMax = Math.max(this.d0, s());
                                                        z10 = z8;
                                                        if (iMax > s()) {
                                                            T(iMax);
                                                            this.U[0] = j4eVar4;
                                                            z10 = true;
                                                            z7 = true;
                                                        }
                                                        iMax2 = Math.max(this.e0, m());
                                                        if (iMax2 > m()) {
                                                            O(iMax2);
                                                            r13 = 1;
                                                            this.U[1] = j4eVar4;
                                                            r15 = 1;
                                                            z7 = true;
                                                        } else {
                                                            r13 = 1;
                                                            r15 = z10;
                                                        }
                                                        if (z7) {
                                                            r15 = r15;
                                                            r15 = r15;
                                                            if (this.U[0] == j4eVar7) {
                                                                r15 = r15;
                                                                if (s() > i) {
                                                                    this.I0 = r13;
                                                                    this.U[0] = j4eVar4;
                                                                    T(i);
                                                                    ?? r111 = r13;
                                                                    z7 = r111 == true ? 1 : 0;
                                                                    r15 = r111;
                                                                }
                                                            }
                                                            if (this.U[r13] == j4eVar7) {
                                                                z4 = z7;
                                                                i7 = 8;
                                                                r16 = r15;
                                                            } else {
                                                                z4 = z7;
                                                                i7 = 8;
                                                                r16 = r15;
                                                            }
                                                        } else {
                                                            z4 = z7;
                                                            i7 = 8;
                                                            r16 = r15;
                                                        }
                                                        if (i4 > i7) {
                                                            r16 = 0;
                                                        }
                                                        i3 = i4;
                                                        z3 = z6;
                                                        size2 = i6;
                                                        zD0 = z9;
                                                        r14 = r16;
                                                    }
                                                } catch (Exception e7) {
                                                    e = e7;
                                                }
                                            }
                                            p900Var.p();
                                            r26 = 1;
                                        } catch (Exception e8) {
                                            e = e8;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        z7 = z4;
                                        r17 = r14;
                                        e.printStackTrace();
                                        r26 = r17;
                                        System.out.println("EXCEPTION : " + e);
                                        if (r26 != 0) {
                                            zArr[2] = false;
                                            zD1 = d0(64);
                                            V(p900Var, zD1);
                                            size = this.u0.size();
                                            i8 = 0;
                                            z11 = false;
                                            while (i8 < size) {
                                                int i411 = size;
                                                k4eVar = (k4e) this.u0.get(i8);
                                                k4eVar.V(p900Var, zD1);
                                                boolean z24 = zD1;
                                                int i412 = i8;
                                                if (k4eVar.h == -1) {
                                                    z11 = true;
                                                } else {
                                                    z11 = true;
                                                }
                                                i8 = i412 + 1;
                                                size = i411;
                                                zD1 = z24;
                                                z11 = z11;
                                            }
                                            z8 = z11;
                                        } else {
                                            V(p900Var, zD0);
                                            while (i5 < size2) {
                                                ((k4e) this.u0.get(i5)).V(p900Var, zD0);
                                            }
                                            z8 = false;
                                        }
                                        if (z6) {
                                            i6 = size2;
                                            z9 = zD0;
                                        } else {
                                            i6 = size2;
                                            z9 = zD0;
                                        }
                                        iMax = Math.max(this.d0, s());
                                        z10 = z8;
                                        if (iMax > s()) {
                                            T(iMax);
                                            this.U[0] = j4eVar4;
                                            z10 = true;
                                            z7 = true;
                                        }
                                        iMax2 = Math.max(this.e0, m());
                                        if (iMax2 > m()) {
                                            O(iMax2);
                                            r13 = 1;
                                            this.U[1] = j4eVar4;
                                            r15 = 1;
                                            z7 = true;
                                        } else {
                                            r13 = 1;
                                            r15 = z10;
                                        }
                                        if (z7) {
                                            r15 = r15;
                                            r15 = r15;
                                            if (this.U[0] == j4eVar7) {
                                                r15 = r15;
                                                if (s() > i) {
                                                    this.I0 = r13;
                                                    this.U[0] = j4eVar4;
                                                    T(i);
                                                    ?? r112 = r13;
                                                    z7 = r112 == true ? 1 : 0;
                                                    r15 = r112;
                                                }
                                            }
                                            if (this.U[r13] == j4eVar7) {
                                                z4 = z7;
                                                i7 = 8;
                                                r16 = r15;
                                            } else {
                                                z4 = z7;
                                                i7 = 8;
                                                r16 = r15;
                                            }
                                        } else {
                                            z4 = z7;
                                            i7 = 8;
                                            r16 = r15;
                                        }
                                        if (i4 > i7) {
                                            r16 = 0;
                                        }
                                        i3 = i4;
                                        z3 = z6;
                                        size2 = i6;
                                        zD0 = z9;
                                        r14 = r16;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    z6 = z3;
                                }
                                if (r26 != 0) {
                                    zArr[2] = false;
                                    zD1 = d0(64);
                                    V(p900Var, zD1);
                                    size = this.u0.size();
                                    i8 = 0;
                                    z11 = false;
                                    while (i8 < size) {
                                        int i413 = size;
                                        k4eVar = (k4e) this.u0.get(i8);
                                        k4eVar.V(p900Var, zD1);
                                        boolean z25 = zD1;
                                        int i414 = i8;
                                        if (k4eVar.h == -1 || k4eVar.i != -1) {
                                            z11 = true;
                                        }
                                        i8 = i414 + 1;
                                        size = i413;
                                        zD1 = z25;
                                        z11 = z11;
                                    }
                                    z8 = z11;
                                } else {
                                    V(p900Var, zD0);
                                    while (i5 < size2) {
                                        ((k4e) this.u0.get(i5)).V(p900Var, zD0);
                                    }
                                    z8 = false;
                                }
                                if (z6 || i4 >= 8 || !zArr[2]) {
                                    i6 = size2;
                                    z9 = zD0;
                                } else {
                                    int iMax5 = 0;
                                    int iMax6 = 0;
                                    int i50 = 0;
                                    while (i50 < size2) {
                                        int i51 = size2;
                                        k4e k4eVar14 = (k4e) this.u0.get(i50);
                                        iMax6 = Math.max(iMax6, k4eVar14.s() + k4eVar14.a0);
                                        iMax5 = Math.max(iMax5, k4eVar14.m() + k4eVar14.b0);
                                        i50++;
                                        size2 = i51;
                                        zD0 = zD0;
                                    }
                                    i6 = size2;
                                    z9 = zD0;
                                    int iMax7 = Math.max(this.d0, iMax6);
                                    int iMax8 = Math.max(this.e0, iMax5);
                                    z8 = z8;
                                    if (j4eVar2 == j4eVar7) {
                                        z8 = z8;
                                        if (s() < iMax7) {
                                            T(iMax7);
                                            this.U[0] = j4eVar7;
                                            z8 = true;
                                            z7 = true;
                                        }
                                    }
                                    if (j4eVar == j4eVar7 && m() < iMax8) {
                                        O(iMax8);
                                        this.U[1] = j4eVar7;
                                        z8 = true;
                                        z7 = true;
                                    }
                                }
                                iMax = Math.max(this.d0, s());
                                z10 = z8;
                                if (iMax > s()) {
                                    T(iMax);
                                    this.U[0] = j4eVar4;
                                    z10 = true;
                                    z7 = true;
                                }
                                iMax2 = Math.max(this.e0, m());
                                if (iMax2 > m()) {
                                    O(iMax2);
                                    r13 = 1;
                                    this.U[1] = j4eVar4;
                                    r15 = 1;
                                    z7 = true;
                                } else {
                                    r13 = 1;
                                    r15 = z10;
                                }
                                if (z7) {
                                    r15 = r15;
                                    r15 = r15;
                                    if (this.U[0] == j4eVar7 && i > 0) {
                                        r15 = r15;
                                        if (s() > i) {
                                            this.I0 = r13;
                                            this.U[0] = j4eVar4;
                                            T(i);
                                            ?? r113 = r13;
                                            z7 = r113 == true ? 1 : 0;
                                            r15 = r113;
                                        }
                                    }
                                    if (this.U[r13] == j4eVar7 || iMax4 <= 0 || m() <= iMax4) {
                                        z4 = z7;
                                        i7 = 8;
                                        r16 = r15;
                                    } else {
                                        this.J0 = r13;
                                        this.U[r13] = j4eVar4;
                                        O(iMax4);
                                        i7 = 8;
                                        z4 = true;
                                        r16 = 1;
                                    }
                                } else {
                                    z4 = z7;
                                    i7 = 8;
                                    r16 = r15;
                                }
                                if (i4 > i7) {
                                    r16 = 0;
                                }
                                i3 = i4;
                                z3 = z6;
                                size2 = i6;
                                zD0 = z9;
                                r14 = r16;
                            }
                            z5 = z4;
                            this.u0 = arrayList23;
                            if (z5) {
                                j4e[] j4eVarArr9 = this.U;
                                j4eVarArr9[0] = j4eVar2;
                                j4eVarArr9[1] = j4eVar;
                            }
                            H(p900Var.m);
                        }
                        p900Var = p900Var2;
                        ydv0Var = null;
                        i10 = 1;
                        if (this.U[1] == j4eVar7) {
                            i12 = 0;
                            ydv0Var2 = null;
                            while (r2.hasNext()) {
                                if (ydv0Var8.c != 0) {
                                    iB = ydv0Var8.b(p900Var, i10);
                                    if (iB > i12) {
                                        ydv0Var2 = ydv0Var8;
                                        i12 = iB;
                                    }
                                    i10 = 1;
                                }
                            }
                            if (ydv0Var2 != null) {
                                R(j4eVar4);
                                O(i12);
                            } else {
                                ydv0Var2 = null;
                            }
                        } else {
                            ydv0Var2 = null;
                        }
                        if (ydv0Var == null) {
                        }
                        if (j4eVar2 == j4eVar7) {
                            if (iMax3 < s()) {
                                iMax3 = s();
                            } else {
                                iMax3 = s();
                            }
                        }
                        if (j4eVar == j4eVar7) {
                            i11 = iMax4;
                            if (i11 < m()) {
                            }
                            iM = m();
                            iMax4 = iM;
                            i = iMax3;
                            z = true;
                            if (d0(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            p900Var.getClass();
                            p900Var.h = false;
                            if (this.H0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList24 = this.u0;
                            j4eVarArr = this.U;
                            if (j4eVarArr[0] != j4eVar7) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.D0 = 0;
                            this.E0 = 0;
                            while (i2 < size2) {
                                k4eVar2 = (k4e) this.u0.get(i2);
                                if (k4eVar2 instanceof l4e) {
                                    ((l4e) k4eVar2).a0();
                                }
                            }
                            zD0 = d0(64);
                            z4 = z;
                            i3 = 0;
                            r14 = 1;
                            while (r14 != 0) {
                                i4 = i3 + 1;
                                p900Var.t();
                                z6 = z3;
                                this.D0 = 0;
                                this.E0 = 0;
                                i(p900Var);
                                while (i9 < size2) {
                                    ((k4e) this.u0.get(i9)).i(p900Var);
                                }
                                Y(p900Var);
                                weakReference = this.K0;
                                if (weakReference != null) {
                                    z7 = z4;
                                    weakReference2 = this.M0;
                                    if (weakReference2 != null) {
                                        p900Var.f(p900Var.k(this.M), p900Var.k((w2e) this.M0.get()), 0, 5);
                                        this.M0 = null;
                                    }
                                    weakReference3 = this.L0;
                                    if (weakReference3 != null) {
                                        w2eVar3 = w2eVar;
                                        w2eVar = w2eVar3;
                                        p900Var.f(p900Var.k((w2e) this.L0.get()), p900Var.k(w2eVar3), 0, 5);
                                        this.L0 = null;
                                    }
                                    weakReference4 = this.N0;
                                    if (weakReference4 == null) {
                                    }
                                    p900Var.p();
                                    r26 = 1;
                                } else {
                                    z7 = z4;
                                    weakReference2 = this.M0;
                                    if (weakReference2 != null) {
                                        p900Var.f(p900Var.k(this.M), p900Var.k((w2e) this.M0.get()), 0, 5);
                                        this.M0 = null;
                                    }
                                    weakReference3 = this.L0;
                                    if (weakReference3 != null) {
                                        w2eVar3 = w2eVar;
                                        w2eVar = w2eVar3;
                                        p900Var.f(p900Var.k((w2e) this.L0.get()), p900Var.k(w2eVar3), 0, 5);
                                        this.L0 = null;
                                    }
                                    weakReference4 = this.N0;
                                    if (weakReference4 == null) {
                                    }
                                    p900Var.p();
                                    r26 = 1;
                                }
                                if (r26 != 0) {
                                    zArr[2] = false;
                                    zD1 = d0(64);
                                    V(p900Var, zD1);
                                    size = this.u0.size();
                                    i8 = 0;
                                    z11 = false;
                                    while (i8 < size) {
                                        int i415 = size;
                                        k4eVar = (k4e) this.u0.get(i8);
                                        k4eVar.V(p900Var, zD1);
                                        boolean z26 = zD1;
                                        int i416 = i8;
                                        if (k4eVar.h == -1) {
                                            z11 = true;
                                        } else {
                                            z11 = true;
                                        }
                                        i8 = i416 + 1;
                                        size = i415;
                                        zD1 = z26;
                                        z11 = z11;
                                    }
                                    z8 = z11;
                                } else {
                                    V(p900Var, zD0);
                                    while (i5 < size2) {
                                        ((k4e) this.u0.get(i5)).V(p900Var, zD0);
                                    }
                                    z8 = false;
                                }
                                if (z6) {
                                    i6 = size2;
                                    z9 = zD0;
                                } else {
                                    i6 = size2;
                                    z9 = zD0;
                                }
                                iMax = Math.max(this.d0, s());
                                z10 = z8;
                                if (iMax > s()) {
                                    T(iMax);
                                    this.U[0] = j4eVar4;
                                    z10 = true;
                                    z7 = true;
                                }
                                iMax2 = Math.max(this.e0, m());
                                if (iMax2 > m()) {
                                    O(iMax2);
                                    r13 = 1;
                                    this.U[1] = j4eVar4;
                                    r15 = 1;
                                    z7 = true;
                                } else {
                                    r13 = 1;
                                    r15 = z10;
                                }
                                if (z7) {
                                    r15 = r15;
                                    r15 = r15;
                                    if (this.U[0] == j4eVar7) {
                                        r15 = r15;
                                        if (s() > i) {
                                            this.I0 = r13;
                                            this.U[0] = j4eVar4;
                                            T(i);
                                            ?? r114 = r13;
                                            z7 = r114 == true ? 1 : 0;
                                            r15 = r114;
                                        }
                                    }
                                    if (this.U[r13] == j4eVar7) {
                                        z4 = z7;
                                        i7 = 8;
                                        r16 = r15;
                                    } else {
                                        z4 = z7;
                                        i7 = 8;
                                        r16 = r15;
                                    }
                                } else {
                                    z4 = z7;
                                    i7 = 8;
                                    r16 = r15;
                                }
                                if (i4 > i7) {
                                    r16 = 0;
                                }
                                i3 = i4;
                                z3 = z6;
                                size2 = i6;
                                zD0 = z9;
                                r14 = r16;
                            }
                            z5 = z4;
                            this.u0 = arrayList24;
                            if (z5) {
                                j4e[] j4eVarArr10 = this.U;
                                j4eVarArr10[0] = j4eVar2;
                                j4eVarArr10[1] = j4eVar;
                            }
                            H(p900Var.m);
                        }
                        i11 = iMax4;
                        iM = i11;
                        iMax4 = iM;
                        i = iMax3;
                        z = true;
                        if (d0(64)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        p900Var.getClass();
                        p900Var.h = false;
                        if (this.H0 == 0) {
                            c = 1;
                        } else {
                            c = 1;
                        }
                        ArrayList arrayList25 = this.u0;
                        j4eVarArr = this.U;
                        if (j4eVarArr[0] != j4eVar7) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        this.D0 = 0;
                        this.E0 = 0;
                        while (i2 < size2) {
                            k4eVar2 = (k4e) this.u0.get(i2);
                            if (k4eVar2 instanceof l4e) {
                                ((l4e) k4eVar2).a0();
                            }
                        }
                        zD0 = d0(64);
                        z4 = z;
                        i3 = 0;
                        r14 = 1;
                        while (r14 != 0) {
                            i4 = i3 + 1;
                            p900Var.t();
                            z6 = z3;
                            this.D0 = 0;
                            this.E0 = 0;
                            i(p900Var);
                            while (i9 < size2) {
                                ((k4e) this.u0.get(i9)).i(p900Var);
                            }
                            Y(p900Var);
                            weakReference = this.K0;
                            if (weakReference != null) {
                                z7 = z4;
                                weakReference2 = this.M0;
                                if (weakReference2 != null) {
                                    p900Var.f(p900Var.k(this.M), p900Var.k((w2e) this.M0.get()), 0, 5);
                                    this.M0 = null;
                                }
                                weakReference3 = this.L0;
                                if (weakReference3 != null) {
                                    w2eVar3 = w2eVar;
                                    w2eVar = w2eVar3;
                                    p900Var.f(p900Var.k((w2e) this.L0.get()), p900Var.k(w2eVar3), 0, 5);
                                    this.L0 = null;
                                }
                                weakReference4 = this.N0;
                                if (weakReference4 == null) {
                                }
                                p900Var.p();
                                r26 = 1;
                            } else {
                                z7 = z4;
                                weakReference2 = this.M0;
                                if (weakReference2 != null) {
                                    p900Var.f(p900Var.k(this.M), p900Var.k((w2e) this.M0.get()), 0, 5);
                                    this.M0 = null;
                                }
                                weakReference3 = this.L0;
                                if (weakReference3 != null) {
                                    w2eVar3 = w2eVar;
                                    w2eVar = w2eVar3;
                                    p900Var.f(p900Var.k((w2e) this.L0.get()), p900Var.k(w2eVar3), 0, 5);
                                    this.L0 = null;
                                }
                                weakReference4 = this.N0;
                                if (weakReference4 == null) {
                                }
                                p900Var.p();
                                r26 = 1;
                            }
                            if (r26 != 0) {
                                zArr[2] = false;
                                zD1 = d0(64);
                                V(p900Var, zD1);
                                size = this.u0.size();
                                i8 = 0;
                                z11 = false;
                                while (i8 < size) {
                                    int i417 = size;
                                    k4eVar = (k4e) this.u0.get(i8);
                                    k4eVar.V(p900Var, zD1);
                                    boolean z27 = zD1;
                                    int i418 = i8;
                                    if (k4eVar.h == -1) {
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    i8 = i418 + 1;
                                    size = i417;
                                    zD1 = z27;
                                    z11 = z11;
                                }
                                z8 = z11;
                            } else {
                                V(p900Var, zD0);
                                while (i5 < size2) {
                                    ((k4e) this.u0.get(i5)).V(p900Var, zD0);
                                }
                                z8 = false;
                            }
                            if (z6) {
                                i6 = size2;
                                z9 = zD0;
                            } else {
                                i6 = size2;
                                z9 = zD0;
                            }
                            iMax = Math.max(this.d0, s());
                            z10 = z8;
                            if (iMax > s()) {
                                T(iMax);
                                this.U[0] = j4eVar4;
                                z10 = true;
                                z7 = true;
                            }
                            iMax2 = Math.max(this.e0, m());
                            if (iMax2 > m()) {
                                O(iMax2);
                                r13 = 1;
                                this.U[1] = j4eVar4;
                                r15 = 1;
                                z7 = true;
                            } else {
                                r13 = 1;
                                r15 = z10;
                            }
                            if (z7) {
                                r15 = r15;
                                r15 = r15;
                                if (this.U[0] == j4eVar7) {
                                    r15 = r15;
                                    if (s() > i) {
                                        this.I0 = r13;
                                        this.U[0] = j4eVar4;
                                        T(i);
                                        ?? r115 = r13;
                                        z7 = r115 == true ? 1 : 0;
                                        r15 = r115;
                                    }
                                }
                                if (this.U[r13] == j4eVar7) {
                                    z4 = z7;
                                    i7 = 8;
                                    r16 = r15;
                                } else {
                                    z4 = z7;
                                    i7 = 8;
                                    r16 = r15;
                                }
                            } else {
                                z4 = z7;
                                i7 = 8;
                                r16 = r15;
                            }
                            if (i4 > i7) {
                                r16 = 0;
                            }
                            i3 = i4;
                            z3 = z6;
                            size2 = i6;
                            zD0 = z9;
                            r14 = r16;
                        }
                        z5 = z4;
                        this.u0 = arrayList25;
                        if (z5) {
                            j4e[] j4eVarArr11 = this.U;
                            j4eVarArr11[0] = j4eVar2;
                            j4eVarArr11[1] = j4eVar;
                        }
                        H(p900Var.m);
                    }
                }
                p900Var = p900Var2;
            }
        }
        i = iMax3;
        z = false;
        if (d0(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        p900Var.getClass();
        p900Var.h = false;
        if (this.H0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList arrayList26 = this.u0;
        j4eVarArr = this.U;
        if (j4eVarArr[0] != j4eVar7) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.D0 = 0;
        this.E0 = 0;
        while (i2 < size2) {
            k4eVar2 = (k4e) this.u0.get(i2);
            if (k4eVar2 instanceof l4e) {
                ((l4e) k4eVar2).a0();
            }
        }
        zD0 = d0(64);
        z4 = z;
        i3 = 0;
        r14 = 1;
        while (r14 != 0) {
            i4 = i3 + 1;
            p900Var.t();
            z6 = z3;
            this.D0 = 0;
            this.E0 = 0;
            i(p900Var);
            while (i9 < size2) {
                ((k4e) this.u0.get(i9)).i(p900Var);
            }
            Y(p900Var);
            weakReference = this.K0;
            if (weakReference != null) {
                z7 = z4;
                weakReference2 = this.M0;
                if (weakReference2 != null) {
                    p900Var.f(p900Var.k(this.M), p900Var.k((w2e) this.M0.get()), 0, 5);
                    this.M0 = null;
                }
                weakReference3 = this.L0;
                if (weakReference3 != null) {
                    w2eVar3 = w2eVar;
                    w2eVar = w2eVar3;
                    p900Var.f(p900Var.k((w2e) this.L0.get()), p900Var.k(w2eVar3), 0, 5);
                    this.L0 = null;
                }
                weakReference4 = this.N0;
                if (weakReference4 == null) {
                }
                p900Var.p();
                r26 = 1;
            } else {
                z7 = z4;
                weakReference2 = this.M0;
                if (weakReference2 != null) {
                    p900Var.f(p900Var.k(this.M), p900Var.k((w2e) this.M0.get()), 0, 5);
                    this.M0 = null;
                }
                weakReference3 = this.L0;
                if (weakReference3 != null) {
                    w2eVar3 = w2eVar;
                    w2eVar = w2eVar3;
                    p900Var.f(p900Var.k((w2e) this.L0.get()), p900Var.k(w2eVar3), 0, 5);
                    this.L0 = null;
                }
                weakReference4 = this.N0;
                if (weakReference4 == null) {
                }
                p900Var.p();
                r26 = 1;
            }
            if (r26 != 0) {
                zArr[2] = false;
                zD1 = d0(64);
                V(p900Var, zD1);
                size = this.u0.size();
                i8 = 0;
                z11 = false;
                while (i8 < size) {
                    int i419 = size;
                    k4eVar = (k4e) this.u0.get(i8);
                    k4eVar.V(p900Var, zD1);
                    boolean z28 = zD1;
                    int i4110 = i8;
                    if (k4eVar.h == -1) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    i8 = i4110 + 1;
                    size = i419;
                    zD1 = z28;
                    z11 = z11;
                }
                z8 = z11;
            } else {
                V(p900Var, zD0);
                while (i5 < size2) {
                    ((k4e) this.u0.get(i5)).V(p900Var, zD0);
                }
                z8 = false;
            }
            if (z6) {
                i6 = size2;
                z9 = zD0;
            } else {
                i6 = size2;
                z9 = zD0;
            }
            iMax = Math.max(this.d0, s());
            z10 = z8;
            if (iMax > s()) {
                T(iMax);
                this.U[0] = j4eVar4;
                z10 = true;
                z7 = true;
            }
            iMax2 = Math.max(this.e0, m());
            if (iMax2 > m()) {
                O(iMax2);
                r13 = 1;
                this.U[1] = j4eVar4;
                r15 = 1;
                z7 = true;
            } else {
                r13 = 1;
                r15 = z10;
            }
            if (z7) {
                r15 = r15;
                r15 = r15;
                if (this.U[0] == j4eVar7) {
                    r15 = r15;
                    if (s() > i) {
                        this.I0 = r13;
                        this.U[0] = j4eVar4;
                        T(i);
                        ?? r116 = r13;
                        z7 = r116 == true ? 1 : 0;
                        r15 = r116;
                    }
                }
                if (this.U[r13] == j4eVar7) {
                    z4 = z7;
                    i7 = 8;
                    r16 = r15;
                } else {
                    z4 = z7;
                    i7 = 8;
                    r16 = r15;
                }
            } else {
                z4 = z7;
                i7 = 8;
                r16 = r15;
            }
            if (i4 > i7) {
                r16 = 0;
            }
            i3 = i4;
            z3 = z6;
            size2 = i6;
            zD0 = z9;
            r14 = r16;
        }
        z5 = z4;
        this.u0 = arrayList26;
        if (z5) {
            j4e[] j4eVarArr12 = this.U;
            j4eVarArr12[0] = j4eVar2;
            j4eVarArr12[1] = j4eVar;
        }
        H(p900Var.m);
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0376  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    public final void b0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        char c;
        ?? r1;
        int i8;
        l4e l4eVar;
        ArrayList arrayList;
        r96 r96Var;
        int i9;
        int i10;
        boolean Z;
        int i11;
        int i12;
        r96 r96Var2;
        int i13;
        int i14;
        int i15;
        r96 r96Var3;
        int i16;
        int i17;
        cmw cmwVar;
        ocu0 ocu0Var;
        ?? r2;
        int i18;
        int i19;
        ArrayList<hev0> arrayList2;
        int i20;
        boolean z;
        boolean z2;
        ?? r3;
        this.B0 = i6;
        this.C0 = i7;
        phf0 phf0Var = this.v0;
        l4e l4eVar2 = (l4e) phf0Var.c;
        ArrayList arrayList3 = (ArrayList) phf0Var.f26994a;
        r96 r96Var4 = this.y0;
        h7k h7kVar = this.w0;
        int size = this.u0.size();
        int iS = s();
        int iM = m();
        boolean zS = f1t0.S(i, 128);
        boolean z3 = zS || f1t0.S(i, 64);
        j4e j4eVar = j4e.c;
        boolean z4 = false;
        if (z3) {
            int i21 = 0;
            while (true) {
                if (i21 < size) {
                    c = 1;
                    k4e k4eVar = (k4e) this.u0.get(i21);
                    boolean z5 = z3;
                    j4e[] j4eVarArr = k4eVar.U;
                    boolean z6 = (j4eVarArr[0] == j4eVar) && (j4eVarArr[1] == j4eVar) && k4eVar.Y > 0.0f;
                    if ((k4eVar.z() && z6) || ((k4eVar.A() && z6) || (k4eVar instanceof zru0) || k4eVar.z() || k4eVar.A())) {
                        r1 = 0;
                    } else {
                        i21++;
                        z3 = z5;
                    }
                } else {
                    c = 1;
                    r1 = z3;
                }
            }
        } else {
            c = 1;
            r1 = z3;
        }
        int i22 = r1 & (((i2 == 1073741824 && i4 == 1073741824) || zS) ? c : (char) 0);
        j4e j4eVar2 = j4e.b;
        if (i22 != 0) {
            i8 = i22;
            int iMin = Math.min(this.D[0], i3);
            i9 = size;
            int iMin2 = Math.min(this.D[c], i5);
            int i23 = 1073741824;
            if (i2 == 1073741824) {
                if (s() != iMin) {
                    T(iMin);
                    ?? r4 = c;
                    h7kVar.b = r4;
                    r3 = r4;
                } else {
                    r3 = c;
                }
                i23 = 1073741824;
                r2 = r3;
            } else {
                r2 = c;
            }
            if (i4 == i23) {
                if (m() != iMin2) {
                    O(iMin2);
                    h7kVar.b = r2;
                }
                i23 = 1073741824;
            }
            if (i2 == i23 && i4 == i23) {
                ArrayList arrayList4 = (ArrayList) h7kVar.f;
                l4e l4eVar3 = (l4e) h7kVar.d;
                if (h7kVar.b || h7kVar.c) {
                    Iterator it = l4eVar3.u0.iterator();
                    while (it.hasNext()) {
                        ArrayList arrayList5 = arrayList4;
                        k4e k4eVar2 = (k4e) it.next();
                        k4eVar2.j();
                        k4eVar2.f17665a = z4;
                        k4eVar2.d.n();
                        k4eVar2.e.m();
                        arrayList4 = arrayList5;
                        it = it;
                        z4 = false;
                    }
                    arrayList2 = arrayList4;
                    l4eVar3.j();
                    i20 = 0;
                    l4eVar3.f17665a = false;
                    l4eVar3.d.n();
                    l4eVar3.e.m();
                    h7kVar.c = false;
                } else {
                    i20 = 0;
                    arrayList2 = arrayList4;
                }
                h7kVar.b((l4e) h7kVar.e);
                l4eVar3.a0 = i20;
                l4eVar3.b0 = i20;
                j4e j4eVarL = l4eVar3.l(i20);
                r96Var = r96Var4;
                j4e j4eVarL2 = l4eVar3.l(1);
                if (h7kVar.b) {
                    h7kVar.c();
                }
                int iT = l4eVar3.t();
                arrayList = arrayList3;
                int iU = l4eVar3.u();
                l4eVar = l4eVar2;
                l4eVar3.d.h.d(iT);
                l4eVar3.e.h.d(iU);
                h7kVar.w();
                j4e j4eVar3 = j4e.f15879a;
                if (j4eVarL == j4eVar2 || j4eVarL2 == j4eVar2) {
                    if (zS) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((hev0) it2.next()).k()) {
                                zS = false;
                                break;
                            }
                        }
                    }
                    if (zS && j4eVarL == j4eVar2) {
                        l4eVar3.P(j4eVar3);
                        l4eVar3.T(h7kVar.d(l4eVar3, 0));
                        l4eVar3.d.e.d(l4eVar3.s());
                    }
                    if (zS && j4eVarL2 == j4eVar2) {
                        l4eVar3.R(j4eVar3);
                        l4eVar3.O(h7kVar.d(l4eVar3, 1));
                        l4eVar3.e.e.d(l4eVar3.m());
                    }
                } else {
                    iU = iU;
                }
                j4e j4eVar4 = l4eVar3.U[0];
                j4e j4eVar5 = j4e.d;
                if (j4eVar4 == j4eVar3 || j4eVar4 == j4eVar5) {
                    int iS2 = l4eVar3.s() + iT;
                    l4eVar3.d.i.d(iS2);
                    l4eVar3.d.e.d(iS2 - iT);
                    h7kVar.w();
                    j4e j4eVar6 = l4eVar3.U[1];
                    if (j4eVar6 == j4eVar3 || j4eVar6 == j4eVar5) {
                        int iM2 = l4eVar3.m() + iU;
                        l4eVar3.e.i.d(iM2);
                        l4eVar3.e.e.d(iM2 - iU);
                    }
                    h7kVar.w();
                    z = true;
                } else {
                    z = false;
                }
                for (hev0 hev0Var : arrayList2) {
                    if (hev0Var.b != l4eVar3 || hev0Var.g) {
                        hev0Var.e();
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z2 = true;
                        break;
                    }
                    hev0 hev0Var2 = (hev0) it3.next();
                    if (z || hev0Var2.b != l4eVar3) {
                        if (!hev0Var2.h.j || ((!hev0Var2.i.j && !(hev0Var2 instanceof riv)) || (!hev0Var2.e.j && !(hev0Var2 instanceof nbb) && !(hev0Var2 instanceof riv)))) {
                            z2 = false;
                            break;
                        }
                    }
                }
                l4eVar3.P(j4eVarL);
                l4eVar3.R(j4eVarL2);
                Z = z2;
                i19 = 1073741824;
                i10 = 2;
            } else {
                l4eVar = l4eVar2;
                arrayList = arrayList3;
                r96Var = r96Var4;
                l4e l4eVar4 = (l4e) h7kVar.d;
                if (h7kVar.b) {
                    for (k4e k4eVar3 : l4eVar4.u0) {
                        k4eVar3.j();
                        k4eVar3.f17665a = false;
                        cmw cmwVar2 = k4eVar3.d;
                        cmwVar2.e.j = false;
                        cmwVar2.g = false;
                        cmwVar2.n();
                        ocu0 ocu0Var2 = k4eVar3.e;
                        ocu0Var2.e.j = false;
                        ocu0Var2.g = false;
                        ocu0Var2.m();
                    }
                    i18 = 0;
                    l4eVar4.j();
                    l4eVar4.f17665a = false;
                    cmw cmwVar3 = l4eVar4.d;
                    cmwVar3.e.j = false;
                    cmwVar3.g = false;
                    cmwVar3.n();
                    ocu0 ocu0Var3 = l4eVar4.e;
                    ocu0Var3.e.j = false;
                    ocu0Var3.g = false;
                    ocu0Var3.m();
                    h7kVar.c();
                } else {
                    i18 = 0;
                }
                h7kVar.b((l4e) h7kVar.e);
                l4eVar4.a0 = i18;
                l4eVar4.b0 = i18;
                l4eVar4.d.h.d(i18);
                l4eVar4.e.h.d(i18);
                i19 = 1073741824;
                if (i2 == 1073741824) {
                    Z = Z(i18, zS);
                    i10 = 1;
                } else {
                    i10 = 0;
                    Z = true;
                }
                if (i4 == 1073741824) {
                    Z &= Z(1, zS);
                    i10++;
                }
            }
            if (Z) {
                U(i2 == i19, i4 == i19);
            }
        } else {
            i8 = i22;
            l4eVar = l4eVar2;
            arrayList = arrayList3;
            r96Var = r96Var4;
            i9 = size;
            i10 = 0;
            Z = false;
        }
        if (Z && i10 == 2) {
            return;
        }
        int i24 = this.H0;
        if (i9 > 0) {
            int size2 = this.u0.size();
            boolean zD0 = d0(64);
            r96 r96Var5 = this.y0;
            for (int i25 = 0; i25 < size2; i25++) {
                k4e k4eVar4 = (k4e) this.u0.get(i25);
                if (!(k4eVar4 instanceof qiv) && !(k4eVar4 instanceof zu5) && !k4eVar4.G && (!zD0 || (cmwVar = k4eVar4.d) == null || (ocu0Var = k4eVar4.e) == null || !cmwVar.e.j || !ocu0Var.e.j)) {
                    j4e j4eVarL3 = k4eVar4.l(0);
                    j4e j4eVarL4 = k4eVar4.l(1);
                    boolean z7 = j4eVarL3 == j4eVar && k4eVar4.s != 1 && j4eVarL4 == j4eVar && k4eVar4.t != 1;
                    if (!z7 && d0(1) && !(k4eVar4 instanceof zru0)) {
                        if (j4eVarL3 == j4eVar && k4eVar4.s == 0 && j4eVarL4 != j4eVar && !k4eVar4.z()) {
                            z7 = true;
                        }
                        if (j4eVarL4 == j4eVar && k4eVar4.t == 0 && j4eVarL3 != j4eVar && !k4eVar4.z()) {
                            z7 = true;
                        }
                        if ((j4eVarL3 == j4eVar || j4eVarL4 == j4eVar) && k4eVar4.Y > 0.0f) {
                            z7 = true;
                        }
                    }
                    if (!z7) {
                        phf0Var.w(0, r96Var5, k4eVar4);
                    }
                }
            }
            i11 = 0;
            r96Var5.a();
        } else {
            i11 = 0;
        }
        phf0Var.z(this);
        int size3 = arrayList.size();
        if (i9 > 0) {
            phf0Var.y(this, i11, iS, iM);
        }
        if (size3 > 0) {
            j4e[] j4eVarArr2 = this.U;
            int i26 = j4eVarArr2[i11] == j4eVar2 ? 1 : i11;
            int i27 = j4eVarArr2[1] == j4eVar2 ? 1 : i11;
            l4e l4eVar5 = l4eVar;
            int iMax = Math.max(s(), l4eVar5.d0);
            int iMax2 = Math.max(m(), l4eVar5.e0);
            int i28 = i11;
            int i29 = i28;
            while (i29 < size3) {
                ArrayList arrayList6 = arrayList;
                k4e k4eVar5 = (k4e) arrayList6.get(i29);
                if (k4eVar5 instanceof zru0) {
                    int iS3 = k4eVar5.s();
                    int iM3 = k4eVar5.m();
                    i14 = i27;
                    i15 = i26;
                    r96Var3 = r96Var;
                    int i30 = i28 | (phf0Var.w(1, r96Var3, k4eVar5) ? 1 : 0);
                    int iS4 = k4eVar5.s();
                    int iM4 = k4eVar5.m();
                    if (iS4 != iS3) {
                        k4eVar5.T(iS4);
                        if (i15 != 0 && k4eVar5.t() + k4eVar5.W > iMax) {
                            iMax = Math.max(iMax, k4eVar5.k(4).e() + k4eVar5.t() + k4eVar5.W);
                        }
                        i16 = iMax;
                        i17 = 1;
                    } else {
                        i16 = iMax;
                        i17 = i30;
                    }
                    if (iM4 != iM3) {
                        k4eVar5.O(iM4);
                        if (i14 != 0 && k4eVar5.u() + k4eVar5.X > iMax2) {
                            iMax2 = Math.max(iMax2, k4eVar5.k(5).e() + k4eVar5.u() + k4eVar5.X);
                        }
                        i17 = 1;
                    }
                    int i31 = (((zru0) k4eVar5).C0 ? 1 : 0) | i17;
                    iMax = i16;
                    i28 = i31;
                } else {
                    i14 = i27;
                    i15 = i26;
                    r96Var3 = r96Var;
                }
                i29++;
                i26 = i15;
                r96Var = r96Var3;
                arrayList = arrayList6;
                i27 = i14;
            }
            int i32 = i27;
            int i33 = i26;
            ArrayList arrayList7 = arrayList;
            int i34 = 0;
            while (true) {
                r96 r96Var6 = r96Var;
                if (i34 >= 2) {
                    break;
                }
                int i35 = 0;
                while (i35 < size3) {
                    k4e k4eVar6 = (k4e) arrayList7.get(i35);
                    if (((k4eVar6 instanceof jvv) && !(k4eVar6 instanceof zru0)) || (k4eVar6 instanceof qiv) || k4eVar6.i0 == 8 || ((i8 != 0 && k4eVar6.d.e.j && k4eVar6.e.e.j) || (k4eVar6 instanceof zru0))) {
                        i12 = size3;
                        r96Var2 = r96Var6;
                        i13 = i28;
                    } else {
                        int iS5 = k4eVar6.s();
                        int iM5 = k4eVar6.m();
                        i12 = size3;
                        int i36 = k4eVar6.c0;
                        int i37 = i28 | (phf0Var.w(i34 == 1 ? 2 : 1, r96Var6, k4eVar6) ? 1 : 0);
                        r96Var2 = r96Var6;
                        int iS6 = k4eVar6.s();
                        int iM6 = k4eVar6.m();
                        if (iS6 != iS5) {
                            k4eVar6.T(iS6);
                            if (i33 != 0 && k4eVar6.t() + k4eVar6.W > iMax) {
                                iMax = Math.max(iMax, k4eVar6.k(4).e() + k4eVar6.t() + k4eVar6.W);
                            }
                            i13 = 1;
                        } else {
                            i13 = i37;
                        }
                        if (iM6 != iM5) {
                            k4eVar6.O(iM6);
                            if (i32 != 0 && k4eVar6.u() + k4eVar6.X > iMax2) {
                                iMax2 = Math.max(iMax2, k4eVar6.k(5).e() + k4eVar6.u() + k4eVar6.X);
                            }
                            i13 = 1;
                        }
                        if (k4eVar6.F && i36 != k4eVar6.c0) {
                            i13 = 1;
                        }
                    }
                    i35++;
                    size3 = i12;
                    i28 = i13;
                    r96Var6 = r96Var2;
                }
                int i38 = size3;
                r96Var = r96Var6;
                if (i28 == 0) {
                    break;
                }
                i34++;
                phf0Var.y(this, i34, iS, iM);
                size3 = i38;
                i28 = 0;
            }
        }
        this.H0 = i24;
        p900.q = d0(512);
    }

    public final boolean d0(int i) {
        return (this.H0 & i) == i;
    }

    @Override // a.k4e
    public final void p(StringBuilder sb) {
        sb.append(this.k + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append(Separators.RETURN);
        sb.append("  actualHeight:" + this.X);
        sb.append(Separators.RETURN);
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((k4e) it.next()).p(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
