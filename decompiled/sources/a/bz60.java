package a;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final class bz60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ez60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz60(ez60 ez60Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ez60Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ez60 ez60Var = this.k;
        switch (b) {
            case 0:
                bz60 bz60Var = new bz60(ez60Var, yjeVar, (byte) 0);
                bz60Var.j = obj;
                return bz60Var;
            default:
                bz60 bz60Var2 = new bz60(ez60Var, yjeVar, (byte) 1);
                bz60Var2.j = obj;
                return bz60Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((bz60) create((v570) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bz60) create((b370) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ez60 ez60Var = this.k;
        switch (b) {
            case 0:
                kiu0 kiu0Var = ez60Var.O1;
                v570 v570Var = (v570) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (v570Var != null) {
                    if (v570Var instanceof t570) {
                        iiy[] iiyVarArr = ez60.S1;
                        ii iiVar = ez60Var.N1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = ez60Var.H(R.string.attention);
                        String strH2 = ez60Var.H(R.string.unacceptable_account_for_section);
                        String strH3 = ez60Var.H(R.string.ok);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "CHANGE_BALANCE_TO_PRIMARY_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC = ez60Var.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (v570Var instanceof r570) {
                        iiy[] iiyVarArr2 = ez60.S1;
                        Context contextD = ez60Var.D();
                        boolean zJ = contextD != null ? sj3.J(contextD) : true;
                        if (zJ) {
                            List listP = ez60Var.C().c.p();
                            ArrayList arrayListU = twn.u(listP);
                            for (Object obj2 : listP) {
                                if (obj2 instanceof u0i) {
                                    arrayListU.add(obj2);
                                }
                            }
                            Iterator it = arrayListU.iterator();
                            while (it.hasNext()) {
                                ((u0i) it.next()).y0();
                            }
                        } else {
                            cz60 cz60Var = new cz60(0, ez60Var.H0(), g670.class, "onNavigationDialogPositiveClick", "onNavigationDialogPositiveClick$games_list()V", 0, (byte) 1);
                            cz60 cz60Var2 = new cz60(0, ez60Var.H0(), g670.class, "onNavigationDialogNegativeClick", "onNavigationDialogNegativeClick$games_list()V", 0, (byte) 2);
                            ii iiVar2 = ez60Var.N1;
                            if (iiVar2 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            kpb.w0(ez60Var, zJ, cz60Var, cz60Var2, iiVar2);
                        }
                    } else if (v570Var instanceof u570) {
                        iiy[] iiyVarArr3 = ez60.S1;
                        ez60Var.w0(new Intent("android.settings.SETTINGS"));
                    } else if (v570Var instanceof p570) {
                        iiy[] iiyVarArr4 = ez60.S1;
                        ((k370) kiu0Var.getValue()).y(y270.f41893a);
                    } else if (v570Var instanceof q570) {
                        iiy[] iiyVarArr5 = ez60.S1;
                        ((k370) kiu0Var.getValue()).y(new z270(false));
                    } else if (v570Var instanceof o570) {
                        iiy[] iiyVarArr6 = ez60.S1;
                        ((k370) kiu0Var.getValue()).y(x270.f40154a);
                    } else if (v570Var instanceof s570) {
                        iiy[] iiyVarArr7 = ez60.S1;
                        ii iiVar3 = ez60Var.N1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = ez60Var.H(R.string.attention);
                        String strH5 = ez60Var.H(R.string.selected_balance_unavailable_description);
                        String strH6 = ez60Var.H(R.string.ok);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, "CHANGE_BALANCE_TO_PRIMARY_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC2 = ez60Var.C();
                        eVarC2.getClass();
                        iiVar3.d(dialogFields2, eVarC2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                b370 b370Var = (b370) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr8 = ez60.S1;
                g670 g670VarH0 = ez60Var.H0();
                pat patVar = b370Var.f1889a;
                pat patVar2 = b370Var.b;
                patVar.getClass();
                patVar2.getClass();
                p7m0 p7m0Var = g670VarH0.B;
                p7m0Var.getClass();
                p7m0Var.o(null, patVar);
                p7m0 p7m0Var2 = g670VarH0.C;
                p7m0Var2.getClass();
                p7m0Var2.o(null, patVar2);
                return Unit.f46060a;
        }
    }
}
