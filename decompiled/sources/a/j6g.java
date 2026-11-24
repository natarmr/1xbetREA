package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.calendar.impl.presentation.container.champinfo.CyberCalendarChampInfoParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j6g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15984a;
    public final /* synthetic */ l6g b;

    public /* synthetic */ j6g(l6g l6gVar, byte b) {
        this.f15984a = b;
        this.b = l6gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15984a;
        l6g l6gVar = this.b;
        switch (b) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                kwd kwdVar = l6g.Q1;
                w6g w6gVarH0 = l6gVar.H0();
                sac.V(jiu0.a(w6gVarH0), new s6g(w6gVarH0, (byte) 0), null, w6gVarH0.j.f22085a, new ey((Object) w6gVarH0, jLongValue, (yje) null, (byte) 13), 10);
                break;
            default:
                i9g i9gVar = (i9g) obj;
                kwd kwdVar2 = l6g.Q1;
                String simpleName = v4g.class.getSimpleName();
                if (l6gVar.C().J(simpleName) == null) {
                    kud kudVar = v4g.l2;
                    String str = i9gVar.d;
                    l7g l7gVar = i9gVar.f;
                    CyberCalendarChampInfoParams cyberCalendarChampInfoParams = new CyberCalendarChampInfoParams(str, l7gVar.f19556a, l7gVar.b, l7gVar.c, l7gVar.d, l7gVar.e, l7gVar.f, l7gVar.g, i9gVar.f14383a);
                    boolean zBooleanValue = ((Boolean) l6gVar.P1.n(l6gVar, l6g.R1[2])).booleanValue();
                    kudVar.getClass();
                    kud.f(cyberCalendarChampInfoParams, zBooleanValue).H0(l6gVar.C(), simpleName);
                }
                break;
        }
        return Unit.f46060a;
    }
}
