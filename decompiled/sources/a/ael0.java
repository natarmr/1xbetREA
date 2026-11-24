package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ael0 implements eel0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f735a;

    public ael0(String str) {
        str.getClass();
        this.f735a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ael0) && Intrinsics.d(this.f735a, ((ael0) obj).f735a);
    }

    public final int hashCode() {
        return this.f735a.hashCode();
    }

    public final String toString() {
        return kng0.l("Default(sportIconUrl=", this.f735a, Separators.RPAREN);
    }
}
