package a;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class pls0 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27201a = 0;
    public Iterator b;
    public final Object c;

    public pls0(Iterator it) {
        it.getClass();
        this.c = new ArrayList();
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f27201a) {
            case 0:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f27201a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((qls0) obj).b.invoke(this.b.next());
            default:
                Object next = this.b.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                view.getClass();
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                jhu0 jhu0Var = viewGroup != null ? new jhu0(viewGroup) : null;
                if (jhu0Var == null || !jhu0Var.hasNext()) {
                    while (!this.b.hasNext() && !arrayList.isEmpty()) {
                        this.b = (Iterator) CollectionsKt.d0(arrayList);
                        w3d.z(arrayList);
                    }
                } else {
                    arrayList.add(this.b);
                    this.b = jhu0Var;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f27201a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public pls0(qls0 qls0Var) {
        this.c = qls0Var;
        this.b = qls0Var.f28951a.iterator();
    }
}
