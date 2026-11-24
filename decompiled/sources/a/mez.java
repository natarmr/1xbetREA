package a;

import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mez implements bch0 {
    public static final v0h0 x = qxw.L(new z8z(8), new hvy(18));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21671a;
    public fez b;
    public final hhk c;
    public final pz40 d = androidx.compose.runtime.e.d(gez.f11179a, m2a.v);
    public final zz2 e = new zz2((byte) 11);
    public final pz40 f;
    public final pz40 g;
    public e7z h;
    public final a9z i;
    public final la5 j;
    public final hru k;
    public final boolean l;
    public final tbz m;
    public final ywj n;
    public float o;
    public int p;
    public final ey40 q;
    public final gy40 r;
    public final qbz s;
    public final dbz t;
    public final pz40 u;
    public final pz40 v;
    public final ieu w;

    public mez(int[] iArr, int[] iArr2) {
        this.c = new hhk(iArr, iArr2, new ens(2, this, mez.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0, (byte) 21));
        Boolean bool = Boolean.FALSE;
        this.f = androidx.compose.runtime.e.e(bool);
        this.g = androidx.compose.runtime.e.e(bool);
        this.i = new a9z(this, (byte) 2);
        this.j = new la5();
        this.k = new hru((byte) 25);
        this.l = true;
        this.m = new tbz(null);
        this.n = new ywj(new ebz(this, (byte) 8));
        this.p = -1;
        ey40 ey40Var = hkx.f13229a;
        this.q = new ey40();
        this.r = new gy40();
        this.s = new qbz();
        this.t = new dbz();
        this.u = m8x.J();
        this.v = m8x.J();
        this.w = new ieu((byte) 23);
    }

    @Override // a.bch0
    public final boolean a() {
        return this.n.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r6.n.b(r7, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // a.bch0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(a.c050 r7, kotlin.jvm.functions.Function2 r8, a.yje r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof a.lez
            if (r0 == 0) goto L13
            r0 = r9
            a.lez r0 = (a.lez) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.lez r0 = new a.lez
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r9)
            goto L6c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            a.bnn0 r7 = r0.j
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            a.c050 r7 = r0.i
            a.z1x.P(r9)
            goto L5d
        L3c:
            a.z1x.P(r9)
            a.pz40 r9 = r6.d
            a.hgk0 r9 = (a.hgk0) r9
            java.lang.Object r9 = r9.getValue()
            a.fez r2 = a.gez.f11179a
            if (r9 != r2) goto L5d
            r0.i = r7
            r9 = r8
            a.bnn0 r9 = (a.bnn0) r9
            r0.j = r9
            r0.m = r5
            a.la5 r9 = r6.j
            java.lang.Object r9 = r9.i(r0)
            if (r9 != r1) goto L5d
            goto L6b
        L5d:
            r0.i = r3
            r0.j = r3
            r0.m = r4
            a.ywj r6 = r6.n
            java.lang.Object r6 = r6.b(r7, r8, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mez.b(a.c050, kotlin.jvm.functions.Function2, a.yje):java.lang.Object");
    }

    @Override // a.bch0
    public final boolean c() {
        return ((Boolean) ((hgk0) this.g).getValue()).booleanValue();
    }

    @Override // a.bch0
    public final boolean d() {
        return ((Boolean) ((hgk0) this.f).getValue()).booleanValue();
    }

    @Override // a.bch0
    public final float e(float f) {
        return this.n.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x014a A[LOOP:1: B:62:0x010e->B:72:0x014a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x014e A[EDGE_INSN: B:95:0x014e->B:73:0x014e BREAK  A[LOOP:1: B:62:0x010e->B:72:0x014a], SYNTHETIC] */
    public final void f(fez fezVar, boolean z, boolean z2) {
        Object obj;
        Function1 function1E;
        hhk hhkVar = this.c;
        ieu ieuVar = this.w;
        if (!z && this.f21671a) {
            this.b = fezVar;
            rfk0 rfk0VarJ = vdx.J();
            function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
            try {
                if (ieuVar.o() && Arrays.equals(fezVar.f9428a, (int[]) hhkVar.c) && Arrays.equals(fezVar.b, (int[]) hhkVar.e)) {
                    ieuVar.q();
                }
                return;
            } finally {
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            }
        }
        if (z) {
            this.f21671a = true;
        }
        float f = this.o;
        float f2 = fezVar.c;
        List list = fezVar.m;
        int[] iArr = fezVar.f9428a;
        int[] iArr2 = fezVar.b;
        this.o = f - f2;
        ((hgk0) this.d).setValue(fezVar);
        if (z2) {
            hhkVar.e = iArr2;
            ((cgk0) hhkVar.f).m(hhk.c((int[]) hhkVar.c, iArr2));
        } else {
            hhkVar.getClass();
            int iB = hhk.b(iArr);
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i);
                if (((hez) obj).f12949a == iB) {
                    break;
                } else {
                    i++;
                }
            }
            hez hezVar = (hez) obj;
            hhkVar.g = hezVar != null ? hezVar.b : null;
            ((lbz) hhkVar.h).b(iB);
            if (hhkVar.f13068a || fezVar.l > 0) {
                hhkVar.f13068a = true;
                rfk0 rfk0VarJ2 = vdx.J();
                function1E = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                try {
                    hhkVar.c = iArr;
                    ((cgk0) hhkVar.d).m(hhk.b(iArr));
                    hhkVar.e = iArr2;
                    ((cgk0) hhkVar.f).m(hhk.c(iArr, iArr2));
                    vdx.Y(rfk0VarJ2, rfk0VarW2, function1E);
                } catch (Throwable th) {
                    vdx.Y(rfk0VarJ2, rfk0VarW2, function1E);
                    throw th;
                }
            }
            if (this.p != -1 && !list.isEmpty()) {
                int i2 = ((hez) CollectionsKt.U(list)).f12949a;
                int i3 = ((hez) CollectionsKt.d0(list)).f12949a;
                int i4 = this.p;
                if (i2 > i4 || i4 > i3) {
                    this.p = -1;
                    ey40 ey40Var = this.q;
                    Object[] objArr = ey40Var.c;
                    long[] jArr = ey40Var.f11466a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j & 255) < 128) {
                                        ((sbz) objArr[(i5 << 3) + i7]).cancel();
                                    }
                                    j >>= 8;
                                }
                                if (i6 != 8) {
                                    break;
                                } else if (i5 != length) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                    ey40Var.c();
                }
            }
        }
        ((hgk0) this.g).setValue(Boolean.valueOf(iArr[0] != 0 || iArr2[0] > 0));
        ((hgk0) this.f).setValue(Boolean.valueOf(fezVar.f));
        if (z) {
            ieuVar.s(fezVar.e, fezVar.k, fezVar.t);
        }
    }

    public final int g() {
        return ((cgk0) this.c.d).l();
    }

    public final int h() {
        return ((cgk0) this.c.f).l();
    }

    public final fez i() {
        return (fez) ((hgk0) this.d).getValue();
    }

    public final void j(float f, fez fezVar) {
        ey40 ey40Var;
        int iO;
        int i;
        long jH;
        if (!this.l || fezVar.m.isEmpty()) {
            return;
        }
        boolean z = f < 0.0f;
        List list = fezVar.m;
        int i2 = z ? ((hez) CollectionsKt.d0(list)).f12949a : ((hez) CollectionsKt.U(list)).f12949a;
        if (i2 == this.p) {
            return;
        }
        this.p = i2;
        int[] iArr = pkx.f27156a;
        fy40 fy40Var = new fy40();
        kez kezVar = fezVar.i;
        int[] iArr2 = kezVar.b;
        int length = iArr2.length;
        int i3 = 0;
        while (true) {
            ey40Var = this.q;
            if (i3 >= length) {
                break;
            }
            zz2 zz2Var = this.e;
            if (z) {
                iO = i2 + 1;
                int length2 = zz2Var.f45232a + ((int[]) zz2Var.b).length;
                while (true) {
                    if (iO >= length2) {
                        iO = zz2Var.f45232a + ((int[]) zz2Var.b).length;
                        break;
                    } else if (zz2Var.d(iO, i3)) {
                        break;
                    } else {
                        iO++;
                    }
                }
            } else {
                iO = zz2Var.o(i2, i3);
            }
            int i4 = iO;
            if (i4 < 0 || i4 >= fezVar.l || fy40Var.c(i4)) {
                break;
            }
            fy40Var.b[fy40Var.d(i4)] = i4;
            if (!ey40Var.a(i4)) {
                boolean zQ = fezVar.j.q(i4);
                int i5 = zQ ? 0 : i3;
                int i6 = zQ ? length : 1;
                if (i6 == 1) {
                    i = iArr2[i5];
                } else {
                    int[] iArr3 = kezVar.f18173a;
                    int i7 = iArr3[i5];
                    int i8 = (i5 + i6) - 1;
                    i = (iArr3[i8] + iArr2[i8]) - i7;
                }
                if (fezVar.u == ma80.f21447a) {
                    if (i < 0) {
                        zcx.a("width must be >= 0");
                    }
                    jH = r4e.h(i, i, 0, Integer.MAX_VALUE);
                } else {
                    if (i < 0) {
                        zcx.a("height must be >= 0");
                    }
                    jH = r4e.h(0, Integer.MAX_VALUE, i, i);
                }
                ey40Var.j(i4, this.m.a(i4, jH, null, true));
            }
            i3++;
            i2 = i4;
        }
        long[] jArr = ey40Var.f11466a;
        int length3 = jArr.length - 2;
        if (length3 < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j = jArr[i9];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length3)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i9 << 3) + i11;
                        int i13 = ey40Var.b[i12];
                        sbz sbzVar = (sbz) ey40Var.c[i12];
                        boolean zC = fy40Var.c(i13);
                        if (!zC) {
                            sbzVar.cancel();
                        }
                        if (!zC) {
                            ey40Var.i(i12);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length3) {
                return;
            } else {
                i9++;
            }
        }
    }

    public final Object k(int i, int i2, yje yjeVar) {
        Object objB = b(c050.f3507a, new c9z(this, i, i2, null, (byte) 2), yjeVar);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }
}
