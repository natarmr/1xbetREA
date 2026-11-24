package a;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
public final class na3 extends SegmentFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fuj0 f23171a;

    public na3(fuj0 fuj0Var) {
        this.f23171a = fuj0Var;
    }

    public final int nextEndBoundary(int i) {
        return this.f23171a.c(i);
    }

    public final int nextStartBoundary(int i) {
        return this.f23171a.a(i);
    }

    public final int previousEndBoundary(int i) {
        return this.f23171a.e(i);
    }

    public final int previousStartBoundary(int i) {
        return this.f23171a.b(i);
    }
}
