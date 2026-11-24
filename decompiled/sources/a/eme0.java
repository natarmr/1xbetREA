package a;

import android.view.View;
import android.view.Window;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.resident.presentation.views.ResidentSafeLineView;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eme0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8042a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eme0(Object obj, byte b) {
        this.f8042a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        String str;
        byte b = this.f8042a;
        byte b2 = 2;
        byte b3 = 7;
        byte b4 = 17;
        byte b5 = 4;
        byte b6 = 3;
        byte b7 = 0;
        ?? B = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gme0 gme0Var = (gme0) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                gme0Var.q.b(th, new dke0(gme0Var, b6));
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((ume0) obj2).s.b(th2, new k8e0((byte) 13));
                return Unit.f46060a;
            case 2:
                xne0 xne0Var = (xne0) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                if (th3 instanceof zhi0) {
                    qjj.W(jiu0.a(xne0Var), null, null, new k6d0(xne0Var, th3, (yje) B, b3), 3);
                } else {
                    xne0Var.h.a(th3);
                }
                xne0Var.x(false);
                return Unit.f46060a;
            case 3:
                zoe0 zoe0Var = (zoe0) obj2;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                p7m0 p7m0Var = zoe0Var.s;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                if (th4 instanceof zhi0) {
                    qjj.W(jiu0.a(zoe0Var), null, null, new k6d0((Object) zoe0Var, (Object) th4, (yje) B, (byte) 8), 3);
                } else {
                    zoe0Var.k.a(th4);
                }
                return Unit.f46060a;
            case 4:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new epe0(cpVar, (mpe0) obj2));
                return Unit.f46060a;
            case 5:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((gue0) obj2).p.b(th5, new yr0(th5, (byte) 23));
                return Unit.f46060a;
            case 6:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((lue0) obj2).p.b(th6, new yr0(th6, (byte) 24));
                return Unit.f46060a;
            case 7:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                mi70 mi70Var = ((d7f0) obj2).J;
                i38 i38Var = new i38(17);
                mi70Var.getClass();
                k0w0Var.h(new BindPhoneNumberScreen(i38Var));
                return Unit.f46060a;
            case 8:
                ((lwk) obj).getClass();
                return new taf0((Window) obj2, b7);
            case 9:
                return new ty2((ye50) obj2, (byte) 21);
            case 10:
                u0h0 u0h0Var = (u0h0) obj2;
                pz40 pz40Var = (pz40) obj;
                if (!(pz40Var instanceof fgk0)) {
                    jf4.o("Failed requirement.");
                    return null;
                }
                fgk0 fgk0Var = (fgk0) pz40Var;
                if (fgk0Var.getValue() != null) {
                    Object value = fgk0Var.getValue();
                    value.getClass();
                    B = u0h0Var.b(value);
                }
                igk0 igk0VarD = fgk0Var.d();
                igk0VarD.getClass();
                return androidx.compose.runtime.e.d(B, igk0VarD);
            case 11:
                jif0 jif0Var = (jif0) obj2;
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                boolean z = th7 instanceof zhi0;
                dif0 dif0Var = dif0.f6135a;
                if (z) {
                    kuw kuwVar = ((zhi0) th7).c;
                    if (kuwVar == i2o.OnlyOperatorCanEditParticipants) {
                        String message = th7.getMessage();
                        str = message != null ? message : "";
                        if (str.length() > 0) {
                            jif0Var.G(new eif0(str));
                        }
                        i1w0 i1w0Var = jif0Var.s;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                    } else if (kuwVar == i2o.CantAddSelfToNWTournament || kuwVar == i2o.ParticipantIsNotInTestModeWhiteList) {
                        String message2 = th7.getMessage();
                        str = message2 != null ? message2 : "";
                        if (str.length() > 0) {
                            jif0Var.G(new eif0(str));
                        }
                    } else {
                        jif0Var.G(dif0Var);
                    }
                } else {
                    jif0Var.G(dif0Var);
                }
                return Unit.f46060a;
            case 12:
                gkf0 gkf0Var = (gkf0) obj;
                gkf0Var.getClass();
                return Boolean.valueOf(gkf0Var.f11441a.f23317a != ((gkf0) obj2).f11441a.f23317a);
            case 13:
                ResidentSafeLineView residentSafeLineView = (ResidentSafeLineView) obj2;
                mrf0 mrf0Var = (mrf0) obj;
                int i = ResidentSafeLineView.m;
                mrf0Var.getClass();
                int size = residentSafeLineView.f46885a.size();
                int i2 = residentSafeLineView.d + 1;
                residentSafeLineView.d = i2;
                if (i2 >= size) {
                    residentSafeLineView.c.invoke(mrf0Var);
                }
                return Unit.f46060a;
            case 14:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new utf0(cpVar2, (due0) obj2));
                return Unit.f46060a;
            case 15:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.t(new dff0(cpVar3, (aif0) obj2, (byte) 10));
                return Unit.f46060a;
            case 16:
                iqt0 iqt0Var = (iqt0) obj;
                eke0 eke0Var = ayf0.S1;
                iqt0Var.getClass();
                ((ayf0) obj2).H0().p.a(iqt0Var);
                return Unit.f46060a;
            case 17:
                h2g0 h2g0Var = new h2g0(((Integer) obj).intValue());
                int i3 = g2g0.s;
                ((g2g0) obj2).g(h2g0Var);
                return Unit.f46060a;
            case 18:
                y7g0 y7g0Var = (y7g0) obj2;
                TableViewImpl tableViewImpl = (TableViewImpl) obj;
                tableViewImpl.getClass();
                k5 adapter = tableViewImpl.getAdapter();
                x7g0 x7g0Var = adapter instanceof x7g0 ? (x7g0) adapter : null;
                if (x7g0Var != null) {
                    x7g0Var.q(y7g0Var.b, y7g0Var.c, y7g0Var.f42150a, y7g0Var.d);
                }
                tableViewImpl.getColumnHeaderRecyclerView().y0(0);
                tableViewImpl.getRowHeaderRecyclerView().y0(0);
                tableViewImpl.getCellRecyclerView().y0(0);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                pbg0 pbg0Var = (pbg0) obj2;
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                pbg0Var.f.b(th8, new dke0(pbg0Var, b4));
                return Unit.f46060a;
            case 20:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                boolean z2 = ((cdg0) obj2).e;
                zai0 zai0Var = bdg0.b;
                iiy iiyVar = bdg0.f2398a[0];
                Boolean boolValueOf = Boolean.valueOf(z2);
                zai0Var.getClass();
                abi0Var.b(zai0Var, boolValueOf);
                return Unit.f46060a;
            case 21:
                qpg0 qpg0Var = (qpg0) obj;
                qpg0Var.getClass();
                saj.b0(new k6d0(obj2, (Object) qpg0Var, (yje) B, (byte) 19));
                return Unit.f46060a;
            case 22:
                w7r w7rVar = (w7r) obj;
                w7rVar.getClass();
                ((udg0) obj2).g = w7rVar;
                return Unit.f46060a;
            case 23:
                xpg0 xpg0Var = (xpg0) obj;
                xpg0Var.getClass();
                ((eme0) obj2).invoke(new a38(xpg0Var));
                return Unit.f46060a;
            case 24:
                feg0 feg0Var = (feg0) obj2;
                xpg0 xpg0Var2 = (xpg0) obj;
                xpg0Var2.getClass();
                int i4 = feg0Var.g;
                if (1 <= i4) {
                    int i5 = 1;
                    while (true) {
                        int i6 = feg0Var.f[i5];
                        if (i6 == 1) {
                            xpg0Var2.s(i5);
                        } else if (i6 == 2) {
                            xpg0Var2.o(i5, feg0Var.b[i5]);
                        } else if (i6 == 3) {
                            xpg0Var2.p(feg0Var.c[i5], i5);
                        } else if (i6 == 4) {
                            String str2 = feg0Var.d[i5];
                            if (str2 == null) {
                                jf4.o("Required value was null.");
                                return null;
                            }
                            xpg0Var2.z(i5, str2);
                        } else if (i6 == 5) {
                            byte[] bArr = feg0Var.e[i5];
                            if (bArr == null) {
                                jf4.o("Required value was null.");
                                return null;
                            }
                            xpg0Var2.i(bArr, i5);
                        }
                        if (i5 != i4) {
                            i5++;
                        }
                    }
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i4 i4Var = (i4) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(i4Var.size(), null, new pn7(i4Var, (byte) 4), new ugd(802480018, true, new qn7(i4Var, b2)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                o470 o470Var = (o470) obj2;
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                u7z u7zVar = (u7z) cpVar4.u;
                u7zVar.b.setOnClickListener(new bs50(cpVar4, o470Var, b3));
                u7zVar.c.setOnClickListener(new jpe0(o470Var, b5));
                cpVar4.t(new ui80(cpVar4, b4));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                dmg0 dmg0Var = (dmg0) obj2;
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.b(1.0f - (dmg0Var.f6322a > 0 ? l1e0.c(dmg0Var.b.l() / dmg0Var.f6322a, 0.0f, 1.0f) : 0.0f));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                mog0 mog0Var = (mog0) obj2;
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                iog0 iog0Var = new iog0(mog0Var.w());
                p7m0 p7m0Var2 = mog0Var.s;
                p7m0Var2.getClass();
                p7m0Var2.o(null, iog0Var);
                mog0Var.h.b(th9, new vtf0((byte) 26));
                return Unit.f46060a;
            default:
                gne0 gne0Var = zug0.V1;
                ((View) obj).getClass();
                cxg0 cxg0VarI0 = ((zug0) obj2).I0();
                qoj0 qoj0Var = cxg0VarI0.A;
                nj7 nj7Var = cxg0VarI0.k;
                n3w n3wVar = cxg0VarI0.l;
                String strN = xkb.N(n3wVar);
                String strF0 = xkb.f0(n3wVar);
                nj7Var.getClass();
                strN.getClass();
                b4j b4jVar = nj7Var.f23620a;
                a1w a1wVar = a1w.k;
                r6w r6wVar = r6w.j;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (strN.length() > 0) {
                    linkedHashMap.put(a1w.d.a(), strN);
                }
                if (strF0.length() > 0) {
                    linkedHashMap.put(a1w.e.a(), strF0);
                }
                b4jVar.g(a1wVar, r6wVar, linkedHashMap);
                nj7Var.b.d(r6wVar.a(), strN, strF0);
                if (!cxg0VarI0.q || cxg0VarI0.m) {
                    qoj0Var.g(new lwg0(cxg0VarI0.l, cxg0VarI0.r, cxg0VarI0.m, cxg0VarI0.v));
                } else {
                    qoj0Var.g(new kwg0(n3wVar, cxg0VarI0.r.c));
                }
                return Unit.f46060a;
        }
    }
}
