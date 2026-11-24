package a;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pjv implements trn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3v f27108a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public ncs0 j;
    public ojv k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final y850 d = new y850(7);
    public final y850 e = new y850(8);
    public final y850 f = new y850(6);
    public long m = -9223372036854775807L;
    public final fq80 o = new fq80();

    public pjv(y3v y3vVar, boolean z, boolean z2) {
        this.f27108a = y3vVar;
        this.b = z;
        this.c = z2;
    }

    @Override // a.trn
    public final void a(fq80 fq80Var) {
        int i;
        this.j.getClass();
        String str = vtt0.f38024a;
        int i2 = fq80Var.b;
        int i3 = fq80Var.c;
        byte[] bArr = fq80Var.f9961a;
        this.g += (long) fq80Var.a();
        this.j.a(fq80Var.a(), fq80Var);
        while (true) {
            int iA0 = ntr.a0(bArr, i2, i3, this.h);
            if (iA0 == i3) {
                this.h(bArr, i2, i3);
                return;
            }
            int i4 = bArr[iA0 + 3] & 31;
            if (iA0 <= 0 || bArr[iA0 - 1] != 0) {
                i = 3;
            } else {
                iA0--;
                i = 4;
            }
            int i5 = iA0 - i2;
            if (i5 > 0) {
                this.h(bArr, i2, iA0);
            }
            int i6 = i3 - iA0;
            long j = this.g - ((long) i6);
            pjv pjvVar = this;
            pjvVar.b(i6, i5 < 0 ? -i5 : 0, j, this.m);
            pjvVar.i(i4, j, pjvVar.m);
            i2 = iA0 + i;
            this = pjvVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0202  */
    /* JADX WARN: Code duplicated, block: B:92:0x023f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(int i, int i2, long j, long j2) {
        long j3;
        int i3;
        long j4;
        long j5;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        fp fpVar = (fp) this.f27108a.d;
        if (!this.l || this.k.c) {
            y850 y850Var = this.d;
            y850Var.b(i2);
            y850 y850Var2 = this.e;
            y850Var2.b(i2);
            boolean z4 = this.l;
            boolean z5 = y850Var.c;
            if (z4) {
                if (z5) {
                    f950 f950VarP0 = ntr.p0(y850Var.d, 3, y850Var.e);
                    fpVar.O(f950VarP0.s);
                    this.k.d.append(f950VarP0.d, f950VarP0);
                    y850Var.c();
                } else if (y850Var2.c) {
                    z55 z55Var = new z55(y850Var2.d, 4, y850Var2.e);
                    int iK = z55Var.k();
                    int iK2 = z55Var.k();
                    z55Var.u();
                    this.k.e.append(iK, new e950(iK, iK2, z55Var.i()));
                    y850Var2.c();
                }
            } else if (z5 && y850Var2.c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(y850Var.d, y850Var.e));
                arrayList.add(Arrays.copyOf(y850Var2.d, y850Var2.e));
                f950 f950VarP1 = ntr.p0(y850Var.d, 3, y850Var.e);
                int i8 = f950VarP1.s;
                z55 z55Var2 = new z55(y850Var2.d, 4, y850Var2.e);
                int iK3 = z55Var2.k();
                int iK4 = z55Var2.k();
                z55Var2.u();
                e950 e950Var = new e950(iK3, iK4, z55Var2.i());
                int i9 = f950VarP1.f9139a;
                int i10 = f950VarP1.b;
                int i11 = f950VarP1.c;
                byte[] bArr = jyc.f17352a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
                ncs0 ncs0Var = this.j;
                awq awqVar = new awq();
                awqVar.f1587a = this.i;
                awqVar.n = mg40.n("video/mp2t");
                awqVar.o = mg40.n("video/avc");
                awqVar.k = str;
                awqVar.v = f950VarP1.e;
                awqVar.w = f950VarP1.f;
                awqVar.G = new c4d(f950VarP1.p, f950VarP1.q, f950VarP1.r, null, f950VarP1.h + 8, f950VarP1.i + 8);
                awqVar.D = f950VarP1.g;
                awqVar.r = arrayList;
                awqVar.q = i8;
                ohs0.w(awqVar, ncs0Var);
                this.l = true;
                fpVar.O(i8);
                this.k.d.append(f950VarP1.d, f950VarP1);
                this.k.e.append(iK3, e950Var);
                y850Var.c();
                y850Var2.c();
            }
        }
        y850 y850Var3 = this.f;
        if (y850Var3.b(i2)) {
            int iW0 = ntr.w0(y850Var3.d, y850Var3.e);
            byte[] bArr2 = y850Var3.d;
            fq80 fq80Var = this.o;
            fq80Var.K(bArr2, iW0);
            fq80Var.M(4);
            fpVar.a(j2, fq80Var);
        }
        ojv ojvVar = this.k;
        boolean z6 = this.l;
        if (ojvVar.i == 9) {
            if (z6 && ojvVar.o) {
                j3 = ojvVar.j;
                i3 = i + ((int) (j - j3));
                j4 = ojvVar.q;
                if (j4 != -9223372036854775807L) {
                    j5 = ojvVar.p;
                    if (j3 != j5) {
                        ojvVar.f25379a.b(j4, ojvVar.r ? 1 : 0, (int) (j3 - j5), i3, null);
                    }
                }
            }
            ojvVar.p = ojvVar.j;
            ojvVar.q = ojvVar.l;
            ojvVar.r = false;
            ojvVar.o = true;
        } else if (ojvVar.c) {
            njv njvVar = ojvVar.n;
            njv njvVar2 = ojvVar.m;
            if (njvVar.f23654a) {
                if (njvVar2.f23654a) {
                    f950 f950Var = njvVar.c;
                    f950Var.getClass();
                    f950 f950Var2 = njvVar2.c;
                    f950Var2.getClass();
                    int i12 = f950Var2.m;
                    if (njvVar.f != njvVar2.f || njvVar.g != njvVar2.g || njvVar.h != njvVar2.h || ((njvVar.i && njvVar2.i && njvVar.j != njvVar2.j) || (((i5 = njvVar.d) != (i6 = njvVar2.d) && (i5 == 0 || i6 == 0)) || (((i7 = f950Var.m) == 0 && i12 == 0 && (njvVar.m != njvVar2.m || njvVar.n != njvVar2.n)) || ((i7 == 1 && i12 == 1 && (njvVar.o != njvVar2.o || njvVar.p != njvVar2.p)) || (z3 = njvVar.k) != njvVar2.k || (z3 && njvVar.l != njvVar2.l)))))) {
                        if (z6) {
                            j3 = ojvVar.j;
                            i3 = i + ((int) (j - j3));
                            j4 = ojvVar.q;
                            if (j4 != -9223372036854775807L) {
                                j5 = ojvVar.p;
                                if (j3 != j5) {
                                    ojvVar.f25379a.b(j4, ojvVar.r ? 1 : 0, (int) (j3 - j5), i3, null);
                                }
                            }
                        }
                        ojvVar.p = ojvVar.j;
                        ojvVar.q = ojvVar.l;
                        ojvVar.r = false;
                        ojvVar.o = true;
                    }
                } else {
                    if (z6) {
                        j3 = ojvVar.j;
                        i3 = i + ((int) (j - j3));
                        j4 = ojvVar.q;
                        if (j4 != -9223372036854775807L) {
                            j5 = ojvVar.p;
                            if (j3 != j5) {
                                ojvVar.f25379a.b(j4, ojvVar.r ? 1 : 0, (int) (j3 - j5), i3, null);
                            }
                        }
                    }
                    ojvVar.p = ojvVar.j;
                    ojvVar.q = ojvVar.l;
                    ojvVar.r = false;
                    ojvVar.o = true;
                }
            }
        }
        if (ojvVar.b) {
            njv njvVar3 = ojvVar.n;
            z = njvVar3.b && ((i4 = njvVar3.e) == 7 || i4 == 2);
        } else {
            z = ojvVar.s;
        }
        boolean z7 = ojvVar.r;
        int i13 = ojvVar.i;
        if (i13 == 5) {
            z2 = true;
        } else if (z) {
            z2 = true;
            if (i13 != 1) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z8 = z7 | z2;
        ojvVar.r = z8;
        ojvVar.i = 24;
        if (z8) {
            this.n = false;
        }
    }

    @Override // a.trn
    public final void c() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        ntr.Y(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        ((fp) this.f27108a.d).v(0);
        ojv ojvVar = this.k;
        if (ojvVar != null) {
            ojvVar.k = false;
            ojvVar.o = false;
            njv njvVar = ojvVar.n;
            njvVar.b = false;
            njvVar.f23654a = false;
        }
    }

    @Override // a.trn
    public final void d() {
        this.j.getClass();
        String str = vtt0.f38024a;
        ((fp) this.f27108a.d).v(0);
        b(0, 0, this.g, this.m);
        i(9, this.g, this.m);
        b(0, 0, this.g, this.m);
    }

    @Override // a.trn
    public final void e(huo huoVar, zrs0 zrs0Var) {
        zrs0Var.a();
        zrs0Var.b();
        this.i = zrs0Var.e;
        zrs0Var.b();
        ncs0 ncs0VarQ = huoVar.q(zrs0Var.d, 2);
        this.j = ncs0VarQ;
        this.k = new ojv(ncs0VarQ, this.b, this.c);
        this.f27108a.b(huoVar, zrs0Var);
    }

    @Override // a.trn
    public final void g(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0139  */
    public final void h(byte[] bArr, int i, int i2) {
        boolean zI;
        boolean zI2;
        boolean z;
        boolean z2;
        int iK;
        int i3;
        int iJ;
        int i4;
        int iM;
        int iM2;
        if (!this.l || this.k.c) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        ojv ojvVar = this.k;
        SparseArray sparseArray = ojvVar.e;
        z55 z55Var = ojvVar.f;
        if (ojvVar.k) {
            int i5 = i2 - i;
            byte[] bArrCopyOf = ojvVar.g;
            int length = bArrCopyOf.length;
            int i6 = ojvVar.h + i5;
            if (length < i6) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6 * 2);
                ojvVar.g = bArrCopyOf;
            }
            System.arraycopy(bArr, i, bArrCopyOf, ojvVar.h, i5);
            int i7 = ojvVar.h + i5;
            ojvVar.h = i7;
            z55Var.f = ojvVar.g;
            z55Var.c = 0;
            z55Var.d = 0;
            z55Var.b = i7;
            z55Var.e = 0;
            z55Var.a();
            if (z55Var.c(8)) {
                z55Var.u();
                int iJ2 = z55Var.j(2);
                z55Var.v(5);
                if (z55Var.d()) {
                    z55Var.k();
                    if (z55Var.d()) {
                        int iK2 = z55Var.k();
                        if (!ojvVar.c) {
                            ojvVar.k = false;
                            njv njvVar = ojvVar.n;
                            njvVar.e = iK2;
                            njvVar.b = true;
                            return;
                        }
                        if (z55Var.d()) {
                            int iK3 = z55Var.k();
                            if (sparseArray.indexOfKey(iK3) < 0) {
                                ojvVar.k = false;
                                return;
                            }
                            e950 e950Var = (e950) sparseArray.get(iK3);
                            SparseArray sparseArray2 = ojvVar.d;
                            int i8 = e950Var.f7405a;
                            boolean z3 = e950Var.b;
                            f950 f950Var = (f950) sparseArray2.get(i8);
                            boolean z4 = f950Var.j;
                            int i9 = f950Var.n;
                            int i10 = f950Var.l;
                            if (z4) {
                                if (!z55Var.c(2)) {
                                    return;
                                } else {
                                    z55Var.v(2);
                                }
                            }
                            if (z55Var.c(i10)) {
                                int iJ3 = z55Var.j(i10);
                                if (!f950Var.k) {
                                    if (z55Var.c(1)) {
                                        zI = z55Var.i();
                                        if (!zI) {
                                            zI2 = false;
                                        } else {
                                            if (!z55Var.c(1)) {
                                                return;
                                            }
                                            zI2 = z55Var.i();
                                            z = true;
                                        }
                                        if (ojvVar.i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iK = 0;
                                        } else if (!z55Var.d()) {
                                            return;
                                        } else {
                                            iK = z55Var.k();
                                        }
                                        i3 = f950Var.m;
                                        if (i3 != 0) {
                                            if (z55Var.c(i9)) {
                                                iJ = z55Var.j(i9);
                                                if (!z3 && !zI) {
                                                    if (!z55Var.d()) {
                                                        return;
                                                    }
                                                    iM2 = z55Var.m();
                                                    i4 = 0;
                                                }
                                                iM = 0;
                                                njv njvVar2 = ojvVar.n;
                                                njvVar2.c = f950Var;
                                                njvVar2.d = iJ2;
                                                njvVar2.e = iK2;
                                                njvVar2.f = iJ3;
                                                njvVar2.g = iK3;
                                                njvVar2.h = zI;
                                                njvVar2.i = z;
                                                njvVar2.j = zI2;
                                                njvVar2.k = z2;
                                                njvVar2.l = iK;
                                                njvVar2.m = iJ;
                                                njvVar2.n = iM2;
                                                njvVar2.o = i4;
                                                njvVar2.p = iM;
                                                njvVar2.f23654a = true;
                                                njvVar2.b = true;
                                                ojvVar.k = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || f950Var.o) {
                                            iJ = 0;
                                        } else {
                                            if (!z55Var.d()) {
                                                return;
                                            }
                                            int iM3 = z55Var.m();
                                            if (!z3 || zI) {
                                                i4 = iM3;
                                                iJ = 0;
                                                iM2 = 0;
                                                iM = 0;
                                            } else {
                                                if (!z55Var.d()) {
                                                    return;
                                                }
                                                iM = z55Var.m();
                                                iM2 = 0;
                                                i4 = iM3;
                                                iJ = 0;
                                            }
                                        }
                                        njv njvVar3 = ojvVar.n;
                                        njvVar3.c = f950Var;
                                        njvVar3.d = iJ2;
                                        njvVar3.e = iK2;
                                        njvVar3.f = iJ3;
                                        njvVar3.g = iK3;
                                        njvVar3.h = zI;
                                        njvVar3.i = z;
                                        njvVar3.j = zI2;
                                        njvVar3.k = z2;
                                        njvVar3.l = iK;
                                        njvVar3.m = iJ;
                                        njvVar3.n = iM2;
                                        njvVar3.o = i4;
                                        njvVar3.p = iM;
                                        njvVar3.f23654a = true;
                                        njvVar3.b = true;
                                        ojvVar.k = false;
                                        i4 = 0;
                                        iM2 = 0;
                                        iM = 0;
                                        njv njvVar4 = ojvVar.n;
                                        njvVar4.c = f950Var;
                                        njvVar4.d = iJ2;
                                        njvVar4.e = iK2;
                                        njvVar4.f = iJ3;
                                        njvVar4.g = iK3;
                                        njvVar4.h = zI;
                                        njvVar4.i = z;
                                        njvVar4.j = zI2;
                                        njvVar4.k = z2;
                                        njvVar4.l = iK;
                                        njvVar4.m = iJ;
                                        njvVar4.n = iM2;
                                        njvVar4.o = i4;
                                        njvVar4.p = iM;
                                        njvVar4.f23654a = true;
                                        njvVar4.b = true;
                                        ojvVar.k = false;
                                    }
                                    return;
                                }
                                zI = false;
                                zI2 = false;
                                z = zI2;
                                if (ojvVar.i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iK = 0;
                                } else if (!z55Var.d()) {
                                    return;
                                } else {
                                    iK = z55Var.k();
                                }
                                i3 = f950Var.m;
                                if (i3 != 0) {
                                    if (i3 == 1) {
                                    }
                                    iJ = 0;
                                } else {
                                    if (z55Var.c(i9)) {
                                        return;
                                    }
                                    iJ = z55Var.j(i9);
                                    if (!z3) {
                                    }
                                }
                                i4 = 0;
                                iM2 = 0;
                                iM = 0;
                                njv njvVar5 = ojvVar.n;
                                njvVar5.c = f950Var;
                                njvVar5.d = iJ2;
                                njvVar5.e = iK2;
                                njvVar5.f = iJ3;
                                njvVar5.g = iK3;
                                njvVar5.h = zI;
                                njvVar5.i = z;
                                njvVar5.j = zI2;
                                njvVar5.k = z2;
                                njvVar5.l = iK;
                                njvVar5.m = iJ;
                                njvVar5.n = iM2;
                                njvVar5.o = i4;
                                njvVar5.p = iM;
                                njvVar5.f23654a = true;
                                njvVar5.b = true;
                                ojvVar.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void i(int i, long j, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        ojv ojvVar = this.k;
        boolean z = this.n;
        ojvVar.i = i;
        ojvVar.l = j2;
        ojvVar.j = j;
        ojvVar.s = z;
        if (!ojvVar.b || i != 1) {
            if (!ojvVar.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        njv njvVar = ojvVar.m;
        ojvVar.m = ojvVar.n;
        ojvVar.n = njvVar;
        njvVar.b = false;
        njvVar.f23654a = false;
        ojvVar.h = 0;
        ojvVar.k = true;
    }
}
