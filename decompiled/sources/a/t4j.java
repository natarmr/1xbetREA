package a;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class t4j extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ cr k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4j(cr crVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = crVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new t4j(this.k, yjeVar, (byte) 0);
            default:
                return new t4j(this.k, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((t4j) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        kxq kxqVar;
        glz glzVar;
        lkz lkzVar;
        kxq kxqVar2;
        glz glzVar2;
        lkz lkzVar2;
        mzb0 mzb0VarA;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                cr crVar = this.k;
                if (!z) {
                    z1x.P(obj);
                    nr nrVar = (nr) crVar.e;
                    this.j = true;
                    obj = nrVar.v(this);
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
                if (((Boolean) obj).booleanValue()) {
                    String string = ((us00) crVar.c).getString(R.string.daily_task_new_task_available_notification);
                    string.getClass();
                    WeakReference weakReference = ((jvq) crVar.i).b;
                    if (weakReference == null || (kxqVar = (kxq) weakReference.get()) == null || (glzVar = kxqVar.f44297a) == null || (lkzVar = glzVar.i) == null || lkzVar.compareTo(lkz.d) < 0) {
                        crVar.f(string, null, null, sr00.f);
                    } else {
                        ((b4j) crVar.k).f1961a.c("dchallenge_alert_view");
                        ((je) crVar.m).f16351a.a(xun.f41520a, 10942L);
                        cr.g(crVar, string, R.string.daily_task_empty_button_text, tx3.l0(new wtq[]{wtq.b, wtq.c}), new e8g(crVar, (byte) 25));
                    }
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                cr crVar2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    cu cuVar = (cu) crVar2.f;
                    this.j = true;
                    obj = cuVar.l(this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                n85 n85Var = (n85) obj;
                if (n85Var != null) {
                    huo0 huo0Var = n85Var.k;
                    aet aetVar = huo0Var instanceof aet ? (aet) huo0Var : null;
                    long j = (aetVar == null || (mzb0VarA = aetVar.a()) == null) ? 0L : mzb0VarA.f22646a;
                    String string2 = ((us00) crVar2.c).getString(R.string.daily_task_soon_finished_notification);
                    string2.getClass();
                    WeakReference weakReference2 = ((jvq) crVar2.i).b;
                    if (weakReference2 == null || (kxqVar2 = (kxq) weakReference2.get()) == null || (glzVar2 = kxqVar2.f44297a) == null || (lkzVar2 = glzVar2.i) == null || lkzVar2.compareTo(lkz.d) < 0) {
                        crVar2.f(string2, n85Var.h, new Long(j), sr00.g);
                    } else {
                        ((b4j) crVar2.k).f1961a.c("dchallenge_alert_rush_view");
                        ((je) crVar2.m).f16351a.a(xun.f41520a, 10946L);
                        cr.g(crVar2, string2, R.string.daily_task_play, tx3.l0(new wtq[]{wtq.f39753a, wtq.c}), new pe1((Object) crVar2, (Object) n85Var, j, (byte) 4));
                    }
                }
                return Unit.f46060a;
        }
    }
}
