.class public final synthetic La/zj10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/zj10;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/zj10;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/zj10;->a:La/zj10;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.lucky_card.data.model.LuckyCardRequest"

    .line 11
    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "BAC"

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
    const-string v0, "WH"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "VU"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v3}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "LG"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    sput-object v1, La/zj10;->descriptor:La/ugi0;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 3

    .line 1
    sget-object p0, La/bk10;->g:[La/a8z;

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    new-array v0, v0, [La/jiy;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    sget-object v2, La/s710;->a:La/s710;

    .line 8
    .line 9
    aput-object v2, v0, v1

    .line 10
    .line 11
    sget-object v1, La/zf8;->a:La/zf8;

    .line 12
    .line 13
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    aput-object v1, v0, v2

    .line 19
    .line 20
    sget-object v1, La/tbl;->a:La/tbl;

    .line 21
    .line 22
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x2

    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    const/4 v1, 0x3

    .line 30
    sget-object v2, La/okx;->a:La/okx;

    .line 31
    .line 32
    aput-object v2, v0, v1

    .line 33
    .line 34
    const/4 v1, 0x4

    .line 35
    aget-object p0, p0, v1

    .line 36
    .line 37
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    aput-object p0, v0, v1

    .line 42
    .line 43
    const/4 p0, 0x5

    .line 44
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 45
    .line 46
    aput-object v1, v0, p0

    .line 47
    .line 48
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 17

    .line 1
    sget-object v0, La/zj10;->descriptor:La/ugi0;

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
    sget-object v2, La/bk10;->g:[La/a8z;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const-wide/16 v5, 0x0

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    move v9, v4

    .line 17
    move v10, v9

    .line 18
    move-wide v11, v5

    .line 19
    move-object v6, v7

    .line 20
    move-object v13, v6

    .line 21
    move-object v14, v13

    .line 22
    move-object v15, v14

    .line 23
    move v5, v3

    .line 24
    :goto_0
    if-eqz v5, :cond_0

    .line 25
    .line 26
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    packed-switch v8, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    invoke-static {v8}, La/itt0;->c(I)V

    .line 34
    .line 35
    .line 36
    return-object v7

    .line 37
    :pswitch_0
    const/4 v8, 0x5

    .line 38
    invoke-interface {v1, v0, v8}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v15

    .line 42
    or-int/lit8 v9, v9, 0x20

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_1
    const/4 v8, 0x4

    .line 46
    aget-object v16, v2, v8

    .line 47
    .line 48
    invoke-interface/range {v16 .. v16}, La/a8z;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v16

    .line 52
    move-object/from16 v7, v16

    .line 53
    .line 54
    check-cast v7, La/jiy;

    .line 55
    .line 56
    invoke-interface {v1, v0, v8, v7, v6}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, Ljava/util/List;

    .line 61
    .line 62
    or-int/lit8 v9, v9, 0x10

    .line 63
    .line 64
    :goto_1
    const/4 v7, 0x0

    .line 65
    goto :goto_0

    .line 66
    :pswitch_2
    const/4 v7, 0x3

    .line 67
    invoke-interface {v1, v0, v7}, La/bld;->j(La/ugi0;I)I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    or-int/lit8 v9, v9, 0x8

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :pswitch_3
    sget-object v7, La/tbl;->a:La/tbl;

    .line 75
    .line 76
    const/4 v8, 0x2

    .line 77
    invoke-interface {v1, v0, v8, v7, v14}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    move-object v14, v7

    .line 82
    check-cast v14, Ljava/lang/Double;

    .line 83
    .line 84
    or-int/lit8 v9, v9, 0x4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :pswitch_4
    sget-object v7, La/zf8;->a:La/zf8;

    .line 88
    .line 89
    invoke-interface {v1, v0, v3, v7, v13}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    move-object v13, v7

    .line 94
    check-cast v13, La/bg8;

    .line 95
    .line 96
    or-int/lit8 v9, v9, 0x2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :pswitch_5
    invoke-interface {v1, v0, v4}, La/bld;->r(La/ugi0;I)J

    .line 100
    .line 101
    .line 102
    move-result-wide v11

    .line 103
    or-int/lit8 v9, v9, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :pswitch_6
    move v5, v4

    .line 107
    goto :goto_0

    .line 108
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 109
    .line 110
    .line 111
    new-instance v8, La/bk10;

    .line 112
    .line 113
    move-object/from16 v16, v6

    .line 114
    .line 115
    invoke-direct/range {v8 .. v16}, La/bk10;-><init>(IIJLa/bg8;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V

    .line 116
    .line 117
    .line 118
    return-object v8

    .line 119
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
    sget-object p0, La/zj10;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p2, La/bk10;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/zj10;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/bk10;->g:[La/a8z;

    .line 13
    .line 14
    iget-wide v1, p2, La/bk10;->a:J

    .line 15
    .line 16
    iget-object v3, p2, La/bk10;->e:Ljava/util/List;

    .line 17
    .line 18
    iget-object v4, p2, La/bk10;->c:Ljava/lang/Double;

    .line 19
    .line 20
    iget-object v5, p2, La/bk10;->b:La/bg8;

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-interface {p1, p0, v6, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    if-eqz v5, :cond_1

    .line 34
    .line 35
    :goto_0
    sget-object v1, La/zf8;->a:La/zf8;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-interface {p1, p0, v2, v1, v5}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    if-eqz v4, :cond_3

    .line 49
    .line 50
    :goto_1
    sget-object v1, La/tbl;->a:La/tbl;

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    invoke-interface {p1, p0, v2, v1, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    const/4 v1, 0x3

    .line 57
    iget v2, p2, La/bk10;->d:I

    .line 58
    .line 59
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    sget-object v1, La/iun;->a:La/iun;

    .line 70
    .line 71
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_5

    .line 76
    .line 77
    :goto_2
    const/4 v1, 0x4

    .line 78
    aget-object v0, v0, v1

    .line 79
    .line 80
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, La/jiy;

    .line 85
    .line 86
    invoke-interface {p1, p0, v1, v0, v3}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    const/4 v0, 0x5

    .line 90
    iget-object p2, p2, La/bk10;->f:Ljava/lang/String;

    .line 91
    .line 92
    invoke-interface {p1, p0, v0, p2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method
