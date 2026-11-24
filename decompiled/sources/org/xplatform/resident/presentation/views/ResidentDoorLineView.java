package org.xplatform.resident.presentation.views;

import a.b4f0;
import a.bkx;
import a.bue0;
import a.dyb;
import a.g18;
import a.hny;
import a.kkx;
import a.l1e0;
import a.mof0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class ResidentDoorLineView extends LinearLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46883a;
    public Function1 b;
    public Function0 c;
    public boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ResidentDoorLineView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0, 0);
        this.f46883a = new ArrayList();
        this.b = new bue0((byte) 23);
        this.c = new b4f0((byte) 12);
        setOrientation(0);
        a();
    }

    public final void a() {
        removeAllViews();
        ArrayList arrayList = this.f46883a;
        arrayList.clear();
        Iterator it = l1e0.o(0, 2).iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            Context context = getContext();
            context.getClass();
            mof0 mof0Var = new mof0(context);
            addView(mof0Var);
            dyb.O(mof0Var, new g18((Object) mof0Var, (Object) this, iNextInt, (byte) 12));
            ViewGroup.LayoutParams layoutParams = mof0Var.getLayoutParams();
            if (layoutParams == null) {
                hny.u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                return;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 1.0f;
            mof0Var.setLayoutParams(layoutParams2);
            arrayList.add(mof0Var);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        Iterator it = this.f46883a.iterator();
        while (it.hasNext()) {
            ((mof0) it.next()).setClickable(z);
        }
    }

    public final void setOnDoorClickListener(Function1<? super Integer, Unit> function1) {
        function1.getClass();
        this.b = function1;
    }

    public final void setStateAppliedListener(Function0<Unit> function0) {
        function0.getClass();
        this.c = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResidentDoorLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResidentDoorLineView(Context context) {
        this(context, null, 14);
        context.getClass();
    }
}
