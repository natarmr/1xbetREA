.class public final synthetic La/jgl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/jgl;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/jgl;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/jgl;->a:La/jgl;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.dragons_gold.data.models.requests.DragonsGoldRequest"

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
    sput-object v1, La/jgl;->descriptor:La/ugi0;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 4

    .line 1
    sget-object p0, La/lgl;->h:[La/a8z;

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    new-array v0, v0, [La/jiy;

    .line 5
    .line 6
    sget-object v1, La/s710;->a:La/s710;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aput-object v1, v0, v2

    .line 10
    .line 11
    sget-object v2, La/zf8;->a:La/zf8;

    .line 12
    .line 13
    invoke-static {v2}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x1

    .line 18
    aput-object v2, v0, v3

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    aput-object v1, v0, v2

    .line 22
    .line 23
    sget-object v1, La/tbl;->a:La/tbl;

    .line 24
    .line 25
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x3

    .line 30
    aput-object v1, v0, v2

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    sget-object v2, La/okx;->a:La/okx;

    .line 34
    .line 35
    aput-object v2, v0, v1

    .line 36
    .line 37
    const/4 v1, 0x5

    .line 38
    sget-object v2, La/ysm0;->a:La/ysm0;

    .line 39
    .line 40
    aput-object v2, v0, v1

    .line 41
    .line 42
    const/4 v1, 0x6

    .line 43
    aget-object p0, p0, v1

    .line 44
    .line 45
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    aput-object p0, v0, v1

    .line 50
    .line 51
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 19

    .line 1
    sget-object v0, La/jgl;->descriptor:La/ugi0;

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
    sget-object v2, La/lgl;->h:[La/a8z;

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
    move/from16 v16, v9

    .line 18
    .line 19
    move-wide v10, v5

    .line 20
    move-wide v13, v10

    .line 21
    move-object v6, v7

    .line 22
    move-object v12, v6

    .line 23
    move-object v15, v12

    .line 24
    move-object/from16 v17, v15

    .line 25
    .line 26
    move v5, v3

    .line 27
    :goto_0
    if-eqz v5, :cond_0

    .line 28
    .line 29
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    packed-switch v8, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    invoke-static {v8}, La/itt0;->c(I)V

    .line 37
    .line 38
    .line 39
    return-object v7

    .line 40
    :pswitch_0
    const/4 v8, 0x6

    .line 41
    aget-object v18, v2, v8

    .line 42
    .line 43
    invoke-interface/range {v18 .. v18}, La/a8z;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v18

    .line 47
    move-object/from16 v7, v18

    .line 48
    .line 49
    check-cast v7, La/jiy;

    .line 50
    .line 51
    invoke-interface {v1, v0, v8, v7, v6}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Ljava/util/List;

    .line 56
    .line 57
    or-int/lit8 v9, v9, 0x40

    .line 58
    .line 59
    :goto_1
    const/4 v7, 0x0

    .line 60
    goto :goto_0

    .line 61
    :pswitch_1
    const/4 v7, 0x5

    .line 62
    invoke-interface {v1, v0, v7}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v17

    .line 66
    or-int/lit8 v9, v9, 0x20

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :pswitch_2
    const/4 v7, 0x4

    .line 70
    invoke-interface {v1, v0, v7}, La/bld;->j(La/ugi0;I)I

    .line 71
    .line 72
    .line 73
    move-result v16

    .line 74
    or-int/lit8 v9, v9, 0x10

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_3
    const/4 v7, 0x3

    .line 78
    sget-object v8, La/tbl;->a:La/tbl;

    .line 79
    .line 80
    invoke-interface {v1, v0, v7, v8, v15}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    move-object v15, v7

    .line 85
    check-cast v15, Ljava/lang/Double;

    .line 86
    .line 87
    or-int/lit8 v9, v9, 0x8

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :pswitch_4
    const/4 v7, 0x2

    .line 91
    invoke-interface {v1, v0, v7}, La/bld;->r(La/ugi0;I)J

    .line 92
    .line 93
    .line 94
    move-result-wide v13

    .line 95
    or-int/lit8 v9, v9, 0x4

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :pswitch_5
    sget-object v7, La/zf8;->a:La/zf8;

    .line 99
    .line 100
    invoke-interface {v1, v0, v3, v7, v12}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    move-object v12, v7

    .line 105
    check-cast v12, La/bg8;

    .line 106
    .line 107
    or-int/lit8 v9, v9, 0x2

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :pswitch_6
    invoke-interface {v1, v0, v4}, La/bld;->r(La/ugi0;I)J

    .line 111
    .line 112
    .line 113
    move-result-wide v10

    .line 114
    or-int/lit8 v9, v9, 0x1

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :pswitch_7
    move v5, v4

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 120
    .line 121
    .line 122
    new-instance v8, La/lgl;

    .line 123
    .line 124
    move-object/from16 v18, v6

    .line 125
    .line 126
    invoke-direct/range {v8 .. v18}, La/lgl;-><init>(IJLa/bg8;JLjava/lang/Double;ILjava/lang/String;Ljava/util/List;)V

    .line 127
    .line 128
    .line 129
    return-object v8

    .line 130
    nop

    .line 131
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
    sget-object p0, La/jgl;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p2, La/lgl;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/jgl;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/lgl;->h:[La/a8z;

    .line 13
    .line 14
    iget-wide v1, p2, La/lgl;->a:J

    .line 15
    .line 16
    iget-object v3, p2, La/lgl;->d:Ljava/lang/Double;

    .line 17
    .line 18
    iget-object v4, p2, La/lgl;->b:La/bg8;

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-interface {p1, p0, v5, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    if-eqz v4, :cond_1

    .line 32
    .line 33
    :goto_0
    sget-object v1, La/zf8;->a:La/zf8;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-interface {p1, p0, v2, v1, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 v1, 0x2

    .line 40
    iget-wide v4, p2, La/lgl;->c:J

    .line 41
    .line 42
    invoke-interface {p1, p0, v1, v4, v5}, La/cld;->n(La/ugi0;IJ)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    if-eqz v3, :cond_3

    .line 53
    .line 54
    :goto_1
    sget-object v1, La/tbl;->a:La/tbl;

    .line 55
    .line 56
    const/4 v2, 0x3

    .line 57
    invoke-interface {p1, p0, v2, v1, v3}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    const/4 v1, 0x4

    .line 61
    iget v2, p2, La/lgl;->e:I

    .line 62
    .line 63
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 64
    .line 65
    .line 66
    const/4 v1, 0x5

    .line 67
    iget-object v2, p2, La/lgl;->f:Ljava/lang/String;

    .line 68
    .line 69
    invoke-interface {p1, p0, v1, v2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 v1, 0x6

    .line 73
    aget-object v0, v0, v1

    .line 74
    .line 75
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, La/jiy;

    .line 80
    .line 81
    iget-object p2, p2, La/lgl;->g:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {p1, p0, v1, v0, p2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method
