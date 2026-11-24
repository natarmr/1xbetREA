.class public final synthetic La/sin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/sin;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/sin;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/sin;->a:La/sin;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.eastern_nights.data.models.requests.EasternNightsRequest"

    .line 11
    .line 12
    const/4 v3, 0x7

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
    const-string v0, "BAC"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "BS"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v3}, La/zna0;->j(Ljava/lang/String;Z)V

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
    const-string v0, "LG"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "VU"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    sput-object v1, La/sin;->descriptor:La/ugi0;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 9

    .line 1
    sget-object p0, La/uin;->h:[La/a8z;

    .line 2
    .line 3
    sget-object v0, La/s710;->a:La/s710;

    .line 4
    .line 5
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, La/zf8;->a:La/zf8;

    .line 10
    .line 11
    invoke-static {v2}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v3, La/tbl;->a:La/tbl;

    .line 20
    .line 21
    invoke-static {v3}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sget-object v4, La/okx;->a:La/okx;

    .line 26
    .line 27
    invoke-static {v4}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    sget-object v5, La/ysm0;->a:La/ysm0;

    .line 32
    .line 33
    invoke-static {v5}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const/4 v6, 0x6

    .line 38
    aget-object p0, p0, v6

    .line 39
    .line 40
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, La/jiy;

    .line 45
    .line 46
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/4 v7, 0x7

    .line 51
    new-array v7, v7, [La/jiy;

    .line 52
    .line 53
    const/4 v8, 0x0

    .line 54
    aput-object v1, v7, v8

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    aput-object v2, v7, v1

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    aput-object v0, v7, v1

    .line 61
    .line 62
    const/4 v0, 0x3

    .line 63
    aput-object v3, v7, v0

    .line 64
    .line 65
    const/4 v0, 0x4

    .line 66
    aput-object v4, v7, v0

    .line 67
    .line 68
    const/4 v0, 0x5

    .line 69
    aput-object v5, v7, v0

    .line 70
    .line 71
    aput-object p0, v7, v6

    .line 72
    .line 73
    return-object v7
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 17

    .line 1
    sget-object v0, La/sin;->descriptor:La/ugi0;

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
    sget-object v2, La/uin;->h:[La/a8z;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    move v6, v3

    .line 15
    move v8, v4

    .line 16
    move-object v9, v5

    .line 17
    move-object v10, v9

    .line 18
    move-object v11, v10

    .line 19
    move-object v12, v11

    .line 20
    move-object v13, v12

    .line 21
    move-object v14, v13

    .line 22
    move-object v15, v14

    .line 23
    :goto_0
    if-eqz v6, :cond_0

    .line 24
    .line 25
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    packed-switch v7, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    invoke-static {v7}, La/itt0;->c(I)V

    .line 33
    .line 34
    .line 35
    return-object v5

    .line 36
    :pswitch_0
    const/4 v7, 0x6

    .line 37
    aget-object v16, v2, v7

    .line 38
    .line 39
    invoke-interface/range {v16 .. v16}, La/a8z;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v16

    .line 43
    move-object/from16 v5, v16

    .line 44
    .line 45
    check-cast v5, La/jiy;

    .line 46
    .line 47
    invoke-interface {v1, v0, v7, v5, v15}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    move-object v15, v5

    .line 52
    check-cast v15, Ljava/util/List;

    .line 53
    .line 54
    or-int/lit8 v8, v8, 0x40

    .line 55
    .line 56
    :goto_1
    const/4 v5, 0x0

    .line 57
    goto :goto_0

    .line 58
    :pswitch_1
    const/4 v5, 0x5

    .line 59
    sget-object v7, La/ysm0;->a:La/ysm0;

    .line 60
    .line 61
    invoke-interface {v1, v0, v5, v7, v14}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    move-object v14, v5

    .line 66
    check-cast v14, Ljava/lang/String;

    .line 67
    .line 68
    or-int/lit8 v8, v8, 0x20

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :pswitch_2
    sget-object v5, La/okx;->a:La/okx;

    .line 72
    .line 73
    const/4 v7, 0x4

    .line 74
    invoke-interface {v1, v0, v7, v5, v13}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    move-object v13, v5

    .line 79
    check-cast v13, Ljava/lang/Integer;

    .line 80
    .line 81
    or-int/lit8 v8, v8, 0x10

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :pswitch_3
    const/4 v5, 0x3

    .line 85
    sget-object v7, La/tbl;->a:La/tbl;

    .line 86
    .line 87
    invoke-interface {v1, v0, v5, v7, v12}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    move-object v12, v5

    .line 92
    check-cast v12, Ljava/lang/Double;

    .line 93
    .line 94
    or-int/lit8 v8, v8, 0x8

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :pswitch_4
    sget-object v5, La/s710;->a:La/s710;

    .line 98
    .line 99
    const/4 v7, 0x2

    .line 100
    invoke-interface {v1, v0, v7, v5, v11}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    move-object v11, v5

    .line 105
    check-cast v11, Ljava/lang/Long;

    .line 106
    .line 107
    or-int/lit8 v8, v8, 0x4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :pswitch_5
    sget-object v5, La/zf8;->a:La/zf8;

    .line 111
    .line 112
    invoke-interface {v1, v0, v3, v5, v10}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    move-object v10, v5

    .line 117
    check-cast v10, La/bg8;

    .line 118
    .line 119
    or-int/lit8 v8, v8, 0x2

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :pswitch_6
    sget-object v5, La/s710;->a:La/s710;

    .line 123
    .line 124
    invoke-interface {v1, v0, v4, v5, v9}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    move-object v9, v5

    .line 129
    check-cast v9, Ljava/lang/Long;

    .line 130
    .line 131
    or-int/lit8 v8, v8, 0x1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :pswitch_7
    move v6, v4

    .line 135
    goto :goto_0

    .line 136
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 137
    .line 138
    .line 139
    new-instance v7, La/uin;

    .line 140
    .line 141
    invoke-direct/range {v7 .. v15}, La/uin;-><init>(ILjava/lang/Long;La/bg8;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    return-object v7

    .line 145
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
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
    sget-object p0, La/sin;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p2, La/uin;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/sin;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/uin;->h:[La/a8z;

    .line 13
    .line 14
    sget-object v1, La/s710;->a:La/s710;

    .line 15
    .line 16
    iget-object v2, p2, La/uin;->a:Ljava/lang/Long;

    .line 17
    .line 18
    iget-object v3, p2, La/uin;->d:Ljava/lang/Double;

    .line 19
    .line 20
    iget-object v4, p2, La/uin;->b:La/bg8;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-interface {p1, p0, v5, v1, v2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    if-eqz v4, :cond_1

    .line 34
    .line 35
    :goto_0
    sget-object v2, La/zf8;->a:La/zf8;

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    invoke-interface {p1, p0, v5, v2, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    const/4 v2, 0x2

    .line 42
    iget-object v4, p2, La/uin;->c:Ljava/lang/Long;

    .line 43
    .line 44
    invoke-interface {p1, p0, v2, v1, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    if-eqz v3, :cond_3

    .line 55
    .line 56
    :goto_1
    sget-object v1, La/tbl;->a:La/tbl;

    .line 57
    .line 58
    const/4 v2, 0x3

    .line 59
    invoke-interface {p1, p0, v2, v1, v3}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    sget-object v1, La/okx;->a:La/okx;

    .line 63
    .line 64
    iget-object v2, p2, La/uin;->e:Ljava/lang/Integer;

    .line 65
    .line 66
    const/4 v3, 0x4

    .line 67
    invoke-interface {p1, p0, v3, v1, v2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 71
    .line 72
    iget-object v2, p2, La/uin;->f:Ljava/lang/String;

    .line 73
    .line 74
    const/4 v3, 0x5

    .line 75
    invoke-interface {p1, p0, v3, v1, v2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const/4 v1, 0x6

    .line 79
    aget-object v0, v0, v1

    .line 80
    .line 81
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, La/jiy;

    .line 86
    .line 87
    iget-object p2, p2, La/uin;->g:Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {p1, p0, v1, v0, p2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method
