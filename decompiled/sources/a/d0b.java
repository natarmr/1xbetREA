package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d0b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yk50 f5259a;
    public final knf0 b;
    public final g7d c;
    public final gxu d;
    public final btt0 e;
    public final pru f;
    public final kuy g;

    public d0b(yk50 yk50Var, knf0 knf0Var, g7d g7dVar, gxu gxuVar, btt0 btt0Var, pru pruVar, kuy kuyVar) {
        knf0Var.getClass();
        g7dVar.getClass();
        btt0Var.getClass();
        kuyVar.getClass();
        this.f5259a = yk50Var;
        this.b = knf0Var;
        this.c = g7dVar;
        this.d = gxuVar;
        this.e = btt0Var;
        this.f = pruVar;
        this.g = kuyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r6 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r6 == r0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.zje r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            boolean r8 = r6 instanceof a.xza
            if (r8 == 0) goto L13
            r8 = r6
            a.xza r8 = (a.xza) r8
            int r0 = r8.m
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.m = r0
            goto L18
        L13:
            a.xza r8 = new a.xza
            r8.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r8.k
            a.wne r0 = a.wne.f39444a
            int r1 = r8.m
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            a.d0b r5 = r8.j
            java.lang.String r7 = r8.i
            a.z1x.P(r6)
            goto L83
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L35:
            a.d0b r5 = r8.j
            java.lang.String r7 = r8.i
            a.z1x.P(r6)
            goto L6f
        L3d:
            a.z1x.P(r6)
            a.g7d r6 = r5.c
            a.p070 r6 = r6.f
            if (r6 == 0) goto L4c
            java.util.List r6 = r6.f26136a
            if (r6 != 0) goto L4b
            goto L4c
        L4b:
            return r6
        L4c:
            a.btt0 r6 = r5.e
            java.lang.String r6 = r6.a()
            a.kuy r1 = r5.g
            java.lang.String r1 = r1.a()
            a.pru r4 = r5.f
            a.sff0 r4 = r4.a()
            boolean r4 = r4.V1
            if (r4 == 0) goto L76
            r8.i = r7
            r8.j = r5
            r8.m = r3
            java.lang.Object r6 = r5.c(r6, r1, r8)
            if (r6 != r0) goto L6f
            goto L82
        L6f:
            a.a070 r6 = (a.a070) r6
            a.p070 r6 = a.j0x.P(r6, r7)
            goto L89
        L76:
            r8.i = r7
            r8.j = r5
            r8.m = r2
            java.lang.Object r6 = r5.d(r6, r1, r8)
            if (r6 != r0) goto L83
        L82:
            return r0
        L83:
            a.m070 r6 = (a.m070) r6
            a.p070 r6 = a.pzw.X(r6, r7)
        L89:
            a.p070 r7 = new a.p070
            java.util.List r8 = r6.f26136a
            java.util.List r6 = r6.b
            r7.<init>(r8, r6)
            a.g7d r5 = r5.c
            r5.getClass()
            r5.f = r7
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d0b.a(a.zje, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r9 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r8, a.zje r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a.yza
            if (r0 == 0) goto L13
            r0 = r9
            a.yza r0 = (a.yza) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.yza r0 = new a.yza
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            java.util.List r8 = r0.i
            a.z1x.P(r9)
            goto L70
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L33:
            java.util.List r8 = r0.i
            a.z1x.P(r9)
            goto L62
        L39:
            a.z1x.P(r9)
            a.btt0 r9 = r7.e
            java.lang.String r9 = r9.a()
            a.knf0 r2 = r7.b
            r2.getClass()
            a.kuy r2 = r7.g
            java.lang.String r2 = r2.a()
            int r5 = r9.length()
            r6 = 22
            a.yk50 r7 = r7.f5259a
            if (r5 != 0) goto L65
            r0.i = r8
            r0.l = r4
            java.lang.Object r9 = r7.d(r6, r0, r2)
            if (r9 != r1) goto L62
            goto L6f
        L62:
            a.h0b r9 = (a.h0b) r9
            goto L72
        L65:
            r0.i = r8
            r0.l = r3
            java.lang.Object r9 = r7.c(r6, r0, r9, r2)
            if (r9 != r1) goto L70
        L6f:
            return r1
        L70:
            a.h0b r9 = (a.h0b) r9
        L72:
            a.jza r7 = a.x4d0.h0(r9, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d0b.b(java.util.List, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(String str, String str2, zje zjeVar) {
        zza zzaVar;
        if (zjeVar instanceof zza) {
            zzaVar = (zza) zjeVar;
            int i = zzaVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzaVar.k = i - Integer.MIN_VALUE;
            } else {
                zzaVar = new zza(this, zjeVar);
            }
        } else {
            zzaVar = new zza(this, zjeVar);
        }
        zza zzaVar2 = zzaVar;
        Object objD = zzaVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = zzaVar2.k;
        if (i2 == 0) {
            z1x.P(objD);
            this.b.getClass();
            zzaVar2.k = 1;
            objD = ((is60) ((o270) this.d.c).invoke()).d(str, 22, 1, new Integer(1357), str2, null, null, zzaVar2);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        return ((dx5) objD).a();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(String str, String str2, zje zjeVar) {
        a0b a0bVar;
        if (zjeVar instanceof a0b) {
            a0bVar = (a0b) zjeVar;
            int i = a0bVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0bVar.k = i - Integer.MIN_VALUE;
            } else {
                a0bVar = new a0b(this, zjeVar);
            }
        } else {
            a0bVar = new a0b(this, zjeVar);
        }
        a0b a0bVar2 = a0bVar;
        Object objD = a0bVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = a0bVar2.k;
        if (i2 == 0) {
            z1x.P(objD);
            this.b.getClass();
            a0bVar2.k = 1;
            objD = ((nz60) ((o270) this.d.b).invoke()).d(str, 22, str2, 1, 1357, a0bVar2);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        return ((u2t) objD).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(zje zjeVar) {
        b0b b0bVar;
        if (zjeVar instanceof b0b) {
            b0bVar = (b0b) zjeVar;
            int i = b0bVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                b0bVar.k = i - Integer.MIN_VALUE;
            } else {
                b0bVar = new b0b(this, zjeVar);
            }
        } else {
            b0bVar = new b0b(this, zjeVar);
        }
        Object objI = b0bVar.i;
        wne wneVar = wne.f39444a;
        int i2 = b0bVar.k;
        if (i2 == 0) {
            z1x.P(objI);
            String strA = this.e.a();
            this.b.getClass();
            String strA2 = this.g.a();
            b0bVar.k = 1;
            objI = this.f5259a.i(22, b0bVar, strA, strA2);
            if (objI == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objI);
        }
        return x4d0.h0((h0b) objI, iun.f15405a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(List list, zje zjeVar) {
        c0b c0bVar;
        if (zjeVar instanceof c0b) {
            c0bVar = (c0b) zjeVar;
            int i = c0bVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0bVar.k = i - Integer.MIN_VALUE;
            } else {
                c0bVar = new c0b(this, zjeVar);
            }
        } else {
            c0bVar = new c0b(this, zjeVar);
        }
        c0b c0bVar2 = c0bVar;
        Object objJ = c0bVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = c0bVar2.k;
        if (i2 == 0) {
            z1x.P(objJ);
            String strA = this.e.a();
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                axq.t(x1x.D((a570) it.next()), arrayList);
            }
            this.b.getClass();
            String strA2 = this.g.a();
            c0bVar2.k = 1;
            objJ = this.f5259a.j(strA, arrayList, 22, strA2, c0bVar2);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        return x4d0.h0((h0b) objJ, iun.f15405a);
    }
}
