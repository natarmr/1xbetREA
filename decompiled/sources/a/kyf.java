package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class kyf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f19101a = new jyf((byte) 0);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyf) && this.f19101a.equals(((kyf) obj).f19101a);
    }

    public final int hashCode() {
        return this.f19101a.hashCode() + (Boolean.hashCode(false) * 961);
    }

    public final String toString() {
        return "CustomWheelBehavior(defaultCustomInfinityMode=false, customInfinityResolver=null, onWheelSettled=" + this.f19101a + Separators.RPAREN;
    }
}
