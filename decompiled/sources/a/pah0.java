package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pah0 implements dg80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26654a;
    public final List b;
    public Float c = null;
    public Float d = null;
    public t9h0 e = null;
    public t9h0 f = null;

    public pah0(int i, ArrayList arrayList) {
        this.f26654a = i;
        this.b = arrayList;
    }

    @Override // a.dg80
    public final boolean h0() {
        return this.b.contains(this);
    }
}
