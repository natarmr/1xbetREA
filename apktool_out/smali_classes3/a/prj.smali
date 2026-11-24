.class public final La/prj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ctf0;

.field public final b:La/pru;

.field public final c:La/zpu;

.field public final d:La/n0o0;


# direct methods
.method public constructor <init>(La/ctf0;La/pru;La/zpu;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/prj;->a:La/ctf0;

    .line 8
    .line 9
    iput-object p2, p0, La/prj;->b:La/pru;

    .line 10
    .line 11
    iput-object p3, p0, La/prj;->c:La/zpu;

    .line 12
    .line 13
    new-instance p1, La/ucj;

    .line 14
    .line 15
    const/4 p2, 0x7

    .line 16
    invoke-direct {p1, p0, p2}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, La/prj;->d:La/n0o0;

    .line 24
    .line 25
    return-void
.end method

.method public static A(La/prj;Landroid/net/Uri;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p1, p2}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public static B(Landroid/net/Uri;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-static {p0, p1}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    new-array p1, p1, [C

    .line 9
    .line 10
    const/16 v0, 0x2c

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    aput-char v0, p1, v1

    .line 14
    .line 15
    const/4 v0, 0x6

    .line 16
    invoke-static {p0, p1, v0}, Lkotlin/text/StringsKt;->i0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 p1, 0x0

    .line 54
    :cond_2
    if-nez p1, :cond_3

    .line 55
    .line 56
    sget-object p0, La/iun;->a:La/iun;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_3
    return-object p1
.end method

.method public static C(La/prj;Landroid/net/Uri;Ljava/lang/String;)J
    .locals 0

    .line 1
    invoke-static {p1, p2}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    return-wide p0

    .line 18
    :cond_0
    const-wide/16 p0, 0x0

    .line 19
    .line 20
    return-wide p0
.end method

.method public static a(Landroid/net/Uri;Ljava/lang/String;Z)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    const-string p1, "true"

    .line 8
    .line 9
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p1, "false"

    .line 19
    .line 20
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    :goto_0
    if-eqz p0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_2
    return p2
.end method

.method public static b(Landroid/net/Uri;)La/tlj;
    .locals 1

    .line 1
    const-string v0, "configkey"

    .line 2
    .line 3
    invoke-static {p0, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const-string p0, ""

    .line 10
    .line 11
    :cond_0
    new-instance v0, La/tlj;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-lez p0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    :goto_0
    invoke-direct {v0, p0}, La/tlj;-><init>(Z)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static d(Landroid/net/Uri;)La/ylj;
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p0, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const-string p0, ""

    .line 10
    .line 11
    :cond_0
    new-instance v0, La/ylj;

    .line 12
    .line 13
    invoke-direct {v0, p0}, La/ylj;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static e(Landroid/net/Uri;)La/jmj;
    .locals 8

    .line 1
    const-string v0, "cybertype"

    .line 2
    .line 3
    invoke-static {p0, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    move v2, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    goto :goto_0

    .line 23
    :goto_1
    const-string v0, "champid"

    .line 24
    .line 25
    invoke-static {p0, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-wide/16 v3, 0x0

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    move-wide v0, v3

    .line 45
    :goto_2
    const-string v5, "sportid"

    .line 46
    .line 47
    invoke-static {p0, v5}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    invoke-static {v5}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 60
    .line 61
    .line 62
    move-result-wide v5

    .line 63
    goto :goto_3

    .line 64
    :cond_2
    move-wide v5, v3

    .line 65
    :goto_3
    const-string v7, "subsportid"

    .line 66
    .line 67
    invoke-static {p0, v7}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-eqz p0, :cond_3

    .line 72
    .line 73
    invoke-static {p0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-eqz p0, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    :cond_3
    sget-object p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 84
    .line 85
    iget-byte p0, p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 86
    .line 87
    if-ne v2, p0, :cond_4

    .line 88
    .line 89
    move-wide v5, v3

    .line 90
    :cond_4
    move-wide v3, v0

    .line 91
    new-instance v1, La/jmj;

    .line 92
    .line 93
    invoke-direct/range {v1 .. v6}, La/jmj;-><init>(IJJ)V

    .line 94
    .line 95
    .line 96
    return-object v1
.end method

.method public static f(Landroid/net/Uri;)La/kmj;
    .locals 7

    .line 1
    const-string v0, "sportid"

    .line 2
    .line 3
    invoke-static {p0, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-wide v3, v1

    .line 23
    :goto_0
    const-string v0, "subsportid"

    .line 24
    .line 25
    invoke-static {p0, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    :cond_1
    const-string v0, "cybertype"

    .line 42
    .line 43
    invoke-static {p0, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const/4 v0, 0x0

    .line 48
    if-eqz p0, :cond_2

    .line 49
    .line 50
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move p0, v0

    .line 62
    :goto_1
    new-instance v5, La/kmj;

    .line 63
    .line 64
    sget-object v6, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 65
    .line 66
    iget-byte v6, v6, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 67
    .line 68
    if-ne p0, v6, :cond_3

    .line 69
    .line 70
    move-wide v3, v1

    .line 71
    :cond_3
    invoke-direct {v5, p0, v3, v4, v0}, La/kmj;-><init>(IJZ)V

    .line 72
    .line 73
    .line 74
    return-object v5
.end method

.method public static g(Landroid/net/Uri;)La/pmj;
    .locals 3

    .line 1
    const-string v0, "cybertype"

    .line 2
    .line 3
    invoke-static {p0, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    const-string v2, "viewtype"

    .line 23
    .line 24
    invoke-static {p0, v2}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    :cond_1
    const-string v2, "id"

    .line 41
    .line 42
    invoke-static {p0, v2}, La/prj;->B(Landroid/net/Uri;Ljava/lang/String;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    new-instance v2, La/pmj;

    .line 47
    .line 48
    invoke-direct {v2, v0, v1, p0}, La/pmj;-><init>(IILjava/util/List;)V

    .line 49
    .line 50
    .line 51
    return-object v2
.end method

.method public static h(Landroid/net/Uri;)La/omj;
    .locals 3

    .line 1
    const-string v0, "team_name"

    .line 2
    .line 3
    invoke-static {p0, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    :cond_0
    const-string v1, "feedid"

    .line 12
    .line 13
    invoke-static {p0, v1}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-static {p0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-wide/16 v1, 0x0

    .line 31
    .line 32
    :goto_0
    new-instance p0, La/omj;

    .line 33
    .line 34
    invoke-direct {p0, v0, v1, v2}, La/omj;-><init>(Ljava/lang/String;J)V

    .line 35
    .line 36
    .line 37
    return-object p0
.end method

.method public static k(Landroid/net/Uri;)La/rmj;
    .locals 3

    .line 1
    const-string v0, "cybertype"

    .line 2
    .line 3
    invoke-static {p0, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    const-string v2, "islive"

    .line 23
    .line 24
    invoke-static {p0, v2}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    :cond_1
    new-instance p0, La/rmj;

    .line 35
    .line 36
    invoke-direct {p0, v1, v0}, La/rmj;-><init>(ZI)V

    .line 37
    .line 38
    .line 39
    return-object p0
.end method

.method public static o(ZLandroid/net/Uri;)La/upj;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, La/prj;->x(Landroid/net/Uri;)La/ynj;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "type"

    .line 9
    .line 10
    invoke-static {p1, p0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, ""

    .line 15
    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    move-object p0, v0

    .line 19
    :cond_1
    const-string v1, "id"

    .line 20
    .line 21
    invoke-static {p1, v1}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    move-object v1, v0

    .line 28
    :cond_2
    const-string v2, "url"

    .line 29
    .line 30
    invoke-static {p1, v2}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-nez p1, :cond_3

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    move-object v0, p1

    .line 38
    :goto_0
    const/4 p1, 0x0

    .line 39
    const-string v2, "/"

    .line 40
    .line 41
    invoke-static {v0, v2, p1}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    const-string v3, "iframecasino"

    .line 46
    .line 47
    if-eqz p1, :cond_4

    .line 48
    .line 49
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    invoke-static {v0, v2, v0}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    const v2, -0x47007d5c

    .line 64
    .line 65
    .line 66
    if-eq p1, v2, :cond_9

    .line 67
    .line 68
    const v2, -0x3ebdafe9

    .line 69
    .line 70
    .line 71
    if-eq p1, v2, :cond_7

    .line 72
    .line 73
    const v1, 0x39d08399

    .line 74
    .line 75
    .line 76
    if-eq p1, v1, :cond_5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-nez p0, :cond_6

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_6
    new-instance p0, La/loj;

    .line 87
    .line 88
    invoke-direct {p0, v0}, La/loj;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_7
    const-string p1, "native"

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-nez p0, :cond_8

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_8
    new-instance p0, La/hoj;

    .line 102
    .line 103
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-direct {p0, p1}, La/hoj;-><init>(I)V

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_9
    const-string p1, "iframe"

    .line 112
    .line 113
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    if-nez p0, :cond_a

    .line 118
    .line 119
    :goto_1
    sget-object p0, La/xmj;->a:La/xmj;

    .line 120
    .line 121
    return-object p0

    .line 122
    :cond_a
    new-instance p0, La/koj;

    .line 123
    .line 124
    invoke-direct {p0, v0}, La/koj;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-object p0
.end method

.method public static p(Landroid/net/Uri;)La/voj;
    .locals 1

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p0, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    :goto_0
    new-instance v0, La/voj;

    .line 22
    .line 23
    invoke-direct {v0, p0}, La/voj;-><init>(I)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static q(Landroid/net/Uri;)La/hpj;
    .locals 6

    .line 1
    new-instance v0, La/hpj;

    .line 2
    .line 3
    const-string v1, "PARAMETER_KEY_FROM_AGGREGATOR"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v1, v2}, La/prj;->a(Landroid/net/Uri;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string v2, "PARAMETER_KEY_SHOW_NAV_BAR"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-static {p0, v2, v3}, La/prj;->a(Landroid/net/Uri;Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const-string v3, "PARAMETER_KEY_BANNER_IMAGE_URL"

    .line 18
    .line 19
    invoke-static {p0, v3}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, ""

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    move-object v3, v4

    .line 28
    :cond_0
    const-string v5, "PARAMETER_KEY_BANNER_TRANSLATE_ID"

    .line 29
    .line 30
    invoke-static {p0, v5}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v4, p0

    .line 38
    :goto_0
    invoke-direct {v0, v3, v4, v1, v2}, La/hpj;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public static v(Ljava/lang/String;)J
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    return-wide v0

    .line 44
    :cond_1
    const-wide/16 v0, 0x0

    .line 45
    .line 46
    return-wide v0
.end method

.method public static w(Landroid/content/Intent;La/j700;)La/inj;
    .locals 12

    .line 1
    const-string v0, "SPORT_ID"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0, v0, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Iterable;

    .line 24
    .line 25
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    move-object v5, v4

    .line 45
    check-cast v5, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    cmp-long v5, v5, v2

    .line 52
    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    sget-object v0, La/xun;->a:La/xun;

    .line 65
    .line 66
    :goto_1
    const-string v1, "CHAMP_ID"

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_5

    .line 73
    .line 74
    invoke-virtual {p0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v4

    .line 78
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Ljava/lang/Iterable;

    .line 87
    .line 88
    new-instance v4, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_4

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    move-object v6, v5

    .line 108
    check-cast v6, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    cmp-long v6, v6, v2

    .line 115
    .line 116
    if-eqz v6, :cond_3

    .line 117
    .line 118
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    goto :goto_3

    .line 127
    :cond_5
    sget-object v1, La/xun;->a:La/xun;

    .line 128
    .line 129
    :goto_3
    move-object v9, v0

    .line 130
    check-cast v9, Ljava/util/Set;

    .line 131
    .line 132
    move-object v10, v1

    .line 133
    check-cast v10, Ljava/util/Set;

    .line 134
    .line 135
    const-string v0, "CYBER_TYPE"

    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    const-string v0, "subSportId"

    .line 143
    .line 144
    invoke-virtual {p0, v0, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 145
    .line 146
    .line 147
    move-result-wide v7

    .line 148
    const-string v0, "IS_CYBER"

    .line 149
    .line 150
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v4, La/inj;

    .line 155
    .line 156
    move-object v5, p1

    .line 157
    invoke-direct/range {v4 .. v11}, La/inj;-><init>(La/j700;IJLjava/util/Set;Ljava/util/Set;Z)V

    .line 158
    .line 159
    .line 160
    return-object v4
.end method

.method public static x(Landroid/net/Uri;)La/ynj;
    .locals 5

    .line 1
    sget-object v0, La/tw70;->c:La/c0o;

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
    const-string v2, ""

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, La/y2;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move-object v3, v1

    .line 20
    check-cast v3, La/tw70;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v4, "type"

    .line 27
    .line 28
    invoke-static {p0, v4}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-nez v4, :cond_1

    .line 33
    .line 34
    move-object v4, v2

    .line 35
    :cond_1
    invoke-static {v3, v4}, Lkotlin/text/c;->o(Ljava/lang/String;Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/4 v1, 0x0

    .line 43
    :goto_0
    check-cast v1, La/tw70;

    .line 44
    .line 45
    const-string v0, "subtype"

    .line 46
    .line 47
    invoke-static {p0, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    move-object v0, v2

    .line 54
    :cond_3
    const-string v3, "url"

    .line 55
    .line 56
    invoke-static {p0, v3}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-nez p0, :cond_4

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    move-object v2, p0

    .line 64
    :goto_1
    new-instance p0, La/ynj;

    .line 65
    .line 66
    invoke-direct {p0, v1, v0, v2}, La/ynj;-><init>(La/tw70;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object p0
.end method

.method public static y(Landroid/net/Uri;)La/xlj;
    .locals 6

    .line 1
    new-instance v0, La/xlj;

    .line 2
    .line 3
    const-string v1, "PARAMETER_KEY_BANNER_TITLE"

    .line 4
    .line 5
    invoke-static {p0, v1}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, ""

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    move-object v1, v2

    .line 14
    :cond_0
    const-string v3, "PARAMETER_KEY_BANNER_TRANSLATE_ID"

    .line 15
    .line 16
    invoke-static {p0, v3}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    move-object v3, v2

    .line 23
    :cond_1
    const-string v4, "PARAMETER_KEY_BANNER_LOTTERY_ID"

    .line 24
    .line 25
    invoke-static {p0, v4}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 v4, 0x0

    .line 37
    :goto_0
    const-string v5, "PARAMETER_KEY_BANNER_IMAGE_URL"

    .line 38
    .line 39
    invoke-static {p0, v5}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    if-nez v5, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    move-object v2, v5

    .line 47
    :goto_1
    const-string v5, "PARAMETER_KEY_NEED_AUTH"

    .line 48
    .line 49
    invoke-static {p0, v5}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_4

    .line 54
    .line 55
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    :goto_2
    move-object v5, v2

    .line 60
    move-object v2, v1

    .line 61
    move v1, v4

    .line 62
    move-object v4, v5

    .line 63
    move v5, p0

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/4 p0, 0x1

    .line 66
    goto :goto_2

    .line 67
    :goto_3
    invoke-direct/range {v0 .. v5}, La/xlj;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 68
    .line 69
    .line 70
    return-object v0
.end method

.method public static z(Landroid/content/Intent;)La/aue0;
    .locals 2

    .line 1
    const-string v0, "REGISTRATION_DEFAULT_BONUS_ID"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object p0, La/aue0;->b:La/cge0;

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    :goto_0
    sget-object v0, La/aue0;->b:La/cge0;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, La/cge0;->h(Ljava/lang/Integer;)La/aue0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method


# virtual methods
.method public final D(Landroid/net/Uri;Landroid/content/Intent;ZLa/zje;)Ljava/lang/Object;
    .locals 39

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 1
    invoke-virtual {v1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    const-string v5, ""

    if-nez v3, :cond_1

    move-object v3, v5

    :cond_1
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    const-string v6, "IS_PUSH_NOTIFICATION"

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v6

    .line 3
    sget-object v8, La/hrj;->b:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 4
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_cf

    .line 5
    sget-object v8, La/hrj;->b2:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 6
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_cf

    .line 7
    sget-object v8, La/hrj;->d2:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 8
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_cf

    .line 9
    sget-object v8, La/hrj;->c2:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 10
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto/16 :goto_4d

    .line 11
    :cond_2
    sget-object v8, La/hrj;->i1:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 12
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    .line 13
    const-string v9, "ACTIVITY_RECREATED"

    const-string v12, "id"

    if-eqz v8, :cond_6

    .line 14
    invoke-virtual {v2, v9, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const-wide/16 v10, 0x0

    goto :goto_1

    .line 15
    :cond_4
    invoke-static {v1, v12}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 16
    invoke-static {v0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 17
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    .line 18
    :goto_1
    const-string v0, "needTransfer"

    invoke-static {v1, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v7

    .line 19
    :cond_5
    new-instance v0, La/plj;

    invoke-direct {v0, v7, v10, v11}, La/plj;-><init>(ZJ)V

    return-object v0

    .line 20
    :cond_6
    sget-object v8, La/hrj;->g1:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 21
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    .line 22
    const-string v13, "game"

    const-string v14, "subcategory"

    const-string v15, "filterid"

    const-wide/high16 v16, -0x8000000000000000L

    const-string v4, "categories"

    const-string v10, "section"

    const-string v11, "bonuses"

    const-string v7, "promo"

    move/from16 v21, v6

    sget-object v22, La/xmj;->a:La/xmj;

    const-string v6, "type"

    if-eqz v8, :cond_2f

    .line 23
    invoke-static {v1, v6}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_2

    :cond_7
    move-object v5, v0

    .line 24
    :goto_2
    invoke-static {v1, v12}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v23

    goto :goto_3

    :cond_8
    const-wide/16 v23, 0x0

    .line 25
    :goto_3
    invoke-static {v1, v10}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "tournaments"

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    goto :goto_4

    :sswitch_0
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_4

    .line 26
    :cond_9
    sget-object v0, La/k9h0;->q1:La/k9h0;

    goto :goto_5

    .line 27
    :sswitch_1
    const-string v4, "virtual"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_4

    .line 28
    :cond_a
    sget-object v0, La/k9h0;->I1:La/k9h0;

    goto :goto_5

    .line 29
    :sswitch_2
    const-string v4, "tvbet"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_4

    .line 30
    :cond_b
    sget-object v0, La/k9h0;->w1:La/k9h0;

    goto :goto_5

    .line 31
    :sswitch_3
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_4

    .line 32
    :cond_c
    sget-object v0, La/k9h0;->u1:La/k9h0;

    goto :goto_5

    .line 33
    :sswitch_4
    const-string v4, "mycasino"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 34
    sget-object v0, La/k9h0;->p1:La/k9h0;

    goto :goto_5

    .line 35
    :sswitch_5
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_4

    .line 36
    :cond_d
    sget-object v0, La/k9h0;->r1:La/k9h0;

    goto :goto_5

    .line 37
    :sswitch_6
    const-string v4, "brands"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_4

    .line 38
    :cond_e
    sget-object v0, La/k9h0;->A1:La/k9h0;

    goto :goto_5

    .line 39
    :cond_f
    :goto_4
    sget-object v0, La/k9h0;->b:La/k9h0;

    .line 40
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_ce

    const/16 v4, 0x37

    const-string v6, "tournament"

    if-eq v0, v4, :cond_26

    const/16 v3, 0x3a

    if-eq v0, v3, :cond_25

    const/16 v3, 0x3e

    if-eq v0, v3, :cond_23

    const/16 v3, 0x46

    if-eq v0, v3, :cond_22

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_4c

    :pswitch_0
    const/4 v0, 0x0

    .line 41
    invoke-virtual {v2, v9, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_10

    const-wide/16 v3, 0x0

    goto :goto_6

    :cond_10
    move-wide/from16 v3, v23

    .line 42
    :goto_6
    const-string v1, "OPEN_NATIVE_TOURNAMENT"

    invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 43
    const-string v0, "casinoNativeTournamentId"

    const-wide/16 v7, 0x0

    invoke-virtual {v2, v0, v7, v8}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    goto :goto_7

    :cond_11
    const-wide/16 v7, 0x0

    .line 44
    const-string v0, "casinoTournamentId"

    invoke-virtual {v2, v0, v7, v8}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 45
    :goto_7
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 46
    new-instance v0, La/jr1;

    new-instance v1, La/evc0;

    const/4 v6, 0x0

    .line 47
    invoke-direct {v1, v6, v3, v4}, La/evc0;-><init>(ZJ)V

    .line 48
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    goto :goto_8

    :cond_12
    const/4 v6, 0x0

    .line 49
    new-instance v2, La/jr1;

    new-instance v3, La/evc0;

    .line 50
    invoke-direct {v3, v6, v0, v1}, La/evc0;-><init>(ZJ)V

    .line 51
    invoke-direct {v2, v3}, La/jr1;-><init>(La/fvc0;)V

    move-object v0, v2

    .line 52
    :goto_8
    new-instance v1, La/olj;

    invoke-direct {v1, v0}, La/olj;-><init>(La/lr1;)V

    return-object v1

    :pswitch_1
    const/4 v6, 0x0

    const-wide/16 v19, 0x0

    cmp-long v0, v23, v19

    if-nez v0, :cond_13

    move-wide/from16 v23, v16

    .line 53
    :cond_13
    invoke-virtual {v2, v9, v6}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_14

    move-wide/from16 v27, v16

    goto :goto_9

    :cond_14
    move-wide/from16 v27, v23

    :goto_9
    if-eqz v0, :cond_16

    :cond_15
    const-wide/16 v31, 0x0

    goto :goto_a

    .line 54
    :cond_16
    const-string v2, "partId"

    invoke-static {v1, v2}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_15

    .line 55
    invoke-static {v2}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_15

    .line 56
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    move-wide/from16 v31, v10

    :goto_a
    if-eqz v0, :cond_17

    .line 57
    sget-object v0, La/iun;->a:La/iun;

    :goto_b
    move-object/from16 v29, v0

    goto :goto_c

    .line 58
    :cond_17
    invoke-static {v1, v15}, La/prj;->B(Landroid/net/Uri;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_b

    :goto_c
    if-eqz v21, :cond_18

    .line 59
    sget-object v0, La/q91;->c:La/q91;

    goto :goto_d

    .line 60
    :cond_18
    sget-object v0, La/q91;->b:La/q91;

    .line 61
    :goto_d
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x3adbfa0f

    if-eq v1, v2, :cond_1c

    const v2, 0x304bf2

    if-eq v1, v2, :cond_1a

    const v2, 0x4d823b3e    # 2.7311507E8f

    if-eq v1, v2, :cond_19

    goto :goto_e

    :cond_19
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    .line 62
    new-instance v1, La/fr1;

    .line 63
    new-instance v25, La/fs80;

    const/16 v33, 0x0

    const/16 v34, 0x79

    const/16 v26, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    invoke-direct/range {v25 .. v34}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    move-object/from16 v2, v25

    .line 64
    invoke-direct {v1, v2, v0}, La/fr1;-><init>(La/fs80;La/q91;)V

    goto/16 :goto_11

    .line 65
    :cond_1a
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    goto :goto_e

    .line 66
    :cond_1b
    new-instance v1, La/fr1;

    .line 67
    new-instance v25, La/fs80;

    const/16 v33, 0x0

    const/16 v34, 0x6f

    const/16 v26, 0x0

    move-wide/from16 v31, v27

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v25 .. v34}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    move-object/from16 v2, v25

    .line 68
    invoke-direct {v1, v2, v0}, La/fr1;-><init>(La/fs80;La/q91;)V

    goto :goto_11

    .line 69
    :cond_1c
    const-string v1, "provider"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    .line 70
    :cond_1d
    :goto_e
    new-instance v1, La/fr1;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, v3, v0, v2}, La/fr1;-><init>(La/fs80;La/q91;I)V

    goto :goto_11

    .line 71
    :cond_1e
    new-instance v1, La/fr1;

    .line 72
    sget-object v2, La/nw80;->b:La/nw80;

    invoke-virtual {v2}, La/nw80;->getId()J

    move-result-wide v2

    cmp-long v2, v31, v2

    if-eqz v2, :cond_20

    .line 73
    sget-object v2, La/nw80;->a:La/nw80;

    invoke-virtual {v2}, La/nw80;->getId()J

    move-result-wide v2

    cmp-long v2, v31, v2

    if-nez v2, :cond_1f

    goto :goto_f

    .line 74
    :cond_1f
    new-instance v3, La/fs80;

    const/4 v11, 0x0

    const/16 v12, 0x7f

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    invoke-direct/range {v3 .. v12}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    goto :goto_10

    .line 75
    :cond_20
    :goto_f
    new-instance v29, La/fs80;

    .line 76
    invoke-static/range {v27 .. v28}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v34

    const/16 v37, 0x0

    const/16 v38, 0x75

    const/16 v30, 0x0

    const/16 v33, 0x0

    const-wide/16 v35, 0x0

    .line 77
    invoke-direct/range {v29 .. v38}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    move-object/from16 v3, v29

    .line 78
    :goto_10
    invoke-direct {v1, v3, v0}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 79
    :goto_11
    new-instance v0, La/olj;

    invoke-direct {v0, v1}, La/olj;-><init>(La/lr1;)V

    return-object v0

    .line 80
    :pswitch_2
    const-string v0, "vipcashback"

    .line 81
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 82
    new-instance v0, La/hr1;

    const-wide/16 v1, -0xa

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, La/hr1;-><init>(JI)V

    goto :goto_12

    .line 83
    :cond_21
    new-instance v0, La/hr1;

    const/4 v1, 0x3

    const-wide/16 v7, 0x0

    invoke-direct {v0, v7, v8, v1}, La/hr1;-><init>(JI)V

    .line 84
    :goto_12
    new-instance v1, La/olj;

    invoke-direct {v1, v0}, La/olj;-><init>(La/lr1;)V

    return-object v1

    .line 85
    :cond_22
    new-instance v0, La/qlj;

    .line 86
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :cond_23
    const/4 v0, 0x0

    .line 87
    invoke-virtual {v2, v9, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_24

    const-wide/16 v10, 0x0

    goto :goto_13

    :cond_24
    move-wide/from16 v10, v23

    .line 88
    :goto_13
    new-instance v0, La/er1;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v10, v11}, La/er1;-><init>(ZJ)V

    new-instance v1, La/olj;

    invoke-direct {v1, v0}, La/olj;-><init>(La/lr1;)V

    return-object v1

    .line 89
    :cond_25
    new-instance v0, La/gpj;

    .line 90
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :cond_26
    const/4 v0, 0x0

    .line 91
    invoke-virtual {v2, v9, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_27

    const-wide/16 v0, 0x0

    goto :goto_14

    :cond_27
    move-wide/from16 v0, v23

    .line 92
    :goto_14
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_1

    goto/16 :goto_15

    :sswitch_7
    const-string v2, "nativetournament"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    goto/16 :goto_15

    .line 93
    :cond_28
    new-instance v2, La/jr1;

    new-instance v3, La/evc0;

    const/4 v6, 0x0

    .line 94
    invoke-direct {v3, v6, v0, v1}, La/evc0;-><init>(ZJ)V

    .line 95
    invoke-direct {v2, v3}, La/jr1;-><init>(La/fvc0;)V

    goto/16 :goto_16

    .line 96
    :sswitch_8
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_29

    goto/16 :goto_15

    .line 97
    :cond_29
    new-instance v2, La/jr1;

    .line 98
    new-instance v0, La/cvc0;

    .line 99
    sget-object v1, La/d7v;->c:La/d7v;

    .line 100
    invoke-direct {v0, v1}, La/cvc0;-><init>(La/d7v;)V

    .line 101
    invoke-direct {v2, v0}, La/jr1;-><init>(La/fvc0;)V

    goto/16 :goto_16

    .line 102
    :sswitch_9
    const-string v0, "freespins"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2a

    goto :goto_15

    .line 103
    :cond_2a
    new-instance v2, La/jr1;

    .line 104
    new-instance v0, La/cvc0;

    .line 105
    sget-object v1, La/d7v;->d:La/d7v;

    .line 106
    invoke-direct {v0, v1}, La/cvc0;-><init>(La/d7v;)V

    .line 107
    invoke-direct {v2, v0}, La/jr1;-><init>(La/fvc0;)V

    goto :goto_16

    .line 108
    :sswitch_a
    const-string v2, "promocode"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2b

    goto :goto_15

    .line 109
    :cond_2b
    new-instance v2, La/jr1;

    .line 110
    new-instance v3, La/dvc0;

    long-to-int v0, v0

    invoke-direct {v3, v0}, La/dvc0;-><init>(I)V

    .line 111
    invoke-direct {v2, v3}, La/jr1;-><init>(La/fvc0;)V

    goto :goto_16

    .line 112
    :sswitch_b
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c

    goto :goto_15

    .line 113
    :cond_2c
    new-instance v2, La/jr1;

    new-instance v0, La/evc0;

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    .line 114
    invoke-direct {v0, v6, v7, v8}, La/evc0;-><init>(ZJ)V

    .line 115
    invoke-direct {v2, v0}, La/jr1;-><init>(La/fvc0;)V

    goto :goto_16

    .line 116
    :sswitch_c
    const-string v0, "prizes"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d

    goto :goto_15

    .line 117
    :cond_2d
    new-instance v2, La/jr1;

    .line 118
    new-instance v0, La/cvc0;

    .line 119
    sget-object v1, La/d7v;->b:La/d7v;

    .line 120
    invoke-direct {v0, v1}, La/cvc0;-><init>(La/d7v;)V

    .line 121
    invoke-direct {v2, v0}, La/jr1;-><init>(La/fvc0;)V

    goto :goto_16

    .line 122
    :sswitch_d
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2e

    .line 123
    :goto_15
    new-instance v2, La/jr1;

    invoke-direct {v2}, La/jr1;-><init>()V

    goto :goto_16

    .line 124
    :cond_2e
    new-instance v2, La/jr1;

    new-instance v3, La/evc0;

    const/4 v6, 0x0

    .line 125
    invoke-direct {v3, v6, v0, v1}, La/evc0;-><init>(ZJ)V

    .line 126
    invoke-direct {v2, v3}, La/jr1;-><init>(La/fvc0;)V

    .line 127
    :goto_16
    new-instance v0, La/olj;

    invoke-direct {v0, v2}, La/olj;-><init>(La/lr1;)V

    return-object v0

    .line 128
    :cond_2f
    sget-object v8, La/hrj;->g:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 129
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_30

    .line 130
    new-instance v0, La/rlj;

    .line 131
    sget-object v1, La/r080;->a:La/r080;

    .line 132
    invoke-direct {v0, v5, v1}, La/rlj;-><init>(Ljava/lang/String;La/r080;)V

    return-object v0

    .line 133
    :cond_30
    sget-object v8, La/hrj;->r1:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 134
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_31

    .line 135
    invoke-static {v1}, La/prj;->x(Landroid/net/Uri;)La/ynj;

    move-result-object v0

    return-object v0

    .line 136
    :cond_31
    sget-object v8, La/hrj;->i2:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 137
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_32

    .line 138
    new-instance v0, La/fpj;

    .line 139
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 140
    :cond_32
    sget-object v8, La/hrj;->c:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 141
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_33

    .line 142
    new-instance v0, La/jnj;

    .line 143
    invoke-static {v2}, La/prj;->z(Landroid/content/Intent;)La/aue0;

    move-result-object v1

    .line 144
    const-string v3, "AUTH_NOTIFICATION_TYPE"

    const/4 v6, 0x0

    .line 145
    invoke-virtual {v2, v3, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 146
    invoke-direct {v0, v2, v1}, La/jnj;-><init>(ILa/aue0;)V

    return-object v0

    .line 147
    :cond_33
    sget-object v8, La/hrj;->e:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 148
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_34

    .line 149
    new-instance v0, La/noj;

    .line 150
    invoke-static {v2}, La/prj;->z(Landroid/content/Intent;)La/aue0;

    move-result-object v1

    .line 151
    invoke-direct {v0, v1}, La/noj;-><init>(La/aue0;)V

    return-object v0

    .line 152
    :cond_34
    sget-object v8, La/hrj;->f:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 153
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_36

    .line 154
    invoke-virtual {v1, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_35

    goto :goto_17

    :cond_35
    move-object v5, v0

    .line 155
    :goto_17
    new-instance v0, La/anj;

    sget-object v1, La/frj;->b:La/kud;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, La/kud;->d(Ljava/lang/String;)La/frj;

    move-result-object v1

    invoke-direct {v0, v1}, La/anj;-><init>(La/frj;)V

    return-object v0

    .line 156
    :cond_36
    sget-object v8, La/hrj;->m1:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 157
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_38

    .line 158
    new-instance v0, La/hmj;

    .line 159
    invoke-static {v1, v12}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_37

    :goto_18
    const/4 v6, 0x0

    goto :goto_19

    :cond_37
    move-object v5, v1

    goto :goto_18

    .line 160
    :goto_19
    invoke-direct {v0, v5, v6}, La/hmj;-><init>(Ljava/lang/String;Z)V

    return-object v0

    .line 161
    :cond_38
    sget-object v8, La/hrj;->j2:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 162
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3a

    .line 163
    new-instance v0, La/hmj;

    .line 164
    invoke-static {v1, v12}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_39

    :goto_1a
    const/4 v2, 0x1

    goto :goto_1b

    :cond_39
    move-object v5, v1

    goto :goto_1a

    .line 165
    :goto_1b
    invoke-direct {v0, v5, v2}, La/hmj;-><init>(Ljava/lang/String;Z)V

    return-object v0

    .line 166
    :cond_3a
    sget-object v8, La/hrj;->h:La/hrj;

    invoke-virtual {v8}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v8

    .line 167
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    move-object/from16 v23, v5

    .line 168
    const-string v5, "sportid"

    move/from16 v24, v8

    const-string v8, "live"

    if-eqz v24, :cond_43

    .line 169
    const-string v0, "oppId"

    invoke-static {v1, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3b

    invoke-static {v0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v4

    goto :goto_1c

    :cond_3b
    const/4 v4, 0x0

    :goto_1c
    if-eqz v4, :cond_3c

    .line 170
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    new-instance v2, La/cpj;

    invoke-direct {v2, v0, v1}, La/cpj;-><init>(J)V

    return-object v2

    .line 171
    :cond_3c
    invoke-static {v1, v6}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3d

    move-object/from16 v0, v23

    .line 172
    :cond_3d
    invoke-static {v1, v5}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3f

    .line 173
    invoke-static {v1, v5}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3e

    .line 174
    invoke-static {v1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_3e

    .line 175
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_1d

    :cond_3e
    const-wide/16 v1, 0x0

    goto :goto_1d

    .line 176
    :cond_3f
    invoke-static {v1, v12}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3e

    invoke-static {v1, v12}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3e

    .line 177
    invoke-static {v1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_3e

    .line 178
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 179
    :goto_1d
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 180
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 181
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_40
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_41

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    const-wide/16 v19, 0x0

    cmp-long v4, v4, v19

    if-eqz v4, :cond_40

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    .line 182
    :cond_41
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v14

    .line 183
    new-instance v9, La/inj;

    .line 184
    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_42

    .line 185
    sget-object v0, La/j700;->b:La/j700;

    :goto_1f
    move-object v10, v0

    goto :goto_20

    :cond_42
    sget-object v0, La/j700;->a:La/j700;

    goto :goto_1f

    .line 186
    :goto_20
    sget-object v15, La/xun;->a:La/xun;

    const/16 v16, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    .line 187
    invoke-direct/range {v9 .. v16}, La/inj;-><init>(La/j700;IJLjava/util/Set;Ljava/util/Set;Z)V

    return-object v9

    .line 188
    :cond_43
    sget-object v24, La/hrj;->i:La/hrj;

    invoke-virtual/range {v24 .. v24}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    .line 189
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_44

    .line 190
    new-instance v0, La/xoj;

    .line 191
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 192
    :cond_44
    sget-object v0, La/hrj;->j:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    .line 193
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    move/from16 v24, v0

    .line 194
    const-string v0, "subSportId"

    move-object/from16 v25, v13

    const-string v13, "cybertype"

    if-eqz v24, :cond_4f

    .line 195
    invoke-static {v1, v6}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_45

    move-object/from16 v3, v23

    .line 196
    :cond_45
    invoke-static {v1, v13}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_46

    invoke-static {v4}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_46

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move v11, v4

    goto :goto_21

    :cond_46
    const/4 v11, 0x0

    .line 197
    :goto_21
    invoke-static {v1, v5}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_47

    invoke-static {v4}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v4

    if-eqz v4, :cond_47

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_22

    :cond_47
    const-wide/16 v4, 0x0

    .line 198
    :goto_22
    const-string v6, "champid"

    invoke-static {v1, v6}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_48

    invoke-static {v6}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    if-eqz v6, :cond_48

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    goto :goto_23

    :cond_48
    const-wide/16 v6, 0x0

    .line 199
    :goto_23
    const-string v9, "iscyber"

    invoke-static {v1, v9}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_49

    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    move/from16 v16, v1

    goto :goto_24

    :cond_49
    const/16 v16, 0x0

    .line 200
    :goto_24
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 201
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 202
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4a
    :goto_25
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    const-wide/16 v19, 0x0

    cmp-long v9, v9, v19

    if-eqz v9, :cond_4a

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_25

    .line 203
    :cond_4b
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v14

    .line 204
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 205
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 206
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4c
    :goto_26
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    const-wide/16 v9, 0x0

    cmp-long v6, v6, v9

    if-eqz v6, :cond_4c

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_26

    :cond_4d
    const-wide/16 v9, 0x0

    .line 207
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v15

    .line 208
    invoke-virtual {v2, v0, v9, v10}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v12

    .line 209
    new-instance v9, La/inj;

    .line 210
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4e

    .line 211
    sget-object v0, La/j700;->b:La/j700;

    :goto_27
    move-object v10, v0

    goto :goto_28

    :cond_4e
    sget-object v0, La/j700;->a:La/j700;

    goto :goto_27

    .line 212
    :goto_28
    invoke-direct/range {v9 .. v16}, La/inj;-><init>(La/j700;IJLjava/util/Set;Ljava/util/Set;Z)V

    return-object v9

    .line 213
    :cond_4f
    sget-object v24, La/hrj;->k:La/hrj;

    move-object/from16 v26, v5

    invoke-virtual/range {v24 .. v24}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v5

    .line 214
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_52

    .line 215
    invoke-static {v1, v6}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_50

    move-object/from16 v5, v23

    goto :goto_29

    :cond_50
    move-object v5, v3

    .line 216
    :goto_29
    invoke-static {v1, v12}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_51

    invoke-static {v1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_51

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    move-wide v10, v3

    :goto_2a
    const-wide/16 v3, 0x0

    goto :goto_2b

    :cond_51
    const-wide/16 v10, 0x0

    goto :goto_2a

    :goto_2b
    cmp-long v1, v10, v3

    if-eqz v1, :cond_ce

    .line 217
    const-string v1, "SPORT_ID"

    invoke-virtual {v2, v1, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v14

    .line 218
    invoke-virtual {v2, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 219
    const-string v1, "selected_sub_game_id"

    invoke-virtual {v2, v1, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v12

    .line 220
    invoke-virtual {v2, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 221
    invoke-virtual {v2, v0, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v16

    .line 222
    invoke-virtual {v2, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 223
    new-instance v9, La/bnj;

    .line 224
    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v18

    .line 225
    invoke-direct/range {v9 .. v18}, La/bnj;-><init>(JJJJZ)V

    return-object v9

    .line 226
    :cond_52
    sget-object v0, La/hrj;->Z:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    .line 227
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_68

    .line 228
    invoke-static {v1, v6}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_53

    move-object/from16 v0, v23

    .line 229
    :cond_53
    invoke-static {v1, v12}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_54

    .line 230
    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_54

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_2d

    :cond_54
    const-string v2, "xGamesGameId"

    invoke-static {v1, v2}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_55

    .line 231
    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_2c

    :cond_55
    const/4 v4, 0x0

    :goto_2c
    if-eqz v4, :cond_56

    .line 232
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_2d

    :cond_56
    const/4 v2, 0x0

    .line 233
    :goto_2d
    const-string v3, "category"

    invoke-static {v1, v3}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_57

    move-object/from16 v3, v23

    .line 234
    :cond_57
    const-string v4, "from"

    invoke-static {v1, v4}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_58

    move-object/from16 v5, v23

    goto :goto_2e

    :cond_58
    move-object v5, v1

    .line 235
    :goto_2e
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_59

    .line 236
    new-instance v0, La/pnj;

    invoke-direct {v0, v3}, La/pnj;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 237
    :cond_59
    const-string v1, "cashback"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    .line 238
    const-string v6, "favorites"

    if-nez v4, :cond_61

    .line 239
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_61

    .line 240
    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5a

    goto :goto_30

    .line 241
    :cond_5a
    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5f

    const/4 v1, 0x1

    if-eq v2, v1, :cond_5e

    const/4 v1, 0x3

    if-eq v2, v1, :cond_5d

    const/4 v0, 0x5

    if-eq v2, v0, :cond_5c

    const/4 v0, 0x7

    if-eq v2, v0, :cond_5b

    .line 242
    sget-object v0, La/d270;->j:La/d270;

    goto :goto_2f

    .line 243
    :cond_5b
    sget-object v0, La/d270;->f:La/d270;

    goto :goto_2f

    .line 244
    :cond_5c
    sget-object v0, La/d270;->h:La/d270;

    goto :goto_2f

    .line 245
    :cond_5d
    sget-object v0, La/d270;->g:La/d270;

    goto :goto_2f

    .line 246
    :cond_5e
    sget-object v0, La/d270;->d:La/d270;

    .line 247
    :goto_2f
    new-instance v1, La/unj;

    invoke-direct {v1, v0}, La/unj;-><init>(La/d270;)V

    return-object v1

    .line 248
    :cond_5f
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_60

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_60

    if-eqz v2, :cond_60

    .line 249
    new-instance v0, La/qnj;

    int-to-long v1, v2

    invoke-direct {v0, v1, v2, v5}, La/qnj;-><init>(JLjava/lang/String;)V

    return-object v0

    .line 250
    :cond_60
    sget-object v0, La/t270;->a:La/t270;

    new-instance v1, La/wnj;

    invoke-direct {v1, v0}, La/wnj;-><init>(La/t270;)V

    return-object v1

    .line 251
    :cond_61
    :goto_30
    new-instance v2, La/wnj;

    .line 252
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v4, -0x6a6895a9

    if-eq v3, v4, :cond_65

    const v4, 0x175ae9a

    if-eq v3, v4, :cond_64

    const v1, 0x3d1a10d

    if-eq v3, v1, :cond_62

    goto :goto_31

    :cond_62
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_63

    goto :goto_31

    .line 253
    :cond_63
    sget-object v0, La/t270;->b:La/t270;

    goto :goto_32

    .line 254
    :cond_64
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_66

    .line 255
    sget-object v0, La/t270;->c:La/t270;

    goto :goto_32

    .line 256
    :cond_65
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_67

    .line 257
    :cond_66
    :goto_31
    sget-object v0, La/t270;->a:La/t270;

    goto :goto_32

    .line 258
    :cond_67
    sget-object v0, La/t270;->d:La/t270;

    .line 259
    :goto_32
    invoke-direct {v2, v0}, La/wnj;-><init>(La/t270;)V

    return-object v2

    .line 260
    :cond_68
    sget-object v0, La/hrj;->q:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    .line 261
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_69

    .line 262
    new-instance v0, La/dmj;

    .line 263
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 264
    :cond_69
    sget-object v0, La/hrj;->l:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    .line 265
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6a

    .line 266
    new-instance v0, La/ymj;

    const/4 v6, 0x0

    invoke-direct {v0, v6}, La/ymj;-><init>(Z)V

    return-object v0

    .line 267
    :cond_6a
    sget-object v0, La/hrj;->m:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    .line 268
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6c

    .line 269
    invoke-static {v1, v12}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6b

    .line 270
    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_6b

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_33

    :cond_6b
    const/4 v7, 0x0

    .line 271
    :goto_33
    new-instance v0, La/hoj;

    invoke-direct {v0, v7}, La/hoj;-><init>(I)V

    return-object v0

    .line 272
    :cond_6c
    sget-object v0, La/hrj;->n:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    .line 273
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 274
    const-string v5, "REGISTRATION_DEFAULT_BONUS_ID"

    if-eqz v0, :cond_6f

    .line 275
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_6d

    invoke-static {v0, v5}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6d

    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_34

    :cond_6d
    const/4 v4, 0x0

    .line 276
    :goto_34
    const-string v0, "bonusGameId"

    invoke-static {v1, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6e

    invoke-static {v0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_6e

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    goto :goto_35

    :cond_6e
    const-wide/16 v10, 0x0

    .line 277
    :goto_35
    new-instance v0, La/joj;

    .line 278
    sget-object v1, La/aue0;->b:La/cge0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, La/cge0;->h(Ljava/lang/Integer;)La/aue0;

    move-result-object v1

    .line 279
    invoke-direct {v0, v10, v11, v1}, La/joj;-><init>(JLa/aue0;)V

    return-object v0

    .line 280
    :cond_6f
    sget-object v0, La/hrj;->o:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    .line 281
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_70

    .line 282
    new-instance v0, La/goj;

    .line 283
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 284
    :cond_70
    sget-object v0, La/hrj;->Y:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    .line 285
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_71

    .line 286
    new-instance v0, La/cmj;

    .line 287
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 288
    :cond_71
    sget-object v0, La/hrj;->v:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    .line 289
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_72

    .line 290
    new-instance v0, La/mpj;

    .line 291
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 292
    :cond_72
    sget-object v0, La/hrj;->w:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_73

    new-instance v0, La/npj;

    .line 293
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 294
    :cond_73
    sget-object v0, La/hrj;->x:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_74

    new-instance v0, La/opj;

    .line 295
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 296
    :cond_74
    sget-object v0, La/hrj;->z:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_75

    new-instance v0, La/qpj;

    .line 297
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 298
    :cond_75
    sget-object v0, La/hrj;->A:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_76

    new-instance v0, La/ppj;

    .line 299
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 300
    :cond_76
    sget-object v0, La/hrj;->B:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_77

    new-instance v0, La/rpj;

    .line 301
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 302
    :cond_77
    sget-object v0, La/hrj;->y:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_78

    new-instance v0, La/spj;

    .line 303
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 304
    :cond_78
    sget-object v0, La/hrj;->f1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7a

    .line 305
    invoke-static {v1, v6}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_79

    move-object/from16 v5, v23

    goto :goto_36

    :cond_79
    move-object v5, v0

    .line 306
    :goto_36
    const-string v0, "xgames"

    .line 307
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_ce

    .line 308
    new-instance v0, La/snj;

    .line 309
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 310
    :cond_7a
    sget-object v0, La/hrj;->l1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7b

    new-instance v0, La/epj;

    .line 311
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 312
    :cond_7b
    sget-object v0, La/hrj;->p1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7c

    new-instance v0, La/soj;

    .line 313
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 314
    :cond_7c
    sget-object v0, La/hrj;->o1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7d

    new-instance v0, La/poj;

    .line 315
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 316
    :cond_7d
    sget-object v0, La/hrj;->A1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7e

    new-instance v0, La/lmj;

    .line 317
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 318
    :cond_7e
    sget-object v0, La/hrj;->u1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7f

    new-instance v0, La/doj;

    .line 319
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 320
    :cond_7f
    sget-object v0, La/hrj;->P1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_80

    new-instance v0, La/wmj;

    .line 321
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 322
    :cond_80
    sget-object v0, La/hrj;->F1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_81

    new-instance v0, La/yoj;

    .line 323
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 324
    :cond_81
    sget-object v0, La/hrj;->D1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_82

    new-instance v0, La/hnj;

    .line 325
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 326
    :cond_82
    sget-object v0, La/hrj;->E1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_83

    new-instance v0, La/foj;

    .line 327
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 328
    :cond_83
    sget-object v0, La/hrj;->d:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_84

    new-instance v0, La/eoj;

    .line 329
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 330
    :cond_84
    sget-object v0, La/hrj;->Q1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_85

    new-instance v0, La/vmj;

    .line 331
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 332
    :cond_85
    sget-object v0, La/hrj;->R1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_86

    new-instance v0, La/tmj;

    .line 333
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 334
    :cond_86
    sget-object v0, La/hrj;->U1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_87

    new-instance v0, La/umj;

    .line 335
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 336
    :cond_87
    sget-object v0, La/hrj;->V1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_88

    new-instance v0, La/apj;

    .line 337
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 338
    :cond_88
    sget-object v0, La/hrj;->W1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_89

    new-instance v0, La/zoj;

    .line 339
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 340
    :cond_89
    sget-object v0, La/hrj;->X1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8a

    new-instance v0, La/xnj;

    .line 341
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 342
    :cond_8a
    sget-object v0, La/hrj;->Y1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8b

    new-instance v0, La/coj;

    .line 343
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 344
    :cond_8b
    sget-object v0, La/hrj;->Z1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8c

    new-instance v0, La/ulj;

    .line 345
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 346
    :cond_8c
    sget-object v0, La/hrj;->a2:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8d

    new-instance v0, La/nlj;

    .line 347
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 348
    :cond_8d
    sget-object v0, La/hrj;->e2:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8e

    new-instance v0, La/llj;

    .line 349
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 350
    :cond_8e
    sget-object v0, La/hrj;->f2:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8f

    new-instance v0, La/knj;

    .line 351
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 352
    :cond_8f
    sget-object v0, La/hrj;->g2:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_90

    new-instance v0, La/mlj;

    .line 353
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 354
    :cond_90
    sget-object v0, La/hrj;->p:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_91

    new-instance v0, La/ioj;

    .line 355
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 356
    :cond_91
    sget-object v0, La/hrj;->s:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_92

    new-instance v0, La/bmj;

    .line 357
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 358
    :cond_92
    sget-object v0, La/hrj;->r:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_93

    new-instance v0, La/gmj;

    .line 359
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 360
    :cond_93
    sget-object v0, La/hrj;->t:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_94

    new-instance v0, La/emj;

    .line 361
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 362
    :cond_94
    sget-object v0, La/hrj;->u:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_95

    new-instance v0, La/fmj;

    .line 363
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 364
    :cond_95
    sget-object v0, La/hrj;->h2:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_96

    new-instance v0, La/dnj;

    .line 365
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 366
    :cond_96
    sget-object v0, La/hrj;->h1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a0

    .line 367
    invoke-static {v1, v10}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 368
    const-string v3, "myvirtual"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_97

    new-instance v0, La/hr1;

    const/4 v1, 0x3

    const-wide/16 v9, 0x0

    invoke-direct {v0, v9, v10, v1}, La/hr1;-><init>(JI)V

    new-instance v1, La/tpj;

    invoke-direct {v1, v0}, La/tpj;-><init>(La/lr1;)V

    move-object/from16 v22, v1

    goto/16 :goto_3e

    .line 369
    :cond_97
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9f

    const/4 v0, 0x0

    .line 370
    invoke-virtual {v2, v9, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_99

    :cond_98
    :goto_37
    move-wide/from16 v28, v16

    goto :goto_38

    .line 371
    :cond_99
    invoke-static {v1, v12}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_98

    invoke-static {v2}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_98

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    goto :goto_37

    :goto_38
    if-eqz v0, :cond_9a

    .line 372
    sget-object v0, La/iun;->a:La/iun;

    :goto_39
    move-object/from16 v30, v0

    goto :goto_3a

    .line 373
    :cond_9a
    invoke-static {v1, v15}, La/prj;->B(Landroid/net/Uri;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_39

    :goto_3a
    if-eqz v21, :cond_9b

    .line 374
    sget-object v0, La/q91;->c:La/q91;

    goto :goto_3b

    .line 375
    :cond_9b
    sget-object v0, La/q91;->b:La/q91;

    .line 376
    :goto_3b
    invoke-static {v1, v6}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9c

    move-object/from16 v5, v23

    goto :goto_3c

    :cond_9c
    move-object v5, v1

    .line 377
    :goto_3c
    invoke-virtual {v5, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9d

    .line 378
    new-instance v1, La/fr1;

    .line 379
    new-instance v26, La/fs80;

    const/16 v34, 0x0

    const/16 v35, 0x79

    const/16 v27, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    invoke-direct/range {v26 .. v35}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    move-object/from16 v2, v26

    .line 380
    invoke-direct {v1, v2, v0}, La/fr1;-><init>(La/fs80;La/q91;)V

    goto :goto_3d

    :cond_9d
    move-object/from16 v1, v25

    .line 381
    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9e

    .line 382
    new-instance v1, La/fr1;

    .line 383
    new-instance v26, La/fs80;

    const/16 v34, 0x0

    const/16 v35, 0x6f

    const/16 v27, 0x0

    move-wide/from16 v32, v28

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v26 .. v35}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    move-object/from16 v2, v26

    .line 384
    invoke-direct {v1, v2, v0}, La/fr1;-><init>(La/fs80;La/q91;)V

    goto :goto_3d

    .line 385
    :cond_9e
    new-instance v1, La/fr1;

    const/4 v4, 0x1

    const/4 v7, 0x0

    invoke-direct {v1, v7, v0, v4}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 386
    :goto_3d
    new-instance v0, La/tpj;

    invoke-direct {v0, v1}, La/tpj;-><init>(La/lr1;)V

    move-object/from16 v22, v0

    :cond_9f
    :goto_3e
    return-object v22

    :cond_a0
    const/4 v0, 0x0

    const/4 v4, 0x1

    const/4 v7, 0x0

    const-wide/16 v9, 0x0

    .line 387
    sget-object v11, La/hrj;->j1:La/hrj;

    invoke-virtual {v11}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a3

    .line 388
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_a1

    invoke-static {v0, v5}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a1

    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_3f

    :cond_a1
    move-object v4, v7

    .line 389
    :goto_3f
    const-string v0, "balanceId"

    invoke-static {v1, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a2

    invoke-static {v0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_a2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    goto :goto_40

    :cond_a2
    move-wide v10, v9

    .line 390
    :goto_40
    sget-object v0, La/aue0;->b:La/cge0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, La/cge0;->h(Ljava/lang/Integer;)La/aue0;

    move-result-object v0

    .line 391
    new-instance v1, La/znj;

    invoke-direct {v1, v10, v11, v0}, La/znj;-><init>(JLa/aue0;)V

    return-object v1

    .line 392
    :cond_a3
    sget-object v2, La/hrj;->k1:La/hrj;

    invoke-virtual {v2}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a4

    new-instance v0, La/boj;

    .line 393
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 394
    :cond_a4
    sget-object v2, La/hrj;->n1:La/hrj;

    invoke-virtual {v2}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a7

    .line 395
    invoke-static {v1, v13}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_a5

    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_a5

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_41

    :cond_a5
    move v2, v0

    .line 396
    :goto_41
    const-string v3, "isEWC"

    invoke-static {v1, v3}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a6

    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v7

    goto :goto_42

    :cond_a6
    move v7, v0

    .line 397
    :goto_42
    new-instance v0, La/imj;

    invoke-direct {v0, v2, v7}, La/imj;-><init>(IZ)V

    return-object v0

    .line 398
    :cond_a7
    sget-object v2, La/hrj;->q1:La/hrj;

    invoke-virtual {v2}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a9

    new-instance v0, La/roj;

    .line 399
    invoke-virtual {v1, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a8

    move-object/from16 v5, v23

    goto :goto_43

    :cond_a8
    move-object v5, v1

    .line 400
    :goto_43
    invoke-direct {v0, v5}, La/roj;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 401
    :cond_a9
    sget-object v2, La/hrj;->s1:La/hrj;

    invoke-virtual {v2}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_af

    .line 402
    invoke-static {v1, v12}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_aa

    invoke-static {v2}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_aa

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-wide v12, v2

    :goto_44
    move-object/from16 v2, v26

    goto :goto_45

    :cond_aa
    move-wide v12, v9

    goto :goto_44

    .line 403
    :goto_45
    invoke-static {v1, v2}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_ab

    invoke-static {v2}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_ab

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-wide v14, v2

    goto :goto_46

    :cond_ab
    move-wide v14, v9

    .line 404
    :goto_46
    const-string v2, "subsportid"

    invoke-static {v1, v2}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_ac

    invoke-static {v2}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_ac

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    move-wide/from16 v16, v10

    goto :goto_47

    :cond_ac
    move-wide/from16 v16, v9

    .line 405
    :goto_47
    invoke-static {v1, v6}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_ad

    move-object/from16 v5, v23

    goto :goto_48

    :cond_ad
    move-object v5, v1

    :goto_48
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    new-instance v11, La/mmj;

    .line 407
    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_ae

    move/from16 v18, v4

    goto :goto_49

    .line 408
    :cond_ae
    const-string v2, "line"

    .line 409
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move/from16 v18, v0

    .line 410
    :goto_49
    invoke-direct/range {v11 .. v18}, La/mmj;-><init>(JJJZ)V

    return-object v11

    .line 411
    :cond_af
    sget-object v2, La/hrj;->t1:La/hrj;

    invoke-virtual {v2}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b0

    invoke-static {v1}, La/prj;->g(Landroid/net/Uri;)La/pmj;

    move-result-object v0

    return-object v0

    .line 412
    :cond_b0
    sget-object v2, La/hrj;->v1:La/hrj;

    invoke-virtual {v2}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b1

    invoke-static {v1}, La/prj;->f(Landroid/net/Uri;)La/kmj;

    move-result-object v0

    return-object v0

    .line 413
    :cond_b1
    sget-object v2, La/hrj;->x1:La/hrj;

    invoke-virtual {v2}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b2

    move-object/from16 v2, p0

    move-object/from16 v4, p4

    invoke-virtual {v2, v4}, La/prj;->i(La/zje;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_b2
    move-object/from16 v2, p0

    .line 414
    sget-object v4, La/hrj;->y1:La/hrj;

    invoke-virtual {v4}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b3

    invoke-static {v1}, La/prj;->e(Landroid/net/Uri;)La/jmj;

    move-result-object v0

    return-object v0

    .line 415
    :cond_b3
    sget-object v4, La/hrj;->z1:La/hrj;

    invoke-virtual {v4}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b4

    invoke-static {v1}, La/prj;->k(Landroid/net/Uri;)La/rmj;

    move-result-object v0

    return-object v0

    .line 416
    :cond_b4
    sget-object v4, La/hrj;->B1:La/hrj;

    invoke-virtual {v4}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b6

    .line 417
    invoke-static {v1, v13}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b5

    invoke-static {v1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_b5

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_4a

    :cond_b5
    move v7, v0

    .line 418
    :goto_4a
    new-instance v0, La/nmj;

    invoke-direct {v0, v7}, La/nmj;-><init>(I)V

    return-object v0

    .line 419
    :cond_b6
    sget-object v0, La/hrj;->C1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b7

    invoke-static {v1}, La/prj;->h(Landroid/net/Uri;)La/omj;

    move-result-object v0

    return-object v0

    .line 420
    :cond_b7
    sget-object v0, La/hrj;->G1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b8

    invoke-static {v1}, La/prj;->p(Landroid/net/Uri;)La/voj;

    move-result-object v0

    return-object v0

    .line 421
    :cond_b8
    sget-object v0, La/hrj;->H1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b9

    new-instance v0, La/bpj;

    .line 422
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 423
    :cond_b9
    sget-object v0, La/hrj;->I1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_ba

    new-instance v0, La/zmj;

    .line 424
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 425
    :cond_ba
    sget-object v0, La/hrj;->J1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_bb

    invoke-static {v1}, La/prj;->d(Landroid/net/Uri;)La/ylj;

    move-result-object v0

    return-object v0

    .line 426
    :cond_bb
    sget-object v0, La/hrj;->K1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_bc

    new-instance v0, La/moj;

    .line 427
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 428
    :cond_bc
    sget-object v0, La/hrj;->L1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_bd

    new-instance v0, La/zlj;

    .line 429
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 430
    :cond_bd
    sget-object v0, La/hrj;->S1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_be

    new-instance v0, La/amj;

    invoke-direct {v0}, La/amj;-><init>()V

    return-object v0

    .line 431
    :cond_be
    sget-object v0, La/hrj;->M1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_bf

    invoke-static {v1}, La/prj;->b(Landroid/net/Uri;)La/tlj;

    move-result-object v0

    return-object v0

    .line 432
    :cond_bf
    sget-object v0, La/hrj;->O1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c0

    move/from16 v0, p3

    invoke-static {v0, v1}, La/prj;->o(ZLandroid/net/Uri;)La/upj;

    move-result-object v0

    return-object v0

    .line 433
    :cond_c0
    sget-object v0, La/hrj;->N1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c1

    invoke-virtual/range {p0 .. p1}, La/prj;->c(Landroid/net/Uri;)La/vlj;

    move-result-object v0

    return-object v0

    .line 434
    :cond_c1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v4, "AGGREGATOR_TV_BET_JACKPOT"

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c2

    .line 435
    invoke-static {v1}, La/prj;->q(Landroid/net/Uri;)La/hpj;

    move-result-object v0

    return-object v0

    .line 436
    :cond_c2
    const-string v4, "BET_WITHOUT_RISK"

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c3

    invoke-static {v1}, La/prj;->y(Landroid/net/Uri;)La/xlj;

    move-result-object v0

    return-object v0

    .line 437
    :cond_c3
    const-string v4, "NEWS_MAIN"

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c4

    invoke-virtual/range {p0 .. p1}, La/prj;->l(Landroid/net/Uri;)La/mnj;

    move-result-object v0

    return-object v0

    .line 438
    :cond_c4
    const-string v4, "NEWS_PAGER"

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c5

    invoke-virtual/range {p0 .. p1}, La/prj;->m(Landroid/net/Uri;)La/nnj;

    move-result-object v0

    return-object v0

    .line 439
    :cond_c5
    const-string v4, "ONE_X_GAMES_BONUSES"

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c6

    new-instance v0, La/onj;

    invoke-direct {v0}, La/onj;-><init>()V

    return-object v0

    .line 440
    :cond_c6
    const-string v4, "ONE_X_GAMES_JACKPOT"

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c7

    new-instance v0, La/rnj;

    invoke-direct {v0}, La/rnj;-><init>()V

    return-object v0

    .line 441
    :cond_c7
    const-string v4, "ONE_X_GAMES_GAME"

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c8

    invoke-virtual/range {p0 .. p1}, La/prj;->n(Landroid/net/Uri;)La/qnj;

    move-result-object v0

    return-object v0

    .line 442
    :cond_c8
    sget-object v0, La/hrj;->w1:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c9

    invoke-virtual/range {p0 .. p1}, La/prj;->j(Landroid/net/Uri;)La/upj;

    move-result-object v0

    return-object v0

    .line 443
    :cond_c9
    sget-object v0, La/hrj;->k2:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_ca

    new-instance v0, La/lpj;

    invoke-direct {v0}, La/lpj;-><init>()V

    return-object v0

    .line 444
    :cond_ca
    sget-object v0, La/hrj;->l2:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_cb

    new-instance v0, La/kpj;

    .line 445
    invoke-static {v2, v1, v12}, La/prj;->C(La/prj;Landroid/net/Uri;Ljava/lang/String;)J

    move-result-wide v1

    .line 446
    invoke-direct {v0, v1, v2}, La/kpj;-><init>(J)V

    return-object v0

    .line 447
    :cond_cb
    sget-object v0, La/hrj;->m2:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_cc

    new-instance v0, La/ipj;

    .line 448
    invoke-static {v2, v1, v12}, La/prj;->C(La/prj;Landroid/net/Uri;Ljava/lang/String;)J

    move-result-wide v1

    .line 449
    invoke-direct {v0, v1, v2}, La/ipj;-><init>(J)V

    return-object v0

    .line 450
    :cond_cc
    sget-object v0, La/hrj;->n2:La/hrj;

    invoke-virtual {v0}, La/hrj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_ce

    new-instance v0, La/jpj;

    .line 451
    invoke-static {v2, v1, v12}, La/prj;->C(La/prj;Landroid/net/Uri;Ljava/lang/String;)J

    move-result-wide v2

    .line 452
    invoke-static {v1, v6}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_cd

    move-object/from16 v5, v23

    goto :goto_4b

    :cond_cd
    move-object v5, v1

    .line 453
    :goto_4b
    invoke-static {v8, v5}, Lkotlin/text/c;->o(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    .line 454
    invoke-direct {v0, v1, v2, v3}, La/jpj;-><init>(ZJ)V

    return-object v0

    :cond_ce
    :goto_4c
    return-object v22

    .line 455
    :cond_cf
    :goto_4d
    new-instance v0, La/fnj;

    invoke-direct {v0, v3}, La/fnj;-><init>(Ljava/lang/String;)V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5250da34 -> :sswitch_6
        -0x30571c56 -> :sswitch_5
        -0x15d1575f -> :sswitch_4
        0x65fc90f -> :sswitch_3
        0x699c6cf -> :sswitch_2
        0x1bc91f0b -> :sswitch_1
        0x4d47461c -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x32
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x3b5da617 -> :sswitch_d
        -0x3a69315f -> :sswitch_c
        -0x30571c56 -> :sswitch_b
        -0x2faaa884 -> :sswitch_a
        -0x18bde27b -> :sswitch_9
        0x3d1a10d -> :sswitch_8
        0x33ccb940 -> :sswitch_7
    .end sparse-switch
.end method

.method public final E(Ljava/lang/String;Landroid/content/Intent;ZLa/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p4, La/orj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/orj;

    .line 7
    .line 8
    iget v1, v0, La/orj;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/orj;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/orj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/orj;-><init>(La/prj;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/orj;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/orj;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const-string v4, ""

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p2, v0, La/orj;->i:Landroid/content/Intent;

    .line 40
    .line 41
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v5

    .line 51
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    if-eqz p4, :cond_3

    .line 59
    .line 60
    const-string v2, "deeplink"

    .line 61
    .line 62
    invoke-static {p4, v2}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move-object p4, v5

    .line 68
    :goto_1
    if-nez p4, :cond_4

    .line 69
    .line 70
    move-object p4, v4

    .line 71
    :cond_4
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_5

    .line 76
    .line 77
    sget-object p0, La/xmj;->a:La/xmj;

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p1, "://"

    .line 89
    .line 90
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p2, v0, La/orj;->i:Landroid/content/Intent;

    .line 105
    .line 106
    iput v3, v0, La/orj;->l:I

    .line 107
    .line 108
    invoke-virtual {p0, p1, p2, p3, v0}, La/prj;->D(Landroid/net/Uri;Landroid/content/Intent;ZLa/zje;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p4

    .line 112
    if-ne p4, v1, :cond_6

    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_6
    :goto_2
    move-object p0, p4

    .line 116
    check-cast p0, La/upj;

    .line 117
    .line 118
    :goto_3
    new-instance p1, La/dpj;

    .line 119
    .line 120
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    if-eqz p3, :cond_7

    .line 125
    .line 126
    const-string p4, "botId"

    .line 127
    .line 128
    invoke-static {p3, p4}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    goto :goto_4

    .line 133
    :cond_7
    move-object p3, v5

    .line 134
    :goto_4
    if-nez p3, :cond_8

    .line 135
    .line 136
    move-object p3, v4

    .line 137
    :cond_8
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    if-eqz p2, :cond_9

    .line 142
    .line 143
    const-string p4, "tgUserToken"

    .line 144
    .line 145
    invoke-static {p2, p4}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    :cond_9
    if-nez v5, :cond_a

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_a
    move-object v4, v5

    .line 153
    :goto_5
    invoke-direct {p1, p0, p3, v4}, La/dpj;-><init>(La/upj;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-object p1
.end method

.method public final c(Landroid/net/Uri;)La/vlj;
    .locals 1

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, La/prj;->A(La/prj;Landroid/net/Uri;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    new-instance p1, La/vlj;

    .line 8
    .line 9
    invoke-direct {p1, p0}, La/vlj;-><init>(I)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final i(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/lrj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/lrj;

    .line 7
    .line 8
    iget v1, v0, La/lrj;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/lrj;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/lrj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/lrj;-><init>(La/prj;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/lrj;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/lrj;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, La/lrj;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/prj;->c:La/zpu;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, La/zpu;->j(La/zje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    check-cast p1, La/cmg;

    .line 62
    .line 63
    new-instance p0, La/kmj;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-wide v0, p1, La/cmg;->a:J

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    const-wide/16 v0, 0x0

    .line 71
    .line 72
    :goto_2
    sget-object p1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 73
    .line 74
    iget-byte p1, p1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 75
    .line 76
    invoke-direct {p0, p1, v0, v1, v3}, La/kmj;-><init>(IJZ)V

    .line 77
    .line 78
    .line 79
    return-object p0
.end method

.method public final j(Landroid/net/Uri;)La/upj;
    .locals 7

    .line 1
    const-string v0, "subsportid"

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, La/prj;->C(La/prj;Landroid/net/Uri;Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    const-string v0, "team_name"

    .line 8
    .line 9
    invoke-static {p1, v0}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, ""

    .line 16
    .line 17
    :cond_0
    move-object v6, v0

    .line 18
    const-string v0, "feedid"

    .line 19
    .line 20
    invoke-static {p0, p1, v0}, La/prj;->C(La/prj;Landroid/net/Uri;Ljava/lang/String;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    const-wide/16 p0, 0x0

    .line 25
    .line 26
    cmp-long v0, v2, p0

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    cmp-long p0, v4, p0

    .line 31
    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance v1, La/qmj;

    .line 36
    .line 37
    invoke-direct/range {v1 .. v6}, La/qmj;-><init>(JJLjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_2
    :goto_0
    new-instance p0, La/omj;

    .line 42
    .line 43
    invoke-direct {p0, v6, v4, v5}, La/omj;-><init>(Ljava/lang/String;J)V

    .line 44
    .line 45
    .line 46
    return-object p0
.end method

.method public final l(Landroid/net/Uri;)La/mnj;
    .locals 6

    .line 1
    new-instance v0, La/mnj;

    .line 2
    .line 3
    const-string v1, "PARAMETER_KEY_FROM_AGGREGATOR"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p1, v1, v2}, La/prj;->a(Landroid/net/Uri;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    const-string v1, "PARAMETER_KEY_SHOW_NAV_BAR"

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-static {p1, v1, v2}, La/prj;->a(Landroid/net/Uri;Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    const-string v1, "PARAMETER_KEY_POSITION"

    .line 18
    .line 19
    invoke-static {p0, p1, v1}, La/prj;->A(La/prj;Landroid/net/Uri;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const-string v2, "PARAMETER_KEY_BANNER_ID"

    .line 24
    .line 25
    invoke-static {p0, p1, v2}, La/prj;->A(La/prj;Landroid/net/Uri;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const-string v3, "PARAMETER_KEY_BANNER_TYPE"

    .line 30
    .line 31
    invoke-static {p0, p1, v3}, La/prj;->A(La/prj;Landroid/net/Uri;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-direct/range {v0 .. v5}, La/mnj;-><init>(IIIZZ)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public final m(Landroid/net/Uri;)La/nnj;
    .locals 7

    .line 1
    new-instance v0, La/nnj;

    .line 2
    .line 3
    const-string v1, "PARAMETER_KEY_SHOW_NAV_BAR"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-static {p1, v1, v2}, La/prj;->a(Landroid/net/Uri;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string v3, "PARAMETER_KEY_NEED_AUTH"

    .line 11
    .line 12
    invoke-static {p1, v3, v2}, La/prj;->a(Landroid/net/Uri;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const-string v3, "PARAMETER_KEY_BANNER_TRANSLATE_ID"

    .line 17
    .line 18
    invoke-static {p1, v3}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const-string v4, ""

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    move-object v3, v4

    .line 27
    :cond_0
    const-string v5, "PARAMETER_KEY_BANNER_TITLE"

    .line 28
    .line 29
    invoke-static {p1, v5}, La/sj3;->e0(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v4, v5

    .line 37
    :goto_0
    sget-object v5, La/oo5;->b:La/bj5;

    .line 38
    .line 39
    const-string v6, "PARAMETER_KEY_BANNER_ACTION_TYPE"

    .line 40
    .line 41
    invoke-static {p0, p1, v6}, La/prj;->A(La/prj;Landroid/net/Uri;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v6}, La/bj5;->c(Ljava/lang/Integer;)La/oo5;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-nez v5, :cond_2

    .line 57
    .line 58
    sget-object v5, La/oo5;->d:La/oo5;

    .line 59
    .line 60
    :cond_2
    const-string v6, "PARAMETER_KEY_BANNER_PRIZE_FLAG"

    .line 61
    .line 62
    invoke-static {p0, p1, v6}, La/prj;->A(La/prj;Landroid/net/Uri;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-direct/range {v0 .. v6}, La/nnj;-><init>(ZZLjava/lang/String;Ljava/lang/String;La/oo5;I)V

    .line 67
    .line 68
    .line 69
    return-object v0
.end method

.method public final n(Landroid/net/Uri;)La/qnj;
    .locals 2

    .line 1
    const-string v0, "PARAMETER_KEY_GAME_ID"

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, La/prj;->C(La/prj;Landroid/net/Uri;Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    new-instance v0, La/qnj;

    .line 8
    .line 9
    const-string v1, ""

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, v1}, La/qnj;-><init>(JLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final r(Landroid/content/Intent;La/mqj;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "selected_game_id"

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v5

    .line 11
    invoke-static {v0}, La/blx;->a(Landroid/content/Intent;)La/k9h0;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    cmp-long v7, v5, v2

    .line 16
    .line 17
    const-string v8, "selected_sub_game_id"

    .line 18
    .line 19
    const-string v9, "is_live"

    .line 20
    .line 21
    const-string v10, "subSportId"

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    if-eqz v7, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "sportId"

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v12

    .line 35
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v10, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v14

    .line 42
    invoke-virtual {v0, v10}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    move-wide/from16 v16, v12

    .line 46
    .line 47
    invoke-virtual {v0, v9, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v13

    .line 51
    invoke-virtual {v0, v9}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v8, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v9

    .line 58
    invoke-virtual {v0, v8}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v4, La/woj;

    .line 62
    .line 63
    const-wide/16 v0, 0x28

    .line 64
    .line 65
    cmp-long v0, v16, v0

    .line 66
    .line 67
    if-nez v0, :cond_0

    .line 68
    .line 69
    cmp-long v0, v14, v2

    .line 70
    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    move-wide v11, v14

    .line 74
    :goto_0
    move-wide v7, v9

    .line 75
    move-wide/from16 v9, v16

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_0
    move-wide v11, v2

    .line 79
    goto :goto_0

    .line 80
    :goto_1
    invoke-direct/range {v4 .. v13}, La/woj;-><init>(JJJJZ)V

    .line 81
    .line 82
    .line 83
    return-object v4

    .line 84
    :cond_1
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v5

    .line 88
    cmp-long v5, v5, v2

    .line 89
    .line 90
    if-eqz v5, :cond_2

    .line 91
    .line 92
    const-string v4, "SPORT_ID"

    .line 93
    .line 94
    invoke-virtual {v0, v4, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 95
    .line 96
    .line 97
    move-result-wide v17

    .line 98
    invoke-virtual {v0, v4}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 102
    .line 103
    .line 104
    move-result-wide v13

    .line 105
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v8, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 109
    .line 110
    .line 111
    move-result-wide v15

    .line 112
    invoke-virtual {v0, v8}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v10, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 116
    .line 117
    .line 118
    move-result-wide v19

    .line 119
    invoke-virtual {v0, v10}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v9, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 123
    .line 124
    .line 125
    move-result v21

    .line 126
    invoke-virtual {v0, v9}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    new-instance v12, La/bnj;

    .line 130
    .line 131
    invoke-direct/range {v12 .. v21}, La/bnj;-><init>(JJJJZ)V

    .line 132
    .line 133
    .line 134
    return-object v12

    .line 135
    :cond_2
    const-string v1, "mass_mailing_key"

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    if-nez v1, :cond_3

    .line 142
    .line 143
    const-string v1, ""

    .line 144
    .line 145
    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-lez v1, :cond_4

    .line 150
    .line 151
    new-instance v0, La/lnj;

    .line 152
    .line 153
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :cond_4
    const-string v1, "link_start_key"

    .line 158
    .line 159
    invoke-virtual {v0, v1, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_5

    .line 164
    .line 165
    const-string v1, "link_start_url"

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    if-eqz v0, :cond_f

    .line 172
    .line 173
    new-instance v1, La/gnj;

    .line 174
    .line 175
    invoke-direct {v1, v0}, La/gnj;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return-object v1

    .line 179
    :cond_5
    const-string v1, "SHOW_AUTHORIZATION"

    .line 180
    .line 181
    invoke-virtual {v0, v1, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eqz v2, :cond_6

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance v0, La/slj;

    .line 191
    .line 192
    invoke-direct {v0, v11}, La/slj;-><init>(Z)V

    .line 193
    .line 194
    .line 195
    return-object v0

    .line 196
    :cond_6
    const-string v1, "limited_blocked_logon"

    .line 197
    .line 198
    invoke-virtual {v0, v1, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_7

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    new-instance v0, La/slj;

    .line 208
    .line 209
    const/4 v1, 0x1

    .line 210
    invoke-direct {v0, v1}, La/slj;-><init>(Z)V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :cond_7
    const-string v1, "SHOW_SETTINGS"

    .line 215
    .line 216
    invoke-virtual {v0, v1, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-eqz v2, :cond_8

    .line 221
    .line 222
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    new-instance v0, La/toj;

    .line 226
    .line 227
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 228
    .line 229
    .line 230
    return-object v0

    .line 231
    :cond_8
    const-string v1, "SHOW_POPULAR"

    .line 232
    .line 233
    invoke-virtual {v0, v1, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-eqz v2, :cond_9

    .line 238
    .line 239
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    new-instance v0, La/eoj;

    .line 243
    .line 244
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 245
    .line 246
    .line 247
    return-object v0

    .line 248
    :cond_9
    const-string v1, "SHOW_SUPPORT_CHAT"

    .line 249
    .line 250
    invoke-virtual {v0, v1, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eqz v2, :cond_a

    .line 255
    .line 256
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    new-instance v0, La/apj;

    .line 260
    .line 261
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 262
    .line 263
    .line 264
    return-object v0

    .line 265
    :cond_a
    const-string v1, "REQUEST_FAVORITES_WIDGET"

    .line 266
    .line 267
    invoke-virtual {v0, v1, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-eqz v1, :cond_b

    .line 272
    .line 273
    new-instance v0, La/ooj;

    .line 274
    .line 275
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 276
    .line 277
    .line 278
    return-object v0

    .line 279
    :cond_b
    const-string v1, "SHOW_FAVORITES"

    .line 280
    .line 281
    invoke-virtual {v0, v1, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-eqz v1, :cond_c

    .line 286
    .line 287
    new-instance v0, La/anj;

    .line 288
    .line 289
    sget-object v1, La/frj;->c:La/frj;

    .line 290
    .line 291
    invoke-direct {v0, v1}, La/anj;-><init>(La/frj;)V

    .line 292
    .line 293
    .line 294
    return-object v0

    .line 295
    :cond_c
    const-string v1, "OPEN_PAYMENT"

    .line 296
    .line 297
    invoke-virtual {v0, v1, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-eqz v2, :cond_d

    .line 302
    .line 303
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    new-instance v0, La/znj;

    .line 307
    .line 308
    invoke-direct {v0}, La/znj;-><init>()V

    .line 309
    .line 310
    .line 311
    return-object v0

    .line 312
    :cond_d
    if-eqz v4, :cond_f

    .line 313
    .line 314
    const-string v1, "OPEN_SCREEN"

    .line 315
    .line 316
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    move-object/from16 v1, p0

    .line 320
    .line 321
    move-object/from16 v2, p2

    .line 322
    .line 323
    invoke-virtual {v1, v0, v4, v2}, La/prj;->t(Landroid/content/Intent;La/k9h0;La/zje;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    sget-object v1, La/wne;->a:La/wne;

    .line 328
    .line 329
    if-ne v0, v1, :cond_e

    .line 330
    .line 331
    return-object v0

    .line 332
    :cond_e
    check-cast v0, La/upj;

    .line 333
    .line 334
    return-object v0

    .line 335
    :cond_f
    sget-object v0, La/xmj;->a:La/xmj;

    .line 336
    .line 337
    return-object v0
.end method

.method public final s(La/zje;Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/mrj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/mrj;

    .line 7
    .line 8
    iget v1, v0, La/mrj;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/mrj;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/mrj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/mrj;-><init>(La/prj;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/mrj;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/mrj;->m:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p2, v0, La/mrj;->j:Landroid/net/Uri;

    .line 37
    .line 38
    iget-object p3, v0, La/mrj;->i:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v2, p0, La/prj;->d:La/n0o0;

    .line 59
    .line 60
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, La/sff0;

    .line 65
    .line 66
    iget-boolean v2, v2, La/sff0;->f1:Z

    .line 67
    .line 68
    iput-object p3, v0, La/mrj;->i:Ljava/lang/String;

    .line 69
    .line 70
    iput-object p1, v0, La/mrj;->j:Landroid/net/Uri;

    .line 71
    .line 72
    iput v3, v0, La/mrj;->m:I

    .line 73
    .line 74
    invoke-virtual {p0, p1, p2, v2, v0}, La/prj;->D(Landroid/net/Uri;Landroid/content/Intent;ZLa/zje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-ne p2, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    move-object v4, p2

    .line 82
    move-object p2, p1

    .line 83
    move-object p1, v4

    .line 84
    :goto_1
    check-cast p1, La/upj;

    .line 85
    .line 86
    instance-of v0, p1, La/xmj;

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    if-eqz p2, :cond_4

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-lez v0, :cond_4

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    new-array v1, v0, [Ljava/lang/Object;

    .line 104
    .line 105
    iget-object p0, p0, La/prj;->a:La/ctf0;

    .line 106
    .line 107
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 108
    .line 109
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const v1, 0x7f130690

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p2, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-nez p0, :cond_4

    .line 125
    .line 126
    new-instance p0, La/ynj;

    .line 127
    .line 128
    sget-object p1, La/tw70;->a:La/tw70;

    .line 129
    .line 130
    const-string p2, ""

    .line 131
    .line 132
    invoke-direct {p0, p1, p2, p3}, La/ynj;-><init>(La/tw70;Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object p0

    .line 136
    :cond_4
    return-object p1
.end method

.method public final t(Landroid/content/Intent;La/k9h0;La/zje;)Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, La/nrj;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/nrj;

    .line 13
    .line 14
    iget v4, v3, La/nrj;->m:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/nrj;->m:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/nrj;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/nrj;-><init>(La/prj;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/nrj;->k:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/nrj;->m:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    const-string v9, ""

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    if-eqz v5, :cond_3

    .line 44
    .line 45
    if-eq v5, v7, :cond_2

    .line 46
    .line 47
    if-ne v5, v6, :cond_1

    .line 48
    .line 49
    iget-object v1, v3, La/nrj;->j:Landroid/net/Uri;

    .line 50
    .line 51
    iget-object v3, v3, La/nrj;->i:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_2c

    .line 57
    .line 58
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v8

    .line 64
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object v2

    .line 68
    :cond_3
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const-string v2, "IS_PUSH_NOTIFICATION"

    .line 72
    .line 73
    invoke-virtual {v1, v2, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    const-string v12, "tournament"

    .line 82
    .line 83
    const-string v13, "live"

    .line 84
    .line 85
    const-string v14, "game"

    .line 86
    .line 87
    const-string v15, "subcategory"

    .line 88
    .line 89
    const-string v6, "FILTER_IDS"

    .line 90
    .line 91
    const-string v11, "subSportId"

    .line 92
    .line 93
    const-string v7, "SPORT_ID"

    .line 94
    .line 95
    const-string v8, "CYBER_TYPE"

    .line 96
    .line 97
    move-object/from16 v16, v11

    .line 98
    .line 99
    const-string v10, "PARAM_URL"

    .line 100
    .line 101
    const-string v11, "PARAM_TYPE"

    .line 102
    .line 103
    move/from16 v19, v2

    .line 104
    .line 105
    const-string v2, "ACTIVITY_RECREATED"

    .line 106
    .line 107
    move/from16 v20, v5

    .line 108
    .line 109
    const-string v5, "PARAM_ID"

    .line 110
    .line 111
    move-object/from16 v22, v3

    .line 112
    .line 113
    move-object/from16 v21, v4

    .line 114
    .line 115
    const-wide/16 v3, 0x0

    .line 116
    .line 117
    packed-switch v20, :pswitch_data_0

    .line 118
    .line 119
    .line 120
    :pswitch_0
    goto/16 :goto_7

    .line 121
    .line 122
    :pswitch_1
    const-string v0, "SPECIAL_EVENT_TOP_CHAMP_ID"

    .line 123
    .line 124
    const/4 v3, 0x0

    .line 125
    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    new-instance v1, La/voj;

    .line 130
    .line 131
    invoke-direct {v1, v0}, La/voj;-><init>(I)V

    .line 132
    .line 133
    .line 134
    return-object v1

    .line 135
    :pswitch_2
    new-instance v0, La/smj;

    .line 136
    .line 137
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 138
    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_3
    new-instance v0, La/yoj;

    .line 142
    .line 143
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_4
    const/4 v3, 0x0

    .line 148
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_4

    .line 153
    .line 154
    const-wide/high16 v26, -0x8000000000000000L

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_4
    const-wide/high16 v2, -0x8000000000000000L

    .line 158
    .line 159
    invoke-virtual {v1, v5, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 160
    .line 161
    .line 162
    move-result-wide v2

    .line 163
    move-wide/from16 v26, v2

    .line 164
    .line 165
    :goto_1
    if-eqz v0, :cond_6

    .line 166
    .line 167
    sget-object v0, La/iun;->a:La/iun;

    .line 168
    .line 169
    :cond_5
    :goto_2
    move-object/from16 v24, v0

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    invoke-virtual {v1, v6}, Landroid/content/Intent;->getLongArrayExtra(Ljava/lang/String;)[J

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-eqz v0, :cond_7

    .line 177
    .line 178
    invoke-static {v0}, La/tx3;->f0([J)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-nez v0, :cond_5

    .line 183
    .line 184
    :cond_7
    sget-object v0, La/iun;->a:La/iun;

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :goto_3
    if-eqz v19, :cond_8

    .line 188
    .line 189
    sget-object v0, La/q91;->c:La/q91;

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_8
    sget-object v0, La/q91;->b:La/q91;

    .line 193
    .line 194
    :goto_4
    invoke-virtual {v1, v11}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    if-nez v1, :cond_9

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_9
    move-object v9, v1

    .line 202
    :goto_5
    invoke-virtual {v9, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-eqz v1, :cond_a

    .line 207
    .line 208
    new-instance v1, La/fr1;

    .line 209
    .line 210
    new-instance v20, La/fs80;

    .line 211
    .line 212
    const/16 v28, 0x0

    .line 213
    .line 214
    const/16 v29, 0x79

    .line 215
    .line 216
    const/16 v21, 0x0

    .line 217
    .line 218
    const/16 v25, 0x0

    .line 219
    .line 220
    move-wide/from16 v22, v26

    .line 221
    .line 222
    const-wide/16 v26, 0x0

    .line 223
    .line 224
    invoke-direct/range {v20 .. v29}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 225
    .line 226
    .line 227
    move-object/from16 v2, v20

    .line 228
    .line 229
    invoke-direct {v1, v2, v0}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 230
    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_a
    move-wide/from16 v22, v26

    .line 234
    .line 235
    invoke-virtual {v9, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-eqz v1, :cond_b

    .line 240
    .line 241
    new-instance v1, La/fr1;

    .line 242
    .line 243
    new-instance v20, La/fs80;

    .line 244
    .line 245
    const/16 v28, 0x0

    .line 246
    .line 247
    const/16 v29, 0x6f

    .line 248
    .line 249
    const/16 v21, 0x0

    .line 250
    .line 251
    move-wide/from16 v26, v22

    .line 252
    .line 253
    const-wide/16 v22, 0x0

    .line 254
    .line 255
    const/16 v24, 0x0

    .line 256
    .line 257
    const/16 v25, 0x0

    .line 258
    .line 259
    invoke-direct/range {v20 .. v29}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 260
    .line 261
    .line 262
    move-object/from16 v2, v20

    .line 263
    .line 264
    invoke-direct {v1, v2, v0}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 265
    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_b
    new-instance v1, La/fr1;

    .line 269
    .line 270
    const/4 v2, 0x1

    .line 271
    const/4 v3, 0x0

    .line 272
    invoke-direct {v1, v3, v0, v2}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 273
    .line 274
    .line 275
    :goto_6
    new-instance v0, La/tpj;

    .line 276
    .line 277
    invoke-direct {v0, v1}, La/tpj;-><init>(La/lr1;)V

    .line 278
    .line 279
    .line 280
    return-object v0

    .line 281
    :pswitch_5
    new-instance v0, La/tpj;

    .line 282
    .line 283
    new-instance v1, La/hr1;

    .line 284
    .line 285
    const/4 v2, 0x3

    .line 286
    invoke-direct {v1, v3, v4, v2}, La/hr1;-><init>(JI)V

    .line 287
    .line 288
    .line 289
    invoke-direct {v0, v1}, La/tpj;-><init>(La/lr1;)V

    .line 290
    .line 291
    .line 292
    return-object v0

    .line 293
    :pswitch_6
    new-instance v0, La/hnj;

    .line 294
    .line 295
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 296
    .line 297
    .line 298
    return-object v0

    .line 299
    :pswitch_7
    new-instance v0, La/wnj;

    .line 300
    .line 301
    sget-object v1, La/t270;->d:La/t270;

    .line 302
    .line 303
    invoke-direct {v0, v1}, La/wnj;-><init>(La/t270;)V

    .line 304
    .line 305
    .line 306
    return-object v0

    .line 307
    :pswitch_8
    new-instance v0, La/wnj;

    .line 308
    .line 309
    sget-object v1, La/t270;->c:La/t270;

    .line 310
    .line 311
    invoke-direct {v0, v1}, La/wnj;-><init>(La/t270;)V

    .line 312
    .line 313
    .line 314
    return-object v0

    .line 315
    :pswitch_9
    new-instance v0, La/wnj;

    .line 316
    .line 317
    sget-object v1, La/t270;->b:La/t270;

    .line 318
    .line 319
    invoke-direct {v0, v1}, La/wnj;-><init>(La/t270;)V

    .line 320
    .line 321
    .line 322
    return-object v0

    .line 323
    :pswitch_a
    const-wide/16 v6, -0x1

    .line 324
    .line 325
    invoke-virtual {v1, v5, v6, v7}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 326
    .line 327
    .line 328
    move-result-wide v0

    .line 329
    cmp-long v2, v0, v3

    .line 330
    .line 331
    if-gez v2, :cond_c

    .line 332
    .line 333
    :goto_7
    sget-object v0, La/xmj;->a:La/xmj;

    .line 334
    .line 335
    return-object v0

    .line 336
    :cond_c
    new-instance v2, La/qnj;

    .line 337
    .line 338
    invoke-direct {v2, v0, v1, v9}, La/qnj;-><init>(JLjava/lang/String;)V

    .line 339
    .line 340
    .line 341
    return-object v2

    .line 342
    :pswitch_b
    new-instance v0, La/snj;

    .line 343
    .line 344
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 345
    .line 346
    .line 347
    return-object v0

    .line 348
    :pswitch_c
    const-string v0, "team_name"

    .line 349
    .line 350
    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    if-nez v0, :cond_d

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_d
    move-object v9, v0

    .line 358
    :goto_8
    new-instance v0, La/omj;

    .line 359
    .line 360
    invoke-direct {v0, v9, v3, v4}, La/omj;-><init>(Ljava/lang/String;J)V

    .line 361
    .line 362
    .line 363
    return-object v0

    .line 364
    :pswitch_d
    const/4 v0, 0x0

    .line 365
    invoke-virtual {v1, v8, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    invoke-virtual {v1, v13, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    new-instance v1, La/rmj;

    .line 374
    .line 375
    invoke-direct {v1, v0, v2}, La/rmj;-><init>(ZI)V

    .line 376
    .line 377
    .line 378
    return-object v1

    .line 379
    :pswitch_e
    const/4 v0, 0x0

    .line 380
    invoke-virtual {v1, v8, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    const-string v2, "CHAMP_ID"

    .line 385
    .line 386
    invoke-virtual {v1, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 387
    .line 388
    .line 389
    move-result-wide v5

    .line 390
    invoke-virtual {v1, v7, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 391
    .line 392
    .line 393
    move-result-wide v7

    .line 394
    move-object/from16 v2, v16

    .line 395
    .line 396
    invoke-virtual {v1, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 397
    .line 398
    .line 399
    move-result-wide v1

    .line 400
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 401
    .line 402
    iget-byte v3, v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 403
    .line 404
    if-ne v0, v3, :cond_e

    .line 405
    .line 406
    move-wide v7, v1

    .line 407
    :cond_e
    new-instance v3, La/jmj;

    .line 408
    .line 409
    move v4, v0

    .line 410
    invoke-direct/range {v3 .. v8}, La/jmj;-><init>(IJJ)V

    .line 411
    .line 412
    .line 413
    return-object v3

    .line 414
    :pswitch_f
    move-object/from16 v2, v16

    .line 415
    .line 416
    invoke-virtual {v1, v7, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 417
    .line 418
    .line 419
    move-result-wide v5

    .line 420
    invoke-virtual {v1, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 421
    .line 422
    .line 423
    move-result-wide v2

    .line 424
    const/4 v0, 0x0

    .line 425
    invoke-virtual {v1, v8, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 430
    .line 431
    iget-byte v4, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 432
    .line 433
    if-ne v1, v4, :cond_f

    .line 434
    .line 435
    move-wide v5, v2

    .line 436
    :cond_f
    new-instance v2, La/kmj;

    .line 437
    .line 438
    invoke-direct {v2, v1, v5, v6, v0}, La/kmj;-><init>(IJZ)V

    .line 439
    .line 440
    .line 441
    return-object v2

    .line 442
    :pswitch_10
    move-object/from16 v2, v16

    .line 443
    .line 444
    const-string v0, "GAME_ID"

    .line 445
    .line 446
    invoke-virtual {v1, v0, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 447
    .line 448
    .line 449
    move-result-wide v17

    .line 450
    invoke-virtual {v1, v7, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 451
    .line 452
    .line 453
    move-result-wide v19

    .line 454
    invoke-virtual {v1, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 455
    .line 456
    .line 457
    move-result-wide v21

    .line 458
    const-string v0, "GAME_TYPE"

    .line 459
    .line 460
    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-static {v0, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    if-eqz v1, :cond_10

    .line 469
    .line 470
    const/16 v23, 0x1

    .line 471
    .line 472
    goto :goto_9

    .line 473
    :cond_10
    const-string v1, "line"

    .line 474
    .line 475
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    const/16 v23, 0x0

    .line 479
    .line 480
    :goto_9
    new-instance v16, La/mmj;

    .line 481
    .line 482
    invoke-direct/range {v16 .. v23}, La/mmj;-><init>(JJJZ)V

    .line 483
    .line 484
    .line 485
    return-object v16

    .line 486
    :pswitch_11
    new-instance v0, La/qlj;

    .line 487
    .line 488
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 489
    .line 490
    .line 491
    return-object v0

    .line 492
    :pswitch_12
    new-instance v0, La/olj;

    .line 493
    .line 494
    new-instance v1, La/jr1;

    .line 495
    .line 496
    new-instance v2, La/cvc0;

    .line 497
    .line 498
    sget-object v3, La/d7v;->c:La/d7v;

    .line 499
    .line 500
    invoke-direct {v2, v3}, La/cvc0;-><init>(La/d7v;)V

    .line 501
    .line 502
    .line 503
    invoke-direct {v1, v2}, La/jr1;-><init>(La/fvc0;)V

    .line 504
    .line 505
    .line 506
    invoke-direct {v0, v1}, La/olj;-><init>(La/lr1;)V

    .line 507
    .line 508
    .line 509
    return-object v0

    .line 510
    :pswitch_13
    new-instance v0, La/olj;

    .line 511
    .line 512
    new-instance v1, La/jr1;

    .line 513
    .line 514
    new-instance v2, La/cvc0;

    .line 515
    .line 516
    sget-object v3, La/d7v;->d:La/d7v;

    .line 517
    .line 518
    invoke-direct {v2, v3}, La/cvc0;-><init>(La/d7v;)V

    .line 519
    .line 520
    .line 521
    invoke-direct {v1, v2}, La/jr1;-><init>(La/fvc0;)V

    .line 522
    .line 523
    .line 524
    invoke-direct {v0, v1}, La/olj;-><init>(La/lr1;)V

    .line 525
    .line 526
    .line 527
    return-object v0

    .line 528
    :pswitch_14
    new-instance v0, La/olj;

    .line 529
    .line 530
    new-instance v1, La/jr1;

    .line 531
    .line 532
    new-instance v2, La/cvc0;

    .line 533
    .line 534
    sget-object v3, La/d7v;->b:La/d7v;

    .line 535
    .line 536
    invoke-direct {v2, v3}, La/cvc0;-><init>(La/d7v;)V

    .line 537
    .line 538
    .line 539
    invoke-direct {v1, v2}, La/jr1;-><init>(La/fvc0;)V

    .line 540
    .line 541
    .line 542
    invoke-direct {v0, v1}, La/olj;-><init>(La/lr1;)V

    .line 543
    .line 544
    .line 545
    return-object v0

    .line 546
    :pswitch_15
    const/4 v0, 0x0

    .line 547
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    if-eqz v2, :cond_11

    .line 552
    .line 553
    goto :goto_a

    .line 554
    :cond_11
    invoke-virtual {v1, v5, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 555
    .line 556
    .line 557
    move-result-wide v3

    .line 558
    :goto_a
    const-string v2, "needTransfer"

    .line 559
    .line 560
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    new-instance v1, La/plj;

    .line 565
    .line 566
    invoke-direct {v1, v0, v3, v4}, La/plj;-><init>(ZJ)V

    .line 567
    .line 568
    .line 569
    return-object v1

    .line 570
    :pswitch_16
    new-instance v0, La/gpj;

    .line 571
    .line 572
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 573
    .line 574
    .line 575
    return-object v0

    .line 576
    :pswitch_17
    const/4 v0, 0x0

    .line 577
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    if-eqz v0, :cond_12

    .line 582
    .line 583
    goto :goto_b

    .line 584
    :cond_12
    invoke-virtual {v1, v5, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 585
    .line 586
    .line 587
    move-result-wide v3

    .line 588
    :goto_b
    new-instance v0, La/olj;

    .line 589
    .line 590
    new-instance v1, La/jr1;

    .line 591
    .line 592
    new-instance v2, La/dvc0;

    .line 593
    .line 594
    long-to-int v3, v3

    .line 595
    invoke-direct {v2, v3}, La/dvc0;-><init>(I)V

    .line 596
    .line 597
    .line 598
    invoke-direct {v1, v2}, La/jr1;-><init>(La/fvc0;)V

    .line 599
    .line 600
    .line 601
    invoke-direct {v0, v1}, La/olj;-><init>(La/lr1;)V

    .line 602
    .line 603
    .line 604
    return-object v0

    .line 605
    :pswitch_18
    const/4 v0, 0x0

    .line 606
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 607
    .line 608
    .line 609
    move-result v2

    .line 610
    if-eqz v2, :cond_13

    .line 611
    .line 612
    move-wide v5, v3

    .line 613
    goto :goto_c

    .line 614
    :cond_13
    invoke-virtual {v1, v5, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 615
    .line 616
    .line 617
    move-result-wide v5

    .line 618
    :goto_c
    invoke-virtual {v1, v11}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    if-nez v0, :cond_14

    .line 623
    .line 624
    goto :goto_d

    .line 625
    :cond_14
    move-object v9, v0

    .line 626
    :goto_d
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    sparse-switch v0, :sswitch_data_0

    .line 631
    .line 632
    .line 633
    goto/16 :goto_e

    .line 634
    .line 635
    :sswitch_0
    const-string v0, "nativetournament"

    .line 636
    .line 637
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result v0

    .line 641
    if-nez v0, :cond_15

    .line 642
    .line 643
    goto/16 :goto_e

    .line 644
    .line 645
    :cond_15
    new-instance v0, La/jr1;

    .line 646
    .line 647
    new-instance v1, La/evc0;

    .line 648
    .line 649
    const/4 v3, 0x0

    .line 650
    invoke-direct {v1, v3, v5, v6}, La/evc0;-><init>(ZJ)V

    .line 651
    .line 652
    .line 653
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 654
    .line 655
    .line 656
    goto/16 :goto_f

    .line 657
    .line 658
    :sswitch_1
    const-string v0, "bonuses"

    .line 659
    .line 660
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v0

    .line 664
    if-nez v0, :cond_16

    .line 665
    .line 666
    goto/16 :goto_e

    .line 667
    .line 668
    :cond_16
    new-instance v0, La/jr1;

    .line 669
    .line 670
    new-instance v1, La/cvc0;

    .line 671
    .line 672
    sget-object v2, La/d7v;->c:La/d7v;

    .line 673
    .line 674
    invoke-direct {v1, v2}, La/cvc0;-><init>(La/d7v;)V

    .line 675
    .line 676
    .line 677
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 678
    .line 679
    .line 680
    goto/16 :goto_f

    .line 681
    .line 682
    :sswitch_2
    const-string v0, "freespins"

    .line 683
    .line 684
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result v0

    .line 688
    if-nez v0, :cond_17

    .line 689
    .line 690
    goto :goto_e

    .line 691
    :cond_17
    new-instance v0, La/jr1;

    .line 692
    .line 693
    new-instance v1, La/cvc0;

    .line 694
    .line 695
    sget-object v2, La/d7v;->d:La/d7v;

    .line 696
    .line 697
    invoke-direct {v1, v2}, La/cvc0;-><init>(La/d7v;)V

    .line 698
    .line 699
    .line 700
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 701
    .line 702
    .line 703
    goto :goto_f

    .line 704
    :sswitch_3
    const-string v0, "promocode"

    .line 705
    .line 706
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 707
    .line 708
    .line 709
    move-result v0

    .line 710
    if-nez v0, :cond_18

    .line 711
    .line 712
    goto :goto_e

    .line 713
    :cond_18
    new-instance v0, La/jr1;

    .line 714
    .line 715
    new-instance v1, La/dvc0;

    .line 716
    .line 717
    long-to-int v2, v5

    .line 718
    invoke-direct {v1, v2}, La/dvc0;-><init>(I)V

    .line 719
    .line 720
    .line 721
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 722
    .line 723
    .line 724
    goto :goto_f

    .line 725
    :sswitch_4
    const-string v0, "tournaments"

    .line 726
    .line 727
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    if-nez v0, :cond_19

    .line 732
    .line 733
    goto :goto_e

    .line 734
    :cond_19
    new-instance v0, La/jr1;

    .line 735
    .line 736
    new-instance v1, La/evc0;

    .line 737
    .line 738
    const/4 v2, 0x0

    .line 739
    invoke-direct {v1, v2, v3, v4}, La/evc0;-><init>(ZJ)V

    .line 740
    .line 741
    .line 742
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 743
    .line 744
    .line 745
    goto :goto_f

    .line 746
    :sswitch_5
    const-string v0, "prizes"

    .line 747
    .line 748
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 749
    .line 750
    .line 751
    move-result v0

    .line 752
    if-nez v0, :cond_1a

    .line 753
    .line 754
    goto :goto_e

    .line 755
    :cond_1a
    new-instance v0, La/jr1;

    .line 756
    .line 757
    new-instance v1, La/cvc0;

    .line 758
    .line 759
    sget-object v2, La/d7v;->b:La/d7v;

    .line 760
    .line 761
    invoke-direct {v1, v2}, La/cvc0;-><init>(La/d7v;)V

    .line 762
    .line 763
    .line 764
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 765
    .line 766
    .line 767
    goto :goto_f

    .line 768
    :sswitch_6
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    move-result v0

    .line 772
    if-nez v0, :cond_1b

    .line 773
    .line 774
    :goto_e
    new-instance v0, La/jr1;

    .line 775
    .line 776
    invoke-direct {v0}, La/jr1;-><init>()V

    .line 777
    .line 778
    .line 779
    goto :goto_f

    .line 780
    :cond_1b
    new-instance v0, La/jr1;

    .line 781
    .line 782
    new-instance v1, La/evc0;

    .line 783
    .line 784
    const/4 v7, 0x0

    .line 785
    invoke-direct {v1, v7, v5, v6}, La/evc0;-><init>(ZJ)V

    .line 786
    .line 787
    .line 788
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 789
    .line 790
    .line 791
    :goto_f
    new-instance v1, La/olj;

    .line 792
    .line 793
    invoke-direct {v1, v0}, La/olj;-><init>(La/lr1;)V

    .line 794
    .line 795
    .line 796
    return-object v1

    .line 797
    :pswitch_19
    const/4 v7, 0x0

    .line 798
    invoke-virtual {v1, v2, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 799
    .line 800
    .line 801
    move-result v0

    .line 802
    if-eqz v0, :cond_1c

    .line 803
    .line 804
    move-wide v5, v3

    .line 805
    goto :goto_10

    .line 806
    :cond_1c
    invoke-virtual {v1, v5, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 807
    .line 808
    .line 809
    move-result-wide v5

    .line 810
    :goto_10
    const-string v0, "OPEN_NATIVE_TOURNAMENT"

    .line 811
    .line 812
    invoke-virtual {v1, v0, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 813
    .line 814
    .line 815
    move-result v0

    .line 816
    if-eqz v0, :cond_1d

    .line 817
    .line 818
    const-string v0, "casinoNativeTournamentId"

    .line 819
    .line 820
    invoke-virtual {v1, v0, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 821
    .line 822
    .line 823
    move-result-wide v2

    .line 824
    goto :goto_11

    .line 825
    :cond_1d
    const-string v0, "casinoTournamentId"

    .line 826
    .line 827
    invoke-virtual {v1, v0, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 828
    .line 829
    .line 830
    move-result-wide v2

    .line 831
    :goto_11
    invoke-virtual {v1, v11}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    if-nez v0, :cond_1e

    .line 836
    .line 837
    goto :goto_12

    .line 838
    :cond_1e
    move-object v9, v0

    .line 839
    :goto_12
    invoke-virtual {v9, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 840
    .line 841
    .line 842
    move-result v0

    .line 843
    if-eqz v0, :cond_1f

    .line 844
    .line 845
    new-instance v0, La/jr1;

    .line 846
    .line 847
    new-instance v1, La/evc0;

    .line 848
    .line 849
    const/4 v7, 0x0

    .line 850
    invoke-direct {v1, v7, v5, v6}, La/evc0;-><init>(ZJ)V

    .line 851
    .line 852
    .line 853
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 854
    .line 855
    .line 856
    goto :goto_13

    .line 857
    :cond_1f
    const/4 v7, 0x0

    .line 858
    new-instance v0, La/jr1;

    .line 859
    .line 860
    new-instance v1, La/evc0;

    .line 861
    .line 862
    invoke-direct {v1, v7, v2, v3}, La/evc0;-><init>(ZJ)V

    .line 863
    .line 864
    .line 865
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 866
    .line 867
    .line 868
    :goto_13
    new-instance v1, La/olj;

    .line 869
    .line 870
    invoke-direct {v1, v0}, La/olj;-><init>(La/lr1;)V

    .line 871
    .line 872
    .line 873
    return-object v1

    .line 874
    :pswitch_1a
    const/4 v7, 0x0

    .line 875
    invoke-virtual {v1, v2, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 876
    .line 877
    .line 878
    move-result v0

    .line 879
    if-eqz v0, :cond_20

    .line 880
    .line 881
    const-wide/high16 v26, -0x8000000000000000L

    .line 882
    .line 883
    goto :goto_14

    .line 884
    :cond_20
    const-wide/high16 v7, -0x8000000000000000L

    .line 885
    .line 886
    invoke-virtual {v1, v5, v7, v8}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 887
    .line 888
    .line 889
    move-result-wide v7

    .line 890
    move-wide/from16 v26, v7

    .line 891
    .line 892
    :goto_14
    if-eqz v0, :cond_21

    .line 893
    .line 894
    :goto_15
    move-wide/from16 v30, v3

    .line 895
    .line 896
    goto :goto_16

    .line 897
    :cond_21
    const-string v2, "PARTITION_ID"

    .line 898
    .line 899
    invoke-virtual {v1, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 900
    .line 901
    .line 902
    move-result-wide v3

    .line 903
    goto :goto_15

    .line 904
    :goto_16
    if-eqz v0, :cond_23

    .line 905
    .line 906
    sget-object v0, La/iun;->a:La/iun;

    .line 907
    .line 908
    :cond_22
    :goto_17
    move-object/from16 v24, v0

    .line 909
    .line 910
    goto :goto_18

    .line 911
    :cond_23
    invoke-virtual {v1, v6}, Landroid/content/Intent;->getLongArrayExtra(Ljava/lang/String;)[J

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    if-eqz v0, :cond_24

    .line 916
    .line 917
    invoke-static {v0}, La/tx3;->f0([J)Ljava/util/List;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    if-nez v0, :cond_22

    .line 922
    .line 923
    :cond_24
    sget-object v0, La/iun;->a:La/iun;

    .line 924
    .line 925
    goto :goto_17

    .line 926
    :goto_18
    if-eqz v19, :cond_25

    .line 927
    .line 928
    sget-object v0, La/q91;->c:La/q91;

    .line 929
    .line 930
    goto :goto_19

    .line 931
    :cond_25
    sget-object v0, La/q91;->b:La/q91;

    .line 932
    .line 933
    :goto_19
    invoke-virtual {v1, v11}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    if-nez v1, :cond_26

    .line 938
    .line 939
    goto :goto_1a

    .line 940
    :cond_26
    move-object v9, v1

    .line 941
    :goto_1a
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 942
    .line 943
    invoke-virtual {v9, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 951
    .line 952
    .line 953
    move-result v2

    .line 954
    sparse-switch v2, :sswitch_data_1

    .line 955
    .line 956
    .line 957
    goto/16 :goto_1b

    .line 958
    .line 959
    :sswitch_7
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 960
    .line 961
    .line 962
    move-result v1

    .line 963
    if-nez v1, :cond_27

    .line 964
    .line 965
    goto/16 :goto_1b

    .line 966
    .line 967
    :cond_27
    new-instance v1, La/fr1;

    .line 968
    .line 969
    new-instance v20, La/fs80;

    .line 970
    .line 971
    const/16 v28, 0x0

    .line 972
    .line 973
    const/16 v29, 0x79

    .line 974
    .line 975
    const/16 v21, 0x0

    .line 976
    .line 977
    const/16 v25, 0x0

    .line 978
    .line 979
    move-wide/from16 v22, v26

    .line 980
    .line 981
    const-wide/16 v26, 0x0

    .line 982
    .line 983
    invoke-direct/range {v20 .. v29}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 984
    .line 985
    .line 986
    move-object/from16 v2, v20

    .line 987
    .line 988
    invoke-direct {v1, v2, v0}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 989
    .line 990
    .line 991
    goto/16 :goto_1f

    .line 992
    .line 993
    :sswitch_8
    move-wide/from16 v7, v26

    .line 994
    .line 995
    const-string v2, "brand"

    .line 996
    .line 997
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 998
    .line 999
    .line 1000
    move-result v1

    .line 1001
    if-nez v1, :cond_28

    .line 1002
    .line 1003
    goto :goto_1b

    .line 1004
    :cond_28
    move-wide/from16 v22, v7

    .line 1005
    .line 1006
    goto :goto_1c

    .line 1007
    :sswitch_9
    move-wide/from16 v7, v26

    .line 1008
    .line 1009
    const-string v2, "casinobrandid"

    .line 1010
    .line 1011
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1012
    .line 1013
    .line 1014
    move-result v1

    .line 1015
    if-nez v1, :cond_29

    .line 1016
    .line 1017
    goto :goto_1b

    .line 1018
    :cond_29
    new-instance v1, La/er1;

    .line 1019
    .line 1020
    const/4 v2, 0x1

    .line 1021
    invoke-direct {v1, v2, v7, v8}, La/er1;-><init>(ZJ)V

    .line 1022
    .line 1023
    .line 1024
    goto/16 :goto_1f

    .line 1025
    .line 1026
    :sswitch_a
    move-wide/from16 v7, v26

    .line 1027
    .line 1028
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v1

    .line 1032
    if-nez v1, :cond_2a

    .line 1033
    .line 1034
    goto :goto_1b

    .line 1035
    :cond_2a
    new-instance v1, La/fr1;

    .line 1036
    .line 1037
    new-instance v20, La/fs80;

    .line 1038
    .line 1039
    const/16 v28, 0x0

    .line 1040
    .line 1041
    const/16 v29, 0x6f

    .line 1042
    .line 1043
    const/16 v21, 0x0

    .line 1044
    .line 1045
    const-wide/16 v22, 0x0

    .line 1046
    .line 1047
    const/16 v24, 0x0

    .line 1048
    .line 1049
    const/16 v25, 0x0

    .line 1050
    .line 1051
    move-wide/from16 v26, v7

    .line 1052
    .line 1053
    invoke-direct/range {v20 .. v29}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 1054
    .line 1055
    .line 1056
    move-object/from16 v2, v20

    .line 1057
    .line 1058
    invoke-direct {v1, v2, v0}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 1059
    .line 1060
    .line 1061
    goto :goto_1f

    .line 1062
    :sswitch_b
    move-wide/from16 v22, v26

    .line 1063
    .line 1064
    const-string v2, "provider"

    .line 1065
    .line 1066
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1067
    .line 1068
    .line 1069
    move-result v1

    .line 1070
    if-nez v1, :cond_2b

    .line 1071
    .line 1072
    :goto_1b
    new-instance v1, La/fr1;

    .line 1073
    .line 1074
    const/4 v2, 0x1

    .line 1075
    const/4 v3, 0x0

    .line 1076
    invoke-direct {v1, v3, v0, v2}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 1077
    .line 1078
    .line 1079
    goto :goto_1f

    .line 1080
    :cond_2b
    :goto_1c
    new-instance v1, La/fr1;

    .line 1081
    .line 1082
    sget-object v2, La/nw80;->b:La/nw80;

    .line 1083
    .line 1084
    invoke-virtual {v2}, La/nw80;->getId()J

    .line 1085
    .line 1086
    .line 1087
    move-result-wide v2

    .line 1088
    cmp-long v2, v30, v2

    .line 1089
    .line 1090
    if-eqz v2, :cond_2d

    .line 1091
    .line 1092
    sget-object v2, La/nw80;->a:La/nw80;

    .line 1093
    .line 1094
    invoke-virtual {v2}, La/nw80;->getId()J

    .line 1095
    .line 1096
    .line 1097
    move-result-wide v2

    .line 1098
    cmp-long v2, v30, v2

    .line 1099
    .line 1100
    if-nez v2, :cond_2c

    .line 1101
    .line 1102
    goto :goto_1d

    .line 1103
    :cond_2c
    new-instance v3, La/fs80;

    .line 1104
    .line 1105
    const/4 v11, 0x0

    .line 1106
    const/16 v12, 0x7f

    .line 1107
    .line 1108
    const/4 v4, 0x0

    .line 1109
    const-wide/16 v5, 0x0

    .line 1110
    .line 1111
    const/4 v7, 0x0

    .line 1112
    const/4 v8, 0x0

    .line 1113
    const-wide/16 v9, 0x0

    .line 1114
    .line 1115
    invoke-direct/range {v3 .. v12}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 1116
    .line 1117
    .line 1118
    goto :goto_1e

    .line 1119
    :cond_2d
    :goto_1d
    new-instance v28, La/fs80;

    .line 1120
    .line 1121
    sget-object v32, La/iun;->a:La/iun;

    .line 1122
    .line 1123
    invoke-static/range {v22 .. v23}, La/cs0;->u(J)Ljava/util/List;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v33

    .line 1127
    const/16 v36, 0x0

    .line 1128
    .line 1129
    const/16 v37, 0x71

    .line 1130
    .line 1131
    const/16 v29, 0x0

    .line 1132
    .line 1133
    const-wide/16 v34, 0x0

    .line 1134
    .line 1135
    invoke-direct/range {v28 .. v37}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 1136
    .line 1137
    .line 1138
    move-object/from16 v3, v28

    .line 1139
    .line 1140
    :goto_1e
    invoke-direct {v1, v3, v0}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 1141
    .line 1142
    .line 1143
    :goto_1f
    new-instance v0, La/olj;

    .line 1144
    .line 1145
    invoke-direct {v0, v1}, La/olj;-><init>(La/lr1;)V

    .line 1146
    .line 1147
    .line 1148
    return-object v0

    .line 1149
    :pswitch_1b
    invoke-virtual {v1, v11}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v0

    .line 1153
    if-nez v0, :cond_2e

    .line 1154
    .line 1155
    goto :goto_20

    .line 1156
    :cond_2e
    move-object v9, v0

    .line 1157
    :goto_20
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1158
    .line 1159
    invoke-virtual {v9, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1164
    .line 1165
    .line 1166
    const-string v1, "vipcashback"

    .line 1167
    .line 1168
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1169
    .line 1170
    .line 1171
    move-result v0

    .line 1172
    if-eqz v0, :cond_2f

    .line 1173
    .line 1174
    new-instance v0, La/hr1;

    .line 1175
    .line 1176
    const-wide/16 v1, -0xa

    .line 1177
    .line 1178
    const/4 v3, 0x2

    .line 1179
    invoke-direct {v0, v1, v2, v3}, La/hr1;-><init>(JI)V

    .line 1180
    .line 1181
    .line 1182
    goto :goto_21

    .line 1183
    :cond_2f
    new-instance v0, La/hr1;

    .line 1184
    .line 1185
    const/4 v2, 0x3

    .line 1186
    invoke-direct {v0, v3, v4, v2}, La/hr1;-><init>(JI)V

    .line 1187
    .line 1188
    .line 1189
    :goto_21
    new-instance v1, La/olj;

    .line 1190
    .line 1191
    invoke-direct {v1, v0}, La/olj;-><init>(La/lr1;)V

    .line 1192
    .line 1193
    .line 1194
    return-object v1

    .line 1195
    :pswitch_1c
    new-instance v0, La/poj;

    .line 1196
    .line 1197
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1198
    .line 1199
    .line 1200
    return-object v0

    .line 1201
    :pswitch_1d
    new-instance v0, La/soj;

    .line 1202
    .line 1203
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1204
    .line 1205
    .line 1206
    return-object v0

    .line 1207
    :pswitch_1e
    const/4 v0, 0x0

    .line 1208
    invoke-virtual {v1, v8, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1209
    .line 1210
    .line 1211
    move-result v2

    .line 1212
    const-string v3, "IS_EWC"

    .line 1213
    .line 1214
    invoke-virtual {v1, v3, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v0

    .line 1218
    new-instance v1, La/imj;

    .line 1219
    .line 1220
    invoke-direct {v1, v2, v0}, La/imj;-><init>(IZ)V

    .line 1221
    .line 1222
    .line 1223
    return-object v1

    .line 1224
    :pswitch_1f
    new-instance v0, La/qoj;

    .line 1225
    .line 1226
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1227
    .line 1228
    .line 1229
    return-object v0

    .line 1230
    :pswitch_20
    new-instance v0, La/cmj;

    .line 1231
    .line 1232
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1233
    .line 1234
    .line 1235
    return-object v0

    .line 1236
    :pswitch_21
    new-instance v0, La/gnj;

    .line 1237
    .line 1238
    invoke-virtual {v1, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v1

    .line 1242
    if-nez v1, :cond_30

    .line 1243
    .line 1244
    goto :goto_22

    .line 1245
    :cond_30
    move-object v9, v1

    .line 1246
    :goto_22
    invoke-direct {v0, v9}, La/gnj;-><init>(Ljava/lang/String;)V

    .line 1247
    .line 1248
    .line 1249
    return-object v0

    .line 1250
    :pswitch_22
    new-instance v0, La/loj;

    .line 1251
    .line 1252
    invoke-virtual {v1, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v1

    .line 1256
    if-nez v1, :cond_31

    .line 1257
    .line 1258
    goto :goto_23

    .line 1259
    :cond_31
    move-object v9, v1

    .line 1260
    :goto_23
    invoke-direct {v0, v9}, La/loj;-><init>(Ljava/lang/String;)V

    .line 1261
    .line 1262
    .line 1263
    return-object v0

    .line 1264
    :pswitch_23
    new-instance v0, La/koj;

    .line 1265
    .line 1266
    invoke-virtual {v1, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v1

    .line 1270
    if-nez v1, :cond_32

    .line 1271
    .line 1272
    goto :goto_24

    .line 1273
    :cond_32
    move-object v9, v1

    .line 1274
    :goto_24
    invoke-direct {v0, v9}, La/koj;-><init>(Ljava/lang/String;)V

    .line 1275
    .line 1276
    .line 1277
    return-object v0

    .line 1278
    :pswitch_24
    invoke-virtual {v1, v5, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1279
    .line 1280
    .line 1281
    move-result-wide v0

    .line 1282
    new-instance v2, La/joj;

    .line 1283
    .line 1284
    sget-object v3, La/aue0;->c:La/aue0;

    .line 1285
    .line 1286
    invoke-direct {v2, v0, v1, v3}, La/joj;-><init>(JLa/aue0;)V

    .line 1287
    .line 1288
    .line 1289
    return-object v2

    .line 1290
    :pswitch_25
    invoke-virtual {v1, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v0

    .line 1294
    if-nez v0, :cond_33

    .line 1295
    .line 1296
    goto :goto_25

    .line 1297
    :cond_33
    move-object v9, v0

    .line 1298
    :goto_25
    new-instance v0, La/hmj;

    .line 1299
    .line 1300
    const/4 v3, 0x0

    .line 1301
    invoke-direct {v0, v9, v3}, La/hmj;-><init>(Ljava/lang/String;Z)V

    .line 1302
    .line 1303
    .line 1304
    return-object v0

    .line 1305
    :pswitch_26
    new-instance v0, La/epj;

    .line 1306
    .line 1307
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1308
    .line 1309
    .line 1310
    return-object v0

    .line 1311
    :pswitch_27
    invoke-virtual {v1, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    if-nez v0, :cond_34

    .line 1316
    .line 1317
    goto :goto_26

    .line 1318
    :cond_34
    move-object v9, v0

    .line 1319
    :goto_26
    new-instance v0, La/aoj;

    .line 1320
    .line 1321
    invoke-direct {v0, v9}, La/aoj;-><init>(Ljava/lang/String;)V

    .line 1322
    .line 1323
    .line 1324
    return-object v0

    .line 1325
    :pswitch_28
    new-instance v0, La/goj;

    .line 1326
    .line 1327
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1328
    .line 1329
    .line 1330
    return-object v0

    .line 1331
    :pswitch_29
    new-instance v0, La/znj;

    .line 1332
    .line 1333
    invoke-direct {v0}, La/znj;-><init>()V

    .line 1334
    .line 1335
    .line 1336
    return-object v0

    .line 1337
    :pswitch_2a
    invoke-virtual {v1, v5, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1338
    .line 1339
    .line 1340
    move-result-wide v2

    .line 1341
    const-string v0, "PARAM_SCREEN_TYPE"

    .line 1342
    .line 1343
    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v0

    .line 1347
    if-nez v0, :cond_35

    .line 1348
    .line 1349
    goto :goto_27

    .line 1350
    :cond_35
    move-object v9, v0

    .line 1351
    :goto_27
    invoke-virtual {v1, v11}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v0

    .line 1355
    instance-of v1, v0, La/d270;

    .line 1356
    .line 1357
    if-eqz v1, :cond_36

    .line 1358
    .line 1359
    move-object v8, v0

    .line 1360
    check-cast v8, La/d270;

    .line 1361
    .line 1362
    goto :goto_28

    .line 1363
    :cond_36
    const/4 v8, 0x0

    .line 1364
    :goto_28
    if-nez v8, :cond_37

    .line 1365
    .line 1366
    sget-object v8, La/d270;->j:La/d270;

    .line 1367
    .line 1368
    :cond_37
    new-instance v0, La/tnj;

    .line 1369
    .line 1370
    invoke-direct {v0, v2, v3, v8, v9}, La/tnj;-><init>(JLa/d270;Ljava/lang/String;)V

    .line 1371
    .line 1372
    .line 1373
    return-object v0

    .line 1374
    :pswitch_2b
    invoke-virtual {v1, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v0

    .line 1378
    if-nez v0, :cond_38

    .line 1379
    .line 1380
    goto :goto_29

    .line 1381
    :cond_38
    move-object v9, v0

    .line 1382
    :goto_29
    invoke-virtual {v1, v11}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v0

    .line 1386
    instance-of v1, v0, La/r080;

    .line 1387
    .line 1388
    if-eqz v1, :cond_39

    .line 1389
    .line 1390
    move-object v8, v0

    .line 1391
    check-cast v8, La/r080;

    .line 1392
    .line 1393
    goto :goto_2a

    .line 1394
    :cond_39
    const/4 v8, 0x0

    .line 1395
    :goto_2a
    if-nez v8, :cond_3a

    .line 1396
    .line 1397
    sget-object v8, La/r080;->a:La/r080;

    .line 1398
    .line 1399
    :cond_3a
    new-instance v0, La/rlj;

    .line 1400
    .line 1401
    invoke-direct {v0, v9, v8}, La/rlj;-><init>(Ljava/lang/String;La/r080;)V

    .line 1402
    .line 1403
    .line 1404
    return-object v0

    .line 1405
    :pswitch_2c
    new-instance v0, La/foj;

    .line 1406
    .line 1407
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1408
    .line 1409
    .line 1410
    return-object v0

    .line 1411
    :pswitch_2d
    invoke-virtual {v1, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v2

    .line 1415
    if-nez v2, :cond_3b

    .line 1416
    .line 1417
    const-string v2, "PARAM_DEEPLINK"

    .line 1418
    .line 1419
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v2

    .line 1423
    if-nez v2, :cond_3b

    .line 1424
    .line 1425
    move-object v3, v9

    .line 1426
    goto :goto_2b

    .line 1427
    :cond_3b
    move-object v3, v2

    .line 1428
    :goto_2b
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v2

    .line 1432
    iget-object v4, v0, La/prj;->d:La/n0o0;

    .line 1433
    .line 1434
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v4

    .line 1438
    check-cast v4, La/sff0;

    .line 1439
    .line 1440
    iget-boolean v4, v4, La/sff0;->f1:Z

    .line 1441
    .line 1442
    move-object/from16 v5, v22

    .line 1443
    .line 1444
    iput-object v3, v5, La/nrj;->i:Ljava/lang/String;

    .line 1445
    .line 1446
    iput-object v2, v5, La/nrj;->j:Landroid/net/Uri;

    .line 1447
    .line 1448
    const/4 v6, 0x2

    .line 1449
    iput v6, v5, La/nrj;->m:I

    .line 1450
    .line 1451
    invoke-virtual {v0, v2, v1, v4, v5}, La/prj;->D(Landroid/net/Uri;Landroid/content/Intent;ZLa/zje;)Ljava/lang/Object;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v1

    .line 1455
    move-object/from16 v4, v21

    .line 1456
    .line 1457
    if-ne v1, v4, :cond_3c

    .line 1458
    .line 1459
    goto :goto_2e

    .line 1460
    :cond_3c
    move-object/from16 v38, v2

    .line 1461
    .line 1462
    move-object v2, v1

    .line 1463
    move-object/from16 v1, v38

    .line 1464
    .line 1465
    :goto_2c
    check-cast v2, La/upj;

    .line 1466
    .line 1467
    instance-of v4, v2, La/xmj;

    .line 1468
    .line 1469
    if-eqz v4, :cond_3d

    .line 1470
    .line 1471
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v1

    .line 1475
    if-eqz v1, :cond_3d

    .line 1476
    .line 1477
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1478
    .line 1479
    .line 1480
    move-result v4

    .line 1481
    if-lez v4, :cond_3d

    .line 1482
    .line 1483
    const/4 v7, 0x0

    .line 1484
    new-array v4, v7, [Ljava/lang/Object;

    .line 1485
    .line 1486
    iget-object v0, v0, La/prj;->a:La/ctf0;

    .line 1487
    .line 1488
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1489
    .line 1490
    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v4

    .line 1494
    const v5, 0x7f130690

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual {v0, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v0

    .line 1501
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1502
    .line 1503
    .line 1504
    move-result v0

    .line 1505
    if-nez v0, :cond_3d

    .line 1506
    .line 1507
    new-instance v0, La/ynj;

    .line 1508
    .line 1509
    sget-object v1, La/tw70;->a:La/tw70;

    .line 1510
    .line 1511
    invoke-direct {v0, v1, v9, v3}, La/ynj;-><init>(La/tw70;Ljava/lang/String;Ljava/lang/String;)V

    .line 1512
    .line 1513
    .line 1514
    return-object v0

    .line 1515
    :cond_3d
    return-object v2

    .line 1516
    :pswitch_2e
    move-object/from16 v4, v21

    .line 1517
    .line 1518
    move-object/from16 v5, v22

    .line 1519
    .line 1520
    const/4 v3, 0x0

    .line 1521
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1522
    .line 1523
    .line 1524
    move-result v3

    .line 1525
    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 1526
    .line 1527
    .line 1528
    if-eqz v3, :cond_3e

    .line 1529
    .line 1530
    goto :goto_2d

    .line 1531
    :cond_3e
    invoke-virtual {v1, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v2

    .line 1535
    if-nez v2, :cond_3f

    .line 1536
    .line 1537
    goto :goto_2d

    .line 1538
    :cond_3f
    move-object v9, v2

    .line 1539
    :goto_2d
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1540
    .line 1541
    .line 1542
    move-result v2

    .line 1543
    if-nez v2, :cond_40

    .line 1544
    .line 1545
    new-instance v0, La/mpj;

    .line 1546
    .line 1547
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1548
    .line 1549
    .line 1550
    return-object v0

    .line 1551
    :cond_40
    const/4 v3, 0x0

    .line 1552
    iput-object v3, v5, La/nrj;->i:Ljava/lang/String;

    .line 1553
    .line 1554
    const/4 v6, 0x1

    .line 1555
    iput v6, v5, La/nrj;->m:I

    .line 1556
    .line 1557
    invoke-virtual {v0, v5, v1, v9}, La/prj;->s(La/zje;Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Object;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v0

    .line 1561
    if-ne v0, v4, :cond_41

    .line 1562
    .line 1563
    :goto_2e
    return-object v4

    .line 1564
    :cond_41
    return-object v0

    .line 1565
    :pswitch_2f
    const/4 v6, 0x1

    .line 1566
    new-instance v0, La/ymj;

    .line 1567
    .line 1568
    invoke-direct {v0, v6}, La/ymj;-><init>(Z)V

    .line 1569
    .line 1570
    .line 1571
    return-object v0

    .line 1572
    :pswitch_30
    const/4 v0, 0x0

    .line 1573
    invoke-virtual {v1, v5, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1574
    .line 1575
    .line 1576
    move-result v0

    .line 1577
    new-instance v1, La/hoj;

    .line 1578
    .line 1579
    invoke-direct {v1, v0}, La/hoj;-><init>(I)V

    .line 1580
    .line 1581
    .line 1582
    return-object v1

    .line 1583
    :pswitch_31
    const/4 v0, 0x0

    .line 1584
    new-instance v1, La/hoj;

    .line 1585
    .line 1586
    invoke-direct {v1, v0}, La/hoj;-><init>(I)V

    .line 1587
    .line 1588
    .line 1589
    return-object v1

    .line 1590
    :pswitch_32
    new-instance v0, La/zmj;

    .line 1591
    .line 1592
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1593
    .line 1594
    .line 1595
    return-object v0

    .line 1596
    :pswitch_33
    new-instance v0, La/xoj;

    .line 1597
    .line 1598
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1599
    .line 1600
    .line 1601
    return-object v0

    .line 1602
    :pswitch_34
    sget-object v0, La/j700;->b:La/j700;

    .line 1603
    .line 1604
    invoke-static {v1, v0}, La/prj;->w(Landroid/content/Intent;La/j700;)La/inj;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v0

    .line 1608
    return-object v0

    .line 1609
    :pswitch_35
    new-instance v0, La/cnj;

    .line 1610
    .line 1611
    sget-object v1, La/j700;->b:La/j700;

    .line 1612
    .line 1613
    invoke-direct {v0, v1}, La/cnj;-><init>(La/j700;)V

    .line 1614
    .line 1615
    .line 1616
    return-object v0

    .line 1617
    :pswitch_36
    move-object/from16 v2, v16

    .line 1618
    .line 1619
    const/4 v6, 0x1

    .line 1620
    invoke-virtual {v1, v5, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1621
    .line 1622
    .line 1623
    move-result-wide v8

    .line 1624
    invoke-virtual {v1, v7, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1625
    .line 1626
    .line 1627
    move-result-wide v10

    .line 1628
    invoke-virtual {v1, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1629
    .line 1630
    .line 1631
    move-result-wide v0

    .line 1632
    new-instance v2, La/bnj;

    .line 1633
    .line 1634
    sget-object v3, La/k9h0;->t:La/k9h0;

    .line 1635
    .line 1636
    move-object/from16 v4, p2

    .line 1637
    .line 1638
    if-ne v4, v3, :cond_42

    .line 1639
    .line 1640
    move v7, v6

    .line 1641
    goto :goto_2f

    .line 1642
    :cond_42
    const/4 v7, 0x0

    .line 1643
    :goto_2f
    const-wide/16 v5, 0x0

    .line 1644
    .line 1645
    move-wide v3, v8

    .line 1646
    move-wide/from16 v38, v10

    .line 1647
    .line 1648
    move v11, v7

    .line 1649
    move-wide v9, v0

    .line 1650
    move-wide/from16 v7, v38

    .line 1651
    .line 1652
    invoke-direct/range {v2 .. v11}, La/bnj;-><init>(JJJJZ)V

    .line 1653
    .line 1654
    .line 1655
    return-object v2

    .line 1656
    :pswitch_37
    sget-object v0, La/j700;->a:La/j700;

    .line 1657
    .line 1658
    invoke-static {v1, v0}, La/prj;->w(Landroid/content/Intent;La/j700;)La/inj;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v0

    .line 1662
    return-object v0

    .line 1663
    :pswitch_38
    new-instance v0, La/cnj;

    .line 1664
    .line 1665
    sget-object v1, La/j700;->a:La/j700;

    .line 1666
    .line 1667
    invoke-direct {v0, v1}, La/cnj;-><init>(La/j700;)V

    .line 1668
    .line 1669
    .line 1670
    return-object v0

    .line 1671
    :pswitch_39
    invoke-virtual {v1, v11, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1672
    .line 1673
    .line 1674
    move-result-wide v6

    .line 1675
    invoke-virtual {v1, v5, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1676
    .line 1677
    .line 1678
    move-result-wide v0

    .line 1679
    new-instance v2, La/wlj;

    .line 1680
    .line 1681
    invoke-direct {v2, v6, v7, v0, v1}, La/wlj;-><init>(JJ)V

    .line 1682
    .line 1683
    .line 1684
    return-object v2

    .line 1685
    :pswitch_3a
    new-instance v0, La/doj;

    .line 1686
    .line 1687
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1688
    .line 1689
    .line 1690
    return-object v0

    .line 1691
    :pswitch_3b
    new-instance v0, La/eoj;

    .line 1692
    .line 1693
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1694
    .line 1695
    .line 1696
    return-object v0

    .line 1697
    :pswitch_3c
    new-instance v0, La/noj;

    .line 1698
    .line 1699
    invoke-static {v1}, La/prj;->z(Landroid/content/Intent;)La/aue0;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v1

    .line 1703
    invoke-direct {v0, v1}, La/noj;-><init>(La/aue0;)V

    .line 1704
    .line 1705
    .line 1706
    return-object v0

    .line 1707
    :pswitch_3d
    new-instance v0, La/jnj;

    .line 1708
    .line 1709
    invoke-static {v1}, La/prj;->z(Landroid/content/Intent;)La/aue0;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v2

    .line 1713
    const-string v3, "AUTH_NOTIFICATION_TYPE"

    .line 1714
    .line 1715
    const/4 v7, 0x0

    .line 1716
    invoke-virtual {v1, v3, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1717
    .line 1718
    .line 1719
    move-result v1

    .line 1720
    invoke-direct {v0, v1, v2}, La/jnj;-><init>(ILa/aue0;)V

    .line 1721
    .line 1722
    .line 1723
    return-object v0

    .line 1724
    nop

    .line 1725
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3a
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_39
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_38
        :pswitch_37
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_34
        :pswitch_36
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_0
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_0
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_18
        :pswitch_0
        :pswitch_17
        :pswitch_16
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_15
        :pswitch_1b
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    :sswitch_data_0
    .sparse-switch
        -0x3b5da617 -> :sswitch_6
        -0x3a69315f -> :sswitch_5
        -0x30571c56 -> :sswitch_4
        -0x2faaa884 -> :sswitch_3
        -0x18bde27b -> :sswitch_2
        0x3d1a10d -> :sswitch_1
        0x33ccb940 -> :sswitch_0
    .end sparse-switch

    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    :sswitch_data_1
    .sparse-switch
        -0x3adbfa0f -> :sswitch_b
        0x304bf2 -> :sswitch_a
        0x416994d -> :sswitch_9
        0x59a4b87 -> :sswitch_8
        0x4d823b3e -> :sswitch_7
    .end sparse-switch
.end method

.method public final u(Landroid/content/Intent;)La/upj;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "null"

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v1, La/csj0;->c:La/csj0;

    .line 17
    .line 18
    invoke-virtual {v1}, La/csj0;->a()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    sget-object v2, La/xmj;->a:La/xmj;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    new-instance p1, La/uoj;

    .line 31
    .line 32
    sget-object v1, La/j700;->a:La/j700;

    .line 33
    .line 34
    invoke-direct {p1, v1}, La/uoj;-><init>(La/j700;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    sget-object v1, La/csj0;->d:La/csj0;

    .line 39
    .line 40
    invoke-virtual {v1}, La/csj0;->a()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    new-instance p1, La/uoj;

    .line 51
    .line 52
    sget-object v1, La/j700;->b:La/j700;

    .line 53
    .line 54
    invoke-direct {p1, v1}, La/uoj;-><init>(La/j700;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    sget-object v1, La/csj0;->e:La/csj0;

    .line 59
    .line 60
    invoke-virtual {v1}, La/csj0;->a()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    new-instance p1, La/vnj;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    sget-object v1, La/csj0;->b:La/csj0;

    .line 77
    .line 78
    invoke-virtual {v1}, La/csj0;->a()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    new-instance p1, La/enj;

    .line 89
    .line 90
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    sget-object v1, La/csj0;->f:La/csj0;

    .line 95
    .line 96
    invoke-virtual {v1}, La/csj0;->a()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_5

    .line 105
    .line 106
    sget-object p1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 107
    .line 108
    iget-byte p1, p1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 109
    .line 110
    new-instance v1, La/imj;

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    invoke-direct {v1, p1, v3}, La/imj;-><init>(IZ)V

    .line 114
    .line 115
    .line 116
    move-object p1, v1

    .line 117
    goto :goto_0

    .line 118
    :cond_5
    move-object p1, v2

    .line 119
    :goto_0
    iget-object p0, p0, La/prj;->d:La/n0o0;

    .line 120
    .line 121
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, La/sff0;

    .line 126
    .line 127
    iget-object p0, p0, La/sff0;->R:Ljava/util/List;

    .line 128
    .line 129
    if-eqz p0, :cond_6

    .line 130
    .line 131
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_6

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_8

    .line 147
    .line 148
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v1, La/csj0;

    .line 153
    .line 154
    invoke-virtual {v1}, La/csj0;->a()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_7

    .line 163
    .line 164
    return-object p1

    .line 165
    :cond_8
    :goto_1
    return-object v2
.end method
