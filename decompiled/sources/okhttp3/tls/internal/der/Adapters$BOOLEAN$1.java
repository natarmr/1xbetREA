package okhttp3.tls.internal.der;

import java.net.ProtocolException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"okhttp3/tls/internal/der/Adapters$BOOLEAN$1", "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Adapters$BOOLEAN$1 implements BasicDerAdapter.Codec<Boolean> {
    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final Object a(DerReader derReader) throws ProtocolException {
        derReader.getClass();
        if (derReader.b() == 1) {
            return Boolean.valueOf(derReader.b.readByte() != 0);
        }
        throw new ProtocolException("unexpected length: " + derReader.b() + " at " + derReader);
    }

    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final void b(DerWriter derWriter, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        derWriter.getClass();
        derWriter.a().writeByte(zBooleanValue ? -1 : 0);
    }
}
