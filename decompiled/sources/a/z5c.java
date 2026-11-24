package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class z5c implements d6c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43808a;
    public final swp0 b;
    public final byte c;
    public final List d;
    public final List e;
    public final int f;
    public final obk0 g;
    public final boolean h;
    public final SendConfirmationSMSScreen i;

    /* JADX WARN: Multi-variable type inference failed */
    public z5c(String str, swp0 swp0Var, int i, List list, List list2, int i2, obk0 obk0Var, boolean z, SendConfirmationSMSScreen sendConfirmationSMSScreen) {
        str.getClass();
        obk0Var.getClass();
        this.f43808a = str;
        this.b = swp0Var;
        this.c = i;
        this.d = list;
        this.e = list2;
        this.f = i2;
        this.g = obk0Var;
        this.h = z;
        this.i = sendConfirmationSMSScreen;
    }

    @Override // a.d6c
    public final int N() {
        return this.f;
    }

    @Override // a.d6c
    public final obk0 P() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z5c) {
            z5c z5cVar = (z5c) obj;
            return Intrinsics.d(this.f43808a, z5cVar.f43808a) && this.b.equals(z5cVar.b) && this.c == z5cVar.c && this.d.equals(z5cVar.d) && this.e.equals(z5cVar.e) && this.f == z5cVar.f && this.g == z5cVar.g && this.h == z5cVar.h && this.i == z5cVar.i;
        }
        return false;
    }

    @Override // a.d6c
    public final String getPhoneNumber() {
        return this.f43808a;
    }

    @Override // a.d6c
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e((this.g.hashCode() + twn.a(this.f, dw9.a(dw9.a(twn.a(this.c, (this.b.hashCode() + (this.f43808a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31)) * 31, 31, this.h);
    }

    @Override // a.d6c
    public final int p() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneActivationConfirmation(phoneNumber=");
        sb.append(this.f43808a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", confirmTypeAlias=");
        ohs0.v(this.c, ", availableActivationTypeList=", ", availableRepeatActivationTypeList=", sb, this.d);
        brm0.v(this.f, ", smsTime=", ", currentActivationType=", sb, this.e);
        sb.append(this.g);
        sb.append(", isRepeatFlow=");
        sb.append(this.h);
        sb.append(", onTokenExpiredNavigationScreen=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // a.d6c
    public final boolean u() {
        return this.h;
    }

    @Override // a.d6c
    public final List z() {
        return this.d;
    }
}
