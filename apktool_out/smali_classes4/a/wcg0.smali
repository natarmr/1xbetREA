.class public final synthetic La/wcg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/lh80;

.field public final synthetic b:La/k6z;

.field public final synthetic c:I

.field public final synthetic d:La/pz40;

.field public final synthetic e:La/mm40;

.field public final synthetic f:La/edg0;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/lh80;La/k6z;ILa/pz40;La/mm40;La/edg0;Lkotlin/jvm/functions/Function1;La/l7m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wcg0;->a:La/lh80;

    iput-object p2, p0, La/wcg0;->b:La/k6z;

    iput p3, p0, La/wcg0;->c:I

    iput-object p4, p0, La/wcg0;->d:La/pz40;

    iput-object p5, p0, La/wcg0;->e:La/mm40;

    iput-object p6, p0, La/wcg0;->f:La/edg0;

    iput-object p7, p0, La/wcg0;->g:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, La/wcg0;->h:La/l7m0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/lr8;

    .line 6
    .line 7
    move-object/from16 v12, p2

    .line 8
    .line 9
    check-cast v12, La/fet;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v3, v2, 0x6

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v3, 0x2

    .line 35
    :goto_0
    or-int/2addr v2, v3

    .line 36
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 37
    .line 38
    const/16 v4, 0x12

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    const/4 v6, 0x0

    .line 42
    if-eq v3, v4, :cond_2

    .line 43
    .line 44
    move v3, v5

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move v3, v6

    .line 47
    :goto_1
    and-int/2addr v2, v5

    .line 48
    invoke-virtual {v12, v2, v3}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_7

    .line 53
    .line 54
    invoke-virtual {v1}, La/lr8;->d()F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-static {v1, v12}, La/pkd;->b(FLa/fet;)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    sget-object v2, La/qmk;->a:La/zcl;

    .line 63
    .line 64
    const/high16 v2, 0x42600000    # 56.0f

    .line 65
    .line 66
    invoke-static {v2, v12}, La/pkd;->b(FLa/fet;)F

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    const/high16 v3, 0x41000000    # 8.0f

    .line 71
    .line 72
    invoke-static {v3, v12}, La/pkd;->b(FLa/fet;)F

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    iget-object v7, v0, La/wcg0;->a:La/lh80;

    .line 77
    .line 78
    iget-object v8, v0, La/wcg0;->b:La/k6z;

    .line 79
    .line 80
    invoke-static {v7, v8}, La/s5x0;->B(La/hh80;La/k6z;)F

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    invoke-static {v9, v12}, La/pkd;->b(FLa/fet;)F

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    const/high16 v10, 0x40000000    # 2.0f

    .line 89
    .line 90
    div-float/2addr v1, v10

    .line 91
    div-float v10, v2, v10

    .line 92
    .line 93
    sub-float/2addr v1, v10

    .line 94
    sub-float/2addr v1, v9

    .line 95
    float-to-int v1, v1

    .line 96
    neg-int v1, v1

    .line 97
    iget v10, v0, La/wcg0;->c:I

    .line 98
    .line 99
    const/4 v11, 0x6

    .line 100
    invoke-static {v10, v1, v12, v11, v6}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 101
    .line 102
    .line 103
    move-result-object v15

    .line 104
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    iget-object v14, v0, La/wcg0;->d:La/pz40;

    .line 107
    .line 108
    invoke-virtual {v12, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    invoke-virtual {v12, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    or-int/2addr v6, v10

    .line 117
    invoke-virtual {v12, v2}, La/fet;->d(F)Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    or-int/2addr v6, v10

    .line 122
    invoke-virtual {v12, v4}, La/fet;->d(F)Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    or-int/2addr v6, v10

    .line 127
    invoke-virtual {v12, v9}, La/fet;->d(F)Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    or-int/2addr v6, v10

    .line 132
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    sget-object v11, La/ukd;->a:La/cl5;

    .line 137
    .line 138
    if-nez v6, :cond_3

    .line 139
    .line 140
    if-ne v10, v11, :cond_4

    .line 141
    .line 142
    :cond_3
    new-instance v13, La/ycg0;

    .line 143
    .line 144
    const/16 v19, 0x0

    .line 145
    .line 146
    const/16 v20, 0x0

    .line 147
    .line 148
    move/from16 v16, v2

    .line 149
    .line 150
    move/from16 v17, v4

    .line 151
    .line 152
    move/from16 v18, v9

    .line 153
    .line 154
    invoke-direct/range {v13 .. v20}, La/ycg0;-><init>(La/l7m0;La/xcz;FFFLa/yje;B)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    move-object v10, v13

    .line 161
    :cond_4
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 162
    .line 163
    invoke-static {v12, v1, v10}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 164
    .line 165
    .line 166
    const-string v1, "ROLLING_CALENDAR_LAZY_ROW"

    .line 167
    .line 168
    iget-object v2, v0, La/wcg0;->e:La/mm40;

    .line 169
    .line 170
    invoke-static {v2, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    new-instance v6, La/qw3;

    .line 175
    .line 176
    new-instance v1, La/jf4;

    .line 177
    .line 178
    const/16 v4, 0xe

    .line 179
    .line 180
    invoke-direct {v1, v4}, La/jf4;-><init>(B)V

    .line 181
    .line 182
    .line 183
    invoke-direct {v6, v3, v5, v1}, La/qw3;-><init>(FZLa/rw3;)V

    .line 184
    .line 185
    .line 186
    iget-object v1, v0, La/wcg0;->h:La/l7m0;

    .line 187
    .line 188
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    check-cast v1, Ljava/lang/Boolean;

    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    invoke-virtual {v12, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    iget-object v3, v0, La/wcg0;->f:La/edg0;

    .line 203
    .line 204
    invoke-virtual {v12, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    or-int/2addr v1, v4

    .line 209
    iget-object v0, v0, La/wcg0;->g:Lkotlin/jvm/functions/Function1;

    .line 210
    .line 211
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    or-int/2addr v1, v4

    .line 216
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    invoke-virtual {v12, v4}, La/fet;->e(I)Z

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    or-int/2addr v1, v4

    .line 225
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    if-nez v1, :cond_5

    .line 230
    .line 231
    if-ne v4, v11, :cond_6

    .line 232
    .line 233
    :cond_5
    new-instance v4, La/enm;

    .line 234
    .line 235
    invoke-direct {v4, v14, v3, v0, v8}, La/enm;-><init>(La/pz40;La/edg0;Lkotlin/jvm/functions/Function1;La/k6z;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    :cond_6
    move-object v11, v4

    .line 242
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 243
    .line 244
    const/4 v13, 0x0

    .line 245
    const/16 v14, 0x1e0

    .line 246
    .line 247
    move-object v4, v7

    .line 248
    const/4 v7, 0x0

    .line 249
    const/4 v8, 0x0

    .line 250
    const/4 v9, 0x0

    .line 251
    const/4 v10, 0x0

    .line 252
    move-object v3, v15

    .line 253
    invoke-static/range {v2 .. v14}, La/b8k0;->f(La/mm40;La/xcz;La/hh80;ZLa/ow3;La/yx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_7
    invoke-virtual {v12}, La/fet;->X()V

    .line 258
    .line 259
    .line 260
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object v0
.end method
