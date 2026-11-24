package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class e4x extends r3x {
    @Override // a.r3x
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e4x a(Object obj) {
        obj.getClass();
        b(obj);
        return this;
    }

    public f4x g() {
        int i = this.b;
        if (i == 0) {
            int i2 = f4x.c;
            return ycf0.j;
        }
        Object[] objArr = this.f29807a;
        if (i != 1) {
            f4x f4xVarL = f4x.l(i, objArr);
            this.b = f4xVarL.size();
            this.c = true;
            return f4xVarL;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = f4x.c;
        return new r5k0(obj);
    }
}
