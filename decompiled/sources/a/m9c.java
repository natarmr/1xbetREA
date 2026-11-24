package a;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class m9c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21402a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public m9c(Context context, Looper looper, l9o0 l9o0Var) {
        this.c = new hcp0(context.getApplicationContext());
        this.d = l9o0Var.a(looper, null);
        this.e = l9o0Var.a(Looper.getMainLooper(), null);
    }

    public boolean a(hi30 hi30Var) {
        int id = hi30Var.getId();
        HashSet hashSet = (HashSet) this.d;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        hi30 hi30Var2 = (hi30) ((HashMap) this.c).get(Integer.valueOf(c()));
        if (hi30Var2 != null) {
            g(hi30Var2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!hi30Var.isChecked()) {
            hi30Var.setChecked(true);
        }
        return zAdd;
    }

    public ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.d);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof hi30) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int c() {
        HashSet hashSet = (HashSet) this.d;
        if (!this.f21402a || hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public void d() {
        yk50 yk50Var = (yk50) this.e;
        if (yk50Var != null) {
            new HashSet((HashSet) this.d);
            abc abcVar = (abc) yk50Var.b;
            xac xacVar = abcVar.g;
            if (xacVar != null) {
                abcVar.h.b(abcVar);
                abc abcVar2 = (abc) ((fvt0) xacVar).f10231a;
                if (abcVar2.h.f21402a) {
                    abcVar2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public void e(final boolean z, final boolean z2) {
        q9o0 q9o0Var = (q9o0) this.d;
        if (z && z2) {
            q9o0Var.e(new Runnable() { // from class: a.qvu0
                @Override // java.lang.Runnable
                public final void run() {
                    ((hcp0) this.f29406a.c).v(z, z2);
                }
            });
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        q9o0 q9o0Var2 = (q9o0) this.e;
        q9o0Var2.f28360a.postDelayed(new qaq0(this, atomicBoolean, (byte) 19), 1000L);
        q9o0Var.e(new q7y(this, atomicBoolean, z, z2, (byte) 1));
    }

    public void f(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.f21402a) {
            e(true, z);
        }
    }

    public boolean g(hi30 hi30Var, boolean z) {
        int id = hi30Var.getId();
        HashSet hashSet = (HashSet) this.d;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            hi30Var.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (hi30Var.isChecked()) {
            hi30Var.setChecked(false);
        }
        return zRemove;
    }

    public m9c() {
        this.c = new HashMap();
        this.d = new HashSet();
    }

    public m9c(Context context, String str, y78 y78Var, boolean z, boolean z2) {
        y78Var.getClass();
        this.c = context;
        this.d = str;
        this.e = y78Var;
        this.f21402a = z;
        this.b = z2;
    }
}
