package org.xplatform.uikit_sport.sport_cell;

import a.a8z;
import a.cqd0;
import a.hny;
import a.jmu0;
import a.ktt0;
import a.maz;
import a.pek;
import a.q3d;
import a.ryl;
import a.wez;
import a.xrm;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes6.dex */
public class DsSportCell extends FrameLayout {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47296a;
    public boolean b;
    public final boolean c;
    public final xrm d;
    public final int e;
    public final int f;
    public final int g;
    public final a8z h;
    public final a8z i;
    public final a8z j;
    public final a8z k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsSportCell(Context context, AttributeSet attributeSet, int i) {
        Object next;
        super(context, attributeSet, i);
        context.getClass();
        final byte b = 1;
        this.c = true;
        this.d = xrm.ROUND_16;
        this.e = Integer.MAX_VALUE;
        final byte b2 = 0;
        Function0 function0 = new Function0(this) { // from class: a.wrm
            public final /* synthetic */ DsSportCell b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0031  */
            /* JADX WARN: Code duplicated, block: B:16:0x0036  */
            /* JADX WARN: Code duplicated, block: B:18:0x003c  */
            /* JADX WARN: Code duplicated, block: B:30:0x006d  */
            /* JADX WARN: Code duplicated, block: B:33:0x0072  */
            /* JADX WARN: Code duplicated, block: B:35:0x0078  */
            /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
            /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
            /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v11 java.lang.Object, still in use, count: 2, list:
                  (r4v11 java.lang.Object) from 0x00a5: PHI (r4 I:??) = (r4v6 java.lang.Object), (r4v11 java.lang.Object) binds: [B:44:0x00a4, B:62:0x00a5] A[DONT_GENERATE, DONT_INLINE]
                  (r4v11 java.lang.Object) from 0x009d: CHECK_CAST (android.view.View) (r4v11 java.lang.Object)
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
                    r4 = this;
                    byte r0 = r2
                    r1 = -1
                    r2 = 0
                    org.xplatform.uikit_sport.sport_cell.DsSportCell r4 = r4.b
                    switch(r0) {
                        case 0: goto L81;
                        case 1: goto L45;
                        default: goto L9;
                    }
                L9:
                    int r0 = org.xplatform.uikit_sport.sport_cell.DsSportCell.l
                    a.pls0 r0 = new a.pls0
                    a.ihu0 r4 = a.pym0.i(r4)
                    java.util.Iterator r4 = r4.iterator()
                    r0.<init>(r4)
                L18:
                    java.util.Iterator r4 = r0.b
                    boolean r4 = r4.hasNext()
                    if (r4 == 0) goto L2c
                    java.lang.Object r4 = r0.next()
                    r3 = r4
                    android.view.View r3 = (android.view.View) r3
                    boolean r3 = r3 instanceof org.xplatform.uikit_sport.sport_cell.right.SportCellRightView
                    if (r3 == 0) goto L18
                    goto L2d
                L2c:
                    r4 = r2
                L2d:
                    boolean r0 = r4 instanceof org.xplatform.uikit_sport.sport_cell.right.SportCellRightView
                    if (r0 != 0) goto L32
                    r4 = r2
                L32:
                    org.xplatform.uikit_sport.sport_cell.right.SportCellRightView r4 = (org.xplatform.uikit_sport.sport_cell.right.SportCellRightView) r4
                    if (r4 == 0) goto L44
                    int r0 = r4.getId()
                    if (r0 != r1) goto L43
                    int r0 = a.jmu0.d()
                    r4.setId(r0)
                L43:
                    r2 = r4
                L44:
                    return r2
                L45:
                    int r0 = org.xplatform.uikit_sport.sport_cell.DsSportCell.l
                    a.pls0 r0 = new a.pls0
                    a.ihu0 r4 = a.pym0.i(r4)
                    java.util.Iterator r4 = r4.iterator()
                    r0.<init>(r4)
                L54:
                    java.util.Iterator r4 = r0.b
                    boolean r4 = r4.hasNext()
                    if (r4 == 0) goto L68
                    java.lang.Object r4 = r0.next()
                    r3 = r4
                    android.view.View r3 = (android.view.View) r3
                    boolean r3 = r3 instanceof org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView
                    if (r3 == 0) goto L54
                    goto L69
                L68:
                    r4 = r2
                L69:
                    boolean r0 = r4 instanceof org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView
                    if (r0 != 0) goto L6e
                    r4 = r2
                L6e:
                    org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView r4 = (org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView) r4
                    if (r4 == 0) goto L80
                    int r0 = r4.getId()
                    if (r0 != r1) goto L7f
                    int r0 = a.jmu0.d()
                    r4.setId(r0)
                L7f:
                    r2 = r4
                L80:
                    return r2
                L81:
                    int r0 = org.xplatform.uikit_sport.sport_cell.DsSportCell.l
                    a.pls0 r0 = new a.pls0
                    a.ihu0 r4 = a.pym0.i(r4)
                    java.util.Iterator r4 = r4.iterator()
                    r0.<init>(r4)
                L90:
                    java.util.Iterator r4 = r0.b
                    boolean r4 = r4.hasNext()
                    if (r4 == 0) goto La4
                    java.lang.Object r4 = r0.next()
                    r3 = r4
                    android.view.View r3 = (android.view.View) r3
                    boolean r3 = r3 instanceof org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView
                    if (r3 == 0) goto L90
                    goto La5
                La4:
                    r4 = r2
                La5:
                    boolean r0 = r4 instanceof org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView
                    if (r0 != 0) goto Laa
                    r4 = r2
                Laa:
                    org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView r4 = (org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView) r4
                    if (r4 == 0) goto Lbc
                    int r0 = r4.getId()
                    if (r0 != r1) goto Lbb
                    int r0 = a.jmu0.d()
                    r4.setId(r0)
                Lbb:
                    r2 = r4
                Lbc:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: a.wrm.invoke():java.lang.Object");
            }
        };
        wez wezVar = wez.b;
        this.h = maz.a(wezVar, function0);
        this.i = maz.a(wezVar, new Function0(this) { // from class: a.wrm
            public final /* synthetic */ DsSportCell b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v11 java.lang.Object, still in use, count: 2, list:
                  (r4v11 java.lang.Object) from 0x00a5: PHI (r4 I:??) = (r4v6 java.lang.Object), (r4v11 java.lang.Object) binds: [B:44:0x00a4, B:62:0x00a5] A[DONT_GENERATE, DONT_INLINE]
                  (r4v11 java.lang.Object) from 0x009d: CHECK_CAST (android.view.View) (r4v11 java.lang.Object)
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
                    r4 = this;
                    byte r0 = r2
                    r1 = -1
                    r2 = 0
                    org.xplatform.uikit_sport.sport_cell.DsSportCell r4 = r4.b
                    switch(r0) {
                        case 0: goto L81;
                        case 1: goto L45;
                        default: goto L9;
                    }
                L9:
                    int r0 = org.xplatform.uikit_sport.sport_cell.DsSportCell.l
                    a.pls0 r0 = new a.pls0
                    a.ihu0 r4 = a.pym0.i(r4)
                    java.util.Iterator r4 = r4.iterator()
                    r0.<init>(r4)
                L18:
                    java.util.Iterator r4 = r0.b
                    boolean r4 = r4.hasNext()
                    if (r4 == 0) goto L2c
                    java.lang.Object r4 = r0.next()
                    r3 = r4
                    android.view.View r3 = (android.view.View) r3
                    boolean r3 = r3 instanceof org.xplatform.uikit_sport.sport_cell.right.SportCellRightView
                    if (r3 == 0) goto L18
                    goto L2d
                L2c:
                    r4 = r2
                L2d:
                    boolean r0 = r4 instanceof org.xplatform.uikit_sport.sport_cell.right.SportCellRightView
                    if (r0 != 0) goto L32
                    r4 = r2
                L32:
                    org.xplatform.uikit_sport.sport_cell.right.SportCellRightView r4 = (org.xplatform.uikit_sport.sport_cell.right.SportCellRightView) r4
                    if (r4 == 0) goto L44
                    int r0 = r4.getId()
                    if (r0 != r1) goto L43
                    int r0 = a.jmu0.d()
                    r4.setId(r0)
                L43:
                    r2 = r4
                L44:
                    return r2
                L45:
                    int r0 = org.xplatform.uikit_sport.sport_cell.DsSportCell.l
                    a.pls0 r0 = new a.pls0
                    a.ihu0 r4 = a.pym0.i(r4)
                    java.util.Iterator r4 = r4.iterator()
                    r0.<init>(r4)
                L54:
                    java.util.Iterator r4 = r0.b
                    boolean r4 = r4.hasNext()
                    if (r4 == 0) goto L68
                    java.lang.Object r4 = r0.next()
                    r3 = r4
                    android.view.View r3 = (android.view.View) r3
                    boolean r3 = r3 instanceof org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView
                    if (r3 == 0) goto L54
                    goto L69
                L68:
                    r4 = r2
                L69:
                    boolean r0 = r4 instanceof org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView
                    if (r0 != 0) goto L6e
                    r4 = r2
                L6e:
                    org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView r4 = (org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView) r4
                    if (r4 == 0) goto L80
                    int r0 = r4.getId()
                    if (r0 != r1) goto L7f
                    int r0 = a.jmu0.d()
                    r4.setId(r0)
                L7f:
                    r2 = r4
                L80:
                    return r2
                L81:
                    int r0 = org.xplatform.uikit_sport.sport_cell.DsSportCell.l
                    a.pls0 r0 = new a.pls0
                    a.ihu0 r4 = a.pym0.i(r4)
                    java.util.Iterator r4 = r4.iterator()
                    r0.<init>(r4)
                L90:
                    java.util.Iterator r4 = r0.b
                    boolean r4 = r4.hasNext()
                    if (r4 == 0) goto La4
                    java.lang.Object r4 = r0.next()
                    r3 = r4
                    android.view.View r3 = (android.view.View) r3
                    boolean r3 = r3 instanceof org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView
                    if (r3 == 0) goto L90
                    goto La5
                La4:
                    r4 = r2
                La5:
                    boolean r0 = r4 instanceof org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView
                    if (r0 != 0) goto Laa
                    r4 = r2
                Laa:
                    org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView r4 = (org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView) r4
                    if (r4 == 0) goto Lbc
                    int r0 = r4.getId()
                    if (r0 != r1) goto Lbb
                    int r0 = a.jmu0.d()
                    r4.setId(r0)
                Lbb:
                    r2 = r4
                Lbc:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: a.wrm.invoke():java.lang.Object");
            }
        });
        final byte b3 = 2;
        this.j = maz.a(wezVar, new Function0(this) { // from class: a.wrm
            public final /* synthetic */ DsSportCell b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v11 java.lang.Object, still in use, count: 2, list:
                  (r4v11 java.lang.Object) from 0x00a5: PHI (r4 I:??) = (r4v6 java.lang.Object), (r4v11 java.lang.Object) binds: [B:44:0x00a4, B:62:0x00a5] A[DONT_GENERATE, DONT_INLINE]
                  (r4v11 java.lang.Object) from 0x009d: CHECK_CAST (android.view.View) (r4v11 java.lang.Object)
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
                    r4 = this;
                    byte r0 = r2
                    r1 = -1
                    r2 = 0
                    org.xplatform.uikit_sport.sport_cell.DsSportCell r4 = r4.b
                    switch(r0) {
                        case 0: goto L81;
                        case 1: goto L45;
                        default: goto L9;
                    }
                L9:
                    int r0 = org.xplatform.uikit_sport.sport_cell.DsSportCell.l
                    a.pls0 r0 = new a.pls0
                    a.ihu0 r4 = a.pym0.i(r4)
                    java.util.Iterator r4 = r4.iterator()
                    r0.<init>(r4)
                L18:
                    java.util.Iterator r4 = r0.b
                    boolean r4 = r4.hasNext()
                    if (r4 == 0) goto L2c
                    java.lang.Object r4 = r0.next()
                    r3 = r4
                    android.view.View r3 = (android.view.View) r3
                    boolean r3 = r3 instanceof org.xplatform.uikit_sport.sport_cell.right.SportCellRightView
                    if (r3 == 0) goto L18
                    goto L2d
                L2c:
                    r4 = r2
                L2d:
                    boolean r0 = r4 instanceof org.xplatform.uikit_sport.sport_cell.right.SportCellRightView
                    if (r0 != 0) goto L32
                    r4 = r2
                L32:
                    org.xplatform.uikit_sport.sport_cell.right.SportCellRightView r4 = (org.xplatform.uikit_sport.sport_cell.right.SportCellRightView) r4
                    if (r4 == 0) goto L44
                    int r0 = r4.getId()
                    if (r0 != r1) goto L43
                    int r0 = a.jmu0.d()
                    r4.setId(r0)
                L43:
                    r2 = r4
                L44:
                    return r2
                L45:
                    int r0 = org.xplatform.uikit_sport.sport_cell.DsSportCell.l
                    a.pls0 r0 = new a.pls0
                    a.ihu0 r4 = a.pym0.i(r4)
                    java.util.Iterator r4 = r4.iterator()
                    r0.<init>(r4)
                L54:
                    java.util.Iterator r4 = r0.b
                    boolean r4 = r4.hasNext()
                    if (r4 == 0) goto L68
                    java.lang.Object r4 = r0.next()
                    r3 = r4
                    android.view.View r3 = (android.view.View) r3
                    boolean r3 = r3 instanceof org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView
                    if (r3 == 0) goto L54
                    goto L69
                L68:
                    r4 = r2
                L69:
                    boolean r0 = r4 instanceof org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView
                    if (r0 != 0) goto L6e
                    r4 = r2
                L6e:
                    org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView r4 = (org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView) r4
                    if (r4 == 0) goto L80
                    int r0 = r4.getId()
                    if (r0 != r1) goto L7f
                    int r0 = a.jmu0.d()
                    r4.setId(r0)
                L7f:
                    r2 = r4
                L80:
                    return r2
                L81:
                    int r0 = org.xplatform.uikit_sport.sport_cell.DsSportCell.l
                    a.pls0 r0 = new a.pls0
                    a.ihu0 r4 = a.pym0.i(r4)
                    java.util.Iterator r4 = r4.iterator()
                    r0.<init>(r4)
                L90:
                    java.util.Iterator r4 = r0.b
                    boolean r4 = r4.hasNext()
                    if (r4 == 0) goto La4
                    java.lang.Object r4 = r0.next()
                    r3 = r4
                    android.view.View r3 = (android.view.View) r3
                    boolean r3 = r3 instanceof org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView
                    if (r3 == 0) goto L90
                    goto La5
                La4:
                    r4 = r2
                La5:
                    boolean r0 = r4 instanceof org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView
                    if (r0 != 0) goto Laa
                    r4 = r2
                Laa:
                    org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView r4 = (org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView) r4
                    if (r4 == 0) goto Lbc
                    int r0 = r4.getId()
                    if (r0 != r1) goto Lbb
                    int r0 = a.jmu0.d()
                    r4.setId(r0)
                Lbb:
                    r2 = r4
                Lbc:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: a.wrm.invoke():java.lang.Object");
            }
        });
        this.k = maz.a(wezVar, new ryl(context, (byte) 11));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cqd0.f4789a, i, 0);
        jmu0.j(this, ktt0.m(0, context, typedArrayObtainStyledAttributes));
        this.f47296a = typedArrayObtainStyledAttributes.getBoolean(4, this.f47296a);
        this.b = typedArrayObtainStyledAttributes.getBoolean(3, this.b);
        this.c = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, this.f);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, this.g);
        pek pekVar = xrm.b;
        int i2 = typedArrayObtainStyledAttributes.getInt(2, 0);
        pekVar.getClass();
        Iterator it = xrm.g.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xrm) next).f41377a != i2);
        xrm xrmVar = (xrm) next;
        this.d = xrmVar == null ? xrm.ROUND_16 : xrmVar;
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.e);
        typedArrayObtainStyledAttributes.recycle();
        addView(getSeparator());
        getSeparator().setVisibility((!this.c || this.b) ? (byte) 8 : (byte) 0);
    }

    private final DsSeparator getSeparator() {
        return (DsSeparator) this.k.getValue();
    }

    public final void a() {
        getSeparator().setVisibility(this.c && !this.b ? 0 : 8);
        refreshDrawableState();
    }

    public final SportCellLeftView getCellLeftView() {
        return (SportCellLeftView) this.h.getValue();
    }

    public final SportCellMiddleView getCellMiddleView() {
        return (SportCellMiddleView) this.i.getValue();
    }

    public final SportCellRightView getCellRightView() {
        return (SportCellRightView) this.j.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArr;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        boolean z = this.f47296a;
        int i2 = R.attr.order_last;
        int i3 = R.attr.order_first;
        if (z || this.b) {
            if (!z) {
                i3 = -R.attr.order_first;
            }
            if (!this.b) {
                i2 = -R.attr.order_last;
            }
            iArr = new int[]{i3, i2};
        } else {
            xrm xrmVar = xrm.ROUND_8;
            xrm xrmVar2 = this.d;
            if (xrmVar2 == xrmVar) {
                iArr = new int[]{R.attr.round_8};
            } else if (xrmVar2 == xrm.ROUND_16) {
                iArr = new int[]{R.attr.round_16};
            } else {
                iArr = xrmVar2 == xrm.ROUND_360 ? new int[]{R.attr.round_full} : new int[]{-R.attr.order_first, -R.attr.order_last};
            }
        }
        int[] iArrMergeDrawableStates = View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
        iArrMergeDrawableStates.getClass();
        return iArrMergeDrawableStates;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Pair pair;
        Pair pair2;
        ViewGroup.LayoutParams layoutParams;
        SportCellMiddleView cellMiddleView = getCellMiddleView();
        if (cellMiddleView == null) {
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMin = Math.min(View.MeasureSpec.getSize(i), this.e);
        int i3 = cellMiddleView.getLayoutParams().height;
        int iMakeMeasureSpec2 = i3 > 0 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : iMakeMeasureSpec;
        SportCellRightView cellRightView = getCellRightView();
        if (cellRightView == null || cellRightView.getVisibility() != 8) {
            SportCellRightView cellRightView2 = getCellRightView();
            if (cellRightView2 != null) {
                cellRightView2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            SportCellRightView cellRightView3 = getCellRightView();
            Integer numValueOf = Integer.valueOf(cellRightView3 != null ? cellRightView3.getMeasuredWidth() : 0);
            SportCellRightView cellRightView4 = getCellRightView();
            pair = new Pair(numValueOf, Integer.valueOf(cellRightView4 != null ? cellRightView4.getMeasuredHeight() : 0));
        } else {
            pair = new Pair(0, 0);
        }
        int iIntValue = ((Number) pair.f46059a).intValue();
        int iIntValue2 = ((Number) pair.b).intValue();
        SportCellLeftView cellLeftView = getCellLeftView();
        if (cellLeftView == null || cellLeftView.getVisibility() != 8) {
            SportCellLeftView cellLeftView2 = getCellLeftView();
            int i4 = (cellLeftView2 == null || (layoutParams = cellLeftView2.getLayoutParams()) == null) ? 0 : layoutParams.height;
            SportCellLeftView cellLeftView3 = getCellLeftView();
            if (cellLeftView3 != null) {
                cellLeftView3.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            }
            SportCellLeftView cellLeftView4 = getCellLeftView();
            Integer numValueOf2 = Integer.valueOf(cellLeftView4 != null ? cellLeftView4.getMeasuredWidth() : 0);
            SportCellLeftView cellLeftView5 = getCellLeftView();
            pair2 = new Pair(numValueOf2, Integer.valueOf(cellLeftView5 != null ? cellLeftView5.getMeasuredHeight() : 0));
        } else {
            pair2 = new Pair(0, 0);
        }
        int iIntValue3 = ((Number) pair2.f46059a).intValue();
        int iIntValue4 = ((Number) pair2.b).intValue();
        cellMiddleView.measure(View.MeasureSpec.makeMeasureSpec((((iMin - iIntValue) - iIntValue3) - getPaddingStart()) - getPaddingEnd(), Integer.MIN_VALUE), iMakeMeasureSpec2);
        int iIntValue5 = ((Number) CollectionsKt.i0(q3d.j(Integer.valueOf(iIntValue4), Integer.valueOf(cellMiddleView.getMeasuredHeight()), Integer.valueOf(iIntValue2)))).intValue();
        ViewGroup.LayoutParams layoutParams2 = cellMiddleView.getLayoutParams();
        if (layoutParams2 == null) {
            hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return;
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.setMarginStart(iIntValue3);
        cellMiddleView.setLayoutParams(layoutParams3);
        int i5 = iMin - this.f;
        int i6 = this.g;
        DsSeparator separator = getSeparator();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i5 - i6, 1073741824);
        Context context = getContext();
        context.getClass();
        separator.measure(iMakeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(jmu0.c(1, context), 1073741824));
        DsSeparator separator2 = getSeparator();
        ViewGroup.LayoutParams layoutParams4 = separator2.getLayoutParams();
        if (layoutParams4 == null) {
            hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return;
        }
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
        layoutParams5.gravity = 8388693;
        layoutParams5.setMarginEnd(i6);
        separator2.setLayoutParams(layoutParams5);
        setMeasuredDimension(iMin, iIntValue5);
    }

    public final void setRoundedBottom(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        a();
    }

    public final void setRoundedTop(boolean z) {
        if (this.f47296a == z) {
            return;
        }
        this.f47296a = z;
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSportCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSportCell(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ DsSportCell(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R.attr.sportCellStyle);
    }
}
