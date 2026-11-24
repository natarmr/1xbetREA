package a;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class a2o extends kzj0 {
    public final iys0 b;
    public final t1o c;
    public final c2o d;
    public final List e;
    public final boolean f;
    public final String[] g;
    public final String h;

    public a2o(iys0 iys0Var, t1o t1oVar, c2o c2oVar, List list, boolean z, String... strArr) {
        c2oVar.getClass();
        list.getClass();
        this.b = iys0Var;
        this.c = t1oVar;
        this.d = c2oVar;
        this.e = list;
        this.f = z;
        this.g = strArr;
        String str = c2oVar.f3635a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.h = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // a.wsy
    public final List J() {
        return this.e;
    }

    @Override // a.wsy
    public final iys0 S() {
        return this.b;
    }

    @Override // a.wsy
    public final boolean U() {
        return this.f;
    }

    @Override // a.kzj0, a.tft0
    /* JADX INFO: renamed from: n0 */
    public final kzj0 k0(boolean z) {
        String[] strArr = this.g;
        return new a2o(this.b, this.c, this.d, this.e, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // a.wsy
    public final cr30 y() {
        return this.c;
    }
}
