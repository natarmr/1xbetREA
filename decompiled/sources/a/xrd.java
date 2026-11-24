package a;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class xrd implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xrd f41364a = new xrd();
    public static final ugi0 b = edy.Companion.serializer().getDescriptor();

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            throw new fhi0();
        }
        edy edyVarI = ncy.i(icyVar.g());
        vby vbyVarD = icyVar.d();
        vbyVarD.getClass();
        return new wrd((ns10) vbyVarD.a(ns10.Companion.serializer(), edyVarI), (coh0) vbyVarD.a(coh0.Companion.serializer(), edyVarI), (lnh0) vbyVarD.a(lnh0.Companion.serializer(), edyVarI), (li0) vbyVarD.a(li0.Companion.serializer(), edyVarI), (lum0) vbyVarD.a(lum0.Companion.serializer(), edyVarI), (fhk0) vbyVarD.a(fhk0.Companion.serializer(), edyVarI), (t490) vbyVarD.a(t490.Companion.serializer(), edyVarI), (ztf0) vbyVarD.a(ztf0.Companion.serializer(), edyVarI), (p8x) vbyVarD.a(p8x.Companion.serializer(), edyVarI), (l7u0) vbyVarD.a(l7u0.Companion.serializer(), edyVarI), (ujg) vbyVarD.a(ujg.Companion.serializer(), edyVarI), (rhp) vbyVarD.a(rhp.Companion.serializer(), edyVarI));
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wrd wrdVar = (wrd) obj;
        wrdVar.getClass();
        scy scyVar = bwnVar instanceof scy ? (scy) bwnVar : null;
        if (scyVar != null) {
            vby vbyVarD = scyVar.d();
            edy edyVarI = ncy.i(vbyVarD.c(ns10.Companion.serializer(), wrdVar.f39636a));
            edy edyVarI2 = ncy.i(vbyVarD.c(coh0.Companion.serializer(), wrdVar.b));
            edy edyVarI3 = ncy.i(vbyVarD.c(lnh0.Companion.serializer(), wrdVar.c));
            edy edyVarI4 = ncy.i(vbyVarD.c(li0.Companion.serializer(), wrdVar.d));
            edy edyVarI5 = ncy.i(vbyVarD.c(lum0.Companion.serializer(), wrdVar.e));
            edy edyVarI6 = ncy.i(vbyVarD.c(fhk0.Companion.serializer(), wrdVar.f));
            edy edyVarI7 = ncy.i(vbyVarD.c(t490.Companion.serializer(), wrdVar.g));
            edy edyVarI8 = ncy.i(vbyVarD.c(ztf0.Companion.serializer(), wrdVar.h));
            edy edyVarI9 = ncy.i(vbyVarD.c(p8x.Companion.serializer(), wrdVar.i));
            edy edyVarI10 = ncy.i(vbyVarD.c(l7u0.Companion.serializer(), wrdVar.j));
            edy edyVarI11 = ncy.i(vbyVarD.c(ujg.Companion.serializer(), wrdVar.k));
            edy edyVarI12 = ncy.i(vbyVarD.c(rhp.Companion.serializer(), wrdVar.l));
            bzu bzuVar = new bzu((byte) 19);
            for (Map.Entry entry : edyVarI.f7643a.entrySet()) {
                bzuVar.h((mcy) entry.getValue(), (String) entry.getKey());
            }
            for (Map.Entry entry2 : edyVarI2.f7643a.entrySet()) {
                bzuVar.h((mcy) entry2.getValue(), (String) entry2.getKey());
            }
            for (Map.Entry entry3 : edyVarI3.f7643a.entrySet()) {
                bzuVar.h((mcy) entry3.getValue(), (String) entry3.getKey());
            }
            for (Map.Entry entry4 : edyVarI4.f7643a.entrySet()) {
                bzuVar.h((mcy) entry4.getValue(), (String) entry4.getKey());
            }
            for (Map.Entry entry5 : edyVarI5.f7643a.entrySet()) {
                bzuVar.h((mcy) entry5.getValue(), (String) entry5.getKey());
            }
            for (Map.Entry entry6 : edyVarI6.f7643a.entrySet()) {
                bzuVar.h((mcy) entry6.getValue(), (String) entry6.getKey());
            }
            for (Map.Entry entry7 : edyVarI7.f7643a.entrySet()) {
                bzuVar.h((mcy) entry7.getValue(), (String) entry7.getKey());
            }
            for (Map.Entry entry8 : edyVarI8.f7643a.entrySet()) {
                bzuVar.h((mcy) entry8.getValue(), (String) entry8.getKey());
            }
            for (Map.Entry entry9 : edyVarI9.f7643a.entrySet()) {
                bzuVar.h((mcy) entry9.getValue(), (String) entry9.getKey());
            }
            for (Map.Entry entry10 : edyVarI10.f7643a.entrySet()) {
                bzuVar.h((mcy) entry10.getValue(), (String) entry10.getKey());
            }
            for (Map.Entry entry11 : edyVarI11.f7643a.entrySet()) {
                bzuVar.h((mcy) entry11.getValue(), (String) entry11.getKey());
            }
            for (Map.Entry entry12 : edyVarI12.f7643a.entrySet()) {
                bzuVar.h((mcy) entry12.getValue(), (String) entry12.getKey());
            }
            scyVar.f(bzuVar.a());
        }
    }
}
