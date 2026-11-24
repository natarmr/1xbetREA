package a;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q6x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final icw0 f28222a = icw0.a(new byte[0]);

    public static final icw0 a(int i) {
        return icw0.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final icw0 b(int i) {
        return icw0.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
