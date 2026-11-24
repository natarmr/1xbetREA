package a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public interface u34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f34978a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    ByteBuffer b();

    void c(s34 s34Var);

    void d(ByteBuffer byteBuffer);

    void e();

    q34 f(q34 q34Var);

    boolean isActive();

    void reset();

    default long g(long j) {
        return j;
    }
}
