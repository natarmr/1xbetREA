package okhttp3.tls.internal.der;

import java.net.ProtocolException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"okhttp3/tls/internal/der/Adapters$UTC_TIME$1", "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Adapters$UTC_TIME$1 implements BasicDerAdapter.Codec<Long> {
    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final Object a(DerReader derReader) throws ProtocolException {
        derReader.getClass();
        String strD = derReader.d();
        BasicDerAdapter basicDerAdapter = Adapters.f46243a;
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
        try {
            return Long.valueOf(simpleDateFormat.parse(strD).getTime());
        } catch (ParseException unused) {
            throw new ProtocolException("Failed to parse UTCTime ".concat(strD));
        }
    }

    @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
    public final void b(DerWriter derWriter, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        derWriter.getClass();
        BasicDerAdapter basicDerAdapter = Adapters.f46243a;
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
        String str = simpleDateFormat.format(Long.valueOf(jLongValue));
        str.getClass();
        derWriter.a().D(str);
    }
}
