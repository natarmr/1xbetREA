.class public abstract La/x4n0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/y2m0;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/y2m0;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, La/y2m0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/x4n0;->a:La/y2m0;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/x4n0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(La/mm40;Lkotlin/jvm/functions/Function2;La/fet;II)V
    .locals 8

    .line 1
    const v0, -0x4d634bd0    # -1.824273E-8f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    or-int/lit8 v1, p3, 0x6

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    and-int/lit8 v1, p3, 0x6

    .line 15
    .line 16
    if-nez v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v1, 0x2

    .line 27
    :goto_0
    or-int/2addr v1, p3

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    move v1, p3

    .line 30
    :goto_1
    and-int/lit8 v2, p3, 0x30

    .line 31
    .line 32
    if-nez v2, :cond_4

    .line 33
    .line 34
    invoke-virtual {p2, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    const/16 v2, 0x20

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_3
    const/16 v2, 0x10

    .line 44
    .line 45
    :goto_2
    or-int/2addr v1, v2

    .line 46
    :cond_4
    and-int/lit8 v2, v1, 0x13

    .line 47
    .line 48
    const/16 v3, 0x12

    .line 49
    .line 50
    if-eq v2, v3, :cond_5

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    goto :goto_3

    .line 54
    :cond_5
    const/4 v2, 0x0

    .line 55
    :goto_3
    and-int/lit8 v3, v1, 0x1

    .line 56
    .line 57
    invoke-virtual {p2, v3, v2}, La/fet;->U(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_8

    .line 62
    .line 63
    if-eqz v0, :cond_6

    .line 64
    .line 65
    sget-object p0, La/jm40;->b:La/jm40;

    .line 66
    .line 67
    :cond_6
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sget-object v2, La/ukd;->a:La/cl5;

    .line 72
    .line 73
    if-ne v0, v2, :cond_7

    .line 74
    .line 75
    new-instance v0, La/b5n0;

    .line 76
    .line 77
    sget-object v2, La/gqw0;->v1:La/gqw0;

    .line 78
    .line 79
    invoke-direct {v0, v2}, La/b5n0;-><init>(La/e5n0;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_7
    check-cast v0, La/b5n0;

    .line 86
    .line 87
    shl-int/lit8 v1, v1, 0x3

    .line 88
    .line 89
    and-int/lit16 v1, v1, 0x3f0

    .line 90
    .line 91
    invoke-static {v0, p0, p1, p2, v1}, La/x4n0;->b(La/b5n0;La/mm40;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 92
    .line 93
    .line 94
    :goto_4
    move-object v3, p0

    .line 95
    goto :goto_5

    .line 96
    :cond_8
    invoke-virtual {p2}, La/fet;->X()V

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :goto_5
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-eqz p0, :cond_9

    .line 105
    .line 106
    new-instance v2, La/yzx;

    .line 107
    .line 108
    const/16 v7, 0xa

    .line 109
    .line 110
    move-object v4, p1

    .line 111
    move v5, p3

    .line 112
    move v6, p4

    .line 113
    invoke-direct/range {v2 .. v7}, La/yzx;-><init>(La/mm40;Ljava/lang/Object;IIB)V

    .line 114
    .line 115
    .line 116
    iput-object v2, p0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 117
    .line 118
    :cond_9
    return-void
.end method

.method public static final b(La/b5n0;La/mm40;Lkotlin/jvm/functions/Function2;La/fet;I)V
    .locals 7

    .line 1
    const v0, -0x1e845847

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p3, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p4

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p4

    .line 23
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 40
    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    invoke-virtual {p3, p2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    const/16 v1, 0x100

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    const/16 v1, 0x80

    .line 53
    .line 54
    :goto_3
    or-int/2addr v0, v1

    .line 55
    :cond_5
    and-int/lit16 v1, v0, 0x93

    .line 56
    .line 57
    const/16 v2, 0x92

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    const/4 v4, 0x0

    .line 61
    if-eq v1, v2, :cond_6

    .line 62
    .line 63
    move v1, v3

    .line 64
    goto :goto_4

    .line 65
    :cond_6
    move v1, v4

    .line 66
    :goto_4
    and-int/2addr v0, v3

    .line 67
    invoke-virtual {p3, v0, v1}, La/fet;->U(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_b

    .line 72
    .line 73
    iget-wide v0, p3, La/fet;->T:J

    .line 74
    .line 75
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {p3}, La/e3c;->G(La/fet;)Landroidx/compose/runtime/a;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {p3, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {p3}, La/fet;->m()La/bh90;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {p3}, La/fet;->i0()V

    .line 92
    .line 93
    .line 94
    iget-boolean v6, p3, La/fet;->S:Z

    .line 95
    .line 96
    if-eqz v6, :cond_7

    .line 97
    .line 98
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 99
    .line 100
    invoke-virtual {p3, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 101
    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_7
    invoke-virtual {p3}, La/fet;->r0()V

    .line 105
    .line 106
    .line 107
    :goto_5
    iget-object v6, p0, La/b5n0;->c:La/y4n0;

    .line 108
    .line 109
    invoke-static {p3, p0, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    iget-object v6, p0, La/b5n0;->d:La/y4n0;

    .line 113
    .line 114
    invoke-static {p3, v1, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, La/b5n0;->e:La/y4n0;

    .line 118
    .line 119
    invoke-static {p3, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 120
    .line 121
    .line 122
    sget-object v1, La/mkd;->c0:La/gqw0;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    sget-object v1, La/gqw0;->w:La/shd;

    .line 128
    .line 129
    invoke-static {p3, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 130
    .line 131
    .line 132
    invoke-static {p3}, La/jpm0;->n(La/fet;)V

    .line 133
    .line 134
    .line 135
    sget-object v1, La/gqw0;->v:La/shd;

    .line 136
    .line 137
    invoke-static {p3, v2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    sget-object v1, La/gqw0;->y:La/shd;

    .line 145
    .line 146
    invoke-static {p3, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p3, v3}, La/fet;->r(Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p3}, La/fet;->D()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-nez v0, :cond_a

    .line 157
    .line 158
    const v0, -0x4b0e9154

    .line 159
    .line 160
    .line 161
    invoke-virtual {p3, v0}, La/fet;->e0(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p3, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    if-nez v0, :cond_8

    .line 173
    .line 174
    sget-object v0, La/ukd;->a:La/cl5;

    .line 175
    .line 176
    if-ne v1, v0, :cond_9

    .line 177
    .line 178
    :cond_8
    new-instance v1, La/jfm0;

    .line 179
    .line 180
    const/16 v0, 0x8

    .line 181
    .line 182
    invoke-direct {v1, p0, v0}, La/jfm0;-><init>(Ljava/lang/Object;B)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p3, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_9
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 189
    .line 190
    invoke-static {v1, p3}, La/m0x0;->D(Lkotlin/jvm/functions/Function0;La/fet;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p3, v4}, La/fet;->r(Z)V

    .line 194
    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_a
    const v0, -0x4b0dac57

    .line 198
    .line 199
    .line 200
    invoke-virtual {p3, v0}, La/fet;->e0(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p3, v4}, La/fet;->r(Z)V

    .line 204
    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_b
    invoke-virtual {p3}, La/fet;->X()V

    .line 208
    .line 209
    .line 210
    :goto_6
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 211
    .line 212
    .line 213
    move-result-object p3

    .line 214
    if-eqz p3, :cond_c

    .line 215
    .line 216
    new-instance v0, La/s0n0;

    .line 217
    .line 218
    invoke-direct {v0, p0, p1, p2, p4}, La/s0n0;-><init>(La/b5n0;La/mm40;Lkotlin/jvm/functions/Function2;I)V

    .line 219
    .line 220
    .line 221
    iput-object v0, p3, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 222
    .line 223
    :cond_c
    return-void
.end method
