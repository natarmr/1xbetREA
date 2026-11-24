.class public final synthetic La/hft;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/hft;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/hft;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/hft;->a:La/hft;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.tile_matching.data.request.GemsOdysseyGameRequest"

    .line 11
    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "UI"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "BINF"

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-virtual {v1, v0, v3}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "BS"

    .line 29
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
    const-string v0, "LG"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "WH"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    sput-object v1, La/hft;->descriptor:La/ugi0;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 4

    .line 1
    sget-object p0, La/zf8;->a:La/zf8;

    .line 2
    .line 3
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, La/tbl;->a:La/tbl;

    .line 8
    .line 9
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x6

    .line 14
    new-array v1, v1, [La/jiy;

    .line 15
    .line 16
    sget-object v2, La/s710;->a:La/s710;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput-object v2, v1, v3

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    aput-object p0, v1, v3

    .line 23
    .line 24
    const/4 p0, 0x2

    .line 25
    aput-object v0, v1, p0

    .line 26
    .line 27
    const/4 p0, 0x3

    .line 28
    aput-object v2, v1, p0

    .line 29
    .line 30
    sget-object p0, La/ysm0;->a:La/ysm0;

    .line 31
    .line 32
    const/4 v0, 0x4

    .line 33
    aput-object p0, v1, v0

    .line 34
    .line 35
    sget-object p0, La/okx;->a:La/okx;

    .line 36
    .line 37
    const/4 v0, 0x5

    .line 38
    aput-object p0, v1, v0

    .line 39
    .line 40
    return-object v1
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 17

    .line 1
    sget-object v0, La/hft;->descriptor:La/ugi0;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    move v8, v3

    .line 15
    move/from16 v16, v8

    .line 16
    .line 17
    move-wide v9, v4

    .line 18
    move-wide v13, v9

    .line 19
    move-object v11, v6

    .line 20
    move-object v12, v11

    .line 21
    move-object v15, v12

    .line 22
    move v4, v2

    .line 23
    :goto_0
    if-eqz v4, :cond_0

    .line 24
    .line 25
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    packed-switch v5, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    invoke-static {v5}, La/itt0;->c(I)V

    .line 33
    .line 34
    .line 35
    return-object v6

    .line 36
    :pswitch_0
    const/4 v5, 0x5

    .line 37
    invoke-interface {v1, v0, v5}, La/bld;->j(La/ugi0;I)I

    .line 38
    .line 39
    .line 40
    move-result v16

    .line 41
    or-int/lit8 v8, v8, 0x20

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_1
    const/4 v5, 0x4

    .line 45
    invoke-interface {v1, v0, v5}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v15

    .line 49
    or-int/lit8 v8, v8, 0x10

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_2
    const/4 v5, 0x3

    .line 53
    invoke-interface {v1, v0, v5}, La/bld;->r(La/ugi0;I)J

    .line 54
    .line 55
    .line 56
    move-result-wide v13

    .line 57
    or-int/lit8 v8, v8, 0x8

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_3
    sget-object v5, La/tbl;->a:La/tbl;

    .line 61
    .line 62
    const/4 v7, 0x2

    .line 63
    invoke-interface {v1, v0, v7, v5, v12}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    move-object v12, v5

    .line 68
    check-cast v12, Ljava/lang/Double;

    .line 69
    .line 70
    or-int/lit8 v8, v8, 0x4

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :pswitch_4
    sget-object v5, La/zf8;->a:La/zf8;

    .line 74
    .line 75
    invoke-interface {v1, v0, v2, v5, v11}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    move-object v11, v5

    .line 80
    check-cast v11, La/bg8;

    .line 81
    .line 82
    or-int/lit8 v8, v8, 0x2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :pswitch_5
    invoke-interface {v1, v0, v3}, La/bld;->r(La/ugi0;I)J

    .line 86
    .line 87
    .line 88
    move-result-wide v9

    .line 89
    or-int/lit8 v8, v8, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :pswitch_6
    move v4, v3

    .line 93
    goto :goto_0

    .line 94
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 95
    .line 96
    .line 97
    new-instance v7, La/jft;

    .line 98
    .line 99
    invoke-direct/range {v7 .. v16}, La/jft;-><init>(IJLa/bg8;Ljava/lang/Double;JLjava/lang/String;I)V

    .line 100
    .line 101
    .line 102
    return-object v7

    .line 103
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/hft;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p2, La/jft;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/hft;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-wide v0, p2, La/jft;->a:J

    .line 13
    .line 14
    iget-object v2, p2, La/jft;->c:Ljava/lang/Double;

    .line 15
    .line 16
    iget-object v3, p2, La/jft;->b:La/bg8;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-interface {p1, p0, v4, v0, v1}, La/cld;->n(La/ugi0;IJ)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-eqz v3, :cond_1

    .line 30
    .line 31
    :goto_0
    sget-object v0, La/zf8;->a:La/zf8;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-interface {p1, p0, v1, v0, v3}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    if-eqz v2, :cond_3

    .line 45
    .line 46
    :goto_1
    sget-object v0, La/tbl;->a:La/tbl;

    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    invoke-interface {p1, p0, v1, v0, v2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    const/4 v0, 0x3

    .line 53
    iget-wide v1, p2, La/jft;->d:J

    .line 54
    .line 55
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x4

    .line 59
    iget-object v1, p2, La/jft;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x5

    .line 65
    iget p2, p2, La/jft;->f:I

    .line 66
    .line 67
    invoke-interface {p1, v0, p2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method
