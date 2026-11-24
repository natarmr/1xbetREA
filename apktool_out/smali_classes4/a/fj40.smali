.class public abstract La/fj40;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v0, v0, [La/an90;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    sget-object v2, La/ym90;->a:La/ym90;

    .line 7
    .line 8
    aput-object v2, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aput-object v2, v0, v1

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    aput-object v2, v0, v1

    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    sget-object v3, La/zm90;->a:La/zm90;

    .line 18
    .line 19
    aput-object v3, v0, v1

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    aput-object v3, v0, v1

    .line 23
    .line 24
    const/4 v1, 0x5

    .line 25
    aput-object v3, v0, v1

    .line 26
    .line 27
    const/4 v1, 0x6

    .line 28
    aput-object v2, v0, v1

    .line 29
    .line 30
    const/4 v1, 0x7

    .line 31
    aput-object v2, v0, v1

    .line 32
    .line 33
    const/16 v1, 0x8

    .line 34
    .line 35
    aput-object v3, v0, v1

    .line 36
    .line 37
    const/16 v1, 0x9

    .line 38
    .line 39
    aput-object v3, v0, v1

    .line 40
    .line 41
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, La/fj40;->a:Ljava/util/List;

    .line 46
    .line 47
    return-void
.end method

.method public static final a(Ljava/lang/String;)La/c280;
    .locals 4

    .line 1
    new-instance v0, La/c280;

    .line 2
    .line 3
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v1, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 21
    .line 22
    invoke-static {p0}, La/u0d;->c(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    :goto_0
    const-string p0, ""

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    const-string v1, "playerlogo/"

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    const-string v1, "%s/%s"

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    const-string v1, "%s/playerlogo/%s"

    .line 44
    .line 45
    :goto_1
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 46
    .line 47
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 48
    .line 49
    filled-new-array {v3, p0}, [Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const/4 v3, 0x2

    .line 54
    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {v2, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :goto_2
    const v1, 0x7f08082c

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, p0, v1}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    return-object v0
.end method

.method public static final b(La/b960;ILa/b960;)La/b7m;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    iget-object v1, p0, La/b960;->a:La/xh40;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object v1, v0

    .line 8
    :goto_0
    if-nez v1, :cond_6

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-object p0, p2, La/b960;->a:La/xh40;

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move-object p0, v0

    .line 16
    :goto_1
    new-instance p2, La/a7m;

    .line 17
    .line 18
    sget-object v1, La/fj40;->a:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/an90;

    .line 25
    .line 26
    if-nez p1, :cond_5

    .line 27
    .line 28
    if-nez p0, :cond_2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    instance-of p1, p0, La/vh40;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    sget-object p1, La/ym90;->a:La/ym90;

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    instance-of p0, p0, La/wh40;

    .line 39
    .line 40
    if-eqz p0, :cond_4

    .line 41
    .line 42
    :goto_2
    sget-object p1, La/zm90;->a:La/zm90;

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_5
    :goto_3
    invoke-direct {p2, p1}, La/a7m;-><init>(La/an90;)V

    .line 50
    .line 51
    .line 52
    return-object p2

    .line 53
    :cond_6
    instance-of p1, v1, La/vh40;

    .line 54
    .line 55
    if-eqz p1, :cond_7

    .line 56
    .line 57
    new-instance p1, La/y6m;

    .line 58
    .line 59
    check-cast v1, La/vh40;

    .line 60
    .line 61
    iget-object p2, v1, La/vh40;->b:Ljava/lang/String;

    .line 62
    .line 63
    sget-object v0, La/u6m;->a:La/u6m;

    .line 64
    .line 65
    iget p0, p0, La/b960;->b:I

    .line 66
    .line 67
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-direct {p1, p2, p0}, La/y6m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_7
    instance-of p1, v1, La/wh40;

    .line 76
    .line 77
    if-eqz p1, :cond_8

    .line 78
    .line 79
    new-instance p1, La/z6m;

    .line 80
    .line 81
    check-cast v1, La/wh40;

    .line 82
    .line 83
    iget-object p2, v1, La/wh40;->b:Ljava/lang/String;

    .line 84
    .line 85
    sget-object v0, La/u6m;->a:La/u6m;

    .line 86
    .line 87
    iget p0, p0, La/b960;->b:I

    .line 88
    .line 89
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-direct {p1, p2, p0}, La/z6m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 98
    .line 99
    .line 100
    return-object v0
.end method
