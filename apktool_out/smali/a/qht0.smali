.class public final synthetic La/qht0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/qht0;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/qht0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/qht0;->a:La/qht0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.coupon.impl.coupon.data.models.UpdateCouponBuilderRequest"

    .line 11
    .line 12
    const/16 v3, 0x11

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "AppGuid"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "Summ"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "CheckCf"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "notWait"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "avanceBet"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "AddPromoCodes"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "BuilderCoupon"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "Lng"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "IsNewBuilder"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "CfView"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "Kind"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "UserId"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "UserIdBonus"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string v0, "Source"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string v0, "partner"

    .line 89
    .line 90
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    const-string v0, "Country"

    .line 94
    .line 95
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    const-string v0, "Vid"

    .line 99
    .line 100
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    sput-object v1, La/qht0;->descriptor:La/ugi0;

    .line 104
    .line 105
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 5

    .line 1
    const/16 p0, 0x11

    .line 2
    .line 3
    new-array p0, p0, [La/jiy;

    .line 4
    .line 5
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    aput-object v0, p0, v1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aput-object v0, p0, v1

    .line 12
    .line 13
    sget-object v1, La/okx;->a:La/okx;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    aput-object v1, p0, v2

    .line 17
    .line 18
    sget-object v2, La/sm8;->a:La/sm8;

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    aput-object v2, p0, v3

    .line 22
    .line 23
    const/4 v3, 0x4

    .line 24
    aput-object v2, p0, v3

    .line 25
    .line 26
    const/4 v3, 0x5

    .line 27
    aput-object v2, p0, v3

    .line 28
    .line 29
    sget-object v3, La/wb9;->a:La/wb9;

    .line 30
    .line 31
    const/4 v4, 0x6

    .line 32
    aput-object v3, p0, v4

    .line 33
    .line 34
    const/4 v3, 0x7

    .line 35
    aput-object v0, p0, v3

    .line 36
    .line 37
    const/16 v0, 0x8

    .line 38
    .line 39
    aput-object v2, p0, v0

    .line 40
    .line 41
    const/16 v0, 0x9

    .line 42
    .line 43
    aput-object v1, p0, v0

    .line 44
    .line 45
    const/16 v0, 0xa

    .line 46
    .line 47
    aput-object v1, p0, v0

    .line 48
    .line 49
    sget-object v0, La/s710;->a:La/s710;

    .line 50
    .line 51
    const/16 v2, 0xb

    .line 52
    .line 53
    aput-object v0, p0, v2

    .line 54
    .line 55
    const/16 v2, 0xc

    .line 56
    .line 57
    aput-object v0, p0, v2

    .line 58
    .line 59
    const/16 v0, 0xd

    .line 60
    .line 61
    aput-object v1, p0, v0

    .line 62
    .line 63
    const/16 v0, 0xe

    .line 64
    .line 65
    aput-object v1, p0, v0

    .line 66
    .line 67
    const/16 v0, 0xf

    .line 68
    .line 69
    aput-object v1, p0, v0

    .line 70
    .line 71
    const/16 v0, 0x10

    .line 72
    .line 73
    aput-object v1, p0, v0

    .line 74
    .line 75
    return-object p0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 28

    .line 1
    sget-object v0, La/qht0;->descriptor:La/ugi0;

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
    const/4 v4, 0x0

    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    move v8, v3

    .line 15
    move v11, v8

    .line 16
    move v12, v11

    .line 17
    move v13, v12

    .line 18
    move v14, v13

    .line 19
    move/from16 v17, v14

    .line 20
    .line 21
    move/from16 v18, v17

    .line 22
    .line 23
    move/from16 v19, v18

    .line 24
    .line 25
    move/from16 v24, v19

    .line 26
    .line 27
    move/from16 v25, v24

    .line 28
    .line 29
    move/from16 v26, v25

    .line 30
    .line 31
    move/from16 v27, v26

    .line 32
    .line 33
    move-object v9, v4

    .line 34
    move-object v10, v9

    .line 35
    move-object v15, v10

    .line 36
    move-object/from16 v16, v15

    .line 37
    .line 38
    move-wide/from16 v20, v5

    .line 39
    .line 40
    move-wide/from16 v22, v20

    .line 41
    .line 42
    move v5, v2

    .line 43
    :goto_0
    if-eqz v5, :cond_0

    .line 44
    .line 45
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    packed-switch v6, :pswitch_data_0

    .line 50
    .line 51
    .line 52
    invoke-static {v6}, La/itt0;->c(I)V

    .line 53
    .line 54
    .line 55
    return-object v4

    .line 56
    :pswitch_0
    const/16 v6, 0x10

    .line 57
    .line 58
    invoke-interface {v1, v0, v6}, La/bld;->j(La/ugi0;I)I

    .line 59
    .line 60
    .line 61
    move-result v27

    .line 62
    const/high16 v6, 0x10000

    .line 63
    .line 64
    :goto_1
    or-int/2addr v8, v6

    .line 65
    goto :goto_0

    .line 66
    :pswitch_1
    const/16 v6, 0xf

    .line 67
    .line 68
    invoke-interface {v1, v0, v6}, La/bld;->j(La/ugi0;I)I

    .line 69
    .line 70
    .line 71
    move-result v26

    .line 72
    const v6, 0x8000

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :pswitch_2
    const/16 v6, 0xe

    .line 77
    .line 78
    invoke-interface {v1, v0, v6}, La/bld;->j(La/ugi0;I)I

    .line 79
    .line 80
    .line 81
    move-result v25

    .line 82
    or-int/lit16 v8, v8, 0x4000

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :pswitch_3
    const/16 v6, 0xd

    .line 86
    .line 87
    invoke-interface {v1, v0, v6}, La/bld;->j(La/ugi0;I)I

    .line 88
    .line 89
    .line 90
    move-result v24

    .line 91
    or-int/lit16 v8, v8, 0x2000

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :pswitch_4
    const/16 v6, 0xc

    .line 95
    .line 96
    invoke-interface {v1, v0, v6}, La/bld;->r(La/ugi0;I)J

    .line 97
    .line 98
    .line 99
    move-result-wide v22

    .line 100
    or-int/lit16 v8, v8, 0x1000

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_5
    const/16 v6, 0xb

    .line 104
    .line 105
    invoke-interface {v1, v0, v6}, La/bld;->r(La/ugi0;I)J

    .line 106
    .line 107
    .line 108
    move-result-wide v20

    .line 109
    or-int/lit16 v8, v8, 0x800

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :pswitch_6
    const/16 v6, 0xa

    .line 113
    .line 114
    invoke-interface {v1, v0, v6}, La/bld;->j(La/ugi0;I)I

    .line 115
    .line 116
    .line 117
    move-result v19

    .line 118
    or-int/lit16 v8, v8, 0x400

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :pswitch_7
    const/16 v6, 0x9

    .line 122
    .line 123
    invoke-interface {v1, v0, v6}, La/bld;->j(La/ugi0;I)I

    .line 124
    .line 125
    .line 126
    move-result v18

    .line 127
    or-int/lit16 v8, v8, 0x200

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :pswitch_8
    const/16 v6, 0x8

    .line 131
    .line 132
    invoke-interface {v1, v0, v6}, La/bld;->B(La/ugi0;I)Z

    .line 133
    .line 134
    .line 135
    move-result v17

    .line 136
    or-int/lit16 v8, v8, 0x100

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :pswitch_9
    const/4 v6, 0x7

    .line 140
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v16

    .line 144
    or-int/lit16 v8, v8, 0x80

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :pswitch_a
    const/4 v6, 0x6

    .line 148
    sget-object v7, La/wb9;->a:La/wb9;

    .line 149
    .line 150
    invoke-interface {v1, v0, v6, v7, v15}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    move-object v15, v6

    .line 155
    check-cast v15, La/yb9;

    .line 156
    .line 157
    or-int/lit8 v8, v8, 0x40

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :pswitch_b
    const/4 v6, 0x5

    .line 161
    invoke-interface {v1, v0, v6}, La/bld;->B(La/ugi0;I)Z

    .line 162
    .line 163
    .line 164
    move-result v14

    .line 165
    or-int/lit8 v8, v8, 0x20

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :pswitch_c
    const/4 v6, 0x4

    .line 169
    invoke-interface {v1, v0, v6}, La/bld;->B(La/ugi0;I)Z

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    or-int/lit8 v8, v8, 0x10

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :pswitch_d
    const/4 v6, 0x3

    .line 178
    invoke-interface {v1, v0, v6}, La/bld;->B(La/ugi0;I)Z

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    or-int/lit8 v8, v8, 0x8

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :pswitch_e
    const/4 v6, 0x2

    .line 187
    invoke-interface {v1, v0, v6}, La/bld;->j(La/ugi0;I)I

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    or-int/lit8 v8, v8, 0x4

    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :pswitch_f
    invoke-interface {v1, v0, v2}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    or-int/lit8 v8, v8, 0x2

    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :pswitch_10
    invoke-interface {v1, v0, v3}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    or-int/lit8 v8, v8, 0x1

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :pswitch_11
    move v5, v3

    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 215
    .line 216
    .line 217
    new-instance v7, La/sht0;

    .line 218
    .line 219
    invoke-direct/range {v7 .. v27}, La/sht0;-><init>(ILjava/lang/String;Ljava/lang/String;IZZZLa/yb9;Ljava/lang/String;ZIIJJIIII)V

    .line 220
    .line 221
    .line 222
    return-object v7

    .line 223
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
    sget-object p0, La/qht0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, La/sht0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/qht0;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    iget-object v1, p2, La/sht0;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iget-object v1, p2, La/sht0;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    iget v1, p2, La/sht0;->c:I

    .line 26
    .line 27
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    iget-boolean v1, p2, La/sht0;->d:Z

    .line 32
    .line 33
    invoke-interface {p1, p0, v0, v1}, La/cld;->x(La/ugi0;IZ)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x4

    .line 37
    iget-boolean v1, p2, La/sht0;->e:Z

    .line 38
    .line 39
    invoke-interface {p1, p0, v0, v1}, La/cld;->x(La/ugi0;IZ)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x5

    .line 43
    iget-boolean v1, p2, La/sht0;->f:Z

    .line 44
    .line 45
    invoke-interface {p1, p0, v0, v1}, La/cld;->x(La/ugi0;IZ)V

    .line 46
    .line 47
    .line 48
    sget-object v0, La/wb9;->a:La/wb9;

    .line 49
    .line 50
    iget-object v1, p2, La/sht0;->g:La/yb9;

    .line 51
    .line 52
    const/4 v2, 0x6

    .line 53
    invoke-interface {p1, p0, v2, v0, v1}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x7

    .line 57
    iget-object v1, p2, La/sht0;->h:Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/16 v0, 0x8

    .line 63
    .line 64
    iget-boolean v1, p2, La/sht0;->i:Z

    .line 65
    .line 66
    invoke-interface {p1, p0, v0, v1}, La/cld;->x(La/ugi0;IZ)V

    .line 67
    .line 68
    .line 69
    const/16 v0, 0x9

    .line 70
    .line 71
    iget v1, p2, La/sht0;->j:I

    .line 72
    .line 73
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 74
    .line 75
    .line 76
    const/16 v0, 0xa

    .line 77
    .line 78
    iget v1, p2, La/sht0;->k:I

    .line 79
    .line 80
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 81
    .line 82
    .line 83
    const/16 v0, 0xb

    .line 84
    .line 85
    iget-wide v1, p2, La/sht0;->l:J

    .line 86
    .line 87
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 88
    .line 89
    .line 90
    const/16 v0, 0xc

    .line 91
    .line 92
    iget-wide v1, p2, La/sht0;->m:J

    .line 93
    .line 94
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 95
    .line 96
    .line 97
    const/16 v0, 0xd

    .line 98
    .line 99
    iget v1, p2, La/sht0;->n:I

    .line 100
    .line 101
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 102
    .line 103
    .line 104
    const/16 v0, 0xe

    .line 105
    .line 106
    iget v1, p2, La/sht0;->o:I

    .line 107
    .line 108
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 109
    .line 110
    .line 111
    const/16 v0, 0xf

    .line 112
    .line 113
    iget v1, p2, La/sht0;->p:I

    .line 114
    .line 115
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 116
    .line 117
    .line 118
    const/16 v0, 0x10

    .line 119
    .line 120
    iget p2, p2, La/sht0;->q:I

    .line 121
    .line 122
    invoke-interface {p1, v0, p2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method
