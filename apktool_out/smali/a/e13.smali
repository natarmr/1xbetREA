.class public final synthetic La/e13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rmb0;

.field public final synthetic c:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/rmb0;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/e13;->a:B

    iput-object p1, p0, La/e13;->b:La/rmb0;

    iput-object p2, p0, La/e13;->c:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/e13;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/e13;->c:La/pz40;

    .line 6
    .line 7
    iget-object p0, p0, La/e13;->b:La/rmb0;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    and-int/lit8 v0, p2, 0x3

    .line 22
    .line 23
    if-eq v0, v1, :cond_0

    .line 24
    .line 25
    move v0, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v2

    .line 28
    :goto_0
    and-int/2addr p2, v4

    .line 29
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_7

    .line 34
    .line 35
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    sget-object v0, La/ukd;->a:La/cl5;

    .line 40
    .line 41
    if-ne p2, v0, :cond_1

    .line 42
    .line 43
    new-instance p2, La/sy2;

    .line 44
    .line 45
    const/4 v1, 0x3

    .line 46
    invoke-direct {p2, v1}, La/sy2;-><init>(B)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    sget-object v1, La/jm40;->b:La/jm40;

    .line 55
    .line 56
    invoke-static {v1, v2, p2}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    if-nez v1, :cond_2

    .line 69
    .line 70
    if-ne v5, v0, :cond_3

    .line 71
    .line 72
    :cond_2
    new-instance v5, La/f13;

    .line 73
    .line 74
    invoke-direct {v5, p0, v4}, La/f13;-><init>(La/rmb0;B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 81
    .line 82
    invoke-static {p2, v5}, La/fre0;->Y(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {p0}, La/rmb0;->getCanCalculatePosition()Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_4

    .line 91
    .line 92
    const/high16 p0, 0x3f800000    # 1.0f

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    const/4 p0, 0x0

    .line 96
    :goto_1
    invoke-static {p2, p0}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 105
    .line 106
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-ne v1, v0, :cond_5

    .line 111
    .line 112
    sget-object v1, La/r71;->d:La/r71;

    .line 113
    .line 114
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_5
    check-cast v1, La/tj30;

    .line 118
    .line 119
    iget-wide v5, p1, La/fet;->T:J

    .line 120
    .line 121
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {p1, p0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, La/fet;->i0()V

    .line 139
    .line 140
    .line 141
    iget-boolean v5, p1, La/fet;->S:Z

    .line 142
    .line 143
    if-eqz v5, :cond_6

    .line 144
    .line 145
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 146
    .line 147
    invoke-virtual {p1, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_6
    invoke-virtual {p1}, La/fet;->r0()V

    .line 152
    .line 153
    .line 154
    :goto_2
    sget-object v5, La/gqw0;->x:La/shd;

    .line 155
    .line 156
    invoke-static {p1, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 157
    .line 158
    .line 159
    sget-object v1, La/gqw0;->w:La/shd;

    .line 160
    .line 161
    invoke-static {p1, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    sget-object v1, La/gqw0;->y:La/shd;

    .line 169
    .line 170
    invoke-static {p1, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 171
    .line 172
    .line 173
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 174
    .line 175
    .line 176
    sget-object v0, La/gqw0;->v:La/shd;

    .line 177
    .line 178
    invoke-static {p1, p0, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 179
    .line 180
    .line 181
    invoke-static {v2, p1, p2, v4}, La/h97;->q(ILa/fet;Lkotlin/jvm/functions/Function2;Z)V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    invoke-virtual {p1}, La/fet;->X()V

    .line 186
    .line 187
    .line 188
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 192
    .line 193
    if-eq v0, v1, :cond_8

    .line 194
    .line 195
    move v2, v4

    .line 196
    :cond_8
    and-int/2addr p2, v4

    .line 197
    invoke-virtual {p1, p2, v2}, La/fet;->U(IZ)Z

    .line 198
    .line 199
    .line 200
    move-result p2

    .line 201
    if-eqz p2, :cond_9

    .line 202
    .line 203
    sget-object p2, La/k13;->b:La/zfn;

    .line 204
    .line 205
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {p2, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    new-instance v0, La/e13;

    .line 212
    .line 213
    invoke-direct {v0, p0, v3, v4}, La/e13;-><init>(La/rmb0;La/pz40;B)V

    .line 214
    .line 215
    .line 216
    const p0, 0x3ceea85c

    .line 217
    .line 218
    .line 219
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    const/16 v0, 0x38

    .line 224
    .line 225
    invoke-static {p2, p0, p1, v0}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_9
    invoke-virtual {p1}, La/fet;->X()V

    .line 230
    .line 231
    .line 232
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
