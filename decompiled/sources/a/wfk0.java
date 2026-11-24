package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wfk0 implements Iterable, khy {
    public static final wfk0 e = new wfk0(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39076a;
    public final long b;
    public final long c;
    public final long[] d;

    public wfk0(long j, long j2, long j3, long[] jArr) {
        this.f39076a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
    }

    public final wfk0 b(wfk0 wfk0Var) {
        long[] jArr;
        wfk0 wfk0VarC = this;
        wfk0 wfk0Var2 = e;
        if (wfk0Var == wfk0Var2) {
            return wfk0VarC;
        }
        if (wfk0VarC == wfk0Var2) {
            return wfk0Var2;
        }
        long j = wfk0Var.c;
        long j2 = wfk0Var.c;
        long[] jArr2 = wfk0Var.d;
        long j3 = wfk0Var.b;
        long j4 = wfk0Var.f39076a;
        long j5 = wfk0VarC.c;
        if (j == j5 && jArr2 == (jArr = wfk0VarC.d)) {
            return new wfk0(wfk0VarC.f39076a & (~j4), wfk0VarC.b & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                wfk0VarC = wfk0VarC.c(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    wfk0VarC = wfk0VarC.c(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    wfk0VarC = wfk0VarC.c(((long) i2) + j2 + 64);
                }
            }
        }
        return wfk0VarC;
    }

    public final wfk0 c(long j) {
        long[] jArr;
        int iV;
        long[] jArr2;
        long j2 = j - this.c;
        if (Intrinsics.f(j2, 0L) >= 0 && Intrinsics.f(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new wfk0(this.f39076a, j4 & (~j3), this.c, this.d);
            }
        } else if (Intrinsics.f(j2, 64L) >= 0 && Intrinsics.f(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.f39076a;
            if ((j6 & j5) != 0) {
                return new wfk0(j6 & (~j5), this.b, this.c, this.d);
            }
        } else if (Intrinsics.f(j2, 0L) < 0 && (jArr = this.d) != null && (iV = xdx.v(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iV > 0) {
                    qx3.g(jArr, jArr3, 0, 0, iV);
                }
                if (iV < i) {
                    qx3.g(jArr, jArr3, iV, iV + 1, length);
                }
                jArr2 = jArr3;
            }
            return new wfk0(this.f39076a, this.b, this.c, jArr2);
        }
        return this;
    }

    public final boolean e(long j) {
        long[] jArr;
        long j2 = j - this.c;
        if (Intrinsics.f(j2, 0L) >= 0 && Intrinsics.f(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.b) != 0;
        }
        if (Intrinsics.f(j2, 64L) < 0 || Intrinsics.f(j2, 128L) >= 0) {
            return Intrinsics.f(j2, 0L) <= 0 && (jArr = this.d) != null && xdx.v(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.f39076a) != 0;
    }

    public final wfk0 f(wfk0 wfk0Var) {
        wfk0 wfk0VarG;
        long[] jArr;
        wfk0 wfk0VarG2 = this;
        wfk0 wfk0Var2 = e;
        if (wfk0Var == wfk0Var2) {
            return wfk0VarG2;
        }
        if (wfk0VarG2 == wfk0Var2) {
            return wfk0Var;
        }
        long j = wfk0Var.c;
        long j2 = wfk0Var.c;
        long[] jArr2 = wfk0Var.d;
        long j3 = wfk0Var.b;
        long j4 = wfk0Var.f39076a;
        long j5 = wfk0VarG2.c;
        long j6 = wfk0VarG2.b;
        long j7 = wfk0VarG2.f39076a;
        if (j == j5 && jArr2 == (jArr = wfk0VarG2.d)) {
            return new wfk0(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = wfk0VarG2.d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    wfk0VarG2 = wfk0VarG2.g(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        wfk0VarG2 = wfk0VarG2.g(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        wfk0VarG2 = wfk0VarG2.g(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return wfk0VarG2;
        }
        if (jArr3 != null) {
            wfk0VarG = wfk0Var;
            for (long j9 : jArr3) {
                wfk0VarG = wfk0VarG.g(j9);
            }
        } else {
            wfk0VarG = wfk0Var;
        }
        long j10 = wfk0VarG2.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    wfk0VarG = wfk0VarG.g(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    wfk0VarG = wfk0VarG.g(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return wfk0VarG;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0150  */
    public final wfk0 g(long j) {
        long[] jArr;
        long j2;
        long j3;
        long[] jArr2;
        long[] jArr3;
        int i;
        iy40 iy40Var;
        long j4 = this.c;
        long j5 = j - j4;
        long j6 = 0;
        int iF = Intrinsics.f(j5, 0L);
        long j7 = this.b;
        if (iF < 0 || Intrinsics.f(j5, 64L) >= 0) {
            int iF2 = Intrinsics.f(j5, 64L);
            long j8 = this.f39076a;
            int i2 = 64;
            if (iF2 < 0 || Intrinsics.f(j5, 128L) >= 0) {
                int iF3 = Intrinsics.f(j5, 128L);
                long[] jArr4 = this.d;
                if (iF3 < 0) {
                    if (jArr4 == null) {
                        return new wfk0(this.f39076a, this.b, this.c, new long[]{j});
                    }
                    int iV = xdx.v(jArr4, j);
                    if (iV < 0) {
                        int i3 = -(iV + 1);
                        int length = jArr4.length;
                        long[] jArr5 = new long[length + 1];
                        qx3.g(jArr4, jArr5, 0, 0, i3);
                        qx3.g(jArr4, jArr5, i3 + 1, i3, length);
                        jArr5[i3] = j;
                        return new wfk0(this.f39076a, this.b, this.c, jArr5);
                    }
                } else if (!e(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (Intrinsics.f(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    roi0 roi0Var = null;
                    while (true) {
                        if (Intrinsics.f(j4, j9) >= 0) {
                            jArr = null;
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (roi0Var == null) {
                                roi0Var = new roi0();
                                if (jArr4 != null) {
                                    long[] jArrCopyOf = Arrays.copyOf(jArr4, jArr4.length);
                                    jArr = null;
                                    iy40Var = new iy40(jArrCopyOf.length);
                                    int i4 = iy40Var.b;
                                    if (i4 < 0) {
                                        v4i0.m("");
                                        throw null;
                                    }
                                    j3 = j6;
                                    if (jArrCopyOf.length != 0) {
                                        int length2 = jArrCopyOf.length + i4;
                                        long[] jArrCopyOf2 = iy40Var.f15572a;
                                        if (jArrCopyOf2.length < length2) {
                                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(length2, (jArrCopyOf2.length * 3) / 2));
                                            iy40Var.f15572a = jArrCopyOf2;
                                        }
                                        int i5 = iy40Var.b;
                                        if (i4 != i5) {
                                            qx3.g(jArrCopyOf2, jArrCopyOf2, jArrCopyOf.length + i4, i4, i5);
                                        }
                                        qx3.g(jArrCopyOf, jArrCopyOf2, i4, 0, jArrCopyOf.length);
                                        iy40Var.b += jArrCopyOf.length;
                                    }
                                } else {
                                    j3 = j6;
                                    jArr = null;
                                    iy40Var = new iy40();
                                }
                                roi0Var.f30839a = iy40Var;
                            } else {
                                j3 = j6;
                                jArr = null;
                            }
                            i = i2;
                            for (int i6 = 0; i6 < i; i6++) {
                                if (((1 << i6) & j7) != j3) {
                                    ((iy40) roi0Var.f30839a).a(((long) i6) + j4);
                                }
                            }
                        } else {
                            j3 = j6;
                            i = i2;
                            jArr = null;
                        }
                        if (j10 == j3) {
                            j2 = j9;
                            break;
                        }
                        j4 += 64;
                        i2 = i;
                        j7 = j10;
                        j6 = j3;
                        j10 = j6;
                    }
                    if (roi0Var == null) {
                        jArr2 = jArr4;
                    } else {
                        iy40 iy40Var2 = (iy40) roi0Var.f30839a;
                        int i7 = iy40Var2.b;
                        if (i7 == 0) {
                            jArr3 = jArr;
                        } else {
                            long[] jArr6 = new long[i7];
                            long[] jArr7 = iy40Var2.f15572a;
                            for (int i8 = 0; i8 < i7; i8++) {
                                jArr6[i8] = jArr7[i8];
                            }
                            jArr3 = jArr6;
                        }
                        if (jArr3 == null) {
                            jArr2 = jArr4;
                        } else {
                            jArr2 = jArr3;
                        }
                    }
                    return new wfk0(j10, j3, j2, jArr2).g(j);
                }
            } else {
                long j11 = 1 << (((int) j5) - 64);
                if ((j8 & j11) == 0) {
                    return new wfk0(j8 | j11, this.b, this.c, this.d);
                }
            }
        } else {
            long j12 = 1 << ((int) j5);
            if ((j7 & j12) == 0) {
                return new wfk0(this.f39076a, j7 | j12, this.c, this.d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return igi0.a(new vfk0(this, null));
    }

    public final String toString() {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(r3d.q(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return kng0.m(string, " [", sb.toString(), "]");
    }
}
