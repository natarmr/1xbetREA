package a;

/* JADX INFO: loaded from: classes2.dex */
public final class w6n0 extends qoj0 implements n7m0 {
    @Override // a.n7m0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.h;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.i + ((long) ((int) ((s() + ((long) this.k)) - this.i)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void z(int i) {
        synchronized (this) {
            Object[] objArr = this.h;
            objArr.getClass();
            g(Integer.valueOf(((Number) objArr[((int) ((this.i + ((long) ((int) ((s() + ((long) this.k)) - this.i)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
