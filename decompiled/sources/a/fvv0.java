package a;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class fvv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f10233a;
    public final WeakReference b;

    public fvv0(Fragment fragment, piu0 piu0Var) {
        fragment.getClass();
        this.f10233a = new WeakReference(fragment);
        this.b = new WeakReference(piu0Var);
    }

    public final boolean a() {
        Fragment fragment = (Fragment) this.f10233a.get();
        if (fragment == null || !fragment.N() || fragment.O() || fragment.F().I(fragment.z) != fragment) {
            return false;
        }
        for (Fragment fragment2 : lgi0.e(new ejv0((byte) 19), fragment.y)) {
            if (!fragment2.N() || fragment2.O()) {
                return false;
            }
        }
        return true;
    }
}
