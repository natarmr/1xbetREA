package a;

import android.app.Application;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f35987a = new LinkedHashMap();
    public static lr1 b = ir1.c;
    public static String c = "";

    public static String a(long j) {
        return b.f20507a.name() + BundleUtil.UNDERLINE_TAG + j + BundleUtil.UNDERLINE_TAG + c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n7i b(long j, hgh0 hgh0Var, Application application) {
        application.getClass();
        String strA = a(j);
        LinkedHashMap linkedHashMap = f35987a;
        n7i n7iVar = (n7i) linkedHashMap.get(strA);
        if (n7iVar != null) {
            return n7iVar;
        }
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(to0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof to0)) {
                ze3Var = null;
            }
            to0 to0Var = (to0) ze3Var;
            if (to0Var != null) {
                ehf0 ehf0Var = to0Var.f34260a;
                cad cadVar = to0Var.d;
                oeg0 oeg0Var = to0Var.v;
                uzc0 uzc0Var = to0Var.k;
                xmt xmtVar = to0Var.l;
                bnt bntVar = to0Var.m;
                j1q0 j1q0Var = to0Var.g;
                r9u r9uVar = to0Var.h;
                duj dujVar = to0Var.q;
                m1e m1eVar = to0Var.s;
                gst0 gst0Var = to0Var.e;
                ii iiVar = to0Var.A;
                u58 u58Var = to0Var.b;
                gg5 gg5Var = to0Var.c;
                s31 s31Var = to0Var.f;
                s91 s91Var = to0Var.r;
                v88 v88Var = to0Var.u;
                wsf0 wsf0Var = to0Var.i;
                iqt iqtVar = to0Var.j;
                kt2 kt2Var = to0Var.n;
                o91 o91Var = to0Var.o;
                h03 h03Var = to0Var.p;
                uyu uyuVar = to0Var.w;
                wyu wyuVar = to0Var.x;
                ctf0 ctf0Var = to0Var.y;
                ix0 ix0Var = to0Var.z;
                ntu ntuVar = to0Var.B;
                l7k l7kVar = to0Var.C;
                cyu cyuVar = to0Var.D;
                gg5 gg5Var2 = to0Var.E;
                peg0 peg0Var = to0Var.t;
                wdk0 wdk0Var = to0Var.F;
                pru pruVar = to0Var.G;
                dmt dmtVar = to0Var.H;
                poq0 poq0Var = to0Var.I;
                lrc lrcVar = to0Var.J;
                au0 au0Var = to0Var.K;
                grj grjVar = to0Var.L;
                jlx jlxVar = to0Var.M;
                pyt pytVar = to0Var.N;
                qyg0 qyg0Var = to0Var.O;
                pyg0 pyg0Var = to0Var.P;
                pmi pmiVar = to0Var.Q;
                dnt dntVar = to0Var.R;
                bzt bztVar = to0Var.S;
                wsf0 wsf0Var2 = to0Var.T;
                peg0 peg0Var2 = to0Var.U;
                ytt yttVar = to0Var.V;
                cmt cmtVar = to0Var.W;
                iiVar.getClass();
                oeg0Var.getClass();
                gst0Var.getClass();
                kt2Var.getClass();
                j1q0Var.getClass();
                r9uVar.getClass();
                o91Var.getClass();
                s91Var.getClass();
                m1eVar.getClass();
                wyuVar.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                n7i n7iVar2 = new n7i(cadVar, ehf0Var, poq0Var, peg0Var, wsf0Var, lrcVar, wsf0Var2, peg0Var2, iiVar, Long.valueOf(j), hgh0Var, u58Var, gg5Var, oeg0Var, gst0Var, uzc0Var, xmtVar, bntVar, kt2Var, s31Var, j1q0Var, dujVar, s91Var, h03Var, m1eVar, v88Var, uyuVar, wyuVar, ctf0Var, ix0Var, ntuVar, l7kVar, cyuVar, pruVar, iqtVar, dmtVar, wdk0Var, au0Var, gg5Var2, grjVar, jlxVar, pytVar, qyg0Var, pyg0Var, pmiVar, dntVar, bztVar, yttVar, cmtVar);
                linkedHashMap.put(a(j), n7iVar2);
                return n7iVar2;
            }
        }
        jf4.n(b1j.i(to0.class, "Cannot create dependency "));
        return null;
    }
}
