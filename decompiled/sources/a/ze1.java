package a;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ze1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public long k;
    public Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze1(lf8 lf8Var, a570 a570Var, String str, String str2, long j, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.l = lf8Var;
        this.m = a570Var;
        this.n = str;
        this.o = str2;
        this.k = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0144, code lost:
    
        if (r0 == r1) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ze1.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r4.F(r10, r9) == r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r10) {
        /*
            r9 = this;
            long r0 = r9.k
            java.lang.Object r2 = r9.m
            r4 = r2
            a.g9b0 r4 = (a.g9b0) r4
            a.wne r2 = a.wne.f39444a
            byte r3 = r9.j
            r5 = 0
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L27
            if (r3 == r7) goto L23
            if (r3 != r6) goto L1d
            java.lang.Object r0 = r9.l
            a.a570 r0 = (a.a570) r0
            a.z1x.P(r10)
            r5 = r0
            goto L56
        L1d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r5
        L23:
            a.z1x.P(r10)
            goto L6e
        L27:
            a.z1x.P(r10)
            r4.w(r0)
            java.lang.Object r10 = r9.n
            a.mo60 r10 = (a.mo60) r10
            a.a570 r3 = r10.b
            if (r3 == 0) goto L71
            boolean r8 = r3 instanceof a.w470
            if (r8 == 0) goto L44
            r9.l = r5
            r9.j = r7
            java.lang.Object r9 = r4.F(r10, r9)
            if (r9 != r2) goto L6e
            goto L54
        L44:
            boolean r10 = r3 instanceof a.z470
            if (r10 == 0) goto L71
            a.z4u r10 = r4.n
            r9.l = r3
            r9.j = r6
            java.lang.Object r10 = r10.a(r0, r9)
            if (r10 != r2) goto L55
        L54:
            return r2
        L55:
            r5 = r3
        L56:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r7 = r7 ^ r10
            a.i1w0 r10 = r4.y
            java.lang.Object r9 = r9.o
            r6 = r9
            java.lang.String r6 = (java.lang.String) r6
            a.t13 r3 = new a.t13
            r8 = 18
            r3.<init>(r4, r5, r6, r7, r8)
            r10.d(r3)
        L6e:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        L71:
            a.t9f.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ze1.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b5  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cd, code lost:
    
        if (r0 == r9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ze1.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00db A[LOOP:0: B:43:0x00d2->B:45:0x00db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5 A[SYNTHETIC] */
    private final Object r(Object obj) {
        long j;
        Object objK;
        Object next;
        lz60 lz60VarA;
        long j2;
        String str;
        hds hdsVar;
        i1w0 i1w0Var;
        ListIterator listIteratorO;
        paw pawVar;
        fho0 fho0Var = (fho0) this.n;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            j = ((u4s) this.m).f35067a;
            lbu lbuVar = fho0Var.w0;
            this.k = j;
            this.j = (byte) 1;
            objK = lbu.k(lbuVar, 0, this, 3);
            if (objK != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            j = this.k;
            z1x.P(obj);
            objK = obj;
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = this.k;
            String str2 = (String) this.l;
            z1x.P(obj);
            str = str2;
            j2 = j3;
        }
        i1w0Var = fho0Var.y;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        k0w0VarI.h(oct.f(fho0Var.n, j2, null, 0, null, str, 14));
        listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            pawVar = (paw) listIteratorO;
            if (pawVar.hasNext()) {
                return Unit.f46060a;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
        long j4 = j;
        Iterator it = ((Iterable) objK).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((pbv) next).f26728a != j4);
        pbv pbvVar = (pbv) next;
        String string = (pbvVar != null ? pbvVar.e : null) instanceof z470 ? UUID.randomUUID().toString() : "";
        string.getClass();
        if (pbvVar == null || (hdsVar = pbvVar.n) == null || (lz60VarA = hdsVar.a((String) this.o)) == null) {
            lz60VarA = jz60.f17395a;
        }
        lz60 lz60Var = lz60VarA;
        fho0Var.A.d(j4, zn60.MenuOneXGames, string, lz60Var);
        fho0Var.C.d((int) j4, y1p.MENU_ONE_XGAMES, string, lz60Var);
        ls lsVar = fho0Var.j;
        this.l = string;
        this.k = j4;
        this.j = (byte) 2;
        if (lsVar.b(j4, this) != wneVar) {
            j2 = j4;
            str = string;
            i1w0Var = fho0Var.y;
            k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
            k0w0VarI2.h(oct.f(fho0Var.n, j2, null, 0, null, str, 14));
            listIteratorO = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
            while (true) {
                pawVar = (paw) listIteratorO;
                if (pawVar.hasNext()) {
                    return Unit.f46060a;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00de A[LOOP:0: B:45:0x00d5->B:47:0x00de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8 A[EDGE_INSN: B:50:0x00e8->B:48:0x00e8 BREAK  A[LOOP:0: B:45:0x00d5->B:47:0x00de], SYNTHETIC] */
    private final Object s(Object obj) {
        Object objK;
        Object next;
        lz60 lz60VarA;
        long j;
        String str;
        hds hdsVar;
        i1w0 i1w0Var;
        ListIterator listIteratorO;
        paw pawVar;
        u4s u4sVar = (u4s) this.o;
        rio0 rio0Var = (rio0) this.m;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            lbu lbuVar = rio0Var.d;
            this.j = (byte) 1;
            objK = lbu.k(lbuVar, 0, this, 3);
            if (objK != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
            objK = obj;
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j2 = this.k;
            String str2 = (String) this.l;
            z1x.P(obj);
            str = str2;
            j = j2;
        }
        i1w0Var = rio0Var.z;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        k0w0VarI.h(oct.f(rio0Var.o, j, null, 0, null, str, 14));
        listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            pawVar = (paw) listIteratorO;
            if (pawVar.hasNext()) {
                break;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
        return Unit.f46060a;
        Iterator it = ((List) objK).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((pbv) next).f26728a != u4sVar.f35067a);
        pbv pbvVar = (pbv) next;
        String string = (pbvVar != null ? pbvVar.e : null) instanceof z470 ? UUID.randomUUID().toString() : "";
        string.getClass();
        if (pbvVar == null || (hdsVar = pbvVar.n) == null || (lz60VarA = hdsVar.a((String) this.n)) == null) {
            lz60VarA = jz60.f17395a;
        }
        lz60 lz60Var = lz60VarA;
        if (pbvVar != null && !pbvVar.p) {
            long j3 = u4sVar.f35067a;
            rio0Var.B.d(j3, zn60.MenuOneXGames, string, lz60Var);
            rio0Var.D.d((int) j3, y1p.MENU_ONE_XGAMES, string, lz60Var);
            ls lsVar = rio0Var.k;
            this.l = string;
            this.k = j3;
            this.j = (byte) 2;
            if (lsVar.b(j3, this) != wneVar) {
                j = j3;
                str = string;
                i1w0Var = rio0Var.z;
                k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI2.h(oct.f(rio0Var.o, j, null, 0, null, str, 14));
                listIteratorO = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                while (true) {
                    pawVar = (paw) listIteratorO;
                    if (pawVar.hasNext()) {
                        break;
                        break;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
            return wneVar;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00db A[LOOP:0: B:43:0x00d2->B:45:0x00db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5 A[SYNTHETIC] */
    private final Object t(Object obj) {
        long j;
        Object objK;
        Object next;
        lz60 lz60VarA;
        long j2;
        String str;
        hds hdsVar;
        i1w0 i1w0Var;
        ListIterator listIteratorO;
        paw pawVar;
        xtq0 xtq0Var = (xtq0) this.n;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            j = ((u4s) this.m).f35067a;
            lbu lbuVar = xtq0Var.v0;
            this.k = j;
            this.j = (byte) 1;
            objK = lbu.k(lbuVar, 0, this, 3);
            if (objK != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            j = this.k;
            z1x.P(obj);
            objK = obj;
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = this.k;
            String str2 = (String) this.l;
            z1x.P(obj);
            str = str2;
            j2 = j3;
        }
        i1w0Var = xtq0Var.y;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        k0w0VarI.h(oct.f(xtq0Var.n, j2, null, 0, null, str, 14));
        listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            pawVar = (paw) listIteratorO;
            if (pawVar.hasNext()) {
                return Unit.f46060a;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
        long j4 = j;
        Iterator it = ((Iterable) objK).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((pbv) next).f26728a != j4);
        pbv pbvVar = (pbv) next;
        String string = (pbvVar != null ? pbvVar.e : null) instanceof z470 ? UUID.randomUUID().toString() : "";
        string.getClass();
        if (pbvVar == null || (hdsVar = pbvVar.n) == null || (lz60VarA = hdsVar.a((String) this.o)) == null) {
            lz60VarA = jz60.f17395a;
        }
        lz60 lz60Var = lz60VarA;
        xtq0Var.A.d(j4, zn60.MenuOneXGames, string, lz60Var);
        xtq0Var.C.d((int) j4, y1p.MENU_ONE_XGAMES, string, lz60Var);
        ls lsVar = xtq0Var.j;
        this.l = string;
        this.k = j4;
        this.j = (byte) 2;
        if (lsVar.b(j4, this) != wneVar) {
            j2 = j4;
            str = string;
            i1w0Var = xtq0Var.y;
            k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
            k0w0VarI2.h(oct.f(xtq0Var.n, j2, null, 0, null, str, 14));
            listIteratorO = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
            while (true) {
                pawVar = (paw) listIteratorO;
                if (pawVar.hasNext()) {
                    return Unit.f46060a;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        }
        return wneVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                ze1 ze1Var = new ze1(obj2, this.k, yjeVar, (byte) 0);
                ze1Var.n = obj;
                return ze1Var;
            case 1:
                return new ze1((lf8) this.l, (a570) this.m, (String) this.n, (String) obj2, this.k, yjeVar);
            case 2:
                ze1 ze1Var2 = new ze1(this.n, this.k, obj2, yjeVar, (byte) 2);
                ze1Var2.m = obj;
                return ze1Var2;
            case 3:
                ze1 ze1Var3 = new ze1((kki) this.l, (String) this.n, (String) obj2, this.k, yjeVar);
                ze1Var3.m = obj;
                return ze1Var3;
            case 4:
                ze1 ze1Var4 = new ze1(obj2, this.k, yjeVar, (byte) 4);
                ze1Var4.m = obj;
                return ze1Var4;
            case 5:
                ze1 ze1Var5 = new ze1(this.n, this.k, obj2, yjeVar, (byte) 5);
                ze1Var5.m = obj;
                return ze1Var5;
            case 6:
                return new ze1(this.m, this.n, obj2, yjeVar, (byte) 6);
            case 7:
                ze1 ze1Var6 = new ze1((tyc) this.l, (ah80) this.n, (tn30) obj2, yjeVar);
                ze1Var6.m = obj;
                return ze1Var6;
            case 8:
                return new ze1((u4s) this.l, (pm60) this.m, (String) this.n, (String) obj2, yjeVar);
            case 9:
                return new ze1((db90) this.m, (String) this.n, (k790) obj2, this.k, yjeVar);
            case 10:
                return new ze1((g9b0) this.m, this.k, (mo60) this.n, (String) obj2, yjeVar);
            case 11:
                ze1 ze1Var7 = new ze1(this.n, this.k, obj2, yjeVar, (byte) 11);
                ze1Var7.m = obj;
                return ze1Var7;
            case 12:
                return new ze1((xxj0) obj2, yjeVar);
            case 13:
                return new ze1(this.m, this.n, obj2, yjeVar, (byte) 13);
            case 14:
                return new ze1(this.m, this.n, obj2, yjeVar, (byte) 14);
            case 15:
                return new ze1(this.m, this.n, obj2, yjeVar, (byte) 15);
            default:
                ze1 ze1Var8 = new ze1((t33) this.l, (o6s0) this.n, this.k, (sjj) obj2, yjeVar);
                ze1Var8.m = obj;
                return ze1Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ze1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ze1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ze1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ze1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ze1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ze1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ze1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ze1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((ze1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((ze1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((ze1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((ze1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((ze1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((ze1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((ze1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((ze1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ze1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x025a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0268 A[PHI: r1 r2 r4 r9 r13
  0x0268: PHI (r1v110 byte) = (r1v0 byte), (r1v111 byte) binds: [B:98:0x0247, B:103:0x0264] A[DONT_GENERATE, DONT_INLINE]
  0x0268: PHI (r2v69 int) = (r2v0 int), (r2v70 int) binds: [B:98:0x0247, B:103:0x0264] A[DONT_GENERATE, DONT_INLINE]
  0x0268: PHI (r4v162 java.lang.Object) = (r4v142 java.lang.Object), (r4v171 java.lang.Object) binds: [B:98:0x0247, B:103:0x0264] A[DONT_GENERATE, DONT_INLINE]
  0x0268: PHI (r9v14 byte) = (r9v0 byte), (r9v15 byte) binds: [B:98:0x0247, B:103:0x0264] A[DONT_GENERATE, DONT_INLINE]
  0x0268: PHI (r13v26 long) = (r13v15 long), (r13v27 long) binds: [B:98:0x0247, B:103:0x0264] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x026c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0271  */
    /* JADX WARN: Code duplicated, block: B:113:0x028b  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c5 A[PHI: r2 r4 r9 r13
  0x02c5: PHI (r2v65 int A[IMMUTABLE_TYPE]) = (r2v0 int), (r2v69 int) binds: [B:95:0x022e, B:119:0x02c1] A[DONT_GENERATE, DONT_INLINE]
  0x02c5: PHI (r4v146 java.lang.Object) = (r4v145 java.lang.Object), (r4v164 java.lang.Object) binds: [B:95:0x022e, B:119:0x02c1] A[DONT_GENERATE, DONT_INLINE]
  0x02c5: PHI (r9v7 byte) = (r9v0 byte), (r9v14 byte) binds: [B:95:0x022e, B:119:0x02c1] A[DONT_GENERATE, DONT_INLINE]
  0x02c5: PHI (r13v21 long) = (r13v18 long), (r13v26 long) binds: [B:95:0x022e, B:119:0x02c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02db  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:135:0x0303  */
    /* JADX WARN: Code duplicated, block: B:138:0x0309  */
    /* JADX WARN: Code duplicated, block: B:140:0x030e A[LOOP:1: B:139:0x030c->B:140:0x030e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x032e A[PHI: r13
  0x032e: PHI (r13v23 long) = (r13v20 long), (r13v21 long), (r13v21 long), (r13v24 long) binds: [B:145:0x032b, B:122:0x02cb, B:131:0x02e5, B:117:0x02b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x0348  */
    /* JADX WARN: Code duplicated, block: B:172:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:175:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:177:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:186:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:190:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:194:0x041f A[LOOP:2: B:192:0x0416->B:194:0x041f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x00bb A[PHI: r14
  0x00bb: PHI (r14v15 a.t33) = (r14v14 a.t33), (r14v16 a.t33) binds: [B:22:0x00b8, B:12:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:499:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:500:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:502:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:514:0x0afa  */
    /* JADX WARN: Code duplicated, block: B:515:0x0b01  */
    /* JADX WARN: Code duplicated, block: B:517:0x0b05  */
    /* JADX WARN: Code duplicated, block: B:518:0x0b0b  */
    /* JADX WARN: Code duplicated, block: B:559:0x0429 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x019d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x0339 -> B:149:0x033d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v22 java.lang.Object, still in use, count: 2, list:
          (r4v22 java.lang.Object) from 0x0af6: PHI (r4 I:??) = (r4v19 java.lang.Object), (r4v22 java.lang.Object) binds: [B:511:0x0af5, B:588:0x0af6] A[DONT_GENERATE, DONT_INLINE]
          (r4v22 java.lang.Object) from 0x0aec: CHECK_CAST (a.pbv) (r4v22 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 3056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ze1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze1(t33 t33Var, o6s0 o6s0Var, long j, sjj sjjVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        this.l = t33Var;
        this.n = o6s0Var;
        this.k = j;
        this.o = sjjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze1(tyc tycVar, ah80 ah80Var, tn30 tn30Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        this.l = tycVar;
        this.n = ah80Var;
        this.o = tn30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze1(kki kkiVar, String str, String str2, long j, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.l = kkiVar;
        this.n = str;
        this.o = str2;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze1(u4s u4sVar, pm60 pm60Var, String str, String str2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        this.l = u4sVar;
        this.m = pm60Var;
        this.n = str;
        this.o = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze1(db90 db90Var, String str, k790 k790Var, long j, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        this.m = db90Var;
        this.n = str;
        this.o = k790Var;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze1(g9b0 g9b0Var, long j, mo60 mo60Var, String str, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        this.m = g9b0Var;
        this.k = j;
        this.n = mo60Var;
        this.o = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze1(xxj0 xxj0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        this.o = xxj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze1(Object obj, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = obj;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze1(Object obj, long j, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = obj;
        this.k = j;
        this.o = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze1(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
    }
}
