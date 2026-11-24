.class public final La/czg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bzg0;


# static fields
.field public static final e:La/v0h0;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:La/hz40;

.field public c:La/fzg0;

.field public final d:La/gwg0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/xwg0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, La/xwg0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/awg0;

    .line 8
    .line 9
    const/4 v2, 0x6

    .line 10
    invoke-direct {v1, v2}, La/awg0;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/v0h0;

    .line 14
    .line 15
    invoke-direct {v2, v1, v0}, La/v0h0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 16
    .line 17
    .line 18
    sput-object v2, La/czg0;->e:La/v0h0;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/czg0;->a:Ljava/util/Map;

    .line 5
    .line 6
    sget-object p1, La/u1h0;->a:[J

    .line 7
    .line 8
    new-instance p1, La/hz40;

    .line 9
    .line 10
    invoke-direct {p1}, La/hz40;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/czg0;->b:La/hz40;

    .line 14
    .line 15
    new-instance p1, La/gwg0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, v0}, La/gwg0;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/czg0;->d:La/gwg0;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;La/ugd;La/fet;I)V
    .locals 7

    .line 1
    const v0, 0x1fcd8740

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
    invoke-virtual {p3, p1}, La/fet;->i(Ljava/lang/Object;)Z

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
    invoke-virtual {p3, p2}, La/fet;->i(Ljava/lang/Object;)Z

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
    invoke-virtual {p3, p0}, La/fet;->i(Ljava/lang/Object;)Z

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
    const/4 v3, 0x0

    .line 60
    if-eq v1, v2, :cond_6

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    goto :goto_4

    .line 64
    :cond_6
    move v1, v3

    .line 65
    :goto_4
    and-int/lit8 v2, v0, 0x1

    .line 66
    .line 67
    invoke-virtual {p3, v2, v1}, La/fet;->U(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_c

    .line 72
    .line 73
    invoke-virtual {p3, p1}, La/fet;->h0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sget-object v2, La/ukd;->a:La/cl5;

    .line 81
    .line 82
    if-ne v1, v2, :cond_8

    .line 83
    .line 84
    iget-object v1, p0, La/czg0;->d:La/gwg0;

    .line 85
    .line 86
    invoke-virtual {v1, p1}, La/gwg0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_7

    .line 97
    .line 98
    new-instance v4, La/izg0;

    .line 99
    .line 100
    iget-object v5, p0, La/czg0;->a:Ljava/util/Map;

    .line 101
    .line 102
    invoke-interface {v5, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    check-cast v5, Ljava/util/Map;

    .line 107
    .line 108
    sget-object v6, La/hzg0;->a:La/zfn;

    .line 109
    .line 110
    new-instance v6, La/gzg0;

    .line 111
    .line 112
    invoke-direct {v6, v5, v1}, La/gzg0;-><init>(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V

    .line 113
    .line 114
    .line 115
    invoke-direct {v4, v6}, La/izg0;-><init>(La/gzg0;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    move-object v1, v4

    .line 122
    goto :goto_5

    .line 123
    :cond_7
    const-string p0, "Type of the key "

    .line 124
    .line 125
    const-string p2, " is not supported. On Android you can only use types which can be stored inside the Bundle."

    .line 126
    .line 127
    invoke-static {p1, p0, p2}, La/f140;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_8
    :goto_5
    check-cast v1, La/izg0;

    .line 136
    .line 137
    sget-object v4, La/hzg0;->a:La/zfn;

    .line 138
    .line 139
    invoke-virtual {v4, v1}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    sget-object v5, La/xr00;->a:Landroidx/compose/runtime/d;

    .line 144
    .line 145
    invoke-virtual {v5, v1}, Landroidx/compose/runtime/d;->a(Ljava/lang/Object;)La/l5d0;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    filled-new-array {v4, v5}, [La/l5d0;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    and-int/lit8 v0, v0, 0x70

    .line 154
    .line 155
    const/16 v5, 0x8

    .line 156
    .line 157
    or-int/2addr v0, v5

    .line 158
    invoke-static {v4, p2, p3, v0}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 159
    .line 160
    .line 161
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    invoke-virtual {p3, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    invoke-virtual {p3, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    or-int/2addr v4, v5

    .line 172
    invoke-virtual {p3, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    or-int/2addr v4, v5

    .line 177
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    if-nez v4, :cond_9

    .line 182
    .line 183
    if-ne v5, v2, :cond_a

    .line 184
    .line 185
    :cond_9
    new-instance v5, La/zlb0;

    .line 186
    .line 187
    const/16 v2, 0x16

    .line 188
    .line 189
    invoke-direct {v5, p0, p1, v1, v2}, La/zlb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p3, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 196
    .line 197
    invoke-static {v0, v5, p3}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 198
    .line 199
    .line 200
    iget-boolean v0, p3, La/fet;->y:Z

    .line 201
    .line 202
    if-eqz v0, :cond_b

    .line 203
    .line 204
    iget-object v0, p3, La/fet;->G:La/p9k0;

    .line 205
    .line 206
    iget v0, v0, La/p9k0;->i:I

    .line 207
    .line 208
    iget v1, p3, La/fet;->z:I

    .line 209
    .line 210
    if-ne v0, v1, :cond_b

    .line 211
    .line 212
    const/4 v0, -0x1

    .line 213
    iput v0, p3, La/fet;->z:I

    .line 214
    .line 215
    iput-boolean v3, p3, La/fet;->y:Z

    .line 216
    .line 217
    :cond_b
    invoke-virtual {p3, v3}, La/fet;->r(Z)V

    .line 218
    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_c
    invoke-virtual {p3}, La/fet;->X()V

    .line 222
    .line 223
    .line 224
    :goto_6
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 225
    .line 226
    .line 227
    move-result-object p3

    .line 228
    if-eqz p3, :cond_d

    .line 229
    .line 230
    new-instance v0, La/wbg0;

    .line 231
    .line 232
    const/4 v5, 0x5

    .line 233
    move-object v1, p0

    .line 234
    move-object v2, p1

    .line 235
    move-object v3, p2

    .line 236
    move v4, p4

    .line 237
    invoke-direct/range {v0 .. v5}, La/wbg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 238
    .line 239
    .line 240
    iput-object v0, p3, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 241
    .line 242
    :cond_d
    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/czg0;->b:La/hz40;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/hz40;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, La/czg0;->a:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
