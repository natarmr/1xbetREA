.class public final synthetic La/eqr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/iqr;


# direct methods
.method public synthetic constructor <init>(La/iqr;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eqr;->a:B

    iput-object p1, p0, La/eqr;->b:La/iqr;

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
    iget-byte v1, v0, La/eqr;->a:B

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    const/high16 v3, 0x40000000    # 2.0f

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/high16 v5, 0x41000000    # 8.0f

    .line 11
    .line 12
    const v6, 0x7f7fffff    # Float.MAX_VALUE

    .line 13
    .line 14
    .line 15
    const-string v7, "invalid weight; must be greater than zero"

    .line 16
    .line 17
    const-wide/16 v8, 0x0

    .line 18
    .line 19
    const/high16 v10, 0x3f800000    # 1.0f

    .line 20
    .line 21
    const/4 v11, 0x2

    .line 22
    iget-object v0, v0, La/eqr;->b:La/iqr;

    .line 23
    .line 24
    const/4 v12, 0x0

    .line 25
    const/4 v13, 0x1

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, La/fet;

    .line 32
    .line 33
    move-object/from16 v14, p2

    .line 34
    .line 35
    check-cast v14, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v14

    .line 41
    and-int/lit8 v15, v14, 0x3

    .line 42
    .line 43
    if-eq v15, v11, :cond_0

    .line 44
    .line 45
    move v15, v13

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v15, v12

    .line 48
    :goto_0
    and-int/2addr v14, v13

    .line 49
    invoke-virtual {v1, v14, v15}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v14

    .line 53
    if-eqz v14, :cond_3

    .line 54
    .line 55
    float-to-double v14, v10

    .line 56
    cmpl-double v8, v14, v8

    .line 57
    .line 58
    if-lez v8, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-static {v7}, La/vcx;->a(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    new-instance v7, La/x7z;

    .line 65
    .line 66
    cmpl-float v8, v10, v6

    .line 67
    .line 68
    if-lez v8, :cond_2

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    move v6, v10

    .line 72
    :goto_2
    invoke-direct {v7, v6, v13}, La/x7z;-><init>(FZ)V

    .line 73
    .line 74
    .line 75
    sget-object v6, La/qmk;->a:La/zcl;

    .line 76
    .line 77
    invoke-static {v7, v5, v4, v11}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v14

    .line 81
    sget-object v15, La/uc9;->e:La/nw3;

    .line 82
    .line 83
    new-instance v4, La/qw3;

    .line 84
    .line 85
    new-instance v5, La/jf4;

    .line 86
    .line 87
    invoke-direct {v5, v2}, La/jf4;-><init>(B)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v4, v3, v13, v5}, La/qw3;-><init>(FZLa/rw3;)V

    .line 91
    .line 92
    .line 93
    new-instance v2, La/gqr;

    .line 94
    .line 95
    invoke-direct {v2, v0, v12}, La/gqr;-><init>(La/iqr;B)V

    .line 96
    .line 97
    .line 98
    const v0, -0xbd1e0ac

    .line 99
    .line 100
    .line 101
    invoke-static {v0, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 102
    .line 103
    .line 104
    move-result-object v20

    .line 105
    const v22, 0x180030

    .line 106
    .line 107
    .line 108
    const/16 v23, 0x38

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    const/16 v18, 0x0

    .line 113
    .line 114
    const/16 v19, 0x0

    .line 115
    .line 116
    move-object/from16 v21, v1

    .line 117
    .line 118
    move-object/from16 v16, v4

    .line 119
    .line 120
    invoke-static/range {v14 .. v23}, La/jwb;->p(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;La/fet;II)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    move-object/from16 v21, v1

    .line 125
    .line 126
    invoke-virtual/range {v21 .. v21}, La/fet;->X()V

    .line 127
    .line 128
    .line 129
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_0
    move-object/from16 v1, p1

    .line 133
    .line 134
    check-cast v1, La/fet;

    .line 135
    .line 136
    move-object/from16 v14, p2

    .line 137
    .line 138
    check-cast v14, Ljava/lang/Integer;

    .line 139
    .line 140
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    and-int/lit8 v15, v14, 0x3

    .line 145
    .line 146
    if-eq v15, v11, :cond_4

    .line 147
    .line 148
    move v12, v13

    .line 149
    :cond_4
    and-int/2addr v14, v13

    .line 150
    invoke-virtual {v1, v14, v12}, La/fet;->U(IZ)Z

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    if-eqz v12, :cond_7

    .line 155
    .line 156
    float-to-double v14, v10

    .line 157
    cmpl-double v8, v14, v8

    .line 158
    .line 159
    if-lez v8, :cond_5

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_5
    invoke-static {v7}, La/vcx;->a(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :goto_4
    new-instance v7, La/x7z;

    .line 166
    .line 167
    cmpl-float v8, v10, v6

    .line 168
    .line 169
    if-lez v8, :cond_6

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_6
    move v6, v10

    .line 173
    :goto_5
    invoke-direct {v7, v6, v13}, La/x7z;-><init>(FZ)V

    .line 174
    .line 175
    .line 176
    sget-object v6, La/qmk;->a:La/zcl;

    .line 177
    .line 178
    invoke-static {v7, v5, v4, v11}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    sget-object v5, La/uc9;->e:La/nw3;

    .line 183
    .line 184
    new-instance v6, La/qw3;

    .line 185
    .line 186
    new-instance v7, La/jf4;

    .line 187
    .line 188
    invoke-direct {v7, v2}, La/jf4;-><init>(B)V

    .line 189
    .line 190
    .line 191
    invoke-direct {v6, v3, v13, v7}, La/qw3;-><init>(FZLa/rw3;)V

    .line 192
    .line 193
    .line 194
    new-instance v2, La/gqr;

    .line 195
    .line 196
    invoke-direct {v2, v0, v13}, La/gqr;-><init>(La/iqr;B)V

    .line 197
    .line 198
    .line 199
    const v0, 0x4045d1dd

    .line 200
    .line 201
    .line 202
    invoke-static {v0, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    const v9, 0x180030

    .line 207
    .line 208
    .line 209
    const/16 v10, 0x38

    .line 210
    .line 211
    move-object v8, v1

    .line 212
    move-object v1, v4

    .line 213
    const/4 v4, 0x0

    .line 214
    move-object v2, v5

    .line 215
    const/4 v5, 0x0

    .line 216
    move-object v3, v6

    .line 217
    const/4 v6, 0x0

    .line 218
    invoke-static/range {v1 .. v10}, La/jwb;->p(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;La/fet;II)V

    .line 219
    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_7
    move-object v8, v1

    .line 223
    invoke-virtual {v8}, La/fet;->X()V

    .line 224
    .line 225
    .line 226
    :goto_6
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
