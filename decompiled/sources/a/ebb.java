package a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class ebb extends c50 {
    public static ebb h0(hbb hbbVar, iw20 iw20Var, Integer num) throws GeneralSecurityException {
        sg9 sg9Var = (sg9) iw20Var.f15470a;
        hbb hbbVar2 = hbb.e;
        if (hbbVar != hbbVar2 && num == null) {
            e9d0.h(hbbVar, " the value of idRequirement must be non-null", "For given Variant ");
            return null;
        }
        if (hbbVar == hbbVar2 && num != null) {
            hny.o("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (sg9Var.f32150a.length != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + sg9Var.f32150a.length);
        }
        if (hbbVar == hbbVar2) {
            sg9.a(new byte[0]);
        } else if (hbbVar == hbb.d) {
            sg9.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (hbbVar != hbb.c) {
                e9d0.v(hbbVar, "Unknown Variant: ");
                return null;
            }
            sg9.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new ebb();
    }
}
