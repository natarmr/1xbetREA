.class public final synthetic La/cda;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xcz;

.field public final synthetic c:La/oda;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/xcz;La/oda;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/cda;->a:B

    iput-object p1, p0, La/cda;->b:La/xcz;

    iput-object p2, p0, La/cda;->c:La/oda;

    iput-object p3, p0, La/cda;->d:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cda;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/16 v3, 0xb

    .line 8
    .line 9
    const/high16 v4, 0x40800000    # 4.0f

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    iget-object v6, v0, La/cda;->d:Lkotlin/jvm/functions/Function2;

    .line 13
    .line 14
    iget-object v7, v0, La/cda;->c:La/oda;

    .line 15
    .line 16
    const/high16 v8, 0x3f800000    # 1.0f

    .line 17
    .line 18
    const/4 v9, 0x1

    .line 19
    const/4 v10, 0x0

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    check-cast v1, La/fet;

    .line 26
    .line 27
    move-object/from16 v11, p2

    .line 28
    .line 29
    check-cast v11, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v11

    .line 35
    and-int/lit8 v12, v11, 0x3

    .line 36
    .line 37
    if-eq v12, v5, :cond_0

    .line 38
    .line 39
    move v5, v9

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v5, v10

    .line 42
    :goto_0
    and-int/2addr v11, v9

    .line 43
    invoke-virtual {v1, v11, v5}, La/fet;->U(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    new-instance v5, La/x7z;

    .line 50
    .line 51
    invoke-direct {v5, v8, v9}, La/x7z;-><init>(FZ)V

    .line 52
    .line 53
    .line 54
    invoke-static {v5, v8}, La/o7k0;->c(La/mm40;F)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    sget-object v5, La/qmk;->a:La/zcl;

    .line 59
    .line 60
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 61
    .line 62
    new-instance v14, La/qw3;

    .line 63
    .line 64
    new-instance v8, La/gne;

    .line 65
    .line 66
    invoke-direct {v8, v5, v3}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v14, v4, v10, v8}, La/qw3;-><init>(FZLa/rw3;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-virtual {v1, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    or-int/2addr v3, v4

    .line 81
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-nez v3, :cond_1

    .line 86
    .line 87
    if-ne v4, v2, :cond_2

    .line 88
    .line 89
    :cond_1
    new-instance v4, La/ada;

    .line 90
    .line 91
    invoke-direct {v4, v7, v6, v9}, La/ada;-><init>(La/oda;Lkotlin/jvm/functions/Function2;B)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    move-object/from16 v19, v4

    .line 98
    .line 99
    check-cast v19, Lkotlin/jvm/functions/Function1;

    .line 100
    .line 101
    const/high16 v21, 0xc00000

    .line 102
    .line 103
    const/16 v22, 0x16c

    .line 104
    .line 105
    iget-object v12, v0, La/cda;->b:La/xcz;

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const/4 v15, 0x0

    .line 109
    const/16 v16, 0x0

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const/16 v18, 0x0

    .line 114
    .line 115
    move-object/from16 v20, v1

    .line 116
    .line 117
    invoke-static/range {v11 .. v22}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    move-object/from16 v20, v1

    .line 122
    .line 123
    invoke-virtual/range {v20 .. v20}, La/fet;->X()V

    .line 124
    .line 125
    .line 126
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_0
    move-object/from16 v1, p1

    .line 130
    .line 131
    check-cast v1, La/fet;

    .line 132
    .line 133
    move-object/from16 v11, p2

    .line 134
    .line 135
    check-cast v11, Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    and-int/lit8 v12, v11, 0x3

    .line 142
    .line 143
    if-eq v12, v5, :cond_4

    .line 144
    .line 145
    move v5, v9

    .line 146
    goto :goto_2

    .line 147
    :cond_4
    move v5, v10

    .line 148
    :goto_2
    and-int/2addr v11, v9

    .line 149
    invoke-virtual {v1, v11, v5}, La/fet;->U(IZ)Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_7

    .line 154
    .line 155
    new-instance v5, La/x7z;

    .line 156
    .line 157
    invoke-direct {v5, v8, v9}, La/x7z;-><init>(FZ)V

    .line 158
    .line 159
    .line 160
    invoke-static {v5, v8}, La/o7k0;->c(La/mm40;F)La/mm40;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    sget-object v8, La/qmk;->a:La/zcl;

    .line 165
    .line 166
    sget-object v8, La/gqw0;->k:La/yx7;

    .line 167
    .line 168
    new-instance v9, La/qw3;

    .line 169
    .line 170
    new-instance v11, La/gne;

    .line 171
    .line 172
    invoke-direct {v11, v8, v3}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 173
    .line 174
    .line 175
    invoke-direct {v9, v4, v10, v11}, La/qw3;-><init>(FZLa/rw3;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    invoke-virtual {v1, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    or-int/2addr v3, v4

    .line 187
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    if-nez v3, :cond_5

    .line 192
    .line 193
    if-ne v4, v2, :cond_6

    .line 194
    .line 195
    :cond_5
    new-instance v4, La/ada;

    .line 196
    .line 197
    invoke-direct {v4, v7, v6, v10}, La/ada;-><init>(La/oda;Lkotlin/jvm/functions/Function2;B)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 204
    .line 205
    const/high16 v11, 0xc00000

    .line 206
    .line 207
    const/16 v12, 0x16c

    .line 208
    .line 209
    iget-object v2, v0, La/cda;->b:La/xcz;

    .line 210
    .line 211
    const/4 v3, 0x0

    .line 212
    move-object v10, v1

    .line 213
    move-object v1, v5

    .line 214
    const/4 v5, 0x0

    .line 215
    const/4 v6, 0x0

    .line 216
    const/4 v7, 0x0

    .line 217
    const/4 v8, 0x0

    .line 218
    move-object/from16 v23, v9

    .line 219
    .line 220
    move-object v9, v4

    .line 221
    move-object/from16 v4, v23

    .line 222
    .line 223
    invoke-static/range {v1 .. v12}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_7
    move-object v10, v1

    .line 228
    invoke-virtual {v10}, La/fet;->X()V

    .line 229
    .line 230
    .line 231
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    return-object v0

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
