package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wdx {
    public static final void A(List list, int i, v9v0 v9v0Var, tcj tcjVar) {
        int size = ((t9v0) list.get(i)).b.size();
        for (int i2 = 0; i2 < size; i2++) {
            boolean zH = up90.h(tcjVar, ((Number) ((u9v0) v9v0Var.f37054a.get(i2)).c).intValue());
            cav0 cav0Var = (cav0) ((t9v0) list.get(i)).b.get(i2);
            if (cav0Var.c != zH) {
                ((t9v0) list.get(i)).b.set(i2, cav0.a(cav0Var, zH));
            }
        }
    }

    public static final void B(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1981058191);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            f(0, fetVar, null);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), 132.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 20);
        }
    }

    public static final void C(int i, int i2, fet fetVar, mm40 mm40Var) {
        wui0 wui0Var;
        fetVar.g0(1504452588);
        int i3 = (fetVar.e(i) ? 32 : 16) | i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-1886726629);
            int i4 = 0;
            while (i4 < i) {
                mm40 mm40VarD2 = o7k0.d(jm40.b, 1.0f);
                if (i4 == 0 && i == 1) {
                    wui0Var = wui0.f39793a;
                } else if (i4 == 0) {
                    wui0Var = wui0.b;
                } else {
                    wui0Var = i4 == i + (-1) ? wui0.d : wui0.c;
                }
                g7x.n(mm40VarD2, wui0Var, fetVar, 6);
                i4++;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, i2, (byte) 13);
        }
    }

    public static final void D(Function1 function1, vdj0 vdj0Var, mm40 mm40Var, fet fetVar, int i) {
        function1.getClass();
        vdj0Var.getClass();
        fetVar.g0(-910649197);
        int i2 = i | (fetVar.i(function1) ? 4 : 2) | (fetVar.g(vdj0Var) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = wdj0.f38977a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new wvi0((byte) 24);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new uwi0(vdj0Var, function1, b);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, mm40Var, function2, null, (Function1) objP3, fetVar, ((i2 >> 3) & 112) | 390, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(function1, (hej0) vdj0Var, mm40Var, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    public static final void E(mm40 mm40Var, y5l0 y5l0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        float f;
        y5l0Var.getClass();
        function1.getClass();
        fetVar.g0(-266925975);
        int i2 = i | 6 | (fetVar.g(y5l0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            a2n a2nVar = y5l0Var.f42054a;
            v12 v12Var = y5l0Var.d;
            boolean z = a2nVar instanceof y56;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-2006972956);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                int iOrdinal = v12Var.ordinal();
                float f2 = (iOrdinal == 0 || iOrdinal == 3) ? 0.0f : 8.0f;
                int iOrdinal2 = y5l0Var.c.ordinal();
                if (iOrdinal2 == 0) {
                    f = 0.0f;
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return;
                    }
                    int iOrdinal3 = v12Var.ordinal();
                    if (iOrdinal3 == 2 || iOrdinal3 == 3) {
                        f = 8.0f;
                    } else {
                        f = 0.0f;
                    }
                }
                mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, f2, 0.0f, f, 5);
                y56 y56Var = (y56) a2nVar;
                boolean zBooleanValue = ((Boolean) fetVar.k(kr00.f18743a)).booleanValue();
                boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object objP = fetVar.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new u5l0(function1, y5l0Var, b);
                    fetVar.o0(objP);
                }
                vcc.i(mm40VarN, y56Var, zBooleanValue, (Function1) objP, null, fetVar, 0, 16);
                fetVar.r(false);
            } else {
                fetVar.e0(-2005778247);
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var2, y5l0Var, function1, i, (byte) 12);
        }
    }

    public static final void F(int i, long j, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(-787026665);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.f(j) ? 32 : 16) | (fetVar.g(str) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "CARD_BASKETBALL_QUARTER_PLAQUE");
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new ljc0((byte) 27);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarA, 16.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, jM126getWhite200d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 8.0f);
            boolean z = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new r2a0((byte) 3, j);
                fetVar.o0(objP2);
            }
            mm40 mm40VarE1 = o2e.e0(pai0.a(mm40VarN, false, (Function1) objP2), "CARD_BASKETBALL_QUARTER_PLAQUE_MARKER");
            zcl zclVar3 = qmk.b;
            zq8.a(0, fetVar, i120.Q(mm40VarE1, j, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)));
            v8q0.a(str, o2e.e0(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), "CARD_BASKETBALL_QUARTER_PLAQUE_SCORE"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, (i2 >> 6) & 14, 0, 131064);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rea((byte) 2, i, j, mm40Var, str);
        }
    }

    public static final void G(pz40 pz40Var, xk80 xk80Var, fet fetVar, int i) {
        xk80Var.getClass();
        fetVar.g0(526381039);
        int i2 = i | (fetVar.g(pz40Var) ? 4 : 2) | (fetVar.g(xk80Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40VarW, backgroundContent, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            int i3 = (i2 >> 3) & 14;
            q5x.e(xk80Var, o7k0.w(jm40Var, null, false, 3), null, null, 0, 0.0f, gqw0.j, null, false, null, null, null, null, u1c.M(-292472046, new dsw(pz40Var, (byte) 1), fetVar), fetVar, i3 | 1572912, 24576, 16316);
            fetVar.r(true);
            if (((vi60) pz40Var.getValue()).k) {
                fetVar.e0(1826440761);
                fetVar.r(false);
            } else {
                fetVar.e0(1826398477);
                n(xk80Var, fetVar, i3);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(pz40Var, xk80Var, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r7.f(r8, 0, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (a.bww.x(r7, r9, a.ro4.g0(0.0f, 0.0f, null, 7), r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(a.xcz r7, int r8, a.zje r9) {
        /*
            boolean r0 = r9 instanceof a.ej40
            if (r0 == 0) goto L13
            r0 = r9
            a.ej40 r0 = (a.ej40) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            a.ej40 r0 = new a.ej40
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2c
            a.z1x.P(r9)
            goto L9b
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r5
        L32:
            a.z1x.P(r9)
            goto L63
        L36:
            a.z1x.P(r9)
            a.mcz r9 = r7.j()
            java.util.List r9 = r9.l
            java.util.Iterator r9 = r9.iterator()
        L43:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r9.next()
            r6 = r2
            a.ncz r6 = (a.ncz) r6
            int r6 = r6.f23317a
            if (r6 != r8) goto L43
            r5 = r2
        L55:
            a.ncz r5 = (a.ncz) r5
            r9 = 0
            if (r5 != 0) goto L66
            r0.j = r4
            java.lang.Object r7 = r7.f(r8, r9, r0)
            if (r7 != r1) goto L63
            goto L9a
        L63:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L66:
            a.mcz r8 = r7.j()
            int r8 = r8.m
            a.mcz r2 = r7.j()
            int r2 = r2.m
            int r2 = -r2
            int r8 = r8 + r2
            a.mcz r2 = r7.j()
            int r2 = r2.n
            a.mcz r4 = r7.j()
            int r4 = r4.r
            int r2 = r2 - r4
            int r4 = r5.p
            int r5 = r5.q
            int r5 = r5 + r4
            if (r5 <= r2) goto L8b
            int r9 = r5 - r2
            goto L8f
        L8b:
            if (r4 >= r8) goto L8f
            int r9 = r4 - r8
        L8f:
            if (r9 == 0) goto L9e
            float r8 = (float) r9
            r0.j = r3
            java.lang.Object r7 = a.bww.y(r7, r8, r0)
            if (r7 != r1) goto L9b
        L9a:
            return r1
        L9b:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L9e:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wdx.H(a.xcz, int, a.zje):java.lang.Object");
    }

    public static final void I(SimpleDateTime simpleDateTime, Calendar calendar) {
        simpleDateTime.getClass();
        calendar.getClass();
        SimpleDate simpleDate = simpleDateTime.f47285a;
        calendar.set(1, simpleDate.f47286a);
        calendar.set(2, simpleDate.b - 1);
        calendar.set(5, simpleDate.c);
        TimeOfDay23 timeOfDay23 = simpleDateTime.b;
        calendar.set(11, timeOfDay23.f47287a);
        calendar.set(12, timeOfDay23.b);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    public static final void J(SimpleDate simpleDate, Calendar calendar) {
        simpleDate.getClass();
        calendar.getClass();
        calendar.set(1, simpleDate.f47286a);
        calendar.set(2, simpleDate.b - 1);
        calendar.set(5, simpleDate.c);
        bsr0.U(calendar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    public static final jlo0 K(o310 o310Var, List list, m9s m9sVar, aco0 aco0Var, amo0 amo0Var, ctf0 ctf0Var, boolean z) {
        boolean z2;
        String str;
        long j;
        int i;
        String str2;
        long j2;
        qek0 qek0Var = qek0.c;
        m9sVar.getClass();
        List list2 = m9sVar.n;
        List list3 = m9sVar.m;
        String str3 = m9sVar.j;
        String str4 = m9sVar.i;
        ctf0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((r010) obj).f29606a != 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() < 5) {
            return null;
        }
        int iOrdinal = o310Var.f.g.ordinal();
        if (iOrdinal == 0) {
            z2 = false;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                if (o310Var.g.g == d310.DIRE) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (!z) {
            z2 = !z2;
        }
        Long lValueOf = aco0Var != null ? Long.valueOf(aco0Var.f639a) : null;
        x510 x510Var = x510.STATISTIC;
        rlo0 rlo0Var = rlo0.f30708a;
        String str5 = "";
        if (lValueOf != null && lValueOf.longValue() == 1) {
            String str6 = "STAT_INFO" + amo0Var.name() + x510Var;
            boolean z3 = amo0Var == amo0.b;
            lc00 lc00VarB = kotlin.collections.a.b();
            sjo0 sjo0Var = sjo0.b;
            String str7 = z2 ? str4 : str3;
            if (z2) {
                list2 = list3;
            }
            String str8 = (String) CollectionsKt.firstOrNull(list2);
            if (str8 == null) {
                str8 = "";
            }
            if (kotlin.text.c.x(str8, ujn.h, false)) {
                str2 = str8;
            } else {
                if (str8.length() != 0) {
                    List list4 = u0d.f34849a;
                    if (!u0d.c(str8)) {
                        str5 = String.format(Locale.ENGLISH, StringsKt.O(str8, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str8}, 2));
                    }
                }
                str2 = str5;
            }
            int iOrdinal2 = amo0Var.ordinal();
            if (iOrdinal2 == 0) {
                j2 = kkg.f18437a;
            } else {
                if (iOrdinal2 != 1) {
                    t9f.b();
                    return null;
                }
                j2 = kkg.b;
            }
            vlo0 vlo0Var = new vlo0(sjo0Var, str7, str2, "", j2);
            lsm0 lsm0Var = ctf0Var.b;
            String strA = lsm0Var.a(R.string.lol_level, Arrays.copyOf(new Object[0], 0));
            qlo0 qlo0Var = qlo0.f28945a;
            mlo0 mlo0Var = new mlo0(strA, qek0Var, qlo0Var);
            String strA2 = lsm0Var.a(R.string.lol_minions, Arrays.copyOf(new Object[0], 0));
            olo0 olo0Var = olo0.f25466a;
            boolean z4 = z3;
            lc00VarB.add(new tlo0(vlo0Var, dyb.g0(mlo0Var, new mlo0(strA2, qek0Var, olo0Var), new mlo0(lsm0Var.a(R.string.lol_kills, Arrays.copyOf(new Object[0], 0)), qek0Var, rlo0Var), new mlo0(lsm0Var.a(R.string.lol_dead, Arrays.copyOf(new Object[0], 0)), qek0Var, rlo0Var), new mlo0(lsm0Var.a(R.string.lol_assists, Arrays.copyOf(new Object[0], 0)), qek0Var, rlo0Var))));
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r010 r010Var = (r010) it.next();
                r010Var.getClass();
                String str9 = r010Var.e;
                String upperCase = r010Var.c.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                wlo0 wlo0Var = new wlo0(str9, upperCase, new nvv(r010Var.d), lak0.c);
                mlo0 mlo0Var2 = new mlo0(String.valueOf(r010Var.b), qek0Var, qlo0Var);
                q010 q010Var = r010Var.j;
                arrayList2.add(new tlo0(wlo0Var, dyb.g0(mlo0Var2, new mlo0(String.valueOf(q010Var.d), qek0Var, olo0Var), new mlo0(String.valueOf(q010Var.f27872a), qek0Var, rlo0Var), new mlo0(String.valueOf(q010Var.b), qek0Var, rlo0Var), new mlo0(String.valueOf(q010Var.c), qek0Var, rlo0Var))));
            }
            return new jlo0(str6, cs0.f(lc00VarB, lc00VarB, arrayList2), ulo0.f35883a, z4);
        }
        x510 x510Var2 = x510.SUBJECTS;
        if (lValueOf == null || lValueOf.longValue() != 2) {
            return null;
        }
        String str10 = "STAT_INFO" + amo0Var.name() + x510Var2;
        boolean z5 = amo0Var == amo0.b;
        lc00 lc00VarB2 = kotlin.collections.a.b();
        sjo0 sjo0Var2 = sjo0.b;
        String str11 = z2 ? str4 : str3;
        if (z2) {
            list2 = list3;
        }
        String str12 = (String) CollectionsKt.firstOrNull(list2);
        if (str12 == null) {
            str12 = "";
        }
        if (kotlin.text.c.x(str12, ujn.h, false)) {
            str = str12;
        } else {
            if (str12.length() != 0) {
                List list5 = u0d.f34849a;
                if (!u0d.c(str12)) {
                    str12 = String.format(Locale.ENGLISH, StringsKt.O(str12, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str12}, 2));
                    str = str12;
                }
            }
            str = "";
        }
        int iOrdinal3 = amo0Var.ordinal();
        if (iOrdinal3 == 0) {
            j = kkg.f18437a;
        } else {
            if (iOrdinal3 != 1) {
                t9f.b();
                return null;
            }
            j = kkg.b;
        }
        lc00VarB2.add(new tlo0(new vlo0(sjo0Var2, str11, str, "", j), lak0.c));
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            r010 r010Var2 = (r010) it2.next();
            String str13 = r010Var2.e;
            String upperCase2 = r010Var2.c.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            wlo0 wlo0Var2 = new wlo0(str13, upperCase2, new nvv(r010Var2.d), lak0.c);
            List list6 = r010Var2.i;
            ArrayList arrayList4 = new ArrayList(r3d.q(list6, 10));
            Iterator it3 = list6.iterator();
            while (it3.hasNext()) {
                int i2 = (int) ((o010) it3.next()).f24399a;
                StringBuilder sb = new StringBuilder(ujn.h);
                String strE = ua80.e(i2, "sfiles/sppic1/cyber/lol/items/", ".png");
                if (strE.length() == 0) {
                    sb.setLength(0);
                } else {
                    if (StringsKt.O(strE, ujn.h, false)) {
                        i = 0;
                    } else if (kotlin.text.c.x(strE, "https://", false)) {
                        i = 0;
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0(strE, '/'));
                    }
                    sb.setLength(i);
                    sb.append(strE);
                }
                arrayList4.add(new llo0(sb.toString(), rlo0Var));
            }
            llo0 llo0Var = new llo0("", rlo0Var);
            if (arrayList4.size() < 6) {
                int size = 6 - arrayList4.size();
                ArrayList arrayList5 = new ArrayList(size);
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList5.add(llo0Var);
                }
                arrayList4 = CollectionsKt.q0(arrayList4, arrayList5);
            }
            arrayList3.add(new tlo0(wlo0Var2, dyb.o0(arrayList4)));
        }
        return new jlo0(str10, cs0.f(lc00VarB2, lc00VarB2, arrayList3), ulo0.b, z5);
    }

    public static StaticLayout M(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            ycx.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            ycx.a("invalid end value");
        }
        if (i3 < 0) {
            ycx.a("invalid maxLines value");
        }
        if (i < 0) {
            ycx.a("invalid width value");
        }
        if (i4 < 0) {
            ycx.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            builderObtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            f7.x(builderObtain, i7, i8);
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static final zg30 N(bpv bpvVar, String str, String str2) {
        Integer num = bpvVar.h;
        if (num != null && num.intValue() == 0) {
            return vg30.f37363a;
        }
        if (num != null && num.intValue() == 1) {
            return new wg30(str);
        }
        return (num != null && num.intValue() == 2) ? new xg30(str2) : yg30.f42568a;
    }

    public static final hao O(List list, xgl0 xgl0Var) {
        Object next;
        list.getClass();
        xgl0Var.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            hao haoVar = (hao) next;
            if (haoVar.e == xgl0Var.f && haoVar.b == xgl0Var.f40846a && haoVar.f12733a == xgl0Var.e && haoVar.f == xgl0Var.b && haoVar.q.f36034a == xgl0Var.g && haoVar.c == xgl0Var.h) {
                return (hao) next;
            }
        }
        next = null;
        return (hao) next;
    }

    public static final fol0 P(d0t d0tVar, String str, ArrayList arrayList, boolean z, boolean z2, String str2, boolean z3, boolean z4, boolean z5, boolean z6) {
        u3i x3iVar;
        u3i z3iVar;
        u3i v3iVar;
        int i = d0tVar.O;
        boolean z7 = arrayList.contains(Integer.valueOf(i)) && z;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, arrayList, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && arrayList.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, arrayList, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), z7 ? new y3d(y3d.g) : null, 32);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        if (z5 || z6) {
            v3iVar = new v3i(z5 ? c2i.f3624a : e2i.f7087a);
        } else {
            v3iVar = w3i.f38503a;
        }
        return new fol0(c4iVar, x3iVar, z3iVar, v3iVar);
    }

    public static final gol0 Q(d0t d0tVar, String str, ArrayList arrayList, boolean z, boolean z2, String str2, boolean z3, boolean z4, boolean z5, boolean z6) {
        u3i x3iVar;
        u3i z3iVar;
        u3i v3iVar;
        int i = d0tVar.O;
        boolean z7 = arrayList.contains(Integer.valueOf(i)) && z;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, arrayList, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && arrayList.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, arrayList, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), z7 ? new y3d(y3d.g) : null, 32);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        if (z5 || z6) {
            v3iVar = new v3i(z5 ? c2i.f3624a : e2i.f7087a);
        } else {
            v3iVar = w3i.f38503a;
        }
        return new gol0(c4iVar, x3iVar, z3iVar, v3iVar);
    }

    public static final hol0 R(d0t d0tVar, String str, ArrayList arrayList, boolean z, String str2, e4i e4iVar, boolean z2, String str3, boolean z3, String str4, boolean z4, boolean z5, boolean z6, boolean z7) {
        h4i h4iVar;
        u3i x3iVar;
        u3i z3iVar;
        u3i v3iVar;
        str2.getClass();
        str3.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, arrayList, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && arrayList.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str4, arrayList, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), arrayList.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (e4iVar != null) {
            h4iVar = e4iVar;
        } else {
            h4iVar = z3 ? g4i.f10668a : f4i.f8914a;
        }
        b4i b4iVar = new b4i(str2, h4iVar);
        if (z4) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z5) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        if (z6 || z7) {
            v3iVar = new v3i(z6 ? c2i.f3624a : e2i.f7087a);
        } else {
            v3iVar = w3i.f38503a;
        }
        return new hol0(str3, c4iVar, b4iVar, x3iVar, z3iVar, v3iVar);
    }

    public static iol0 S(d0t d0tVar, String str, ArrayList arrayList, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        u3i x3iVar;
        u3i z3iVar;
        int i = d0tVar.O;
        boolean z5 = arrayList.contains(Integer.valueOf(i)) && z;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, arrayList, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && arrayList.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, arrayList, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), z5 ? new y3d(y3d.g) : null, 32);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new iol0(c4iVar, x3iVar, z3iVar, w3i.f38503a);
    }

    public static final jol0 T(d0t d0tVar, String str, ArrayList arrayList, boolean z, boolean z2, y3d y3dVar, String str2, boolean z3, boolean z4) {
        y3d y3dVar2;
        y3d y3dVar3;
        u3i x3iVar;
        u3i z3iVar;
        int i = d0tVar.O;
        boolean z5 = arrayList.contains(Integer.valueOf(i)) && z;
        String strA = jeb.K(d0tVar.O, d0tVar.v, arrayList, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a();
        boolean z6 = z2 && arrayList.contains(Integer.valueOf(i));
        n0x n0xVar = new n0x(dtb.L(i, str, str2, arrayList, z));
        boolean z7 = z6;
        m0x m0xVar = new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6);
        if (z5) {
            y3dVar2 = new y3d(y3d.g);
            y3dVar3 = y3dVar;
        } else {
            y3dVar2 = y3dVar;
            y3dVar3 = y3dVar2;
        }
        c4i c4iVar = new c4i(strA, z7, n0xVar, m0xVar, y3dVar2, y3dVar3);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new jol0(c4iVar, x3iVar, z3iVar);
    }

    public static final String U(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((tfp0) next).f33878a, str));
        tfp0 tfp0Var = (tfp0) next;
        String str2 = tfp0Var != null ? tfp0Var.b : null;
        return str2 == null ? "" : str2;
    }

    public static final String V(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((tfp0) next).f33878a, str));
        tfp0 tfp0Var = (tfp0) next;
        String str2 = tfp0Var != null ? tfp0Var.d : null;
        return str2 == null ? "" : str2;
    }

    public static final f3w W(z7y z7yVar, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        String strA = ctf0Var.b.a(R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new f3w("", strA, pn40.c(z7yVar.g, p3u0.c), str, e3w.f7156a);
    }

    public static final f3w X(z7y z7yVar, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        hxu hxuVar = z7yVar.k;
        ivo0 ivo0Var = hxuVar.f;
        if (ivo0Var.b != 0.0d && ivo0Var.f15455a.length() > 0) {
            String strN = ohs0.n(hxuVar.f.f15455a, Separators.COLON);
            pn40 pn40Var = pn40.f27267a;
            return new f3w("", strN, pn40.c(hxuVar.f.b, p3u0.c), str, e3w.b);
        }
        i0w i0wVar = z7yVar.e;
        if (i0wVar != i0w.d && i0wVar != i0w.e) {
            return null;
        }
        String strA = ctf0Var.b.a(R.string.history_your_win_new, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var2 = pn40.f27267a;
        return new f3w("", strA, pn40.c(z7yVar.c, p3u0.c), str, e3w.b);
    }

    public static final g3w Y(z7y z7yVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        int iOrdinal = z7yVar.e.ordinal();
        if (iOrdinal != 3 && iOrdinal != 4) {
            return null;
        }
        String strA = ctf0Var.b.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new g3w(strA, pn40.c(z7yVar.f, p3u0.c));
    }

    public static final m3w Z(z7y z7yVar, ctf0 ctf0Var) {
        int i;
        long primary;
        ctf0Var.getClass();
        i0w i0wVar = z7yVar.e;
        int iOrdinal = i0wVar.ordinal();
        if (iOrdinal == 1) {
            i = R.string.accepted;
        } else if (iOrdinal == 2) {
            i = R.string.loosed;
        } else if (iOrdinal == 3) {
            i = R.string.won;
        } else {
            if (iOrdinal != 4) {
                return null;
            }
            i = R.string.paid;
        }
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(i, Arrays.copyOf(new Object[0], 0));
        int iOrdinal2 = i0wVar.ordinal();
        if (iOrdinal2 == 1) {
            pz40 pz40Var = s6t0.f31722a;
            primary = s6t0.b().f33626a.getPrimary();
        } else if (iOrdinal2 == 2) {
            pz40 pz40Var2 = s6t0.f31722a;
            primary = StaticColors.INSTANCE.m113getRed0d7_KjU();
        } else {
            if (iOrdinal2 != 3 && iOrdinal2 != 4) {
                t9f.b();
                return null;
            }
            pz40 pz40Var3 = s6t0.f31722a;
            primary = StaticColors.INSTANCE.m98getGreen0d7_KjU();
        }
        return new m3w(lsm0Var.a(R.string.promo_code_status_text, Arrays.copyOf(new Object[0], 0)), strA, primary);
    }

    public static final void a(mm40 mm40Var, String str, String str2, long j, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(1354270046);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.f(j) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            yx7 yx7Var = gqw0.k;
            xx7 xx7Var = gqw0.o;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new gne(xx7Var, (byte) 12)), yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            int i3 = i2 >> 3;
            v8q0.a(str, ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, false), j, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, ibm0.t(g1t0.d(), fetVar), fetVar, i3 & 910, 24960, 109560);
            v8q0.a(str2, null, j, null, 0L, null, null, null, 0L, null, 0L, 1, false, 1, 0, null, ibm0.t(g1t0.d(), fetVar), fetVar, ((i2 >> 6) & 14) | (i3 & 896), 28032, 102394);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qnv(mm40Var, str, str2, j, i, (byte) 4);
        }
    }

    public static final boolean a0(suk0 suk0Var) {
        return ((suk0Var instanceof ouk0) || (suk0Var instanceof nuk0)) ? false : true;
    }

    public static final void b(pz40 pz40Var, int i, fet fetVar, int i2) {
        int i3;
        long jM121getTransparent0d7_KjU;
        fetVar.g0(-1366451288);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar.g(pz40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Integer num = ((dt5) ((vi60) pz40Var.getValue()).b.get(i)).c;
            fetVar.e0(-250147493);
            pm80 pm80VarF = a8k0.F(num.intValue(), 0, fetVar);
            fetVar.r(false);
            mm40 mm40VarO = ny9.O(1.7142857f, o7k0.d(jm40.b, 1.0f), false);
            y3d y3dVar = ((dt5) ((vi60) pz40Var.getValue()).b.get(i)).b;
            if (y3dVar == null) {
                fetVar.e0(1100318131);
                jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                fetVar.r(false);
            } else {
                fetVar.e0(1100316023);
                fetVar.r(false);
                jM121getTransparent0d7_KjU = y3dVar.f41946a;
            }
            k7x.b(((dt5) ((vi60) pz40Var.getValue()).b.get(i)).f6645a.a(), null, o2e.e0(i120.Q(mm40VarO, jM121getTransparent0d7_KjU, jd8.n), "OnboardingBottomSheetBannerImage"), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pi60(pz40Var, i, i2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    public static final uj30 b0(lhg0 lhg0Var, int i, int i2, int i3, int i4, int i5, vj30 vj30Var, List list, pu90[] pu90VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        float f;
        boolean z;
        int iMax;
        int i11;
        int i12;
        int i13;
        int i14;
        List list2 = list;
        long j = i5;
        int i15 = i7 - i6;
        int[] iArr2 = new int[i15];
        int i16 = i6;
        int iMax2 = 0;
        int i17 = 0;
        boolean z2 = false;
        int i18 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i16 < i7) {
            pj30 pj30Var = (pj30) list2.get(i16);
            long j2 = j;
            mhg0 mhg0VarK = vdx.K(pj30Var);
            float fO = vdx.O(mhg0VarK);
            if (z2) {
                z2 = true;
            } else {
                wvb wvbVar = mhg0VarK != null ? mhg0VarK.c : null;
                if (wvbVar != null ? wvbVar instanceof cef : false) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (fO > 0.0f) {
                f2 += fO;
                i17++;
                i12 = i16;
            } else {
                int i19 = i3 - i18;
                pu90 pu90VarS = pu90VarArr[i16];
                if (pu90VarS == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i12 = i16;
                        i13 = i17;
                        i14 = Integer.MAX_VALUE;
                    } else {
                        i12 = i16;
                        i13 = i17;
                        i14 = i19 < 0 ? 0 : i19;
                    }
                    pu90VarS = pj30Var.S(lhg0Var.i(0, i14, i4, false));
                } else {
                    i12 = i16;
                    i13 = i17;
                }
                int iF = lhg0Var.f(pu90VarS);
                int iJ = lhg0Var.j(pu90VarS);
                iArr2[i12 - i6] = iF;
                int i20 = i19 - iF;
                if (i20 < 0) {
                    i20 = 0;
                }
                iMin = Math.min(i5, i20);
                i18 += iF + iMin;
                iMax2 = Math.max(iMax2, iJ);
                pu90VarArr[i12] = pu90VarS;
                i17 = i13;
            }
            i16 = i12 + 1;
            j = j2;
        }
        long j3 = j;
        int i21 = i17;
        boolean z3 = true;
        if (i21 == 0) {
            i18 -= iMin;
            i9 = 0;
        } else {
            long j4 = ((long) (i21 - 1)) * j3;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i18)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            int i22 = i6;
            while (i22 < i7) {
                jRound -= (long) Math.round(vdx.O(vdx.K((pj30) list2.get(i22))) * f3);
                i22++;
                j4 = j4;
            }
            long j5 = j4;
            int i23 = i6;
            int i24 = 0;
            while (i23 < i7) {
                if (pu90VarArr[i23] == null) {
                    pj30 pj30Var2 = (pj30) list2.get(i23);
                    mhg0 mhg0VarK2 = vdx.K(pj30Var2);
                    float fO2 = vdx.O(mhg0VarK2);
                    if (fO2 <= 0.0f) {
                        vcx.b("All weights <= 0 should have placeables");
                    }
                    i10 = i23;
                    int iSignum = Long.signum(jRound);
                    f = f3;
                    jRound -= (long) iSignum;
                    int iMax3 = Math.max(0, Math.round(f * fO2) + iSignum);
                    z = z3;
                    pu90 pu90VarS2 = pj30Var2.S(lhg0Var.i((!(mhg0VarK2 != null ? mhg0VarK2.b : z3) || iMax3 == Integer.MAX_VALUE) ? 0 : iMax3, iMax3, i4, z));
                    int iF2 = lhg0Var.f(pu90VarS2);
                    int iJ2 = lhg0Var.j(pu90VarS2);
                    iArr2[i10 - i6] = iF2;
                    i24 += iF2;
                    int iMax4 = Math.max(iMax2, iJ2);
                    pu90VarArr[i10] = pu90VarS2;
                    iMax2 = iMax4;
                } else {
                    i10 = i23;
                    f = f3;
                    z = z3;
                }
                list2 = list;
                z3 = z;
                i23 = i10 + 1;
                f3 = f;
            }
            i9 = (int) (((long) i24) + j5);
            int i25 = i3 - i18;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i25) {
                i9 = i25;
            }
        }
        if (z2) {
            int iMax5 = 0;
            iMax = 0;
            for (int i26 = i6; i26 < i7; i26++) {
                pu90 pu90Var = pu90VarArr[i26];
                pu90Var.getClass();
                Object objN = pu90Var.n();
                mhg0 mhg0Var = objN instanceof mhg0 ? (mhg0) objN : null;
                wvb wvbVar2 = mhg0Var != null ? mhg0Var.c : null;
                Integer numM = wvbVar2 != null ? wvbVar2.M(pu90Var) : null;
                if (numM != null) {
                    int iIntValue = numM.intValue();
                    int iJ3 = lhg0Var.j(pu90Var);
                    iMax5 = Math.max(iMax5, iIntValue != Integer.MIN_VALUE ? numM.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iJ3;
                    }
                    iMax = Math.max(iMax, iJ3 - iIntValue);
                }
            }
            i11 = iMax5;
        } else {
            iMax = 0;
            i11 = 0;
        }
        int i27 = i18 + i9;
        int iMax6 = Math.max(i27 < 0 ? 0 : i27, i);
        int iMax7 = Math.max(iMax2, Math.max(i2, iMax + i11));
        int[] iArr3 = new int[i15];
        lhg0Var.g(iMax6, iArr2, iArr3, vj30Var);
        return lhg0Var.h(pu90VarArr, vj30Var, i11, iArr3, iMax6, iMax7, iArr, i8, i6, i7);
    }

    public static final void c(a4x a4xVar, fet fetVar, int i) {
        float f;
        mm40 mm40Var;
        fetVar.g0(-346730154);
        int i2 = (fetVar.i(a4xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            float f2 = 1.0f;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 6.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.j, fetVar, 6);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 28.0f), 38.0f);
            fetVar.e0(-771137316);
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                eba ebaVar = (eba) it.next();
                if (ebaVar != null) {
                    if (ebaVar instanceof dba) {
                        fetVar.e0(771532304);
                        f = f2;
                        mm40Var = mm40VarE;
                        j0x.b(a8k0.F(R.drawable.card_cricket_progress_empty_card_ic, 0, fetVar), null, o2e.e0(mm40VarE, "CARD_BASKETBALL_QUARTER_EMPTY_CELL"), null, null, 0.0f, null, fetVar, 56, 120);
                        fetVar.r(false);
                    } else {
                        f = f2;
                        mm40Var = mm40VarE;
                        if (ebaVar instanceof cba) {
                            fetVar.e0(771915526);
                            cba cbaVar = (cba) ebaVar;
                            float f3 = cbaVar.b;
                            j0x.a(jpm0.t(cbaVar.f4052a, 6, fetVar), o2e.e0(mm40Var, f3 == f ? "CARD_BASKETBALL_QUARTER_CARD" : "CARD_BASKETBALL_QUARTER_DIMMED_CARD"), f3, fetVar, 88);
                            fetVar.r(false);
                        }
                    }
                    mm40VarE = mm40Var;
                    f2 = f;
                }
                throw b1j.f(-806398061, fetVar, false);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar, i, (byte) 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02c1 A[PHI: r14 r15
  0x02c1: PHI (r14v4 java.util.List) = (r14v3 java.util.List), (r14v5 java.util.List) binds: [B:103:0x0275, B:116:0x02bf] A[DONT_GENERATE, DONT_INLINE]
  0x02c1: PHI (r15v6 int) = (r15v5 int), (r15v7 int) binds: [B:103:0x0275, B:116:0x02bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x02c5 A[LOOP:3: B:102:0x0267->B:119:0x02c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:181:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:186:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:190:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:193:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:195:0x03fa A[LOOP:5: B:194:0x03f8->B:195:0x03fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x043c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0452  */
    /* JADX WARN: Code duplicated, block: B:233:0x02cd A[EDGE_INSN: B:233:0x02cd->B:121:0x02cd BREAK  A[LOOP:3: B:102:0x0267->B:119:0x02c5], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:195:0x03fa, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r41v0, types: [android.view.ViewStructure] */
    public static final void c0(ViewStructure viewStructure, e7z e7zVar, AutofillId autofillId, String str, oge0 oge0Var) {
        ?? r38;
        long j;
        long j2;
        char c;
        long j3;
        boolean zBooleanValue;
        jy2 jy2Var;
        j83 j83Var;
        ez2 ez2Var;
        evq0 evq0Var;
        ucg0 ucg0Var;
        boolean z;
        oie oieVar;
        Boolean bool;
        boolean z2;
        Integer num;
        Object obj;
        List list;
        Integer numValueOf;
        int i;
        int i2;
        int i3;
        int i4;
        ?? r15;
        String strO;
        int size;
        String str2;
        int i5;
        String[] strArrR;
        String[] strArrR2;
        int i6;
        int i7;
        int i8;
        boolean z3;
        jy2 jy2Var2;
        evq0 evq0Var2;
        j83 j83Var2;
        ez2 ez2Var2;
        ucg0 ucg0Var2;
        boolean z4;
        zai0 zai0Var = xai0.f40557a;
        zai0 zai0Var2 = mai0.f21459a;
        nai0 nai0VarX = e7zVar.x();
        boolean z5 = true;
        if (nai0VarX != null) {
            hz40 hz40Var = nai0VarX.f23193a;
            j = 128;
            Object[] objArr = hz40Var.b;
            Object[] objArr2 = hz40Var.c;
            long[] jArr = hz40Var.f13891a;
            j2 = 255;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i9 = 0;
                jy2Var2 = null;
                z = false;
                evq0Var2 = null;
                j83Var2 = null;
                ez2Var2 = null;
                oieVar = null;
                bool = null;
                ucg0Var2 = null;
                z2 = false;
                num = null;
                obj = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i9];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j4 & 255) < 128) {
                                int i12 = (i9 << 3) + i11;
                                Object obj2 = objArr[i12];
                                Object obj3 = objArr2[i12];
                                zai0 zai0Var3 = (zai0) obj2;
                                if (Intrinsics.d(zai0Var3, xai0.s)) {
                                    obj3.getClass();
                                    jy2Var2 = (jy2) obj3;
                                } else if (Intrinsics.d(zai0Var3, xai0.f40557a)) {
                                    obj3.getClass();
                                    String str3 = (String) CollectionsKt.firstOrNull((List) obj3);
                                    if (str3 != null) {
                                        viewStructure.setContentDescription(str3);
                                    }
                                } else if (Intrinsics.d(zai0Var3, xai0.r)) {
                                    obj3.getClass();
                                    oieVar = (oie) obj3;
                                } else if (Intrinsics.d(zai0Var3, xai0.t)) {
                                    obj3.getClass();
                                    ez2Var2 = (ez2) obj3;
                                } else if (Intrinsics.d(zai0Var3, xai0.G)) {
                                    obj3.getClass();
                                    j83Var2 = (j83) obj3;
                                } else if (Intrinsics.d(zai0Var3, xai0.l)) {
                                    obj3.getClass();
                                    viewStructure.setFocused(((Boolean) obj3).booleanValue());
                                } else if (Intrinsics.d(zai0Var3, xai0.R)) {
                                    obj3.getClass();
                                    num = (Integer) obj3;
                                } else if (Intrinsics.d(zai0Var3, xai0.N)) {
                                    z2 = z5;
                                } else if (Intrinsics.d(zai0Var3, xai0.o)) {
                                    obj3.getClass();
                                    zBooleanValue = ((Boolean) obj3).booleanValue();
                                } else if (Intrinsics.d(zai0Var3, xai0.z)) {
                                    obj3.getClass();
                                    ucg0Var2 = (ucg0) obj3;
                                } else if (Intrinsics.d(zai0Var3, xai0.K)) {
                                    obj3.getClass();
                                    bool = (Boolean) obj3;
                                } else if (Intrinsics.d(zai0Var3, xai0.L)) {
                                    obj3.getClass();
                                    evq0Var2 = (evq0) obj3;
                                } else if (Intrinsics.d(zai0Var3, mai0.b)) {
                                    viewStructure.setClickable(z5);
                                } else if (Intrinsics.d(zai0Var3, mai0.c)) {
                                    viewStructure.setLongClickable(z5);
                                } else if (Intrinsics.d(zai0Var3, mai0.w)) {
                                    viewStructure.setFocusable(z5);
                                } else if (Intrinsics.d(zai0Var3, mai0.k)) {
                                    z = z5;
                                }
                                z4 = z5;
                                if (Build.VERSION.SDK_INT >= 34 && Intrinsics.d(zai0Var3, epv0.n)) {
                                    obj = obj3;
                                }
                            } else {
                                z4 = z5;
                            }
                            j4 >>= 8;
                            i11++;
                            z5 = z4;
                        }
                        z3 = z5;
                        z3 = z3;
                        if (i10 != 8) {
                            break;
                        }
                    } else {
                        z3 = z5 ? 1 : 0;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                    z5 = z3 ? 1 : 0;
                }
            } else {
                z3 = true;
                c = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                jy2Var2 = null;
                z = false;
                evq0Var2 = null;
                j83Var2 = null;
                ez2Var2 = null;
                oieVar = null;
                bool = null;
                ucg0Var2 = null;
                z2 = false;
                num = null;
                obj = null;
            }
            jy2Var = jy2Var2;
            evq0Var = evq0Var2;
            j83Var = j83Var2;
            ez2Var = ez2Var2;
            ucg0Var = ucg0Var2;
            r38 = z3;
        } else {
            r38 = 1;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            jy2Var = null;
            j83Var = null;
            ez2Var = null;
            evq0Var = null;
            ucg0Var = null;
            z = false;
            oieVar = null;
            bool = null;
            z2 = false;
            num = null;
            obj = null;
        }
        nai0 nai0VarX2 = e7zVar.x();
        if (nai0VarX2 != null && nai0VarX2.c && !nai0VarX2.d) {
            nai0 nai0Var = new nai0();
            nai0Var.c = nai0VarX2.c;
            nai0Var.d = nai0VarX2.d;
            nai0Var.f23193a.k(nai0VarX2.f23193a);
            vy40 vy40Var = new vy40(((xz40) ((ty40) e7zVar.o()).b).c);
            vy40Var.c(e7zVar.o());
            while (vy40Var.j()) {
                e7z e7zVar2 = (e7z) vy40Var.l(vy40Var.b - 1);
                nai0 nai0VarX3 = e7zVar2.x();
                if (nai0VarX3 != null && !nai0VarX3.c) {
                    nai0Var.e(nai0VarX3);
                    if (!nai0VarX3.d) {
                        vy40Var.c(e7zVar2.o());
                    }
                }
            }
            nai0VarX2 = nai0Var;
        }
        if (nai0VarX2 != null) {
            hz40 hz40Var2 = nai0VarX2.f23193a;
            Object[] objArr3 = hz40Var2.b;
            Object[] objArr4 = hz40Var2.c;
            long[] jArr2 = hz40Var2.f13891a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i13 = 8;
                list = null;
                int i14 = 0;
                while (true) {
                    long j5 = jArr2[i14];
                    long[] jArr3 = jArr2;
                    Object[] objArr5 = objArr3;
                    if ((((~j5) << c) & j5 & j3) == j3) {
                        i6 = i14;
                        if (i6 != length2) {
                            break;
                            break;
                        } else {
                            i14 = i6 + 1;
                            objArr3 = objArr5;
                            jArr2 = jArr3;
                        }
                    } else {
                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j5 & j2) < j) {
                                int i17 = (i14 << 3) + i16;
                                Object obj4 = objArr5[i17];
                                Object obj5 = objArr4[i17];
                                i8 = i13;
                                zai0 zai0Var4 = (zai0) obj4;
                                i7 = i16;
                                if (Intrinsics.d(zai0Var4, xai0.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (Intrinsics.d(zai0Var4, xai0.C)) {
                                    obj5.getClass();
                                    list = (List) obj5;
                                }
                            } else {
                                i7 = i16;
                                i8 = i13;
                            }
                            j5 >>= i8;
                            i16 = i7 + 1;
                            i13 = i8;
                        }
                        if (i15 != i13) {
                            break;
                        }
                        i6 = i14;
                        if (i6 != length2) {
                            break;
                        }
                        i14 = i6 + 1;
                        objArr3 = objArr5;
                        jArr2 = jArr3;
                    }
                }
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        Integer numValueOf2 = Integer.valueOf(e7zVar.b);
        if (e7zVar.v() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (jy2Var != null) {
            numValueOf = Integer.valueOf(jy2Var.f17338a);
        } else if (z) {
            numValueOf = Integer.valueOf((int) r38);
        } else {
            numValueOf = evq0Var != null ? 2 : null;
        }
        if (numValueOf != null) {
            viewStructure.setAutofillType(numValueOf.intValue());
        }
        if (j83Var != null) {
            viewStructure.setAutofillValue(AutofillValue.forText(zgc.T(j83Var.b)));
        }
        if (ez2Var != null) {
            viewStructure.setAutofillValue(ez2Var.f8652a);
        }
        if (oieVar != null && (strArrR2 = slb.R(oieVar)) != null) {
            viewStructure.setAutofillHints(strArrR2);
        }
        e7z e7zVar3 = (e7z) oge0Var.f25215a.b(e7zVar.b);
        if (e7zVar3 == null || e7zVar3.g == -4) {
            i = 0;
        } else {
            zz2 zz2Var = oge0Var.c;
            int iD = oge0Var.d(e7zVar3);
            long[] jArr4 = (long[]) zz2Var.b;
            long j6 = jArr4[iD];
            long j7 = jArr4[iD + 1];
            int i18 = (int) (j6 >> 32);
            int i19 = (int) j6;
            i = 0;
            viewStructure.setDimens(i18, i19, 0, 0, ((int) (j7 >> 32)) - i18, ((int) j7) - i19);
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (evq0Var != null) {
            viewStructure.setCheckable(r38);
            viewStructure.setChecked(evq0Var == evq0.f8484a ? 1 : i);
        } else if (bool != null && (ucg0Var == null || ucg0Var.f35427a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        oie.f25306a.getClass();
        String str4 = (String) tx3.A(slb.R(mie.c));
        if (oieVar != null && (strArrR = slb.R(oieVar)) != null) {
            boolean zU = tx3.u(str4, strArrR);
            i2 = 1;
            if (zU) {
                i3 = 1;
            }
            if (z2 && i3 == 0) {
                i4 = i;
            } else {
                i4 = i2;
            }
            if (i4 == 0 || zBooleanValue) {
                r15 = i2;
            } else {
                r15 = i;
            }
            viewStructure.setDataIsSensitive(r15);
            viewStructure.setVisibility(((s460) e7zVar.h1.e).p1() ? 4 : i);
            if (list != null) {
                size = list.size();
                str2 = "";
                for (i5 = i; i5 < size; i5++) {
                    str2 = ((Object) str2) + ((j83) list.get(i5)).b + Separators.RETURN;
                }
                viewStructure.setText(str2);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((ty40) e7zVar.o()).isEmpty() && ucg0Var != null && (strO = x1x.O(ucg0Var.f35427a)) != null) {
                viewStructure.setClassName(strO);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (i4 != 0) {
                    viewStructure.setInputType(129);
                }
            }
            if (Build.VERSION.SDK_INT >= 35 || obj == null) {
            }
            hny.b();
            return;
        }
        i2 = 1;
        i3 = i;
        if (z2) {
            i4 = i2;
        } else {
            i4 = i2;
        }
        if (i4 == 0) {
            r15 = i2;
        } else {
            r15 = i2;
        }
        viewStructure.setDataIsSensitive(r15);
        viewStructure.setVisibility(((s460) e7zVar.h1.e).p1() ? 4 : i);
        if (list != null) {
            size = list.size();
            str2 = "";
            while (i5 < size) {
                str2 = ((Object) str2) + ((j83) list.get(i5)).b + Separators.RETURN;
            }
            viewStructure.setText(str2);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((ty40) e7zVar.o()).isEmpty()) {
            viewStructure.setClassName(strO);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (i4 != 0) {
                viewStructure.setInputType(129);
            }
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static final void d(final pz40 pz40Var, final xk80 xk80Var, final int i, final String str, final Function1 function1, fet fetVar, int i2) {
        xk80 xk80Var2;
        fet fetVar2 = fetVar;
        xk80Var.getClass();
        str.getClass();
        function1.getClass();
        fetVar2.g0(2044600685);
        int i3 = (fetVar2.i(function1) ? 16384 : 8192) | i2 | (fetVar2.g(pz40Var) ? 4 : 2) | (fetVar2.g(xk80Var) ? 32 : 16) | (fetVar2.e(i) ? 256 : 128) | (fetVar2.g(str) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP);
            }
            final vne vneVar = (vne) objP;
            boolean zE = fetVar2.e(xk80Var.k()) | fetVar2.e(xk80Var.n());
            Object objP2 = fetVar2.P();
            if (zE || objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(xk80Var.k() + 1 == xk80Var.n() ? ((vi60) pz40Var.getValue()).g : ((vi60) pz40Var.getValue()).f);
                fetVar2.o0(objP2);
            }
            final pz40 pz40Var2 = (pz40) objP2;
            boolean zE2 = fetVar2.e(xk80Var.k()) | fetVar2.e(xk80Var.n());
            Object objP3 = fetVar2.P();
            if (zE2 || objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(xk80Var.k() + 1 < xk80Var.n() ? ((vi60) pz40Var.getValue()).h : "");
                fetVar2.o0(objP3);
            }
            final pz40 pz40Var3 = (pz40) objP3;
            boolean zG = fetVar2.g(pz40Var2) | ((i3 & 112) == 32) | ((i3 & 14) == 4) | fetVar2.g(pz40Var3) | ((57344 & i3) == 16384) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objP4 = fetVar2.P();
            if (zG || objP4 == cl5Var) {
                Function0 function0 = new Function0() { // from class: a.qi60
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        xk80 xk80Var3 = xk80Var;
                        int iK = xk80Var3.k() + 1;
                        int iN = xk80Var3.n();
                        pz40 pz40Var4 = pz40Var;
                        pz40Var2.setValue(iK == iN ? ((vi60) pz40Var4.getValue()).g : ((vi60) pz40Var4.getValue()).f);
                        pz40Var3.setValue(xk80Var3.k() + 1 < xk80Var3.n() ? ((vi60) pz40Var4.getValue()).h : "");
                        function1.invoke(new di60(i, xk80Var3.k(), xk80Var3.n(), str));
                        return Unit.f46060a;
                    }
                };
                xk80Var2 = xk80Var;
                fetVar2.o0(function0);
                objP4 = function0;
            } else {
                xk80Var2 = xk80Var;
            }
            i(xk80Var2, (Function0) objP4, fetVar2, (i3 >> 3) & 14);
            mm40 mm40VarA0 = wha0.a0(cjx.V(o7k0.d(jm40.b, 1.0f), x0x.a0(fetVar2), null), wha0.T(fetVar2), false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 16.0f, 0L, fetVar2, 0, 5);
            if (((vi60) pz40Var.getValue()).k) {
                fetVar2.e0(-1558182702);
                boolean zE3 = fetVar2.e(xk80Var2.k()) | fetVar2.e(xk80Var2.n());
                Object objP5 = fetVar2.P();
                if (zE3 || objP5 == cl5Var) {
                    final byte b = 0;
                    final xk80 xk80Var3 = xk80Var2;
                    Function0 function2 = new Function0() { // from class: a.ri60
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b2 = b;
                            String str2 = str;
                            int i4 = i;
                            Function1 function3 = function1;
                            vne vneVar2 = vneVar;
                            xk80 xk80Var4 = xk80Var3;
                            switch (b2) {
                                case 0:
                                    if (xk80Var4.k() + 1 < xk80Var4.n()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var4, null, (byte) 0), 3);
                                    }
                                    function3.invoke(new bi60(i4, xk80Var4.k(), xk80Var4.n(), str2));
                                    break;
                                default:
                                    if (xk80Var4.k() + 1 < xk80Var4.n()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var4, null, (byte) 1), 3);
                                    }
                                    function3.invoke(new bi60(i4, xk80Var4.k(), xk80Var4.n(), str2));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(function2);
                    objP5 = function2;
                }
                Function0 function3 = (Function0) objP5;
                boolean zG2 = fetVar2.g((String) pz40Var2.getValue());
                Object objP6 = fetVar2.P();
                if (zG2 || objP6 == cl5Var) {
                    objP6 = new wul(lul.e, oe9.f25112a, new ue9((String) pz40Var2.getValue()), true, false, false);
                    fetVar2.o0(objP6);
                }
                ckb.i(null, vul.b, (wul) objP6, 0L, function3, fetVar, 48, 9);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1556689153);
                boolean zE4 = fetVar2.e(xk80Var.k()) | fetVar2.e(xk80Var.n());
                Object objP7 = fetVar2.P();
                if (zE4 || objP7 == cl5Var) {
                    vk8 vk8Var = new vk8(function1, i, xk80Var, str, (byte) 5);
                    fetVar2.o0(vk8Var);
                    objP7 = vk8Var;
                }
                Function0 function4 = (Function0) objP7;
                boolean zE5 = fetVar2.e(xk80Var.k()) | fetVar2.e(xk80Var.n());
                Object objP8 = fetVar2.P();
                if (zE5 || objP8 == cl5Var) {
                    final byte b2 = 1;
                    Function0 function5 = new Function0() { // from class: a.ri60
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b3 = b2;
                            String str2 = str;
                            int i4 = i;
                            Function1 function6 = function1;
                            vne vneVar2 = vneVar;
                            xk80 xk80Var4 = xk80Var;
                            switch (b3) {
                                case 0:
                                    if (xk80Var4.k() + 1 < xk80Var4.n()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var4, null, (byte) 0), 3);
                                    }
                                    function6.invoke(new bi60(i4, xk80Var4.k(), xk80Var4.n(), str2));
                                    break;
                                default:
                                    if (xk80Var4.k() + 1 < xk80Var4.n()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var4, null, (byte) 1), 3);
                                    }
                                    function6.invoke(new bi60(i4, xk80Var4.k(), xk80Var4.n(), str2));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(function5);
                    objP8 = function5;
                }
                Function0 function6 = (Function0) objP8;
                boolean zG3 = fetVar2.g((String) pz40Var3.getValue());
                Object objP9 = fetVar2.P();
                if (zG3 || objP9 == cl5Var) {
                    objP9 = new wul(qul.e, oe9.f25112a, new ue9((String) pz40Var3.getValue()), ((CharSequence) pz40Var3.getValue()).length() > 0, false, true);
                    fetVar2.o0(objP9);
                }
                wul wulVar = (wul) objP9;
                boolean zG4 = fetVar2.g((String) pz40Var2.getValue());
                Object objP10 = fetVar2.P();
                if (zG4 || objP10 == cl5Var) {
                    objP10 = new wul(lul.e, oe9.f25112a, new ue9((String) pz40Var2.getValue()), true, false, false);
                    fetVar2.o0(objP10);
                }
                gkb.i(null, vul.b, wulVar, (wul) objP10, 0L, function4, function6, fetVar2, 48, 17);
                fetVar2.r(false);
            }
            wvb.o(null, 12.0f, 0L, fetVar2, 0, 5);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho(pz40Var, xk80Var, i, str, function1, i2, (byte) 22);
        }
    }

    public static final Calendar d0(SimpleDate simpleDate, Locale locale) {
        simpleDate.getClass();
        Calendar calendar = Calendar.getInstance(locale);
        calendar.set(1, simpleDate.f47286a);
        calendar.set(2, simpleDate.b - 1);
        calendar.set(5, simpleDate.c);
        bsr0.U(calendar);
        return calendar;
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        String str2;
        fetVar.g0(-1396188815);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            v8q0.a(str2, mm40Var, 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, ibm0.l(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 24960, 109564);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str2, i, (byte) 17);
        }
    }

    public static final long e0(SimpleDateTime simpleDateTime, Calendar calendar) {
        simpleDateTime.getClass();
        calendar.getClass();
        I(simpleDateTime, calendar);
        return calendar.getTimeInMillis();
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1391075134);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 36.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarD2 = o7k0.d(o7k0.s(o7k0.e(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 14.0f), 160.0f), 1.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD2), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 23);
        }
    }

    public static final long f0(SimpleDate simpleDate, Calendar calendar) {
        simpleDate.getClass();
        calendar.getClass();
        J(simpleDate, calendar);
        return calendar.getTimeInMillis();
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        int i2;
        l7m0Var.getClass();
        fetVar.g0(-571757059);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(l7m0Var) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ufp(l7m0Var, (byte) 9);
                fetVar.o0(objP);
            }
            p8a.k(mm40Var, (Function1) objP, fetVar, i3 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new udx(mm40Var, l7m0Var, i, b);
        }
    }

    public static final aq30 g0(bpv bpvVar, List list) {
        Object next;
        Object next2;
        fe30 ee30Var;
        de30 de30Var;
        List list2;
        List list3;
        bpvVar.getClass();
        String str = bpvVar.c;
        String str2 = bpvVar.b;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((ppv) next).f27389a, str2));
        ppv ppvVar = (ppv) next;
        npv npvVar = (ppvVar == null || (list3 = ppvVar.d) == null) ? null : (npv) CollectionsKt.firstOrNull(list3);
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.d(((ppv) next2).f27389a, str));
        ppv ppvVar2 = (ppv) next2;
        npv npvVar2 = (ppvVar2 == null || (list2 = ppvVar2.d) == null) ? null : (npv) CollectionsKt.firstOrNull(list2);
        String str3 = bpvVar.f3002a;
        Integer num = bpvVar.e;
        if (str3 == null) {
            str3 = "";
        }
        Long l = bpvVar.g;
        long jLongValue = l != null ? l.longValue() : 0L;
        String str4 = str2 == null ? "" : str2;
        String str5 = npvVar != null ? npvVar.b : null;
        if (str5 == null) {
            str5 = "";
        }
        String strT = vsm0.t(str5);
        String str6 = npvVar != null ? npvVar.f23929a : null;
        if (str6 == null) {
            str6 = "";
        }
        zp30 zp30Var = new zp30(str4, strT, str6);
        long j = jLongValue;
        String str7 = str == null ? "" : str;
        String str8 = npvVar2 != null ? npvVar2.b : null;
        if (str8 == null) {
            str8 = "";
        }
        String strT2 = vsm0.t(str8);
        String str9 = npvVar2 != null ? npvVar2.f23929a : null;
        if (str9 == null) {
            str9 = "";
        }
        zp30 zp30Var2 = new zp30(str7, strT2, str9);
        if (!Intrinsics.d(bpvVar.f, Boolean.TRUE)) {
            Integer num2 = bpvVar.d;
            if (num2 == null && num == null) {
                if (str2 == null) {
                    str2 = "";
                }
                if (str == null) {
                    str = "";
                }
                de30Var = new de30(N(bpvVar, str2, str));
            } else {
                int iIntValue = num2 != null ? num2.intValue() : 0;
                int iIntValue2 = num != null ? num.intValue() : 0;
                if (str2 == null) {
                    str2 = "";
                }
                if (str == null) {
                    str = "";
                }
                ee30Var = new ee30(iIntValue, iIntValue2, N(bpvVar, str2, str));
            }
            return new aq30(str3, j, zp30Var, zp30Var2, ee30Var);
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        de30Var = new de30(N(bpvVar, str2, str));
        ee30Var = de30Var;
        return new aq30(str3, j, zp30Var, zp30Var2, ee30Var);
    }

    public static final void h(String str, buy buyVar, ugd ugdVar, fet fetVar, int i) {
        xdr xdrVar;
        fet fetVar2;
        jm40 jm40Var;
        fetVar.g0(-1989187584);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(buyVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.x;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (buyVar instanceof zty) {
                fetVar.e0(-1743919833);
                mm40 mm40VarK0 = mrv.k0(jm40Var2, "labelText");
                zcl zclVar = qmk.f28987a;
                jm40Var = jm40Var2;
                v8q0.a(str, s5x0.N(mm40VarK0, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar), fetVar, i2 & 14, 24960, 110588);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar.e0(-1743529016);
                mm40 mm40VarK1 = mrv.k0(jm40Var, "labelText");
                zcl zclVar2 = qmk.f28987a;
                v8q0.a(str, s5x0.N(mm40VarK1, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar), fetVar, i2 & 14, 24960, 110588);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            xdrVar = ugdVar;
            xdrVar.F(mrv.k0(jm40Var, "rightPart"), fetVar2, 54);
            fetVar2.r(true);
        } else {
            xdrVar = ugdVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(str, buyVar, xdrVar, i, (byte) 20);
        }
    }

    public static final dxh0 h0(zvh0 zvh0Var) {
        int iOrdinal = zvh0Var.ordinal();
        if (iOrdinal == 0) {
            return axh0.f1625a;
        }
        if (iOrdinal == 1) {
            return zwh0.f45106a;
        }
        if (iOrdinal == 2) {
            return cxh0.f5122a;
        }
        if (iOrdinal == 3) {
            return bxh0.f3376a;
        }
        t9f.b();
        return null;
    }

    public static final void i(xk80 xk80Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(320108811);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(xk80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xo50(xk80Var, function0, null, b);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, xk80Var, (Function2) objP);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(xk80Var, function0, i, (byte) 23);
        }
    }

    public static final m0k0 i0(l9s l9sVar, boolean z) {
        jts jtsVar;
        jts jtsVar2;
        long jC = l9sVar.c();
        String strN = l9sVar.N();
        Long l = (Long) CollectionsKt.firstOrNull(l9sVar.p());
        long jLongValue = l != null ? l.longValue() : 0L;
        String strJ = l9sVar.j();
        String str = (String) CollectionsKt.firstOrNull(l9sVar.G());
        if (str == null) {
            str = "";
        }
        String str2 = (String) CollectionsKt.W(1, l9sVar.G());
        if (str2 == null) {
            str2 = "";
        }
        Long l2 = (Long) CollectionsKt.firstOrNull(l9sVar.m());
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        String strG = l9sVar.g();
        String str3 = (String) CollectionsKt.firstOrNull(l9sVar.v());
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) CollectionsKt.W(1, l9sVar.v());
        if (str4 == null) {
            str4 = "";
        }
        int iMax = Math.max(l9sVar.p().size(), l9sVar.m().size());
        pqs pqsVarZ = l9sVar.z();
        String str5 = null;
        String str6 = pqsVarZ != null ? pqsVarZ.b : null;
        if (str6 == null) {
            str6 = "";
        }
        String strO = l9sVar.o();
        String strM = l9sVar.M();
        String strL = l9sVar.L();
        long jA = l9sVar.a();
        boolean zE = l9sVar.e();
        long jU = l9sVar.u();
        long jB = l9sVar.b();
        boolean zE2 = l9sVar.E();
        long jD = l9sVar.d();
        long jA2 = l9sVar.a();
        String strI = l9sVar.i();
        pqs pqsVarZ2 = l9sVar.z();
        int i = pqsVarZ2 != null ? pqsVarZ2.f : -1;
        pqs pqsVarZ3 = l9sVar.z();
        int i2 = pqsVarZ3 != null ? pqsVarZ3.g : -1;
        pqs pqsVarZ4 = l9sVar.z();
        String str7 = (pqsVarZ4 == null || (jtsVar2 = pqsVarZ4.i) == null) ? null : jtsVar2.f17115a;
        String str8 = str7 == null ? "" : str7;
        pqs pqsVarZ5 = l9sVar.z();
        if (pqsVarZ5 != null && (jtsVar = pqsVarZ5.i) != null) {
            str5 = jtsVar.b;
        }
        return new m0k0(jC, strN, jLongValue, strJ, str, str2, jLongValue2, strG, str3, str4, iMax, str6, i, i2, str8, str5 != null ? str5 : "", 0, 0, strO, strM, "", strL, jA, zE, jU, jB, zE2, jD, jA2, strI, z, false, l9sVar.A() != boh.UNKNOWN);
    }

    public static final void j(ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(-709502251);
        byte b = 1;
        byte b2 = 14;
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            zfn zfnVar = hzg0.f13904a;
            fzg0 fzg0Var = (fzg0) fetVar.k(zfnVar);
            czg0 czg0VarC = r7x.C(fetVar);
            Object[] objArr = {fzg0Var};
            v0h0 v0h0Var = new v0h0(new okw(fzg0Var, czg0VarC, (byte) 21), new hvy(b2));
            boolean zI = fetVar.i(fzg0Var) | fetVar.i(czg0VarC);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new mbz(fzg0Var, czg0VarC, b);
                fetVar.o0(objP);
            }
            ldz ldzVar = (ldz) e9x.R(objArr, v0h0Var, (Function0) objP, fetVar, 0);
            obc.d(zfnVar.a(ldzVar), u1c.M(-412824043, new r7y(ugdVar, ldzVar, (byte) 12), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w(ugdVar, i, b2);
        }
    }

    public static final w2w0 j0(Calendar calendar) {
        calendar.getClass();
        return new w2w0(calendar.get(1), calendar.get(2));
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        String str2;
        str.getClass();
        fetVar.g0(1393367587);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.p(), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 24576, 113656);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str2, i, (byte) 19);
        }
    }

    public static final th90 k0(th90 th90Var, long j, Set set) {
        bi90 bi90Var = (bi90) th90Var.get(Long.valueOf(j));
        if (bi90Var == null) {
            bi90Var = bi90.e;
        }
        return th90Var.put((Object) Long.valueOf(j), (Object) bi90Var.e(set));
    }

    public static final void l(bb00 bb00Var, Function1 function1, fet fetVar, int i) {
        bb00Var.getClass();
        function1.getClass();
        fetVar.g0(-285977732);
        int i2 = (fetVar.g(bb00Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b = 0;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (bb00Var.f2284a) {
            fetVar.e0(1652687812);
            hmw0.W(bb00Var, function1, fetVar, i2 & 126);
            fetVar.r(false);
        } else {
            fetVar.e0(1652615427);
            q7x.h(bb00Var, function1, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new oa00(bb00Var, function1, i, b);
        }
    }

    public static final void m(mm40 mm40Var, j83 j83Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-178565025);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j83Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zx7 zx7Var = gqw0.e;
            long jT = idm0.t(12);
            long jT2 = idm0.t(24);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            kc5.O(j83Var, mm40Var, 0L, null, null, 0L, jT, jT2, null, null, 0L, zx7Var, 0, false, 1, 0, null, null, y9q0.a(g1t0.p(), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), false, 0.0f, fetVar, ((i2 >> 3) & 14) | 14155776 | ((i2 << 3) & 112), 1575936, 0, 7266108);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new oqr(mm40Var, j83Var, i, (byte) 1);
        }
    }

    public static final void n(xk80 xk80Var, fet fetVar, int i) {
        boolean z;
        long secondary20;
        ljc ljcVar = jd8.n;
        fetVar.g0(208661177);
        int i2 = (i & 6) == 0 ? (fetVar.g(xk80Var) ? 4 : 2) | i : i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarO = ny9.O(1.7142857f, o7k0.d(jm40Var, 1.0f), false);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarO);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(jr8.f16991a.b(o7k0.d(o7k0.e(jm40Var, 24.0f), 1.0f), gqw0.h), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), ljcVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new th50((byte) 21);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.j, fetVar, 6);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarW);
            fetVar.i0();
            int i3 = i2;
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.e0(-760437825);
            int iN = xk80Var.n();
            for (int i4 = 0; i4 < iN; i4++) {
                if (xk80Var.k() == i4) {
                    fetVar.e0(1331462886);
                    secondary20 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                    z = false;
                } else {
                    z = false;
                    fetVar.e0(1331463882);
                    secondary20 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary20();
                }
                fetVar.r(z);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE0 = o2e.e0(o7k0.n(i120.Q(lgb.J(s5x0.K(jm40Var, 3.0f, 6.0f), vgg0.f37379a).e(new ecu0(gqw0.l)), secondary20, ljcVar), 6.0f), "DOT_PAGES_PAGINATION_TAG");
                boolean zE = ((i3 & 14) == 4) | fetVar.e(i4);
                Object objP2 = fetVar.P();
                if (zE || objP2 == cl5Var) {
                    objP2 = new yg10(xk80Var, i4, (byte) 1);
                    fetVar.o0(objP2);
                }
                zq8.a(0, fetVar, pai0.a(mm40VarE0, false, (Function1) objP2));
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hhm(xk80Var, i);
        }
    }

    public static final void o(pz40 pz40Var, int i, fet fetVar, int i2) {
        int i3;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(1595146655);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(pz40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.e(i) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA0 = wha0.a0(o7k0.d(o7k0.e(jm40Var, 220.0f), 1.0f), wha0.T(fetVar2), false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            wvb.o(null, 34.0f, 0L, fetVar2, 0, 5);
            wwb.i(o7k0.w(jm40Var, null, false, 3), xsm0.s(((Number) ((vi60) pz40Var.getValue()).c.get(i)).intValue(), fetVar2), 0L, 0, 0L, fetVar, 6, 28);
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            kkb.m(o7k0.w(jm40Var, null, false, 3), xsm0.s(((Number) ((vi60) pz40Var.getValue()).d.get(i)).intValue(), fetVar), null, 0, 0L, 0L, fetVar, 6, 60);
            fetVar2 = fetVar;
            b = 1;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pi60(pz40Var, i, i2, b);
        }
    }

    public static final void p(mm40 mm40Var, gj40 gj40Var, xcz xczVar, fet fetVar, int i) {
        mm40 mm40Var2;
        gj40 gj40Var2 = gj40Var;
        xcz xczVar2 = xczVar;
        xczVar2.getClass();
        fetVar.g0(1058756640);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(gj40Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar2) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new ec40((byte) 4);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP, fetVar, 48);
            int i4 = i3 & 896;
            boolean zG = (i4 == 256) | fetVar.g(pz40Var);
            Object objP2 = fetVar.P();
            yje yjeVar = null;
            if (zG || objP2 == obj) {
                objP2 = new bz0(xczVar2, pz40Var, yjeVar, (byte) 5);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, xczVar2, (Function2) objP2);
            Integer numValueOf = Integer.valueOf(gj40Var2.c);
            Boolean bool = (Boolean) pz40Var.getValue();
            bool.booleanValue();
            boolean zG2 = fetVar.g(pz40Var) | (i4 == 256) | ((i3 & 112) == 32);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                Object mw20Var = new mw20((Object) xczVar, (Object) gj40Var2, (Object) pz40Var, yjeVar, (byte) 29);
                xczVar2 = xczVar;
                fetVar.o0(mw20Var);
                objP3 = mw20Var;
            }
            m0x0.u(xczVar2, numValueOf, bool, (Function2) objP3, fetVar);
            jm40 jm40Var = jm40.b;
            sj3.n(o7k0.d(jm40Var, 1.0f), gj40Var2.f11379a, gj40Var2.b, xczVar2, fetVar, 48 | (57344 & (i3 << 6)));
            mm40Var2 = jm40Var;
        } else {
            gj40Var2 = gj40Var2;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var2, (Object) gj40Var2, (Object) xczVar, i, (byte) 12);
        }
    }

    public static final void q(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(-1453934833);
        int i2 = i | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            long separator60 = s6t0.b().f33626a.getSeparator60();
            float f = ((ycl) ((hgk0) ((cwk) fetVar.k(jr00.b)).a()).getValue()).f42389a;
            zcl zclVar = qmk.f28987a;
            bgx bgxVarW = v2n0.w(new j0w0[]{new yzv0(0.0f, 0.0f, f + 24.0f, 7), xzv0.f41773a}, fetVar);
            boolean zF = ((i2 & 112) == 32) | fetVar.f(backgroundContent) | fetVar.f(separator60) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                zm8 zm8Var = new zm8((Object) a4xVar, backgroundContent, separator60, (Object) function1, (byte) 1);
                fetVar.o0(zm8Var);
                objP = zm8Var;
            }
            b8k0.e(mm40Var, null, bgxVarW, null, null, null, false, null, (Function1) objP, fetVar, 6, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new de9(mm40Var, a4xVar, function1, i, (byte) 5);
        }
    }

    public static final void r(mm40 mm40Var, m090 m090Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        m090Var.getClass();
        function1.getClass();
        fetVar.g0(-329639950);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(m090Var) ? 32 : 16) | (fetVar.g(cqqVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            obc.d(h36.f12370a.a(cqqVar), u1c.M(-1487504590, new dr50((byte) 29, mm40Var, (p6t0) m090Var, function1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 18, i, (Object) mm40Var, (Object) m090Var, (Object) cqqVar, (Object) function1);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-981127593);
        byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = q3d.j(y860.e, y860.f, y860.g);
                fetVar.o0(objP);
            }
            List list = (List) objP;
            boolean zI = fetVar.i(list);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new kv80(list, b);
                fetVar.o0(objP2);
            }
            x4n0.a(mm40Var, (Function2) objP2, fetVar, i2 & 14, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 16);
        }
    }

    public static final void t(a4x a4xVar, fet fetVar, int i) {
        a4xVar.getClass();
        fetVar.g0(-239488170);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 36.0f);
            long j = kkg.j;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Object objR = iom0.r(jpm0.t(R.drawable.player_ability_three_bg, 6, fetVar), fetVar);
            fetVar.e0(-874180325);
            ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                arrayList.add(iom0.r(jpm0.t(((ry90) it.next()).f31302a, 6, fetVar), fetVar));
            }
            fetVar.r(false);
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(jm40Var, 28.0f, 28.0f);
            boolean zI = ((i2 & 14) == 4) | fetVar.i(objR) | fetVar.i(arrayList);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new jl40(objR, (Object) arrayList, (Object) a4xVar, (byte) 27);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarP, (Function1) objP, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar, i, (byte) 18);
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(323244969);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), 286.0f), 1.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 26);
        }
    }

    public static final void v(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(-1533614520);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 8.0f, 8.0f, 8.0f, 0.0f, 8);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarN, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "PROMO_CODE_DETAIL_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarE1 = o2e.e0(s5x0.N(jm40Var, 16.0f, 16.0f, 16.0f, 0.0f, 8), "PROMO_CODE_DETAIL_TEXT");
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            v8q0.a(upperCase, mm40VarE1, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.b(), fetVar, 0, 0, 131064);
            v8q0.a(str2, o2e.e0(s5x0.M(jm40Var, 16.0f, 4.0f, 16.0f, 16.0f), "PROMO_CODE_DETAIL_TEXT"), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, (i2 >> 6) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var2, str, str2, i, (byte) 15);
        }
    }

    public static final void w(jba jbaVar, fet fetVar, int i) {
        Object obj;
        fetVar.g0(-814020402);
        byte b = 4;
        int i2 = (fetVar.i(jbaVar) ? 4 : 2) | i;
        boolean z = true;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj2) {
                objP2 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP2);
            }
            cgk0 cgk0Var = (cgk0) objP2;
            Boolean boolValueOf = Boolean.valueOf(xczVarA.j.a());
            boolean zG = fetVar.g(xczVarA);
            Object objP3 = fetVar.P();
            yje yjeVar = null;
            if (zG || objP3 == obj2) {
                objP3 = new s9c0(xczVarA, pz40Var, yjeVar, (byte) 15);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP3);
            boolean zG2 = fetVar.g(xczVarA);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == obj2) {
                objP4 = new k6d0(xczVarA, cgk0Var, yjeVar, b);
                fetVar.o0(objP4);
            }
            m0x0.t(fetVar, xczVarA, (Function2) objP4);
            byte b2 = 14;
            int i3 = i2 & 14;
            boolean zG3 = (i3 == 4 || fetVar.i(jbaVar)) | fetVar.g(xczVarA);
            Object objP5 = fetVar.P();
            if (zG3 || objP5 == obj2) {
                Object wmqVar = new wmq((Object) jbaVar, (Object) xczVarA, (Object) pz40Var, (Object) cgk0Var, (yje) null, (byte) 20);
                fetVar.o0(wmqVar);
                objP5 = wmqVar;
            }
            m0x0.t(fetVar, obj, (Function2) objP5);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(o7k0.d(s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f), 140.0f), "CARD_BASKETBALL_QUARTER_INFO");
            long jM71getBlack300d7_KjU = StaticColors.INSTANCE.m71getBlack300d7_KjU();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE0, jM71getBlack300d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            lh80 lh80Var = new lh80(8.0f, 8.0f, 8.0f, 8.0f);
            qw3 qw3Var = new qw3(16.0f, true, new jf4(b2));
            if (i3 != 4 && !fetVar.i(obj)) {
                z = false;
            }
            Object objP6 = fetVar.P();
            if (z || objP6 == obj2) {
                objP6 = new v6d0(jbaVar, (byte) 7);
                fetVar.o0(objP6);
            }
            b8k0.f(mm40VarQ, xczVarA, lh80Var, false, qw3Var, null, null, false, null, (Function1) objP6, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
        } else {
            obj = jbaVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nrc0(obj, i, (byte) 6);
        }
    }

    public static final void x(kba kbaVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1645350423);
        int i2 = i | (fetVar2.i(kbaVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 94.0f), 124.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            v8q0.a(kbaVar.f18004a, s5x0.N(o2e.e0(jm40Var, "CARD_BASKETBALL_QUARTER_TITLE"), 0.0f, 0.0f, 0.0f, 6.0f, 7), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            c(kbaVar.b, fetVar2, 8);
            c(kbaVar.e, fetVar2, 8);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            F(0, kbaVar.c, fetVar2, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), kbaVar.d);
            qxw.o(fetVar2, o7k0.s(jm40Var, 4.0f));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            F(0, kbaVar.f, fetVar2, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), kbaVar.g);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nrc0(kbaVar, i, (byte) 7);
        }
    }

    public static final void y(mm40 mm40Var, float f, long j, float f2, yjj0 yjj0Var, hd9 hd9Var, List list, int i, int i2, tcj tcjVar, fet fetVar, int i3, int i4) {
        int i5;
        int i6;
        cgk0 cgk0Var;
        cgk0 cgk0Var2;
        v9v0 v9v0Var;
        List list2;
        int i7 = i2;
        tcj tcjVar2 = tcjVar;
        yjj0Var.getClass();
        hd9Var.getClass();
        list.getClass();
        fetVar.g0(-1027275602);
        if ((i3 & 6) == 0) {
            i5 = (fetVar.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= fetVar.g(yjj0Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= fetVar.e(4) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= (i3 & 2097152) == 0 ? fetVar.g(hd9Var) : fetVar.i(hd9Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= (i3 & 16777216) == 0 ? fetVar.g(list) : fetVar.i(list) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= fetVar.e(i) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= fetVar.e(i7) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | ((i4 & 8) == 0 ? fetVar.g(tcjVar2) : fetVar.i(tcjVar2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if (fetVar.U(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            List list3 = hd9Var.f12859a;
            boolean zG = fetVar.g((v9v0) list3.get(i));
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                Object obj2 = list3.get(i);
                obj2.getClass();
                objP = (v9v0) obj2;
                fetVar.o0(objP);
            }
            v9v0 v9v0Var2 = (v9v0) objP;
            boolean zG2 = fetVar.g((v9v0) list3.get(i7));
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                Object obj3 = list3.get(i7);
                obj3.getClass();
                objP2 = (v9v0) obj3;
                fetVar.o0(objP2);
            }
            v9v0 v9v0Var3 = (v9v0) objP2;
            Object[] objArr = {"date.yearIdx"};
            boolean zI = fetVar.i(v9v0Var2);
            int i8 = i5;
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new njf0(v9v0Var2, (byte) 4);
                fetVar.o0(objP3);
            }
            cgk0 cgk0Var3 = (cgk0) e9x.Q(objArr, (Function0) objP3, fetVar, 0);
            Object[] objArr2 = {"date.monthIdx"};
            boolean zI2 = fetVar.i(v9v0Var3);
            Object objP4 = fetVar.P();
            byte b = 5;
            if (zI2 || objP4 == obj) {
                objP4 = new njf0(v9v0Var3, b);
                fetVar.o0(objP4);
            }
            cgk0 cgk0Var4 = (cgk0) e9x.Q(objArr2, (Function0) objP4, fetVar, 0);
            Unit unit = Unit.f46060a;
            int i9 = i8 & 29360128;
            int i10 = i8 & 234881024;
            boolean zI3 = (i9 == 8388608 || ((i8 & 16777216) != 0 && fetVar.i(list))) | (i10 == 67108864) | fetVar.i(v9v0Var2);
            int i11 = i6 & 14;
            boolean z = zI3 | (i11 == 4 || ((i6 & 8) != 0 && fetVar.i(tcjVar2)));
            int i12 = i8 & 1879048192;
            boolean zG3 = z | (i12 == 536870912) | fetVar.g(cgk0Var3) | fetVar.g(cgk0Var4);
            Object objP5 = fetVar.P();
            if (zG3 || objP5 == obj) {
                cgk0Var = cgk0Var4;
                cgk0Var2 = cgk0Var3;
                Object sjf0Var = new sjf0(v9v0Var2, tcjVar2, list, i, i7, cgk0Var2, cgk0Var, (yje) null);
                v9v0Var = v9v0Var2;
                list2 = list;
                tcjVar2 = tcjVar2;
                i7 = i7;
                fetVar.o0(sjf0Var);
                objP5 = sjf0Var;
            } else {
                list2 = list;
                cgk0Var = cgk0Var4;
                v9v0Var = v9v0Var2;
                cgk0Var2 = cgk0Var3;
            }
            m0x0.t(fetVar, unit, (Function2) objP5);
            Object[] objArr3 = {Boolean.valueOf(((t9v0) list.get(i)).e), Boolean.valueOf(((t9v0) list2.get(i7)).e), Integer.valueOf(cgk0Var2.l()), Integer.valueOf(cgk0Var.l())};
            boolean zI4 = (i10 == 67108864) | (i9 == 8388608 || ((i8 & 16777216) != 0 && fetVar.i(list2))) | (i12 == 536870912) | fetVar.i(v9v0Var) | fetVar.g(cgk0Var2) | (i11 == 4 || ((i6 & 8) != 0 && fetVar.i(tcjVar2))) | fetVar.g(cgk0Var);
            Object objP6 = fetVar.P();
            if (zI4 || objP6 == obj) {
                Object sjf0Var2 = new sjf0(list2, i, i7, v9v0Var, tcjVar2, cgk0Var2, cgk0Var, (yje) null);
                fetVar.o0(sjf0Var2);
                objP6 = sjf0Var2;
            }
            m0x0.w(objArr3, (Function2) objP6, fetVar);
            boolean z2 = i9 == 8388608 || ((i8 & 16777216) != 0 && fetVar.i(list2));
            Object objP7 = fetVar.P();
            if (z2 || objP7 == obj) {
                objP7 = new kv80(list2, (byte) 9);
                fetVar.o0(objP7);
            }
            Function2 function2 = (Function2) objP7;
            boolean zG4 = (i9 == 8388608 || ((i8 & 16777216) != 0 && fetVar.i(list2))) | fetVar.g(cgk0Var2) | fetVar.g(cgk0Var);
            Object objP8 = fetVar.P();
            if (zG4 || objP8 == obj) {
                objP8 = new sqc0((Object) list2, (Object) cgk0Var2, (Object) cgk0Var, (byte) 5);
                fetVar.o0(objP8);
            }
            int i13 = i8 >> 3;
            bdx.C(mm40Var, f, f2, j, yjj0Var, list2, false, function2, (xdr) objP8, fetVar, (i8 & 14) | 12582912 | (i8 & 112) | (i13 & 896) | ((i8 << 3) & 7168) | (i8 & 57344) | (i8 & 458752) | (i13 & 3670016));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uol(mm40Var, f, j, f2, yjj0Var, hd9Var, list, i, i2, tcjVar, i3, i4);
        }
    }

    public static final void z(tcj tcjVar, List list, int i, int i2) {
        int i3 = 0;
        while (i3 < 12) {
            int i4 = i3 + 1;
            boolean zF = up90.f(tcjVar, i2, i4);
            cav0 cav0Var = (cav0) ((t9v0) list.get(i)).b.get(i3);
            if (cav0Var.c != zF) {
                ((t9v0) list.get(i)).b.set(i3, cav0.a(cav0Var, zF));
            }
            i3 = i4;
        }
    }

    public void L() {
    }
}
