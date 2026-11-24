package a;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class sx3 implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32954a;
    public final Object b;

    public /* synthetic */ sx3(Object obj, byte b) {
        this.f32954a = b;
        this.b = obj;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        byte b = this.f32954a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return hp4.J((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new r900(this);
            case 3:
                return igi0.a((Function2) obj);
            case 4:
                return (Iterator) obj;
            case 5:
                return new kgi0(obj, (byte) 0);
            case 6:
                return new q900((CharSequence) obj);
            default:
                return new pls0(pym0.i((ViewGroup) obj).iterator());
        }
    }
}
