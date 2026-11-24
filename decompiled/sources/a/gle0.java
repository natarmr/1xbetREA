package a;

import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.CommonCode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.feed.linelive.presentation.dialogs.select_time_filter.params.SelectTimeFilterScreenParams;
import org.xplatform.rules.api.presentation.models.RuleData;

/* JADX INFO: loaded from: classes5.dex */
public class gle0 {
    public static k9h0 g(int i) {
        if (i == 322) {
            return k9h0.O1;
        }
        if (i == 323) {
            return k9h0.W1;
        }
        if (i == 501) {
            return k9h0.g1;
        }
        if (i == 888) {
            return k9h0.k1;
        }
        switch (i) {
            case 0:
                return k9h0.b;
            case 1:
                return k9h0.d;
            case 2:
                return k9h0.e;
            case 3:
                return k9h0.f;
            case 4:
                return k9h0.g;
            case 5:
                return k9h0.h;
            case 6:
                return k9h0.i;
            case 7:
                return k9h0.j;
            case 8:
                return k9h0.k;
            case 9:
                return k9h0.l;
            case 10:
                return k9h0.A;
            case 11:
                return k9h0.B;
            case 12:
                return k9h0.c;
            default:
                switch (i) {
                    case 131:
                        return k9h0.p1;
                    case 132:
                        return k9h0.q1;
                    case 133:
                        return k9h0.r1;
                    case 134:
                        return k9h0.s1;
                    case 135:
                        return k9h0.u1;
                    default:
                        switch (i) {
                            case 137:
                                return k9h0.v1;
                            case 138:
                                return k9h0.w1;
                            case 139:
                                return k9h0.x1;
                            case 140:
                                return k9h0.y1;
                            case 141:
                                return k9h0.C1;
                            case 142:
                                return k9h0.E1;
                            case 143:
                                return k9h0.F1;
                            case 144:
                                return k9h0.I1;
                            case 145:
                                return k9h0.t1;
                            case 146:
                                return k9h0.H1;
                            case 147:
                                return k9h0.G1;
                            case 148:
                                return k9h0.P1;
                            case 149:
                                return k9h0.Q1;
                            case 150:
                                return k9h0.R1;
                            case 151:
                                return k9h0.S1;
                            case 152:
                                return k9h0.U1;
                            case 153:
                                return k9h0.D1;
                            case 154:
                                return k9h0.B1;
                            case 155:
                                return k9h0.z1;
                            case 156:
                                return k9h0.A1;
                            default:
                                switch (i) {
                                    case 201:
                                        return k9h0.m;
                                    case Response.ACCEPTED /* 202 */:
                                        return k9h0.n;
                                    case 203:
                                        return k9h0.o;
                                    case 204:
                                        return k9h0.p;
                                    default:
                                        switch (i) {
                                            case 211:
                                                return k9h0.q;
                                            case 212:
                                                return k9h0.r;
                                            case 213:
                                                return k9h0.s;
                                            case 214:
                                                return k9h0.t;
                                            default:
                                                switch (i) {
                                                    case 221:
                                                        return k9h0.u;
                                                    case 222:
                                                        return k9h0.v;
                                                    case 223:
                                                        return k9h0.w;
                                                    case 224:
                                                        return k9h0.x;
                                                    case 225:
                                                        return k9h0.z;
                                                    case 226:
                                                        return k9h0.y;
                                                    case 227:
                                                        return k9h0.Z;
                                                    case 228:
                                                        return k9h0.f1;
                                                    default:
                                                        switch (i) {
                                                            case 301:
                                                                return k9h0.J1;
                                                            case 302:
                                                                return k9h0.K1;
                                                            case WarningHeader.INCOMPATIBLE_BANDWIDTH_UNITS /* 303 */:
                                                                return k9h0.L1;
                                                            case WarningHeader.MEDIA_TYPE_NOT_AVAILABLE /* 304 */:
                                                                return k9h0.M1;
                                                            case 305:
                                                                return k9h0.N1;
                                                            default:
                                                                switch (i) {
                                                                    case 1000:
                                                                        return k9h0.l1;
                                                                    case 1001:
                                                                        return k9h0.h1;
                                                                    case CommonCode.BusInterceptor.PRIVACY_CANCEL /* 1002 */:
                                                                        return k9h0.j1;
                                                                    case 1003:
                                                                        return k9h0.i1;
                                                                    case 1004:
                                                                        return k9h0.V1;
                                                                    default:
                                                                        return k9h0.b;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static void h(androidx.fragment.app.e eVar, String str, uzb0 uzb0Var) {
        uzb0Var.getClass();
        String str2 = dlk0.o2;
        if (eVar.J(str2) == null) {
            dlk0 dlk0Var = new dlk0();
            iiy[] iiyVarArr = dlk0.n2;
            dlk0Var.k2.x(dlk0Var, iiyVarArr[0], str);
            dlk0Var.l2.u(dlk0Var, iiyVarArr[1], uzb0Var);
            dlk0Var.H0(eVar, str2);
        }
    }

    public static void i(androidx.fragment.app.e eVar, SelectTimeFilterScreenParams selectTimeFilterScreenParams) {
        eVar.getClass();
        String str = d3i0.p2;
        if (eVar.J(str) == null) {
            d3i0 d3i0Var = new d3i0();
            d3i0Var.k2.J(d3i0Var, d3i0.o2[0], selectTimeFilterScreenParams);
            d3i0Var.H0(eVar, str);
        }
    }

    public void a(Fragment fragment, mm40 mm40Var, RuleData ruleData, Integer num, boolean z, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1114190694);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(fragment) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(ruleData) : fetVar.i(ruleData) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(num) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = (i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 3) & 896) | (i2 & 7168);
            int i4 = i2 << 9;
            qxw.m(fragment, ruleData, mm40Var, 0, num, z, fetVar, i3 | (29360128 & i4) | (i4 & 234881024));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(this, fragment, mm40Var, ruleData, num, z, i);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v5 a.imm, still in use, count: 2, list:
          (r8v5 a.imm) from 0x016b: MOVE (r26v0 a.imm) = (r8v5 a.imm) (LINE:364)
          (r8v5 a.imm) from 0x016f: PHI (r26v1 a.imm) = (r26v0 a.imm), (r8v5 a.imm) binds: [B:62:0x0167, B:61:0x0159] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public void b(a.y4h r30, a.c5h r31, a.x6f r32, a.fet r33, int r34) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gle0.b(a.y4h, a.c5h, a.x6f, a.fet, int):void");
    }

    public void c(final y4h y4hVar, final c5h c5hVar, fet fetVar, final int i) {
        int i2;
        yfe0 yfe0VarU;
        Function2 function2;
        fetVar.g0(1538285449);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? fetVar.g(y4hVar) : fetVar.i(y4hVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(c5hVar) : fetVar.i(c5hVar) ? 32 : 16;
        }
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pz40 pz40VarQ = gkb.Q(c5hVar.t, y4hVar, fetVar, (y4h.Y1 << 3) | ((i2 << 3) & 112), 6);
            if (((rz10) pz40VarQ.getValue()).f31337a.size() < 2) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                function2 = new Function2(this) { // from class: a.mxh0
                    public final /* synthetic */ gle0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b2 = b;
                        int i3 = i;
                        c5h c5hVar2 = c5hVar;
                        y4h y4hVar2 = y4hVar;
                        gle0 gle0Var = this.b;
                        fet fetVar2 = (fet) obj;
                        ((Integer) obj2).getClass();
                        switch (b2) {
                            case 0:
                                gle0Var.c(y4hVar2, c5hVar2, fetVar2, x8x.L(i3 | 1));
                                break;
                            default:
                                gle0Var.c(y4hVar2, c5hVar2, fetVar2, x8x.L(i3 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
                List list = ((rz10) pz40VarQ.getValue()).f31337a;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new yvh0(((qz10) it.next()).f29559a, bwh0.f3325a));
                }
                i4 i4VarR0 = dyb.r0(arrayList);
                dxh0 dxh0Var = ((rz10) pz40VarQ.getValue()).b;
                a6g a6gVar = new a6g(pz40VarQ.getValue(), rz10.class, "currentPageIndex", "getCurrentPageIndex()I", 0, (byte) 13);
                if ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(c5hVar))) {
                    z = true;
                }
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new nxh0(1, c5hVar, c5h.class, "onPageSelected", "onPageSelected(I)V", 0, (byte) 0);
                    fetVar.o0(objP);
                }
                ibc.n(mm40VarJ, i4VarR0, gxh0.f12078a, dxh0Var, false, a6gVar, (Function1) ((jhy) objP), fetVar, 384, 16);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            function2 = new Function2(this) { // from class: a.mxh0
                public final /* synthetic */ gle0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    int i3 = i;
                    c5h c5hVar2 = c5hVar;
                    y4h y4hVar2 = y4hVar;
                    gle0 gle0Var = this.b;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            gle0Var.c(y4hVar2, c5hVar2, fetVar2, x8x.L(i3 | 1));
                            break;
                        default:
                            gle0Var.c(y4hVar2, c5hVar2, fetVar2, x8x.L(i3 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public String d(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    public Object e(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean f(Method method) {
        return false;
    }
}
