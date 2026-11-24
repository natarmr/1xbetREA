package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$TestSectionScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class sej0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ org.xplatform.settings.impl.presentation.a k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sej0(org.xplatform.settings.impl.presentation.a aVar, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = aVar;
        this.l = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.l;
        org.xplatform.settings.impl.presentation.a aVar = this.k;
        switch (b) {
            case 0:
                return new sej0(aVar, str, yjeVar, (byte) 0);
            case 1:
                return new sej0(aVar, str, yjeVar, (byte) 1);
            default:
                return new sej0(aVar, str, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((sej0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objQ;
        Object value;
        Object value2;
        byte b = this.i;
        String str = this.l;
        org.xplatform.settings.impl.presentation.a aVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bbw0 bbw0Var = aVar.X;
                    this.j = true;
                    objQ = bbw0Var.q(str, this);
                    if (objQ == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objQ = obj;
                }
                if (((Boolean) objQ).booleanValue()) {
                    i1w0 i1w0Var = aVar.k;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    aVar.S.getClass();
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
            case 1:
                p7m0 p7m0Var = aVar.X0;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, caj0.a((caj0) value, true, false, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, 33554430)));
                    im4 im4Var = aVar.m0;
                    tl4 tl4Var = new tl4(new ru4(str));
                    this.j = true;
                    im4Var.getClass();
                    if (im4Var.a(tl4Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                do {
                    value2 = p7m0Var.getValue();
                } while (!p7m0Var.m(value2, caj0.a((caj0) value2, false, false, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, 33554430)));
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    nv20 nv20Var = aVar.a0;
                    String strC = ((btt0) ((okt0) aVar.x.f40284a).f25422a).f3200a.c("refresh_token", "");
                    this.j = true;
                    if (nv20Var.e(str, strC, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
