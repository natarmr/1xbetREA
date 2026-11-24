package a;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class jil implements Sequence, qil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f16580a;
    public final int b;

    public jil(Sequence sequence, int i) {
        sequence.getClass();
        this.f16580a = sequence;
        this.b = i;
        if (i >= 0) {
            return;
        }
        c99.s(brm0.l("count must be non-negative, but was ", i, '.'));
        throw null;
    }

    @Override // a.qil
    public final Sequence a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new jil(this, i) : new jil(this.f16580a, i2);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new iil(this);
    }
}
