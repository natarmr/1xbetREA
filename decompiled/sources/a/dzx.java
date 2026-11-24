package a;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class dzx extends eet0 {
    public int b;
    public Object c;
    public final /* synthetic */ byte d;
    public final Iterator e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dzx(Set set, Set set2) {
        this();
        this.d = (byte) 1;
        this.f = set2;
        this.e = set.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        x0x.K(this.b != 4);
        int iE = hne.E(this.b);
        if (iE == 0) {
            return true;
        }
        if (iE != 2) {
            this.b = 4;
            byte b = this.d;
            Object obj = null;
            Object obj2 = this.f;
            Iterator it = this.e;
            switch (b) {
                case 0:
                    while (true) {
                        if (!it.hasNext()) {
                            this.b = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((lsb0) obj2).apply(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    while (true) {
                        if (!it.hasNext()) {
                            this.b = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((Set) obj2).contains(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
            }
            this.c = obj;
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            itt0.a();
            return null;
        }
        this.b = 2;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dzx(Iterator it, lsb0 lsb0Var) {
        this();
        this.d = (byte) 0;
        this.e = it;
        this.f = lsb0Var;
    }

    public dzx() {
        super((byte) 0);
        this.b = 2;
    }
}
