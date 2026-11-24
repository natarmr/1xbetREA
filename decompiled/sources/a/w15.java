package a;

/* JADX INFO: loaded from: classes2.dex */
public final class w15 extends r9f {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final q9f k;
    public final u8f l;
    public final r8f m;

    public w15(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, q9f q9fVar, u8f u8fVar, r8f r8fVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = q9fVar;
        this.l = u8fVar;
        this.m = r8fVar;
    }

    public final v15 a() {
        v15 v15Var = new v15();
        v15Var.f36612a = this.b;
        v15Var.b = this.c;
        v15Var.c = this.d;
        v15Var.d = this.e;
        v15Var.e = this.f;
        v15Var.f = this.g;
        v15Var.g = this.h;
        v15Var.h = this.i;
        v15Var.i = this.j;
        v15Var.j = this.k;
        v15Var.k = this.l;
        v15Var.l = this.m;
        v15Var.m = (byte) 1;
        return v15Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r9f) {
            w15 w15Var = (w15) ((r9f) obj);
            if (this.b.equals(w15Var.b) && this.c.equals(w15Var.c) && this.d == w15Var.d && this.e.equals(w15Var.e)) {
                String str = w15Var.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = w15Var.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = w15Var.h;
                        String str6 = this.h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(w15Var.i) && this.j.equals(w15Var.j)) {
                                q9f q9fVar = w15Var.k;
                                q9f q9fVar2 = this.k;
                                if (q9fVar2 != null ? q9fVar2.equals(q9fVar) : q9fVar == null) {
                                    u8f u8fVar = w15Var.l;
                                    u8f u8fVar2 = this.l;
                                    if (u8fVar2 != null ? u8fVar2.equals(u8fVar) : u8fVar == null) {
                                        r8f r8fVar = w15Var.m;
                                        r8f r8fVar2 = this.m;
                                        if (r8fVar2 != null ? r8fVar2.equals(r8fVar) : r8fVar == null) {
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
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        q9f q9fVar = this.k;
        int iHashCode5 = (iHashCode4 ^ (q9fVar == null ? 0 : q9fVar.hashCode())) * 1000003;
        u8f u8fVar = this.l;
        int iHashCode6 = (iHashCode5 ^ (u8fVar == null ? 0 : u8fVar.hashCode())) * 1000003;
        r8f r8fVar = this.m;
        return iHashCode6 ^ (r8fVar != null ? r8fVar.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
