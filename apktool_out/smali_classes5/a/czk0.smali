.class public final synthetic La/czk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/czk0;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/czk0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/czk0;->a:La/czk0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.spin_and_win.data.models.responses.SpinAndWinResponse"

    .line 11
    .line 12
    const/4 v3, 0x7

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "AI"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "CF"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "NB"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "RS"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "SB"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "SW"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    const-string v0, "GI"

    .line 48
    .line 49
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    sput-object v1, La/czk0;->descriptor:La/ugi0;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 9

    .line 1
    sget-object p0, La/ezk0;->h:[La/a8z;

    .line 2
    .line 3
    sget-object v0, La/s710;->a:La/s710;

    .line 4
    .line 5
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, La/tbl;->a:La/tbl;

    .line 10
    .line 11
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x3

    .line 20
    aget-object p0, p0, v4

    .line 21
    .line 22
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, La/jiy;

    .line 27
    .line 28
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object v5, La/lyk0;->a:La/lyk0;

    .line 33
    .line 34
    invoke-static {v5}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sget-object v6, La/ysm0;->a:La/ysm0;

    .line 43
    .line 44
    invoke-static {v6}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    const/4 v7, 0x7

    .line 49
    new-array v7, v7, [La/jiy;

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    aput-object v0, v7, v8

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    aput-object v2, v7, v0

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    aput-object v3, v7, v0

    .line 59
    .line 60
    aput-object p0, v7, v4

    .line 61
    .line 62
    const/4 p0, 0x4

    .line 63
    aput-object v5, v7, p0

    .line 64
    .line 65
    const/4 p0, 0x5

    .line 66
    aput-object v1, v7, p0

    .line 67
    .line 68
    const/4 p0, 0x6

    .line 69
    aput-object v6, v7, p0

    .line 70
    .line 71
    return-object v7
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 16

    .line 1
    sget-object v0, La/czk0;->descriptor:La/ugi0;

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
    sget-object v2, La/ezk0;->h:[La/a8z;

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
    sget-object v5, La/ysm0;->a:La/ysm0;

    .line 38
    .line 39
    invoke-interface {v1, v0, v7, v5, v15}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    move-object v15, v5

    .line 44
    check-cast v15, Ljava/lang/String;

    .line 45
    .line 46
    or-int/lit8 v8, v8, 0x40

    .line 47
    .line 48
    :goto_1
    const/4 v5, 0x0

    .line 49
    goto :goto_0

    .line 50
    :pswitch_1
    const/4 v5, 0x5

    .line 51
    sget-object v7, La/tbl;->a:La/tbl;

    .line 52
    .line 53
    invoke-interface {v1, v0, v5, v7, v14}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    move-object v14, v5

    .line 58
    check-cast v14, Ljava/lang/Double;

    .line 59
    .line 60
    or-int/lit8 v8, v8, 0x20

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :pswitch_2
    sget-object v5, La/lyk0;->a:La/lyk0;

    .line 64
    .line 65
    const/4 v7, 0x4

    .line 66
    invoke-interface {v1, v0, v7, v5, v13}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    move-object v13, v5

    .line 71
    check-cast v13, La/kyk0;

    .line 72
    .line 73
    or-int/lit8 v8, v8, 0x10

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :pswitch_3
    const/4 v5, 0x3

    .line 77
    aget-object v7, v2, v5

    .line 78
    .line 79
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    check-cast v7, La/jiy;

    .line 84
    .line 85
    invoke-interface {v1, v0, v5, v7, v12}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    move-object v12, v5

    .line 90
    check-cast v12, Ljava/util/List;

    .line 91
    .line 92
    or-int/lit8 v8, v8, 0x8

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :pswitch_4
    sget-object v5, La/tbl;->a:La/tbl;

    .line 96
    .line 97
    const/4 v7, 0x2

    .line 98
    invoke-interface {v1, v0, v7, v5, v11}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    move-object v11, v5

    .line 103
    check-cast v11, Ljava/lang/Double;

    .line 104
    .line 105
    or-int/lit8 v8, v8, 0x4

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :pswitch_5
    sget-object v5, La/tbl;->a:La/tbl;

    .line 109
    .line 110
    invoke-interface {v1, v0, v3, v5, v10}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    move-object v10, v5

    .line 115
    check-cast v10, Ljava/lang/Double;

    .line 116
    .line 117
    or-int/lit8 v8, v8, 0x2

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :pswitch_6
    sget-object v5, La/s710;->a:La/s710;

    .line 121
    .line 122
    invoke-interface {v1, v0, v4, v5, v9}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    move-object v9, v5

    .line 127
    check-cast v9, Ljava/lang/Long;

    .line 128
    .line 129
    or-int/lit8 v8, v8, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :pswitch_7
    move v6, v4

    .line 133
    goto :goto_0

    .line 134
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 135
    .line 136
    .line 137
    new-instance v7, La/ezk0;

    .line 138
    .line 139
    invoke-direct/range {v7 .. v15}, La/ezk0;-><init>(ILjava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;La/kyk0;Ljava/lang/Double;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-object v7

    .line 143
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
    sget-object p0, La/czk0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 9

    .line 1
    check-cast p2, La/ezk0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, La/ezk0;->g:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, p2, La/ezk0;->f:Ljava/lang/Double;

    .line 9
    .line 10
    iget-object v1, p2, La/ezk0;->e:La/kyk0;

    .line 11
    .line 12
    iget-object v2, p2, La/ezk0;->d:Ljava/util/List;

    .line 13
    .line 14
    iget-object v3, p2, La/ezk0;->c:Ljava/lang/Double;

    .line 15
    .line 16
    iget-object v4, p2, La/ezk0;->b:Ljava/lang/Double;

    .line 17
    .line 18
    iget-object p2, p2, La/ezk0;->a:Ljava/lang/Long;

    .line 19
    .line 20
    sget-object v5, La/czk0;->descriptor:La/ugi0;

    .line 21
    .line 22
    invoke-interface {p1, v5}, La/bwn;->a(La/ugi0;)La/cld;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object v6, La/ezk0;->h:[La/a8z;

    .line 27
    .line 28
    invoke-interface {p1, v5}, La/cld;->u(La/ugi0;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    if-eqz p2, :cond_1

    .line 36
    .line 37
    :goto_0
    sget-object v7, La/s710;->a:La/s710;

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    invoke-interface {p1, v5, v8, v7, p2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-interface {p1, v5}, La/cld;->u(La/ugi0;)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    if-eqz v4, :cond_3

    .line 51
    .line 52
    :goto_1
    sget-object p2, La/tbl;->a:La/tbl;

    .line 53
    .line 54
    const/4 v7, 0x1

    .line 55
    invoke-interface {p1, v5, v7, p2, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-interface {p1, v5}, La/cld;->u(La/ugi0;)Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_4

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    if-eqz v3, :cond_5

    .line 66
    .line 67
    :goto_2
    sget-object p2, La/tbl;->a:La/tbl;

    .line 68
    .line 69
    const/4 v4, 0x2

    .line 70
    invoke-interface {p1, v5, v4, p2, v3}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-interface {p1, v5}, La/cld;->u(La/ugi0;)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_6

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    if-eqz v2, :cond_7

    .line 81
    .line 82
    :goto_3
    const/4 p2, 0x3

    .line 83
    aget-object v3, v6, p2

    .line 84
    .line 85
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, La/jiy;

    .line 90
    .line 91
    invoke-interface {p1, v5, p2, v3, v2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_7
    invoke-interface {p1, v5}, La/cld;->u(La/ugi0;)Z

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
    if-eqz v1, :cond_9

    .line 102
    .line 103
    :goto_4
    sget-object p2, La/lyk0;->a:La/lyk0;

    .line 104
    .line 105
    const/4 v2, 0x4

    .line 106
    invoke-interface {p1, v5, v2, p2, v1}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_9
    invoke-interface {p1, v5}, La/cld;->u(La/ugi0;)Z

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
    if-eqz v0, :cond_b

    .line 117
    .line 118
    :goto_5
    sget-object p2, La/tbl;->a:La/tbl;

    .line 119
    .line 120
    const/4 v1, 0x5

    .line 121
    invoke-interface {p1, v5, v1, p2, v0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_b
    invoke-interface {p1, v5}, La/cld;->u(La/ugi0;)Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-eqz p2, :cond_c

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_c
    if-eqz p0, :cond_d

    .line 132
    .line 133
    :goto_6
    sget-object p2, La/ysm0;->a:La/ysm0;

    .line 134
    .line 135
    const/4 v0, 0x6

    .line 136
    invoke-interface {p1, v5, v0, p2, p0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_d
    invoke-interface {p1, v5}, La/cld;->c(La/ugi0;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method
