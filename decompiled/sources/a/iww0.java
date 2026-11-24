package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class iww0 extends oww0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15511a;

    public iww0(String str) {
        this.f15511a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        oww0 oww0Var = (oww0) obj;
        int iZza = oww0Var.zza();
        int iC = oww0.c((byte) 96);
        if (iC != iZza) {
            return iC - oww0Var.zza();
        }
        String str = ((iww0) oww0Var).f15511a;
        int length = str.length();
        String str2 = this.f15511a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iww0.class == obj.getClass()) {
            return this.f15511a.equals(((iww0) obj).f15511a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(oww0.c((byte) 96)), this.f15511a});
    }

    public final String toString() {
        return axq.n(new StringBuilder(Separators.DOUBLE_QUOTE), this.f15511a, Separators.DOUBLE_QUOTE);
    }

    @Override // a.oww0
    public final int zza() {
        return oww0.c((byte) 96);
    }
}
