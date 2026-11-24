package a;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class k5a extends zsm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f17710a;
    public final j5a b;
    public boolean c;

    public k5a(j5a j5aVar, Typeface typeface) {
        this.f17710a = typeface;
        this.b = j5aVar;
    }

    @Override // a.zsm0
    public final void t(int i) {
        if (this.c) {
            return;
        }
        this.b.g(this.f17710a);
    }

    @Override // a.zsm0
    public final void u(Typeface typeface, boolean z) {
        if (this.c) {
            return;
        }
        this.b.g(typeface);
    }
}
