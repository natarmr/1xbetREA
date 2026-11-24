package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jan implements lan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f16198a;
    public final o0x b;
    public final m0x c;
    public final qan d;
    public final String e;
    public final String f;
    public final boolean g;

    public jan(o0x o0xVar, o0x o0xVar2, m0x m0xVar, qan qanVar, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f16198a = o0xVar;
        this.b = o0xVar2;
        this.c = m0xVar;
        this.d = qanVar;
        this.e = str;
        this.f = str2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jan)) {
            return false;
        }
        jan janVar = (jan) obj;
        return this.f16198a.equals(janVar.f16198a) && this.b.equals(janVar.b) && this.c.equals(janVar.c) && this.d.equals(janVar.d) && Intrinsics.d(this.e, janVar.e) && Intrinsics.d(this.f, janVar.f) && this.g == janVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b(ua80.b((this.d.hashCode() + cs0.a(this.c, w6x.d(this.b, this.f16198a.hashCode() * 31, 31), 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(picture=");
        sb.append(this.f16198a);
        sb.append(", fallbackPicture=");
        sb.append(this.b);
        sb.append(", placeholder=");
        sb.append(this.c);
        sb.append(", pictureContainerUiModel=");
        sb.append(this.d);
        sb.append(", tagText=");
        f140.v(sb, this.e, ", title=", this.f, ", technicalWorks=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
