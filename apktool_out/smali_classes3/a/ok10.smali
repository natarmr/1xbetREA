.class public final synthetic La/ok10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/ok10;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ok10;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/ok10;->a:La/ok10;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.core.data.LuckyWheelBonus"

    .line 11
    .line 12
    const/4 v3, 0x7

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "BNTID"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    new-instance v0, La/iy;

    .line 23
    .line 24
    const-string v3, "BT"

    .line 25
    .line 26
    const-string v4, "BNTP"

    .line 27
    .line 28
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const/16 v4, 0x17

    .line 33
    .line 34
    invoke-direct {v0, v3, v4}, La/iy;-><init>([Ljava/lang/String;B)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, La/zna0;->k(Ljava/lang/annotation/Annotation;)V

    .line 38
    .line 39
    .line 40
    const-string v0, "BNC"

    .line 41
    .line 42
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 43
    .line 44
    .line 45
    new-instance v0, La/iy;

    .line 46
    .line 47
    const-string v3, "BC"

    .line 48
    .line 49
    filled-new-array {v3}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-direct {v0, v3, v4}, La/iy;-><init>([Ljava/lang/String;B)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0}, La/zna0;->k(Ljava/lang/annotation/Annotation;)V

    .line 57
    .line 58
    .line 59
    const-string v0, "GID"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "E"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "CNT"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "TLM"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "FBSE"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    sput-object v1, La/ok10;->descriptor:La/ugi0;

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 7

    .line 1
    sget-object p0, La/vk10;->a:La/vk10;

    .line 2
    .line 3
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 8
    .line 9
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, La/s710;->a:La/s710;

    .line 14
    .line 15
    sget-object v2, La/ee8;->a:La/ee8;

    .line 16
    .line 17
    invoke-static {v2}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sget-object v4, La/tbl;->a:La/tbl;

    .line 26
    .line 27
    invoke-static {v4}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const/4 v5, 0x7

    .line 32
    new-array v5, v5, [La/jiy;

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    aput-object p0, v5, v6

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    aput-object v0, v5, p0

    .line 39
    .line 40
    const/4 p0, 0x2

    .line 41
    aput-object v1, v5, p0

    .line 42
    .line 43
    const/4 p0, 0x3

    .line 44
    aput-object v2, v5, p0

    .line 45
    .line 46
    const/4 p0, 0x4

    .line 47
    aput-object v1, v5, p0

    .line 48
    .line 49
    const/4 p0, 0x5

    .line 50
    aput-object v3, v5, p0

    .line 51
    .line 52
    const/4 p0, 0x6

    .line 53
    aput-object v4, v5, p0

    .line 54
    .line 55
    return-object v5
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 18

    .line 1
    sget-object v0, La/ok10;->descriptor:La/ugi0;

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
    const/4 v4, 0x0

    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    move-object v7, v4

    .line 14
    move-object v9, v7

    .line 15
    move-object v10, v9

    .line 16
    move-object v13, v10

    .line 17
    move-wide v11, v5

    .line 18
    move-wide v14, v11

    .line 19
    const/4 v8, 0x0

    .line 20
    move v5, v2

    .line 21
    move-object v6, v13

    .line 22
    :goto_0
    if-eqz v5, :cond_0

    .line 23
    .line 24
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 25
    .line 26
    .line 27
    move-result v16

    .line 28
    packed-switch v16, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v16 .. v16}, La/itt0;->c(I)V

    .line 32
    .line 33
    .line 34
    return-object v4

    .line 35
    :pswitch_0
    const/4 v4, 0x6

    .line 36
    sget-object v3, La/tbl;->a:La/tbl;

    .line 37
    .line 38
    invoke-interface {v1, v0, v4, v3, v7}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    move-object v7, v3

    .line 43
    check-cast v7, Ljava/lang/Double;

    .line 44
    .line 45
    or-int/lit8 v8, v8, 0x40

    .line 46
    .line 47
    :goto_1
    const/4 v4, 0x0

    .line 48
    goto :goto_0

    .line 49
    :pswitch_1
    const/4 v3, 0x5

    .line 50
    sget-object v4, La/s710;->a:La/s710;

    .line 51
    .line 52
    invoke-interface {v1, v0, v3, v4, v6}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move-object v6, v3

    .line 57
    check-cast v6, Ljava/lang/Long;

    .line 58
    .line 59
    or-int/lit8 v8, v8, 0x20

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :pswitch_2
    const/4 v3, 0x4

    .line 63
    invoke-interface {v1, v0, v3}, La/bld;->r(La/ugi0;I)J

    .line 64
    .line 65
    .line 66
    move-result-wide v14

    .line 67
    or-int/lit8 v8, v8, 0x10

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :pswitch_3
    const/4 v3, 0x3

    .line 71
    sget-object v4, La/ee8;->a:La/ee8;

    .line 72
    .line 73
    invoke-interface {v1, v0, v3, v4, v13}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    move-object v13, v3

    .line 78
    check-cast v13, La/de8;

    .line 79
    .line 80
    or-int/lit8 v8, v8, 0x8

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :pswitch_4
    const/4 v3, 0x2

    .line 84
    invoke-interface {v1, v0, v3}, La/bld;->r(La/ugi0;I)J

    .line 85
    .line 86
    .line 87
    move-result-wide v11

    .line 88
    or-int/lit8 v8, v8, 0x4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_5
    sget-object v3, La/ysm0;->a:La/ysm0;

    .line 92
    .line 93
    invoke-interface {v1, v0, v2, v3, v10}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    move-object v10, v3

    .line 98
    check-cast v10, Ljava/lang/String;

    .line 99
    .line 100
    or-int/lit8 v8, v8, 0x2

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :pswitch_6
    sget-object v3, La/vk10;->a:La/vk10;

    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    invoke-interface {v1, v0, v4, v3, v9}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    move-object v9, v3

    .line 111
    check-cast v9, La/uk10;

    .line 112
    .line 113
    or-int/lit8 v8, v8, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :pswitch_7
    const/4 v4, 0x0

    .line 117
    move v5, v4

    .line 118
    goto :goto_1

    .line 119
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 120
    .line 121
    .line 122
    move-object/from16 v17, v7

    .line 123
    .line 124
    new-instance v7, La/rk10;

    .line 125
    .line 126
    move-object/from16 v16, v6

    .line 127
    .line 128
    invoke-direct/range {v7 .. v17}, La/rk10;-><init>(ILa/uk10;Ljava/lang/String;JLa/de8;JLjava/lang/Long;Ljava/lang/Double;)V

    .line 129
    .line 130
    .line 131
    return-object v7

    .line 132
    nop

    .line 133
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
    sget-object p0, La/ok10;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 10

    .line 1
    check-cast p2, La/rk10;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, La/rk10;->g:Ljava/lang/Double;

    .line 7
    .line 8
    iget-object v0, p2, La/rk10;->f:Ljava/lang/Long;

    .line 9
    .line 10
    iget-wide v1, p2, La/rk10;->e:J

    .line 11
    .line 12
    iget-object v3, p2, La/rk10;->d:La/de8;

    .line 13
    .line 14
    iget-wide v4, p2, La/rk10;->c:J

    .line 15
    .line 16
    iget-object v6, p2, La/rk10;->b:Ljava/lang/String;

    .line 17
    .line 18
    iget-object p2, p2, La/rk10;->a:La/uk10;

    .line 19
    .line 20
    sget-object v7, La/ok10;->descriptor:La/ugi0;

    .line 21
    .line 22
    invoke-interface {p1, v7}, La/bwn;->a(La/ugi0;)La/cld;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    if-eqz v8, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    if-eqz p2, :cond_1

    .line 34
    .line 35
    :goto_0
    sget-object v8, La/vk10;->a:La/vk10;

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    invoke-interface {p1, v7, v9, v8, p2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const-string p2, ""

    .line 49
    .line 50
    invoke-static {v6, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-nez p2, :cond_3

    .line 55
    .line 56
    :goto_1
    sget-object p2, La/ysm0;->a:La/ysm0;

    .line 57
    .line 58
    const/4 v8, 0x1

    .line 59
    invoke-interface {p1, v7, v8, p2, v6}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    const-wide/16 v8, 0x0

    .line 67
    .line 68
    if-eqz p2, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    cmp-long p2, v4, v8

    .line 72
    .line 73
    if-eqz p2, :cond_5

    .line 74
    .line 75
    :goto_2
    const/4 p2, 0x2

    .line 76
    invoke-interface {p1, v7, p2, v4, v5}, La/cld;->n(La/ugi0;IJ)V

    .line 77
    .line 78
    .line 79
    :cond_5
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_6

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    if-eqz v3, :cond_7

    .line 87
    .line 88
    :goto_3
    sget-object p2, La/ee8;->a:La/ee8;

    .line 89
    .line 90
    const/4 v4, 0x3

    .line 91
    invoke-interface {p1, v7, v4, p2, v3}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_7
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-eqz p2, :cond_8

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_8
    cmp-long p2, v1, v8

    .line 102
    .line 103
    if-eqz p2, :cond_9

    .line 104
    .line 105
    :goto_4
    const/4 p2, 0x4

    .line 106
    invoke-interface {p1, v7, p2, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 107
    .line 108
    .line 109
    :cond_9
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-eqz p2, :cond_a

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_a
    if-nez v0, :cond_b

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide v1

    .line 123
    cmp-long p2, v1, v8

    .line 124
    .line 125
    if-eqz p2, :cond_c

    .line 126
    .line 127
    :goto_5
    sget-object p2, La/s710;->a:La/s710;

    .line 128
    .line 129
    const/4 v1, 0x5

    .line 130
    invoke-interface {p1, v7, v1, p2, v0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_c
    invoke-interface {p1, v7}, La/cld;->u(La/ugi0;)Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-eqz p2, :cond_d

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_d
    if-eqz p0, :cond_e

    .line 141
    .line 142
    :goto_6
    sget-object p2, La/tbl;->a:La/tbl;

    .line 143
    .line 144
    const/4 v0, 0x6

    .line 145
    invoke-interface {p1, v7, v0, p2, p0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_e
    invoke-interface {p1, v7}, La/cld;->c(La/ugi0;)V

    .line 149
    .line 150
    .line 151
    return-void
.end method
