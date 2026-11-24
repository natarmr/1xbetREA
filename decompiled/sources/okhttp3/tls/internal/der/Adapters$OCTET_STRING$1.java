package okhttp3.tls.internal.der;

import a.e9d0;
import a.qg9;
import java.net.ProtocolException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"okhttp3/tls/internal/der/Adapters$OCTET_STRING$1", "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "La/qg9;", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Adapters$OCTET_STRING$1 implements BasicDerAdapter.Codec<qg9> {
    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final Object a(DerReader derReader) throws ProtocolException {
        derReader.getClass();
        if (derReader.b() != -1 && !derReader.f) {
            return derReader.b.q0(derReader.b());
        }
        e9d0.j("constructed octet strings not supported for DER");
        return null;
    }

    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final void b(DerWriter derWriter, Object obj) {
        qg9 qg9Var = (qg9) obj;
        derWriter.getClass();
        qg9Var.getClass();
        derWriter.a().N0(qg9Var);
    }
}
