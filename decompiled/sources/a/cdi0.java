package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.security.api.presentation.models.ConfirmRestoreByAuthenticatorType;

/* JADX INFO: loaded from: classes5.dex */
public final class cdi0 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ ldi0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdi0(yje yjeVar, ldi0 ldi0Var) {
        super(2, yjeVar);
        this.j = ldi0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new cdi0(yjeVar, this.j);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cdi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8 A[LOOP:0: B:23:0x009f->B:25:0x00a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2 A[SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        c5k c5kVar;
        vbi0 vbi0Var;
        FragmentScreen$Companion$invoke$1 fragmentScreen$Companion$invoke$1G;
        i1w0 i1w0Var;
        ListIterator listIteratorP;
        paw pawVar;
        ldi0 ldi0Var = this.j;
        zn00 zn00Var = ldi0Var.w;
        nv20 nv20Var = ldi0Var.l;
        dci0 dci0Var = ldi0Var.c;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            if (dci0Var instanceof aci0) {
                aci0 aci0Var = (aci0) dci0Var;
                if (aci0Var.h) {
                    nv20Var.f(aci0Var.b);
                    aci0 aci0Var2 = (aci0) dci0Var;
                    fragmentScreen$Companion$invoke$1G = zn00Var.z0(new ConfirmRestoreByAuthenticatorType.Confirmation(aci0Var2.f628a, aci0Var2.f, aci0Var2.g, aci0Var2.b, aci0Var2.c, aci0Var2.d, aci0Var2.i));
                } else {
                    if (dci0Var instanceof vbi0) {
                        vbi0Var = (vbi0) dci0Var;
                        if (vbi0Var.g) {
                            nv20Var.f(vbi0Var.b);
                            qud qudVar = ldi0Var.k;
                            vbi0 vbi0Var2 = (vbi0) dci0Var;
                            swp0 swp0Var = vbi0Var2.b;
                            String str = swp0Var.b;
                            String str2 = swp0Var.f32933a;
                            String str3 = vbi0Var2.f37143a;
                            int i = vbi0Var2.c;
                            String str4 = vbi0Var2.h;
                            we50 we50Var = vbi0Var2.i;
                            List list = vbi0Var2.d;
                            List list2 = vbi0Var2.e;
                            qudVar.getClass();
                            fragmentScreen$Companion$invoke$1G = qud.g(i, we50Var, str, str2, str3, str4, list, list2);
                        }
                    }
                    c5kVar = ldi0Var.g;
                    this.i = true;
                    if (c5kVar.o(this) == wneVar) {
                        return wneVar;
                    }
                }
            } else {
                if (dci0Var instanceof vbi0) {
                    vbi0Var = (vbi0) dci0Var;
                    if (vbi0Var.g) {
                        nv20Var.f(vbi0Var.b);
                        qud qudVar2 = ldi0Var.k;
                        vbi0 vbi0Var3 = (vbi0) dci0Var;
                        swp0 swp0Var2 = vbi0Var3.b;
                        String str5 = swp0Var2.b;
                        String str6 = swp0Var2.f32933a;
                        String str7 = vbi0Var3.f37143a;
                        int i2 = vbi0Var3.c;
                        String str8 = vbi0Var3.h;
                        we50 we50Var2 = vbi0Var3.i;
                        List list3 = vbi0Var3.d;
                        List list4 = vbi0Var3.e;
                        qudVar2.getClass();
                        fragmentScreen$Companion$invoke$1G = qud.g(i2, we50Var2, str5, str6, str7, str8, list3, list4);
                    }
                }
                c5kVar = ldi0Var.g;
                this.i = true;
                if (c5kVar.o(this) == wneVar) {
                    return wneVar;
                }
            }
            i1w0Var = ldi0Var.b;
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new d1w0(fragmentScreen$Companion$invoke$1G)), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                pawVar = (paw) listIteratorP;
                if (pawVar.hasNext()) {
                    return Unit.f46060a;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        fragmentScreen$Companion$invoke$1G = zn00Var.z0(ConfirmRestoreByAuthenticatorType.ConfirmByAuthenticator.f46929a);
        i1w0Var = ldi0Var.b;
        CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
        listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new d1w0(fragmentScreen$Companion$invoke$1G)), i1w0Var, copyOnWriteArrayListQ2, 0);
        while (true) {
            pawVar = (paw) listIteratorP;
            if (pawVar.hasNext()) {
                return Unit.f46060a;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }
}
