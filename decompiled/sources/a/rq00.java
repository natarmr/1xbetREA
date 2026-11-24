package a;

/* JADX INFO: loaded from: classes.dex */
public class rq00 extends diu0 {
    public static final dzj d = new dzj((byte) 3);
    public final gnk0 b = new gnk0(0);
    public boolean c = false;

    @Override // a.diu0
    public final void v() {
        gnk0 gnk0Var = this.b;
        int i = gnk0Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            pq00 pq00Var = (pq00) gnk0Var.d(i2);
            saw0 saw0Var = pq00Var.l;
            saw0Var.c();
            saw0Var.c = true;
            qq00 qq00Var = pq00Var.n;
            if (qq00Var != null) {
                pq00Var.j(qq00Var);
            }
            pq00 pq00Var2 = saw0Var.f31903a;
            if (pq00Var2 == null) {
                jf4.n("No listener register");
                return;
            }
            if (pq00Var2 != pq00Var) {
                jf4.o("Attempting to unregister the wrong listener");
                return;
            }
            saw0Var.f31903a = null;
            if (qq00Var != null) {
                boolean z = qq00Var.b;
            }
            saw0Var.d = true;
            saw0Var.b = false;
            saw0Var.c = false;
            saw0Var.e = false;
        }
        int i3 = gnk0Var.c;
        Object[] objArr = gnk0Var.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        gnk0Var.c = 0;
    }
}
