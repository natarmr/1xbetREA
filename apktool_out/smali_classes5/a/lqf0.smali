.class public final synthetic La/lqf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/lqf0;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/lqf0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/lqf0;->a:La/lqf0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.resident.data.model.request.ResidentIncreaseBetRequest"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "BS"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "BINF"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "GI"

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "LG"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "WH"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    sput-object v1, La/lqf0;->descriptor:La/ugi0;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 3

    .line 1
    sget-object p0, La/tbl;->a:La/tbl;

    .line 2
    .line 3
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, La/zf8;->a:La/zf8;

    .line 8
    .line 9
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x5

    .line 14
    new-array v1, v1, [La/jiy;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    aput-object p0, v1, v2

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    aput-object v0, v1, p0

    .line 21
    .line 22
    sget-object p0, La/ysm0;->a:La/ysm0;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    aput-object p0, v1, v0

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    aput-object p0, v1, v0

    .line 29
    .line 30
    sget-object p0, La/okx;->a:La/okx;

    .line 31
    .line 32
    const/4 v0, 0x4

    .line 33
    aput-object p0, v1, v0

    .line 34
    .line 35
    return-object v1
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object p0, La/lqf0;->descriptor:La/ugi0;

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
    move v10, v5

    .line 13
    move-object v6, v2

    .line 14
    move-object v7, v6

    .line 15
    move-object v8, v7

    .line 16
    move-object v9, v8

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
    const/4 v10, 0x4

    .line 37
    if-ne v4, v10, :cond_0

    .line 38
    .line 39
    invoke-interface {p1, p0, v10}, La/bld;->j(La/ugi0;I)I

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    or-int/lit8 v5, v5, 0x10

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {v4}, La/itt0;->c(I)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_1
    invoke-interface {p1, p0, v11}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    or-int/lit8 v5, v5, 0x8

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-interface {p1, p0, v11}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    or-int/lit8 v5, v5, 0x4

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    sget-object v4, La/zf8;->a:La/zf8;

    .line 65
    .line 66
    invoke-interface {p1, p0, v0, v4, v7}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    move-object v7, v4

    .line 71
    check-cast v7, La/bg8;

    .line 72
    .line 73
    or-int/lit8 v5, v5, 0x2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    sget-object v4, La/tbl;->a:La/tbl;

    .line 77
    .line 78
    invoke-interface {p1, p0, v1, v4, v6}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    move-object v6, v4

    .line 83
    check-cast v6, Ljava/lang/Double;

    .line 84
    .line 85
    or-int/lit8 v5, v5, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    move v3, v1

    .line 89
    goto :goto_0

    .line 90
    :cond_6
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 91
    .line 92
    .line 93
    new-instance v4, La/nqf0;

    .line 94
    .line 95
    invoke-direct/range {v4 .. v10}, La/nqf0;-><init>(ILjava/lang/Double;La/bg8;Ljava/lang/String;Ljava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    return-object v4
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/lqf0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, La/nqf0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, La/nqf0;->b:La/bg8;

    .line 7
    .line 8
    iget-object v0, p2, La/nqf0;->a:Ljava/lang/Double;

    .line 9
    .line 10
    sget-object v1, La/lqf0;->descriptor:La/ugi0;

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
    sget-object v2, La/tbl;->a:La/tbl;

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
    sget-object v0, La/zf8;->a:La/zf8;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-interface {p1, v1, v2, v0, p0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    const/4 p0, 0x2

    .line 47
    iget-object v0, p2, La/nqf0;->c:Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {p1, v1, p0, v0}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x3

    .line 53
    iget-object v0, p2, La/nqf0;->d:Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {p1, v1, p0, v0}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x4

    .line 59
    iget p2, p2, La/nqf0;->e:I

    .line 60
    .line 61
    invoke-interface {p1, p0, p2, v1}, La/cld;->i(IILa/ugi0;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, v1}, La/cld;->c(La/ugi0;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
