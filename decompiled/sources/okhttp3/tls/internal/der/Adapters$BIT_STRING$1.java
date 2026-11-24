package okhttp3.tls.internal.der;

import a.e9d0;
import a.t99;
import a.zae0;
import java.net.ProtocolException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"okhttp3/tls/internal/der/Adapters$BIT_STRING$1", "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "Lokhttp3/tls/internal/der/BitString;", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Adapters$BIT_STRING$1 implements BasicDerAdapter.Codec<BitString> {
    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final Object a(DerReader derReader) throws ProtocolException {
        derReader.getClass();
        zae0 zae0Var = derReader.b;
        if (derReader.b() == -1 || derReader.f) {
            e9d0.j("constructed bit strings not supported for DER");
            return null;
        }
        if (derReader.b() >= 1) {
            return new BitString(zae0Var.readByte() & 255, zae0Var.q0(derReader.b()));
        }
        e9d0.j("malformed bit string");
        return null;
    }

    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final void b(DerWriter derWriter, Object obj) {
        BitString bitString = (BitString) obj;
        derWriter.getClass();
        bitString.getClass();
        t99 t99VarA = derWriter.a();
        t99VarA.writeByte(bitString.b);
        t99VarA.N0(bitString.f46253a);
    }
}
