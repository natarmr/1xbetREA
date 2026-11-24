package a;

/* JADX INFO: loaded from: classes3.dex */
public final class omj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25507a;
    public final long b;

    public omj(String str, long j) {
        this.f25507a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omj)) {
            return false;
        }
        omj omjVar = (omj) obj;
        return this.f25507a.equals(omjVar.f25507a) && this.b == omjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + rw2.b(this.f25507a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "CyberPartnerTeam(teamName=", this.f25507a, ", feedId=");
        sbO.append(", hasBackStack=false)");
        return sbO.toString();
    }
}
