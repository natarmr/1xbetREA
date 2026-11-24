package okhttp3.tls.internal.der;

import a.brm0;
import a.rw2;
import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/tls/internal/der/DerHeader;", "", "Companion", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DerHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46258a;
    public final long b;
    public final boolean c;
    public final long d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/tls/internal/der/DerHeader$Companion;", "", "", "TAG_CLASS_UNIVERSAL", TokenNames.I, "TAG_CLASS_APPLICATION", "TAG_CLASS_CONTEXT_SPECIFIC", "TAG_CLASS_PRIVATE", "", "TAG_END_OF_CONTENTS", "J", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public DerHeader(int i, long j, long j2, boolean z) {
        this.f46258a = i;
        this.b = j;
        this.c = z;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerHeader)) {
            return false;
        }
        DerHeader derHeader = (DerHeader) obj;
        return this.f46258a == derHeader.f46258a && this.b == derHeader.b && this.c == derHeader.c && this.d == derHeader.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + brm0.e(rw2.b(Integer.hashCode(this.f46258a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f46258a);
        sb.append('/');
        sb.append(this.b);
        return sb.toString();
    }
}
