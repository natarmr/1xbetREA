.class public final synthetic La/uao0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rah0;

.field public final synthetic c:La/cpm;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/rah0;La/cpm;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/uao0;->a:B

    iput-object p1, p0, La/uao0;->b:La/rah0;

    iput-object p2, p0, La/uao0;->c:La/cpm;

    iput-object p3, p0, La/uao0;->d:Lkotlin/jvm/functions/Function1;

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
    iget-byte v1, v0, La/uao0;->a:B

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
    iget-object v8, v0, La/uao0;->d:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    iget-object v9, v0, La/uao0;->b:La/rah0;

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/y5d;

    .line 27
    .line 28
    move-object/from16 v14, p2

    .line 29
    .line 30
    check-cast v14, La/fet;

    .line 31
    .line 32
    move-object/from16 v11, p3

    .line 33
    .line 34
    check-cast v11, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v11

    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    and-int/lit8 v1, v11, 0x11

    .line 44
    .line 45
    if-eq v1, v6, :cond_0

    .line 46
    .line 47
    move v1, v7

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v1, v10

    .line 50
    :goto_0
    and-int/lit8 v6, v11, 0x1

    .line 51
    .line 52
    invoke-virtual {v14, v6, v1}, La/fet;->U(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget-object v4, La/qmk;->a:La/zcl;

    .line 63
    .line 64
    const/high16 v4, 0x41000000    # 8.0f

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-static {v1, v5, v4, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v1, v9, v10, v3}, La/wha0;->a0(La/mm40;La/rah0;ZI)La/mm40;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    invoke-virtual {v14, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    if-nez v1, :cond_1

    .line 84
    .line 85
    if-ne v3, v2, :cond_2

    .line 86
    .line 87
    :cond_1
    new-instance v3, La/zbm0;

    .line 88
    .line 89
    const/16 v1, 0x17

    .line 90
    .line 91
    invoke-direct {v3, v8, v1}, La/zbm0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v14, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    move-object v13, v3

    .line 98
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 99
    .line 100
    const/4 v15, 0x0

    .line 101
    const/16 v16, 0x4

    .line 102
    .line 103
    iget-object v12, v0, La/uao0;->c:La/cpm;

    .line 104
    .line 105
    invoke-static/range {v11 .. v16}, La/u1c;->i(La/mm40;La/cpm;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    invoke-virtual {v14}, La/fet;->X()V

    .line 110
    .line 111
    .line 112
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_0
    move-object/from16 v1, p1

    .line 116
    .line 117
    check-cast v1, La/y5d;

    .line 118
    .line 119
    move-object/from16 v14, p2

    .line 120
    .line 121
    check-cast v14, La/fet;

    .line 122
    .line 123
    move-object/from16 v11, p3

    .line 124
    .line 125
    check-cast v11, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    and-int/lit8 v1, v11, 0x11

    .line 135
    .line 136
    if-eq v1, v6, :cond_4

    .line 137
    .line 138
    move v1, v7

    .line 139
    goto :goto_2

    .line 140
    :cond_4
    move v1, v10

    .line 141
    :goto_2
    and-int/lit8 v6, v11, 0x1

    .line 142
    .line 143
    invoke-virtual {v14, v6, v1}, La/fet;->U(IZ)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-eqz v1, :cond_7

    .line 148
    .line 149
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 150
    .line 151
    .line 152
    move-result-object v15

    .line 153
    sget-object v1, La/qmk;->a:La/zcl;

    .line 154
    .line 155
    const/high16 v19, 0x40800000    # 4.0f

    .line 156
    .line 157
    const/16 v20, 0x5

    .line 158
    .line 159
    const/16 v16, 0x0

    .line 160
    .line 161
    const/high16 v17, 0x41000000    # 8.0f

    .line 162
    .line 163
    const/16 v18, 0x0

    .line 164
    .line 165
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-static {v1, v9, v10, v3}, La/wha0;->a0(La/mm40;La/rah0;ZI)La/mm40;

    .line 170
    .line 171
    .line 172
    move-result-object v11

    .line 173
    invoke-virtual {v14, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    if-nez v1, :cond_5

    .line 182
    .line 183
    if-ne v3, v2, :cond_6

    .line 184
    .line 185
    :cond_5
    new-instance v3, La/zbm0;

    .line 186
    .line 187
    const/16 v1, 0x15

    .line 188
    .line 189
    invoke-direct {v3, v8, v1}, La/zbm0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v14, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_6
    move-object v13, v3

    .line 196
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 197
    .line 198
    const/4 v15, 0x0

    .line 199
    const/16 v16, 0x4

    .line 200
    .line 201
    iget-object v12, v0, La/uao0;->c:La/cpm;

    .line 202
    .line 203
    invoke-static/range {v11 .. v16}, La/u1c;->i(La/mm40;La/cpm;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_7
    invoke-virtual {v14}, La/fet;->X()V

    .line 208
    .line 209
    .line 210
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object v0

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
