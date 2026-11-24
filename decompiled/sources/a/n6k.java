package a;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class n6k implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f22999a;
    public final int b;
    public final Function2 c;

    public n6k(CharSequence charSequence, int i, Function2 function2) {
        charSequence.getClass();
        this.f22999a = charSequence;
        this.b = i;
        this.c = function2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new m6k(this);
    }
}
