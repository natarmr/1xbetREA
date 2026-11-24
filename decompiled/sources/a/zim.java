package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zim implements bjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f44446a;
    public final o0x b;
    public final o0x c;
    public final o0x d;
    public final Integer e;

    public zim(o0x o0xVar, o0x o0xVar2, o0x o0xVar3, o0x o0xVar4, Integer num, int i) {
        num = (i & 16) != 0 ? null : num;
        this.f44446a = o0xVar;
        this.b = o0xVar2;
        this.c = o0xVar3;
        this.d = o0xVar4;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zim)) {
            return false;
        }
        zim zimVar = (zim) obj;
        return this.f44446a.equals(zimVar.f44446a) && this.b.equals(zimVar.b) && this.c.equals(zimVar.c) && this.d.equals(zimVar.d) && Intrinsics.d(this.e, zimVar.e);
    }

    public final int hashCode() {
        int iD = w6x.d(this.d, w6x.d(this.c, w6x.d(this.b, this.f44446a.hashCode() * 31, 31), 31), 31);
        Integer num = this.e;
        return (iD + (num == null ? 0 : num.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Picture(squarePictureLink=");
        sb.append(this.f44446a);
        sb.append(", squareFallbackPictureLink=");
        sb.append(this.b);
        sb.append(", rectanglePictureLink=");
        sb.append(this.c);
        sb.append(", rectangleFallbackPictureLink=");
        sb.append(this.d);
        sb.append(", placeholderImageRes=");
        return dw9.q(sb, this.e, ", placeholderIconRes=null)");
    }
}
