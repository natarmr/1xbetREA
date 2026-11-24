package a;

import android.gov.nist.core.Separators;
import java.util.List;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class w5c implements y5c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38575a;
    public final swp0 b;
    public final List c;
    public final List d;
    public final int e;
    public final obk0 f;
    public final SendConfirmationSMSScreen g;
    public final boolean h;

    public w5c(String str, swp0 swp0Var, List list, List list2, int i, obk0 obk0Var, SendConfirmationSMSScreen sendConfirmationSMSScreen, boolean z) {
        obk0Var.getClass();
        this.f38575a = str;
        this.b = swp0Var;
        this.c = list;
        this.d = list2;
        this.e = i;
        this.f = obk0Var;
        this.g = sendConfirmationSMSScreen;
        this.h = z;
    }

    @Override // a.d6c
    public final int N() {
        return this.e;
    }

    @Override // a.d6c
    public final obk0 P() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w5c) {
            w5c w5cVar = (w5c) obj;
            if (this.f38575a.equals(w5cVar.f38575a) && this.b.equals(w5cVar.b) && this.c.equals(w5cVar.c) && this.d.equals(w5cVar.d) && this.e == w5cVar.e && this.f == w5cVar.f && this.g == w5cVar.g && this.h == w5cVar.h) {
                return true;
            }
        }
        return false;
    }

    @Override // a.d6c
    public final String getPhoneNumber() {
        return this.f38575a;
    }

    @Override // a.d6c
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + twn.a(this.e, dw9.a(dw9.a((this.b.hashCode() + (this.f38575a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31)) * 31)) * 31);
    }

    @Override // a.d6c
    public final int p() {
        return 27;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivatePhone(phoneNumber=");
        sb.append(this.f38575a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", availableActivationTypeList=");
        b1j.y(", availableRepeatActivationTypeList=", ", smsTime=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", currentActivationType=");
        sb.append(this.f);
        sb.append(", onTokenExpiredNavigationScreen=");
        sb.append(this.g);
        sb.append(", isRepeatFlow=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // a.d6c
    public final boolean u() {
        return this.h;
    }

    @Override // a.d6c
    public final List z() {
        return this.c;
    }
}
