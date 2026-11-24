package a;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class zna0 implements ugi0, vj9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44667a;
    public final pjt b;
    public final int c;
    public int d;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final a8z i;
    public final a8z j;
    public final a8z k;

    public zna0(String str, pjt pjtVar, int i) {
        str.getClass();
        this.f44667a = str;
        this.b = pjtVar;
        this.c = i;
        this.d = -1;
        String[] strArr = new String[i];
        final byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.h = lunVar;
        wez wezVar = wez.f39042a;
        this.i = maz.a(wezVar, new Function0(this) { // from class: a.yna0
            public final /* synthetic */ zna0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                jiy[] jiyVarArrChildSerializers;
                ArrayList arrayList;
                jiy[] jiyVarArrTypeParametersSerializers;
                byte b2 = b;
                zna0 zna0Var = this.b;
                switch (b2) {
                    case 0:
                        pjt pjtVar2 = zna0Var.b;
                        return (pjtVar2 == null || (jiyVarArrChildSerializers = pjtVar2.childSerializers()) == null) ? lv00.k : jiyVarArrChildSerializers;
                    case 1:
                        pjt pjtVar3 = zna0Var.b;
                        if (pjtVar3 == null || (jiyVarArrTypeParametersSerializers = pjtVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(jiyVarArrTypeParametersSerializers.length);
                            for (jiy jiyVar : jiyVarArrTypeParametersSerializers) {
                                arrayList.add(jiyVar.getDescriptor());
                            }
                        }
                        return j2e.M(arrayList);
                    default:
                        return Integer.valueOf(n2x.D(zna0Var, (ugi0[]) zna0Var.j.getValue()));
                }
            }
        });
        final byte b2 = 1;
        this.j = maz.a(wezVar, new Function0(this) { // from class: a.yna0
            public final /* synthetic */ zna0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                jiy[] jiyVarArrChildSerializers;
                ArrayList arrayList;
                jiy[] jiyVarArrTypeParametersSerializers;
                byte b3 = b2;
                zna0 zna0Var = this.b;
                switch (b3) {
                    case 0:
                        pjt pjtVar2 = zna0Var.b;
                        return (pjtVar2 == null || (jiyVarArrChildSerializers = pjtVar2.childSerializers()) == null) ? lv00.k : jiyVarArrChildSerializers;
                    case 1:
                        pjt pjtVar3 = zna0Var.b;
                        if (pjtVar3 == null || (jiyVarArrTypeParametersSerializers = pjtVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(jiyVarArrTypeParametersSerializers.length);
                            for (jiy jiyVar : jiyVarArrTypeParametersSerializers) {
                                arrayList.add(jiyVar.getDescriptor());
                            }
                        }
                        return j2e.M(arrayList);
                    default:
                        return Integer.valueOf(n2x.D(zna0Var, (ugi0[]) zna0Var.j.getValue()));
                }
            }
        });
        final byte b3 = 2;
        this.k = maz.a(wezVar, new Function0(this) { // from class: a.yna0
            public final /* synthetic */ zna0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                jiy[] jiyVarArrChildSerializers;
                ArrayList arrayList;
                jiy[] jiyVarArrTypeParametersSerializers;
                byte b4 = b3;
                zna0 zna0Var = this.b;
                switch (b4) {
                    case 0:
                        pjt pjtVar2 = zna0Var.b;
                        return (pjtVar2 == null || (jiyVarArrChildSerializers = pjtVar2.childSerializers()) == null) ? lv00.k : jiyVarArrChildSerializers;
                    case 1:
                        pjt pjtVar3 = zna0Var.b;
                        if (pjtVar3 == null || (jiyVarArrTypeParametersSerializers = pjtVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(jiyVarArrTypeParametersSerializers.length);
                            for (jiy jiyVar : jiyVarArrTypeParametersSerializers) {
                                arrayList.add(jiyVar.getDescriptor());
                            }
                        }
                        return j2e.M(arrayList);
                    default:
                        return Integer.valueOf(n2x.D(zna0Var, (ugi0[]) zna0Var.j.getValue()));
                }
            }
        });
    }

    @Override // a.vj9
    public final Set a() {
        return this.h.keySet();
    }

    @Override // a.ugi0
    public final int c(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // a.ugi0
    public final int d() {
        return this.c;
    }

    @Override // a.ugi0
    public final String e(int i) {
        return this.e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zna0) {
            ugi0 ugi0Var = (ugi0) obj;
            if (Intrinsics.d(this.f44667a, ugi0Var.h()) && Arrays.equals((ugi0[]) this.j.getValue(), (ugi0[]) ((zna0) obj).j.getValue())) {
                int iD = ugi0Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (Intrinsics.d(g(i2).h(), ugi0Var.g(i2).h()) && Intrinsics.d(g(i2).l(), ugi0Var.g(i2).l())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // a.ugi0
    public final List f(int i) {
        List list = this.f[i];
        return list == null ? iun.f15405a : list;
    }

    @Override // a.ugi0
    public ugi0 g(int i) {
        return ((jiy[]) this.i.getValue())[i].getDescriptor();
    }

    @Override // a.ugi0
    public final List getAnnotations() {
        return iun.f15405a;
    }

    @Override // a.ugi0
    public final String h() {
        return this.f44667a;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // a.ugi0
    public final boolean i(int i) {
        return this.g[i];
    }

    public final void j(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public final void k(Annotation annotation) {
        annotation.getClass();
        int i = this.d;
        List[] listArr = this.f;
        List arrayList = listArr[i];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            listArr[this.d] = arrayList;
        }
        arrayList.add(annotation);
    }

    @Override // a.ugi0
    public c3x l() {
        return aum0.b;
    }

    public String toString() {
        return n2x.R(this);
    }
}
