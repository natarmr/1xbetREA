package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tuo0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tuo0 f34561a;
    private static final ugi0 descriptor;

    static {
        tuo0 tuo0Var = new tuo0();
        f34561a = tuo0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.daily_tasks.impl.data.model.TaskPrizeResponse", tuo0Var, 4);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("bonus", true);
        zna0Var.j("realMoney", true);
        zna0Var.j("fs", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(wf8.f39058a), mrv.j0(kbe0.f18011a), mrv.j0(e8r.f7387a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        yf8 yf8Var = null;
        mbe0 mbe0Var = null;
        g8r g8rVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                yf8Var = (yf8) bldVarA.e(ugi0Var, 1, wf8.f39058a, yf8Var);
                i |= 2;
            } else if (iF == 2) {
                mbe0Var = (mbe0) bldVarA.e(ugi0Var, 2, kbe0.f18011a, mbe0Var);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                g8rVar = (g8r) bldVarA.e(ugi0Var, 3, e8r.f7387a, g8rVar);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new vuo0(i, num, yf8Var, mbe0Var, g8rVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vuo0 vuo0Var = (vuo0) obj;
        vuo0Var.getClass();
        g8r g8rVar = vuo0Var.d;
        mbe0 mbe0Var = vuo0Var.c;
        yf8 yf8Var = vuo0Var.b;
        Integer num = vuo0Var.f38058a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || yf8Var != null) {
            cldVarA.p(ugi0Var, 1, wf8.f39058a, yf8Var);
        }
        if (cldVarA.u(ugi0Var) || mbe0Var != null) {
            cldVarA.p(ugi0Var, 2, kbe0.f18011a, mbe0Var);
        }
        if (cldVarA.u(ugi0Var) || g8rVar != null) {
            cldVarA.p(ugi0Var, 3, e8r.f7387a, g8rVar);
        }
        cldVarA.c(ugi0Var);
    }
}
