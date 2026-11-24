package a;

import android.content.Context;
import android.os.Handler;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.domino.presentation.views.DominoHandView;
import org.xplatform.domino.presentation.views.DominoTableView;

/* JADX INFO: loaded from: classes4.dex */
public final class qzk extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ szk k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qzk(szk szkVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = szkVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        szk szkVar = this.k;
        switch (b) {
            case 0:
                qzk qzkVar = new qzk(szkVar, yjeVar, (byte) 0);
                qzkVar.j = obj;
                return qzkVar;
            default:
                qzk qzkVar2 = new qzk(szkVar, yjeVar, (byte) 1);
                qzkVar2.j = obj;
                return qzkVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qzk) create((tzk) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qzk) create((b0l) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        szk szkVar = this.k;
        int i = 0;
        byte b2 = 1;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                tzk tzkVar = (tzk) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(tzkVar, tzk.f34808a)) {
                    iiy[] iiyVarArr = szk.Q1;
                    szkVar.H0(false);
                } else if (Intrinsics.d(tzkVar, tzk.c)) {
                    iiy[] iiyVarArr2 = szk.Q1;
                    szkVar.K0(false);
                } else {
                    if (!Intrinsics.d(tzkVar, tzk.b)) {
                        t9f.b();
                        return null;
                    }
                    iiy[] iiyVarArr3 = szk.Q1;
                    szkVar.H0(true);
                }
                return Unit.f46060a;
            default:
                b0l b0lVar = (b0l) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (b0lVar != null) {
                    if (b0lVar instanceof uzk) {
                        iiy[] iiyVarArr4 = szk.Q1;
                        ((Button) szkVar.I0().b.f).setEnabled(true);
                    } else if (b0lVar instanceof vzk) {
                        iiy[] iiyVarArr5 = szk.Q1;
                        DominoHandView dominoHandView = (DominoHandView) szkVar.I0().b.h;
                        dominoHandView.u = 0;
                        dominoHandView.b = dominoHandView.q ? dominoHandView.c : dominoHandView.d;
                    } else if (b0lVar instanceof yzk) {
                        n0l n0lVar = ((yzk) b0lVar).f43517a;
                        iiy[] iiyVarArr6 = szk.Q1;
                        szkVar.K0(true);
                        DominoHandView dominoHandView2 = (DominoHandView) szkVar.I0().b.h;
                        dominoHandView2.u = 0;
                        dominoHandView2.b = dominoHandView2.q ? dominoHandView2.c : dominoHandView2.d;
                        ((DominoHandView) szkVar.I0().b.h).setBones(7);
                        ((DominoHandView) szkVar.I0().b.n).setBones(n0lVar.d);
                        ((DominoTableView) szkVar.I0().b.k).d(null, null);
                        szkVar.G0(n0lVar);
                        List list = n0lVar.l;
                        if (list == null || list.isEmpty()) {
                            szkVar.L0(n0lVar);
                            szkVar.G0(n0lVar);
                            szkVar.P1 = n0lVar;
                        } else {
                            szkVar.J0().z(new ozk(szkVar, n0lVar, (byte) 2));
                        }
                    } else if (b0lVar instanceof xzk) {
                        n0l n0lVar2 = ((xzk) b0lVar).f41758a;
                        int i2 = n0lVar2.f22703a;
                        int i3 = n0lVar2.r;
                        iiy[] iiyVarArr7 = szk.Q1;
                        n0l n0lVar3 = szkVar.P1;
                        if (((n0lVar3 != null ? n0lVar3.r - i3 : 0) + (n0lVar3 != null ? n0lVar3.f22703a : 0)) - 1 == i2) {
                            if (n0lVar3 == null || n0lVar3.r != i3) {
                                int i4 = (i2 - (n0lVar3 != null ? n0lVar3.f22703a : 0)) + 1;
                                while (i < i4) {
                                    ((DominoHandView) szkVar.I0().b.h).c();
                                    i++;
                                }
                            }
                            szkVar.J0().z(new ozk(szkVar, n0lVar2, b2));
                        } else {
                            if (i2 > ((DominoHandView) szkVar.I0().b.h).e.size()) {
                                int size = i2 - ((DominoHandView) szkVar.I0().b.h).e.size();
                                while (i < size) {
                                    ((DominoHandView) szkVar.I0().b.h).c();
                                    i++;
                                }
                            }
                            szkVar.L0(n0lVar2);
                            szkVar.P1 = n0lVar2;
                        }
                    } else if (b0lVar instanceof zzk) {
                        n0l n0lVar4 = ((zzk) b0lVar).f45258a;
                        iiy[] iiyVarArr8 = szk.Q1;
                        DominoHandView dominoHandView3 = (DominoHandView) szkVar.I0().b.n;
                        List<List> list2 = n0lVar4.d;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                        ArrayList arrayList = dominoHandView3.e;
                        list2.getClass();
                        for (List list3 : list2) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    qb8 qb8Var = (qb8) it.next();
                                    int iIntValue = ((Number) list3.get(0)).intValue();
                                    int iIntValue2 = ((Number) list3.get(1)).intValue();
                                    int i5 = qb8Var.p;
                                    if ((iIntValue != i5 || iIntValue2 != qb8Var.q) && (iIntValue != qb8Var.q || iIntValue2 != i5)) {
                                    }
                                } else {
                                    Context context = dominoHandView3.getContext();
                                    context.getClass();
                                    qb8 qb8Var2 = new qb8(context, dominoHandView3.c, ((Number) list3.get(0)).intValue(), ((Number) list3.get(1)).intValue());
                                    qb8Var2.n = dominoHandView3.q;
                                    DominoTableView dominoTableView = dominoHandView3.k;
                                    if (dominoTableView == null) {
                                        Intrinsics.h("tableView");
                                        throw null;
                                    }
                                    int headValue = dominoTableView.getHeadValue();
                                    DominoTableView dominoTableView2 = dominoHandView3.k;
                                    if (dominoTableView2 == null) {
                                        Intrinsics.h("tableView");
                                        throw null;
                                    }
                                    boolean zB = qb8Var2.b(headValue, dominoTableView2.getTailValue());
                                    qb8Var2.s = zB;
                                    dominoHandView3.r += zB ? 1 : 0;
                                    int i6 = dominoHandView3.g >> 1;
                                    qb8Var2.f28435a.set(-dominoHandView3.h, (dominoHandView3.getMeasuredWidth() >> 1) - i6, 0, (dominoHandView3.getMeasuredWidth() >> 1) + i6);
                                    arrayList.add(qb8Var2);
                                    dominoHandView3.a(700, true);
                                    szkVar.L0(n0lVar4);
                                    szkVar.P1 = n0lVar4;
                                }
                            }
                        }
                        szkVar.L0(n0lVar4);
                        szkVar.P1 = n0lVar4;
                    } else if (b0lVar instanceof a0l) {
                        List list4 = ((a0l) b0lVar).f30a;
                        iiy[] iiyVarArr9 = szk.Q1;
                        new Handler().postDelayed(new a4e((DominoHandView) szkVar.I0().b.h, list4), 1000L);
                    } else if (b0lVar instanceof wzk) {
                        n0l n0lVar5 = ((wzk) b0lVar).f40024a;
                        n0lVar5.getClass();
                        szkVar.K0(true);
                        ((DominoHandView) szkVar.I0().b.n).setBones(n0lVar5.d);
                        ((DominoHandView) szkVar.I0().b.h).setBones(n0lVar5.f22703a);
                        ((DominoTableView) szkVar.I0().b.k).d(n0lVar5.l, n0lVar5.j);
                        szkVar.L0(n0lVar5);
                        szkVar.G0(n0lVar5);
                        szkVar.P1 = n0lVar5;
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
