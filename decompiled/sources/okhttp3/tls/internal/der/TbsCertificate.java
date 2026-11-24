package okhttp3.tls.internal.der;

import a.dw9;
import java.math.BigInteger;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/TbsCertificate;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TbsCertificate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46264a;
    public final BigInteger b;
    public final AlgorithmIdentifier c;
    public final List d;
    public final Validity e;
    public final List f;
    public final SubjectPublicKeyInfo g;
    public final BitString h;
    public final BitString i;
    public final List j;

    public TbsCertificate(long j, BigInteger bigInteger, AlgorithmIdentifier algorithmIdentifier, List list, Validity validity, List list2, SubjectPublicKeyInfo subjectPublicKeyInfo, BitString bitString, BitString bitString2, List list3) {
        bigInteger.getClass();
        subjectPublicKeyInfo.getClass();
        this.f46264a = j;
        this.b = bigInteger;
        this.c = algorithmIdentifier;
        this.d = list;
        this.e = validity;
        this.f = list2;
        this.g = subjectPublicKeyInfo;
        this.h = bitString;
        this.i = bitString2;
        this.j = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TbsCertificate)) {
            return false;
        }
        TbsCertificate tbsCertificate = (TbsCertificate) obj;
        return this.f46264a == tbsCertificate.f46264a && Intrinsics.d(this.b, tbsCertificate.b) && this.c.equals(tbsCertificate.c) && this.d.equals(tbsCertificate.d) && this.e.equals(tbsCertificate.e) && this.f.equals(tbsCertificate.f) && Intrinsics.d(this.g, tbsCertificate.g) && Intrinsics.d(this.h, tbsCertificate.h) && Intrinsics.d(this.i, tbsCertificate.i) && this.j.equals(tbsCertificate.j);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + dw9.a((this.e.hashCode() + dw9.a((this.c.hashCode() + ((this.b.hashCode() + (((int) this.f46264a) * 31)) * 31)) * 31, 31, this.d)) * 31, 31, this.f)) * 31;
        BitString bitString = this.h;
        int iHashCode2 = (iHashCode + (bitString != null ? bitString.hashCode() : 0)) * 31;
        BitString bitString2 = this.i;
        return this.j.hashCode() + ((iHashCode2 + (bitString2 != null ? bitString2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TbsCertificate(version=" + this.f46264a + ", serialNumber=" + this.b + ", signature=" + this.c + ", issuer=" + this.d + ", validity=" + this.e + ", subject=" + this.f + ", subjectPublicKeyInfo=" + this.g + ", issuerUniqueID=" + this.h + ", subjectUniqueID=" + this.i + ", extensions=" + this.j + ')';
    }
}
