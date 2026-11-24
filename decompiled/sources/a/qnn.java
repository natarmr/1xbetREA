package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qnn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29038a;
    public final /* synthetic */ wnn b;

    public /* synthetic */ qnn(wnn wnnVar, byte b) {
        this.f29038a = b;
        this.b = wnnVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00fd  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        amn vlnVar;
        boolean z;
        boolean z2;
        boolean zD;
        byte b = this.f29038a;
        boolean z3 = true;
        wnn wnnVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                wnnVar.P();
                boolean z4 = th instanceof zhi0;
                int errorCode = z4 ? ((zhi0) th).c.getErrorCode() : 0;
                ik4 ik4Var = wnnVar.y;
                String str = ((vqc) wnnVar.E.f25032a).d().f36579a;
                ik4Var.getClass();
                str.getClass();
                Set setC = dui0.c(new j1p(str, (byte) 0));
                if (errorCode != 0) {
                    setC.add(new i1p(errorCode, (byte) 2));
                }
                ik4Var.f14907a.a(setC, 3221L);
                if (z4) {
                    kuw kuwVar = ((zhi0) th).c;
                    i2o i2oVar = i2o.BetExistsError;
                    ctf0 ctf0Var = wnnVar.A;
                    if (kuwVar == i2oVar) {
                        String message = th.getMessage();
                        String str2 = message == null ? "" : message;
                        ctf0Var.getClass();
                        lsm0 lsm0Var = ctf0Var.b;
                        wnnVar.G(new enn(new DialogFields((CharSequence) lsm0Var.a(R.string.error, Arrays.copyOf(new Object[0], 0)), (CharSequence) str2, (CharSequence) lsm0Var.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "REQUEST_BET_EXISTS_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488)));
                    } else {
                        String message2 = th.getMessage();
                        String str3 = message2 == null ? "" : message2;
                        ctf0Var.getClass();
                        lsm0 lsm0Var2 = ctf0Var.b;
                        wnnVar.G(new enn(new DialogFields((CharSequence) lsm0Var2.a(R.string.error, Arrays.copyOf(new Object[0], 0)), (CharSequence) str3, (CharSequence) lsm0Var2.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, "REQUEST_SAVE_COUPON_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496)));
                    }
                } else if (!(th instanceof SocketTimeoutException) && !(th instanceof UnknownHostException)) {
                    String message3 = th.getMessage();
                    wnnVar.G(new gnn(new xdk0(rek0.b, message3 == null ? "" : message3, null, null, null, null, 124)));
                }
                return Unit.f46060a;
            case 1:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                wnnVar.H(new f4m((byte) 24));
                return Unit.f46060a;
            default:
                inn innVar = (inn) obj2;
                ((oyg0) obj).getClass();
                innVar.getClass();
                List listI = wnnVar.s.f27394a.i();
                v0f v0fVarD = ((vqc) wnnVar.E.f25032a).d();
                List list = v0fVarD.i;
                q4f q4fVar = v0fVarD.b;
                boolean z5 = list.size() > 1;
                if (listI.isEmpty()) {
                    bby bbyVar = wnnVar.Y;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    vlnVar = wln.f39362a;
                } else {
                    vlnVar = new vln(listI);
                }
                boolean z6 = wnnVar.D.c().f24244a;
                p4a p4aVar = wnnVar.G;
                es esVar = p4aVar.f26343a;
                if (esVar.i().isEmpty()) {
                    z = false;
                } else {
                    vqc vqcVar = p4aVar.b;
                    if (vqcVar.e() != ((u0f) vqcVar.b).b) {
                        z2 = true;
                    } else {
                        List<pln> listI2 = esVar.i();
                        List<pln> list2 = ((sln) esVar.f8305a).f32408a;
                        if (listI2.size() != list2.size()) {
                            zD = true;
                            z2 = true;
                        } else {
                            ArrayList arrayList = new ArrayList(r3d.q(listI2, 10));
                            for (pln plnVar : listI2) {
                                arrayList.add(new Pair(Long.valueOf(plnVar.b), Long.valueOf(plnVar.c)));
                                z3 = z3;
                            }
                            z2 = z3;
                            Set setP0 = CollectionsKt.P0(arrayList);
                            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                            for (pln plnVar2 : list2) {
                                arrayList2.add(new Pair(Long.valueOf(plnVar2.b), Long.valueOf(plnVar2.c)));
                            }
                            zD = Intrinsics.d(setP0, CollectionsKt.P0(arrayList2)) ^ z2;
                        }
                        if (!zD) {
                            z = false;
                        }
                    }
                    z = z2;
                }
                return inn.a(innVar, q4fVar, z5, list, vlnVar, v0fVarD, null, z, z6, null, 0L, false, 31032);
        }
    }
}
