package okhttp3.tls.internal.der;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lokhttp3/tls/internal/der/DerAdapter;", TokenNames.T, "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DerAdapter<T> {
    void b(DerWriter derWriter, Object obj);

    boolean c(DerHeader derHeader);

    Object d(DerReader derReader);

    default BasicDerAdapter e(long j, String str) {
        return new BasicDerAdapter(str, 0, j, new BasicDerAdapter.Codec<List<Object>>() { // from class: okhttp3.tls.internal.der.DerAdapter$asSequenceOf$codec$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final Object a(DerReader derReader) {
                derReader.getClass();
                ArrayList arrayList = new ArrayList();
                while (derReader.c() != null) {
                    arrayList.add(this.f46256a.d(derReader));
                }
                return arrayList;
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final void b(DerWriter derWriter, Object obj) {
                List list = (List) obj;
                derWriter.getClass();
                list.getClass();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f46256a.b(derWriter, it.next());
                }
            }
        }, false, null, false);
    }

    default BasicDerAdapter f(int i, long j, final Boolean bool) {
        return new BasicDerAdapter("EXPLICIT", i, j, new BasicDerAdapter.Codec<Object>() { // from class: okhttp3.tls.internal.der.DerAdapter$withExplicitBox$codec$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final Object a(DerReader derReader) {
                derReader.getClass();
                return this.f46257a.d(derReader);
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final void b(DerWriter derWriter, Object obj) {
                derWriter.getClass();
                this.f46257a.b(derWriter, obj);
                Boolean bool2 = bool;
                if (bool2 != null) {
                    derWriter.d = bool2.booleanValue();
                }
            }
        }, false, null, false);
    }
}
