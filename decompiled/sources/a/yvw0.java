package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class yvw0 extends oww0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vuw0 f43341a;

    public yvw0(vuw0 vuw0Var) {
        this.f43341a = vuw0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        oww0 oww0Var = (oww0) obj;
        int iZza = oww0Var.zza();
        int iC = oww0.c((byte) 64);
        if (iC != iZza) {
            return iC - oww0Var.zza();
        }
        vuw0 vuw0Var = ((yvw0) oww0Var).f43341a;
        vuw0 vuw0Var2 = this.f43341a;
        byte[] bArr = vuw0Var2.b;
        int length = bArr.length;
        byte[] bArr2 = vuw0Var.b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return fuw0.f10186a.compare(vuw0Var2.l(), vuw0Var.l());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yvw0.class == obj.getClass()) {
            return this.f43341a.equals(((yvw0) obj).f43341a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(oww0.c((byte) 64)), this.f43341a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        htw0 htw0Var;
        int i;
        boolean z;
        ktw0 ktw0Var = ntw0.d;
        ntw0 ktw0Var2 = ktw0Var.c;
        if (ktw0Var2 == null) {
            htw0 htw0Var2 = ktw0Var.f24121a;
            char[] cArr = htw0Var2.b;
            int i2 = 0;
            while (true) {
                if (i2 >= cArr.length) {
                    htw0Var = htw0Var2;
                    break;
                }
                char c = cArr[i2];
                if (c >= 'a' && c <= 'z') {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= cArr.length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (!z) {
                        char[] cArr2 = new char[cArr.length];
                        for (int i4 = 0; i4 < cArr.length; i4++) {
                            char c3 = cArr[i4];
                            if (c3 >= 97 && c3 <= 122) {
                                c3 ^= 32;
                            }
                            cArr2[i4] = (char) c3;
                        }
                        htw0Var = new htw0(htw0Var2.f13655a.concat(".upperCase()"), cArr2);
                        byte[] bArr = htw0Var.g;
                        if (!htw0Var2.h || htw0Var.h) {
                            break;
                            break;
                        }
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i = 65; i <= 90; i++) {
                            int i5 = i | 32;
                            byte b = bArr[i];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                bArrCopyOf[i] = b2;
                            } else {
                                char c4 = (char) i;
                                char c5 = (char) i5;
                                if (b2 != -1) {
                                    jf4.n(tnq0.s("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    return null;
                                }
                                bArrCopyOf[i5] = b;
                            }
                        }
                        htw0Var = new htw0(htw0Var.f13655a.concat(".ignoreCase()"), htw0Var.b, bArrCopyOf, true);
                        break;
                    }
                    jf4.n("Cannot call upperCase() on a mixed-case alphabet");
                    return null;
                }
                i2++;
            }
            ktw0Var2 = htw0Var == htw0Var2 ? ktw0Var : new ktw0(htw0Var);
            ktw0Var.c = ktw0Var2;
        }
        byte[] bArrL = this.f43341a.l();
        return kng0.l("h'", ktw0Var2.c(bArrL, bArrL.length), Separators.QUOTE);
    }

    @Override // a.oww0
    public final int zza() {
        return oww0.c((byte) 64);
    }
}
