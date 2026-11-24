package a;

import android.gov.nist.core.Separators;
import org.xplatform.security.api.domain.models.SecretQuestionModel;

/* JADX INFO: loaded from: classes5.dex */
public final class kkh0 implements okh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretQuestionModel f18440a;

    public kkh0(SecretQuestionModel secretQuestionModel) {
        this.f18440a = secretQuestionModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkh0) && this.f18440a.equals(((kkh0) obj).f18440a);
    }

    public final int hashCode() {
        return this.f18440a.hashCode();
    }

    public final String toString() {
        return "OnSelectQuestionItem(selectedItem=" + this.f18440a + Separators.RPAREN;
    }
}
