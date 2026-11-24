package okhttp3.tls.internal.der;

import a.e9d0;
import a.k1;
import java.net.ProtocolException;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"okhttp3/tls/internal/der/Adapters$ANY_VALUE$1", "Lokhttp3/tls/internal/der/DerAdapter;", "Lokhttp3/tls/internal/der/AnyValue;", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Adapters$ANY_VALUE$1 implements DerAdapter<AnyValue> {
    @Override // okhttp3.tls.internal.der.DerAdapter
    public final void b(DerWriter derWriter, Object obj) {
        AnyValue anyValue = (AnyValue) obj;
        derWriter.getClass();
        anyValue.getClass();
        derWriter.b("ANY", anyValue.f46249a, anyValue.b, new k1(derWriter, anyValue, (byte) 15));
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final boolean c(DerHeader derHeader) {
        return true;
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final Object d(DerReader derReader) throws ProtocolException {
        derReader.getClass();
        boolean z = derReader.c() != null;
        ArrayList arrayList = derReader.e;
        if (!z) {
            e9d0.j("expected a value");
            return null;
        }
        DerHeader derHeader = derReader.g;
        derHeader.getClass();
        long j = derHeader.d;
        derReader.g = null;
        long j2 = derReader.c;
        boolean z2 = derReader.f;
        long jA = j != -1 ? derReader.a() + j : -1L;
        if (j2 != -1 && jA > j2) {
            e9d0.j("enclosed object too large");
            return null;
        }
        derReader.c = jA;
        derReader.f = derHeader.c;
        arrayList.add("ANY");
        try {
            return new AnyValue(derHeader.f46258a, derHeader.b, derHeader.c, derHeader.d, derReader.b.q0(derReader.b()));
        } finally {
            derReader.g = null;
            derReader.c = j2;
            derReader.f = z2;
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
