package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u4s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35067a;
    public final v4s b;
    public final o0x c;
    public final o0x d;
    public final o0x e;
    public final o0x f;
    public final String g;
    public final t4s h;
    public final ljc0 i;

    public u4s(long j, v4s v4sVar, o0x o0xVar, o0x o0xVar2, o0x o0xVar3, o0x o0xVar4, String str) {
        v4sVar.getClass();
        str.getClass();
        this.f35067a = j;
        this.b = v4sVar;
        this.c = o0xVar;
        this.d = o0xVar2;
        this.e = o0xVar3;
        this.f = o0xVar4;
        this.g = str;
        this.h = new t4s((byte) 0);
        this.i = new ljc0((byte) 14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4s)) {
            return false;
        }
        u4s u4sVar = (u4s) obj;
        return this.f35067a == u4sVar.f35067a && this.b == u4sVar.b && this.c.equals(u4sVar.c) && this.d.equals(u4sVar.d) && this.e.equals(u4sVar.e) && this.f.equals(u4sVar.f) && Intrinsics.d(this.g, u4sVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + w6x.d(this.f, w6x.d(this.e, w6x.d(this.d, w6x.d(this.c, (this.b.hashCode() + (Long.hashCode(this.f35067a) * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameCollectionItemModel(gameId=");
        sb.append(this.f35067a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", squarePicture=");
        sb.append(this.c);
        sb.append(", squarePictureFallback=");
        sb.append(this.d);
        sb.append(", rectanglePicture=");
        sb.append(this.e);
        sb.append(", rectanglePictureFallback=");
        sb.append(this.f);
        return rw2.o(sb, ", label=", this.g, Separators.RPAREN);
    }
}
