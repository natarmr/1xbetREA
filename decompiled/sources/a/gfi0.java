package a;

import java.util.Date;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public interface gfi0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Object a(gfi0 gfi0Var, String str, rei0 rei0Var, g45 g45Var, zje zjeVar) {
        ffi0 ffi0Var;
        rei0 qei0Var;
        if (zjeVar instanceof ffi0) {
            ffi0Var = (ffi0) zjeVar;
            int i = ffi0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ffi0Var.n = i - Integer.MIN_VALUE;
            } else {
                ffi0Var = new ffi0(gfi0Var, zjeVar);
            }
        } else {
            ffi0Var = new ffi0(gfi0Var, zjeVar);
        }
        Object objK = ffi0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = ffi0Var.n;
        if (i2 == 0) {
            z1x.P(objK);
            p7m0 p7m0Var = ((vae) g45Var.b).r;
            ffi0Var.i = str;
            ffi0Var.j = rei0Var;
            ffi0Var.k = g45Var;
            ffi0Var.n = 1;
            objK = ntb.K(p7m0Var, ffi0Var);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g45Var = ffi0Var.k;
            rei0Var = ffi0Var.j;
            str = ffi0Var.i;
            z1x.P(objK);
        }
        if (!((Boolean) objK).booleanValue()) {
            return Unit.f46060a;
        }
        if (rei0Var != null) {
            if (rei0Var instanceof pei0) {
                pei0 pei0Var = (pei0) rei0Var;
                String str2 = pei0Var.f26855a;
                List list = pei0Var.b;
                Date date = pei0Var.c;
                String str3 = pei0Var.d;
                str2.getClass();
                list.getClass();
                date.getClass();
                str3.getClass();
                qei0Var = new pei0(str2, list, date, str3, true);
            } else if (rei0Var instanceof qei0) {
                qei0 qei0Var2 = (qei0) rei0Var;
                String str4 = qei0Var2.f28586a;
                h8d h8dVar = qei0Var2.b;
                Date date2 = qei0Var2.c;
                String str5 = qei0Var2.d;
                str4.getClass();
                h8dVar.getClass();
                date2.getClass();
                str5.getClass();
                qei0Var = new qei0(str4, h8dVar, date2, str5, true);
            }
            g45Var.b0(str);
            g45Var.d(str, qei0Var);
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    static Unit b(g45 g45Var) {
        i7e i7eVar = (i7e) g45Var.c;
        if (((gxb) i7eVar.i.getValue()).f != null) {
            gxb gxbVar = (gxb) i7eVar.i.getValue();
            v9k0 v9k0Var = gxbVar.f;
            g45Var.j0(gxb.a(gxbVar, false, 0, 0, v9k0Var != null ? new v9k0(new Long(System.currentTimeMillis()), v9k0Var.f37040a) : null, false, null, null, 991));
        }
        return Unit.f46060a;
    }
}
