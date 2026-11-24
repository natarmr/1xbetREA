.class public final synthetic La/dj30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/dj30;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/dj30;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/dj30;->a:La/dj30;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.bet_constructor.impl.makebet.data.model.request.MaxBetRequest"

    .line 11
    .line 12
    const/16 v3, 0xd

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "UserId"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "UserIdBonus"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "AppGuid"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "promo"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "Vid"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "Summ"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "Source"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "partner"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "CheckCf"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "Lng"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "Sport"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "Groups"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "Events"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    sput-object v1, La/dj30;->descriptor:La/ugi0;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 5

    .line 1
    sget-object p0, La/fj30;->n:[La/a8z;

    .line 2
    .line 3
    const/16 v0, 0xd

    .line 4
    .line 5
    new-array v0, v0, [La/jiy;

    .line 6
    .line 7
    sget-object v1, La/s710;->a:La/s710;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v1, v0, v2

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    aput-object v1, v0, v2

    .line 14
    .line 15
    sget-object v2, La/ysm0;->a:La/ysm0;

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    aput-object v2, v0, v3

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    invoke-static {v2}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    aput-object v4, v0, v3

    .line 26
    .line 27
    const/4 v3, 0x4

    .line 28
    aput-object v2, v0, v3

    .line 29
    .line 30
    const/4 v3, 0x5

    .line 31
    sget-object v4, La/tbl;->a:La/tbl;

    .line 32
    .line 33
    aput-object v4, v0, v3

    .line 34
    .line 35
    sget-object v3, La/okx;->a:La/okx;

    .line 36
    .line 37
    const/4 v4, 0x6

    .line 38
    aput-object v3, v0, v4

    .line 39
    .line 40
    const/4 v4, 0x7

    .line 41
    aput-object v3, v0, v4

    .line 42
    .line 43
    const/16 v4, 0x8

    .line 44
    .line 45
    aput-object v3, v0, v4

    .line 46
    .line 47
    const/16 v3, 0x9

    .line 48
    .line 49
    aput-object v2, v0, v3

    .line 50
    .line 51
    const/16 v2, 0xa

    .line 52
    .line 53
    aput-object v1, v0, v2

    .line 54
    .line 55
    const/16 v1, 0xb

    .line 56
    .line 57
    aget-object v2, p0, v1

    .line 58
    .line 59
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    aput-object v2, v0, v1

    .line 64
    .line 65
    const/16 v1, 0xc

    .line 66
    .line 67
    aget-object p0, p0, v1

    .line 68
    .line 69
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    aput-object p0, v0, v1

    .line 74
    .line 75
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 29

    .line 1
    sget-object v0, La/dj30;->descriptor:La/ugi0;

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
    sget-object v2, La/fj30;->n:[La/a8z;

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
    const-wide/16 v8, 0x0

    .line 17
    .line 18
    move v11, v4

    .line 19
    move/from16 v21, v11

    .line 20
    .line 21
    move/from16 v22, v21

    .line 22
    .line 23
    move/from16 v23, v22

    .line 24
    .line 25
    move-wide v12, v5

    .line 26
    move-wide v14, v12

    .line 27
    move-wide/from16 v25, v14

    .line 28
    .line 29
    move-object v6, v7

    .line 30
    move-object/from16 v16, v6

    .line 31
    .line 32
    move-object/from16 v18, v16

    .line 33
    .line 34
    move-object/from16 v24, v18

    .line 35
    .line 36
    move-wide/from16 v19, v8

    .line 37
    .line 38
    move v5, v3

    .line 39
    move-object/from16 v8, v24

    .line 40
    .line 41
    move-object v9, v8

    .line 42
    :goto_0
    if-eqz v5, :cond_0

    .line 43
    .line 44
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    packed-switch v10, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    invoke-static {v10}, La/itt0;->c(I)V

    .line 52
    .line 53
    .line 54
    return-object v7

    .line 55
    :pswitch_0
    const/16 v10, 0xc

    .line 56
    .line 57
    aget-object v17, v2, v10

    .line 58
    .line 59
    invoke-interface/range {v17 .. v17}, La/a8z;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v17

    .line 63
    move-object/from16 v7, v17

    .line 64
    .line 65
    check-cast v7, La/jiy;

    .line 66
    .line 67
    invoke-interface {v1, v0, v10, v7, v9}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    move-object v9, v7

    .line 72
    check-cast v9, Ljava/util/List;

    .line 73
    .line 74
    or-int/lit16 v11, v11, 0x1000

    .line 75
    .line 76
    :goto_1
    const/4 v7, 0x0

    .line 77
    goto :goto_0

    .line 78
    :pswitch_1
    const/16 v7, 0xb

    .line 79
    .line 80
    aget-object v10, v2, v7

    .line 81
    .line 82
    invoke-interface {v10}, La/a8z;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    check-cast v10, La/jiy;

    .line 87
    .line 88
    invoke-interface {v1, v0, v7, v10, v8}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    move-object v8, v7

    .line 93
    check-cast v8, Ljava/util/List;

    .line 94
    .line 95
    or-int/lit16 v11, v11, 0x800

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :pswitch_2
    const/16 v7, 0xa

    .line 99
    .line 100
    invoke-interface {v1, v0, v7}, La/bld;->r(La/ugi0;I)J

    .line 101
    .line 102
    .line 103
    move-result-wide v25

    .line 104
    or-int/lit16 v11, v11, 0x400

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :pswitch_3
    const/16 v7, 0x9

    .line 108
    .line 109
    invoke-interface {v1, v0, v7}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v24

    .line 113
    or-int/lit16 v11, v11, 0x200

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :pswitch_4
    const/16 v7, 0x8

    .line 117
    .line 118
    invoke-interface {v1, v0, v7}, La/bld;->j(La/ugi0;I)I

    .line 119
    .line 120
    .line 121
    move-result v23

    .line 122
    or-int/lit16 v11, v11, 0x100

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :pswitch_5
    const/4 v7, 0x7

    .line 126
    invoke-interface {v1, v0, v7}, La/bld;->j(La/ugi0;I)I

    .line 127
    .line 128
    .line 129
    move-result v22

    .line 130
    or-int/lit16 v11, v11, 0x80

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :pswitch_6
    const/4 v7, 0x6

    .line 134
    invoke-interface {v1, v0, v7}, La/bld;->j(La/ugi0;I)I

    .line 135
    .line 136
    .line 137
    move-result v21

    .line 138
    or-int/lit8 v11, v11, 0x40

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :pswitch_7
    const/4 v7, 0x5

    .line 142
    invoke-interface {v1, v0, v7}, La/bld;->t(La/ugi0;I)D

    .line 143
    .line 144
    .line 145
    move-result-wide v19

    .line 146
    or-int/lit8 v11, v11, 0x20

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :pswitch_8
    const/4 v7, 0x4

    .line 150
    invoke-interface {v1, v0, v7}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v18

    .line 154
    or-int/lit8 v11, v11, 0x10

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :pswitch_9
    const/4 v7, 0x3

    .line 158
    sget-object v10, La/ysm0;->a:La/ysm0;

    .line 159
    .line 160
    invoke-interface {v1, v0, v7, v10, v6}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    check-cast v6, Ljava/lang/String;

    .line 165
    .line 166
    or-int/lit8 v11, v11, 0x8

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :pswitch_a
    const/4 v7, 0x2

    .line 170
    invoke-interface {v1, v0, v7}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v16

    .line 174
    or-int/lit8 v11, v11, 0x4

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :pswitch_b
    invoke-interface {v1, v0, v3}, La/bld;->r(La/ugi0;I)J

    .line 178
    .line 179
    .line 180
    move-result-wide v14

    .line 181
    or-int/lit8 v11, v11, 0x2

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :pswitch_c
    invoke-interface {v1, v0, v4}, La/bld;->r(La/ugi0;I)J

    .line 185
    .line 186
    .line 187
    move-result-wide v12

    .line 188
    or-int/lit8 v11, v11, 0x1

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :pswitch_d
    move v5, v4

    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 195
    .line 196
    .line 197
    new-instance v10, La/fj30;

    .line 198
    .line 199
    move-object/from16 v17, v6

    .line 200
    .line 201
    move-object/from16 v27, v8

    .line 202
    .line 203
    move-object/from16 v28, v9

    .line 204
    .line 205
    invoke-direct/range {v10 .. v28}, La/fj30;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DIIILjava/lang/String;JLjava/util/List;Ljava/util/List;)V

    .line 206
    .line 207
    .line 208
    return-object v10

    .line 209
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
    sget-object p0, La/dj30;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, La/fj30;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/dj30;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/fj30;->n:[La/a8z;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iget-wide v2, p2, La/fj30;->a:J

    .line 16
    .line 17
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->n(La/ugi0;IJ)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iget-wide v2, p2, La/fj30;->b:J

    .line 22
    .line 23
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->n(La/ugi0;IJ)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    iget-object v2, p2, La/fj30;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {p1, p0, v1, v2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 33
    .line 34
    iget-object v2, p2, La/fj30;->d:Ljava/lang/String;

    .line 35
    .line 36
    const/4 v3, 0x3

    .line 37
    invoke-interface {p1, p0, v3, v1, v2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    iget-object v2, p2, La/fj30;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-interface {p1, p0, v1, v2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x5

    .line 47
    iget-wide v2, p2, La/fj30;->f:D

    .line 48
    .line 49
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->j(La/ugi0;ID)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x6

    .line 53
    iget v2, p2, La/fj30;->g:I

    .line 54
    .line 55
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x7

    .line 59
    iget v2, p2, La/fj30;->h:I

    .line 60
    .line 61
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 62
    .line 63
    .line 64
    const/16 v1, 0x8

    .line 65
    .line 66
    iget v2, p2, La/fj30;->i:I

    .line 67
    .line 68
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 69
    .line 70
    .line 71
    const/16 v1, 0x9

    .line 72
    .line 73
    iget-object v2, p2, La/fj30;->j:Ljava/lang/String;

    .line 74
    .line 75
    invoke-interface {p1, p0, v1, v2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/16 v1, 0xa

    .line 79
    .line 80
    iget-wide v2, p2, La/fj30;->k:J

    .line 81
    .line 82
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->n(La/ugi0;IJ)V

    .line 83
    .line 84
    .line 85
    const/16 v1, 0xb

    .line 86
    .line 87
    aget-object v2, v0, v1

    .line 88
    .line 89
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, La/jiy;

    .line 94
    .line 95
    iget-object v3, p2, La/fj30;->l:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    const/16 v1, 0xc

    .line 101
    .line 102
    aget-object v0, v0, v1

    .line 103
    .line 104
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, La/jiy;

    .line 109
    .line 110
    iget-object p2, p2, La/fj30;->m:Ljava/util/List;

    .line 111
    .line 112
    invoke-interface {p1, p0, v1, v0, p2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method
