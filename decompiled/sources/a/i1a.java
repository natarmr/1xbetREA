package a;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i1a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13988a;
    public final k1a b;
    public final yzn0 c;
    public final g1a d;
    public final h1a e;
    public final j1a f;

    public i1a(Context context, k1a k1aVar, h1a h1aVar) {
        yzn0 yzn0Var = new yzn0((byte) 16);
        g1a g1aVar = new g1a();
        j1a j1aVar = new j1a();
        context.getClass();
        this.f13988a = context;
        this.b = k1aVar;
        this.c = yzn0Var;
        this.d = g1aVar;
        this.e = h1aVar;
        this.f = j1aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i1a) {
            i1a i1aVar = (i1a) obj;
            if (Intrinsics.d(this.f13988a, i1aVar.f13988a) && this.b.equals(i1aVar.b) && this.c == i1aVar.c && this.d == i1aVar.d && this.e.equals(i1aVar.e) && this.f.equals(i1aVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return brm0.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13988a.hashCode() * 31)) * 31)) * 31)) * 31)) * 961, 31, false);
    }

    public final String toString() {
        return "Config(appContext=" + this.f13988a + ", threadConfig=" + this.b + ", cameraMetadataConfig=" + this.c + ", cameraBackendConfig=" + this.d + ", cameraInteropConfig=" + this.e + ", imageSources=null, flags=" + this.f + ", platformApiCompat=null)";
    }
}
