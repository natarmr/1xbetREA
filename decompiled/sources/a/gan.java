package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gan implements ian {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0x f10976a;
    public final o0x b;
    public final m0x c;
    public final qan d;
    public final fan e;
    public final fan f;
    public final String g;
    public final ean h;

    public gan(m0x m0xVar, m0x m0xVar2, qan qanVar, fan fanVar, fan fanVar2, String str, ean eanVar) {
        this.f10976a = m0xVar;
        this.b = m0xVar;
        this.c = m0xVar2;
        this.d = qanVar;
        this.e = fanVar;
        this.f = fanVar2;
        this.g = str;
        this.h = eanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gan)) {
            return false;
        }
        gan ganVar = (gan) obj;
        return this.f10976a.equals(ganVar.f10976a) && this.b.equals(ganVar.b) && this.c.equals(ganVar.c) && this.d.equals(ganVar.d) && this.e.equals(ganVar.e) && Intrinsics.d(this.f, ganVar.f) && this.g.equals(ganVar.g) && this.h.equals(ganVar.h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + cs0.a(this.c, w6x.d(this.b, this.f10976a.hashCode() * 31, 31), 31)) * 31)) * 31;
        fan fanVar = this.f;
        return this.h.hashCode() + ua80.b((iHashCode + (fanVar == null ? 0 : fanVar.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        return "Content(picture=" + this.f10976a + ", fallbackPicture=" + this.b + ", placeholder=" + this.c + ", pictureContainerUiModel=" + this.d + ", firstTag=" + this.e + ", secondTag=" + this.f + ", title=" + this.g + ", buttonsUiModel=" + this.h + Separators.RPAREN;
    }
}
