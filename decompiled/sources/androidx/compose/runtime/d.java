package androidx.compose.runtime;

import a.f3u0;
import a.hgk0;
import a.igk0;
import a.kgn;
import a.l5d0;
import a.mqd;
import a.rek0;
import a.xez;
import a.z8m0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xez f45347a;

    public d(Function0 function0) {
        this.f45347a = new xez(function0);
    }

    public l5d0 a(Object obj) {
        return new l5d0(this, obj, obj == null, null, null, true);
    }

    public f3u0 b() {
        return this.f45347a;
    }

    public final l5d0 c(Function1 function1) {
        return new l5d0(this, null, false, null, function1, false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[PHI: r4
  0x0036: PHI (r4v2 a.f3u0) = (r4v6 a.f3u0), (r4v7 a.f3u0) binds: [B:21:0x0042, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    public final f3u0 d(l5d0 l5d0Var, f3u0 f3u0Var) {
        f3u0 f3u0Var2;
        f3u0 f3u0Var3 = null;
        f3u0Var3 = null;
        f3u0Var3 = null;
        f3u0Var3 = null;
        f3u0Var3 = null;
        f3u0Var3 = null;
        if (f3u0Var instanceof kgn) {
            if (l5d0Var.e) {
                kgn kgnVar = (kgn) f3u0Var;
                ((hgk0) kgnVar.f18247a).setValue(l5d0Var.a());
                f3u0Var3 = kgnVar;
            }
        } else if (f3u0Var instanceof z8m0) {
            if ((l5d0Var.b || l5d0Var.f != null) && !l5d0Var.e) {
                z8m0 z8m0Var = (z8m0) f3u0Var;
                boolean zD = Intrinsics.d(l5d0Var.a(), z8m0Var.f43975a);
                f3u0Var2 = z8m0Var;
                if (zD) {
                    f3u0Var3 = f3u0Var2;
                }
            }
        } else if (f3u0Var instanceof mqd) {
            Function1 function1 = l5d0Var.d;
            mqd mqdVar = (mqd) f3u0Var;
            Function1 function2 = mqdVar.f22219a;
            f3u0Var2 = mqdVar;
            if (function1 == function2) {
                f3u0Var3 = f3u0Var2;
            }
        }
        if (f3u0Var3 != null) {
            return f3u0Var3;
        }
        if (!l5d0Var.e) {
            Function1 function3 = l5d0Var.d;
            return function3 != null ? new mqd(function3) : new z8m0(l5d0Var.a());
        }
        Object obj = l5d0Var.f;
        igk0 igk0Var = l5d0Var.c;
        if (igk0Var == null) {
            igk0Var = rek0.c;
        }
        return new kgn(new ParcelableSnapshotMutableState(obj, igk0Var));
    }
}
