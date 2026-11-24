package kotlin.time;

import a.b2;
import a.lbk;
import a.rlq0;
import a.wen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@lbk
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "La/rlq0;", "a/b2", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class AbstractDoubleTimeSource implements rlq0 {
    @Override // a.rlq0
    public final TimeMark a() {
        double dB = b();
        wen.b.getClass();
        return new b2(dB, this, 0L, null);
    }

    public abstract double b();
}
