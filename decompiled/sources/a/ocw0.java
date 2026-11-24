package a;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ocw0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25049a;
    public int b = 0;
    public final /* synthetic */ AbstractSet c;

    public /* synthetic */ ocw0(AbstractSet abstractSet, byte b) {
        this.f25049a = b;
        this.c = abstractSet;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f25049a;
        AbstractSet abstractSet = this.c;
        switch (b) {
            case 0:
                pcw0 pcw0Var = (pcw0) abstractSet;
                return this.b < pcw0Var.c() - pcw0Var.b();
            default:
                return this.b < ((mix0) ((ax3) abstractSet).b).e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f25049a;
        AbstractSet abstractSet = this.c;
        switch (b) {
            case 0:
                int i = this.b;
                pcw0 pcw0Var = (pcw0) abstractSet;
                if (i >= pcw0Var.c() - pcw0Var.b()) {
                    itt0.a();
                    return null;
                }
                qcw0 qcw0Var = pcw0Var.b;
                Object obj = qcw0Var.f28505a[pcw0Var.b() + i];
                this.b = i + 1;
                return obj;
            default:
                int i2 = this.b;
                this.b = i2 + 1;
                mix0 mix0Var = (mix0) ((ax3) abstractSet).b;
                return mix0Var.d(mix0Var.d[i2] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f25049a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
