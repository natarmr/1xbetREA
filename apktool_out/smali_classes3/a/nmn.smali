.class public final synthetic La/nmn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/omn;


# direct methods
.method public synthetic constructor <init>(La/omn;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nmn;->a:B

    iput-object p1, p0, La/nmn;->b:La/omn;

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
    iget-byte v1, v0, La/nmn;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    sget-object v3, La/jm40;->b:La/jm40;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v0, v0, La/nmn;->b:La/omn;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, La/y5d;

    .line 18
    .line 19
    move-object/from16 v15, p2

    .line 20
    .line 21
    check-cast v15, La/fet;

    .line 22
    .line 23
    move-object/from16 v6, p3

    .line 24
    .line 25
    check-cast v6, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    sget-object v7, La/omn;->p2:La/ddk;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    and-int/lit8 v1, v6, 0x11

    .line 37
    .line 38
    const/16 v7, 0x10

    .line 39
    .line 40
    if-eq v1, v7, :cond_0

    .line 41
    .line 42
    move v1, v5

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v1, v4

    .line 45
    :goto_0
    and-int/2addr v6, v5

    .line 46
    invoke-virtual {v15, v6, v1}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    const/4 v1, 0x3

    .line 53
    invoke-static {v4, v4, v15, v4, v1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-static {v7, v15}, La/a8k0;->G(La/bch0;La/fet;)La/ak50;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const/4 v4, 0x0

    .line 62
    invoke-static {v3, v1, v4}, La/cjx;->V(La/mm40;La/vj50;La/yj50;)La/mm40;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    sget-object v1, La/qmk;->a:La/zcl;

    .line 67
    .line 68
    const/high16 v1, 0x41000000    # 8.0f

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-static {v3, v1, v5}, La/s5x0;->t(FFI)La/lh80;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-virtual {v15, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    if-nez v1, :cond_1

    .line 84
    .line 85
    sget-object v1, La/ukd;->a:La/cl5;

    .line 86
    .line 87
    if-ne v3, v1, :cond_2

    .line 88
    .line 89
    :cond_1
    new-instance v3, La/yhn;

    .line 90
    .line 91
    invoke-direct {v3, v0, v2}, La/yhn;-><init>(Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v15, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    move-object v14, v3

    .line 98
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 99
    .line 100
    const/16 v16, 0x0

    .line 101
    .line 102
    const/16 v17, 0x1f8

    .line 103
    .line 104
    const/4 v9, 0x0

    .line 105
    const/4 v10, 0x0

    .line 106
    const/4 v11, 0x0

    .line 107
    const/4 v12, 0x0

    .line 108
    const/4 v13, 0x0

    .line 109
    invoke-static/range {v6 .. v17}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
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
    check-cast v1, La/y5d;

    .line 122
    .line 123
    move-object/from16 v13, p2

    .line 124
    .line 125
    check-cast v13, La/fet;

    .line 126
    .line 127
    move-object/from16 v6, p3

    .line 128
    .line 129
    check-cast v6, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    sget-object v7, La/omn;->p2:La/ddk;

    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    and-int/lit8 v7, v6, 0x6

    .line 141
    .line 142
    if-nez v7, :cond_5

    .line 143
    .line 144
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-eqz v7, :cond_4

    .line 149
    .line 150
    const/4 v2, 0x4

    .line 151
    :cond_4
    or-int/2addr v6, v2

    .line 152
    :cond_5
    and-int/lit8 v2, v6, 0x13

    .line 153
    .line 154
    const/16 v7, 0x12

    .line 155
    .line 156
    if-eq v2, v7, :cond_6

    .line 157
    .line 158
    move v4, v5

    .line 159
    :cond_6
    and-int/lit8 v2, v6, 0x1

    .line 160
    .line 161
    invoke-virtual {v13, v2, v4}, La/fet;->U(IZ)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_7

    .line 166
    .line 167
    const/high16 v2, 0x3f800000    # 1.0f

    .line 168
    .line 169
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    sget-object v3, La/gqw0;->n:La/xx7;

    .line 174
    .line 175
    invoke-virtual {v1, v2, v3}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    sget-object v1, La/qmk;->a:La/zcl;

    .line 180
    .line 181
    const/4 v10, 0x0

    .line 182
    const/16 v11, 0xd

    .line 183
    .line 184
    const/4 v7, 0x0

    .line 185
    const/high16 v8, 0x41c00000    # 24.0f

    .line 186
    .line 187
    const/4 v9, 0x0

    .line 188
    invoke-static/range {v6 .. v11}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    iget-object v1, v0, La/omn;->l2:La/phf0;

    .line 193
    .line 194
    sget-object v2, La/omn;->q2:[La/iiy;

    .line 195
    .line 196
    aget-object v2, v2, v5

    .line 197
    .line 198
    invoke-virtual {v1, v0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    const/4 v14, 0x0

    .line 203
    const/16 v15, 0x1c

    .line 204
    .line 205
    const-wide/16 v8, 0x0

    .line 206
    .line 207
    const/4 v10, 0x0

    .line 208
    const-wide/16 v11, 0x0

    .line 209
    .line 210
    invoke-static/range {v6 .. v15}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_7
    invoke-virtual {v13}, La/fet;->X()V

    .line 215
    .line 216
    .line 217
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    return-object v0

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
