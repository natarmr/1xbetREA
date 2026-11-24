.class public final La/s9m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jfn0;
.implements La/gk50;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static d(I)La/uaq0;
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 2
    .line 3
    sget-object v0, La/uaq0;->n:La/c0o;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, La/c0o;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/uaq0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 14
    .line 15
    new-instance v0, La/g0g0;

    .line 16
    .line 17
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    move-object p0, v0

    .line 21
    :goto_0
    sget-object v0, La/uaq0;->b:La/uaq0;

    .line 22
    .line 23
    instance-of v1, p0, La/g0g0;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    move-object p0, v0

    .line 28
    :cond_0
    check-cast p0, La/uaq0;

    .line 29
    .line 30
    return-object p0
.end method

.method public static e(Ljava/lang/Integer;)La/wuo0;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, La/wuo0;->b:La/wuo0;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ne v1, v0, :cond_1

    .line 12
    .line 13
    sget-object p0, La/wuo0;->c:La/wuo0;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    const/4 v0, 0x2

    .line 17
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ne v1, v0, :cond_2

    .line 22
    .line 23
    sget-object p0, La/wuo0;->d:La/wuo0;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    const/4 v0, 0x4

    .line 27
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ne v1, v0, :cond_3

    .line 32
    .line 33
    sget-object p0, La/wuo0;->e:La/wuo0;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_3
    const/16 v0, 0x9

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-ne v1, v0, :cond_4

    .line 43
    .line 44
    sget-object p0, La/wuo0;->g:La/wuo0;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_4
    const/16 v0, 0xa

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-ne v1, v0, :cond_5

    .line 54
    .line 55
    sget-object p0, La/wuo0;->h:La/wuo0;

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_5
    const/4 v0, 0x7

    .line 59
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-ne p0, v0, :cond_6

    .line 64
    .line 65
    sget-object p0, La/wuo0;->f:La/wuo0;

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_6
    sget-object p0, La/wuo0;->i:La/wuo0;

    .line 69
    .line 70
    return-object p0
.end method

.method public static f(Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;
    .locals 3

    .line 1
    new-instance v0, La/b0l0;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    new-instance p0, Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {p0, v1, v0, v2}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;-><init>(Ljava/lang/String;La/xbf;Z)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static g(Ljava/lang/String;)La/aoo0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const v1, -0x52ec5b66

    .line 9
    .line 10
    .line 11
    if-eq v0, v1, :cond_4

    .line 12
    .line 13
    const v1, -0x1df624cf

    .line 14
    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const v1, 0x2015de36

    .line 19
    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v0, "colorSelectionText"

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    sget-object p0, La/aoo0;->d:La/aoo0;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_2
    const-string v0, "colorSelectionIcons"

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-nez p0, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    sget-object p0, La/aoo0;->b:La/aoo0;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_4
    const-string v0, "bubbleSelectionIcons"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_5

    .line 55
    .line 56
    :goto_0
    sget-object p0, La/aoo0;->b:La/aoo0;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_5
    sget-object p0, La/aoo0;->c:La/aoo0;

    .line 60
    .line 61
    return-object p0
.end method

.method public static h(I)La/ngs0;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_3

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    sget-object p0, La/ngs0;->d:La/ngs0;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object p0, La/ngs0;->h:La/ngs0;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    sget-object p0, La/ngs0;->g:La/ngs0;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_2
    sget-object p0, La/ngs0;->f:La/ngs0;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_3
    sget-object p0, La/ngs0;->e:La/ngs0;

    .line 26
    .line 27
    return-object p0
.end method

.method public static i(La/uaq0;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/uaq0;->c:La/uaq0;

    .line 5
    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    .line 8
    sget-object v0, La/uaq0;->l:La/uaq0;

    .line 9
    .line 10
    if-eq p0, v0, :cond_1

    .line 11
    .line 12
    sget-object v0, La/uaq0;->j:La/uaq0;

    .line 13
    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    sget-object v0, La/uaq0;->f:La/uaq0;

    .line 17
    .line 18
    if-eq p0, v0, :cond_1

    .line 19
    .line 20
    sget-object v0, La/uaq0;->h:La/uaq0;

    .line 21
    .line 22
    if-ne p0, v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 28
    return p0
.end method

.method public static j(La/uaq0;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/uaq0;->b:La/uaq0;

    .line 5
    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    .line 8
    sget-object v0, La/uaq0;->g:La/uaq0;

    .line 9
    .line 10
    if-eq p0, v0, :cond_1

    .line 11
    .line 12
    sget-object v0, La/uaq0;->k:La/uaq0;

    .line 13
    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    sget-object v0, La/uaq0;->i:La/uaq0;

    .line 17
    .line 18
    if-eq p0, v0, :cond_1

    .line 19
    .line 20
    sget-object v0, La/uaq0;->e:La/uaq0;

    .line 21
    .line 22
    if-ne p0, v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 28
    return p0
.end method

.method public static k(La/uaq0;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/uaq0;->d:La/uaq0;

    .line 5
    .line 6
    if-ne p0, v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public static l(La/uaq0;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, La/s9m0;->j(La/uaq0;)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    xor-int/lit8 p0, p0, 0x1

    .line 9
    .line 10
    return p0
.end method

.method public static m(Landroidx/fragment/app/e;)V
    .locals 4

    .line 1
    sget-object v0, La/jvp0;->a:La/jvp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, La/ox70;->n2:La/mi70;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, La/ox70;

    .line 12
    .line 13
    invoke-direct {v1}, La/ox70;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v2, La/ox70;->o2:[La/iiy;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aget-object v2, v2, v3

    .line 20
    .line 21
    iget-object v3, v1, La/ox70;->m2:La/yzn0;

    .line 22
    .line 23
    invoke-virtual {v3, v1, v2, v0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "OpenTelegramBotBottomSheet"

    .line 27
    .line 28
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public a(Landroidx/media3/common/b;)I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public b(Landroidx/media3/common/b;)La/lfn0;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "This SubtitleParser.Factory doesn\'t support any formats."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public c(Landroidx/media3/common/b;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
