package a;

/* JADX INFO: loaded from: classes2.dex */
public final class hx3 extends s2 {
    public int c = -1;
    public final /* synthetic */ ix3 d;

    public hx3(ix3 ix3Var) {
        this.d = ix3Var;
    }

    @Override // a.s2
    public final void a() {
        int i;
        Object[] objArr;
        do {
            i = this.c + 1;
            this.c = i;
            objArr = this.d.f15521a;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.f31478a = (byte) 2;
            return;
        }
        Object obj = objArr[i];
        obj.getClass();
        this.b = obj;
        this.f31478a = (byte) 1;
    }
}
