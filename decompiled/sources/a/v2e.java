package a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class v2e implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f36677a;

    public v2e(Sequence sequence) {
        this.f36677a = new AtomicReference(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        Sequence sequence = (Sequence) this.f36677a.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        jf4.n("This sequence can be consumed only once.");
        return null;
    }
}
