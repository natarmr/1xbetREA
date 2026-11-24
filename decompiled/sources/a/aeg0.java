package a;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class aeg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sje f727a;
    public CoroutineContext b;
    public Executor c;
    public gd3 d;
    public udg0 e;
    public mox f;
    public final yzn0 g;
    public boolean h;
    public final ThreadLocal i;
    public final LinkedHashMap j;
    public boolean k;

    public aeg0() {
        new b0c0(0, this, aeg0.class, "onClosed", "onClosed()V", 0, (byte) 22);
        yzn0 yzn0Var = new yzn0();
        yzn0Var.f43523a = new AtomicInteger(0);
        yzn0Var.b = new AtomicBoolean(false);
        this.g = yzn0Var;
        this.i = new ThreadLocal();
        this.j = new LinkedHashMap();
        this.k = true;
    }

    public final void a() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jf4.n("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        w7r w7rVarG0 = h().G0();
        if (!w7rVarG0.P0()) {
            yyw.Y(new jox(g(), null, (byte) 2));
        }
        if (w7rVarG0.f38688a.isWriteAheadLoggingEnabled()) {
            w7rVarG0.c();
        } else {
            w7rVarG0.a();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(azw.G((sgy) entry.getKey()), entry.getValue());
        }
        return iun.f15405a;
    }

    public abstract mox d();

    public pa80 e() {
        throw new q660(null, 1, null);
    }

    public final vne f() {
        sje sjeVar = this.f727a;
        if (sjeVar != null) {
            return sjeVar;
        }
        Intrinsics.h("coroutineScope");
        throw null;
    }

    public final mox g() {
        mox moxVar = this.f;
        if (moxVar != null) {
            return moxVar;
        }
        Intrinsics.h("internalTracker");
        throw null;
    }

    public final rkn0 h() {
        udg0 udg0Var = this.e;
        if (udg0Var == null) {
            Intrinsics.h("connectionManager");
            throw null;
        }
        rkn0 rkn0VarC = udg0Var.c();
        if (rkn0VarC != null) {
            return rkn0VarC;
        }
        jf4.n("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set i() {
        ArrayList arrayList = new ArrayList(r3d.q(xun.f41520a, 10));
        hun.f13690a.getClass();
        return CollectionsKt.P0(arrayList);
    }

    public LinkedHashMap j() {
        lun.f20680a.getClass();
        int iA = wp20.a(r3d.q(xun.f41520a, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        hun.f13690a.getClass();
        return linkedHashMap;
    }

    public final boolean k() {
        udg0 udg0Var = this.e;
        if (udg0Var != null) {
            return udg0Var.c() != null;
        }
        Intrinsics.h("connectionManager");
        throw null;
    }

    public final boolean l() {
        return n() && h().G0().P0();
    }

    public final void m() {
        h().G0().k();
        if (l()) {
            return;
        }
        mox moxVarG = g();
        moxVarG.b.f(moxVarG.e, moxVarG.f);
    }

    public final boolean n() {
        udg0 udg0Var = this.e;
        if (udg0Var == null) {
            Intrinsics.h("connectionManager");
            throw null;
        }
        w7r w7rVar = udg0Var.g;
        if (w7rVar != null) {
            return w7rVar.f38688a.isOpen();
        }
        return false;
    }

    public final Object o(Callable callable) {
        b();
        try {
            Object objCall = callable.call();
            q();
            return objCall;
        } finally {
            m();
        }
    }

    public final void p(Runnable runnable) {
        b();
        try {
            runnable.run();
            q();
        } finally {
            m();
        }
    }

    public final void q() {
        h().G0().r();
    }

    public final Object r(boolean z, Function2 function2, zje zjeVar) {
        udg0 udg0Var = this.e;
        if (udg0Var != null) {
            return udg0Var.f.m(z, function2, zjeVar);
        }
        Intrinsics.h("connectionManager");
        throw null;
    }
}
