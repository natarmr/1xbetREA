package a;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s3d implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31552a = 1;
    public final Object b;

    public s3d(hh90 hh90Var) {
        pqs0[] pqs0VarArr = new pqs0[8];
        for (int i = 0; i < 8; i++) {
            pqs0VarArr[i] = new tqs0(this);
        }
        this.b = new jh90(hh90Var, pqs0VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f31552a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((Enumeration) obj).hasMoreElements();
            case 1:
                return ((ih90) obj).c;
            case 2:
                return ((jh90) obj).c;
            default:
                return ((y2) obj).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f31552a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((Enumeration) obj).nextElement();
            case 1:
                return (Map.Entry) ((ih90) obj).next();
            case 2:
                return (Map.Entry) ((jh90) obj).next();
            default:
                return ((y2) obj).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f31552a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ((ih90) this.b).remove();
                return;
            case 2:
                ((jh90) this.b).remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public s3d(Object[] objArr) {
        objArr.getClass();
        this.b = new y2(objArr);
    }

    public s3d(Enumeration enumeration) {
        this.b = enumeration;
    }

    public s3d(gh90 gh90Var) {
        pqs0[] pqs0VarArr = new pqs0[8];
        for (int i = 0; i < 8; i++) {
            pqs0VarArr[i] = new sqs0(this);
        }
        this.b = new ih90(gh90Var, pqs0VarArr);
    }
}
