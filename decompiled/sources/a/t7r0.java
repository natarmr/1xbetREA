package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.top.api.presentation.header.TopHeaderTagType;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;

/* JADX INFO: loaded from: classes6.dex */
public final class t7r0 implements qdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopSectionKey.Header f33480a;
    public final TopHeaderTagType b;
    public final jjm c;
    public final kjm d;

    public t7r0(TopSectionKey.Header header, TopHeaderTagType topHeaderTagType, jjm jjmVar) {
        kjm kjmVar = kjm.f18392a;
        header.getClass();
        this.f33480a = header;
        this.b = topHeaderTagType;
        this.c = jjmVar;
        this.d = kjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7r0)) {
            return false;
        }
        t7r0 t7r0Var = (t7r0) obj;
        return Intrinsics.d(this.f33480a, t7r0Var.f33480a) && Intrinsics.d(this.b, t7r0Var.b) && Intrinsics.d(this.c, t7r0Var.c) && this.d == t7r0Var.d;
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return this.f33480a;
    }

    public final int hashCode() {
        int iHashCode = this.f33480a.hashCode() * 31;
        TopHeaderTagType topHeaderTagType = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (topHeaderTagType == null ? 0 : topHeaderTagType.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "TopHeaderUiModel(key=" + this.f33480a + ", tagType=" + this.b + ", model=" + this.c + ", sizeType=" + this.d + Separators.RPAREN;
    }
}
