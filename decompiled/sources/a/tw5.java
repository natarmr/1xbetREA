package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tw5 extends ConstraintLayout implements x8b {
    public final a8z q;
    public final a8z r;
    public final a8z s;
    public final a8z t;
    public final a8z u;
    public final int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public sw5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw5(Context context, AttributeSet attributeSet, int i) {
        Object next;
        super(context, attributeSet, i);
        context.getClass();
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.rw5
            public final /* synthetic */ tw5 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x005f  */
            /* JADX WARN: Code duplicated, block: B:27:0x0065  */
            /* JADX WARN: Code duplicated, block: B:39:0x0094  */
            /* JADX WARN: Code duplicated, block: B:41:0x009a  */
            /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                  (r4v9 java.lang.Object) from 0x00c5: PHI (r4 I:??) = (r4v6 java.lang.Object), (r4v9 java.lang.Object) binds: [B:50:0x00c4, B:67:0x00c5] A[DONT_GENERATE, DONT_INLINE]
                  (r4v9 java.lang.Object) from 0x00bd: CHECK_CAST (android.view.View) (r4v9 java.lang.Object)
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
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 228
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.rw5.invoke():java.lang.Object");
            }
        };
        wez wezVar = wez.b;
        this.q = maz.a(wezVar, function0);
        final byte b2 = 1;
        this.r = maz.a(wezVar, new Function0(this) { // from class: a.rw5
            public final /* synthetic */ tw5 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x005f  */
            /* JADX WARN: Code duplicated, block: B:27:0x0065  */
            /* JADX WARN: Code duplicated, block: B:39:0x0094  */
            /* JADX WARN: Code duplicated, block: B:41:0x009a  */
            /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                  (r4v9 java.lang.Object) from 0x00c5: PHI (r4 I:??) = (r4v6 java.lang.Object), (r4v9 java.lang.Object) binds: [B:50:0x00c4, B:67:0x00c5] A[DONT_GENERATE, DONT_INLINE]
                  (r4v9 java.lang.Object) from 0x00bd: CHECK_CAST (android.view.View) (r4v9 java.lang.Object)
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
                */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 228
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.rw5.invoke():java.lang.Object");
            }
        });
        final byte b3 = 2;
        this.s = maz.a(wezVar, new Function0(this) { // from class: a.rw5
            public final /* synthetic */ tw5 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x005f  */
            /* JADX WARN: Code duplicated, block: B:27:0x0065  */
            /* JADX WARN: Code duplicated, block: B:39:0x0094  */
            /* JADX WARN: Code duplicated, block: B:41:0x009a  */
            /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                  (r4v9 java.lang.Object) from 0x00c5: PHI (r4 I:??) = (r4v6 java.lang.Object), (r4v9 java.lang.Object) binds: [B:50:0x00c4, B:67:0x00c5] A[DONT_GENERATE, DONT_INLINE]
                  (r4v9 java.lang.Object) from 0x00bd: CHECK_CAST (android.view.View) (r4v9 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 228
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.rw5.invoke():java.lang.Object");
            }
        });
        final byte b4 = 3;
        this.t = maz.a(wezVar, new Function0(this) { // from class: a.rw5
            public final /* synthetic */ tw5 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x005f  */
            /* JADX WARN: Code duplicated, block: B:27:0x0065  */
            /* JADX WARN: Code duplicated, block: B:39:0x0094  */
            /* JADX WARN: Code duplicated, block: B:41:0x009a  */
            /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                  (r4v9 java.lang.Object) from 0x00c5: PHI (r4 I:??) = (r4v6 java.lang.Object), (r4v9 java.lang.Object) binds: [B:50:0x00c4, B:67:0x00c5] A[DONT_GENERATE, DONT_INLINE]
                  (r4v9 java.lang.Object) from 0x00bd: CHECK_CAST (android.view.View) (r4v9 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 228
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.rw5.invoke():java.lang.Object");
            }
        });
        final byte b5 = 4;
        this.u = maz.a(wezVar, new Function0(this) { // from class: a.rw5
            public final /* synthetic */ tw5 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x005f  */
            /* JADX WARN: Code duplicated, block: B:27:0x0065  */
            /* JADX WARN: Code duplicated, block: B:39:0x0094  */
            /* JADX WARN: Code duplicated, block: B:41:0x009a  */
            /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                  (r4v9 java.lang.Object) from 0x00c5: PHI (r4 I:??) = (r4v6 java.lang.Object), (r4v9 java.lang.Object) binds: [B:50:0x00c4, B:67:0x00c5] A[DONT_GENERATE, DONT_INLINE]
                  (r4v9 java.lang.Object) from 0x00bd: CHECK_CAST (android.view.View) (r4v9 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 228
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.rw5.invoke():java.lang.Object");
            }
        });
        this.z = sw5.ROUND_16;
        setClipToOutline(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.h, i, 0);
        jmu0.j(this, ktt0.m(1, context, typedArrayObtainStyledAttributes));
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, this.v);
        this.w = typedArrayObtainStyledAttributes.getBoolean(2, this.w);
        this.x = typedArrayObtainStyledAttributes.getBoolean(3, this.x);
        this.y = typedArrayObtainStyledAttributes.getBoolean(0, this.y);
        cl5 cl5Var = sw5.b;
        int i2 = typedArrayObtainStyledAttributes.getInt(4, 0);
        cl5Var.getClass();
        Iterator it = sw5.h.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((sw5) next).f32903a != i2);
        sw5 sw5Var = (sw5) next;
        this.z = sw5Var == null ? sw5.ROUND_16 : sw5Var;
        typedArrayObtainStyledAttributes.recycle();
    }

    private final hab getCellRight() {
        return (hab) this.u.getValue();
    }

    private final View getSeparator() {
        return (View) this.t.getValue();
    }

    private final void setSelectedCellRight(boolean z) {
        Iterator it = new ihu0(this).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            Object next = it.next();
            View view = (View) next;
            view.getClass();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            jhu0 jhu0Var = viewGroup != null ? new jhu0(viewGroup) : null;
            if (jhu0Var == null || !jhu0Var.hasNext()) {
                while (!it.hasNext() && !arrayList.isEmpty()) {
                    it = (Iterator) CollectionsKt.d0(arrayList);
                    w3d.z(arrayList);
                }
            } else {
                arrayList.add(it);
                it = jhu0Var;
            }
            View view2 = (View) next;
            view2.setSelected(z && (view2 instanceof hab));
        }
    }

    private final void setSelectedOnChildren(boolean z) {
        Iterator it = new ihu0(this).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            Object next = it.next();
            View view = (View) next;
            view.getClass();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            jhu0 jhu0Var = viewGroup != null ? new jhu0(viewGroup) : null;
            if (jhu0Var == null || !jhu0Var.hasNext()) {
                while (!it.hasNext() && !arrayList.isEmpty()) {
                    it = (Iterator) CollectionsKt.d0(arrayList);
                    w3d.z(arrayList);
                }
            } else {
                arrayList.add(it);
                it = jhu0Var;
            }
            ((View) next).setSelected(z);
        }
    }

    public final View getCellLeftView() {
        return (View) this.q.getValue();
    }

    public final View getCellMiddleView() {
        return (View) this.r.getValue();
    }

    public final View getCellRightView() {
        return (View) this.s.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArr;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        boolean z = this.w;
        int i2 = R.attr.order_last;
        int i3 = R.attr.order_first;
        if (z || this.x) {
            if (!z) {
                i3 = -R.attr.order_first;
            }
            if (!this.x) {
                i2 = -R.attr.order_last;
            }
            iArr = new int[]{i3, i2};
        } else {
            sw5 sw5Var = this.z;
            if (sw5Var == sw5.ROUND_8) {
                iArr = new int[]{R.attr.round_8};
            } else if (sw5Var == sw5.ROUND_16) {
                iArr = new int[]{R.attr.round_16};
            } else if (sw5Var == sw5.ROUND_360) {
                iArr = new int[]{R.attr.round_full};
            } else {
                iArr = sw5Var == sw5.ROUND_12 ? new int[]{R.attr.round_12} : new int[]{-R.attr.order_first, -R.attr.order_last};
            }
        }
        int[] iArrMergeDrawableStates = View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
        iArrMergeDrawableStates.getClass();
        return iArrMergeDrawableStates;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View cellLeftView = getCellLeftView();
        if (cellLeftView != null) {
            ViewGroup.LayoutParams layoutParams = cellLeftView.getLayoutParams();
            if (layoutParams == null) {
                hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            a3e a3eVar = (a3e) layoutParams;
            a3eVar.i = 0;
            a3eVar.l = 0;
            a3eVar.t = 0;
            cellLeftView.setLayoutParams(a3eVar);
        }
        View cellRightView = getCellRightView();
        if (cellRightView != null) {
            ViewGroup.LayoutParams layoutParams2 = cellRightView.getLayoutParams();
            if (layoutParams2 == null) {
                hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            a3e a3eVar2 = (a3e) layoutParams2;
            a3eVar2.i = 0;
            a3eVar2.l = 0;
            a3eVar2.v = 0;
            cellRightView.setLayoutParams(a3eVar2);
        }
        View cellMiddleView = getCellMiddleView();
        if (cellMiddleView != null) {
            ViewGroup.LayoutParams layoutParams3 = cellMiddleView.getLayoutParams();
            if (layoutParams3 == null) {
                hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            a3e a3eVar3 = (a3e) layoutParams3;
            a3eVar3.i = 0;
            a3eVar3.l = 0;
            View cellLeftView2 = getCellLeftView();
            if (cellLeftView2 != null) {
                a3eVar3.s = cellLeftView2.getId();
                a3eVar3.setMarginStart(getResources().getDimensionPixelOffset(R.dimen.space_8));
            } else {
                a3eVar3.t = 0;
            }
            View cellRightView2 = getCellRightView();
            if (cellRightView2 != null) {
                a3eVar3.u = cellRightView2.getId();
            } else {
                a3eVar3.v = 0;
            }
            cellMiddleView.setLayoutParams(a3eVar3);
        }
        View separator = getSeparator();
        if (separator != null) {
            separator.setVisibility(!this.x ? 0 : 8);
            ViewGroup.LayoutParams layoutParams4 = separator.getLayoutParams();
            if (layoutParams4 == null) {
                hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            a3e a3eVar4 = (a3e) layoutParams4;
            View cellMiddleView2 = getCellMiddleView();
            a3eVar4.t = cellMiddleView2 != null ? cellMiddleView2.getId() : 0;
            a3eVar4.v = 0;
            a3eVar4.l = 0;
            separator.setLayoutParams(a3eVar4);
        }
        Iterator it = new ihu0(this).iterator();
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        if (it.hasNext()) {
            Object next = it.next();
            View view = (View) next;
            view.getClass();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            jhu0 jhu0Var = viewGroup != null ? new jhu0(viewGroup) : null;
            if (jhu0Var == null || !jhu0Var.hasNext()) {
                while (!it.hasNext() && !arrayList.isEmpty()) {
                    it = (Iterator) CollectionsKt.d0(arrayList);
                    w3d.z(arrayList);
                }
            } else {
                arrayList.add(it);
            }
            obj = next;
        }
        View view2 = (View) obj;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
            if (layoutParams5 == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5;
            marginLayoutParams.setMarginStart(this.v);
            view2.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        KeyEvent.Callback cellRightView = getCellRightView();
        jab jabVar = cellRightView instanceof jab ? (jab) cellRightView : null;
        if (jabVar != null) {
            View cellMiddleView = getCellMiddleView();
            DsCellMiddleTitle dsCellMiddleTitle = cellMiddleView instanceof DsCellMiddleTitle ? (DsCellMiddleTitle) cellMiddleView : null;
            if (dsCellMiddleTitle != null) {
                double d = size;
                int labelLength = jabVar.getLabelLength();
                CharSequence subtitle = dsCellMiddleTitle.getSubtitle();
                jabVar.setMaxWidthPercent((int) (d * (labelLength > (subtitle != null ? subtitle.length() : 0) ? 0.6d : 0.4d)));
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean performClick() {
        ymx ymxVar = ivb0.b;
        ymxVar.getClass();
        if (SystemClock.uptimeMillis() - ivb0.c <= ymxVar.f42912a) {
            return false;
        }
        hab cellRight = getCellRight();
        if (cellRight != null && cellRight.e()) {
            setSelectedCellRight((cellRight.f() && cellRight.j()) ? false : true);
        }
        return super.performClick();
    }

    public final void setActionEnabled(boolean z) {
        b5q b5qVar = new b5q(pgi0.h(new sx3(this, (byte) 7), new ij4((byte) 28)));
        while (b5qVar.hasNext()) {
            ((View) b5qVar.next()).setEnabled(z);
        }
    }

    @Override // android.view.View
    public void setAllowClickWhenDisabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (!this.y) {
            super.setEnabled(z);
        }
        Iterator it = new ihu0(this).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            Object next = it.next();
            View view = (View) next;
            view.getClass();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            jhu0 jhu0Var = viewGroup != null ? new jhu0(viewGroup) : null;
            if (jhu0Var == null || !jhu0Var.hasNext()) {
                while (!it.hasNext() && !arrayList.isEmpty()) {
                    it = (Iterator) CollectionsKt.d0(arrayList);
                    w3d.z(arrayList);
                }
            } else {
                arrayList.add(it);
                it = jhu0Var;
            }
            ((View) next).setEnabled(z);
        }
    }

    @Override // a.x8b
    public void setFirst(boolean z) {
        this.w = z;
        u();
    }

    @Override // a.x8b
    public void setLast(boolean z) {
        this.x = z;
        u();
    }

    public final void setRoundCorners(sw5 sw5Var) {
        sw5Var.getClass();
        this.z = sw5Var;
        u();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        if (z == isSelected()) {
            return;
        }
        super.setSelected(z);
        hab cellRight = getCellRight();
        if (cellRight == null || !cellRight.k()) {
            setSelectedCellRight(z);
        } else {
            setSelectedOnChildren(z);
        }
    }

    public final void u() {
        View separator = getSeparator();
        if (separator != null) {
            separator.setVisibility(this.x ? 8 : 0);
        }
        refreshDrawableState();
    }
}
