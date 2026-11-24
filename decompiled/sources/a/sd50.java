package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class sd50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f32016a;

    public sd50(Function0 function0) {
        this.f32016a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd50) && this.f32016a.equals(((sd50) obj).f32016a);
    }

    public final int hashCode() {
        return this.f32016a.hashCode();
    }

    public final String toString() {
        return "Action(action=" + this.f32016a + Separators.RPAREN;
    }
}
