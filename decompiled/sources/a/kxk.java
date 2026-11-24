package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class kxk implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19059a;
    public final int b;

    public kxk(int i, int i2) {
        this.f19059a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxk)) {
            return false;
        }
        kxk kxkVar = (kxk) obj;
        return this.f19059a == kxkVar.f19059a && this.b == kxkVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + twn.a(this.f19059a, 1114599635, 31);
    }

    public final String toString() {
        return ohs0.m("DocumentChoiceScreenParams(requestKey=DOCUMENT_CHOICE_ITEM_KEY, countryId=", this.f19059a, ", selectedDocumentId=", Separators.RPAREN, this.b);
    }
}
