package a;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class tjt implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34066a = 2;
    public final wdr b;
    public final Object c;

    public tjt(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        this.c = sequence;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f34066a) {
            case 0:
                return new sjt(this);
            case 1:
                return new b5q(this);
            default:
                return new sjt(this, (byte) 0);
        }
    }

    public tjt(ckq ckqVar, kh10 kh10Var) {
        this.c = ckqVar;
        this.b = kh10Var;
    }

    public tjt(Function0 function0, Function1 function1) {
        function1.getClass();
        this.c = function0;
        this.b = function1;
    }
}
