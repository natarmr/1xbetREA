package okhttp3.tls.internal.der;

import a.g8x;
import a.t99;
import a.zae0;
import java.net.ProtocolException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"okhttp3/tls/internal/der/Adapters$INTEGER_AS_LONG$1", "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Adapters$INTEGER_AS_LONG$1 implements BasicDerAdapter.Codec<Long> {
    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final Object a(DerReader derReader) throws ProtocolException {
        derReader.getClass();
        zae0 zae0Var = derReader.b;
        long jB = derReader.b();
        if (1 <= jB && jB < 9) {
            long j = zae0Var.readByte();
            while (derReader.a() < derReader.c) {
                j = (j << 8) + ((long) (zae0Var.readByte() & 255));
            }
            return Long.valueOf(j);
        }
        throw new ProtocolException("unexpected length: " + derReader.b() + " at " + derReader);
    }

    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final void b(DerWriter derWriter, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        derWriter.getClass();
        t99 t99VarA = derWriter.a();
        int iNumberOfLeadingZeros = ((((65 - (jLongValue < 0 ? Long.numberOfLeadingZeros(~jLongValue) : Long.numberOfLeadingZeros(jLongValue))) + 7) / 8) - 1) * 8;
        int iJ = g8x.J(iNumberOfLeadingZeros, 0, -8);
        if (iJ > iNumberOfLeadingZeros) {
            return;
        }
        while (true) {
            t99VarA.writeByte((int) (jLongValue >> iNumberOfLeadingZeros));
            if (iNumberOfLeadingZeros == iJ) {
                return;
            } else {
                iNumberOfLeadingZeros -= 8;
            }
        }
    }
}
