package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37113a;
    public final byte[] b;

    public vay(byte[] bArr, int i) {
        bArr.getClass();
        this.f37113a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vay)) {
            return false;
        }
        vay vayVar = (vay) obj;
        return this.f37113a == vayVar.f37113a && Intrinsics.d(this.b, vayVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Integer.hashCode(this.f37113a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f37113a, "Slot(key=", ", payload=", Arrays.toString(this.b), Separators.RPAREN);
    }
}
