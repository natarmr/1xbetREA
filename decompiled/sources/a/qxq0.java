package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;

/* JADX INFO: loaded from: classes6.dex */
public final class qxq0 implements wxq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopSectionKey.Header f29499a;

    public qxq0(TopSectionKey.Header header) {
        header.getClass();
        this.f29499a = header;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxq0) && Intrinsics.d(this.f29499a, ((qxq0) obj).f29499a);
    }

    public final int hashCode() {
        return this.f29499a.hashCode();
    }

    public final String toString() {
        return "HeaderAllButtonClick(type=" + this.f29499a + Separators.RPAREN;
    }
}
