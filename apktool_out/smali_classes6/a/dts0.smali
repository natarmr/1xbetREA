.class public final synthetic La/dts0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:La/nts0;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(La/nts0;Lkotlin/jvm/functions/Function1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dts0;->a:La/nts0;

    iput-object p2, p0, La/dts0;->b:Lkotlin/jvm/functions/Function1;

    iput-boolean p3, p0, La/dts0;->c:Z

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/hh80;

    .line 2
    .line 3
    check-cast p2, La/l7m0;

    .line 4
    .line 5
    check-cast p3, La/l7m0;

    .line 6
    .line 7
    move-object v5, p4

    .line 8
    check-cast v5, La/fet;

    .line 9
    .line 10
    check-cast p5, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    and-int/lit16 p1, p4, 0x401

    .line 26
    .line 27
    const/16 p2, 0x400

    .line 28
    .line 29
    const/4 p3, 0x1

    .line 30
    const/4 p5, 0x0

    .line 31
    if-eq p1, p2, :cond_0

    .line 32
    .line 33
    move p1, p3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move p1, p5

    .line 36
    :goto_0
    and-int/lit8 p2, p4, 0x1

    .line 37
    .line 38
    invoke-virtual {v5, p2, p1}, La/fet;->U(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    sget-object p1, La/o7k0;->c:La/n0q;

    .line 45
    .line 46
    sget-object p2, La/zaq0;->b:La/zfn;

    .line 47
    .line 48
    invoke-virtual {v5, p2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    check-cast p2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 53
    .line 54
    invoke-virtual {p2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    sget-object p2, La/qmk;->a:La/zcl;

    .line 59
    .line 60
    const/16 p2, 0xc

    .line 61
    .line 62
    const/high16 p4, 0x41800000    # 16.0f

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-static {p4, p4, v2, v2, p2}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-static {p1, v0, v1, p2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const/high16 p2, 0x40800000    # 4.0f

    .line 74
    .line 75
    invoke-static {p1, v2, p2, p3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    sget-object p4, La/uc9;->c:La/mw3;

    .line 80
    .line 81
    sget-object v0, La/gqw0;->m:La/xx7;

    .line 82
    .line 83
    invoke-static {p4, v0, v5, p5}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 84
    .line 85
    .line 86
    move-result-object p4

    .line 87
    iget-wide v0, v5, La/fet;->T:J

    .line 88
    .line 89
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v5, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    sget-object v2, La/mkd;->c0:La/gqw0;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5}, La/fet;->i0()V

    .line 107
    .line 108
    .line 109
    iget-boolean v2, v5, La/fet;->S:Z

    .line 110
    .line 111
    if-eqz v2, :cond_1

    .line 112
    .line 113
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 114
    .line 115
    invoke-virtual {v5, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    invoke-virtual {v5}, La/fet;->r0()V

    .line 120
    .line 121
    .line 122
    :goto_1
    sget-object v2, La/gqw0;->x:La/shd;

    .line 123
    .line 124
    invoke-static {v5, p4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 125
    .line 126
    .line 127
    sget-object p4, La/gqw0;->w:La/shd;

    .line 128
    .line 129
    invoke-static {v5, v1, p4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object p4

    .line 136
    sget-object v0, La/gqw0;->y:La/shd;

    .line 137
    .line 138
    invoke-static {v5, p4, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 142
    .line 143
    .line 144
    sget-object p4, La/gqw0;->v:La/shd;

    .line 145
    .line 146
    invoke-static {v5, p1, p4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p0, La/dts0;->a:La/nts0;

    .line 150
    .line 151
    iget-object v1, p1, La/nts0;->d:La/hyl;

    .line 152
    .line 153
    sget-object v2, La/vxl;->b:La/vxl;

    .line 154
    .line 155
    iget-object p4, p0, La/dts0;->b:Lkotlin/jvm/functions/Function1;

    .line 156
    .line 157
    invoke-virtual {v5, p4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    if-nez v0, :cond_2

    .line 166
    .line 167
    sget-object v0, La/ukd;->a:La/cl5;

    .line 168
    .line 169
    if-ne v3, v0, :cond_3

    .line 170
    .line 171
    :cond_2
    new-instance v3, La/xar0;

    .line 172
    .line 173
    const/16 v0, 0xe

    .line 174
    .line 175
    invoke-direct {v3, p4, v0}, La/xar0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 182
    .line 183
    const/4 v6, 0x0

    .line 184
    const/16 v7, 0x29

    .line 185
    .line 186
    const/4 v0, 0x0

    .line 187
    const/4 v4, 0x0

    .line 188
    invoke-static/range {v0 .. v7}, La/ebc;->r(La/mm40;La/hyl;La/vxl;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 189
    .line 190
    .line 191
    invoke-static {v5}, La/xfn;->a(La/fet;)La/wfn;

    .line 192
    .line 193
    .line 194
    move-result-object p4

    .line 195
    iget p4, p4, La/wfn;->c:F

    .line 196
    .line 197
    invoke-static {v5}, La/xfn;->a(La/fet;)La/wfn;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    iget v0, v0, La/wfn;->c:F

    .line 202
    .line 203
    sget-object v1, La/jm40;->b:La/jm40;

    .line 204
    .line 205
    const/high16 v2, 0x41400000    # 12.0f

    .line 206
    .line 207
    invoke-static {v1, p4, p2, v0, v2}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    iget-object p4, p1, La/nts0;->e:La/uss0;

    .line 212
    .line 213
    invoke-static {p2, p4, v5, p5}, La/ewm0;->k(La/mm40;La/uss0;La/fet;I)V

    .line 214
    .line 215
    .line 216
    iget-object p1, p1, La/nts0;->b:La/mts0;

    .line 217
    .line 218
    const/4 p2, 0x0

    .line 219
    iget-boolean p0, p0, La/dts0;->c:Z

    .line 220
    .line 221
    invoke-static {p2, p0, p1, v5, p5}, La/vbw0;->L(La/mm40;ZLa/mts0;La/fet;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v5, p3}, La/fet;->r(Z)V

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_4
    invoke-virtual {v5}, La/fet;->X()V

    .line 229
    .line 230
    .line 231
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    return-object p0
.end method
