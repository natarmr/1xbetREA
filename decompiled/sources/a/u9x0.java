package a;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class u9x0 implements r9x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35305a;
    public final Object b;

    public u9x0(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!esw0.d(1)) {
            hny.o("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
            throw null;
        }
        this.f35305a = new SecretKeySpec(bArr, "AES");
        this.b = provider;
    }

    public edu a() {
        return new edu(new lsn(new pyu((v230) this.f35305a)), new art(), (pru) this.b);
    }

    @Override // a.r9x0
    public byte[] e(byte[] bArr, int i) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Mac mac = Mac.getInstance("AESCMAC", (Provider) this.b);
        mac.init((SecretKeySpec) this.f35305a);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i);
    }

    public u9x0(v230 v230Var, pru pruVar) {
        this.f35305a = v230Var;
        this.b = pruVar;
    }
}
