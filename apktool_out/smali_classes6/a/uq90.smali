.class public final synthetic La/uq90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:La/g9q0;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:La/y9q0;

.field public final synthetic e:La/y9q0;

.field public final synthetic f:La/xcz;

.field public final synthetic g:F

.field public final synthetic h:F

.field public final synthetic i:La/ar90;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(FLa/g9q0;Ljava/lang/String;La/y9q0;La/y9q0;La/xcz;FFLa/ar90;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/uq90;->a:F

    iput-object p2, p0, La/uq90;->b:La/g9q0;

    iput-object p3, p0, La/uq90;->c:Ljava/lang/String;

    iput-object p4, p0, La/uq90;->d:La/y9q0;

    iput-object p5, p0, La/uq90;->e:La/y9q0;

    iput-object p6, p0, La/uq90;->f:La/xcz;

    iput p7, p0, La/uq90;->g:F

    iput p8, p0, La/uq90;->h:F

    iput-object p9, p0, La/uq90;->i:La/ar90;

    iput p10, p0, La/uq90;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/pi9;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 11
    .line 12
    invoke-interface {v2}, La/y99;->d()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    const/16 v4, 0x20

    .line 17
    .line 18
    shr-long/2addr v2, v4

    .line 19
    long-to-int v2, v2

    .line 20
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget v3, v0, La/uq90;->a:F

    .line 25
    .line 26
    const/high16 v5, 0x40000000    # 2.0f

    .line 27
    .line 28
    mul-float v6, v3, v5

    .line 29
    .line 30
    sub-float/2addr v2, v6

    .line 31
    const/4 v6, 0x0

    .line 32
    cmpg-float v7, v2, v6

    .line 33
    .line 34
    if-gez v7, :cond_0

    .line 35
    .line 36
    move v2, v6

    .line 37
    :cond_0
    invoke-static {v2}, La/si30;->b(F)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const/4 v7, 0x0

    .line 42
    const/16 v8, 0xd

    .line 43
    .line 44
    invoke-static {v7, v6, v7, v7, v8}, La/r4e;->b(IIIII)J

    .line 45
    .line 46
    .line 47
    move-result-wide v14

    .line 48
    const/16 v16, 0x0

    .line 49
    .line 50
    const/16 v17, 0x3c8

    .line 51
    .line 52
    iget-object v9, v0, La/uq90;->b:La/g9q0;

    .line 53
    .line 54
    iget-object v10, v0, La/uq90;->c:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v11, v0, La/uq90;->d:La/y9q0;

    .line 57
    .line 58
    const/4 v12, 0x2

    .line 59
    const/4 v13, 0x1

    .line 60
    invoke-static/range {v9 .. v17}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    move-object/from16 v18, v9

    .line 65
    .line 66
    move-object/from16 v19, v10

    .line 67
    .line 68
    iget-wide v9, v6, La/a9q0;->c:J

    .line 69
    .line 70
    invoke-static {v2}, La/si30;->b(F)I

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    invoke-static {v7, v11, v7, v7, v8}, La/r4e;->b(IIIII)J

    .line 75
    .line 76
    .line 77
    move-result-wide v23

    .line 78
    const/16 v25, 0x0

    .line 79
    .line 80
    const/16 v26, 0x3c8

    .line 81
    .line 82
    iget-object v7, v0, La/uq90;->e:La/y9q0;

    .line 83
    .line 84
    const/16 v21, 0x2

    .line 85
    .line 86
    const/16 v22, 0x1

    .line 87
    .line 88
    move-object/from16 v20, v7

    .line 89
    .line 90
    invoke-static/range {v18 .. v26}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    iget-wide v11, v7, La/a9q0;->c:J

    .line 95
    .line 96
    shr-long v13, v9, v4

    .line 97
    .line 98
    long-to-int v8, v13

    .line 99
    int-to-float v8, v8

    .line 100
    invoke-static {v2, v8, v5, v3}, La/rw2;->z(FFFF)F

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    iget-object v13, v1, La/pi9;->a:La/y99;

    .line 105
    .line 106
    invoke-interface {v13}, La/y99;->d()J

    .line 107
    .line 108
    .line 109
    move-result-wide v13

    .line 110
    const-wide v15, 0xffffffffL

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    and-long/2addr v13, v15

    .line 116
    long-to-int v13, v13

    .line 117
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 118
    .line 119
    .line 120
    move-result v13

    .line 121
    and-long/2addr v9, v15

    .line 122
    long-to-int v9, v9

    .line 123
    int-to-float v9, v9

    .line 124
    sub-float/2addr v13, v9

    .line 125
    div-float/2addr v13, v5

    .line 126
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    int-to-long v8, v8

    .line 131
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    int-to-long v13, v10

    .line 136
    shl-long/2addr v8, v4

    .line 137
    and-long/2addr v13, v15

    .line 138
    or-long v21, v8, v13

    .line 139
    .line 140
    shr-long v8, v11, v4

    .line 141
    .line 142
    long-to-int v8, v8

    .line 143
    int-to-float v8, v8

    .line 144
    invoke-static {v2, v8, v5, v3}, La/rw2;->z(FFFF)F

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    iget-object v3, v1, La/pi9;->a:La/y99;

    .line 149
    .line 150
    invoke-interface {v3}, La/y99;->d()J

    .line 151
    .line 152
    .line 153
    move-result-wide v8

    .line 154
    and-long/2addr v8, v15

    .line 155
    long-to-int v3, v8

    .line 156
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    and-long v8, v11, v15

    .line 161
    .line 162
    long-to-int v8, v8

    .line 163
    int-to-float v8, v8

    .line 164
    sub-float/2addr v3, v8

    .line 165
    div-float/2addr v3, v5

    .line 166
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    int-to-long v8, v2

    .line 171
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    int-to-long v2, v2

    .line 176
    shl-long v4, v8, v4

    .line 177
    .line 178
    and-long/2addr v2, v15

    .line 179
    or-long v28, v4, v2

    .line 180
    .line 181
    new-instance v18, La/wq90;

    .line 182
    .line 183
    iget-object v2, v0, La/uq90;->f:La/xcz;

    .line 184
    .line 185
    iget v3, v0, La/uq90;->g:F

    .line 186
    .line 187
    iget v4, v0, La/uq90;->h:F

    .line 188
    .line 189
    iget-object v5, v0, La/uq90;->i:La/ar90;

    .line 190
    .line 191
    iget v0, v0, La/uq90;->j:I

    .line 192
    .line 193
    move/from16 v26, v0

    .line 194
    .line 195
    move-object/from16 v19, v2

    .line 196
    .line 197
    move/from16 v23, v3

    .line 198
    .line 199
    move/from16 v24, v4

    .line 200
    .line 201
    move-object/from16 v25, v5

    .line 202
    .line 203
    move-object/from16 v20, v6

    .line 204
    .line 205
    move-object/from16 v27, v7

    .line 206
    .line 207
    invoke-direct/range {v18 .. v29}, La/wq90;-><init>(La/xcz;La/a9q0;JFFLa/ar90;ILa/a9q0;J)V

    .line 208
    .line 209
    .line 210
    move-object/from16 v0, v18

    .line 211
    .line 212
    invoke-virtual {v1, v0}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    return-object v0
.end method
