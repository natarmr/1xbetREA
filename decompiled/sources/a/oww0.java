package a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oww0 implements Comparable {
    public static int c(byte b) {
        return (b >> 5) & 7;
    }

    public static oww0 d(byte... bArr) {
        bArr.getClass();
        tww0 tww0Var = new tww0(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return hxm0.D(tww0Var);
        } finally {
            try {
                tww0Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final oww0 b(Class cls) throws kww0 {
        if (cls.isInstance(this)) {
            return (oww0) cls.cast(this);
        }
        throw new kww0(ua80.i("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public int zza() {
        return c((byte) -128);
    }
}
