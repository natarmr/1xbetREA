package a;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class mvv0 extends q1r implements qvj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApplicationActivity f22475a;
    public final jvv0 b;

    public mvv0(ApplicationActivity applicationActivity, jvv0 jvv0Var) {
        jvv0Var.getClass();
        this.f22475a = applicationActivity;
        this.b = jvv0Var;
    }

    @Override // a.q1r
    public final void b(androidx.fragment.app.e eVar, Fragment fragment) {
        j(true);
    }

    @Override // a.q1r
    public final void d(androidx.fragment.app.e eVar, Fragment fragment) {
        j(false);
    }

    @Override // a.q1r
    public final void f(androidx.fragment.app.e eVar, Fragment fragment) {
        Object value;
        gvv0 gvv0Var;
        jvv0 jvv0Var = this.b;
        jvv0Var.getClass();
        piu0 piu0VarG = fragment.g();
        p7m0 p7m0Var = jvv0Var.f17222a;
        Map map = ((gvv0) p7m0Var.getValue()).b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            fvv0 fvv0Var = (fvv0) entry.getValue();
            fvv0Var.getClass();
            if (fvv0Var.b.get() == fragment.g() && fvv0Var.f10233a.get() != fragment) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        kvv0 kvv0Var = (kvv0) CollectionsKt.V(linkedHashMap.keySet());
        if (kvv0Var != null) {
            do {
                value = p7m0Var.getValue();
                gvv0Var = (gvv0) value;
            } while (!p7m0Var.m(value, gvv0.a(gvv0Var, null, xp20.k(gvv0Var.b, new Pair(kvv0Var, new fvv0(fragment, piu0VarG))), null, 5)));
        }
        j(true);
    }

    public final void j(boolean z) {
        tkz tkzVarQ = x0x.Q(this.f22475a.x());
        rwj rwjVar = tvk.f34603a;
        qjj.W(tkzVarQ, ys10.f43147a, null, new lvv0(this, z, null), 2);
    }

    @Override // a.qvj
    public final void onResume(clz clzVar) {
        j(true);
    }
}
