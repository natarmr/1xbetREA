package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class ksb extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18805a;
    public final Matrix b = new Matrix();
    public final boolean c;
    public final boolean d;
    public final View e;
    public final msb f;
    public final lsb g;
    public final Matrix h;

    public ksb(View view, msb msbVar, lsb lsbVar, Matrix matrix, boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        this.e = view;
        this.f = msbVar;
        this.g = lsbVar;
        this.h = matrix;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f18805a = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.f18805a;
        msb msbVar = this.f;
        View view = this.e;
        if (!z) {
            if (this.c && this.d) {
                Matrix matrix = this.b;
                matrix.set(this.h);
                view.setTag(R.id.transition_transform, matrix);
                float f = msbVar.f22309a;
                float f2 = msbVar.b;
                float f3 = msbVar.c;
                float f4 = msbVar.d;
                float f5 = msbVar.e;
                float f6 = msbVar.f;
                float f7 = msbVar.g;
                float f8 = msbVar.h;
                view.setTranslationX(f);
                view.setTranslationY(f2);
                WeakHashMap weakHashMap = rgu0.f30456a;
                view.setTranslationZ(f3);
                view.setScaleX(f4);
                view.setScaleY(f5);
                view.setRotationX(f6);
                view.setRotationY(f7);
                view.setRotation(f8);
            } else {
                view.setTag(R.id.transition_transform, null);
                view.setTag(R.id.parent_matrix, null);
            }
        }
        bmu0.f2855a.H(view, null);
        float f9 = msbVar.f22309a;
        float f10 = msbVar.b;
        float f11 = msbVar.c;
        float f12 = msbVar.d;
        float f13 = msbVar.e;
        float f14 = msbVar.f;
        float f15 = msbVar.g;
        float f16 = msbVar.h;
        view.setTranslationX(f9);
        view.setTranslationY(f10);
        WeakHashMap weakHashMap2 = rgu0.f30456a;
        view.setTranslationZ(f11);
        view.setScaleX(f12);
        view.setScaleY(f13);
        view.setRotationX(f14);
        view.setRotationY(f15);
        view.setRotation(f16);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = this.g.f20570a;
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        View view = this.e;
        view.setTag(R.id.transition_transform, matrix2);
        msb msbVar = this.f;
        float f = msbVar.f22309a;
        float f2 = msbVar.b;
        float f3 = msbVar.c;
        float f4 = msbVar.d;
        float f5 = msbVar.e;
        float f6 = msbVar.f;
        float f7 = msbVar.g;
        float f8 = msbVar.h;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        WeakHashMap weakHashMap = rgu0.f30456a;
        view.setTranslationZ(f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.e;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        WeakHashMap weakHashMap = rgu0.f30456a;
        view.setTranslationZ(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
