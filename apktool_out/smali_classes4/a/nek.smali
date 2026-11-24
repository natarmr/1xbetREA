.class public final La/nek;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tyn;
.implements La/d3h0;


# direct methods
.method public static f(I)La/esr;
    .locals 3

    .line 1
    sget-object v0, La/esr;->k:La/c0o;

    .line 2
    .line 3
    invoke-static {v0, v0}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, La/y2;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, La/y2;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, La/esr;

    .line 19
    .line 20
    iget-short v2, v2, La/esr;->a:S

    .line 21
    .line 22
    if-ne v2, p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_0
    check-cast v1, La/esr;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    sget-object p0, La/esr;->c:La/esr;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    return-object v1
.end method

.method public static g(Ljava/io/File;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v0, "/"

    .line 12
    .line 13
    invoke-static {p0, v0, p0}, Lkotlin/text/StringsKt;->p0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 18
    .line 19
    const-string v1, "HHmmssS"

    .line 20
    .line 21
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v2, "."

    .line 46
    .line 47
    invoke-static {p0, v2}, Lkotlin/text/StringsKt;->r0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    new-instance v2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v3, "_"

    .line 58
    .line 59
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v1, p0, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method

.method public static h(La/wvq0;I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, La/wvq0;->b(I)C

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const-string p1, "$^`"

    .line 6
    .line 7
    invoke-static {p1, p0}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x1

    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    const/high16 p1, 0x63f00000

    .line 15
    .line 16
    invoke-static {p0}, Ljava/lang/Character;->getType(C)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    shr-int p0, p1, p0

    .line 21
    .line 22
    and-int/2addr p0, v0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    return v0
.end method

.method public static k(La/wvq0;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/wvq0;->b(I)C

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, Lkotlin/text/CharsKt;->d(C)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public static l(La/j700;La/f9h0;Ljava/lang/String;Ljava/util/Set;)La/rop;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, La/rop;

    .line 11
    .line 12
    invoke-direct {v0}, La/rop;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-static {}, La/axq;->g()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :cond_0
    sget-object v1, La/rop;->b2:[La/iiy;

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    aget-object v2, v1, v2

    .line 29
    .line 30
    iget-object v3, v0, La/rop;->P1:La/phf0;

    .line 31
    .line 32
    invoke-virtual {v3, v0, v2, p2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    aget-object p2, v1, p2

    .line 37
    .line 38
    iget-object v2, v0, La/rop;->N1:La/bj5;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object p2, v0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 47
    .line 48
    if-nez p2, :cond_1

    .line 49
    .line 50
    new-instance p2, Landroid/os/Bundle;

    .line 51
    .line 52
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p2}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    const-string v2, "SCREEN_TYPE_KEY"

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p2, v2, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x2

    .line 68
    aget-object p0, v1, p0

    .line 69
    .line 70
    iget-object p2, v0, La/rop;->O1:La/yzn0;

    .line 71
    .line 72
    invoke-virtual {p2, v0, p0, p1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 73
    .line 74
    .line 75
    check-cast p3, Ljava/util/Collection;

    .line 76
    .line 77
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->M0(Ljava/util/Collection;)[J

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const/4 p1, 0x4

    .line 82
    aget-object p1, v1, p1

    .line 83
    .line 84
    iget-object p2, v0, La/rop;->Q1:La/cu;

    .line 85
    .line 86
    invoke-virtual {p2, v0, p1, p0}, La/cu;->r(La/yx5;La/iiy;[J)V

    .line 87
    .line 88
    .line 89
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "0"

    .line 2
    .line 3
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "0"

    .line 2
    .line 3
    return-object p0
.end method

.method public c(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {p1, p2}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyPairGenerator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public e(La/mm40;Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;La/fet;I)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, -0x36310960    # -1695444.0f

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, v0}, La/fet;->g0(I)La/fet;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4, p2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x20

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/16 v0, 0x10

    .line 20
    .line 21
    :goto_0
    or-int/2addr v0, p5

    .line 22
    invoke-virtual {p4, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const/16 v1, 0x100

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/16 v1, 0x80

    .line 32
    .line 33
    :goto_1
    or-int/2addr v0, v1

    .line 34
    and-int/lit16 v1, v0, 0x91

    .line 35
    .line 36
    const/16 v2, 0x90

    .line 37
    .line 38
    if-eq v1, v2, :cond_2

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/4 v1, 0x0

    .line 43
    :goto_2
    and-int/lit8 v2, v0, 0x1

    .line 44
    .line 45
    invoke-virtual {p4, v2, v1}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    shr-int/lit8 v0, v0, 0x3

    .line 52
    .line 53
    and-int/lit8 v1, v0, 0xe

    .line 54
    .line 55
    const/16 v2, 0x8

    .line 56
    .line 57
    or-int/2addr v1, v2

    .line 58
    and-int/lit8 v0, v0, 0x70

    .line 59
    .line 60
    or-int/2addr v0, v1

    .line 61
    invoke-static {p2, p3, p4, v0}, La/bsr0;->K(Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;La/fet;I)V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    invoke-virtual {p4}, La/fet;->X()V

    .line 66
    .line 67
    .line 68
    :goto_3
    invoke-virtual {p4}, La/fet;->u()La/yfe0;

    .line 69
    .line 70
    .line 71
    move-result-object p4

    .line 72
    if-eqz p4, :cond_4

    .line 73
    .line 74
    new-instance v0, La/cbr;

    .line 75
    .line 76
    const/4 v6, 0x4

    .line 77
    move-object v1, p0

    .line 78
    move-object v2, p1

    .line 79
    move-object v3, p2

    .line 80
    move-object v4, p3

    .line 81
    move v5, p5

    .line 82
    invoke-direct/range {v0 .. v6}, La/cbr;-><init>(Ljava/lang/Object;La/mm40;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p4, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 86
    .line 87
    :cond_4
    return-void
.end method

.method public i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public j()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
