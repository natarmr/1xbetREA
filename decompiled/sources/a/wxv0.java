package a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class wxv0 extends c50 {
    public static wxv0 h0(y60 y60Var, iw20 iw20Var, Integer num) throws GeneralSecurityException {
        sg9 sg9Var = (sg9) iw20Var.f15470a;
        y60 y60Var2 = y60.j;
        if (y60Var != y60Var2 && num == null) {
            e9d0.h(y60Var, " the value of idRequirement must be non-null", "For given Variant ");
            return null;
        }
        if (y60Var == y60Var2 && num != null) {
            hny.o("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (sg9Var.f32150a.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + sg9Var.f32150a.length);
        }
        if (y60Var == y60Var2) {
            sg9.a(new byte[0]);
        } else if (y60Var == y60.i) {
            sg9.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (y60Var != y60.h) {
                e9d0.v(y60Var, "Unknown Variant: ");
                return null;
            }
            sg9.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new wxv0();
    }
}
