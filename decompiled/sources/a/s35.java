package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class s35 extends too {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f31539a;
    public final byte[] b;

    public s35(byte[] bArr, byte[] bArr2) {
        this.f31539a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof too) {
            too tooVar = (too) obj;
            boolean z = tooVar instanceof s35;
            s35 s35Var = (s35) tooVar;
            if (Arrays.equals(this.f31539a, z ? s35Var.f31539a : s35Var.f31539a)) {
                s35 s35Var2 = (s35) tooVar;
                if (Arrays.equals(this.b, z ? s35Var2.b : s35Var2.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.f31539a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f31539a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
