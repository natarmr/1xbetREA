.class public final synthetic La/bl1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cl1;

.field public final synthetic c:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/cl1;La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bl1;->a:B

    iput-object p1, p0, La/bl1;->b:La/cl1;

    iput-object p2, p0, La/bl1;->c:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bl1;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, La/bl1;->c:La/l7m0;

    .line 8
    .line 9
    iget-object v0, v0, La/bl1;->b:La/cl1;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/g9z;

    .line 17
    .line 18
    move-object/from16 v13, p2

    .line 19
    .line 20
    check-cast v13, La/fet;

    .line 21
    .line 22
    move-object/from16 v5, p3

    .line 23
    .line 24
    check-cast v5, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    sget-object v6, La/cl1;->o2:La/gfk0;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    and-int/lit8 v1, v5, 0x11

    .line 36
    .line 37
    const/16 v6, 0x10

    .line 38
    .line 39
    if-eq v1, v6, :cond_0

    .line 40
    .line 41
    move v2, v3

    .line 42
    :cond_0
    and-int/lit8 v1, v5, 0x1

    .line 43
    .line 44
    invoke-virtual {v13, v1, v2}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    sget-object v1, La/qmk;->a:La/zcl;

    .line 51
    .line 52
    const/4 v9, 0x0

    .line 53
    const/16 v10, 0xd

    .line 54
    .line 55
    sget-object v5, La/jm40;->b:La/jm40;

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    const/high16 v7, 0x41000000    # 8.0f

    .line 59
    .line 60
    const/4 v8, 0x0

    .line 61
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const v1, 0x7f131848

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, La/el1;

    .line 77
    .line 78
    iget-object v1, v1, La/el1;->a:Ljava/lang/String;

    .line 79
    .line 80
    const-string v2, "\n "

    .line 81
    .line 82
    invoke-static {v0, v2, v1}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    const/4 v14, 0x0

    .line 87
    const/16 v15, 0x3c

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    const/4 v8, 0x0

    .line 91
    const-wide/16 v9, 0x0

    .line 92
    .line 93
    const-wide/16 v11, 0x0

    .line 94
    .line 95
    invoke-static/range {v5 .. v15}, La/kkb;->m(La/mm40;Ljava/lang/String;La/ro8;IJJLa/fet;II)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    invoke-virtual {v13}, La/fet;->X()V

    .line 100
    .line 101
    .line 102
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_0
    move-object/from16 v1, p1

    .line 106
    .line 107
    check-cast v1, La/y5d;

    .line 108
    .line 109
    move-object/from16 v14, p2

    .line 110
    .line 111
    check-cast v14, La/fet;

    .line 112
    .line 113
    move-object/from16 v5, p3

    .line 114
    .line 115
    check-cast v5, Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    sget-object v6, La/cl1;->o2:La/gfk0;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    and-int/lit8 v6, v5, 0x6

    .line 127
    .line 128
    const/4 v7, 0x4

    .line 129
    if-nez v6, :cond_3

    .line 130
    .line 131
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_2

    .line 136
    .line 137
    move v6, v7

    .line 138
    goto :goto_1

    .line 139
    :cond_2
    const/4 v6, 0x2

    .line 140
    :goto_1
    or-int/2addr v5, v6

    .line 141
    :cond_3
    and-int/lit8 v6, v5, 0x13

    .line 142
    .line 143
    const/16 v8, 0x12

    .line 144
    .line 145
    if-eq v6, v8, :cond_4

    .line 146
    .line 147
    move v6, v3

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    move v6, v2

    .line 150
    :goto_2
    and-int/lit8 v8, v5, 0x1

    .line 151
    .line 152
    invoke-virtual {v14, v8, v6}, La/fet;->U(IZ)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-eqz v6, :cond_8

    .line 157
    .line 158
    const/4 v6, 0x3

    .line 159
    invoke-static {v2, v2, v14, v2, v6}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-static {v6, v14}, La/a8k0;->G(La/bch0;La/fet;)La/ak50;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    const/4 v9, 0x0

    .line 168
    sget-object v10, La/jm40;->b:La/jm40;

    .line 169
    .line 170
    invoke-static {v10, v8, v9}, La/cjx;->V(La/mm40;La/vj50;La/yj50;)La/mm40;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    and-int/lit8 v5, v5, 0xe

    .line 175
    .line 176
    if-ne v5, v7, :cond_5

    .line 177
    .line 178
    move v2, v3

    .line 179
    :cond_5
    invoke-virtual {v14, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    or-int/2addr v2, v3

    .line 184
    invoke-virtual {v14, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    or-int/2addr v2, v3

    .line 189
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    if-nez v2, :cond_6

    .line 194
    .line 195
    sget-object v2, La/ukd;->a:La/cl5;

    .line 196
    .line 197
    if-ne v3, v2, :cond_7

    .line 198
    .line 199
    :cond_6
    new-instance v3, La/on;

    .line 200
    .line 201
    const/4 v2, 0x7

    .line 202
    invoke-direct {v3, v4, v1, v0, v2}, La/on;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v14, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_7
    move-object v13, v3

    .line 209
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 210
    .line 211
    const/4 v15, 0x0

    .line 212
    const/16 v16, 0x1fc

    .line 213
    .line 214
    const/4 v7, 0x0

    .line 215
    move-object v5, v8

    .line 216
    const/4 v8, 0x0

    .line 217
    const/4 v9, 0x0

    .line 218
    const/4 v10, 0x0

    .line 219
    const/4 v11, 0x0

    .line 220
    const/4 v12, 0x0

    .line 221
    invoke-static/range {v5 .. v16}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_8
    invoke-virtual {v14}, La/fet;->X()V

    .line 226
    .line 227
    .line 228
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object v0

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
