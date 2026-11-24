package okhttp3.tls.internal.der;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"okhttp3/tls/internal/der/Adapters$UTF8_STRING$1", "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Adapters$UTF8_STRING$1 implements BasicDerAdapter.Codec<String> {
    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final Object a(DerReader derReader) {
        derReader.getClass();
        return derReader.d();
    }

    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final void b(DerWriter derWriter, Object obj) {
        String str = (String) obj;
        derWriter.getClass();
        str.getClass();
        derWriter.a().D(str);
    }
}
