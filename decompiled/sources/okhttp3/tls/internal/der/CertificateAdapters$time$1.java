package okhttp3.tls.internal.der;

import a.jf4;
import java.net.ProtocolException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"okhttp3/tls/internal/der/CertificateAdapters$time$1", "Lokhttp3/tls/internal/der/DerAdapter;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CertificateAdapters$time$1 implements DerAdapter<Long> {
    @Override // okhttp3.tls.internal.der.DerAdapter
    public final void b(DerWriter derWriter, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        derWriter.getClass();
        if (-631152000000L > jLongValue || jLongValue >= 2524608000000L) {
            Adapters.l.b(derWriter, Long.valueOf(jLongValue));
        } else {
            Adapters.k.b(derWriter, Long.valueOf(jLongValue));
        }
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final boolean c(DerHeader derHeader) {
        return Adapters.k.c(derHeader) || Adapters.l.c(derHeader);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final Object d(DerReader derReader) throws ProtocolException {
        long jLongValue;
        derReader.getClass();
        DerHeader derHeaderC = derReader.c();
        if (derHeaderC == null) {
            throw new ProtocolException("expected time but was exhausted at " + derReader);
        }
        long j = derHeaderC.b;
        int i = derHeaderC.f46258a;
        BasicDerAdapter basicDerAdapter = Adapters.k;
        if (i == basicDerAdapter.b && j == basicDerAdapter.c) {
            jLongValue = ((Number) basicDerAdapter.d(derReader)).longValue();
        } else {
            BasicDerAdapter basicDerAdapter2 = Adapters.l;
            if (i != basicDerAdapter2.b || j != basicDerAdapter2.c) {
                jf4.j(derHeaderC, derReader, "expected time but was ");
                return null;
            }
            jLongValue = ((Number) basicDerAdapter2.d(derReader)).longValue();
        }
        return Long.valueOf(jLongValue);
    }
}
