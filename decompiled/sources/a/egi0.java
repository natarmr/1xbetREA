package a;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class egi0 extends fgi0 implements Iterator, yje, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f7768a;
    public Object b;
    public Iterator c;
    public yje d;

    @Override // a.fgi0
    public final void a(yje yjeVar, Object obj) {
        this.b = obj;
        this.f7768a = (byte) 3;
        this.d = yjeVar;
        wne wneVar = wne.f39444a;
        yjeVar.getClass();
    }

    @Override // a.fgi0
    public final Object c(Iterator it, nhu0 nhu0Var) {
        if (!it.hasNext()) {
            return Unit.f46060a;
        }
        this.c = it;
        this.f7768a = (byte) 2;
        this.d = nhu0Var;
        return wne.f39444a;
    }

    public final RuntimeException d() {
        byte b = this.f7768a;
        if (b == 4) {
            return new NoSuchElementException();
        }
        if (b == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + ((int) this.f7768a));
    }

    @Override // a.yje
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f46065a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            byte b = this.f7768a;
            if (b != 0) {
                if (b != 1) {
                    if (b == 2 || b == 3) {
                        return true;
                    }
                    if (b == 4) {
                        return false;
                    }
                    throw d();
                }
                Iterator it = this.c;
                it.getClass();
                if (it.hasNext()) {
                    this.f7768a = (byte) 2;
                    return true;
                }
                this.c = null;
            }
            this.f7768a = (byte) 5;
            yje yjeVar = this.d;
            yjeVar.getClass();
            this.d = null;
            Unit unit = Unit.f46060a;
            e0g0 e0g0Var = j0g0.b;
            yjeVar.resumeWith(unit);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f7768a;
        if (b == 0 || b == 1) {
            if (hasNext()) {
                return next();
            }
            itt0.a();
            return null;
        }
        if (b == 2) {
            this.f7768a = (byte) 1;
            Iterator it = this.c;
            it.getClass();
            return it.next();
        }
        if (b != 3) {
            throw d();
        }
        this.f7768a = (byte) 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // a.yje
    public final void resumeWith(Object obj) {
        z1x.P(obj);
        this.f7768a = (byte) 4;
    }
}
