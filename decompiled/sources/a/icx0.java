package a;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class icx0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final icx0 f14557a = null;
    public final UUID b;
    public final String c;
    public final String d;
    public Thread e;

    public icx0(String str, UUID uuid, String str2, bex0 bex0Var) {
        this.d = str;
        this.b = uuid;
        this.c = str2;
        bex0Var.getClass();
        this.e = Thread.currentThread();
    }

    public static String a(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    public sdx0 c() {
        return rdx0.e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bex0 bex0VarC = wcx0.c();
        icx0 icx0Var = bex0VarC.b;
        String str = this.d;
        if (icx0Var == null) {
            throw new byw(rw2.o(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == icx0Var) {
            wcx0.b(bex0VarC, icx0Var.f14557a);
            this.e = null;
            return;
        }
        String str2 = icx0Var.d;
        StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
        f140.v(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb.append(Separators.DOT);
        throw new byw(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:140:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:76:0x020e  */
    public final String toString() {
        int i;
        int i2;
        j6 j6Var;
        Iterator it;
        vdx0 vdx0Var;
        int i3;
        xdx0 xdx0Var;
        AtomicReference atomicReference = wcx0.f38946a;
        icx0 icx0Var = this;
        int i4 = 0;
        int length = 0;
        while (icx0Var != null) {
            i4++;
            length += icx0Var.d.length();
            icx0Var = icx0Var.f14557a;
            if (icx0Var != null) {
                length += 4;
            }
        }
        if (i4 > 250) {
            String[] strArr = new String[i4];
            icx0 icx0Var2 = this;
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                strArr[i5] = icx0Var2.d;
                icx0Var2 = icx0Var2.f14557a;
            }
            zz2 zz2VarA = wcf0.a();
            int i6 = 1;
            eet0 eet0VarJ = (i4 != 0 ? i4 != 1 ? f4x.l(i4, (Object[]) strArr.clone()) : new r5k0(strArr[0]) : ycf0.j).iterator();
            int i7 = 0;
            while (eet0VarJ.hasNext()) {
                zz2VarA.A(eet0VarJ.next(), Integer.valueOf(i7));
                i7++;
            }
            wcf0 wcf0VarE = zz2VarA.e(true);
            int i8 = wcf0VarE.f;
            int i9 = i4 >> 2;
            if (i8 > i9) {
                j6Var = null;
            } else {
                int i10 = i4 + 1;
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i4; i11++) {
                    iArr[i11] = ((Integer) wcf0VarE.get(strArr[i11])).intValue();
                }
                iArr[i4] = i8;
                zdx0 zdx0Var = new zdx0(iArr);
                int i12 = 0;
                while (true) {
                    int i13 = -1;
                    if (i12 >= i10) {
                        break;
                    }
                    zdx0Var.d += i6;
                    int i14 = iArr[i12];
                    while (true) {
                        xdx0 xdx0Var2 = null;
                        while (true) {
                            if (zdx0Var.d <= 0) {
                                i3 = i6;
                                break;
                            }
                            int i15 = zdx0Var.c;
                            xdx0Var = (xdx0) zdx0Var.g;
                            i3 = i6;
                            if (i15 == 0) {
                                break;
                            }
                            int i16 = ((xdx0) xdx0Var.d.get(Integer.valueOf(iArr[zdx0Var.b]))).f40717a;
                            int i17 = zdx0Var.c;
                            if (iArr[i16 + i17] == i14) {
                                if (xdx0Var2 != null) {
                                    xdx0Var2.c = (xdx0) zdx0Var.g;
                                }
                                zdx0Var.c = i17 + 1;
                                zdx0Var.a();
                                break;
                            }
                            xdx0 xdx0Var3 = (xdx0) ((xdx0) zdx0Var.g).d.get(Integer.valueOf(iArr[zdx0Var.b]));
                            int i18 = xdx0Var3.f40717a;
                            int i19 = i13;
                            xdx0 xdx0Var4 = new xdx0(i18, (zdx0Var.c + i18) - 1);
                            ((xdx0) zdx0Var.g).d.put(Integer.valueOf(iArr[zdx0Var.b]), xdx0Var4);
                            int i20 = xdx0Var4.b + 1;
                            Integer numValueOf = Integer.valueOf(iArr[i20]);
                            HashMap map = xdx0Var4.d;
                            map.put(numValueOf, xdx0Var3);
                            xdx0Var3.f40717a = i20;
                            if (xdx0Var2 != null) {
                                xdx0Var2.c = xdx0Var4;
                            }
                            map.put(Integer.valueOf(i14), new xdx0(i12, 1073741824));
                            zdx0Var.d--;
                            zdx0Var.b();
                            xdx0Var2 = xdx0Var4;
                            i6 = i3;
                            i13 = i19;
                        }
                        HashMap map2 = xdx0Var.d;
                        Integer numValueOf2 = Integer.valueOf(i14);
                        if (map2.containsKey(numValueOf2)) {
                            if (xdx0Var2 != null) {
                                xdx0Var2.c = (xdx0) zdx0Var.g;
                            }
                            zdx0Var.b = i12;
                            zdx0Var.c++;
                            zdx0Var.a();
                            break;
                        }
                        ((xdx0) zdx0Var.g).d.put(numValueOf2, new xdx0(i12, 1073741824));
                        if (xdx0Var2 != null) {
                            xdx0Var2.c = (xdx0) zdx0Var.g;
                        }
                        zdx0Var.d += i13;
                        zdx0Var.b();
                        i6 = i3;
                    }
                    i12++;
                    i6 = i3;
                }
                int i21 = i6;
                ArrayDeque arrayDeque = new ArrayDeque();
                xdx0 xdx0Var5 = (xdx0) zdx0Var.f;
                vdx0 vdx0Var2 = new vdx0(xdx0Var5, 0, -1, -1);
                arrayDeque.push(vdx0Var2);
                while (!arrayDeque.isEmpty()) {
                    vdx0 vdx0Var3 = (vdx0) arrayDeque.pop();
                    Iterator it2 = vdx0Var3.d.d.values().iterator();
                    while (it2.hasNext()) {
                        xdx0 xdx0Var6 = (xdx0) it2.next();
                        int i22 = vdx0Var3.b;
                        int i23 = vdx0Var3.c;
                        int i24 = xdx0Var6.f40717a;
                        xdx0 xdx0Var7 = xdx0Var5;
                        int i25 = xdx0Var6.b;
                        if (zdx0Var.e(i22, i23, i24, i25)) {
                            it = it2;
                        } else {
                            if (xdx0Var6.d.isEmpty()) {
                                int i26 = xdx0Var6.f40717a;
                                it = it2;
                                if (zdx0Var.e(i22, i23, i26, (i26 + i23) - i22)) {
                                }
                                if (vdx0Var2.f37254a < vdx0Var.f37254a) {
                                    vdx0Var2 = vdx0Var;
                                }
                                arrayDeque.push(vdx0Var);
                                xdx0Var5 = xdx0Var7;
                                it2 = it;
                                i21 = 1;
                            } else {
                                it = it2;
                            }
                            vdx0Var = new vdx0(xdx0Var6, i21, xdx0Var6.f40717a, i25);
                            if (vdx0Var2.f37254a < vdx0Var.f37254a) {
                                vdx0Var2 = vdx0Var;
                            }
                            arrayDeque.push(vdx0Var);
                            xdx0Var5 = xdx0Var7;
                            it2 = it;
                            i21 = 1;
                        }
                        vdx0Var = new vdx0(xdx0Var6, vdx0Var3.f37254a + i21, i22, i23);
                        if (vdx0Var2.f37254a < vdx0Var.f37254a) {
                            vdx0Var2 = vdx0Var;
                        }
                        arrayDeque.push(vdx0Var);
                        xdx0Var5 = xdx0Var7;
                        it2 = it;
                        i21 = 1;
                    }
                    i21 = 1;
                }
                int iMin = Math.min(iArr.length, vdx0Var2.c + 1);
                int i27 = 0;
                loop9: while (true) {
                    i = vdx0Var2.b;
                    i2 = iMin - i;
                    xdx0Var5 = (xdx0) xdx0Var5.d.get(Integer.valueOf(iArr[(i27 % i2) + i]));
                    if (xdx0Var5 == null) {
                        break;
                    }
                    for (int i28 = xdx0Var5.f40717a; i28 < xdx0Var5.b + 1 && i28 < iArr.length; i28++) {
                        if (iArr[(i27 % i2) + i] != iArr[i28]) {
                            break loop9;
                        }
                        i27++;
                    }
                }
                int i29 = i27 / i2;
                j6 j6Var2 = new j6(i, iMin, i29);
                if (i2 * i29 < i9) {
                    j6Var = null;
                } else {
                    j6Var = j6Var2;
                }
            }
            String strConcat = "";
            if (j6Var != null) {
                int i30 = j6Var.f15959a;
                String strConcat2 = i30 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i30))).concat(" -> ") : "";
                int i31 = j6Var.b;
                int i32 = j6Var.c;
                int iB = twn.b(i31, i30, i32, i30);
                strConcat = iB < i4 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, iB, i4)))) : "";
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i30, i31));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i32 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        icx0 icx0Var3 = this;
        while (icx0Var3 != null) {
            String str = icx0Var3.d;
            length -= str.length();
            str.getChars(0, str.length(), cArr, length);
            icx0Var3 = icx0Var3.f14557a;
            if (icx0Var3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }
}
