package a;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface dm30 {
    void b(Bundle bundle);

    void c(int i, int i2, int i3, long j);

    void d(int i, pef pefVar, long j, int i2);

    MediaFormat e();

    void f();

    void flush();

    void g(int i);

    ByteBuffer h(int i);

    void i(Surface surface);

    void k(int i);

    default boolean l(nv20 nv20Var) {
        return false;
    }

    void m(wm30 wm30Var, Handler handler);

    void n(int i, long j);

    int o();

    int q(MediaCodec.BufferInfo bufferInfo);

    default void r(fdq0 fdq0Var) {
        fdq0Var.run();
    }

    void release();

    ByteBuffer s(int i);

    void t(ArrayList arrayList);

    void v(ArrayList arrayList);
}
