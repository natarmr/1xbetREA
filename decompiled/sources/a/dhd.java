package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dhd implements cer {
    @Override // a.cer
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, fet fetVar, Integer num) {
        int i;
        mm40 mm40Var = (mm40) obj;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        oje ojeVar = (oje) obj4;
        xdr xdrVar = (xdr) obj5;
        Function0 function0 = (Function0) obj6;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            i = (fetVar.g(mm40Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= fetVar.g(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= fetVar.h(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= fetVar.g(ojeVar) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= fetVar.i(xdrVar) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= fetVar.i(function0) ? 131072 : 65536;
        }
        if (fetVar.U(i & 1, (599187 & i) != 599186)) {
            rje.c(str, zBooleanValue, ojeVar, mm40Var, xdrVar, function0, fetVar, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
