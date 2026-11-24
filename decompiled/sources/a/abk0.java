package a;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class abk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f585a;

    public abk0(ConstraintLayout constraintLayout) {
        this.f585a = constraintLayout;
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
    public final void a(hbk0 hbk0Var, Function0 function0) {
        int i;
        if (hbk0Var instanceof bbk0) {
            b(((bbk0) hbk0Var).b);
            return;
        }
        boolean z = hbk0Var instanceof cbk0;
        ConstraintLayout constraintLayout = this.f585a;
        if (z) {
            if (constraintLayout.m(R.id.smart_background_lottie) == null) {
                Context context = constraintLayout.getContext();
                context.getClass();
                org.xplatform.ui_core.viewcomponents.smart_background.c cVar = new org.xplatform.ui_core.viewcomponents.smart_background.c(context);
                cVar.setId(R.id.smart_background_lottie);
                cbk0 cbk0Var = (cbk0) hbk0Var;
                cVar.setContainerLayoutParams(cbk0Var.f4065a);
                uyw uywVar = cbk0Var.c;
                if (uywVar instanceof syw) {
                    i = ((syw) uywVar).f33043a;
                } else if (uywVar instanceof ryw) {
                    i = ((ryw) uywVar).f31332a;
                } else {
                    if (!(uywVar instanceof tyw)) {
                        t9f.b();
                        return;
                    }
                    i = ((tyw) uywVar).b;
                }
                cVar.b(cbk0Var.b, i, i);
                constraintLayout.addView(cVar, 0, cVar.getLayoutParams());
                return;
            }
            return;
        }
        if (hbk0Var instanceof ebk0) {
            if (constraintLayout.m(R.id.smart_background_smart_image) == null) {
                Context context2 = constraintLayout.getContext();
                context2.getClass();
                org.xplatform.ui_core.viewcomponents.smart_background.d dVar = new org.xplatform.ui_core.viewcomponents.smart_background.d(context2);
                dVar.setId(R.id.smart_background_smart_image);
                a3e a3eVar = new a3e(-1, -1);
                a3eVar.i = 0;
                a3eVar.l = 0;
                a3eVar.t = 0;
                a3eVar.v = 0;
                dVar.setLayoutParams(a3eVar);
                ebk0 ebk0Var = (ebk0) hbk0Var;
                dVar.setBackgroundImage(ebk0Var.b);
                dVar.setContent(ebk0Var.c);
                constraintLayout.addView(dVar, 0);
                return;
            }
            return;
        }
        if (hbk0Var instanceof dbk0) {
            b(((dbk0) hbk0Var).b);
            return;
        }
        if (!(hbk0Var instanceof gbk0)) {
            t9f.b();
            return;
        }
        if (constraintLayout.m(R.id.smart_background_video) == null) {
            Context context3 = constraintLayout.getContext();
            context3.getClass();
            org.xplatform.ui_core.viewcomponents.smart_background.e eVar = new org.xplatform.ui_core.viewcomponents.smart_background.e(context3);
            eVar.setId(R.id.smart_background_video);
            eVar.setOnPlayerReadyListener(function0);
            eVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            gbk0 gbk0Var = (gbk0) hbk0Var;
            eVar.c(gbk0Var.b, gbk0Var.c);
            constraintLayout.addView(eVar, 0);
        }
    }

    public final void b(y0x y0xVar) {
        ConstraintLayout constraintLayout = this.f585a;
        if (constraintLayout.m(R.id.smart_background_image) == null) {
            Context context = constraintLayout.getContext();
            context.getClass();
            org.xplatform.ui_core.viewcomponents.smart_background.b bVar = new org.xplatform.ui_core.viewcomponents.smart_background.b(context);
            bVar.setId(R.id.smart_background_image);
            bVar.setImageParams(y0xVar);
            constraintLayout.addView(bVar, 0);
        }
    }
}
