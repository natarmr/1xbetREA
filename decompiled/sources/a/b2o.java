package a;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b2o implements iys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2o f1862a;
    public final String[] b;
    public final String c;

    public b2o(c2o c2oVar, String... strArr) {
        c2oVar.getClass();
        this.f1862a = c2oVar;
        this.b = strArr;
        b1o[] b1oVarArr = b1o.f1816a;
        String str = c2oVar.f3635a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // a.iys0
    public final Collection b() {
        return iun.f15405a;
    }

    @Override // a.iys0
    public final ary c() {
        return (ftj) ftj.f.getValue();
    }

    @Override // a.iys0
    public final List getParameters() {
        return iun.f15405a;
    }

    @Override // a.iys0
    public final foc n() {
        f2o.f8821a.getClass();
        return f2o.c;
    }

    @Override // a.iys0
    public final boolean p() {
        return false;
    }

    public final String toString() {
        return this.c;
    }
}
