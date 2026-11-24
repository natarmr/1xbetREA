package a;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class sqy implements a50 {
    public static final byte[] c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bly f32650a;
    public final r60 b;

    public sqy(bly blyVar, r60 r60Var) {
        this.f32650a = blyVar;
        this.b = r60Var;
    }

    @Override // a.a50
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        x3 x3VarT0;
        bly blyVar = this.f32650a;
        AtomicReference atomicReference = pcf0.f26757a;
        synchronized (pcf0.class) {
            try {
                v0 v0Var = ((oky) pcf0.f26757a.get()).a(blyVar.z()).f23703a;
                Class cls = (Class) v0Var.d;
                if (!((Map) v0Var.c).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + v0Var.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) pcf0.c.get(blyVar.z())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + blyVar.z());
                }
                og9 og9VarA = blyVar.A();
                try {
                    p4 p4VarS = v0Var.s();
                    x3 x3VarG0 = p4VarS.G0(og9VarA);
                    p4VarS.M0(x3VarG0);
                    x3VarT0 = p4VarS.t0(x3VarG0);
                } catch (ynx e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) v0Var.s().b).getName()), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] bArrE = x3VarT0.e();
        byte[] bArrA = this.b.a(bArrE, c);
        byte[] bArrA2 = ((a50) pcf0.d(this.f32650a.z(), bArrE)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override // a.a50
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((a50) pcf0.d(this.f32650a.z(), this.b.b(bArr3, c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
