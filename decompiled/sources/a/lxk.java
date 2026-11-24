package a;

import android.gov.nist.core.Separators;
import org.xplatform.personal.impl.presentation.documentchoice.models.PersonalDocumentUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class lxk implements nxk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PersonalDocumentUiModel f20817a;

    public lxk(PersonalDocumentUiModel personalDocumentUiModel) {
        this.f20817a = personalDocumentUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxk) && this.f20817a.equals(((lxk) obj).f20817a);
    }

    public final int hashCode() {
        return this.f20817a.hashCode();
    }

    public final String toString() {
        return "ExitWithResult(item=" + this.f20817a + Separators.RPAREN;
    }
}
