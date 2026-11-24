package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.impl.transfers.presentation.dialogs.disciplinefilter.model.TransfersDisciplineFilterBottomParams;

/* JADX INFO: loaded from: classes4.dex */
public final class lks0 implements oks0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransfersDisciplineFilterBottomParams f20216a;

    public lks0(TransfersDisciplineFilterBottomParams transfersDisciplineFilterBottomParams) {
        this.f20216a = transfersDisciplineFilterBottomParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lks0) && this.f20216a.equals(((lks0) obj).f20216a);
    }

    public final int hashCode() {
        return this.f20216a.hashCode();
    }

    public final String toString() {
        return "ShowDisciplineDialog(params=" + this.f20216a + Separators.RPAREN;
    }
}
