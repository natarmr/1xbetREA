package a;

import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class ze5 extends w46 {
    public final b5v b;
    public final nw20 c;
    public final j910 d;
    public final u8u e;
    public final b5v f;
    public final g090 g;
    public final cad h;
    public final ocl i;
    public final mne j;
    public final ArrayList k = new ArrayList();
    public final p7m0 l = q7m0.a(ee5.f7653a);

    public ze5(b5v b5vVar, nw20 nw20Var, j910 j910Var, u8u u8uVar, b5v b5vVar2, g090 g090Var, cad cadVar, ocl oclVar, mne mneVar) {
        this.b = b5vVar;
        this.c = nw20Var;
        this.d = j910Var;
        this.e = u8uVar;
        this.f = b5vVar2;
        this.g = g090Var;
        this.h = cadVar;
        this.i = oclVar;
        this.j = mneVar;
    }

    public final boolean w(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.k) {
            if (((bby) obj).isActive()) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() == z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object x(long j, String str, String str2, rwn rwnVar, zje zjeVar) {
        ue5 ue5Var;
        String str3;
        Object objD0;
        String str4;
        long j2;
        rwn rwnVar2 = rwnVar;
        if (zjeVar instanceof ue5) {
            ue5Var = (ue5) zjeVar;
            int i = ue5Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ue5Var.o = i - Integer.MIN_VALUE;
            } else {
                ue5Var = new ue5(this, zjeVar);
            }
        } else {
            ue5Var = new ue5(this, zjeVar);
        }
        Object obj = ue5Var.m;
        wne wneVar = wne.f39444a;
        int i2 = ue5Var.o;
        if (i2 == 0) {
            z1x.P(obj);
            str3 = str;
            ue5Var.j = str3;
            ue5Var.k = str2;
            ue5Var.l = rwnVar2;
            ue5Var.i = j;
            ue5Var.o = 1;
            u8u u8uVar = this.e;
            u8uVar.getClass();
            if (rwnVar2 != null) {
                yje yjeVar = null;
                if (rwnVar2 instanceof pwn) {
                    xex xexVar = (xex) u8uVar.c;
                    objD0 = qjj.d0(((mne) xexVar.f40764a).b, new ke5(xexVar, str2, ((pwn) rwnVar2).f27719a, yjeVar, (byte) 0), ue5Var);
                } else if (rwnVar2 instanceof qwn) {
                    xex xexVar2 = (xex) u8uVar.b;
                    objD0 = qjj.d0(((mne) xexVar2.f40764a).b, new ke5(xexVar2, str2, ((qwn) rwnVar2).f29443a, yjeVar, (byte) 0), ue5Var);
                }
                if (objD0 == wneVar) {
                    return wneVar;
                }
                str4 = str2;
                j2 = j;
            }
            t9f.b();
            return null;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = ue5Var.i;
        rwnVar2 = ue5Var.l;
        str4 = ue5Var.k;
        String str5 = ue5Var.j;
        z1x.P(obj);
        objD0 = obj;
        str3 = str5;
        rwn rwnVar3 = rwnVar2;
        String str6 = str4;
        this.k.add(sac.V(jiu0.a(this), new dc0((Object) this, (Object) str6, (Object) rwnVar3, (Object) str3, (byte) 11), null, this.j.c, new we5(this, str3, (File) objD0, j2, str4, rwnVar3, null, (byte) 0), 10));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object y(String str, long j, String str2, xwn xwnVar, zje zjeVar) {
        xe5 xe5Var;
        String str3;
        Object objD0;
        String str4;
        long j2;
        xwn xwnVar2 = xwnVar;
        if (zjeVar instanceof xe5) {
            xe5Var = (xe5) zjeVar;
            int i = xe5Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                xe5Var.o = i - Integer.MIN_VALUE;
            } else {
                xe5Var = new xe5(this, zjeVar);
            }
        } else {
            xe5Var = new xe5(this, zjeVar);
        }
        Object obj = xe5Var.m;
        wne wneVar = wne.f39444a;
        int i2 = xe5Var.o;
        if (i2 == 0) {
            z1x.P(obj);
            str3 = str;
            xe5Var.i = str3;
            xe5Var.j = str2;
            xe5Var.k = xwnVar2;
            xe5Var.l = j;
            xe5Var.o = 1;
            b5v b5vVar = this.b;
            b5vVar.getClass();
            if (xwnVar2 != null) {
                yje yjeVar = null;
                if (xwnVar2 instanceof vwn) {
                    xex xexVar = b5vVar.f2024a;
                    objD0 = qjj.d0(((mne) xexVar.f40764a).b, new ke5(xexVar, str2, ((vwn) xwnVar2).f38160a, yjeVar, (byte) 1), xe5Var);
                } else if (xwnVar2 instanceof wwn) {
                    xex xexVar2 = b5vVar.b;
                    objD0 = qjj.d0(((mne) xexVar2.f40764a).b, new ke5(xexVar2, str2, ((wwn) xwnVar2).f39892a, yjeVar, (byte) 1), xe5Var);
                }
                if (objD0 == wneVar) {
                    return wneVar;
                }
                str4 = str2;
                j2 = j;
            }
            t9f.b();
            return null;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = xe5Var.l;
        xwnVar2 = xe5Var.k;
        str4 = xe5Var.j;
        String str5 = xe5Var.i;
        z1x.P(obj);
        objD0 = obj;
        str3 = str5;
        xwn xwnVar3 = xwnVar2;
        String str6 = str4;
        this.k.add(sac.V(jiu0.a(this), new dc0((Object) this, (Object) str6, (Object) xwnVar3, (Object) str3, (byte) 10), null, this.j.c, new we5(this, str3, (File) objD0, j2, str4, xwnVar3, null, (byte) 1), 10));
        return Unit.f46060a;
    }
}
