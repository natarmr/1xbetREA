package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public enum j85 {
    TXT("text/plain", ".txt"),
    /* JADX INFO: Fake field, exist only in values array */
    RTF("text/rtf", ".rtf"),
    PNG("image/png", ".png"),
    JPEG("image/jpeg", ".jpeg"),
    /* JADX INFO: Fake field, exist only in values array */
    GIF("image/gif", ".gif"),
    /* JADX INFO: Fake field, exist only in values array */
    HEIC("image/heic", ".heic"),
    /* JADX INFO: Fake field, exist only in values array */
    SVG("image/svg+xml", ".svg"),
    /* JADX INFO: Fake field, exist only in values array */
    WEBP("image/webp", ".webp"),
    MP4("video/mp4", ".mp4"),
    /* JADX INFO: Fake field, exist only in values array */
    MOV("video/quicktime", ".mov"),
    /* JADX INFO: Fake field, exist only in values array */
    WMV("video/x-ms-wmv", ".wmv"),
    /* JADX INFO: Fake field, exist only in values array */
    WEBM("video/webm", ".webm"),
    AVI("video/avi", ".avi"),
    PDF("application/pdf", ".pdf"),
    /* JADX INFO: Fake field, exist only in values array */
    DOCX("application/vnd.openxmlformats-officedocument.wordprocessingml.document", ".docx"),
    /* JADX INFO: Fake field, exist only in values array */
    XLSM("application/vnd.ms-excel.sheet.macroenabled.12", ".xlsm"),
    /* JADX INFO: Fake field, exist only in values array */
    XLSX("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", ".xlsx");

    public static final qek0 b = new qek0();
    public static final List c = q3d.j(".jpg", ".jpeg", ".png", ".webp");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16069a;

    j85(String str, String str2) {
        this.f16069a = str;
    }
}
