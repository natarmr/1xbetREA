package a;

/* JADX INFO: loaded from: classes.dex */
public class awa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f1565a;
    public int b;

    public awa0(int i) {
        if (i > 0) {
            this.f1565a = new Object[i];
        } else {
            jf4.o("The max pool size must be > 0");
            throw null;
        }
    }

    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f1565a;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public void b(Object obj) {
        int i = this.b;
        Object[] objArr = this.f1565a;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.b = i + 1;
        }
    }

    public boolean c(Object obj) {
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f1565a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.b = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                jf4.n("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    public awa0() {
        this.f1565a = new Object[256];
    }
}
