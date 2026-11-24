package a;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class rcj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30242a;
    public final String b;
    public final qkn0 c;
    public final ea70 d;
    public final List e;
    public final boolean f;
    public final ydg0 g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final Set l;
    public final List m;
    public final List n;
    public final boolean o;
    public final spg0 p;
    public final CoroutineContext q;

    public rcj(Context context, String str, qkn0 qkn0Var, ea70 ea70Var, List list, boolean z, ydg0 ydg0Var, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z4, spg0 spg0Var, CoroutineContext coroutineContext) {
        executor.getClass();
        executor2.getClass();
        this.f30242a = context;
        this.b = str;
        this.c = qkn0Var;
        this.d = ea70Var;
        this.e = list;
        this.f = z;
        this.g = ydg0Var;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = set;
        this.m = list2;
        this.n = list3;
        this.o = z4;
        this.p = spg0Var;
        this.q = coroutineContext;
    }
}
