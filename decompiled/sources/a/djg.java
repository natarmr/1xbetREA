package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/djg;", "La/iw5;", "<init>", "()V", "a/kwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class djg extends iw5 {
    public final zz2 k2 = new zz2("selected_time_filter_key");
    public final r34 l2 = new r34("start_time_key");
    public final r34 m2 = new r34("end_time_key");
    public static final /* synthetic */ iiy[] o2 = {new ez40(djg.class, "selectedTimeFilterId", "getSelectedTimeFilterId()I", 0), new ez40(djg.class, "startTime", "getStartTime()J", 0), new ez40(djg.class, "endTime", "getEndTime()J", 0)};
    public static final kwd n2 = new kwd();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-2064986552);
        final byte b = 1;
        final byte b2 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(667185849, new xdr(this) { // from class: a.cjg
            public final /* synthetic */ djg b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b2;
                y5d y5dVar = (y5d) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (b3) {
                    case 0:
                        kwd kwdVar = djg.n2;
                        y5dVar.getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            iiy[] iiyVarArr = iw5.j2;
                            this.b.R0(8, fetVar2);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        kwd kwdVar2 = djg.n2;
                        y5dVar.getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            djg djgVar = this.b;
                            int iIntValue2 = djgVar.k2.n(djgVar, djg.o2[0]).intValue();
                            fetVar2.e0(1757527189);
                            ygq0.b.getClass();
                            List<ygq0> listD = j6m0.d();
                            ArrayList arrayList = new ArrayList(r3d.q(listD, 10));
                            for (ygq0 ygq0Var : listD) {
                                String strW = rsm0.w(ipm0.i(ygq0Var), 0, fetVar2);
                                ygq0.b.getClass();
                                arrayList.add(new ejg(ygq0Var, strW, ygq0Var == j6m0.a(iIntValue2)));
                            }
                            fetVar2.r(false);
                            a4x a4xVarO0 = dyb.o0(arrayList);
                            boolean zI = fetVar2.i(djgVar);
                            Object objP = fetVar2.P();
                            if (zI || objP == ukd.f35823a) {
                                x6f x6fVar = new x6f(1, djgVar, djg.class, "onFilterSelected", "onFilterSelected(Lorg/xplatform/feed/domain/models/TimeFilter;)V", 0, (byte) 16);
                                fetVar2.o0(x6fVar);
                                objP = x6fVar;
                            }
                            iiy[] iiyVarArr2 = iw5.j2;
                            djgVar.Q0(a4xVarO0, (Function1) ((jhy) objP), fetVar2, 512);
                        } else {
                            fetVar2.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), (ugd) null, u1c.M(-1825645577, new xdr(this) { // from class: a.cjg
            public final /* synthetic */ djg b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b;
                y5d y5dVar = (y5d) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (b3) {
                    case 0:
                        kwd kwdVar = djg.n2;
                        y5dVar.getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            iiy[] iiyVarArr = iw5.j2;
                            this.b.R0(8, fetVar2);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        kwd kwdVar2 = djg.n2;
                        y5dVar.getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            djg djgVar = this.b;
                            int iIntValue2 = djgVar.k2.n(djgVar, djg.o2[0]).intValue();
                            fetVar2.e0(1757527189);
                            ygq0.b.getClass();
                            List<ygq0> listD = j6m0.d();
                            ArrayList arrayList = new ArrayList(r3d.q(listD, 10));
                            for (ygq0 ygq0Var : listD) {
                                String strW = rsm0.w(ipm0.i(ygq0Var), 0, fetVar2);
                                ygq0.b.getClass();
                                arrayList.add(new ejg(ygq0Var, strW, ygq0Var == j6m0.a(iIntValue2)));
                            }
                            fetVar2.r(false);
                            a4x a4xVarO0 = dyb.o0(arrayList);
                            boolean zI = fetVar2.i(djgVar);
                            Object objP = fetVar2.P();
                            if (zI || objP == ukd.f35823a) {
                                x6f x6fVar = new x6f(1, djgVar, djg.class, "onFilterSelected", "onFilterSelected(Lorg/xplatform/feed/domain/models/TimeFilter;)V", 0, (byte) 16);
                                fetVar2.o0(x6fVar);
                                objP = x6fVar;
                            }
                            iiy[] iiyVarArr2 = iw5.j2;
                            djgVar.Q0(a4xVarO0, (Function1) ((jhy) objP), fetVar2, 512);
                        } else {
                            fetVar2.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final void P0(ejg ejgVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(434792278);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? fetVar.g(ejgVar) : fetVar.i(ejgVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.q(o7k0.d(jm40.b, 1.0f), new rqm((vui0) new tui0(ejgVar.b, null), (pui0) null, (pvi0) new nvi0(ejgVar.c), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506), false, null, function0, null, function0, null, fetVar, ((i2 << 15) & 3670016) | ((i2 << 9) & 57344) | 6, 172);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(this, ejgVar, function0, i, (byte) 18);
        }
    }

    public final void Q0(a4x a4xVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1253181342);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(this) : fetVar.i(this) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(4.0f, 0.0f, 4.0f, 16.0f, 2);
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(a4xVar))) | ((i2 & 896) == 256 || ((i2 & 512) != 0 && fetVar.i(this))) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new sw8((Object) a4xVar, (Object) this, (Object) function1, (byte) 18);
                fetVar.o0(objP);
            }
            b8k0.e(null, null, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, 507);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(this, a4xVar, function1, i, (byte) 17);
        }
    }

    public final void R0(int i, fet fetVar) {
        fetVar.g0(-145040797);
        int i2 = i & 1;
        if (fetVar.U(i2, i2 != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarY = o7k0.y(o7k0.d(jm40Var, 1.0f), gqw0.e, 2);
            zcl zclVar = qmk.f28987a;
            wwb.i(s5x0.N(mm40VarY, 0.0f, 28.0f, 0.0f, 8.0f, 5), rsm0.w(R.string.time_filter, 0, fetVar), 0L, 0, 0L, fetVar, 0, 28);
            mbc.o(zfi0.f44303a, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), false, fetVar, 6, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(this, i, (byte) 28);
        }
    }
}
