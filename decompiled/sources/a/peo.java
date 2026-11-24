package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class peo implements cd40 {
    public static final androidx.media3.common.b g;
    public static final androidx.media3.common.b h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26863a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        awq awqVar = new awq();
        awqVar.o = mg40.n("application/id3");
        g = new androidx.media3.common.b(awqVar);
        awq awqVar2 = new awq();
        awqVar2.o = mg40.n("application/x-scte35");
        h = new androidx.media3.common.b(awqVar2);
    }

    public peo(String str, String str2, long j, long j2, byte[] bArr) {
        this.f26863a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // a.cd40
    public final androidx.media3.common.b a() {
        switch (this.f26863a) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // a.cd40
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || peo.class != obj.getClass()) {
            return false;
        }
        peo peoVar = (peo) obj;
        return this.c == peoVar.c && this.d == peoVar.d && this.f26863a.equals(peoVar.f26863a) && this.b.equals(peoVar.b) && Arrays.equals(this.e, peoVar.e);
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iB = ua80.b(ua80.b(527, 31, this.f26863a), 31, this.b);
        long j = this.c;
        int i2 = (iB + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int iHashCode = Arrays.hashCode(this.e) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        this.f = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f26863a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
