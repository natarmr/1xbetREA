package okhttp3.tls.internal.der;

import a.t99;
import java.math.BigInteger;
import java.net.ProtocolException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"okhttp3/tls/internal/der/Adapters$INTEGER_AS_BIG_INTEGER$1", "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "Ljava/math/BigInteger;", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Adapters$INTEGER_AS_BIG_INTEGER$1 implements BasicDerAdapter.Codec<BigInteger> {
    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final Object a(DerReader derReader) throws ProtocolException {
        derReader.getClass();
        if (derReader.b() != 0) {
            return new BigInteger(derReader.b.N(derReader.b()));
        }
        throw new ProtocolException("unexpected length: " + derReader.b() + " at " + derReader);
    }

    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final void b(DerWriter derWriter, Object obj) {
        BigInteger bigInteger = (BigInteger) obj;
        derWriter.getClass();
        bigInteger.getClass();
        t99 t99VarA = derWriter.a();
        byte[] byteArray = bigInteger.toByteArray();
        byteArray.getClass();
        t99VarA.write(byteArray);
    }
}
