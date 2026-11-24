package a;

import android.text.Editable;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ih70 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14768a;
    public final /* synthetic */ mh70 b;

    public /* synthetic */ ih70(mh70 mh70Var, byte b) {
        this.f14768a = b;
        this.b = mh70Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14768a;
        yje yjeVar = null;
        mh70 mh70Var = this.b;
        switch (b) {
            case 0:
                Editable editable = (Editable) obj;
                jh70 jh70Var = mh70.Q1;
                editable.getClass();
                ji70 ji70VarI0 = mh70Var.I0();
                String string = editable.toString();
                string.getClass();
                sac.V(jiu0.a(ji70VarI0), new cf70(1, ji70VarI0, ji70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 21), null, ji70VarI0.l.f22085a, new er60(ji70VarI0, string, yjeVar, (byte) 8), 10);
                break;
            case 1:
                jh70 jh70Var2 = mh70.Q1;
                ((View) obj).getClass();
                mh70.G0(mh70Var);
                ji70 ji70VarI1 = mh70Var.I0();
                sac.V(jiu0.a(ji70VarI1), new cf70(1, ji70VarI1, ji70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, ji70VarI1.l.b, new z8t(ji70VarI1, yjeVar, (byte) 6), 10);
                break;
            case 2:
                jh70 jh70Var3 = mh70.Q1;
                ((View) obj).getClass();
                mh70.G0(mh70Var);
                ji70 ji70VarI2 = mh70Var.I0();
                sac.V(jiu0.a(ji70VarI2), new cf70(1, ji70VarI2, ji70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, ji70VarI2.l.b, new ts6((diu0) ji70VarI2, yjeVar, (byte) 2), 10);
                break;
            case 3:
                jh70 jh70Var4 = mh70.Q1;
                ((View) obj).getClass();
                mh70.G0(mh70Var);
                ji70 ji70VarI3 = mh70Var.I0();
                Double dI = kotlin.text.b.i(String.valueOf(mh70Var.H0().f.getText()));
                sac.V(jiu0.a(ji70VarI3), new cf70(1, ji70VarI3, ji70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, ji70VarI3.l.b, new xg70(ji70VarI3, dI != null ? dI.doubleValue() : 0.0d, null, (byte) 1), 10);
                break;
            default:
                jh70 jh70Var5 = mh70.Q1;
                ((View) obj).getClass();
                mh70.G0(mh70Var);
                ji70 ji70VarI4 = mh70Var.I0();
                Double dI2 = kotlin.text.b.i(String.valueOf(mh70Var.H0().f.getText()));
                sac.V(jiu0.a(ji70VarI4), new cf70(1, ji70VarI4, ji70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, ji70VarI4.l.b, new ah70(ji70VarI4, dI2 != null ? dI2.doubleValue() : 0.0d, null, (byte) 1), 10);
                break;
        }
        return Unit.f46060a;
    }
}
