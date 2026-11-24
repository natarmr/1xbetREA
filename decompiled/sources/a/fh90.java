package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fh90 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9529a;
    public int b;
    public boolean c;
    public final Object[] d;

    public fh90(nqs0 nqs0Var, pqs0[] pqs0VarArr) {
        this.f9529a = (byte) 0;
        nqs0Var.getClass();
        this.d = pqs0VarArr;
        this.c = true;
        pqs0 pqs0Var = pqs0VarArr[0];
        Object[] objArr = nqs0Var.d;
        int iBitCount = Integer.bitCount(nqs0Var.f23972a) * 2;
        pqs0Var.getClass();
        objArr.getClass();
        pqs0Var.b = objArr;
        pqs0Var.c = iBitCount;
        pqs0Var.d = 0;
        this.b = 0;
        b();
    }

    public void a() {
        pqs0[] pqs0VarArr = (pqs0[]) this.d;
        int i = this.b;
        pqs0 pqs0Var = pqs0VarArr[i];
        if (pqs0Var.d < pqs0Var.c) {
            return;
        }
        while (-1 < i) {
            int iC = c(i);
            if (iC == -1) {
                pqs0 pqs0Var2 = pqs0VarArr[i];
                int i2 = pqs0Var2.d;
                Object[] objArr = pqs0Var2.b;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    pqs0Var2.d = i2 + 1;
                    iC = c(i);
                }
            }
            if (iC != -1) {
                this.b = iC;
                return;
            }
            if (i > 0) {
                pqs0 pqs0Var3 = pqs0VarArr[i - 1];
                int i3 = pqs0Var3.d;
                int length2 = pqs0Var3.b.length;
                pqs0Var3.d = i3 + 1;
            }
            pqs0VarArr[i].a(oqs0.e.d, 0, 0);
            i--;
        }
        this.c = false;
    }

    public void b() {
        pqs0 pqs0Var;
        int i;
        pqs0[] pqs0VarArr = (pqs0[]) this.d;
        int i2 = this.b;
        pqs0 pqs0Var2 = pqs0VarArr[i2];
        if (pqs0Var2.d < pqs0Var2.c) {
            return;
        }
        while (-1 < i2) {
            int iD = d(i2);
            if (iD == -1 && (i = (pqs0Var = pqs0VarArr[i2]).d) < pqs0Var.b.length) {
                pqs0Var.d = i + 1;
                iD = d(i2);
            }
            if (iD != -1) {
                this.b = iD;
                return;
            }
            if (i2 > 0) {
                pqs0VarArr[i2 - 1].d++;
            }
            pqs0 pqs0Var3 = pqs0VarArr[i2];
            Object[] objArr = nqs0.e.d;
            pqs0Var3.getClass();
            objArr.getClass();
            pqs0Var3.b = objArr;
            pqs0Var3.c = 0;
            pqs0Var3.d = 0;
            i2--;
        }
        this.c = false;
    }

    public int c(int i) {
        pqs0[] pqs0VarArr = (pqs0[]) this.d;
        pqs0 pqs0Var = pqs0VarArr[i];
        int i2 = pqs0Var.d;
        if (i2 < pqs0Var.c) {
            return i;
        }
        Object[] objArr = pqs0Var.b;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        oqs0 oqs0Var = (oqs0) obj;
        if (i == 6) {
            pqs0 pqs0Var2 = pqs0VarArr[i + 1];
            Object[] objArr2 = oqs0Var.d;
            pqs0Var2.a(objArr2, objArr2.length, 0);
        } else {
            pqs0VarArr[i + 1].a(oqs0Var.d, Integer.bitCount(oqs0Var.f25705a) * 2, 0);
        }
        return c(i + 1);
    }

    public int d(int i) {
        pqs0[] pqs0VarArr = (pqs0[]) this.d;
        pqs0 pqs0Var = pqs0VarArr[i];
        int i2 = pqs0Var.d;
        if (i2 < pqs0Var.c) {
            return i;
        }
        Object[] objArr = pqs0Var.b;
        if (i2 >= objArr.length) {
            return -1;
        }
        Object obj = objArr[i2];
        obj.getClass();
        nqs0 nqs0Var = (nqs0) obj;
        if (i == 6) {
            pqs0 pqs0Var2 = pqs0VarArr[i + 1];
            Object[] objArr2 = nqs0Var.d;
            int length = objArr2.length;
            pqs0Var2.getClass();
            pqs0Var2.b = objArr2;
            pqs0Var2.c = length;
            pqs0Var2.d = 0;
        } else {
            pqs0 pqs0Var3 = pqs0VarArr[i + 1];
            Object[] objArr3 = nqs0Var.d;
            int iBitCount = Integer.bitCount(nqs0Var.f23972a) * 2;
            pqs0Var3.getClass();
            objArr3.getClass();
            pqs0Var3.b = objArr3;
            pqs0Var3.c = iBitCount;
            pqs0Var3.d = 0;
        }
        return d(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9529a) {
            case 0:
                break;
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        byte b = this.f9529a;
        Object[] objArr = this.d;
        switch (b) {
            case 0:
                if (!this.c) {
                    itt0.a();
                    return null;
                }
                Object next = ((pqs0[]) objArr)[this.b].next();
                b();
                return next;
            default:
                if (!this.c) {
                    itt0.a();
                    return null;
                }
                Object next2 = ((pqs0[]) objArr)[this.b].next();
                a();
                return next2;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f9529a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public fh90(oqs0 oqs0Var, pqs0[] pqs0VarArr) {
        this.f9529a = (byte) 1;
        this.d = pqs0VarArr;
        this.c = true;
        pqs0VarArr[0].a(oqs0Var.d, Integer.bitCount(oqs0Var.f25705a) * 2, 0);
        this.b = 0;
        a();
    }
}
