package a;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kjv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tq8 f18406a;
    public final float b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kjv0(Rect rect, float f) {
        this(new tq8(rect), f);
        rect.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kjv0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        kjv0 kjv0Var = (kjv0) obj;
        return Intrinsics.d(this.f18406a, kjv0Var.f18406a) && this.b == kjv0Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.f18406a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.f18406a + ", density=" + this.b + ')';
    }

    public kjv0(tq8 tq8Var, float f) {
        this.f18406a = tq8Var;
        this.b = f;
    }
}
