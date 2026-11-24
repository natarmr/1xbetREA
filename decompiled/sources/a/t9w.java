package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bethistory.domain.model.GeneralBetInfoModel;
import org.xplatform.ui_core.resources.UiText;

/* JADX INFO: loaded from: classes3.dex */
public final class t9w extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ p6t0 j;
    public final /* synthetic */ naw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9w(naw nawVar, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = nawVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        naw nawVar = this.k;
        p6t0 p6t0Var = (p6t0) obj;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                t9w t9wVar = new t9w(nawVar, yjeVar, (byte) 0);
                t9wVar.j = p6t0Var;
                return t9wVar.invokeSuspend(Unit.f46060a);
            default:
                t9w t9wVar2 = new t9w(nawVar, yjeVar, (byte) 1);
                t9wVar2.j = p6t0Var;
                return t9wVar2.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0113  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        n3w n3wVar;
        fbr fbrVar;
        pgv0 pgv0VarC;
        String str;
        int i;
        switch (this.i) {
            case 0:
                p6t0 p6t0Var = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                naw nawVar = this.k;
                if (nawVar.D0 != s77.EVENTS || nawVar.Q0.f32117a.k.length() == 0 || this.k.Q0.f32117a.l.length() == 0) {
                    return null;
                }
                naw nawVar2 = this.k;
                if (nawVar2.d == sys0.c) {
                    return null;
                }
                s5w s5wVar = (s5w) nawVar2.J.c;
                synchronized (s5wVar.d) {
                    Map.Entry entryFirstEntry = s5wVar.f31675a.firstEntry();
                    n3wVar = entryFirstEntry != null ? (n3w) entryFirstEntry.getValue() : null;
                    break;
                }
                String str2 = n3wVar != null ? n3wVar.f22868a : null;
                if (str2 == null) {
                    str2 = "";
                }
                if (p6t0Var instanceof zad) {
                    zad zadVar = (zad) p6t0Var;
                    if (Intrinsics.d(zadVar.k, str2)) {
                        e4f e4fVar = zadVar.h;
                        naw nawVar3 = this.k;
                        pgv0VarC = afn0.C(e4fVar, nawVar3.W, nawVar3.Q0.f32117a.l);
                        naw nawVar4 = this.k;
                        str = pgv0VarC != null ? pgv0VarC.e : null;
                        if (str == null) {
                            str = "";
                        }
                        nawVar4.H(str);
                    } else {
                        if (p6t0Var instanceof fbr) {
                            return null;
                        }
                        fbrVar = (fbr) p6t0Var;
                        if (Intrinsics.d(fbrVar.f9275a, str2)) {
                            return null;
                        }
                        e4f e4fVar2 = fbrVar.l;
                        naw nawVar5 = this.k;
                        pgv0VarC = afn0.C(e4fVar2, nawVar5.W, nawVar5.Q0.f32117a.l);
                        naw nawVar6 = this.k;
                        str = pgv0VarC != null ? pgv0VarC.e : null;
                        if (str == null) {
                            str = "";
                        }
                        nawVar6.H(str);
                    }
                } else {
                    if (p6t0Var instanceof fbr) {
                        return null;
                    }
                    fbrVar = (fbr) p6t0Var;
                    if (Intrinsics.d(fbrVar.f9275a, str2)) {
                        return null;
                    }
                    e4f e4fVar3 = fbrVar.l;
                    naw nawVar7 = this.k;
                    pgv0VarC = afn0.C(e4fVar3, nawVar7.W, nawVar7.Q0.f32117a.l);
                    naw nawVar8 = this.k;
                    if (pgv0VarC != null) {
                    }
                    if (str == null) {
                        str = "";
                    }
                    nawVar8.H(str);
                }
                return pgv0VarC;
            default:
                p6t0 p6t0Var2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (p6t0Var2 != null) {
                    return null;
                }
                naw nawVar9 = this.k;
                GeneralBetInfoModel generalBetInfoModel = ((s5w) nawVar9.J.c).b;
                nawVar9.U0 = generalBetInfoModel;
                s77 s77Var = nawVar9.D0;
                generalBetInfoModel.getClass();
                s77Var.getClass();
                if (generalBetInfoModel.equals(GeneralBetInfoModel.h) || s77Var == s77.AUTO || s77Var == s77.TOTO || s77Var == s77.JACKPOT || (i = generalBetInfoModel.f46409a) <= 0) {
                    return null;
                }
                UiText.ByIntRes byIntRes = new UiText.ByIntRes(new int[]{i}, R.string.full_bet_count_info_v2);
                pn40 pn40Var = pn40.f27267a;
                return new e2w(byIntRes, new UiText.ByString(kng0.l(" (", pn40.d(generalBetInfoModel.d, generalBetInfoModel.g, p3u0.c), Separators.RPAREN)));
        }
    }
}
