package a;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class qls0 implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f28951a;
    public final Function1 b;

    public qls0(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        this.f28951a = sequence;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new pls0(this);
    }
}
