.class public final La/rl70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yi80;
.implements La/gw90;


# direct methods
.method public static b(Ljava/lang/String;)La/y190;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/c;->a:La/qg9;

    .line 5
    .line 6
    new-instance v0, La/f99;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, La/f99;->c0(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    invoke-static {v0, p0}, La/c;->d(La/f99;Z)La/y190;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static c(Ljava/io/File;)La/y190;
    .locals 1

    .line 1
    sget-object v0, La/y190;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, La/rl70;->b(Ljava/lang/String;)La/y190;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static d(JLjava/lang/String;Ljava/lang/String;)Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;

    .line 8
    .line 9
    sget-object v5, La/oaa0;->a:La/oaa0;

    .line 10
    .line 11
    move-wide v2, p0

    .line 12
    move-object v1, p2

    .line 13
    move-object v4, p3

    .line 14
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;-><init>(Ljava/lang/String;JLjava/lang/String;La/oaa0;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static synthetic f(La/rl70;Landroidx/fragment/app/e;Lorg/xplatform/picker/api/presentation/PickerParams;)V
    .locals 1

    .line 1
    sget-object v0, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;->b:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, v0}, La/rl70;->e(Landroidx/fragment/app/e;Lorg/xplatform/picker/api/presentation/PickerParams;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(La/w6k;I)I
    .locals 0

    .line 1
    int-to-float p0, p2

    .line 2
    const p1, 0x3f59999a    # 0.85f

    .line 3
    .line 4
    .line 5
    mul-float/2addr p0, p1

    .line 6
    float-to-int p0, p0

    .line 7
    return p0
.end method

.method public e(Landroidx/fragment/app/e;Lorg/xplatform/picker/api/presentation/PickerParams;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/zo90;->p2:La/fl70;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-string p0, "PICKER_DIALOG_TAG"

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, La/zo90;

    .line 19
    .line 20
    invoke-direct {v0}, La/zo90;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v1, La/zo90;->q2:[La/iiy;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    aget-object v2, v1, v2

    .line 27
    .line 28
    iget-object v3, v0, La/zo90;->m2:La/khf0;

    .line 29
    .line 30
    invoke-virtual {v3, v0, v2, p2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 31
    .line 32
    .line 33
    const/4 p2, 0x3

    .line 34
    aget-object p2, v1, p2

    .line 35
    .line 36
    iget-object v1, v0, La/zo90;->o2:La/khf0;

    .line 37
    .line 38
    invoke-virtual {v1, v0, p2, p3}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1, p0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public g(Landroidx/fragment/app/e;Lorg/xplatform/picker/api/presentation/PickerParams$Language;)V
    .locals 5

    .line 1
    sget-object p0, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;->a:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/ao90;->o2:La/xi70;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v0, "PICKER_DIALOG_TAG"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v1, La/ao90;

    .line 21
    .line 22
    invoke-direct {v1}, La/ao90;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/ao90;->p2:[La/iiy;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    aget-object v3, v2, v3

    .line 29
    .line 30
    iget-object v4, v1, La/ao90;->m2:La/khf0;

    .line 31
    .line 32
    invoke-virtual {v4, v1, v3, p2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 33
    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    aget-object p2, v2, p2

    .line 37
    .line 38
    iget-object v2, v1, La/ao90;->n2:La/khf0;

    .line 39
    .line 40
    invoke-virtual {v2, v1, p2, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
