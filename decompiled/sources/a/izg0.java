package a;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class izg0 implements fzg0, i0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gzg0 f15634a;
    public glz b;
    public nw20 c;

    public izg0(gzg0 gzg0Var) {
        this.f15634a = gzg0Var;
        Object objF = gzg0Var.f("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objF instanceof Bundle ? (Bundle) objF : null;
        if (bundle != null && this.c == null) {
            nw20 nw20Var = new nw20(new h0h0(this, new a7g0(this, (byte) 12)));
            this.c = nw20Var;
            nw20Var.p(bundle);
        }
        gzg0Var.a("androidx.savedstate.SavedStateRegistry", new a7g0(this, (byte) 10));
    }

    @Override // a.fzg0
    public final ezg0 a(String str, Function0 function0) {
        return this.f15634a.a(str, function0);
    }

    @Override // a.fzg0
    public final boolean d(Object obj) {
        return this.f15634a.d(obj);
    }

    @Override // a.fzg0
    public final Map e() {
        return this.f15634a.e();
    }

    @Override // a.fzg0
    public final Object f(String str) {
        return this.f15634a.f(str);
    }

    @Override // a.i0h0
    public final kd30 h() {
        nw20 nw20Var = this.c;
        if (nw20Var == null) {
            nw20 nw20Var2 = new nw20(new h0h0(this, new a7g0(this, (byte) 12)));
            this.c = nw20Var2;
            nw20Var2.p(null);
            nw20Var = nw20Var2;
        }
        return (kd30) nw20Var.b;
    }

    @Override // a.clz
    public final glz x() {
        glz glzVar = this.b;
        if (glzVar != null) {
            return glzVar;
        }
        glz glzVar2 = new glz(this, false);
        this.b = glzVar2;
        return glzVar2;
    }
}
