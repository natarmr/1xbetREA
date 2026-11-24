package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.GameVideoPlayerColorScheme;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.api.presentation.models.GameVideoUiConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class obl0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24987a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ ncl0 c;

    public /* synthetic */ obl0(kmq kmqVar, ncl0 ncl0Var, byte b) {
        this.f24987a = b;
        this.b = kmqVar;
        this.c = ncl0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        nbl0 nbl0Var;
        Object brsVar;
        xef0 vef0Var;
        qbl0 qbl0Var;
        byte b = this.f24987a;
        boolean z = false;
        ncl0 ncl0Var = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof nbl0) {
                    nbl0Var = (nbl0) yjeVar;
                    int i = nbl0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        nbl0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        nbl0Var = new nbl0(this, yjeVar);
                    }
                } else {
                    nbl0Var = new nbl0(this, yjeVar);
                }
                Object obj2 = nbl0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = nbl0Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    zqs zqsVar = (zqs) obj;
                    ctf0 ctf0Var = ncl0Var.h;
                    zqsVar.getClass();
                    ctf0Var.getClass();
                    if (zqsVar.f44821a) {
                        brsVar = ars.f1361a;
                    } else {
                        if (zqsVar.g) {
                            String strA = ctf0Var.b.a(R.string.transition_to_live, Arrays.copyOf(new Object[0], 0));
                            long jB = new znq0(zqsVar.i).b();
                            vef0Var = new wef0(strA, String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jB / 60), Long.valueOf(jB % 60)}, 2)));
                        } else {
                            vef0Var = zqsVar.h ? new vef0(ctf0Var.b.a(R.string.game_not_found, Arrays.copyOf(new Object[0], 0))) : new vef0(ctf0Var.b.a(R.string.game_finished_with_similar_events_message, Arrays.copyOf(new Object[0], 0)));
                        }
                        brsVar = new brs(vef0Var);
                    }
                    nbl0Var.j = 1;
                    if (kmqVar.a(brsVar, nbl0Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof qbl0) {
                    qbl0Var = (qbl0) yjeVar;
                    int i3 = qbl0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qbl0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        qbl0Var = new qbl0(this, yjeVar);
                    }
                } else {
                    qbl0Var = new qbl0(this, yjeVar);
                }
                Object obj3 = qbl0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = qbl0Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    fsr fsrVar = (fsr) obj;
                    boolean zBooleanValue = ((Boolean) ncl0Var.L.getValue()).booleanValue();
                    fsrVar.getClass();
                    boolean z2 = fsrVar.b;
                    boolean z3 = fsrVar.c;
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        GameBroadcastingParams gameBroadcastingParamsF0 = ozb.f0(fsrVar);
                        jxs[] jxsVarArr = jxs.f17324a;
                        arrayList.add(new w39(gameBroadcastingParamsF0, new GameVideoUiConfig("16:9", R.dimen.corner_radius_16, -1, -1, GameVideoPlayerColorScheme.Static.f46687a)));
                    }
                    if (z3) {
                        arrayList.add(new x39(ozb.f0(fsrVar)));
                    }
                    if (!arrayList.isEmpty() && !zBooleanValue) {
                        z = true;
                    }
                    gsr gsrVar = new gsr(arrayList, z);
                    qbl0Var.j = 1;
                    if (kmqVar.a(gsrVar, qbl0Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }
}
