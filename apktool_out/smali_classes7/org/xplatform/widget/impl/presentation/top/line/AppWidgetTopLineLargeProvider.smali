.class public final Lorg/xplatform/widget/impl/presentation/top/line/AppWidgetTopLineLargeProvider;
.super La/dz5;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, La/dz5;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()La/bz5;
    .locals 0

    .line 1
    sget-object p0, La/bz5;->a:La/bz5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()I
    .locals 0

    .line 1
    const p0, 0x7f0d0040

    return p0
.end method

.method public final c()I
    .locals 0

    .line 1
    const p0, 0x7f0d0041

    return p0
.end method

.method public final e()Landroid/appwidget/AppWidgetProvider;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final f()Landroid/widget/RemoteViewsService;
    .locals 0

    .line 1
    new-instance p0, Lorg/xplatform/widget/impl/presentation/top/line/AppWidgetTopLineService;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/xplatform/widget/impl/presentation/top/line/AppWidgetTopLineService;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final g()I
    .locals 0

    .line 1
    const p0, 0x7f130fd2

    return p0
.end method

.method public final onEnabled(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/appwidget/AppWidgetProvider;->onEnabled(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, La/dz5;->j(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/dz5;->h()La/yo4;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p1, p1, La/yo4;->a:La/kt2;

    .line 15
    .line 16
    const-string v0, "widget_line_call"

    .line 17
    .line 18
    invoke-interface {p1, v0}, La/kt2;->c(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, La/dz5;->i()La/au0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p0, p0, La/au0;->a:La/s1p;

    .line 26
    .line 27
    const-wide/16 v0, 0xc4d

    .line 28
    .line 29
    sget-object p1, La/xun;->a:La/xun;

    .line 30
    .line 31
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
