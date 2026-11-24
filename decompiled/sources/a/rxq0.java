package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.top.api.presentation.header.TopHeaderTagType;

/* JADX INFO: loaded from: classes6.dex */
public final class rxq0 implements wxq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopHeaderTagType f31278a;

    public rxq0(TopHeaderTagType topHeaderTagType) {
        topHeaderTagType.getClass();
        this.f31278a = topHeaderTagType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxq0) && Intrinsics.d(this.f31278a, ((rxq0) obj).f31278a);
    }

    public final int hashCode() {
        return this.f31278a.hashCode();
    }

    public final String toString() {
        return "HeaderTagClick(type=" + this.f31278a + Separators.RPAREN;
    }
}
