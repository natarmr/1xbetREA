package a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3935a;
    public final Context b;
    public final AttributeSet c;
    public final View d;
    public final fku0 e;

    public c8x(String str, Context context, AttributeSet attributeSet, View view, fku0 fku0Var) {
        str.getClass();
        context.getClass();
        this.f3935a = str;
        this.b = context;
        this.c = attributeSet;
        this.d = view;
        this.e = fku0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c8x) {
            c8x c8xVar = (c8x) obj;
            return Intrinsics.d(this.f3935a, c8xVar.f3935a) && Intrinsics.d(this.b, c8xVar.b) && Intrinsics.d(this.c, c8xVar.c) && Intrinsics.d(this.d, c8xVar.d) && this.e == c8xVar.e;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f3935a.hashCode() * 31)) * 31;
        AttributeSet attributeSet = this.c;
        int iHashCode2 = (iHashCode + (attributeSet == null ? 0 : attributeSet.hashCode())) * 31;
        View view = this.d;
        return this.e.hashCode() + ((iHashCode2 + (view != null ? view.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "InflateRequest(name=" + this.f3935a + ", context=" + this.b + ", attrs=" + this.c + ", parent=" + this.d + ", fallbackViewCreator=" + this.e + ')';
    }
}
