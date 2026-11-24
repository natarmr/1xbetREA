package a;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class isw0 implements tmw0 {
    public static final byte[] d = new byte[0];
    public static final Set e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15327a;
    public final fpw0 b;
    public final tmw0 c;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        e = Collections.unmodifiableSet(hashSet);
    }

    public isw0(bfx0 bfx0Var, tmw0 tmw0Var) {
        if (!e.contains(bfx0Var.C())) {
            jf4.o(kng0.l("Unsupported DEK key type: ", bfx0Var.C(), ". Only Tink AEAD key types are supported."));
            throw null;
        }
        this.f15327a = bfx0Var.C();
        zex0 zex0VarU = bfx0.u(bfx0Var);
        zex0VarU.h(4);
        this.b = ktt0.E(((bfx0) zex0VarU.c()).c());
        this.c = tmw0Var;
    }

    @Override // a.tmw0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrB = this.c.b(bArr3, d);
            String str = this.f15327a;
            try {
                vjw0 vjw0Var = sjw0.b;
                return ((tmw0) n6x0.b.a(((u7x0) k6x0.b.f17793a.get()).c(vkr0.C(str, sjw0.h(bArrB, 0, bArrB.length), hbb.j, lpw0.e, null)), tmw0.class)).b(bArr4, bArr2);
            } catch (NegativeArraySizeException e2) {
                e = e2;
                throw new GeneralSecurityException("invalid ciphertext", e);
            } catch (BufferUnderflowException e3) {
                e = e3;
                throw new GeneralSecurityException("invalid ciphertext", e);
            }
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e4) {
            e = e4;
        }
    }

    @Override // a.tmw0
    public final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        atm0 atm0VarB = b6x0.b.b(this.b, null);
        byte[] bArrC = this.c.c(((sjw0) ((u7x0) k6x0.b.f17793a.get()).a(atm0VarB).c).r(), d);
        if (bArrC.length <= 4096) {
            byte[] bArrC2 = ((tmw0) n6x0.b.a(atm0VarB, tmw0.class)).c(bArr, bArr2);
            return ByteBuffer.allocate(bArrC.length + 4 + bArrC2.length).putInt(bArrC.length).put(bArrC).put(bArrC2).array();
        }
        hny.o("length of encrypted DEK too large");
        return null;
    }
}
