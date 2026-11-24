package a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class t1o implements cr30 {
    public final String b;

    public t1o(u1o u1oVar, String... strArr) {
        String str = u1oVar.f34909a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.b = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // a.cr30
    public Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        return iun.f15405a;
    }

    @Override // a.cr30
    public Set c() {
        return xun.f41520a;
    }

    @Override // a.cr30
    public foc d(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        b1o[] b1oVarArr = b1o.f1816a;
        return new s0o(g950.i(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{g950Var}, 1))));
    }

    @Override // a.cr30
    public Set e() {
        return xun.f41520a;
    }

    @Override // a.cr30
    public Set g() {
        return xun.f41520a;
    }

    @Override // a.cr30
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set a(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        s0o s0oVar = f2o.c;
        s0oVar.getClass();
        f93 f93Var = ujn.c;
        b1o[] b1oVarArr = b1o.f1816a;
        j1o j1oVar = new j1o(s0oVar, null, f93Var, g950.i("<Error function>"), 1, gmk0.x0);
        iun iunVar = iun.f15405a;
        j1oVar.t1(null, null, iunVar, iunVar, iunVar, f2o.c(c2o.e, new String[0]), gm40.d, uek.e);
        return cui0.b(j1oVar);
    }

    @Override // a.cr30
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set f(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        return f2o.f;
    }

    public String toString() {
        return axq.m(new StringBuilder("ErrorScope{"), this.b, '}');
    }
}
