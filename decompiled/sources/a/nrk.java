package a;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.components.chips.DsChips;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nrk implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24005a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ nrk(Function2 function2, vpv vpvVar) {
        this.f24005a = (byte) 2;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f24005a;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                y8m y8mVar = (y8m) obj;
                y8mVar.getClass();
                function2.invoke(y8mVar.b, y8mVar.d);
                return Unit.f46060a;
            case 1:
                Context context = (Context) obj;
                context.getClass();
                DsChips dsChips = new DsChips(context, null);
                dsChips.setOnChipClickListener(new qyl(function2, (byte) 0));
                return dsChips;
            case 2:
                Long l = (Long) obj;
                l.getClass();
                function2.invoke("HEAD_TO_HEAD_STATISTIC", l);
                return Unit.f46060a;
            case 3:
                ocz oczVar = (ocz) obj;
                function2.invoke(Integer.valueOf(oczVar.f25052a), Integer.valueOf(oczVar.b));
                return Unit.f46060a;
            default:
                i73 i73Var = (i73) obj;
                function2.invoke(((hgk0) i73Var.e).getValue(), hp4.j.b.invoke(i73Var.f));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ nrk(Function2 function2, byte b) {
        this.f24005a = b;
        this.b = function2;
    }
}
