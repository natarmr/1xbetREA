.class public final synthetic La/lei0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/lei0;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/lei0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/lei0;->a:La/lei0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "TextMessage"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "text"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "command"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "createdDate"

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "keyForLocalStore"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "sendWithError"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    sput-object v1, La/lei0;->descriptor:La/ugi0;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 6

    .line 1
    sget-object p0, La/ysm0;->a:La/ysm0;

    .line 2
    .line 3
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, La/z7d;->a:La/z7d;

    .line 8
    .line 9
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, La/yej;->a:La/yej;

    .line 14
    .line 15
    invoke-static {v2}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, La/sm8;->a:La/sm8;

    .line 20
    .line 21
    invoke-static {v3}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v4, 0x5

    .line 26
    new-array v4, v4, [La/jiy;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    aput-object v0, v4, v5

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    aput-object v1, v4, v0

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    aput-object v2, v4, v0

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    aput-object p0, v4, v0

    .line 39
    .line 40
    const/4 p0, 0x4

    .line 41
    aput-object v3, v4, p0

    .line 42
    .line 43
    return-object v4
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object p0, La/lei0;->descriptor:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v0

    .line 11
    move v5, v1

    .line 12
    move-object v6, v2

    .line 13
    move-object v7, v6

    .line 14
    move-object v8, v7

    .line 15
    move-object v9, v8

    .line 16
    move-object v10, v9

    .line 17
    :goto_0
    if-eqz v3, :cond_6

    .line 18
    .line 19
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/4 v11, -0x1

    .line 24
    if-eq v4, v11, :cond_5

    .line 25
    .line 26
    if-eqz v4, :cond_4

    .line 27
    .line 28
    if-eq v4, v0, :cond_3

    .line 29
    .line 30
    const/4 v11, 0x2

    .line 31
    if-eq v4, v11, :cond_2

    .line 32
    .line 33
    const/4 v11, 0x3

    .line 34
    if-eq v4, v11, :cond_1

    .line 35
    .line 36
    const/4 v11, 0x4

    .line 37
    if-ne v4, v11, :cond_0

    .line 38
    .line 39
    sget-object v4, La/sm8;->a:La/sm8;

    .line 40
    .line 41
    invoke-interface {p1, p0, v11, v4, v10}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    move-object v10, v4

    .line 46
    check-cast v10, Ljava/lang/Boolean;

    .line 47
    .line 48
    or-int/lit8 v5, v5, 0x10

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-static {v4}, La/itt0;->c(I)V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :cond_1
    invoke-interface {p1, p0, v11}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    or-int/lit8 v5, v5, 0x8

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    sget-object v4, La/yej;->a:La/yej;

    .line 63
    .line 64
    invoke-interface {p1, p0, v11, v4, v8}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    move-object v8, v4

    .line 69
    check-cast v8, Ljava/util/Date;

    .line 70
    .line 71
    or-int/lit8 v5, v5, 0x4

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    sget-object v4, La/z7d;->a:La/z7d;

    .line 75
    .line 76
    invoke-interface {p1, p0, v0, v4, v7}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    move-object v7, v4

    .line 81
    check-cast v7, La/b8d;

    .line 82
    .line 83
    or-int/lit8 v5, v5, 0x2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    sget-object v4, La/ysm0;->a:La/ysm0;

    .line 87
    .line 88
    invoke-interface {p1, p0, v1, v4, v6}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    move-object v6, v4

    .line 93
    check-cast v6, Ljava/lang/String;

    .line 94
    .line 95
    or-int/lit8 v5, v5, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    move v3, v1

    .line 99
    goto :goto_0

    .line 100
    :cond_6
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 101
    .line 102
    .line 103
    new-instance v4, La/nei0;

    .line 104
    .line 105
    invoke-direct/range {v4 .. v10}, La/nei0;-><init>(ILjava/lang/String;La/b8d;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 106
    .line 107
    .line 108
    return-object v4
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/lei0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, La/nei0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, La/nei0;->c:La/b8d;

    .line 7
    .line 8
    iget-object v0, p2, La/nei0;->b:Ljava/lang/String;

    .line 9
    .line 10
    sget-object v1, La/lei0;->descriptor:La/ugi0;

    .line 11
    .line 12
    invoke-interface {p1, v1}, La/bwn;->a(La/ugi0;)La/cld;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1, v1}, La/cld;->u(La/ugi0;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :goto_0
    sget-object v2, La/ysm0;->a:La/ysm0;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-interface {p1, v1, v3, v2, v0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-interface {p1, v1}, La/cld;->u(La/ugi0;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    if-eqz p0, :cond_3

    .line 39
    .line 40
    :goto_1
    sget-object v0, La/z7d;->a:La/z7d;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-interface {p1, v1, v2, v0, p0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    sget-object p0, La/yej;->a:La/yej;

    .line 47
    .line 48
    iget-object v0, p2, La/nei0;->d:Ljava/util/Date;

    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    invoke-interface {p1, v1, v2, p0, v0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x3

    .line 55
    iget-object v0, p2, La/nei0;->e:Ljava/lang/String;

    .line 56
    .line 57
    invoke-interface {p1, v1, p0, v0}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sget-object p0, La/sm8;->a:La/sm8;

    .line 61
    .line 62
    iget-object p2, p2, La/nei0;->f:Ljava/lang/Boolean;

    .line 63
    .line 64
    const/4 v0, 0x4

    .line 65
    invoke-interface {p1, v1, v0, p0, p2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p1, v1}, La/cld;->c(La/ugi0;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method
