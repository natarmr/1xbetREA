package a;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g0o implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10468a = 1;
    public final Object b;
    public Object c;
    public final a8z d;

    public g0o(String str, Object obj) {
        obj.getClass();
        this.b = obj;
        this.c = iun.f15405a;
        this.d = maz.a(wez.f39042a, new a540((Object) str, (Object) this, (byte) 13));
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        byte b = this.f10468a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Enum[] enumArr = (Enum[]) obj;
                int iK = rkjVar.k(getDescriptor());
                if (iK >= 0 && iK < enumArr.length) {
                    return enumArr[iK];
                }
                throw new fhi0(iK + " is not among valid " + getDescriptor().h() + " enum values, values size is " + enumArr.length);
            default:
                ugi0 descriptor = getDescriptor();
                bld bldVarA = rkjVar.a(descriptor);
                int iF = bldVarA.f(getDescriptor());
                if (iF == -1) {
                    bldVarA.c(descriptor);
                    return obj;
                }
                v4i0.n(twn.m(iF, "Unexpected index "));
                return null;
        }
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        switch (this.f10468a) {
            case 0:
                return (ugi0) ((n0o0) this.d).getValue();
            default:
                return (ugi0) this.d.getValue();
        }
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        switch (this.f10468a) {
            case 0:
                Enum r5 = (Enum) obj;
                r5.getClass();
                Enum[] enumArr = (Enum[]) this.b;
                int iH = tx3.H(r5, enumArr);
                if (iH != -1) {
                    bwnVar.y(getDescriptor(), iH);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                String strH = getDescriptor().h();
                String string = Arrays.toString(enumArr);
                string.getClass();
                sb.append(" is not a valid enum ");
                sb.append(strH);
                sb.append(", must be one of ");
                sb.append(string);
                throw new fhi0(sb.toString());
            default:
                obj.getClass();
                bwnVar.a(getDescriptor()).c(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.f10468a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0o(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        obj.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.c = listAsList;
    }

    public g0o(String str, Enum[] enumArr) {
        str.getClass();
        enumArr.getClass();
        this.b = enumArr;
        this.d = maz.b(new gnm(this, str, (byte) 23));
    }
}
