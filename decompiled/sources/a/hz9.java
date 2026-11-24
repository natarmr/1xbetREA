package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Rational;
import android.util.Size;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hz9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13896a;
    public final /* synthetic */ qz9 b;

    public /* synthetic */ hz9(qz9 qz9Var, byte b) {
        this.f13896a = b;
        this.b = qz9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        skz skzVar;
        ig00 ig00VarC0;
        byte b;
        byte b2 = this.f13896a;
        byte b3 = 0;
        qz9 qz9Var = this.b;
        switch (b2) {
            case 0:
                kl5 kl5Var = qz9.t2;
                qz9Var.U0();
                qz9Var.z0(false, false, false);
                return Unit.f46060a;
            case 1:
                kl5 kl5Var2 = qz9.t2;
                gyw gywVar = new gyw((byte) 2);
                isf0 isf0Var = (isf0) qz9Var.j2.getValue();
                wy40 wy40Var = gywVar.b;
                wy40Var.y(w0x.s0, isf0Var);
                pub0 pub0Var = new pub0(b780.j(wy40Var));
                w0x.t(pub0Var);
                oub0 oub0Var = new oub0(pub0Var);
                oub0Var.s = oub0.z;
                return oub0Var;
            case 2:
                kl5 kl5Var3 = qz9.t2;
                Context contextO0 = qz9Var.o0();
                Size size = new Size(contextO0.getResources().getDisplayMetrics().widthPixels, contextO0.getResources().getDisplayMetrics().heightPixels);
                Rational rational = new Rational(size.getWidth(), size.getHeight());
                int iM = ((oub0) qz9Var.l2.getValue()).m();
                wju0 wju0Var = new wju0();
                wju0Var.f39281a = 1;
                wju0Var.b = rational;
                wju0Var.c = iM;
                wju0Var.d = 0;
                return wju0Var;
            case 3:
                kl5 kl5Var4 = qz9.t2;
                gyw gywVar2 = new gyw((byte) 1);
                isf0 isf0Var2 = (isf0) qz9Var.j2.getValue();
                wy40 wy40Var2 = gywVar2.b;
                wy40Var2.y(w0x.s0, isf0Var2);
                wy40Var2.y(nzw.b, 1);
                byte b4 = ((kkd0) qz9Var.d2.n(qz9Var, qz9.u2[0])).f18432a;
                z1x.v(b4, 1, 100, "jpegQuality");
                wy40Var2.y(nzw.j, Integer.valueOf(b4));
                return gywVar2.a();
            case 4:
                kl5 kl5Var5 = qz9.t2;
                gyw gywVar3 = new gyw((byte) 0);
                isf0 isf0Var3 = (isf0) qz9Var.j2.getValue();
                wy40 wy40Var3 = gywVar3.b;
                wy40Var3.y(w0x.s0, isf0Var3);
                wy40Var3.y(myw.b, 0);
                myw mywVar = new myw(b780.j(wy40Var3));
                w0x.t(mywVar);
                return new jyw(mywVar);
            case 5:
                kl5 kl5Var6 = qz9.t2;
                return m7x.P(qz9Var, "android.permission.CAMERA", new String[0]).d();
            case 6:
                kl5 kl5Var7 = qz9.t2;
                qz9Var.U0();
                qz9Var.z0(false, false, false);
                return Unit.f46060a;
            case 7:
                kl5 kl5Var8 = qz9.t2;
                Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                intentJ.setData(Uri.fromParts("package", qz9Var.n0().getPackageName(), null));
                qz9Var.w0(intentJ);
                return Unit.f46060a;
            case 8:
                kl5 kl5Var9 = qz9.t2;
                i1w0 i1w0VarF = a4n0.f(qz9Var);
                fbi fbiVar = qz9Var.b2;
                if (fbiVar != null) {
                    return new ry3(i1w0VarF, fbiVar);
                }
                Intrinsics.h("cameraViewModelFactory");
                throw null;
            case 9:
                kl5 kl5Var10 = qz9.t2;
                return new oz9(qz9Var, qz9Var.o0());
            case 10:
                kl5 kl5Var11 = qz9.t2;
                return new mz9(qz9Var);
            case 11:
                kl5 kl5Var12 = qz9.t2;
                lyb0 lyb0Var = lyb0.b;
                Context contextO1 = qz9Var.o0();
                rrd rrdVar = lyb0.b.f20855a;
                synchronized (rrdVar.b) {
                    Object obj = uje.f35774a;
                    int iH = Build.VERSION.SDK_INT >= 34 ? r6.h(contextO1) : 0;
                    LinkedHashMap linkedHashMap = qkz.f28910a;
                    synchronized (linkedHashMap) {
                        try {
                            Integer numValueOf = Integer.valueOf(iH);
                            Object skzVar2 = linkedHashMap.get(numValueOf);
                            if (skzVar2 == null) {
                                skzVar2 = new skz();
                                linkedHashMap.put(numValueOf, skzVar2);
                            }
                            skzVar = (skz) skzVar2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    rrdVar.f = skzVar;
                    ig00VarC0 = (dfr) rrdVar.c;
                    b = 26;
                    if (ig00VarC0 == null) {
                        j4a j4aVar = new j4a(contextO1, null);
                        ig00 ig00Var = (ig00) rrdVar.d;
                        qbb qbbVarK0 = ro4.k0(ro4.k0(ig00Var instanceof dfr ? (dfr) ig00Var : new dfr(ig00Var), new viq(new ebz(j4aVar, (byte) 15), (byte) 13), bnk.a()), new a1d(new viq(new k9v((Object) rrdVar, (Object) j4aVar, (Object) contextO1, (byte) 11), (byte) 14), b), bnk.a());
                        rrdVar.c = qbbVarK0;
                        qbbVarK0.a(new mfr(qbbVarK0, new g2v(rrdVar), b3), bnk.a());
                        ig00VarC0 = ro4.c0(qbbVarK0);
                    }
                }
                return ro4.k0(ig00VarC0, new a1d(new hny(new peb0((byte) 29)), b), bnk.a());
            case 12:
                kl5 kl5Var13 = qz9.t2;
                m2a m2aVar = m2a.d;
                Context contextO2 = qz9Var.o0();
                return new isf0(m2aVar, new jsf0(new Size(contextO2.getResources().getDisplayMetrics().widthPixels, contextO2.getResources().getDisplayMetrics().heightPixels)), 0);
            default:
                kl5 kl5Var14 = qz9.t2;
                return (lyb0) ((ig00) qz9Var.i2.getValue()).get();
        }
    }
}
