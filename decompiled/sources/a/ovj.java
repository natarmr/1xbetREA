package a;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ovj {
    public boolean c;
    public float e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25928a = -1;
    public final xz40 b = new xz40(new sbz[16]);
    public int d = -1;

    public static int a(q8z q8zVar, boolean z) {
        if (z) {
            r8z r8zVar = (r8z) CollectionsKt.d0(q8zVar.n);
            return (q8zVar.r == ma80.f21447a ? r8zVar.y : r8zVar.z) + 1;
        }
        r8z r8zVar2 = (r8z) CollectionsKt.U(q8zVar.n);
        return (q8zVar.r == ma80.f21447a ? r8zVar2.y : r8zVar2.z) - 1;
    }
}
