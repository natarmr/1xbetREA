package a;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.check_box.old.DsCheckBoxOld;

/* JADX INFO: loaded from: classes3.dex */
public final class w6w extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ x6w k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6w(x6w x6wVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = x6wVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        x6w x6wVar = this.k;
        switch (b) {
            case 0:
                w6w w6wVar = new w6w(x6wVar, yjeVar, (byte) 0);
                w6wVar.j = obj;
                return w6wVar;
            case 1:
                w6w w6wVar2 = new w6w(x6wVar, yjeVar, (byte) 1);
                w6wVar2.j = obj;
                return w6wVar2;
            default:
                w6w w6wVar3 = new w6w(x6wVar, yjeVar, (byte) 2);
                w6wVar3.j = obj;
                return w6wVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((w6w) create((gje) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((w6w) create((o9h0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((w6w) create((vnm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        awl awlVar;
        byte b = this.i;
        x6w x6wVar = this.k;
        switch (b) {
            case 0:
                a8z a8zVar = x6wVar.h2;
                gje gjeVar = (gje) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (!Intrinsics.d(gjeVar, vie.f37473a)) {
                    if (!(gjeVar instanceof tie)) {
                        t9f.b();
                        return null;
                    }
                    art artVar = x6w.k2;
                    ((y6w) a8zVar.getValue()).f = ((tie) gjeVar).f34004a;
                    ((y6w) a8zVar.getValue()).g();
                }
                return Unit.f46060a;
            case 1:
                o9h0 o9h0Var = (o9h0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                DsCheckBoxOld dsCheckBoxOld = (DsCheckBoxOld) x6wVar.L0().c.c;
                boolean z = o9h0Var.f24880a;
                if (z) {
                    awlVar = awl.STATE_CHECKED;
                } else {
                    if (z) {
                        t9f.b();
                        return null;
                    }
                    awlVar = awl.STATE_INDETERMINATE;
                }
                dsCheckBoxOld.setCheckedState(awlVar);
                x6wVar.L0().b.setEnabled(o9h0Var.b);
                return Unit.f46060a;
            default:
                vnm0 vnm0Var = (vnm0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!Intrinsics.d(vnm0Var, vnm0.f37726a)) {
                    t9f.b();
                    return null;
                }
                Dialog dialog = x6wVar.S1;
                if (dialog != null) {
                    dialog.cancel();
                }
                return Unit.f46060a;
        }
    }
}
