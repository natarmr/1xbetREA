package a;

import com.google.android.gms.measurement.internal.zzbf;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class get0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11173a;
    public Iterator b;

    public get0(zzbf zzbfVar) {
        this.f11173a = (byte) 3;
        this.b = zzbfVar.f45543a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11173a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11173a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return (String) this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11173a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }
}
