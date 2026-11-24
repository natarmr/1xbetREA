package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bhw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2629a;
    public final String b;

    public bhw0(String str, String str2) {
        this.f2629a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bhw0) {
            bhw0 bhw0Var = (bhw0) obj;
            String str = bhw0Var.f2629a;
            String str2 = this.f2629a;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = bhw0Var.b;
                String str4 = this.b;
                if (str4 != null ? str4.equals(str3) : str3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2629a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("RecaptchaEnforcementState{provider=", this.f2629a, ", enforcementState=", this.b, "}");
    }
}
