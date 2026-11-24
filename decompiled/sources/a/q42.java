package a;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q42 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28076a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ q42(pz40 pz40Var, byte b) {
        this.f28076a = b;
        this.b = pz40Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        lkz lkzVar;
        byte b = this.f28076a;
        jm40 jm40Var = jm40.b;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                y5d y5dVar = (y5d) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                jdk0 jdk0Var = t42.p2;
                y5dVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(y5dVar) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 0.0f, 24.0f, 0.0f, 0.0f, 13), ((d52) pz40Var.getValue()).f5483a, 0L, 0, 0L, fetVar, 0, 28);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ob50 ob50Var = (ob50) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(ob50Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    List list = (List) pz40Var.getValue();
                    boolean z = (iIntValue2 & 14) == 4;
                    Object objP = fetVar2.P();
                    if (z || objP == ukd.f35823a) {
                        objP = new b33((Object) ob50Var, (byte) 19);
                        fetVar2.o0(objP);
                    }
                    Function1 function1 = (Function1) objP;
                    if (list instanceof RandomAccess) {
                        int size = list.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                lkzVar = lkz.c;
                            } else if (((Boolean) function1.invoke(list.get(i))).booleanValue()) {
                                lkzVar = lkz.e;
                            } else {
                                i++;
                            }
                        }
                    } else {
                        if (list == null || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((Boolean) function1.invoke(it.next())).booleanValue()) {
                                        lkzVar = lkz.e;
                                    }
                                }
                            }
                        }
                        lkzVar = lkz.c;
                    }
                    obc.d(or00.f25714a.a(r8x.V(lkzVar, fetVar2, 2)), u1c.M(-1713684244, new yb5(ob50Var, (byte) 0), fetVar2), fetVar2, 56);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 6.0f, 0.0f, 0.0f, 13);
                    String str = ((u2e0) pz40Var.getValue()).g;
                    long secondary = ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary();
                    ((g1t0) fetVar3.k(j1t0.e)).getClass();
                    v8q0.a(str, mm40VarN, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 6, 0, null, g1t0.k(), fetVar3, 0, 24960, 109560);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
