.class public final synthetic La/cpg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/cpg;->a:B

    iput-boolean p2, p0, La/cpg;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/cpg;->a:B

    .line 2
    .line 3
    sget-object v1, La/ukd;->a:La/cl5;

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    sget-object v5, La/jr8;->a:La/jr8;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    iget-boolean p0, p0, La/cpg;->b:Z

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, La/u63;

    .line 19
    .line 20
    check-cast p2, La/fet;

    .line 21
    .line 22
    check-cast p3, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    and-int/lit8 p1, p3, 0x11

    .line 32
    .line 33
    if-eq p1, v3, :cond_0

    .line 34
    .line 35
    move p1, v6

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move p1, v4

    .line 38
    :goto_0
    and-int/2addr p3, v6

    .line 39
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {v5, v2}, La/jr8;->a(La/mm40;)La/mm40;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p2, p0}, La/fet;->h(Z)Z

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-nez p3, :cond_1

    .line 58
    .line 59
    if-ne v0, v1, :cond_2

    .line 60
    .line 61
    :cond_1
    new-instance v0, La/jno;

    .line 62
    .line 63
    const/4 p3, 0x3

    .line 64
    invoke-direct {v0, p3, p0}, La/jno;-><init>(BZ)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 71
    .line 72
    invoke-static {p1, v0}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {v4, p2, p0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 81
    .line 82
    .line 83
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_0
    check-cast p1, La/u63;

    .line 87
    .line 88
    check-cast p2, La/fet;

    .line 89
    .line 90
    check-cast p3, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result p3

    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    and-int/lit8 p1, p3, 0x11

    .line 100
    .line 101
    if-eq p1, v3, :cond_4

    .line 102
    .line 103
    move p1, v6

    .line 104
    goto :goto_2

    .line 105
    :cond_4
    move p1, v4

    .line 106
    :goto_2
    and-int/2addr p3, v6

    .line 107
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_7

    .line 112
    .line 113
    invoke-virtual {v5, v2}, La/jr8;->a(La/mm40;)La/mm40;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p2, p0}, La/fet;->h(Z)Z

    .line 118
    .line 119
    .line 120
    move-result p3

    .line 121
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-nez p3, :cond_5

    .line 126
    .line 127
    if-ne v0, v1, :cond_6

    .line 128
    .line 129
    :cond_5
    new-instance v0, La/jno;

    .line 130
    .line 131
    const/4 p3, 0x4

    .line 132
    invoke-direct {v0, p3, p0}, La/jno;-><init>(BZ)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_6
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 139
    .line 140
    invoke-static {p1, v0}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {v4, p2, p0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 149
    .line 150
    .line 151
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object p0

    .line 154
    :pswitch_1
    check-cast p1, La/x8z;

    .line 155
    .line 156
    check-cast p2, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    check-cast p3, La/a4x;

    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    check-cast p1, La/p6t0;

    .line 175
    .line 176
    instance-of p1, p1, La/kxs;

    .line 177
    .line 178
    const/4 v0, 0x2

    .line 179
    if-eqz p1, :cond_9

    .line 180
    .line 181
    invoke-static {p3, p0}, La/p7x;->D(La/a4x;Z)Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-eqz p0, :cond_8

    .line 186
    .line 187
    if-eqz p1, :cond_8

    .line 188
    .line 189
    invoke-static {v6}, La/q8x;->e(I)J

    .line 190
    .line 191
    .line 192
    move-result-wide p0

    .line 193
    goto :goto_4

    .line 194
    :cond_8
    invoke-static {v0}, La/q8x;->e(I)J

    .line 195
    .line 196
    .line 197
    move-result-wide p0

    .line 198
    goto :goto_4

    .line 199
    :cond_9
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    check-cast p1, La/p6t0;

    .line 204
    .line 205
    if-eqz p0, :cond_a

    .line 206
    .line 207
    instance-of p0, p1, La/uxx;

    .line 208
    .line 209
    if-eqz p0, :cond_a

    .line 210
    .line 211
    invoke-static {v6}, La/q8x;->e(I)J

    .line 212
    .line 213
    .line 214
    move-result-wide p0

    .line 215
    goto :goto_4

    .line 216
    :cond_a
    invoke-static {v0}, La/q8x;->e(I)J

    .line 217
    .line 218
    .line 219
    move-result-wide p0

    .line 220
    :goto_4
    new-instance p2, La/pgv;

    .line 221
    .line 222
    invoke-direct {p2, p0, p1}, La/pgv;-><init>(J)V

    .line 223
    .line 224
    .line 225
    return-object p2

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
