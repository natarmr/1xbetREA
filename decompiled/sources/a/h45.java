package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h45 extends iv00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12418a;
    public final Integer b;
    public final mfd c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final sk50 h;
    public final too i;

    public h45(long j, Integer num, mfd mfdVar, long j2, byte[] bArr, String str, long j3, sk50 sk50Var, too tooVar) {
        this.f12418a = j;
        this.b = num;
        this.c = mfdVar;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = sk50Var;
        this.i = tooVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iv00) {
            iv00 iv00Var = (iv00) obj;
            h45 h45Var = (h45) iv00Var;
            if (this.f12418a == h45Var.f12418a) {
                Integer num = h45Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    mfd mfdVar = h45Var.c;
                    mfd mfdVar2 = this.c;
                    if (mfdVar2 != null ? mfdVar2.equals(mfdVar) : mfdVar == null) {
                        if (this.d == h45Var.d) {
                            if (Arrays.equals(this.e, iv00Var instanceof h45 ? ((h45) iv00Var).e : h45Var.e)) {
                                String str = h45Var.f;
                                String str2 = this.f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.g == h45Var.g) {
                                        sk50 sk50Var = h45Var.h;
                                        sk50 sk50Var2 = this.h;
                                        if (sk50Var2 != null ? sk50Var2.equals(sk50Var) : sk50Var == null) {
                                            too tooVar = h45Var.i;
                                            too tooVar2 = this.i;
                                            if (tooVar2 != null ? tooVar2.equals(tooVar) : tooVar == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f12418a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        mfd mfdVar = this.c;
        int iHashCode2 = (iHashCode ^ (mfdVar == null ? 0 : mfdVar.hashCode())) * 1000003;
        long j2 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        sk50 sk50Var = this.h;
        int iHashCode5 = (i2 ^ (sk50Var == null ? 0 : sk50Var.hashCode())) * 1000003;
        too tooVar = this.i;
        return iHashCode5 ^ (tooVar != null ? tooVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f12418a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
