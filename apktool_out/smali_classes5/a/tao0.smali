.class public final synthetic La/tao0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t3r0;

.field public final synthetic c:La/rah0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/t3r0;La/rah0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/tao0;->a:B

    iput-object p1, p0, La/tao0;->b:La/t3r0;

    iput-object p2, p0, La/tao0;->c:La/rah0;

    iput-object p3, p0, La/tao0;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tao0;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/16 v3, 0xe

    .line 8
    .line 9
    const/high16 v4, 0x3f800000    # 1.0f

    .line 10
    .line 11
    sget-object v5, La/jm40;->b:La/jm40;

    .line 12
    .line 13
    const/16 v6, 0x10

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    iget-object v9, v0, La/tao0;->d:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    iget-object v10, v0, La/tao0;->c:La/rah0;

    .line 20
    .line 21
    iget-object v0, v0, La/tao0;->b:La/t3r0;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/y5d;

    .line 29
    .line 30
    move-object/from16 v15, p2

    .line 31
    .line 32
    check-cast v15, La/fet;

    .line 33
    .line 34
    move-object/from16 v11, p3

    .line 35
    .line 36
    check-cast v11, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v11

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    and-int/lit8 v1, v11, 0x11

    .line 46
    .line 47
    if-eq v1, v6, :cond_0

    .line 48
    .line 49
    move v1, v7

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move v1, v8

    .line 52
    :goto_0
    and-int/lit8 v6, v11, 0x1

    .line 53
    .line 54
    invoke-virtual {v15, v6, v1}, La/fet;->U(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-static {v0, v15}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget-object v1, La/qmk;->a:La/zcl;

    .line 69
    .line 70
    const/high16 v1, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    invoke-static {v0, v4, v1, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0, v10, v8, v3}, La/wha0;->a0(La/mm40;La/rah0;ZI)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    invoke-static {v15}, La/qmk;->a(La/fet;)La/wfn;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget v12, v0, La/wfn;->c:F

    .line 86
    .line 87
    invoke-virtual {v15, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-nez v0, :cond_1

    .line 96
    .line 97
    if-ne v1, v2, :cond_2

    .line 98
    .line 99
    :cond_1
    new-instance v1, La/zbm0;

    .line 100
    .line 101
    const/16 v0, 0x16

    .line 102
    .line 103
    invoke-direct {v1, v9, v0}, La/zbm0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v15, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    move-object v14, v1

    .line 110
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 111
    .line 112
    const/16 v16, 0x0

    .line 113
    .line 114
    invoke-static/range {v11 .. v16}, La/idm0;->f(La/mm40;FLa/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    invoke-virtual {v15}, La/fet;->X()V

    .line 119
    .line 120
    .line 121
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_0
    move-object/from16 v1, p1

    .line 125
    .line 126
    check-cast v1, La/y5d;

    .line 127
    .line 128
    move-object/from16 v15, p2

    .line 129
    .line 130
    check-cast v15, La/fet;

    .line 131
    .line 132
    move-object/from16 v11, p3

    .line 133
    .line 134
    check-cast v11, Ljava/lang/Integer;

    .line 135
    .line 136
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    and-int/lit8 v1, v11, 0x11

    .line 144
    .line 145
    if-eq v1, v6, :cond_4

    .line 146
    .line 147
    move v1, v7

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    move v1, v8

    .line 150
    :goto_2
    and-int/lit8 v6, v11, 0x1

    .line 151
    .line 152
    invoke-virtual {v15, v6, v1}, La/fet;->U(IZ)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_7

    .line 157
    .line 158
    invoke-static {v0, v15}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 163
    .line 164
    .line 165
    move-result-object v16

    .line 166
    sget-object v0, La/qmk;->a:La/zcl;

    .line 167
    .line 168
    const/16 v20, 0x0

    .line 169
    .line 170
    const/16 v21, 0xd

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const/high16 v18, 0x41000000    # 8.0f

    .line 175
    .line 176
    const/16 v19, 0x0

    .line 177
    .line 178
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v0, v10, v8, v3}, La/wha0;->a0(La/mm40;La/rah0;ZI)La/mm40;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    invoke-static {v15}, La/qmk;->a(La/fet;)La/wfn;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget v12, v0, La/wfn;->c:F

    .line 191
    .line 192
    invoke-virtual {v15, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    if-nez v0, :cond_5

    .line 201
    .line 202
    if-ne v1, v2, :cond_6

    .line 203
    .line 204
    :cond_5
    new-instance v1, La/zbm0;

    .line 205
    .line 206
    const/16 v0, 0x14

    .line 207
    .line 208
    invoke-direct {v1, v9, v0}, La/zbm0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v15, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_6
    move-object v14, v1

    .line 215
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 216
    .line 217
    const/16 v16, 0x0

    .line 218
    .line 219
    invoke-static/range {v11 .. v16}, La/idm0;->f(La/mm40;FLa/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_7
    invoke-virtual {v15}, La/fet;->X()V

    .line 224
    .line 225
    .line 226
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object v0

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
