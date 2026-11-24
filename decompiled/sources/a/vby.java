package a;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vby {
    public static final uby d = new uby(new dcy(false, false, true, "    ", false, Payload.TYPE, true, olc.c, true), qhi0.f28741a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcy f37162a;
    public final qaj b;
    public final vqc c = new vqc((byte) 25);

    public vby(dcy dcyVar, qaj qajVar) {
        this.f37162a = dcyVar;
        this.b = qajVar;
    }

    public final Object a(jiy jiyVar, mcy mcyVar) {
        rkj kdyVar;
        jiyVar.getClass();
        mcyVar.getClass();
        String str = null;
        if (mcyVar instanceof edy) {
            kdyVar = new ody(this, (edy) mcyVar, str, 12);
        } else if (mcyVar instanceof yby) {
            kdyVar = new pdy(this, (yby) mcyVar);
        } else {
            if (!(mcyVar instanceof xcy) && !mcyVar.equals(bdy.INSTANCE)) {
                t9f.b();
                return null;
            }
            kdyVar = new kdy(this, (jdy) mcyVar, null);
        }
        return kdyVar.w(jiyVar);
    }

    public final Object b(jiy jiyVar, String str) {
        jiyVar.getClass();
        str.getClass();
        fp fpVarE = qsm0.e(this, str);
        Object objW = new xrm0(this, jrv0.OBJ, fpVarE, jiyVar.getDescriptor(), null).w(jiyVar);
        if (fpVarE.h() == 10) {
            return objW;
        }
        fp.t(fpVarE, "Expected EOF after parsing, but had " + ((String) fpVarE.g).charAt(fpVarE.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final mcy c(jiy jiyVar, Object obj) {
        jiyVar.getClass();
        mie0 mie0Var = new mie0();
        new ldy(this, (Function1) new cx2(mie0Var, (byte) 9), (byte) 1).C(jiyVar, obj);
        Object obj2 = mie0Var.f21842a;
        if (obj2 != null) {
            return (mcy) obj2;
        }
        Intrinsics.h("result");
        throw null;
    }

    public final String d(jiy jiyVar, Object obj) {
        char[] cArr;
        jiyVar.getClass();
        boolean z = false;
        y78 y78Var = new y78((byte) 6, z);
        jub jubVar = jub.c;
        synchronized (jubVar) {
            xw3 xw3Var = jubVar.f17145a;
            cArr = null;
            char[] cArr2 = (char[]) (xw3Var.isEmpty() ? null : xw3Var.removeLast());
            if (cArr2 != null) {
                jubVar.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        y78Var.c = cArr;
        try {
            new yrm0(new s88((Object) y78Var, (byte) 5, z), this, jrv0.OBJ, new scy[jrv0.h.b()]).C(jiyVar, obj);
            return y78Var.toString();
        } finally {
            y78Var.u();
        }
    }

    public final mcy e(String str) {
        str.getClass();
        return (mcy) b(qcy.f28507a, str);
    }
}
