package a;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o9x0 extends fpw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24902a;

    public o9x0(int i) {
        this.f24902a = i;
    }

    public static o9x0 b(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new o9x0(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i << 3)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o9x0) && ((o9x0) obj).f24902a == this.f24902a;
    }

    public final int hashCode() {
        return Objects.hash(o9x0.class, Integer.valueOf(this.f24902a));
    }

    public final String toString() {
        return ua80.e(this.f24902a, "AesCmac PRF Parameters (", "-byte key)");
    }
}
