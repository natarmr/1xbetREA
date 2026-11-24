.class public final synthetic La/yph;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:F

.field public final synthetic d:La/a4x;


# direct methods
.method public synthetic constructor <init>(FIILa/a4x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, La/yph;->a:I

    iput p3, p0, La/yph;->b:I

    iput p1, p0, La/yph;->c:F

    iput-object p4, p0, La/yph;->d:La/a4x;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/fhl;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, La/qmk;->a:La/zcl;

    .line 11
    .line 12
    const/high16 v2, 0x40c00000    # 6.0f

    .line 13
    .line 14
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    new-instance v10, La/vtm0;

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    const/16 v9, 0x1a

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x1

    .line 25
    const/4 v7, 0x0

    .line 26
    move-object v3, v10

    .line 27
    invoke-direct/range {v3 .. v9}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 28
    .line 29
    .line 30
    const/high16 v2, 0x40000000    # 2.0f

    .line 31
    .line 32
    div-float v3, v4, v2

    .line 33
    .line 34
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    int-to-long v5, v5

    .line 39
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    int-to-long v7, v3

    .line 44
    const/16 v3, 0x20

    .line 45
    .line 46
    shl-long/2addr v5, v3

    .line 47
    const-wide v11, 0xffffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long/2addr v7, v11

    .line 53
    or-long/2addr v5, v7

    .line 54
    invoke-interface {v1}, La/fhl;->d()J

    .line 55
    .line 56
    .line 57
    move-result-wide v7

    .line 58
    shr-long/2addr v7, v3

    .line 59
    long-to-int v7, v7

    .line 60
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    sub-float/2addr v7, v4

    .line 65
    invoke-interface {v1}, La/fhl;->d()J

    .line 66
    .line 67
    .line 68
    move-result-wide v8

    .line 69
    and-long/2addr v8, v11

    .line 70
    long-to-int v8, v8

    .line 71
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    sub-float/2addr v8, v4

    .line 76
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    int-to-long v13, v7

    .line 81
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    int-to-long v7, v7

    .line 86
    shl-long/2addr v13, v3

    .line 87
    and-long/2addr v7, v11

    .line 88
    or-long/2addr v7, v13

    .line 89
    iget v12, v0, La/yph;->a:I

    .line 90
    .line 91
    if-gtz v12, :cond_0

    .line 92
    .line 93
    move-object v0, v1

    .line 94
    sget-wide v1, La/iph;->d:J

    .line 95
    .line 96
    const/4 v9, 0x0

    .line 97
    const/16 v11, 0x340

    .line 98
    .line 99
    const/high16 v3, -0x3d4c0000    # -90.0f

    .line 100
    .line 101
    const/high16 v4, 0x43b40000    # 360.0f

    .line 102
    .line 103
    invoke-static/range {v0 .. v11}, La/fhl;->V(La/fhl;JFFJJFLa/agc;I)V

    .line 104
    .line 105
    .line 106
    goto/16 :goto_3

    .line 107
    .line 108
    :cond_0
    move-object/from16 v20, v1

    .line 109
    .line 110
    move-object v1, v0

    .line 111
    move-object/from16 v0, v20

    .line 112
    .line 113
    iget v3, v1, La/yph;->b:I

    .line 114
    .line 115
    const/4 v9, 0x1

    .line 116
    if-le v3, v9, :cond_1

    .line 117
    .line 118
    invoke-static {v7, v8}, La/h7k0;->d(J)F

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    div-float/2addr v4, v9

    .line 123
    const/high16 v9, 0x43340000    # 180.0f

    .line 124
    .line 125
    mul-float/2addr v4, v9

    .line 126
    const v9, 0x40490fdb    # (float)Math.PI

    .line 127
    .line 128
    .line 129
    div-float/2addr v4, v9

    .line 130
    :goto_0
    move v13, v4

    .line 131
    goto :goto_1

    .line 132
    :cond_1
    const/4 v4, 0x0

    .line 133
    goto :goto_0

    .line 134
    :goto_1
    mul-float v14, v13, v2

    .line 135
    .line 136
    iget v15, v1, La/yph;->c:F

    .line 137
    .line 138
    add-float v2, v15, v14

    .line 139
    .line 140
    int-to-float v3, v3

    .line 141
    mul-float/2addr v2, v3

    .line 142
    const/high16 v3, 0x43b40000    # 360.0f

    .line 143
    .line 144
    sub-float v16, v3, v2

    .line 145
    .line 146
    iget-object v1, v1, La/yph;->d:La/a4x;

    .line 147
    .line 148
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v17

    .line 152
    const/high16 v1, -0x3d4c0000    # -90.0f

    .line 153
    .line 154
    const/4 v2, 0x0

    .line 155
    move/from16 v18, v1

    .line 156
    .line 157
    :goto_2
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_4

    .line 162
    .line 163
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    add-int/lit8 v19, v2, 0x1

    .line 168
    .line 169
    if-ltz v2, :cond_3

    .line 170
    .line 171
    check-cast v1, Ljava/lang/Number;

    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-lez v1, :cond_2

    .line 178
    .line 179
    int-to-float v1, v1

    .line 180
    mul-float v1, v1, v16

    .line 181
    .line 182
    int-to-float v3, v12

    .line 183
    div-float v4, v1, v3

    .line 184
    .line 185
    sget-object v1, La/iph;->a:La/i4;

    .line 186
    .line 187
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    rem-int/2addr v2, v3

    .line 192
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    check-cast v1, La/y3d;

    .line 197
    .line 198
    iget-wide v1, v1, La/y3d;->a:J

    .line 199
    .line 200
    add-float v3, v18, v13

    .line 201
    .line 202
    const/4 v9, 0x0

    .line 203
    const/16 v11, 0x340

    .line 204
    .line 205
    invoke-static/range {v0 .. v11}, La/fhl;->V(La/fhl;JFFJJFLa/agc;I)V

    .line 206
    .line 207
    .line 208
    add-float/2addr v4, v14

    .line 209
    add-float/2addr v4, v15

    .line 210
    add-float v4, v4, v18

    .line 211
    .line 212
    move/from16 v18, v4

    .line 213
    .line 214
    :cond_2
    move/from16 v2, v19

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 218
    .line 219
    .line 220
    const/4 v0, 0x0

    .line 221
    throw v0

    .line 222
    :cond_4
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object v0
.end method
