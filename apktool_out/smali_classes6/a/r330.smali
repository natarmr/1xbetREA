.class public final synthetic La/r330;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/v330;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/v330;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r330;->a:B

    iput-object p1, p0, La/r330;->b:La/l7m0;

    iput-object p2, p0, La/r330;->c:La/v330;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/r330;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/16 v3, 0x12

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x4

    .line 11
    iget-object v6, v0, La/r330;->c:La/v330;

    .line 12
    .line 13
    iget-object v0, v0, La/r330;->b:La/l7m0;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v9, p1

    .line 21
    .line 22
    check-cast v9, La/mm40;

    .line 23
    .line 24
    move-object/from16 v15, p2

    .line 25
    .line 26
    check-cast v15, La/fet;

    .line 27
    .line 28
    move-object/from16 v1, p3

    .line 29
    .line 30
    check-cast v1, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sget-object v10, La/v330;->Q1:La/xuz;

    .line 37
    .line 38
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    and-int/lit8 v10, v1, 0x6

    .line 42
    .line 43
    if-nez v10, :cond_1

    .line 44
    .line 45
    invoke-virtual {v15, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    if-eqz v10, :cond_0

    .line 50
    .line 51
    move v4, v5

    .line 52
    :cond_0
    or-int/2addr v1, v4

    .line 53
    :cond_1
    and-int/lit8 v4, v1, 0x13

    .line 54
    .line 55
    if-eq v4, v3, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move v8, v7

    .line 59
    :goto_0
    and-int/lit8 v3, v1, 0x1

    .line 60
    .line 61
    invoke-virtual {v15, v3, v8}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_5

    .line 66
    .line 67
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v10, v0

    .line 72
    check-cast v10, La/mtl;

    .line 73
    .line 74
    sget-object v11, La/ma80;->b:La/ma80;

    .line 75
    .line 76
    invoke-virtual {v15, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-nez v0, :cond_3

    .line 85
    .line 86
    if-ne v3, v2, :cond_4

    .line 87
    .line 88
    :cond_3
    new-instance v3, La/s330;

    .line 89
    .line 90
    invoke-direct {v3, v6, v7}, La/s330;-><init>(La/v330;B)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v15, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    move-object v14, v3

    .line 97
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 98
    .line 99
    and-int/lit8 v0, v1, 0xe

    .line 100
    .line 101
    or-int/lit16 v0, v0, 0x180

    .line 102
    .line 103
    const/16 v17, 0x18

    .line 104
    .line 105
    const/4 v12, 0x0

    .line 106
    const/4 v13, 0x0

    .line 107
    move/from16 v16, v0

    .line 108
    .line 109
    invoke-static/range {v9 .. v17}, La/bkb;->f(La/mm40;La/mtl;La/ma80;ZLa/hh80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    invoke-virtual {v15}, La/fet;->X()V

    .line 114
    .line 115
    .line 116
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_0
    move-object/from16 v1, p1

    .line 120
    .line 121
    check-cast v1, La/mm40;

    .line 122
    .line 123
    move-object/from16 v13, p2

    .line 124
    .line 125
    check-cast v13, La/fet;

    .line 126
    .line 127
    move-object/from16 v9, p3

    .line 128
    .line 129
    check-cast v9, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    sget-object v10, La/v330;->Q1:La/xuz;

    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    and-int/lit8 v10, v9, 0x6

    .line 141
    .line 142
    if-nez v10, :cond_7

    .line 143
    .line 144
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    if-eqz v10, :cond_6

    .line 149
    .line 150
    move v4, v5

    .line 151
    :cond_6
    or-int/2addr v9, v4

    .line 152
    :cond_7
    and-int/lit8 v4, v9, 0x13

    .line 153
    .line 154
    if-eq v4, v3, :cond_8

    .line 155
    .line 156
    move v7, v8

    .line 157
    :cond_8
    and-int/lit8 v3, v9, 0x1

    .line 158
    .line 159
    invoke-virtual {v13, v3, v7}, La/fet;->U(IZ)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_d

    .line 164
    .line 165
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, La/imm;

    .line 170
    .line 171
    invoke-virtual {v13, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    if-nez v3, :cond_9

    .line 180
    .line 181
    if-ne v4, v2, :cond_a

    .line 182
    .line 183
    :cond_9
    new-instance v4, La/q330;

    .line 184
    .line 185
    invoke-direct {v4, v6, v8}, La/q330;-><init>(La/v330;B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 192
    .line 193
    invoke-virtual {v13, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    if-nez v3, :cond_b

    .line 202
    .line 203
    if-ne v5, v2, :cond_c

    .line 204
    .line 205
    :cond_b
    new-instance v5, La/s330;

    .line 206
    .line 207
    invoke-direct {v5, v6, v8}, La/s330;-><init>(La/v330;B)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v13, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    :cond_c
    move-object v6, v5

    .line 214
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 215
    .line 216
    and-int/lit8 v14, v9, 0xe

    .line 217
    .line 218
    const/4 v15, 0x0

    .line 219
    const/16 v16, 0xfd4

    .line 220
    .line 221
    const/4 v3, 0x0

    .line 222
    const/4 v5, 0x0

    .line 223
    const/4 v7, 0x0

    .line 224
    const/4 v8, 0x0

    .line 225
    const/4 v9, 0x0

    .line 226
    const/4 v10, 0x0

    .line 227
    const/4 v11, 0x0

    .line 228
    const/4 v12, 0x0

    .line 229
    move-object v2, v0

    .line 230
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 231
    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_d
    invoke-virtual {v13}, La/fet;->X()V

    .line 235
    .line 236
    .line 237
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object v0

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
