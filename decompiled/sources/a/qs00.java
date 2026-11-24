package a;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qs00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f29235a;

    public qs00(Locale locale) {
        this.f29235a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof qs00)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.d(this.f29235a.toLanguageTag(), ((qs00) obj).f29235a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f29235a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f29235a.toLanguageTag();
    }
}
