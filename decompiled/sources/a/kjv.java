package a;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kjv {
    public static final byte[] f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18405a;
    public int b;
    public boolean c;
    public byte d;
    public Serializable e;

    public x25 a() {
        String str;
        if (this.d == 7 && (str = (String) this.e) != null) {
            return new x25(this.f18405a, this.b, str, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (((String) this.e) == null) {
            sb.append(" processName");
        }
        if ((this.d & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.d & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.d & 4) == 0) {
            sb.append(" defaultProcess");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [byte[], java.io.Serializable] */
    public void b(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.e;
            int length = bArr2.length;
            int i4 = this.f18405a + i3;
            Object obj = bArr2;
            if (length < i4) {
                ?? CopyOf = Arrays.copyOf(bArr2, i4 * 2);
                this.e = CopyOf;
                obj = CopyOf;
            }
            System.arraycopy(bArr, i, obj, this.f18405a, i3);
            this.f18405a += i3;
        }
    }
}
