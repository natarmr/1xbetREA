package a;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rz40 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31340a;
    public final jiy b;
    public final ugi0 c;

    public rz40(jiy jiyVar, byte b) {
        this.f31340a = b;
        jiyVar.getClass();
        switch (b) {
            case 1:
                jiy jiyVarSerializer = jnk0.Companion.serializer(jiyVar);
                this.b = jiyVarSerializer;
                this.c = jiyVarSerializer.getDescriptor();
                break;
            default:
                this.b = jiyVar;
                c3x c3xVarL = jiyVar.getDescriptor().l();
                this.c = c3xVarL instanceof zvb0 ? x2x.j("kotlinx.coroutines.flow.MutableStateFlow", (zvb0) c3xVarL) : x2x.o("kotlinx.coroutines.flow.MutableStateFlow", jiyVar.getDescriptor());
                break;
        }
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        byte b = this.f31340a;
        jiy jiyVar = this.b;
        switch (b) {
            case 0:
                return q7m0.a(rkjVar.w(jiyVar));
            default:
                jnk0 jnk0Var = (jnk0) rkjVar.w(jiyVar);
                List list = jnk0Var.f16818a;
                int size = list.size();
                List list2 = jnk0Var.b;
                if (size != list2.size()) {
                    jf4.o("Failed requirement.");
                    return null;
                }
                SparseArray sparseArray = new SparseArray(list.size());
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    sparseArray.append(((Number) list.get(i)).intValue(), list2.get(i));
                }
                return sparseArray;
        }
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        byte b = this.f31340a;
        return this.c;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        byte b = this.f31340a;
        jiy jiyVar = this.b;
        switch (b) {
            case 0:
                qz40 qz40Var = (qz40) obj;
                qz40Var.getClass();
                bwnVar.C(jiyVar, ((p7m0) qz40Var).getValue());
                break;
            default:
                SparseArray sparseArray = (SparseArray) obj;
                sparseArray.getClass();
                int size = sparseArray.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(Integer.valueOf(sparseArray.keyAt(i)));
                }
                int size2 = sparseArray.size();
                ArrayList arrayList2 = new ArrayList(size2);
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(sparseArray.valueAt(i2));
                }
                bwnVar.C(jiyVar, new jnk0(arrayList, arrayList2));
                break;
        }
    }
}
