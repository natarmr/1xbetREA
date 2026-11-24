package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class u6q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final djz f35150a;
    public final k7q0 b;
    public final a8q0 c;
    public final boolean d;
    public final boolean e;
    public final n9q0 f;
    public final qe60 g;
    public final q7t0 h;
    public final vij i;
    public final Function1 j;
    public final int k;

    public u6q0(djz djzVar, k7q0 k7q0Var, a8q0 a8q0Var, boolean z, boolean z2, n9q0 n9q0Var, qe60 qe60Var, q7t0 q7t0Var, vij vijVar, Function1 function1, int i) {
        this.f35150a = djzVar;
        this.b = k7q0Var;
        this.c = a8q0Var;
        this.d = z;
        this.e = z2;
        this.f = n9q0Var;
        this.g = qe60Var;
        this.h = q7t0Var;
        this.i = vijVar;
        this.j = function1;
        this.k = i;
    }

    public final void a(List list) {
        hsj hsjVar = this.f35150a.d;
        ArrayList arrayListN0 = CollectionsKt.N0(list);
        arrayListN0.add(0, new bfq());
        this.j.invoke(hsjVar.b(arrayListN0));
    }
}
