package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class pgd0 implements qgd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26950a;

    public pgd0(String str) {
        ngd0 ngd0Var = ngd0.f23480a;
        str.getClass();
        this.f26950a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgd0) || !Intrinsics.d(this.f26950a, ((pgd0) obj).f26950a)) {
            return false;
        }
        ngd0 ngd0Var = ngd0.f23480a;
        return true;
    }

    public final int hashCode() {
        return ngd0.f23480a.hashCode() + twn.a(R.style.DSButton_Large_Secondary, this.f26950a.hashCode() * 31, 31);
    }

    public final String toString() {
        ngd0 ngd0Var = ngd0.f23480a;
        StringBuilder sbP = kng0.p(R.style.DSButton_Large_Secondary, "Enable(title=", this.f26950a, ", style=", ", action=");
        sbP.append(ngd0Var);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
