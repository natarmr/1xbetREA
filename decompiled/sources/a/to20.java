package a;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class to20 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jiy f34262a;
    public final jiy b;
    public final /* synthetic */ byte c;
    public final wgi0 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public to20(final jiy jiyVar, final jiy jiyVar2, byte b) {
        this(jiyVar, jiyVar2, (char) 0);
        this.c = b;
        final byte b2 = 0;
        jiyVar.getClass();
        jiyVar2.getClass();
        switch (b) {
            case 1:
                this(jiyVar, jiyVar2, (char) 0);
                final byte b3 = 1;
                this.d = x2x.E("kotlin.Pair", new ugi0[0], new Function1() { // from class: a.ro20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b3;
                        jiy jiyVar3 = jiyVar2;
                        jiy jiyVar4 = jiyVar;
                        cmc cmcVar = (cmc) obj;
                        switch (b4) {
                            case 0:
                                cmcVar.getClass();
                                ugi0 descriptor = jiyVar4.getDescriptor();
                                iun iunVar = iun.f15405a;
                                cmcVar.a("key", descriptor, iunVar);
                                cmcVar.a("value", jiyVar3.getDescriptor(), iunVar);
                                break;
                            default:
                                cmcVar.getClass();
                                ugi0 descriptor2 = jiyVar4.getDescriptor();
                                iun iunVar2 = iun.f15405a;
                                cmcVar.a("first", descriptor2, iunVar2);
                                cmcVar.a("second", jiyVar3.getDescriptor(), iunVar2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                this.d = x2x.G("kotlin.collections.Map.Entry", aum0.d, new ugi0[0], new Function1() { // from class: a.ro20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b2;
                        jiy jiyVar3 = jiyVar2;
                        jiy jiyVar4 = jiyVar;
                        cmc cmcVar = (cmc) obj;
                        switch (b4) {
                            case 0:
                                cmcVar.getClass();
                                ugi0 descriptor = jiyVar4.getDescriptor();
                                iun iunVar = iun.f15405a;
                                cmcVar.a("key", descriptor, iunVar);
                                cmcVar.a("value", jiyVar3.getDescriptor(), iunVar);
                                break;
                            default:
                                cmcVar.getClass();
                                ugi0 descriptor2 = jiyVar4.getDescriptor();
                                iun iunVar2 = iun.f15405a;
                                cmcVar.a("first", descriptor2, iunVar2);
                                cmcVar.a("second", jiyVar3.getDescriptor(), iunVar2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
        }
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object so20Var;
        ugi0 descriptor = getDescriptor();
        bld bldVarA = rkjVar.a(descriptor);
        Object obj = epv0.o;
        Object objM = obj;
        Object objM2 = objM;
        while (true) {
            int iF = bldVarA.f(getDescriptor());
            if (iF == -1) {
                if (objM == obj) {
                    v4i0.n("Element 'key' is missing");
                    return null;
                }
                if (objM2 == obj) {
                    v4i0.n("Element 'value' is missing");
                    return null;
                }
                switch (this.c) {
                    case 0:
                        so20Var = new so20(objM, objM2);
                        break;
                    default:
                        so20Var = new Pair(objM, objM2);
                        break;
                }
                bldVarA.c(descriptor);
                return so20Var;
            }
            if (iF == 0) {
                objM = bldVarA.m(getDescriptor(), 0, this.f34262a, null);
            } else {
                if (iF != 1) {
                    v4i0.n(twn.m(iF, "Invalid index: "));
                    return null;
                }
                objM2 = bldVarA.m(getDescriptor(), 1, this.b, null);
            }
        }
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        byte b = this.c;
        return this.d;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        Object key;
        Object value;
        cld cldVarA = bwnVar.a(getDescriptor());
        ugi0 descriptor = getDescriptor();
        jiy jiyVar = this.f34262a;
        byte b = this.c;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                Pair pair = (Pair) obj;
                pair.getClass();
                key = pair.f46059a;
                break;
        }
        cldVarA.m(descriptor, 0, jiyVar, key);
        ugi0 descriptor2 = getDescriptor();
        jiy jiyVar2 = this.b;
        switch (b) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                value = pair2.b;
                break;
        }
        cldVarA.m(descriptor2, 1, jiyVar2, value);
        cldVarA.c(getDescriptor());
    }

    public to20(jiy jiyVar, jiy jiyVar2, char c) {
        this.f34262a = jiyVar;
        this.b = jiyVar2;
    }
}
