.class public final La/tiv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Z

.field public final synthetic d:F

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;ZFLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/tiv;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/tiv;->b:Ljava/util/List;

    .line 8
    .line 9
    iput-boolean p2, p0, La/tiv;->c:Z

    .line 10
    .line 11
    iput p3, p0, La/tiv;->d:F

    .line 12
    .line 13
    iput-object p4, p0, La/tiv;->e:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/util/List;ZLjava/lang/String;F)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/tiv;->a:B

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/tiv;->b:Ljava/util/List;

    iput-boolean p2, p0, La/tiv;->c:Z

    iput-object p3, p0, La/tiv;->e:Ljava/lang/Object;

    iput p4, p0, La/tiv;->d:F

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tiv;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/tiv;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, v0, La/tiv;->d:F

    .line 8
    .line 9
    iget-boolean v4, v0, La/tiv;->c:Z

    .line 10
    .line 11
    iget-object v0, v0, La/tiv;->b:Ljava/util/List;

    .line 12
    .line 13
    const/16 v5, 0x92

    .line 14
    .line 15
    const/16 v6, 0x10

    .line 16
    .line 17
    const/16 v7, 0x20

    .line 18
    .line 19
    const/4 v8, 0x4

    .line 20
    const/4 v9, 0x1

    .line 21
    const/4 v10, 0x0

    .line 22
    const/4 v11, 0x2

    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/g9z;

    .line 29
    .line 30
    move-object/from16 v12, p2

    .line 31
    .line 32
    check-cast v12, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v12

    .line 38
    move-object/from16 v13, p3

    .line 39
    .line 40
    check-cast v13, La/fet;

    .line 41
    .line 42
    move-object/from16 v14, p4

    .line 43
    .line 44
    check-cast v14, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v14

    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    and-int/lit8 v15, v14, 0x6

    .line 54
    .line 55
    if-nez v15, :cond_1

    .line 56
    .line 57
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v15

    .line 61
    if-eqz v15, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move v8, v11

    .line 65
    :goto_0
    or-int/2addr v8, v14

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v8, v14

    .line 68
    :goto_1
    and-int/lit8 v11, v14, 0x30

    .line 69
    .line 70
    if-nez v11, :cond_3

    .line 71
    .line 72
    invoke-virtual {v13, v12}, La/fet;->e(I)Z

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    if-eqz v11, :cond_2

    .line 77
    .line 78
    move v6, v7

    .line 79
    :cond_2
    or-int/2addr v8, v6

    .line 80
    :cond_3
    and-int/lit16 v6, v8, 0x93

    .line 81
    .line 82
    if-eq v6, v5, :cond_4

    .line 83
    .line 84
    move v5, v9

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    move v5, v10

    .line 87
    :goto_2
    and-int/lit8 v6, v8, 0x1

    .line 88
    .line 89
    invoke-virtual {v13, v6, v5}, La/fet;->U(IZ)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_6

    .line 94
    .line 95
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/e2e0;

    .line 100
    .line 101
    const v5, -0x2bb994ef

    .line 102
    .line 103
    .line 104
    invoke-virtual {v13, v5}, La/fet;->e0(I)V

    .line 105
    .line 106
    .line 107
    if-eqz v4, :cond_5

    .line 108
    .line 109
    invoke-static {v1}, La/g9z;->e(La/g9z;)La/mm40;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    goto :goto_3

    .line 114
    :cond_5
    sget-object v1, La/jm40;->b:La/jm40;

    .line 115
    .line 116
    invoke-static {v1, v3}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    :goto_3
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 121
    .line 122
    invoke-static {v1, v0, v2, v13, v10}, La/n7x;->j(La/mm40;La/e2e0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v13, v10}, La/fet;->r(Z)V

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_6
    invoke-virtual {v13}, La/fet;->X()V

    .line 130
    .line 131
    .line 132
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_0
    move-object/from16 v1, p1

    .line 136
    .line 137
    check-cast v1, La/g9z;

    .line 138
    .line 139
    move-object/from16 v12, p2

    .line 140
    .line 141
    check-cast v12, Ljava/lang/Number;

    .line 142
    .line 143
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    move-object/from16 v13, p3

    .line 148
    .line 149
    check-cast v13, La/fet;

    .line 150
    .line 151
    move-object/from16 v14, p4

    .line 152
    .line 153
    check-cast v14, Ljava/lang/Number;

    .line 154
    .line 155
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    and-int/lit8 v15, v14, 0x6

    .line 160
    .line 161
    if-nez v15, :cond_8

    .line 162
    .line 163
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_7

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_7
    move v8, v11

    .line 171
    :goto_5
    or-int v1, v14, v8

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_8
    move v1, v14

    .line 175
    :goto_6
    and-int/lit8 v8, v14, 0x30

    .line 176
    .line 177
    if-nez v8, :cond_a

    .line 178
    .line 179
    invoke-virtual {v13, v12}, La/fet;->e(I)Z

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    if-eqz v8, :cond_9

    .line 184
    .line 185
    move v6, v7

    .line 186
    :cond_9
    or-int/2addr v1, v6

    .line 187
    :cond_a
    and-int/lit16 v6, v1, 0x93

    .line 188
    .line 189
    if-eq v6, v5, :cond_b

    .line 190
    .line 191
    move v5, v9

    .line 192
    goto :goto_7

    .line 193
    :cond_b
    move v5, v10

    .line 194
    :goto_7
    and-int/2addr v1, v9

    .line 195
    invoke-virtual {v13, v1, v5}, La/fet;->U(IZ)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_d

    .line 200
    .line 201
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, La/djv;

    .line 206
    .line 207
    const v1, 0x366a07b3

    .line 208
    .line 209
    .line 210
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 211
    .line 212
    .line 213
    iget-object v14, v0, La/djv;->a:Ljava/lang/String;

    .line 214
    .line 215
    if-eqz v4, :cond_c

    .line 216
    .line 217
    check-cast v2, Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v14, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_c

    .line 224
    .line 225
    move v15, v9

    .line 226
    goto :goto_8

    .line 227
    :cond_c
    move v15, v10

    .line 228
    :goto_8
    new-instance v1, La/qp8;

    .line 229
    .line 230
    invoke-direct {v1, v3, v0, v11}, La/qp8;-><init>(FLjava/lang/Object;B)V

    .line 231
    .line 232
    .line 233
    const v0, 0x50b192b5

    .line 234
    .line 235
    .line 236
    invoke-static {v0, v1, v13}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 237
    .line 238
    .line 239
    move-result-object v16

    .line 240
    const/16 v18, 0xc00

    .line 241
    .line 242
    move-object/from16 v17, v13

    .line 243
    .line 244
    const/4 v13, 0x0

    .line 245
    invoke-static/range {v13 .. v18}, La/acb;->B(La/mm40;Ljava/lang/String;ZLa/ugd;La/fet;I)V

    .line 246
    .line 247
    .line 248
    move-object/from16 v0, v17

    .line 249
    .line 250
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 251
    .line 252
    .line 253
    goto :goto_9

    .line 254
    :cond_d
    move-object v0, v13

    .line 255
    invoke-virtual {v0}, La/fet;->X()V

    .line 256
    .line 257
    .line 258
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
