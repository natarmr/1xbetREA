package a;

import androidx.fragment.app.Fragment;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class h5r extends q1r {
    public static final f03 f = f03.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f12495a = new WeakHashMap();
    public final yk5 b;
    public final dps0 c;
    public final mj3 d;
    public final e7r e;

    public h5r(yk5 yk5Var, dps0 dps0Var, mj3 mj3Var, e7r e7rVar) {
        this.b = yk5Var;
        this.c = dps0Var;
        this.d = mj3Var;
        this.e = e7rVar;
    }

    @Override // a.q1r
    public final void d(androidx.fragment.app.e eVar, Fragment fragment) {
        v680 v680Var;
        Object[] objArr = {fragment.getClass().getSimpleName()};
        f03 f03Var = f;
        f03Var.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap weakHashMap = this.f12495a;
        if (!weakHashMap.containsKey(fragment)) {
            f03Var.g("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        e7r e7rVar = this.e;
        HashMap map = e7rVar.c;
        f03 f03Var2 = e7r.e;
        if (!e7rVar.d) {
            f03Var2.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            v680Var = new v680();
        } else if (map.containsKey(fragment)) {
            d7r d7rVar = (d7r) map.remove(fragment);
            v680 v680VarA = e7rVar.a();
            if (v680VarA.b()) {
                d7r d7rVar2 = (d7r) v680VarA.a();
                v680Var = new v680(new d7r(d7rVar2.f5607a - d7rVar.f5607a, d7rVar2.b - d7rVar.b, d7rVar2.c - d7rVar.c));
            } else {
                f03Var2.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                v680Var = new v680();
            }
        } else {
            f03Var2.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            v680Var = new v680();
        }
        if (!v680Var.b()) {
            f03Var.g("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            j9h0.a(trace, (d7r) v680Var.a());
            trace.stop();
        }
    }

    @Override // a.q1r
    public final void e(androidx.fragment.app.e eVar, Fragment fragment) {
        f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.c, this.b, this.d);
        trace.start();
        Fragment fragment2 = fragment.y;
        trace.putAttribute("Parent_fragment", fragment2 == null ? "No parent" : fragment2.getClass().getSimpleName());
        if (fragment.B() != null) {
            trace.putAttribute("Hosting_activity", fragment.B().getClass().getSimpleName());
        }
        this.f12495a.put(fragment, trace);
        e7r e7rVar = this.e;
        HashMap map = e7rVar.c;
        f03 f03Var = e7r.e;
        if (!e7rVar.d) {
            f03Var.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (map.containsKey(fragment)) {
            f03Var.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        v680 v680VarA = e7rVar.a();
        if (v680VarA.b()) {
            map.put(fragment, (d7r) v680VarA.a());
        } else {
            f03Var.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }
}
