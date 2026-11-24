.class public final synthetic La/ne8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/ne8;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/ne8;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/ne8;->a:La/ne8;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.onexuser.domain.entity.onexgame.BonusGamePreviewResult"

    .line 11
    .line 12
    const/16 v3, 0xd

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "id"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "gameName"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "gameNameId"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "gameFlag"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "gameType"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "maxCoef"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "isGameWithCashback"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "forceIFrame"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "categories"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "imageInfo"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "underMaintenance"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "enable"

    .line 74
    .line 75
    const/4 v2, 0x1

    .line 76
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "fullScreenEnable"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    sput-object v1, La/ne8;->descriptor:La/ugi0;

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 4

    .line 1
    sget-object p0, La/pe8;->n:[La/a8z;

    .line 2
    .line 3
    const/16 v0, 0xd

    .line 4
    .line 5
    new-array v0, v0, [La/jiy;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    sget-object v2, La/s710;->a:La/s710;

    .line 9
    .line 10
    aput-object v2, v0, v1

    .line 11
    .line 12
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    aput-object v1, v0, v2

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    sget-object v3, La/okx;->a:La/okx;

    .line 19
    .line 20
    aput-object v3, v0, v2

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    sget-object v3, La/ics;->a:La/ics;

    .line 24
    .line 25
    aput-object v3, v0, v2

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    sget-object v3, La/b570;->a:La/b570;

    .line 29
    .line 30
    aput-object v3, v0, v2

    .line 31
    .line 32
    const/4 v2, 0x5

    .line 33
    aput-object v1, v0, v2

    .line 34
    .line 35
    sget-object v1, La/sm8;->a:La/sm8;

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    aput-object v1, v0, v2

    .line 39
    .line 40
    const/4 v2, 0x7

    .line 41
    aput-object v1, v0, v2

    .line 42
    .line 43
    const/16 v2, 0x8

    .line 44
    .line 45
    aget-object p0, p0, v2

    .line 46
    .line 47
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    aput-object p0, v0, v2

    .line 52
    .line 53
    const/16 p0, 0x9

    .line 54
    .line 55
    sget-object v2, La/cds;->a:La/cds;

    .line 56
    .line 57
    aput-object v2, v0, p0

    .line 58
    .line 59
    const/16 p0, 0xa

    .line 60
    .line 61
    aput-object v1, v0, p0

    .line 62
    .line 63
    const/16 p0, 0xb

    .line 64
    .line 65
    aput-object v1, v0, p0

    .line 66
    .line 67
    const/16 p0, 0xc

    .line 68
    .line 69
    aput-object v1, v0, p0

    .line 70
    .line 71
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 24

    .line 1
    sget-object v0, La/ne8;->descriptor:La/ugi0;

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
    sget-object v2, La/pe8;->n:[La/a8z;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    move-wide v10, v5

    .line 16
    move-object v6, v7

    .line 17
    move-object v8, v6

    .line 18
    move-object v12, v8

    .line 19
    move-object v14, v12

    .line 20
    move-object v15, v14

    .line 21
    move-object/from16 v16, v15

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v13, 0x0

    .line 25
    const/16 v17, 0x0

    .line 26
    .line 27
    const/16 v18, 0x0

    .line 28
    .line 29
    const/16 v21, 0x0

    .line 30
    .line 31
    const/16 v22, 0x0

    .line 32
    .line 33
    const/16 v23, 0x0

    .line 34
    .line 35
    move v5, v3

    .line 36
    :goto_0
    if-eqz v5, :cond_0

    .line 37
    .line 38
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 39
    .line 40
    .line 41
    move-result v19

    .line 42
    packed-switch v19, :pswitch_data_0

    .line 43
    .line 44
    .line 45
    invoke-static/range {v19 .. v19}, La/itt0;->c(I)V

    .line 46
    .line 47
    .line 48
    return-object v7

    .line 49
    :pswitch_0
    const/16 v7, 0xc

    .line 50
    .line 51
    invoke-interface {v1, v0, v7}, La/bld;->B(La/ugi0;I)Z

    .line 52
    .line 53
    .line 54
    move-result v23

    .line 55
    or-int/lit16 v9, v9, 0x1000

    .line 56
    .line 57
    :goto_1
    const/4 v7, 0x0

    .line 58
    goto :goto_0

    .line 59
    :pswitch_1
    const/16 v7, 0xb

    .line 60
    .line 61
    invoke-interface {v1, v0, v7}, La/bld;->B(La/ugi0;I)Z

    .line 62
    .line 63
    .line 64
    move-result v22

    .line 65
    or-int/lit16 v9, v9, 0x800

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :pswitch_2
    const/16 v7, 0xa

    .line 69
    .line 70
    invoke-interface {v1, v0, v7}, La/bld;->B(La/ugi0;I)Z

    .line 71
    .line 72
    .line 73
    move-result v21

    .line 74
    or-int/lit16 v9, v9, 0x400

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_3
    const/16 v7, 0x9

    .line 78
    .line 79
    sget-object v4, La/cds;->a:La/cds;

    .line 80
    .line 81
    invoke-interface {v1, v0, v7, v4, v8}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    move-object v8, v4

    .line 86
    check-cast v8, La/hds;

    .line 87
    .line 88
    or-int/lit16 v9, v9, 0x200

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_4
    const/16 v4, 0x8

    .line 92
    .line 93
    aget-object v7, v2, v4

    .line 94
    .line 95
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    check-cast v7, La/jiy;

    .line 100
    .line 101
    invoke-interface {v1, v0, v4, v7, v6}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    move-object v6, v4

    .line 106
    check-cast v6, Ljava/util/List;

    .line 107
    .line 108
    or-int/lit16 v9, v9, 0x100

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :pswitch_5
    const/4 v4, 0x7

    .line 112
    invoke-interface {v1, v0, v4}, La/bld;->B(La/ugi0;I)Z

    .line 113
    .line 114
    .line 115
    move-result v18

    .line 116
    or-int/lit16 v9, v9, 0x80

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :pswitch_6
    const/4 v4, 0x6

    .line 120
    invoke-interface {v1, v0, v4}, La/bld;->B(La/ugi0;I)Z

    .line 121
    .line 122
    .line 123
    move-result v17

    .line 124
    or-int/lit8 v9, v9, 0x40

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :pswitch_7
    const/4 v4, 0x5

    .line 128
    invoke-interface {v1, v0, v4}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v16

    .line 132
    or-int/lit8 v9, v9, 0x20

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :pswitch_8
    sget-object v4, La/b570;->a:La/b570;

    .line 136
    .line 137
    const/4 v7, 0x4

    .line 138
    invoke-interface {v1, v0, v7, v4, v15}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    move-object v15, v4

    .line 143
    check-cast v15, La/a570;

    .line 144
    .line 145
    or-int/lit8 v9, v9, 0x10

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :pswitch_9
    const/4 v4, 0x3

    .line 149
    sget-object v7, La/ics;->a:La/ics;

    .line 150
    .line 151
    invoke-interface {v1, v0, v4, v7, v14}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    move-object v14, v4

    .line 156
    check-cast v14, La/hcs;

    .line 157
    .line 158
    or-int/lit8 v9, v9, 0x8

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :pswitch_a
    const/4 v4, 0x2

    .line 162
    invoke-interface {v1, v0, v4}, La/bld;->j(La/ugi0;I)I

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    or-int/lit8 v9, v9, 0x4

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :pswitch_b
    invoke-interface {v1, v0, v3}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    or-int/lit8 v9, v9, 0x2

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :pswitch_c
    const/4 v4, 0x0

    .line 177
    invoke-interface {v1, v0, v4}, La/bld;->r(La/ugi0;I)J

    .line 178
    .line 179
    .line 180
    move-result-wide v10

    .line 181
    or-int/lit8 v9, v9, 0x1

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :pswitch_d
    const/4 v4, 0x0

    .line 185
    move v5, v4

    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 189
    .line 190
    .line 191
    move-object/from16 v20, v8

    .line 192
    .line 193
    new-instance v8, La/pe8;

    .line 194
    .line 195
    move-object/from16 v19, v6

    .line 196
    .line 197
    invoke-direct/range {v8 .. v23}, La/pe8;-><init>(IJLjava/lang/String;ILa/hcs;La/a570;Ljava/lang/String;ZZLjava/util/List;La/hds;ZZZ)V

    .line 198
    .line 199
    .line 200
    return-object v8

    .line 201
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
    sget-object p0, La/ne8;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p2, La/pe8;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/ne8;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/pe8;->n:[La/a8z;

    .line 13
    .line 14
    iget-wide v1, p2, La/pe8;->a:J

    .line 15
    .line 16
    iget-boolean v3, p2, La/pe8;->m:Z

    .line 17
    .line 18
    iget-boolean v4, p2, La/pe8;->l:Z

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-interface {p1, p0, v5, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p2, La/pe8;->b:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-interface {p1, p0, v2, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    iget v5, p2, La/pe8;->c:I

    .line 32
    .line 33
    invoke-interface {p1, v1, v5, p0}, La/cld;->i(IILa/ugi0;)V

    .line 34
    .line 35
    .line 36
    sget-object v1, La/ics;->a:La/ics;

    .line 37
    .line 38
    iget-object v5, p2, La/pe8;->d:La/hcs;

    .line 39
    .line 40
    const/4 v6, 0x3

    .line 41
    invoke-interface {p1, p0, v6, v1, v5}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sget-object v1, La/b570;->a:La/b570;

    .line 45
    .line 46
    iget-object v5, p2, La/pe8;->e:La/a570;

    .line 47
    .line 48
    const/4 v6, 0x4

    .line 49
    invoke-interface {p1, p0, v6, v1, v5}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x5

    .line 53
    iget-object v5, p2, La/pe8;->f:Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {p1, p0, v1, v5}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x6

    .line 59
    iget-boolean v5, p2, La/pe8;->g:Z

    .line 60
    .line 61
    invoke-interface {p1, p0, v1, v5}, La/cld;->x(La/ugi0;IZ)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x7

    .line 65
    iget-boolean v5, p2, La/pe8;->h:Z

    .line 66
    .line 67
    invoke-interface {p1, p0, v1, v5}, La/cld;->x(La/ugi0;IZ)V

    .line 68
    .line 69
    .line 70
    const/16 v1, 0x8

    .line 71
    .line 72
    aget-object v0, v0, v1

    .line 73
    .line 74
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, La/jiy;

    .line 79
    .line 80
    iget-object v5, p2, La/pe8;->i:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {p1, p0, v1, v0, v5}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget-object v0, La/cds;->a:La/cds;

    .line 86
    .line 87
    iget-object v1, p2, La/pe8;->j:La/hds;

    .line 88
    .line 89
    const/16 v5, 0x9

    .line 90
    .line 91
    invoke-interface {p1, p0, v5, v0, v1}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    const/16 v0, 0xa

    .line 95
    .line 96
    iget-boolean p2, p2, La/pe8;->k:Z

    .line 97
    .line 98
    invoke-interface {p1, p0, v0, p2}, La/cld;->x(La/ugi0;IZ)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-eqz p2, :cond_0

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    if-eq v4, v2, :cond_1

    .line 109
    .line 110
    :goto_0
    const/16 p2, 0xb

    .line 111
    .line 112
    invoke-interface {p1, p0, p2, v4}, La/cld;->x(La/ugi0;IZ)V

    .line 113
    .line 114
    .line 115
    :cond_1
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_2

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_2
    if-eqz v3, :cond_3

    .line 123
    .line 124
    :goto_1
    const/16 p2, 0xc

    .line 125
    .line 126
    invoke-interface {p1, p0, p2, v3}, La/cld;->x(La/ugi0;IZ)V

    .line 127
    .line 128
    .line 129
    :cond_3
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method
