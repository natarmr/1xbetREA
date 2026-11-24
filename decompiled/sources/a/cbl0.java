package a;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cbl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4066a;
    public final /* synthetic */ gbl0 b;

    public /* synthetic */ cbl0(gbl0 gbl0Var, byte b) {
        this.f4066a = b;
        this.b = gbl0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f4066a;
        gbl0 gbl0Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                lme0 lme0Var = gbl0.c2;
                str.getClass();
                ncl0 ncl0VarJ0 = gbl0Var.J0();
                ncl0VarJ0.i.d(new u5l0(ncl0VarJ0, str, (byte) 4));
                break;
            default:
                lme0 lme0Var2 = gbl0.c2;
                str.getClass();
                ncl0 ncl0VarJ1 = gbl0Var.J0();
                i1w0 i1w0Var = ncl0VarJ1.i;
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI.h(((zfm0) ncl0VarJ1.k).a(ncl0VarJ1.j.b, str));
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
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
