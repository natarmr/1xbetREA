.class public final La/ap3;
.super La/zo3;
.source "SourceFile"


# instance fields
.field public final s:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p1, p2, v0}, La/zo3;-><init>(Landroid/content/Context;Landroid/content/Intent;B)V

    .line 9
    .line 10
    .line 11
    new-instance p1, La/a13;

    .line 12
    .line 13
    const/16 p2, 0xf

    .line 14
    .line 15
    invoke-direct {p1, p0, p2}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, La/ap3;->s:La/n0o0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final b()Landroid/widget/RemoteViews;
    .locals 2

    .line 1
    iget-object p0, p0, La/a56;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 12
    .line 13
    const v1, 0x3fa51eb8    # 1.29f

    .line 14
    .line 15
    .line 16
    cmpl-float v0, v0, v1

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, Landroid/widget/RemoteViews;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const v1, 0x7f0d06ec

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    new-instance v0, Landroid/widget/RemoteViews;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const v1, 0x7f0d06f0

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, p0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public final c()Landroid/widget/RemoteViews;
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/RemoteViews;

    .line 2
    .line 3
    iget-object p0, p0, La/a56;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v1, 0x7f0d06f1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final d()Landroid/widget/RemoteViews;
    .locals 2

    .line 1
    sget-object v0, La/wdv0;->b:La/wdv0;

    .line 2
    .line 3
    iput-object v0, p0, La/a56;->g:La/wdv0;

    .line 4
    .line 5
    new-instance v0, Landroid/widget/RemoteViews;

    .line 6
    .line 7
    iget-object p0, p0, La/a56;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const v1, 0x7f0d06f2

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final l()V
    .locals 1

    .line 1
    iget-object v0, p0, La/ap3;->s:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/kdv0;

    .line 8
    .line 9
    invoke-interface {v0, p0}, La/kdv0;->a(La/ap3;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, La/zo3;->l()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
