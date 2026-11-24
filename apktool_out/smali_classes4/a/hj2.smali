.class public final synthetic La/hj2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/xcz;

.field public final synthetic d:La/tce;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/xcz;La/tce;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/hj2;->a:B

    iput-object p1, p0, La/hj2;->b:La/mm40;

    iput-object p2, p0, La/hj2;->c:La/xcz;

    iput-object p3, p0, La/hj2;->d:La/tce;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hj2;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    iget-object v4, v0, La/hj2;->d:La/tce;

    .line 10
    .line 11
    iget-object v5, v0, La/hj2;->b:La/mm40;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x1

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, La/ir8;

    .line 22
    .line 23
    move-object/from16 v9, p2

    .line 24
    .line 25
    check-cast v9, La/fet;

    .line 26
    .line 27
    move-object/from16 v10, p3

    .line 28
    .line 29
    check-cast v10, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    and-int/lit8 v1, v10, 0x11

    .line 39
    .line 40
    if-eq v1, v3, :cond_0

    .line 41
    .line 42
    move v7, v8

    .line 43
    :cond_0
    and-int/lit8 v1, v10, 0x1

    .line 44
    .line 45
    invoke-virtual {v9, v1, v7}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 52
    .line 53
    invoke-interface {v5, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iget v3, v3, La/wfn;->c:F

    .line 62
    .line 63
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    iget v5, v5, La/wfn;->c:F

    .line 68
    .line 69
    const/16 v7, 0xa

    .line 70
    .line 71
    invoke-static {v3, v6, v5, v6, v7}, La/s5x0;->u(FFFFI)La/lh80;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {v3, v9}, La/knm0;->g(La/hh80;La/fet;)La/ch80;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    sget-object v12, La/uc9;->e:La/nw3;

    .line 80
    .line 81
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    if-nez v3, :cond_1

    .line 90
    .line 91
    if-ne v5, v2, :cond_2

    .line 92
    .line 93
    :cond_1
    new-instance v5, La/fj2;

    .line 94
    .line 95
    invoke-direct {v5, v4, v8}, La/fj2;-><init>(La/tce;B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v9, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    move-object/from16 v17, v5

    .line 102
    .line 103
    check-cast v17, Lkotlin/jvm/functions/Function1;

    .line 104
    .line 105
    const/16 v19, 0x6000

    .line 106
    .line 107
    const/16 v20, 0x1e8

    .line 108
    .line 109
    iget-object v10, v0, La/hj2;->c:La/xcz;

    .line 110
    .line 111
    const/4 v13, 0x0

    .line 112
    const/4 v14, 0x0

    .line 113
    const/4 v15, 0x0

    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    move-object/from16 v18, v9

    .line 117
    .line 118
    move-object v9, v1

    .line 119
    invoke-static/range {v9 .. v20}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_3
    move-object/from16 v18, v9

    .line 124
    .line 125
    invoke-virtual/range {v18 .. v18}, La/fet;->X()V

    .line 126
    .line 127
    .line 128
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object v0

    .line 131
    :pswitch_0
    move-object/from16 v1, p1

    .line 132
    .line 133
    check-cast v1, La/ir8;

    .line 134
    .line 135
    move-object/from16 v9, p2

    .line 136
    .line 137
    check-cast v9, La/fet;

    .line 138
    .line 139
    move-object/from16 v10, p3

    .line 140
    .line 141
    check-cast v10, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    and-int/lit8 v1, v10, 0x11

    .line 151
    .line 152
    if-eq v1, v3, :cond_4

    .line 153
    .line 154
    move v1, v8

    .line 155
    goto :goto_1

    .line 156
    :cond_4
    move v1, v7

    .line 157
    :goto_1
    and-int/lit8 v3, v10, 0x1

    .line 158
    .line 159
    invoke-virtual {v9, v3, v1}, La/fet;->U(IZ)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_7

    .line 164
    .line 165
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 166
    .line 167
    invoke-interface {v5, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    sget-object v3, La/qmk;->a:La/zcl;

    .line 172
    .line 173
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    iget v3, v3, La/wfn;->d:F

    .line 178
    .line 179
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    iget v5, v5, La/wfn;->d:F

    .line 184
    .line 185
    const/4 v8, 0x2

    .line 186
    const/high16 v10, 0x41c00000    # 24.0f

    .line 187
    .line 188
    invoke-static {v3, v6, v5, v10, v8}, La/s5x0;->u(FFFFI)La/lh80;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    sget-object v12, La/uc9;->e:La/nw3;

    .line 193
    .line 194
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    if-nez v3, :cond_5

    .line 203
    .line 204
    if-ne v5, v2, :cond_6

    .line 205
    .line 206
    :cond_5
    new-instance v5, La/fj2;

    .line 207
    .line 208
    invoke-direct {v5, v4, v7}, La/fj2;-><init>(La/tce;B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_6
    move-object/from16 v17, v5

    .line 215
    .line 216
    check-cast v17, Lkotlin/jvm/functions/Function1;

    .line 217
    .line 218
    const/16 v19, 0x6000

    .line 219
    .line 220
    const/16 v20, 0x1e8

    .line 221
    .line 222
    iget-object v10, v0, La/hj2;->c:La/xcz;

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    const/16 v16, 0x0

    .line 228
    .line 229
    move-object/from16 v18, v9

    .line 230
    .line 231
    move-object v9, v1

    .line 232
    invoke-static/range {v9 .. v20}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_7
    move-object/from16 v18, v9

    .line 237
    .line 238
    invoke-virtual/range {v18 .. v18}, La/fet;->X()V

    .line 239
    .line 240
    .line 241
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    return-object v0

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
