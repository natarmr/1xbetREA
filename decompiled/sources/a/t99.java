package a;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes2.dex */
public interface t99 extends s5k0, WritableByteChannel {
    t99 B(byte[] bArr, int i);

    t99 D(String str);

    t99 I0(long j);

    t99 N0(qg9 qg9Var);

    long P(emk0 emk0Var);

    @Override // a.s5k0, java.io.Flushable
    void flush();

    f99 g();

    t99 i0(long j);

    t99 write(byte[] bArr);

    t99 writeByte(int i);

    t99 writeInt(int i);

    t99 writeShort(int i);
}
