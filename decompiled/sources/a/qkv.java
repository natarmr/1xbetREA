package a;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class qkv extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28905a;

    public qkv(com.google.android.material.datepicker.e eVar) {
        this.f28905a = (byte) 1;
        ett0.c(null);
        ett0.c(null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:74:0x0164  */
    /* JADX WARN: Code duplicated, block: B:77:0x016f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0175  */
    /* JADX WARN: Code duplicated, block: B:84:0x0182  */
    /* JADX WARN: Code duplicated, block: B:85:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x018b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0192  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v5 java.lang.Object, still in use, count: 2, list:
          (r8v5 java.lang.Object) from 0x013b: PHI (r8 I:??) = (r8v2 java.lang.Object), (r8v5 java.lang.Object) binds: [B:68:0x013a, B:90:0x013b] A[DONT_GENERATE, DONT_INLINE]
          (r8v5 java.lang.Object) from 0x0133: CHECK_CAST (a.p6t0) (r8v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.fhe0
    public void f(android.graphics.Rect r5, android.view.View r6, androidx.recyclerview.widget.RecyclerView r7, a.the0 r8) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qkv.f(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, a.the0):void");
    }

    @Override // a.fhe0
    public void g(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        switch (this.f28905a) {
            case 1:
                if ((recyclerView.getAdapter() instanceof com.google.android.material.datepicker.j) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ qkv(byte b) {
        this.f28905a = b;
    }
}
