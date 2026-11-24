.class public final La/zp8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/xpj0;

.field public final synthetic b:Lkotlin/jvm/functions/Function2;

.field public final synthetic c:La/ugd;

.field public final synthetic d:La/vne;

.field public final synthetic e:Z


# direct methods
.method public constructor <init>(La/xpj0;Lkotlin/jvm/functions/Function2;La/ugd;La/vne;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zp8;->a:La/xpj0;

    .line 5
    .line 6
    iput-object p2, p0, La/zp8;->b:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    iput-object p3, p0, La/zp8;->c:La/ugd;

    .line 9
    .line 10
    iput-object p4, p0, La/zp8;->d:La/vne;

    .line 11
    .line 12
    iput-boolean p5, p0, La/zp8;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, La/fet;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v3

    .line 19
    :goto_0
    and-int/2addr p2, v2

    .line 20
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_5

    .line 25
    .line 26
    sget-object p2, La/jm40;->b:La/jm40;

    .line 27
    .line 28
    const/high16 v0, 0x3f800000    # 1.0f

    .line 29
    .line 30
    invoke-static {p2, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    new-instance v0, La/pp8;

    .line 35
    .line 36
    iget-object v1, p0, La/zp8;->a:La/xpj0;

    .line 37
    .line 38
    invoke-direct {v0, v1, v3}, La/pp8;-><init>(La/xpj0;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p2, v0}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    sget-object v0, La/uc9;->c:La/mw3;

    .line 46
    .line 47
    sget-object v1, La/gqw0;->m:La/xx7;

    .line 48
    .line 49
    invoke-static {v0, v1, p1, v3}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {p1}, La/e3c;->x(La/fet;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-static {p1, p2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, La/fet;->i0()V

    .line 71
    .line 72
    .line 73
    iget-boolean v5, p1, La/fet;->S:Z

    .line 74
    .line 75
    if-eqz v5, :cond_1

    .line 76
    .line 77
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 78
    .line 79
    invoke-virtual {p1, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {p1}, La/fet;->r0()V

    .line 84
    .line 85
    .line 86
    :goto_1
    sget-object v5, La/gqw0;->x:La/shd;

    .line 87
    .line 88
    invoke-static {p1, v0, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, La/gqw0;->w:La/shd;

    .line 92
    .line 93
    invoke-static {p1, v4, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, La/gqw0;->y:La/shd;

    .line 97
    .line 98
    iget-boolean v4, p1, La/fet;->S:Z

    .line 99
    .line 100
    if-nez v4, :cond_2

    .line 101
    .line 102
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-nez v4, :cond_3

    .line 115
    .line 116
    :cond_2
    invoke-static {v1, p1, v1, v0}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    sget-object v0, La/gqw0;->v:La/shd;

    .line 120
    .line 121
    invoke-static {p1, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 122
    .line 123
    .line 124
    iget-object v11, p0, La/zp8;->b:Lkotlin/jvm/functions/Function2;

    .line 125
    .line 126
    if-eqz v11, :cond_4

    .line 127
    .line 128
    const p2, -0x3e3b373f

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 132
    .line 133
    .line 134
    const p2, 0x7f130c3e

    .line 135
    .line 136
    .line 137
    invoke-static {p2, p1}, La/jtt0;->j(ILa/fet;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    const p2, 0x7f130c3f

    .line 142
    .line 143
    .line 144
    invoke-static {p2, p1}, La/jtt0;->j(ILa/fet;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    const p2, 0x7f130c41

    .line 149
    .line 150
    .line 151
    invoke-static {p2, p1}, La/jtt0;->j(ILa/fet;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    new-instance v4, La/yp8;

    .line 156
    .line 157
    iget-object v5, p0, La/zp8;->a:La/xpj0;

    .line 158
    .line 159
    iget-object v6, p0, La/zp8;->d:La/vne;

    .line 160
    .line 161
    iget-boolean v7, p0, La/zp8;->e:Z

    .line 162
    .line 163
    invoke-direct/range {v4 .. v11}, La/yp8;-><init>(La/xpj0;La/vne;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 164
    .line 165
    .line 166
    const p2, -0x1e7fc9a8

    .line 167
    .line 168
    .line 169
    invoke-static {p2, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    const/16 v0, 0x36

    .line 174
    .line 175
    invoke-static {p2, p1, v0}, La/tpj0;->a(La/ugd;La/fet;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_4
    const p2, -0x3e011e45

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 189
    .line 190
    .line 191
    :goto_2
    const/4 p2, 0x6

    .line 192
    iget-object p0, p0, La/zp8;->c:La/ugd;

    .line 193
    .line 194
    sget-object v0, La/y5d;->a:La/y5d;

    .line 195
    .line 196
    invoke-static {p2, p0, v0, p1, v2}, La/vqd;->t(ILa/ugd;La/y5d;La/fet;Z)V

    .line 197
    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 201
    .line 202
    .line 203
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object p0
.end method
