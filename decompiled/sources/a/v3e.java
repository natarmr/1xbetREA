package a;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v3e implements s3e, jff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3e f36728a;
    public Handler b;
    public final pgk0 c = new pgk0(new u3e(this, (byte) 0));
    public boolean d = true;
    public final u3e e = new u3e(this, (byte) 1);
    public final ArrayList f = new ArrayList();

    public v3e(g3e g3eVar) {
        this.f36728a = g3eVar;
    }

    @Override // a.s3e
    public final boolean a(List list) {
        if (this.d) {
            return true;
        }
        int size = list.size();
        ArrayList arrayList = this.f;
        if (size != arrayList.size()) {
            return true;
        }
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            Object objN = ((pj30) list.get(i)).n();
            if (!Intrinsics.d(objN instanceof e3e ? (e3e) objN : null, arrayList.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // a.s3e
    public final void b(f7m0 f7m0Var, List list) {
        this.f.clear();
        this.c.d(Unit.f46060a, this.e, new t3e(list, this, f7m0Var));
        this.d = false;
    }

    @Override // a.jff0
    public final void c() {
        this.c.e();
    }

    @Override // a.jff0
    public final void g() {
        pgk0 pgk0Var = this.c;
        jk8 jk8Var = pgk0Var.h;
        if (jk8Var != null) {
            jk8Var.a();
        }
        pgk0Var.a();
    }

    @Override // a.jff0
    public final void f() {
    }
}
