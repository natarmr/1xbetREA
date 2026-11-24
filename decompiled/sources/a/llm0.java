package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public enum llm0 implements sgf0, Serializable {
    PLAIN_LIST("plainList"),
    TABS_WIDGETS("tabsWidgets"),
    LIST_WIDGETS_PINNED_ITEMS("listWidgetsPinnedItems");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20254a;

    llm0(String str) {
        this.f20254a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "statisticsMainScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f20254a;
    }
}
