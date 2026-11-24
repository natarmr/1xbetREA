package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class orc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ qrc0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ orc0(qrc0 qrc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qrc0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qrc0 qrc0Var = this.k;
        switch (b) {
            case 0:
                return new orc0(qrc0Var, yjeVar, (byte) 0);
            case 1:
                return new orc0(qrc0Var, yjeVar, (byte) 1);
            case 2:
                return new orc0(qrc0Var, yjeVar, (byte) 2);
            default:
                orc0 orc0Var = new orc0(qrc0Var, yjeVar, (byte) 3);
                orc0Var.j = ((Boolean) obj).booleanValue();
                return orc0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((orc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((orc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((orc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((orc0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objW;
        Object value;
        Object objA;
        Object value2;
        Object objA2;
        Object value3;
        byte b = this.i;
        qrc0 qrc0Var = this.k;
        switch (b) {
            case 0:
                vzg0 vzg0Var = qrc0Var.o;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    b4j b4jVar = qrc0Var.D;
                    long id = ((zqc0) qrc0Var.D()).e.getId();
                    String str = ((zqc0) qrc0Var.D()).k;
                    b4jVar.getClass();
                    str.getClass();
                    b4jVar.f1961a.a("promo_buy", xp20.f(new Pair("promo_id", Long.valueOf(id)), new Pair("screen", str)));
                    rrd rrdVar = qrc0Var.x;
                    int i = ((zqc0) qrc0Var.D()).h;
                    long id2 = ((zqc0) qrc0Var.D()).e.getId();
                    xg8 type = ((zqc0) qrc0Var.D()).e.getType();
                    this.j = true;
                    objW = rrdVar.w(i, id2, type, this);
                    if (objW == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objW = obj;
                }
                f8c0 f8c0Var = (f8c0) objW;
                int iH0 = ((zqc0) qrc0Var.D()).e.h0();
                vzg0Var.e("AMOUNT_KEY", new Integer(iH0));
                vzg0Var.e("GAME_COUNT_KEY", new Integer(1));
                p7m0 p7m0Var = qrc0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, zqc0.a((zqc0) value, false, false, null, null, iH0, 1, f8c0Var.c, f8c0Var.g, f8c0Var.i, f8c0Var.f, f8c0Var.h, 3199)));
                h97.r(((zqc0) qrc0Var.D()).e.getId(), qrc0Var.C.f40143a, 3307L);
                String str2 = f8c0Var.b;
                String str3 = f8c0Var.b;
                if (str2.length() > 0) {
                    ctf0 ctf0Var = qrc0Var.F;
                    if (((zqc0) qrc0Var.D()).l && ((zqc0) qrc0Var.D()).f == src0.d) {
                        lsm0 lsm0Var = ctf0Var.b;
                        lsm0 lsm0Var2 = ctf0Var.b;
                        qrc0Var.G(new vqc0(new DialogFields((CharSequence) lsm0Var.a(R.string.success, Arrays.copyOf(new Object[0], 0)), (CharSequence) str3, (CharSequence) lsm0Var2.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.promo_shop_details_goto_fame_button_title, Arrays.copyOf(new Object[0], 0)), (String) null, "OPEN_GAME_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1488)));
                    } else if (((zqc0) qrc0Var.D()).f == src0.d || ((zqc0) qrc0Var.D()).f == src0.f) {
                        qrc0Var.G(new wqc0(new DialogFields((CharSequence) ctf0Var.b.a(R.string.success, Arrays.copyOf(new Object[0], 0)), (CharSequence) str3, (CharSequence) ctf0Var.b.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1528)));
                    } else {
                        lsm0 lsm0Var3 = ctf0Var.b;
                        lsm0 lsm0Var4 = ctf0Var.b;
                        String strA = lsm0Var3.a(R.string.success, Arrays.copyOf(new Object[0], 0));
                        String str4 = f8c0Var.d;
                        qrc0Var.G(new xqc0(str4, lsm0Var4.a(R.string.promo_shop_promo_code_bought_message_v2, Arrays.copyOf(new Object[]{str4}, 1)), strA, lsm0Var4.a(R.string.ok, Arrays.copyOf(new Object[0], 0))));
                    }
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gpu gpuVar = qrc0Var.s;
                    long id3 = ((zqc0) qrc0Var.D()).f.getId();
                    long id4 = ((zqc0) qrc0Var.D()).e.getId();
                    this.j = true;
                    objA = gpuVar.a(id3, id4, this);
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                List list = (List) objA;
                int i2 = qrc0.K;
                p7m0 p7m0Var2 = qrc0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, zqc0.a((zqc0) value2, false, false, list, null, 0, 0, 0, 0L, 0.0d, null, false, 65527)));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    qrc0Var.D.l(((zqc0) qrc0Var.D()).m, "bonus_game_buy_popup");
                    qrc0Var.C.s(((zqc0) qrc0Var.D()).m, "bonus_game_buy_popup");
                    dcu dcuVar = qrc0Var.w;
                    long j = ((zqc0) qrc0Var.D()).m;
                    this.j = true;
                    objA2 = dcuVar.a(j, this);
                    if (objA2 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                boolean zBooleanValue = ((Boolean) objA2).booleanValue();
                t470 t470Var = a570.Companion;
                long j2 = ((zqc0) qrc0Var.D()).m;
                boolean z4 = ((zqc0) qrc0Var.D()).p;
                t470Var.getClass();
                a570 a570VarA = t470.a(z4, j2);
                if (((zqc0) qrc0Var.D()).e.getType() == xg8.BONUS_GAME) {
                    uf3 uf3Var = qrc0Var.A;
                    long j3 = ((zqc0) qrc0Var.D()).m;
                    uf3Var.getClass();
                    FragmentScreen fragmentScreenF = ((esg0) uf3Var.e.f10231a).S().f(j3, a570VarA, "", zBooleanValue);
                    i1w0 i1w0VarC = qrc0Var.z.c();
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                    if (fragmentScreenF instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenF)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenF)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0VarC.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    sac.V(jiu0.a(qrc0Var), new lrc0(qrc0Var, a570VarA, zBooleanValue, (byte) 0), null, qrc0Var.y.b, new o690(qrc0Var, a570VarA, zBooleanValue, (yje) null), 10);
                }
                return Unit.f46060a;
            default:
                boolean z5 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if ((((zqc0) qrc0Var.D()).f44802a || ((zqc0) qrc0Var.D()).b) && z5) {
                    qrc0Var.M();
                    qrc0Var.N();
                } else if (!z5 && ((zqc0) qrc0Var.D()).f44802a) {
                    p7m0 p7m0Var3 = qrc0Var.i.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, zqc0.a((zqc0) value3, false, true, null, null, 0, 0, 0, 0L, 0.0d, null, false, 65532)));
                }
                return Unit.f46060a;
        }
    }
}
