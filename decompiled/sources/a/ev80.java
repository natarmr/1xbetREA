package a;

import android.animation.ObjectAnimator;
import android.javax.sip.message.Response;
import android.view.animation.LinearInterpolator;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ev80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8457a;

    public /* synthetic */ ev80(byte b) {
        this.f8457a = b;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[LOOP:3: B:22:0x0073->B:134:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:16:0x005e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f A[LOOP:1: B:28:0x008b->B:33:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc A[LOOP:2: B:36:0x00a7->B:41:0x00bc, LOOP_END] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nq90 nq90Var;
        a4x a4xVar;
        Iterator<E> it;
        boolean z;
        Iterator it2;
        int i;
        int i2;
        Iterator it3;
        int i3;
        a4x a4xVarO0;
        Object obj2 = null;
        byte b = 2;
        int i4 = 0;
        byte b2 = 1;
        switch (this.f8457a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                xuzVar.getClass();
                return new mdm(xuz.a(pb10Var, iIntValue), null, null, 0, 0, R.string.data_is_missing, 0, 0, 0L, 0L, 990);
            case 1:
                cv80 cv80Var = (cv80) obj;
                cv80Var.getClass();
                return Boolean.valueOf((cv80Var instanceof bv80) || (cv80Var instanceof av80));
            case 2:
                int iIntValue2 = ((Integer) obj).intValue();
                xuz xuzVar2 = pb10.c;
                pb10 pb10Var2 = pb10.g;
                xuzVar2.getClass();
                return new mdm(xuz.a(pb10Var2, iIntValue2), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 3:
                kg kgVar = (kg) obj;
                kgVar.getClass();
                return ffb0.S(kgVar);
            case 4:
                hr10 hr10Var = (hr10) obj;
                hr10Var.getClass();
                return x2x.m0(hr10Var);
            case 5:
                ot0 ot0Var = (ot0) obj;
                ot0Var.getClass();
                return x4d0.g0(ot0Var);
            case 6:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 7:
                ob0 ob0Var = (ob0) obj;
                ob0Var.getClass();
                return new su80(ob0Var);
            case 8:
                zx80 zx80Var = (zx80) obj;
                zx80Var.getClass();
                return zx80Var.f45146a;
            case 9:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 10:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return sre0.f32672a.b(p6t0Var2.getClass());
            case 11:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 12:
                ((FixedWebView) obj).getClass();
                return Unit.f46060a;
            case 13:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 14:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 15:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 16:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case 17:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case 18:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((vzg0) obj).getClass();
                return new ia90(true, null);
            case 20:
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(ro4.m0(Response.OK, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(Response.OK, 0, null, 6), 2));
            case 21:
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(ro4.m0(Response.OK, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(Response.OK, 0, null, 6), 2));
            case 22:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new ctv(cpVar, cpVar, (byte) 7));
                return Unit.f46060a;
            case 23:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                gkz gkzVar = new gkz(je90.d);
                byte b3 = 3;
                gkzVar.d.b(new gbn(new ht80((byte) 23), new iv60(b3, b3), new ev80((byte) 22), xk60.f));
                usx usxVar = (usx) cpVar2.u;
                usxVar.j.setAdapter(gkzVar);
                RecyclerView recyclerView = usxVar.j;
                recyclerView.n(new bie0(recyclerView));
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(usxVar.d, "rotation", 0.0f, 360.0f);
                objectAnimatorOfFloat.setDuration(1000L);
                objectAnimatorOfFloat.setRepeatCount(-1);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(usxVar.g, "rotation", 0.0f, 360.0f);
                objectAnimatorOfFloat2.setDuration(1000L);
                objectAnimatorOfFloat2.setRepeatCount(-1);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                cpVar2.t(new gpd(cpVar2, gkzVar, objectAnimatorOfFloat, objectAnimatorOfFloat2, cpVar2, gkzVar, objectAnimatorOfFloat, objectAnimatorOfFloat2, (byte) 1));
                return Unit.f46060a;
            case 24:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.t(new ui80(cpVar3, b2));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                cpVar4.t(new ui80(cpVar4, b));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                rr90 rr90Var = (rr90) obj;
                rr90Var.getClass();
                return sre0.f32672a.b(rr90Var.getClass());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gn90 gn90Var = (gn90) obj;
                gn90Var.getClass();
                rvm0 rvm0Var = gn90Var.b;
                long j = rvm0Var != null ? rvm0Var.f31177a : -1L;
                List<rvm0> list = gn90Var.f11576a;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (rvm0 rvm0Var2 : list) {
                    rvm0Var2.getClass();
                    long j2 = rvm0Var2.f31177a;
                    String str = rvm0Var2.c;
                    if (str == null) {
                        str = "";
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    arrayList.add(new hn90(j2, new rqm((vui0) new tui0(str, new y3d(j2 == j ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new lvi0(tc00.f33696a, j2 == j), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506)));
                }
                return new in90(dyb.o0(arrayList));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ko90 ko90Var = (ko90) obj;
                ko90Var.getClass();
                a4x a4xVar2 = ko90Var.d;
                for (Object obj3 : a4xVar2) {
                    if (((nq90) obj3).getId() == ko90Var.f18621a) {
                        obj2 = obj3;
                        nq90Var = (nq90) obj2;
                        if (nq90Var != null) {
                            SnapshotStateList snapshotStateList = new SnapshotStateList();
                            snapshotStateList.addAll(a4xVar2);
                            snapshotStateList.remove(nq90Var);
                            snapshotStateList.add(0, nq90Var);
                            a4xVarO0 = dyb.o0(snapshotStateList);
                            if (a4xVarO0 != null) {
                                a4xVar = a4xVarO0;
                            } else {
                                a4xVar = a4xVar2;
                            }
                        } else {
                            a4xVar = a4xVar2;
                        }
                        int i5 = ko90Var.f18621a;
                        String str2 = ko90Var.b;
                        String str3 = ko90Var.c;
                        if (a4xVar2.isEmpty()) {
                            z = false;
                        } else {
                            it = a4xVar2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                } else if (((nq90) it.next()).a()) {
                                    z = true;
                                }
                            }
                        }
                        it2 = a4xVar2.iterator();
                        i = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                i2 = -1;
                            } else if (((nq90) it2.next()).a()) {
                                i2 = i;
                            } else {
                                i++;
                            }
                        }
                        it3 = a4xVar2.iterator();
                        while (it3.hasNext()) {
                            if (!((nq90) it3.next()).a()) {
                                i3 = i4;
                                return new lo90(str2, str3, i5, a4xVar, z, i2, i3);
                            }
                            i4++;
                        }
                        i3 = -1;
                        return new lo90(str2, str3, i5, a4xVar, z, i2, i3);
                    }
                }
                nq90Var = (nq90) obj2;
                if (nq90Var != null) {
                    SnapshotStateList snapshotStateList2 = new SnapshotStateList();
                    snapshotStateList2.addAll(a4xVar2);
                    snapshotStateList2.remove(nq90Var);
                    snapshotStateList2.add(0, nq90Var);
                    a4xVarO0 = dyb.o0(snapshotStateList2);
                    if (a4xVarO0 != null) {
                        a4xVar = a4xVarO0;
                    } else {
                        a4xVar = a4xVar2;
                    }
                } else {
                    a4xVar = a4xVar2;
                }
                int i6 = ko90Var.f18621a;
                String str4 = ko90Var.b;
                String str5 = ko90Var.c;
                if (a4xVar2.isEmpty()) {
                    z = false;
                } else {
                    it = a4xVar2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                        } else if (((nq90) it.next()).a()) {
                            z = true;
                        }
                    }
                }
                it2 = a4xVar2.iterator();
                i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        i2 = -1;
                    } else if (((nq90) it2.next()).a()) {
                        i2 = i;
                    } else {
                        i++;
                    }
                }
                it3 = a4xVar2.iterator();
                while (it3.hasNext()) {
                    if (!((nq90) it3.next()).a()) {
                        i3 = i4;
                        return new lo90(str4, str5, i6, a4xVar, z, i2, i3);
                    }
                    i4++;
                }
                i3 = -1;
                return new lo90(str4, str5, i6, a4xVar, z, i2, i3);
            default:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                cpVar5.t(new ui80(cpVar5, (byte) 5));
                return Unit.f46060a;
        }
    }
}
