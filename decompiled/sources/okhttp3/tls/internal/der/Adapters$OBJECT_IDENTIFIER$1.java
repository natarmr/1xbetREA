package okhttp3.tls.internal.der;

import a.f99;
import a.jf4;
import java.io.EOFException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"okhttp3/tls/internal/der/Adapters$OBJECT_IDENTIFIER$1", "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Adapters$OBJECT_IDENTIFIER$1 implements BasicDerAdapter.Codec<String> {
    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final Object a(DerReader derReader) {
        derReader.getClass();
        f99 f99Var = new f99();
        long jE = derReader.e();
        if (0 <= jE && jE < 40) {
            f99Var.W(0L);
            f99Var.V(46);
            f99Var.W(jE);
        } else if (40 > jE || jE >= 80) {
            f99Var.W(2L);
            f99Var.V(46);
            f99Var.W(jE - 80);
        } else {
            f99Var.W(1L);
            f99Var.V(46);
            f99Var.W(jE - 40);
        }
        while (derReader.a() < derReader.c) {
            f99Var.V(46);
            f99Var.W(derReader.e());
        }
        return f99Var.O();
    }

    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final void b(DerWriter derWriter, Object obj) throws EOFException {
        String str = (String) obj;
        derWriter.getClass();
        str.getClass();
        f99 f99Var = new f99();
        f99Var.c0(str);
        long jI = f99Var.I();
        if (f99Var.readByte() != 46) {
            jf4.o("Failed requirement.");
            return;
        }
        derWriter.c((jI * 40) + f99Var.I());
        while (!f99Var.v0()) {
            if (f99Var.readByte() != 46) {
                jf4.o("Failed requirement.");
                return;
            }
            derWriter.c(f99Var.I());
        }
    }
}
