package a;

import android.gov.nist.core.Separators;
import org.xplatform.security.api.domain.models.SecretQuestionModel;

/* JADX INFO: loaded from: classes5.dex */
public final class clh0 implements dlh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretQuestionModel f4560a;

    public clh0(SecretQuestionModel secretQuestionModel) {
        this.f4560a = secretQuestionModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof clh0) && this.f4560a.equals(((clh0) obj).f4560a);
    }

    public final int hashCode() {
        return this.f4560a.hashCode();
    }

    public final String toString() {
        return "SecretQuestionClicked(item=" + this.f4560a + Separators.RPAREN;
    }
}
