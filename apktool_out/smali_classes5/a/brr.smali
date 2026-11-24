.class public final synthetic La/brr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/trr;


# direct methods
.method public synthetic constructor <init>(La/trr;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/brr;->a:B

    iput-object p1, p0, La/brr;->b:La/trr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/brr;->a:B

    .line 2
    .line 3
    const/16 v1, 0x90

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object p0, p0, La/brr;->b:La/trr;

    .line 12
    .line 13
    check-cast p1, La/y5d;

    .line 14
    .line 15
    check-cast p2, La/mm40;

    .line 16
    .line 17
    check-cast p3, La/fet;

    .line 18
    .line 19
    check-cast p4, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-static {p4, p1, p2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    and-int/lit8 p4, p1, 0x30

    .line 29
    .line 30
    if-nez p4, :cond_1

    .line 31
    .line 32
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p4

    .line 36
    if-eqz p4, :cond_0

    .line 37
    .line 38
    move v2, v3

    .line 39
    :cond_0
    or-int/2addr p1, v2

    .line 40
    :cond_1
    and-int/lit16 p4, p1, 0x91

    .line 41
    .line 42
    if-eq p4, v1, :cond_2

    .line 43
    .line 44
    move p4, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move p4, v5

    .line 47
    :goto_0
    and-int/2addr p1, v4

    .line 48
    invoke-virtual {p3, p1, p4}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    sget-object p1, La/uc9;->c:La/mw3;

    .line 55
    .line 56
    sget-object p4, La/gqw0;->m:La/xx7;

    .line 57
    .line 58
    invoke-static {p1, p4, p3, v5}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-wide v0, p3, La/fet;->T:J

    .line 63
    .line 64
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 65
    .line 66
    .line 67
    move-result p4

    .line 68
    invoke-virtual {p3}, La/fet;->m()La/bh90;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {p3, p2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    sget-object v1, La/mkd;->c0:La/gqw0;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p3}, La/fet;->i0()V

    .line 82
    .line 83
    .line 84
    iget-boolean v1, p3, La/fet;->S:Z

    .line 85
    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    sget-object v1, La/e7z;->u1:La/pcy;

    .line 89
    .line 90
    invoke-virtual {p3, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    invoke-virtual {p3}, La/fet;->r0()V

    .line 95
    .line 96
    .line 97
    :goto_1
    sget-object v1, La/gqw0;->x:La/shd;

    .line 98
    .line 99
    invoke-static {p3, p1, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 100
    .line 101
    .line 102
    sget-object p1, La/gqw0;->w:La/shd;

    .line 103
    .line 104
    invoke-static {p3, v0, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    sget-object p4, La/gqw0;->y:La/shd;

    .line 112
    .line 113
    invoke-static {p3, p1, p4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p3}, La/jpm0;->n(La/fet;)V

    .line 117
    .line 118
    .line 119
    sget-object p1, La/gqw0;->v:La/shd;

    .line 120
    .line 121
    invoke-static {p3, p2, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, La/trr;->e:La/j83;

    .line 125
    .line 126
    const/4 p2, 0x0

    .line 127
    invoke-static {p2, p1, p3, v5, v4}, La/wvb;->y(La/mm40;La/j83;La/fet;II)V

    .line 128
    .line 129
    .line 130
    iget-object p0, p0, La/trr;->f:La/mqr;

    .line 131
    .line 132
    if-nez p0, :cond_4

    .line 133
    .line 134
    const p0, -0x3b462853

    .line 135
    .line 136
    .line 137
    invoke-virtual {p3, p0}, La/fet;->e0(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p3, v5}, La/fet;->r(Z)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_4
    const p1, -0x3b462852    # -1486.74f

    .line 145
    .line 146
    .line 147
    invoke-virtual {p3, p1}, La/fet;->e0(I)V

    .line 148
    .line 149
    .line 150
    new-instance p1, La/jar;

    .line 151
    .line 152
    const/4 p2, 0x6

    .line 153
    invoke-direct {p1, p0, p2}, La/jar;-><init>(Ljava/lang/Object;B)V

    .line 154
    .line 155
    .line 156
    const p0, -0xd2639a8

    .line 157
    .line 158
    .line 159
    invoke-static {p0, p1, p3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p0, p3, p2}, La/kr00;->a(La/ugd;La/fet;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p3, v5}, La/fet;->r(Z)V

    .line 167
    .line 168
    .line 169
    :goto_2
    invoke-virtual {p3, v4}, La/fet;->r(Z)V

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_5
    invoke-virtual {p3}, La/fet;->X()V

    .line 174
    .line 175
    .line 176
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_0
    and-int/lit8 p4, p1, 0x30

    .line 180
    .line 181
    if-nez p4, :cond_7

    .line 182
    .line 183
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result p4

    .line 187
    if-eqz p4, :cond_6

    .line 188
    .line 189
    move v2, v3

    .line 190
    :cond_6
    or-int/2addr p1, v2

    .line 191
    :cond_7
    and-int/lit16 p4, p1, 0x91

    .line 192
    .line 193
    if-eq p4, v1, :cond_8

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_8
    move v4, v5

    .line 197
    :goto_4
    and-int/lit8 p4, p1, 0x1

    .line 198
    .line 199
    invoke-virtual {p3, p4, v4}, La/fet;->U(IZ)Z

    .line 200
    .line 201
    .line 202
    move-result p4

    .line 203
    if-eqz p4, :cond_9

    .line 204
    .line 205
    iget-object p0, p0, La/trr;->a:La/uqr;

    .line 206
    .line 207
    shr-int/lit8 p1, p1, 0x3

    .line 208
    .line 209
    and-int/lit8 p1, p1, 0xe

    .line 210
    .line 211
    invoke-static {p2, p0, p3, p1}, La/dyb;->x(La/mm40;La/uqr;La/fet;I)V

    .line 212
    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_9
    invoke-virtual {p3}, La/fet;->X()V

    .line 216
    .line 217
    .line 218
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
