package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class z4s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f43785a;
    public final o0x b;
    public final o0x c;
    public final o0x d;
    public final v4s e;
    public final Function2 f;
    public final ljc0 g;

    public z4s(o0x o0xVar, o0x o0xVar2, v4s v4sVar, t4s t4sVar, ljc0 ljc0Var) {
        v4sVar.getClass();
        this.f43785a = o0xVar;
        this.b = o0xVar;
        this.c = o0xVar2;
        this.d = o0xVar2;
        this.e = v4sVar;
        this.f = t4sVar;
        this.g = ljc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z4s) {
            z4s z4sVar = (z4s) obj;
            return this.f43785a.equals(z4sVar.f43785a) && this.b.equals(z4sVar.b) && this.c.equals(z4sVar.c) && this.d.equals(z4sVar.d) && this.e == z4sVar.e && this.f.equals(z4sVar.f) && this.g == z4sVar.g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + w6x.d(this.d, w6x.d(this.c, w6x.d(this.b, this.f43785a.hashCode() * 31, 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PictureChanged(squarePicture=" + this.f43785a + ", squarePictureFallback=" + this.b + ", rectanglePicture=" + this.c + ", rectanglePictureFallback=" + this.d + ", type=" + this.e + ", onLoaded=" + this.f + ", onError=" + this.g + Separators.RPAREN;
    }
}
