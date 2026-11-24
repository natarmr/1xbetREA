package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class pqe0 extends uqe0 implements hay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor f27412a;

    public pqe0(Constructor constructor) {
        this.f27412a = constructor;
    }

    @Override // a.uqe0
    public final Member b() {
        return this.f27412a;
    }

    @Override // a.hay
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f27412a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new are0(typeVariable));
        }
        return arrayList;
    }
}
