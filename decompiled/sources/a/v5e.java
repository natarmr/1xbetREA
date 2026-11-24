package a;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.consultantchat.presentation.dialogs.file.model.FileBottomDialogResult;

/* JADX INFO: loaded from: classes3.dex */
public final class v5e extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ c6e j;
    public final /* synthetic */ File k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5e(c6e c6eVar, File file, yje yjeVar) {
        super(2, yjeVar);
        this.j = c6eVar;
        this.k = file;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new v5e(this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v5e) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        File file = this.k;
        c6e c6eVar = this.j;
        if (!z) {
            z1x.P(obj);
            h03 h03Var = c6eVar.h;
            this.i = true;
            obj = h03Var.C(file, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        a2c a2cVar = (a2c) obj;
        if (Intrinsics.d(a2cVar, x1c.f40116a)) {
            c6eVar.y(new o5e(new FileBottomDialogResult.FileResult(file)));
        } else {
            c6eVar.y(new r5e(a2cVar));
        }
        return Unit.f46060a;
    }
}
