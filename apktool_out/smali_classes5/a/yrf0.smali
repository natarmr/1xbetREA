.class public final synthetic La/yrf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/yrf0;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/yrf0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/yrf0;->a:La/yrf0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.resident.data.model.request.ResidentStartGameRequest"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "WH"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "LG"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "BS"

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-virtual {v1, v0, v3}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "BAC"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "BINF"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v3}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    sput-object v1, La/yrf0;->descriptor:La/ugi0;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 4

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
    sget-object v2, La/okx;->a:La/okx;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput-object v2, v1, v3

    .line 20
    .line 21
    sget-object v2, La/ysm0;->a:La/ysm0;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    aput-object v2, v1, v3

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    aput-object p0, v1, v2

    .line 28
    .line 29
    sget-object p0, La/s710;->a:La/s710;

    .line 30
    .line 31
    const/4 v2, 0x3

    .line 32
    aput-object p0, v1, v2

    .line 33
    .line 34
    const/4 p0, 0x4

    .line 35
    aput-object v0, v1, p0

    .line 36
    .line 37
    return-object v1
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object p0, La/yrf0;->descriptor:La/ugi0;

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
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    move v6, v1

    .line 13
    move v7, v6

    .line 14
    move-object v8, v2

    .line 15
    move-object v9, v8

    .line 16
    move-object v12, v9

    .line 17
    move-wide v10, v3

    .line 18
    move v3, v0

    .line 19
    :goto_0
    if-eqz v3, :cond_6

    .line 20
    .line 21
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, -0x1

    .line 26
    if-eq v4, v5, :cond_5

    .line 27
    .line 28
    if-eqz v4, :cond_4

    .line 29
    .line 30
    if-eq v4, v0, :cond_3

    .line 31
    .line 32
    const/4 v5, 0x2

    .line 33
    if-eq v4, v5, :cond_2

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    if-eq v4, v5, :cond_1

    .line 37
    .line 38
    const/4 v5, 0x4

    .line 39
    if-ne v4, v5, :cond_0

    .line 40
    .line 41
    sget-object v4, La/zf8;->a:La/zf8;

    .line 42
    .line 43
    invoke-interface {p1, p0, v5, v4, v12}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    move-object v12, v4

    .line 48
    check-cast v12, La/bg8;

    .line 49
    .line 50
    or-int/lit8 v6, v6, 0x10

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-static {v4}, La/itt0;->c(I)V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :cond_1
    invoke-interface {p1, p0, v5}, La/bld;->r(La/ugi0;I)J

    .line 58
    .line 59
    .line 60
    move-result-wide v10

    .line 61
    or-int/lit8 v6, v6, 0x8

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    sget-object v4, La/tbl;->a:La/tbl;

    .line 65
    .line 66
    invoke-interface {p1, p0, v5, v4, v9}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    move-object v9, v4

    .line 71
    check-cast v9, Ljava/lang/Double;

    .line 72
    .line 73
    or-int/lit8 v6, v6, 0x4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-interface {p1, p0, v0}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    or-int/lit8 v6, v6, 0x2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    invoke-interface {p1, p0, v1}, La/bld;->j(La/ugi0;I)I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    or-int/lit8 v6, v6, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    move v3, v1

    .line 91
    goto :goto_0

    .line 92
    :cond_6
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 93
    .line 94
    .line 95
    new-instance v5, La/asf0;

    .line 96
    .line 97
    invoke-direct/range {v5 .. v12}, La/asf0;-><init>(IILjava/lang/String;Ljava/lang/Double;JLa/bg8;)V

    .line 98
    .line 99
    .line 100
    return-object v5
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/yrf0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, La/asf0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/yrf0;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget v0, p2, La/asf0;->a:I

    .line 13
    .line 14
    iget-object v1, p2, La/asf0;->e:La/bg8;

    .line 15
    .line 16
    iget-object v2, p2, La/asf0;->c:Ljava/lang/Double;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-interface {p1, v3, v0, p0}, La/cld;->i(IILa/ugi0;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iget-object v3, p2, La/asf0;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {p1, p0, v0, v3}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    if-eqz v2, :cond_1

    .line 36
    .line 37
    :goto_0
    sget-object v0, La/tbl;->a:La/tbl;

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    invoke-interface {p1, p0, v3, v0, v2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    const/4 v0, 0x3

    .line 44
    iget-wide v2, p2, La/asf0;->d:J

    .line 45
    .line 46
    invoke-interface {p1, p0, v0, v2, v3}, La/cld;->n(La/ugi0;IJ)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eqz p2, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    if-eqz v1, :cond_3

    .line 57
    .line 58
    :goto_1
    sget-object p2, La/zf8;->a:La/zf8;

    .line 59
    .line 60
    const/4 v0, 0x4

    .line 61
    invoke-interface {p1, p0, v0, p2, v1}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
