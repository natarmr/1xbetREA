package a;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class j9w0 {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nav f16161a;

    public j9w0(nav navVar) {
        this.f16161a = navVar;
    }

    public final zaw0 a(zaw0 zaw0Var) {
        boolean z = true;
        if (!zaw0Var.i && !((Boolean) BasePendingResult.j.get()).booleanValue()) {
            z = false;
        }
        zaw0Var.i = z;
        nav navVar = this.f16161a;
        sav savVar = navVar.k;
        savVar.getClass();
        p9w0 p9w0Var = new p9w0(new v9w0(zaw0Var), savVar.i.get(), navVar);
        jaw0 jaw0Var = savVar.m;
        jaw0Var.sendMessage(jaw0Var.obtainMessage(4, p9w0Var));
        return zaw0Var;
    }
}
