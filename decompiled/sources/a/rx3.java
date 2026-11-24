package a;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class rx3 implements Iterable, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31244a;
    public final Object b;

    public rx3() {
        this.f31244a = (byte) 1;
        this.b = new CopyOnWriteArrayList();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.f31244a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return hp4.J((Object[]) obj);
            case 1:
                Iterator it = ((CopyOnWriteArrayList) obj).iterator();
                it.getClass();
                return it;
            case 2:
                return new iil((Iterator) ((Function0) obj).invoke());
            case 3:
                return ((Sequence) obj).iterator();
            default:
                return new y2((zzn) obj);
        }
    }

    public /* synthetic */ rx3(Object obj, byte b) {
        this.f31244a = b;
        this.b = obj;
    }
}
