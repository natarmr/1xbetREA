package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.bethistory.powerbet.presentation.PowerbetOldScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class y4w extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ z4w j;
    public final /* synthetic */ n3w k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4w(z4w z4wVar, n3w n3wVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = z4wVar;
        this.k = n3wVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new y4w(this.j, this.k, yjeVar, (byte) 0);
            default:
                return new y4w(this.j, this.k, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((y4w) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        n3w n3wVar = this.k;
        z4w z4wVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                z4wVar.u.f(new i4w(n3wVar));
                String strL = kng0.l(z4wVar.k.b.a(R.string.number, Arrays.copyOf(new Object[0], 0)), Separators.SP, n3wVar.f22868a);
                ol60 ol60Var = z4wVar.u;
                if (z4wVar.w == sys0.c) {
                    strL = null;
                }
                if (strL == null) {
                    strL = "";
                }
                ol60Var.f(new q4w(strL));
                z4wVar.C(false);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                z4wVar.h.g(piz.X(n3wVar));
                i1w0 i1w0Var = z4wVar.m;
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                FragmentScreen powerbetOldScreen = new PowerbetOldScreen(n3wVar.f22868a, z4wVar.x);
                if (powerbetOldScreen instanceof DialogScreen) {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) powerbetOldScreen)));
                } else {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(powerbetOldScreen)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (pawVar.hasNext()) {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
        }
        return Unit.f46060a;
    }
}
