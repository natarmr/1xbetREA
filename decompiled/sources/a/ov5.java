package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.ui_core.viewcomponents.motion.AppBarMotionLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ov5 extends dw5 {
    public final /* synthetic */ byte c = 1;
    public final /* synthetic */ Object d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ov5(AppBarMotionLayout appBarMotionLayout) {
        Float fValueOf = Float.valueOf(0.0f);
        this.d = appBarMotionLayout;
        super(fValueOf);
    }

    @Override // a.dw5
    public void a(iiy iiyVar, Object obj, Object obj2) {
        Function1<Float, Unit> onProgressChangeCallback;
        switch (this.c) {
            case 0:
                iiyVar.getClass();
                float fFloatValue = ((Number) obj2).floatValue();
                if (((Number) obj).floatValue() != fFloatValue && (onProgressChangeCallback = ((AppBarMotionLayout) this.d).getOnProgressChangeCallback()) != null) {
                    onProgressChangeCallback.invoke(Float.valueOf(fFloatValue));
                }
                break;
            default:
                super.a(iiyVar, obj, obj2);
                break;
        }
    }

    @Override // a.dw5
    public void b(iiy iiyVar) {
        switch (this.c) {
            case 1:
                iiyVar.getClass();
                if (((lek) this.d).f19907a) {
                    jf4.n("Cannot modify readonly DescriptorRendererOptions");
                    break;
                }
                break;
            default:
                super.b(iiyVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov5(Object obj, lek lekVar) {
        super(obj);
        this.d = lekVar;
    }
}
