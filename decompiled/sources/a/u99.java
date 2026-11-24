package a;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public interface u99 extends emk0, ReadableByteChannel {
    String A(long j);

    void A0(f99 f99Var, long j);

    boolean G(long j);

    String H0(Charset charset);

    String M();

    byte[] N(long j);

    long Y0();

    InputStream a1();

    f99 g();

    void h0(long j);

    boolean m0(long j, qg9 qg9Var);

    int o0(z680 z680Var);

    qg9 q0(long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j);

    byte[] t0();

    long u(t99 t99Var);

    boolean v0();

    long y0(long j, qg9 qg9Var);
}
