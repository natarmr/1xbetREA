package a;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class urq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36176a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urq)) {
            return false;
        }
        urq urqVar = (urq) obj;
        return Objects.equals(this.f36176a, urqVar.f36176a) && Objects.equals(this.b, urqVar.b) && Objects.equals(this.c, urqVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.f36176a, this.b, this.c);
    }
}
