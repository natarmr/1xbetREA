.class public final synthetic La/hpd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kpd;


# direct methods
.method public synthetic constructor <init>(La/kpd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hpd;->a:B

    iput-object p1, p0, La/hpd;->b:La/kpd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/hpd;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    const/16 v3, 0x20

    .line 7
    .line 8
    iget-object p0, p0, La/hpd;->b:La/kpd;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v0, p1

    .line 16
    check-cast v0, La/y5d;

    .line 17
    .line 18
    move-object/from16 v6, p2

    .line 19
    .line 20
    check-cast v6, La/mm40;

    .line 21
    .line 22
    move-object/from16 v12, p3

    .line 23
    .line 24
    check-cast v12, La/fet;

    .line 25
    .line 26
    move-object/from16 v7, p4

    .line 27
    .line 28
    check-cast v7, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-static {v7, v0, v6}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    and-int/lit8 v8, v7, 0x6

    .line 35
    .line 36
    const/4 v13, 0x2

    .line 37
    if-nez v8, :cond_1

    .line 38
    .line 39
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-eqz v8, :cond_0

    .line 44
    .line 45
    const/4 v8, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v8, v13

    .line 48
    :goto_0
    or-int/2addr v8, v7

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v8, v7

    .line 51
    :goto_1
    and-int/lit8 v7, v7, 0x30

    .line 52
    .line 53
    if-nez v7, :cond_3

    .line 54
    .line 55
    invoke-virtual {v12, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eqz v7, :cond_2

    .line 60
    .line 61
    move v2, v3

    .line 62
    :cond_2
    or-int/2addr v8, v2

    .line 63
    :cond_3
    and-int/lit16 v2, v8, 0x93

    .line 64
    .line 65
    const/16 v3, 0x92

    .line 66
    .line 67
    if-eq v2, v3, :cond_4

    .line 68
    .line 69
    move v2, v5

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    move v2, v4

    .line 72
    :goto_2
    and-int/lit8 v3, v8, 0x1

    .line 73
    .line 74
    invoke-virtual {v12, v3, v2}, La/fet;->U(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    sget-object v2, La/qmk;->a:La/zcl;

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    const/16 v11, 0xd

    .line 84
    .line 85
    const/4 v7, 0x0

    .line 86
    const/high16 v8, 0x41000000    # 8.0f

    .line 87
    .line 88
    const/4 v9, 0x0

    .line 89
    invoke-static/range {v6 .. v11}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    const/high16 v3, 0x3f800000    # 1.0f

    .line 94
    .line 95
    invoke-static {v2, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-static {v0, v2}, La/y5d;->c(La/y5d;La/mm40;)La/mm40;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v2, La/ipd;

    .line 104
    .line 105
    invoke-direct {v2, p0, v4}, La/ipd;-><init>(La/kpd;B)V

    .line 106
    .line 107
    .line 108
    const v3, 0x8bd734b

    .line 109
    .line 110
    .line 111
    invoke-static {v3, v2, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    new-instance v3, La/ipd;

    .line 116
    .line 117
    invoke-direct {v3, p0, v5}, La/ipd;-><init>(La/kpd;B)V

    .line 118
    .line 119
    .line 120
    const v6, -0x50b56b4

    .line 121
    .line 122
    .line 123
    invoke-static {v6, v3, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    new-instance v6, La/ipd;

    .line 128
    .line 129
    invoke-direct {v6, p0, v13}, La/ipd;-><init>(La/kpd;B)V

    .line 130
    .line 131
    .line 132
    const p0, -0x12d420b3

    .line 133
    .line 134
    .line 135
    invoke-static {p0, v6, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    new-array v1, v1, [La/xdr;

    .line 140
    .line 141
    aput-object v2, v1, v4

    .line 142
    .line 143
    aput-object v3, v1, v5

    .line 144
    .line 145
    aput-object p0, v1, v13

    .line 146
    .line 147
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {v0, p0, v12}, La/ay3;->m(La/mm40;Ljava/util/List;La/fet;)V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_5
    invoke-virtual {v12}, La/fet;->X()V

    .line 156
    .line 157
    .line 158
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_0
    iget-object p0, p0, La/kpd;->c:La/j83;

    .line 162
    .line 163
    move-object v0, p1

    .line 164
    check-cast v0, La/y5d;

    .line 165
    .line 166
    move-object/from16 v6, p2

    .line 167
    .line 168
    check-cast v6, La/mm40;

    .line 169
    .line 170
    move-object/from16 v7, p3

    .line 171
    .line 172
    check-cast v7, La/fet;

    .line 173
    .line 174
    move-object/from16 v8, p4

    .line 175
    .line 176
    check-cast v8, Ljava/lang/Integer;

    .line 177
    .line 178
    invoke-static {v8, v0, v6}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    and-int/lit8 v8, v0, 0x30

    .line 183
    .line 184
    if-nez v8, :cond_7

    .line 185
    .line 186
    invoke-virtual {v7, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    if-eqz v8, :cond_6

    .line 191
    .line 192
    move v2, v3

    .line 193
    :cond_6
    or-int/2addr v0, v2

    .line 194
    :cond_7
    and-int/lit16 v2, v0, 0x91

    .line 195
    .line 196
    const/16 v3, 0x90

    .line 197
    .line 198
    if-eq v2, v3, :cond_8

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_8
    move v5, v4

    .line 202
    :goto_4
    and-int/lit8 v2, v0, 0x1

    .line 203
    .line 204
    invoke-virtual {v7, v2, v5}, La/fet;->U(IZ)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_a

    .line 209
    .line 210
    iget-object v2, p0, La/j83;->b:Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-lez v2, :cond_9

    .line 217
    .line 218
    const v2, 0x64263611

    .line 219
    .line 220
    .line 221
    invoke-virtual {v7, v2}, La/fet;->e0(I)V

    .line 222
    .line 223
    .line 224
    shr-int/2addr v0, v1

    .line 225
    and-int/lit8 v0, v0, 0xe

    .line 226
    .line 227
    invoke-static {v6, p0, v7, v0}, La/vic;->a(La/mm40;La/j83;La/fet;I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v7, v4}, La/fet;->r(Z)V

    .line 231
    .line 232
    .line 233
    goto :goto_5

    .line 234
    :cond_9
    const p0, 0x6428b07a

    .line 235
    .line 236
    .line 237
    invoke-virtual {v7, p0}, La/fet;->e0(I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v7, v4}, La/fet;->r(Z)V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_a
    invoke-virtual {v7}, La/fet;->X()V

    .line 245
    .line 246
    .line 247
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    return-object p0

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
