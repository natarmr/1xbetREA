package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mmh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final llh0 f22038a;
    public final List b;
    public final boolean c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final amh0 i;

    public mmh0(llh0 llh0Var, List list, boolean z, int i, String str, String str2, String str3, boolean z2, amh0 amh0Var) {
        list.getClass();
        this.f22038a = llh0Var;
        this.b = list;
        this.c = z;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z2;
        this.i = amh0Var;
    }

    public static mmh0 a(mmh0 mmh0Var, llh0 llh0Var, List list, boolean z, int i, String str, String str2, String str3, boolean z2, amh0 amh0Var, int i2) {
        if ((i2 & 1) != 0) {
            llh0Var = mmh0Var.f22038a;
        }
        llh0 llh0Var2 = llh0Var;
        if ((i2 & 2) != 0) {
            list = mmh0Var.b;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            z = mmh0Var.c;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            i = mmh0Var.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str = mmh0Var.e;
        }
        String str4 = str;
        String str5 = (i2 & 32) != 0 ? mmh0Var.f : str2;
        String str6 = (i2 & 64) != 0 ? mmh0Var.g : str3;
        boolean z4 = (i2 & 128) != 0 ? mmh0Var.h : z2;
        amh0 amh0Var2 = (i2 & 256) != 0 ? mmh0Var.i : amh0Var;
        mmh0Var.getClass();
        list2.getClass();
        str4.getClass();
        str5.getClass();
        return new mmh0(llh0Var2, list2, z3, i3, str4, str5, str6, z4, amh0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmh0)) {
            return false;
        }
        mmh0 mmh0Var = (mmh0) obj;
        return this.f22038a.equals(mmh0Var.f22038a) && Intrinsics.d(this.b, mmh0Var.b) && this.c == mmh0Var.c && this.d == mmh0Var.d && this.e.equals(mmh0Var.e) && this.f.equals(mmh0Var.f) && this.g.equals(mmh0Var.g) && this.h == mmh0Var.h && Intrinsics.d(this.i, mmh0Var.i);
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(ua80.b(ua80.b(twn.a(this.d, brm0.e(dw9.a(this.f22038a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        amh0 amh0Var = this.i;
        return iE + (amh0Var == null ? 0 : amh0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SecretQuestionState(contentState=");
        sb.append(this.f22038a);
        sb.append(", secretQuestionList=");
        sb.append(this.b);
        sb.append(", loaderState=");
        ua80.q(this.d, ", selectedQuestionId=", ", userQuestionValue=", sb, this.c);
        f140.v(sb, this.e, ", answerValue=", this.f, ", userQuestionErrorMessage=");
        brm0.C(this.g, ", connected=", ", focusedTextInput=", sb, this.h);
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
