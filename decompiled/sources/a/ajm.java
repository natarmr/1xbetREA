package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ajm implements bjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f983a;
    public final o0x b;
    public final o0x c;
    public final o0x d;
    public final Integer e;
    public final Integer f;

    public ajm(o0x o0xVar, o0x o0xVar2, o0x o0xVar3, o0x o0xVar4, Integer num, Integer num2, int i) {
        num = (i & 16) != 0 ? null : num;
        num2 = (i & 64) != 0 ? null : num2;
        this.f983a = o0xVar;
        this.b = o0xVar2;
        this.c = o0xVar3;
        this.d = o0xVar4;
        this.e = num;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajm)) {
            return false;
        }
        ajm ajmVar = (ajm) obj;
        return this.f983a.equals(ajmVar.f983a) && this.b.equals(ajmVar.b) && this.c.equals(ajmVar.c) && this.d.equals(ajmVar.d) && Intrinsics.d(this.e, ajmVar.e) && Intrinsics.d(this.f, ajmVar.f);
    }

    public final int hashCode() {
        int iD = w6x.d(this.d, w6x.d(this.c, w6x.d(this.b, this.f983a.hashCode() * 31, 31), 31), 31);
        Integer num = this.e;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 961;
        Integer num2 = this.f;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TechnicalWorks(squarePictureLink=");
        sb.append(this.f983a);
        sb.append(", squareFallbackPictureLink=");
        sb.append(this.b);
        sb.append(", rectanglePictureLink=");
        sb.append(this.c);
        sb.append(", rectangleFallbackPictureLink=");
        sb.append(this.d);
        sb.append(", placeholderImageRes=");
        return ua80.l(sb, this.e, ", placeholderIconRes=null, worksIconRes=", this.f, Separators.RPAREN);
    }
}
