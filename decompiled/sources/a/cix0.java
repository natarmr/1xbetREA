package a;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class cix0 implements dnw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPrivateKey f4435a;
    public final zas0 b;
    public final String c;
    public final byte[] d;
    public final eix0 e;
    public final s1x0 f;
    public final byte[] g;

    public cix0(ECPrivateKey eCPrivateKey, byte[] bArr, String str, eix0 eix0Var, s1x0 s1x0Var, byte[] bArr2) {
        this.f4435a = eCPrivateKey;
        zas0 zas0Var = new zas0((byte) 21, false);
        zas0Var.b = eCPrivateKey;
        this.b = zas0Var;
        this.d = bArr;
        this.c = str;
        this.e = eix0Var;
        this.f = s1x0Var;
        this.g = bArr2;
    }

    public static cix0 a(yzw0 yzw0Var) throws NoSuchAlgorithmException {
        okt0 okt0Var = aix0.f948a;
        f0x0 f0x0Var = yzw0Var.f43537a;
        fix0 fix0Var = (fix0) okt0Var.n(f0x0Var.f8737a.f41775a);
        byte[] bArrF = ibm0.F((BigInteger) yzw0Var.b.b);
        ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) gix0.f.f11371a.zza("EC")).generatePrivate(new ECPrivateKeySpec(ibm0.E(bArrF), ghm0.z(fix0Var)));
        byte[] bArrB = new byte[0];
        xzw0 xzw0Var = f0x0Var.f8737a;
        icw0 icw0Var = xzw0Var.f;
        if (icw0Var != null) {
            bArrB = icw0Var.b();
        }
        return new cix0(eCPrivateKey, bArrB, aix0.b(xzw0Var.b), (eix0) aix0.b.n(xzw0Var.c), i4w0.X(xzw0Var), ((m1x0) yzw0Var.u()).u().b());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x0089  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:20:0x009d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c9 A[LOOP:0: B:22:0x00b7->B:24:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00db  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2 A[SYNTHETIC] */
    @Override // a.dnw0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i;
        int i2;
        s1x0 s1x0Var;
        int iZza;
        byte[] bArrB;
        String str;
        Mac mac;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArrDoFinal;
        int length;
        byte[] bArr5 = this.g;
        if (!x7x0.b(bArr5, bArr)) {
            hny.o("Invalid ciphertext (output prefix mismatch)");
            return null;
        }
        int length2 = bArr5.length;
        int iV = ghm0.v(this.f4435a.getParams().getCurve());
        eix0 eix0Var = this.e;
        int iOrdinal = eix0Var.ordinal();
        int i3 = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    hny.o("unknown EC point format");
                    return null;
                }
                i = iV * 2;
            }
            i2 = i + length2;
            if (bArr.length >= i2) {
                hny.o("ciphertext too short");
                return null;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i2);
            s1x0Var = this.f;
            iZza = s1x0Var.zza();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) this.b.b;
            ECParameterSpec params = eCPrivateKey.getParams();
            bArrB = egm0.B(bArrCopyOfRange, ghm0.B(eCPrivateKey, (ECPublicKey) ((KeyFactory) gix0.f.f11371a.zza("EC")).generatePublic(new ECPublicKeySpec(ghm0.A(params.getCurve(), eix0Var, bArrCopyOfRange), params))));
            jix0 jix0Var = gix0.c.f11371a;
            str = this.c;
            mac = (Mac) jix0Var.zza(str);
            if (iZza <= mac.getMacLength() * 255) {
                hny.o("size too large");
                return null;
            }
            bArr3 = this.d;
            if (bArr3.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr3, str));
            }
            byte[] bArrDoFinal2 = mac.doFinal(bArrB);
            bArr4 = new byte[iZza];
            mac.init(new SecretKeySpec(bArrDoFinal2, str));
            bArrDoFinal = new byte[0];
            length = 0;
            while (true) {
                mac.update(bArrDoFinal);
                mac.update((byte[]) null);
                mac.update((byte) i3);
                bArrDoFinal = mac.doFinal();
                if (bArrDoFinal.length + length < iZza) {
                    System.arraycopy(bArrDoFinal, 0, bArr4, length, iZza - length);
                    return s1x0Var.a(i2, bArr4, bArr);
                }
                System.arraycopy(bArrDoFinal, 0, bArr4, length, bArrDoFinal.length);
                length += bArrDoFinal.length;
                i3++;
            }
        } else {
            iV *= 2;
        }
        i = iV + 1;
        i2 = i + length2;
        if (bArr.length >= i2) {
            hny.o("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length2, i2);
        s1x0Var = this.f;
        iZza = s1x0Var.zza();
        ECPrivateKey eCPrivateKey2 = (ECPrivateKey) this.b.b;
        ECParameterSpec params2 = eCPrivateKey2.getParams();
        bArrB = egm0.B(bArrCopyOfRange2, ghm0.B(eCPrivateKey2, (ECPublicKey) ((KeyFactory) gix0.f.f11371a.zza("EC")).generatePublic(new ECPublicKeySpec(ghm0.A(params2.getCurve(), eix0Var, bArrCopyOfRange2), params2))));
        jix0 jix0Var2 = gix0.c.f11371a;
        str = this.c;
        mac = (Mac) jix0Var2.zza(str);
        if (iZza <= mac.getMacLength() * 255) {
            hny.o("size too large");
            return null;
        }
        bArr3 = this.d;
        if (bArr3.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr3, str));
        }
        byte[] bArrDoFinal3 = mac.doFinal(bArrB);
        bArr4 = new byte[iZza];
        mac.init(new SecretKeySpec(bArrDoFinal3, str));
        bArrDoFinal = new byte[0];
        length = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update((byte[]) null);
            mac.update((byte) i3);
            bArrDoFinal = mac.doFinal();
            if (bArrDoFinal.length + length < iZza) {
                System.arraycopy(bArrDoFinal, 0, bArr4, length, iZza - length);
                return s1x0Var.a(i2, bArr4, bArr);
            }
            System.arraycopy(bArrDoFinal, 0, bArr4, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i3++;
        }
    }
}
