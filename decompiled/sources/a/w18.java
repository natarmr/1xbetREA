package a;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class w18 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4l0 f38386a;
    public yse b = wse.f39686a;
    public cue c = zte.f44954a;
    public int d;
    public boolean e;
    public final int f;
    public final int g;
    public int h;
    public int i;
    public int j;
    public zse k;
    public final l5k0 l;
    public final x18 m;
    public final siz n;
    public View o;
    public due p;

    public w18(f4l0 f4l0Var) {
        this.f38386a = f4l0Var;
        this.f = f4l0Var.getResources().getDimensionPixelSize(R.dimen.space_12);
        int dimensionPixelSize = f4l0Var.getResources().getDimensionPixelSize(R.dimen.space_18);
        this.g = f4l0Var.getResources().getDimensionPixelSize(R.dimen.space_8);
        Context context = f4l0Var.getContext();
        context.getClass();
        l5k0 l5k0Var = new l5k0(context);
        l5k0Var.setTextAlignment(4);
        cem0.n(R.style.TextStyle_Caption_Medium_L_TextPrimary, l5k0Var);
        l5k0Var.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        this.l = l5k0Var;
        Context context2 = f4l0Var.getContext();
        context2.getClass();
        this.m = new x18(context2);
        Context context3 = f4l0Var.getContext();
        context3.getClass();
        this.n = new siz(context3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [a.zse] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.due] */
    /* JADX WARN: Type inference failed for: r2v2 */
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
    public final void a(cue cueVar, yse yseVar) {
        View wteVar;
        ?? r0;
        zse zseVar = this.k;
        f4l0 f4l0Var = this.f38386a;
        if ((zseVar == null || yseVar.getClass() != this.b.getClass() || cueVar.getClass() != this.c.getClass()) && !(cueVar instanceof zte)) {
            Object obj = this.k;
            View view = obj != null ? (View) obj : null;
            if (view != null) {
                f4l0Var.removeView(view);
            }
            if (cueVar instanceof aue) {
                wteVar = null;
            } else if ((yseVar instanceof wse) || (yseVar instanceof vse)) {
                Context context = f4l0Var.getContext();
                context.getClass();
                wteVar = new wte(context);
            } else if (yseVar instanceof tse) {
                Context context2 = f4l0Var.getContext();
                context2.getClass();
                wteVar = new udf(context2);
            } else if (yseVar instanceof use) {
                Context context3 = f4l0Var.getContext();
                context3.getClass();
                wteVar = new v18(context3);
            } else if (yseVar instanceof xse) {
                Context context4 = f4l0Var.getContext();
                context4.getClass();
                wteVar = new lxp0(context4);
            } else {
                wteVar = null;
            }
            if (wteVar != null) {
                f4l0Var.addView(wteVar);
                r0 = wteVar;
            } else {
                r0 = 0;
            }
            this.k = r0;
        }
        zse zseVar2 = this.k;
        rkg0 rkg0Var = zseVar2 instanceof rkg0 ? (rkg0) zseVar2 : null;
        if (rkg0Var != null) {
            rkg0Var.setRtlSupportEnabled(this.e);
        }
        zse zseVar3 = this.k;
        if (zseVar3 != null) {
            zseVar3.setScoreUiModel(yseVar);
        }
        View view2 = this.l;
        x18 x18Var = this.m;
        siz sizVar = this.n;
        for (View view3 : q3d.j(view2, x18Var, sizVar)) {
            if (view3.getParent() == null) {
                f4l0Var.addView(view3);
            }
        }
        if (!(cueVar instanceof aue)) {
            if (cueVar instanceof bue) {
                zse zseVar4 = this.k;
                view2 = ((zseVar4 instanceof wte) || (zseVar4 instanceof v18)) ? x18Var : sizVar;
            } else {
                view2 = null;
            }
        }
        if (!Intrinsics.d(this.o, view2) || this.c.getClass() != cueVar.getClass()) {
            View view4 = this.o;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            this.o = view2;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            this.p = view2 != null ? view2 : 0;
        }
        due dueVar = this.p;
        if (dueVar != null) {
            dueVar.setTeamsUiModel(cueVar);
        }
        x18Var.setRtlSupportEnabled(this.e);
        this.b = yseVar;
        this.c = cueVar;
        f4l0Var.invalidate();
        f4l0Var.requestLayout();
    }
}
