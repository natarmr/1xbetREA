package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.api.championships.hltv.SelectAwardParams;

/* JADX INFO: loaded from: classes4.dex */
public final class dzh0 implements ezh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectAwardParams f6943a;

    public dzh0(SelectAwardParams selectAwardParams) {
        this.f6943a = selectAwardParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dzh0) && this.f6943a.equals(((dzh0) obj).f6943a);
    }

    public final int hashCode() {
        return this.f6943a.hashCode();
    }

    public final String toString() {
        return "OnSendParams(params=" + this.f6943a + Separators.RPAREN;
    }
}
