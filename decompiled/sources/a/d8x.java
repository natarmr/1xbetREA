package a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5672a;
    public final String b;
    public final Context c;
    public final AttributeSet d;

    public d8x(View view, String str, Context context, AttributeSet attributeSet) {
        str.getClass();
        context.getClass();
        this.f5672a = view;
        this.b = str;
        this.c = context;
        this.d = attributeSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8x)) {
            return false;
        }
        d8x d8xVar = (d8x) obj;
        return Intrinsics.d(this.f5672a, d8xVar.f5672a) && Intrinsics.d(this.b, d8xVar.b) && Intrinsics.d(this.c, d8xVar.c) && Intrinsics.d(this.d, d8xVar.d);
    }

    public final int hashCode() {
        View view = this.f5672a;
        int iHashCode = (this.c.hashCode() + ua80.b((view == null ? 0 : view.hashCode()) * 31, 31, this.b)) * 31;
        AttributeSet attributeSet = this.d;
        return iHashCode + (attributeSet != null ? attributeSet.hashCode() : 0);
    }

    public final String toString() {
        return "InflateResult(view=" + this.f5672a + ", name=" + this.b + ", context=" + this.c + ", attrs=" + this.d + ')';
    }
}
