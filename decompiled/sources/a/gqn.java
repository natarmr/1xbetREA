package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gqn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11741a;
    public final int b;
    public final ypn c;

    static {
        int i = ypn.b;
    }

    public gqn(String str, int i, ypn ypnVar) {
        this.f11741a = str;
        this.b = i;
        this.c = ypnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqn)) {
            return false;
        }
        gqn gqnVar = (gqn) obj;
        return this.f11741a.equals(gqnVar.f11741a) && this.b == gqnVar.b && this.c.equals(gqnVar.c);
    }

    public final int hashCode() {
        return this.c.f43039a.hashCode() + twn.a(this.b, this.f11741a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "EditProfileInfoModel(message=", this.f11741a, ", messageId=", ", editProfileErrorFormModel=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
