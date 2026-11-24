package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$TestSectionScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class bgj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ngj0 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bgj0(ngj0 ngj0Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ngj0Var;
        this.l = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.l;
        ngj0 ngj0Var = this.k;
        switch (b) {
            case 0:
                return new bgj0(ngj0Var, str, yjeVar, (byte) 0);
            default:
                return new bgj0(ngj0Var, str, yjeVar, (byte) 1);
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
        return ((bgj0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        String str = this.l;
        ngj0 ngj0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bbw0 bbw0Var = ngj0Var.m0;
                    this.j = true;
                    obj = bbw0Var.q(str, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    int i = ngj0.Y0;
                    i1w0 i1w0Var = ngj0Var.B;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ngj0Var.i0.getClass();
                    FragmentScreen testSectionScreen$TestSectionScreen = new TestSectionScreen$TestSectionScreen();
                    if (testSectionScreen$TestSectionScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) testSectionScreen$TestSectionScreen)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(testSectionScreen$TestSectionScreen)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    nv20 nv20Var = ngj0Var.p0;
                    String strC = ((btt0) ((okt0) ngj0Var.N.f40284a).f25422a).f3200a.c("refresh_token", "");
                    this.j = true;
                    if (nv20Var.e(str, strC, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
