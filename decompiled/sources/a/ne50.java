package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ne50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f23368a;

    public ne50(Function1 function1) {
        this.f23368a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ne50) && this.f23368a.equals(((ne50) obj).f23368a);
    }

    public final int hashCode() {
        return this.f23368a.hashCode();
    }

    public final String toString() {
        return "SuspendAction(action=" + this.f23368a + Separators.RPAREN;
    }
}
