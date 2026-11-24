package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i4x extends e4x {
    @Override // a.e4x, a.r3x
    public final r3x a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // a.e4x
    /* JADX INFO: renamed from: f */
    public final e4x a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // a.e4x
    public final /* bridge */ /* synthetic */ f4x g() {
        throw null;
    }

    public final zcf0 h() {
        zcf0 zcf0Var;
        Object[] objArrCopyOf = this.f29807a;
        s950 s950Var = s950.b;
        int i = this.b;
        if (i == 0) {
            zcf0Var = j4x.r(s950Var);
        } else {
            h8x.w(i, objArrCopyOf);
            Arrays.sort(objArrCopyOf, 0, i, s950Var);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArrCopyOf[i3];
                if (s950Var.compare(obj, objArrCopyOf[i2 - 1]) != 0) {
                    objArrCopyOf[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArrCopyOf, i2, i, (Object) null);
            if (i2 < objArrCopyOf.length / 2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            zcf0Var = new zcf0(b4x.k(i2, objArrCopyOf), s950Var);
        }
        this.b = zcf0Var.g.size();
        this.c = true;
        return zcf0Var;
    }
}
