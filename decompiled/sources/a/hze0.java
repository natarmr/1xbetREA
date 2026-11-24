package a;

/* JADX INFO: loaded from: classes5.dex */
public final class hze0 extends q0f0 {
    @Override // a.q0f0
    public final boolean a() {
        return false;
    }

    @Override // a.q0f0
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hze0);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "AgeConfirmation(isRequired=true, isHidden=false)";
    }
}
