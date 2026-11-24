package a;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class da5 implements fuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq80 f5731a;
    public final j6 b;
    public final boolean c;
    public final kwd d;
    public byte e;
    public huo f;
    public ea5 g;
    public long h;
    public bjc[] i;
    public long j;
    public bjc k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public da5(int i, kwd kwdVar) {
        this.d = kwdVar;
        this.c = (i & 1) == 0;
        this.f5731a = new fq80(12);
        this.b = new j6();
        this.f = new uuz();
        this.i = new bjc[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0113  */
    /* JADX WARN: Code duplicated, block: B:70:0x011c  */
    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) throws kq80 {
        boolean z;
        int i;
        bjc bjcVar;
        long j;
        int i2;
        bjc bjcVar2;
        int i3 = 0;
        if (this.j != -1) {
            long position = guoVar.getPosition();
            long j2 = this.j;
            if (j2 < position || j2 > 262144 + position) {
                mtcVar.f22363a = j2;
                z = true;
            } else {
                guoVar.m((int) (j2 - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.j = -1L;
        if (z) {
            return 1;
        }
        byte b = this.e;
        int i4 = 4;
        bjc bjcVar3 = null;
        j6 j6Var = this.b;
        int i5 = 2;
        fq80 fq80Var = this.f5731a;
        switch (b) {
            case 0:
                if (!c(guoVar)) {
                    throw kq80.a("AVI Header List not found", null);
                }
                guoVar.m(12);
                this.e = (byte) 1;
                return 0;
            case 1:
                guoVar.readFully(fq80Var.f9961a, 0, 12);
                fq80Var.M(0);
                j6Var.f15959a = fq80Var.o();
                j6Var.b = fq80Var.o();
                j6Var.c = 0;
                if (j6Var.f15959a != 1414744396) {
                    throw kq80.a("LIST expected, found: " + j6Var.f15959a, null);
                }
                int iO = fq80Var.o();
                j6Var.c = iO;
                if (iO == 1819436136) {
                    this.l = j6Var.b;
                    this.e = (byte) 2;
                    return 0;
                }
                throw kq80.a("hdrl expected, found: " + j6Var.c, null);
            case 2:
                int i6 = this.l - 4;
                fq80 fq80Var2 = new fq80(i6);
                guoVar.readFully(fq80Var2.f9961a, 0, i6);
                vc00 vc00VarB = vc00.b(1819436136, fq80Var2);
                int i7 = vc00VarB.b;
                if (i7 != 1819436136) {
                    throw kq80.a("Unexpected header list type " + i7, null);
                }
                ea5 ea5Var = (ea5) vc00VarB.a(ea5.class);
                if (ea5Var == null) {
                    throw kq80.a("AviHeader not found", null);
                }
                this.g = ea5Var;
                this.h = ((long) ea5Var.c) * ((long) ea5Var.f7450a);
                ArrayList arrayList = new ArrayList();
                v3x v3xVarListIterator = vc00VarB.f37165a.listIterator(0);
                int i8 = 0;
                while (v3xVarListIterator.hasNext()) {
                    ba5 ba5Var = (ba5) v3xVarListIterator.next();
                    if (ba5Var.getType() == 1819440243) {
                        vc00 vc00Var = (vc00) ba5Var;
                        int i9 = i8 + 1;
                        fa5 fa5Var = (fa5) vc00Var.a(fa5.class);
                        hrm0 hrm0Var = (hrm0) vc00Var.a(hrm0.class);
                        if (fa5Var == null) {
                            f1t0.g0("AviExtractor", "Missing Stream Header");
                        } else {
                            if (hrm0Var == null) {
                                f1t0.g0("AviExtractor", "Missing Stream Format");
                            } else {
                                long j3 = fa5Var.d;
                                long j4 = ((long) fa5Var.b) * 1000000;
                                i = i9;
                                long j5 = fa5Var.c;
                                String str = vtt0.f38024a;
                                long jT = vtt0.T(j3, j4, j5, RoundingMode.DOWN);
                                androidx.media3.common.b bVar = hrm0Var.f13539a;
                                awq awqVarA = bVar.a();
                                awqVarA.f1587a = Integer.toString(i8);
                                int i10 = fa5Var.e;
                                if (i10 != 0) {
                                    awqVarA.p = i10;
                                }
                                nrm0 nrm0Var = (nrm0) vc00Var.a(nrm0.class);
                                if (nrm0Var != null) {
                                    awqVarA.b = nrm0Var.f24009a;
                                }
                                int iH = mg40.h(bVar.p);
                                if (iH == 1 || iH == i5) {
                                    ncs0 ncs0VarQ = this.f.q(i8, iH);
                                    androidx.media3.common.b bVar2 = new androidx.media3.common.b(awqVarA);
                                    ncs0VarQ.c(bVar2);
                                    ncs0VarQ.f(jT);
                                    this.h = Math.max(this.h, jT);
                                    bjcVar = new bjc(i8, fa5Var, ncs0VarQ, mg40.a(bVar2.p, bVar2.l));
                                } else {
                                    bjcVar = null;
                                }
                            }
                            if (bjcVar != null) {
                                arrayList.add(bjcVar);
                            }
                            i8 = i;
                        }
                        i = i9;
                        bjcVar = null;
                        if (bjcVar != null) {
                            arrayList.add(bjcVar);
                        }
                        i8 = i;
                    }
                    i3 = 0;
                    i5 = 2;
                }
                int i11 = i3;
                this.i = (bjc[]) arrayList.toArray(new bjc[i11]);
                this.f.o();
                this.e = (byte) 3;
                return i11;
            case 3:
                if (this.m != -1) {
                    long position2 = guoVar.getPosition();
                    long j6 = this.m;
                    if (position2 != j6) {
                        this.j = j6;
                        return 0;
                    }
                }
                guoVar.n(fq80Var.f9961a, 0, 12);
                guoVar.g();
                fq80Var.M(0);
                j6Var.f15959a = fq80Var.o();
                j6Var.b = fq80Var.o();
                j6Var.c = 0;
                int iO2 = fq80Var.o();
                int i12 = j6Var.f15959a;
                if (i12 == 1179011410) {
                    guoVar.m(12);
                    return 0;
                }
                if (i12 != 1414744396 || iO2 != 1769369453) {
                    this.j = guoVar.getPosition() + ((long) j6Var.b) + 8;
                    return 0;
                }
                long position3 = guoVar.getPosition();
                this.m = position3;
                this.n = position3 + ((long) j6Var.b) + 8;
                if (!this.p) {
                    ea5 ea5Var2 = this.g;
                    ea5Var2.getClass();
                    if ((ea5Var2.b & 16) == 16) {
                        this.e = (byte) 4;
                        this.j = this.n;
                        return 0;
                    }
                    this.f.f(new ca5(this.h));
                    this.p = true;
                }
                this.j = guoVar.getPosition() + 12;
                this.e = (byte) 6;
                return 0;
            case 4:
                guoVar.readFully(fq80Var.f9961a, 0, 8);
                fq80Var.M(0);
                int iO3 = fq80Var.o();
                int iO4 = fq80Var.o();
                if (iO3 != 829973609) {
                    this.j = guoVar.getPosition() + ((long) iO4);
                    return 0;
                }
                this.e = (byte) 5;
                this.o = iO4;
                return 0;
            case 5:
                fq80 fq80Var3 = new fq80(this.o);
                guoVar.readFully(fq80Var3.f9961a, 0, this.o);
                if (fq80Var3.a() < 16) {
                    j = 0;
                } else {
                    int i13 = fq80Var3.b;
                    fq80Var3.N(8);
                    long jO = fq80Var3.o();
                    long j7 = this.m;
                    j = jO > j7 ? 0L : j7 + 8;
                    fq80Var3.M(i13);
                }
                while (fq80Var3.a() >= 16) {
                    int iO5 = fq80Var3.o();
                    int iO6 = fq80Var3.o();
                    long jO2 = ((long) fq80Var3.o()) + j;
                    fq80Var3.N(i4);
                    bjc[] bjcVarArr = this.i;
                    int length = bjcVarArr.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 < length) {
                            bjcVar2 = bjcVarArr[i14];
                            if (bjcVar2.c != iO5 && bjcVar2.d != iO5) {
                                i14++;
                            }
                        } else {
                            bjcVar2 = null;
                        }
                    }
                    if (bjcVar2 != null) {
                        boolean z2 = (iO6 & 16) == 16;
                        if (bjcVar2.m == -1) {
                            bjcVar2.m = jO2;
                        }
                        if (z2 || bjcVar2.f) {
                            int i15 = bjcVar2.l;
                            int[] iArrCopyOf = bjcVar2.o;
                            if (i15 == iArrCopyOf.length) {
                                long[] jArr = bjcVar2.n;
                                bjcVar2.n = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = bjcVar2.o;
                                iArrCopyOf = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                bjcVar2.o = iArrCopyOf;
                            }
                            long[] jArr2 = bjcVar2.n;
                            int i16 = bjcVar2.l;
                            jArr2[i16] = jO2;
                            iArrCopyOf[i16] = bjcVar2.k;
                            bjcVar2.l = i16 + 1;
                        }
                        bjcVar2.k++;
                    }
                    i4 = 4;
                }
                for (bjc bjcVar4 : this.i) {
                    bjcVar4.n = Arrays.copyOf(bjcVar4.n, bjcVar4.l);
                    bjcVar4.o = Arrays.copyOf(bjcVar4.o, bjcVar4.l);
                    if (bjcVar4.f && bjcVar4.f2699a.f != 0 && (i2 = bjcVar4.l) > 0) {
                        bjcVar4.g = i2;
                    }
                }
                this.p = true;
                int length2 = this.i.length;
                huo huoVar = this.f;
                long j8 = this.h;
                if (length2 == 0) {
                    huoVar.f(new ca5(j8));
                } else {
                    huoVar.f(new ca5(this, j8, (byte) 0));
                }
                this.e = (byte) 6;
                this.j = this.m;
                return 0;
            case 6:
                if (guoVar.getPosition() >= this.n) {
                    return -1;
                }
                bjc bjcVar5 = this.k;
                if (bjcVar5 != null) {
                    ncs0 ncs0Var = bjcVar5.b;
                    int i17 = bjcVar5.i;
                    int iE = i17 - ncs0Var.e(guoVar, i17, false);
                    bjcVar5.i = iE;
                    boolean z3 = iE == 0;
                    if (z3) {
                        if (bjcVar5.h > 0) {
                            int i18 = bjcVar5.j;
                            ncs0Var.b((bjcVar5.e * ((long) i18)) / ((long) bjcVar5.g), (bjcVar5.f || Arrays.binarySearch(bjcVar5.o, i18) >= 0) ? 1 : 0, bjcVar5.h, 0, null);
                        }
                        bjcVar5.j++;
                    }
                    if (z3) {
                        this.k = null;
                    }
                    return 0;
                }
                if ((guoVar.getPosition() & 1) == 1) {
                    guoVar.m(1);
                }
                guoVar.n(fq80Var.f9961a, 0, 12);
                fq80Var.M(0);
                int iO7 = fq80Var.o();
                if (iO7 == 1414744396) {
                    fq80Var.M(8);
                    guoVar.m(fq80Var.o() == 1769369453 ? 12 : 8);
                    guoVar.g();
                    return 0;
                }
                int iO8 = fq80Var.o();
                if (iO7 == 1263424842) {
                    this.j = guoVar.getPosition() + ((long) iO8) + 8;
                    return 0;
                }
                guoVar.m(8);
                guoVar.g();
                for (bjc bjcVar6 : this.i) {
                    if (bjcVar6.c == iO7 || bjcVar6.d == iO7) {
                        bjcVar3 = bjcVar6;
                        if (bjcVar3 == null) {
                            this.j = guoVar.getPosition() + ((long) iO8);
                            return 0;
                        }
                        bjcVar3.h = iO8;
                        bjcVar3.i = iO8;
                        this.k = bjcVar3;
                        return 0;
                    }
                }
                if (bjcVar3 == null) {
                    this.j = guoVar.getPosition() + ((long) iO8);
                    return 0;
                }
                bjcVar3.h = iO8;
                bjcVar3.i = iO8;
                this.k = bjcVar3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (bjc bjcVar : this.i) {
            if (bjcVar.l == 0) {
                bjcVar.j = 0;
            } else {
                bjcVar.j = bjcVar.o[vtt0.f(bjcVar.n, j, true)];
            }
        }
        if (j != 0) {
            this.e = (byte) 6;
        } else if (this.i.length == 0) {
            this.e = (byte) 0;
        } else {
            this.e = (byte) 3;
        }
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        fq80 fq80Var = this.f5731a;
        guoVar.n(fq80Var.f9961a, 0, 12);
        fq80Var.M(0);
        if (fq80Var.o() == 1179011410) {
            fq80Var.N(4);
            if (fq80Var.o() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.e = (byte) 0;
        if (this.c) {
            huoVar = new o24(huoVar, this.d);
        }
        this.f = huoVar;
        this.j = -1L;
    }

    @Override // a.fuo
    public final void release() {
    }
}
