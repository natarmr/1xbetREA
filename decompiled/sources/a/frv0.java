package a;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class frv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f10038a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    public static final yqv0 a(x1 x1Var, skd skdVar, ugd ugdVar) {
        AndroidComposeView androidComposeView;
        yqv0 yqv0Var;
        if (y8v.f42213a.compareAndSet(false, true)) {
            q99 q99VarD = vtb.d(1, null, null, 6);
            qjj.W(d5c.a((CoroutineContext) r23.m.getValue()), null, null, new fns(q99VarD, null), 3);
            t3t t3tVar = new t3t(q99VarD, (byte) 12);
            synchronized (xfk0.c) {
                xfk0.i = CollectionsKt.r0(xfk0.i, t3tVar);
            }
            xfk0.c();
        }
        if (x1Var.getChildCount() > 0) {
            View childAt = x1Var.getChildAt(0);
            androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                androidComposeView.setComposeViewContext(skdVar);
            }
            if (androidComposeView == null) {
                androidComposeView = new AndroidComposeView(x1Var.getContext(), skdVar);
                x1Var.addView(androidComposeView.getView(), f10038a);
            }
            androidComposeView.setComposeViewContext(skdVar);
            if (x1Var.getComposeViewContext$ui() != null) {
                skdVar.e();
                androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = androidComposeView.getTag(R.id.wrapped_composition_tag);
            yqv0Var = tag instanceof yqv0 ? (yqv0) tag : null;
            if (yqv0Var == null) {
                yqv0Var = new yqv0(androidComposeView, new tld(skdVar.c(), new m6t0(androidComposeView.getRoot())));
                androidComposeView.setTag(R.id.wrapped_composition_tag, yqv0Var);
            }
            yqv0Var.d(ugdVar);
            androidComposeView.setFrameEndScheduler$ui(new erv0(skdVar.c()));
            return yqv0Var;
        }
        x1Var.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(x1Var.getContext(), skdVar);
            x1Var.addView(androidComposeView.getView(), f10038a);
        }
        androidComposeView.setComposeViewContext(skdVar);
        if (x1Var.getComposeViewContext$ui() != null) {
            skdVar.e();
            androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = androidComposeView.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof yqv0) {
        }
        if (yqv0Var == null) {
            yqv0Var = new yqv0(androidComposeView, new tld(skdVar.c(), new m6t0(androidComposeView.getRoot())));
            androidComposeView.setTag(R.id.wrapped_composition_tag, yqv0Var);
        }
        yqv0Var.d(ugdVar);
        androidComposeView.setFrameEndScheduler$ui(new erv0(skdVar.c()));
        return yqv0Var;
    }
}
