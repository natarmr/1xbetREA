package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class spl0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xpl0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spl0(xpl0 xpl0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xpl0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xpl0 xpl0Var = this.k;
        switch (b) {
            case 0:
                return new spl0(xpl0Var, yjeVar, (byte) 0);
            default:
                return new spl0(xpl0Var, yjeVar, (byte) 1);
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
        return ((spl0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objV;
        Object value;
        byte b = this.i;
        xpl0 xpl0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    u8u u8uVar = xpl0Var.q;
                    this.j = true;
                    objV = u8uVar.v(this);
                    if (objV == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objV = obj;
                }
                Iterable iterable = (Iterable) objV;
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (true) {
                    String str = "";
                    if (!it.hasNext()) {
                        int i = xpl0.P;
                        p7m0 p7m0Var = xpl0Var.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                        } while (!p7m0Var.m(value, hpl0.a((hpl0) value, false, false, null, null, false, new zmf0(dyb.o0(arrayList)), null, null, null, null, null, null, null, null, null, false, 262111)));
                        if (arrayList.isEmpty() && vtb.c0(((hpl0) xpl0Var.D()).d)) {
                            xpl0Var.N("");
                        }
                        return Unit.f46060a;
                    }
                    yeh0 yeh0Var = (yeh0) it.next();
                    long j = yeh0Var.f42486a;
                    String str2 = yeh0Var.b;
                    String str3 = yeh0Var.c;
                    if (kotlin.text.c.x(str3, ujn.h, false)) {
                        str = str3;
                    } else if (str3.length() != 0) {
                        List list = u0d.f34849a;
                        if (!u0d.c(str3)) {
                            str = String.format(Locale.ENGLISH, StringsKt.O(str3, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str3}, 2));
                        }
                    }
                    arrayList.add(new aw40(j, str2, str));
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gmq gmqVarA = xpl0Var.F.a();
                    i6k0 i6k0Var = new i6k0(xpl0Var, (byte) 23);
                    this.j = true;
                    if (gmqVarA.c(i6k0Var, this) == wneVar2) {
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
