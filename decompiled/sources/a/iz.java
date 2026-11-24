package a;

import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15611a;
    public final /* synthetic */ mz b;

    public /* synthetic */ iz(mz mzVar, byte b) {
        this.f15611a = b;
        this.b = mzVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15611a;
        byte b2 = 6;
        yje yjeVar = null;
        mz mzVar = this.b;
        switch (b) {
            case 0:
                rue0 rue0Var = (rue0) obj;
                jdk0 jdk0Var = mz.V1;
                rue0Var.getClass();
                mzVar.H0().z(rue0Var, vqp.f);
                break;
            case 1:
                rue0 rue0Var2 = (rue0) obj;
                jdk0 jdk0Var2 = mz.V1;
                rue0Var2.getClass();
                mzVar.H0().z(rue0Var2, vqp.g);
                break;
            case 2:
                qkt qktVar = (qkt) obj;
                jdk0 jdk0Var3 = mz.V1;
                qktVar.getClass();
                g00 g00VarH0 = mzVar.H0();
                sac.V(jiu0.a(g00VarH0), new nz(g00VarH0, (byte) 3), null, g00VarH0.p.f22085a, new qa(g00VarH0, qktVar, yjeVar, b2), 10);
                break;
            default:
                vqp vqpVar = (vqp) obj;
                jdk0 jdk0Var4 = mz.V1;
                vqpVar.getClass();
                g00 g00VarH1 = mzVar.H0();
                mne mneVar = g00VarH1.p;
                ol60 ol60Var = g00VarH1.z;
                int iOrdinal = vqpVar.ordinal();
                if (iOrdinal == 3) {
                    ol60Var.f(new rz(g00VarH1.w()));
                } else if (iOrdinal != 4) {
                    byte b3 = 1;
                    if (iOrdinal == 5) {
                        sac.V(jiu0.a(g00VarH1), new nz(g00VarH1, (byte) 4), null, mneVar.f22085a, new d00(g00VarH1, yjeVar, b3), 10);
                    } else if (iOrdinal == 6) {
                        int i = g00VarH1.g.a().N.n;
                        Calendar calendar = Calendar.getInstance();
                        calendar.add(1, -i);
                        calendar.add(5, -1);
                        ol60Var.f(new tz(calendar));
                    }
                } else {
                    sac.V(jiu0.a(g00VarH1), new nz(g00VarH1, (byte) 2), null, mneVar.f22085a, new d00(g00VarH1, yjeVar, (byte) 2), 10);
                }
                break;
        }
        return Unit.f46060a;
    }
}
