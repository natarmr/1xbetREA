package a;

/* JADX INFO: loaded from: classes.dex */
public final class ucg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f35427a;

    public final boolean equals(Object obj) {
        if (obj instanceof ucg0) {
            return this.f35427a == ((ucg0) obj).f35427a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35427a);
    }

    public final String toString() {
        byte b = this.f35427a;
        if (b == 0) {
            return "Button";
        }
        if (b == 1) {
            return "Checkbox";
        }
        if (b == 2) {
            return "Switch";
        }
        if (b == 3) {
            return "RadioButton";
        }
        if (b == 4) {
            return "Tab";
        }
        if (b == 5) {
            return "Image";
        }
        if (b == 6) {
            return "DropdownList";
        }
        if (b == 7) {
            return "Picker";
        }
        return b == 8 ? "Carousel" : "Unknown";
    }
}
