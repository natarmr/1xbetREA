package a;

import java.util.LinkedHashSet;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class rwc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mne f31212a;
    public final do20 b;
    public final nhf0 c;
    public final up70 d;
    public final knf0 e;
    public final us3 f;
    public final q7d0 g;

    public rwc(mne mneVar, do20 do20Var, nhf0 nhf0Var, up70 up70Var, knf0 knf0Var, us3 us3Var, q7d0 q7d0Var) {
        up70Var.getClass();
        knf0Var.getClass();
        us3Var.getClass();
        q7d0Var.getClass();
        this.f31212a = mneVar;
        this.b = do20Var;
        this.c = nhf0Var;
        this.d = up70Var;
        this.e = knf0Var;
        this.f = us3Var;
        this.g = q7d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        lwc lwcVar;
        if (zjeVar instanceof lwc) {
            lwcVar = (lwc) zjeVar;
            int i = lwcVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwcVar.k = i - Integer.MIN_VALUE;
            } else {
                lwcVar = new lwc(this, zjeVar);
            }
        } else {
            lwcVar = new lwc(this, zjeVar);
        }
        Object obj = lwcVar.i;
        Object obj2 = wne.f39444a;
        int i2 = lwcVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            lwcVar.k = 1;
            nhf0 nhf0Var = this.c;
            ((LinkedHashSet) nhf0Var.c).clear();
            Object objW0 = sj3.w0(lwcVar, ((sr50) ((n0o0) nhf0Var.b).getValue()).f32660a, new st20(2, yjeVar, (byte) 5), false, true);
            if (objW0 != obj2) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != obj2) {
                objW0 = Unit.f46060a;
            }
            if (objW0 == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        q7d0 q7d0Var = this.g;
        q7d0Var.h("FIRST_SAVE_SEEN_BANNER_TIMESTAMP");
        q7d0Var.h("CMS_PROMOTIONS_WERE_LAUNCHED");
        return Unit.f46060a;
    }
}
