.class public final synthetic La/wyk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/wyk0;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/wyk0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/wyk0;->a:La/wyk0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.spin_and_win.data.models.requests.SpinAndWinPlayRequest"

    .line 11
    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "BV"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "BS"

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-virtual {v1, v0, v3}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "BINF"

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
    sput-object v1, La/wyk0;->descriptor:La/ugi0;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 2

    .line 1
    sget-object p0, La/yyk0;->g:[La/a8z;

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    new-array v0, v0, [La/jiy;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object p0, p0, v1

    .line 8
    .line 9
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    aput-object p0, v0, v1

    .line 14
    .line 15
    sget-object p0, La/tbl;->a:La/tbl;

    .line 16
    .line 17
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v1, 0x1

    .line 22
    aput-object p0, v0, v1

    .line 23
    .line 24
    sget-object p0, La/zf8;->a:La/zf8;

    .line 25
    .line 26
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 v1, 0x2

    .line 31
    aput-object p0, v0, v1

    .line 32
    .line 33
    const/4 p0, 0x3

    .line 34
    sget-object v1, La/s710;->a:La/s710;

    .line 35
    .line 36
    aput-object v1, v0, p0

    .line 37
    .line 38
    const/4 p0, 0x4

    .line 39
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 40
    .line 41
    aput-object v1, v0, p0

    .line 42
    .line 43
    const/4 p0, 0x5

    .line 44
    sget-object v1, La/okx;->a:La/okx;

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
    sget-object v0, La/wyk0;->descriptor:La/ugi0;

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
    sget-object v2, La/yyk0;->g:[La/a8z;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const-wide/16 v6, 0x0

    .line 15
    .line 16
    move v9, v4

    .line 17
    move v10, v9

    .line 18
    move-object v13, v5

    .line 19
    move-object v14, v13

    .line 20
    move-object v15, v14

    .line 21
    move-wide v11, v6

    .line 22
    move v6, v3

    .line 23
    move-object v7, v15

    .line 24
    :goto_0
    if-eqz v6, :cond_0

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
    return-object v5

    .line 37
    :pswitch_0
    const/4 v8, 0x5

    .line 38
    invoke-interface {v1, v0, v8}, La/bld;->j(La/ugi0;I)I

    .line 39
    .line 40
    .line 41
    move-result v10

    .line 42
    or-int/lit8 v9, v9, 0x20

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_1
    const/4 v8, 0x4

    .line 46
    invoke-interface {v1, v0, v8}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v15

    .line 50
    or-int/lit8 v9, v9, 0x10

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_2
    const/4 v8, 0x3

    .line 54
    invoke-interface {v1, v0, v8}, La/bld;->r(La/ugi0;I)J

    .line 55
    .line 56
    .line 57
    move-result-wide v11

    .line 58
    or-int/lit8 v9, v9, 0x8

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_3
    sget-object v8, La/zf8;->a:La/zf8;

    .line 62
    .line 63
    const/4 v5, 0x2

    .line 64
    invoke-interface {v1, v0, v5, v8, v13}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    move-object v13, v5

    .line 69
    check-cast v13, La/bg8;

    .line 70
    .line 71
    or-int/lit8 v9, v9, 0x4

    .line 72
    .line 73
    :goto_1
    const/4 v5, 0x0

    .line 74
    goto :goto_0

    .line 75
    :pswitch_4
    sget-object v5, La/tbl;->a:La/tbl;

    .line 76
    .line 77
    invoke-interface {v1, v0, v3, v5, v14}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    move-object v14, v5

    .line 82
    check-cast v14, Ljava/lang/Double;

    .line 83
    .line 84
    or-int/lit8 v9, v9, 0x2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :pswitch_5
    aget-object v5, v2, v4

    .line 88
    .line 89
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, La/jiy;

    .line 94
    .line 95
    invoke-interface {v1, v0, v4, v5, v7}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    move-object v7, v5

    .line 100
    check-cast v7, Ljava/util/List;

    .line 101
    .line 102
    or-int/lit8 v9, v9, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :pswitch_6
    move v6, v4

    .line 106
    goto :goto_0

    .line 107
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 108
    .line 109
    .line 110
    new-instance v8, La/yyk0;

    .line 111
    .line 112
    move-object/from16 v16, v7

    .line 113
    .line 114
    invoke-direct/range {v8 .. v16}, La/yyk0;-><init>(IIJLa/bg8;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V

    .line 115
    .line 116
    .line 117
    return-object v8

    .line 118
    nop

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
    sget-object p0, La/wyk0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p2, La/yyk0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/wyk0;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/yyk0;->g:[La/a8z;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    aget-object v0, v0, v1

    .line 16
    .line 17
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/jiy;

    .line 22
    .line 23
    iget-object v2, p2, La/yyk0;->a:Ljava/util/List;

    .line 24
    .line 25
    iget-object v3, p2, La/yyk0;->c:La/bg8;

    .line 26
    .line 27
    iget-object v4, p2, La/yyk0;->b:Ljava/lang/Double;

    .line 28
    .line 29
    invoke-interface {p1, p0, v1, v0, v2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    if-eqz v4, :cond_1

    .line 40
    .line 41
    :goto_0
    sget-object v0, La/tbl;->a:La/tbl;

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-interface {p1, p0, v1, v0, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    if-eqz v3, :cond_3

    .line 55
    .line 56
    :goto_1
    sget-object v0, La/zf8;->a:La/zf8;

    .line 57
    .line 58
    const/4 v1, 0x2

    .line 59
    invoke-interface {p1, p0, v1, v0, v3}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    const/4 v0, 0x3

    .line 63
    iget-wide v1, p2, La/yyk0;->d:J

    .line 64
    .line 65
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x4

    .line 69
    iget-object v1, p2, La/yyk0;->e:Ljava/lang/String;

    .line 70
    .line 71
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x5

    .line 75
    iget p2, p2, La/yyk0;->f:I

    .line 76
    .line 77
    invoke-interface {p1, v0, p2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method
