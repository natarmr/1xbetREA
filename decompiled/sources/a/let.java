package a;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class let implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final e3l f = new e3l(19);
    public long b;
    public long c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19920a = new ArrayList();
    public final ArrayList d = new ArrayList();

    public static xhe0 c(RecyclerView recyclerView, int i, long j) {
        int iH = recyclerView.f.h();
        for (int i2 = 0; i2 < iH; i2++) {
            xhe0 xhe0VarX = RecyclerView.X(recyclerView.f.g(i2));
            if (xhe0VarX.c == i && !xhe0VarX.i()) {
                return null;
            }
        }
        msj msjVar = recyclerView.c;
        if (j == Long.MAX_VALUE) {
            try {
                if (ebs0.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.h0(false);
                Trace.endSection();
            }
        }
        recyclerView.g0();
        xhe0 xhe0VarO = msjVar.o(i, j);
        if (xhe0VarO != null) {
            if (!xhe0VarO.h() || xhe0VarO.i()) {
                msjVar.a(xhe0VarO, false);
            } else {
                msjVar.k(xhe0VarO.f40887a);
            }
        }
        return xhe0VarO;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.s) {
            if (RecyclerView.d2 && !this.f19920a.contains(recyclerView)) {
                jf4.n("attempting to post unregistered view!");
                return;
            } else if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        yjc yjcVar = recyclerView.G1;
        yjcVar.f42734a = i;
        yjcVar.b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void b(long j) {
        ket ketVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ket ketVar2;
        ArrayList arrayList = this.f19920a;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            yjc yjcVar = recyclerView3.G1;
            if (windowVisibility == 0) {
                yjcVar.c(recyclerView3, false);
                i += yjcVar.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                yjc yjcVar2 = recyclerView4.G1;
                int iAbs = Math.abs(yjcVar2.b) + Math.abs(yjcVar2.f42734a);
                for (?? r11 = z; r11 < yjcVar2.d * 2; r11 += 2) {
                    if (i4 >= arrayList2.size()) {
                        ketVar2 = new ket();
                        arrayList2.add(ketVar2);
                    } else {
                        ketVar2 = (ket) arrayList2.get(i4);
                    }
                    int[] iArr = yjcVar2.c;
                    int i5 = iArr[r11 + 1];
                    if (i5 <= iAbs) {
                        z = true;
                    }
                    ketVar2.f18168a = z;
                    ketVar2.b = iAbs;
                    ketVar2.c = i5;
                    ketVar2.d = recyclerView4;
                    ketVar2.e = iArr[r11];
                    i4++;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, f);
        for (int i6 = 0; i6 < arrayList2.size() && (recyclerView = (ketVar = (ket) arrayList2.get(i6)).d) != null; i6++) {
            xhe0 xhe0VarC = c(recyclerView, ketVar.e, ketVar.f18168a ? Long.MAX_VALUE : j);
            if (xhe0VarC != null && xhe0VarC.b != null && xhe0VarC.h() && !xhe0VarC.i() && (recyclerView2 = (RecyclerView) xhe0VarC.b.get()) != null) {
                if (recyclerView2.g1 && recyclerView2.f.h() != 0) {
                    msj msjVar = recyclerView2.c;
                    ehe0 ehe0Var = recyclerView2.p1;
                    if (ehe0Var != null) {
                        ehe0Var.e();
                    }
                    androidx.recyclerview.widget.b bVar = recyclerView2.n;
                    if (bVar != null) {
                        bVar.A0(msjVar);
                        recyclerView2.n.B0(msjVar);
                    }
                    ((ArrayList) msjVar.c).clear();
                    msjVar.i();
                }
                yjc yjcVar3 = recyclerView2.G1;
                yjcVar3.c(recyclerView2, true);
                if (yjcVar3.d != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        the0 the0Var = recyclerView2.H1;
                        yge0 yge0Var = recyclerView2.m;
                        the0Var.d = (byte) 1;
                        the0Var.e = yge0Var.d();
                        the0Var.g = false;
                        the0Var.h = false;
                        the0Var.i = false;
                        for (int i7 = 0; i7 < yjcVar3.d * 2; i7 += 2) {
                            c(recyclerView2, yjcVar3.c[i7], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            ketVar.f18168a = false;
            ketVar.b = 0;
            ketVar.c = 0;
            ketVar.d = null;
            ketVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f19920a;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                }
            }
        } finally {
            this.b = 0L;
            Trace.endSection();
        }
    }
}
