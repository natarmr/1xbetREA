.class public final synthetic La/p02;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:F


# direct methods
.method public synthetic constructor <init>(La/mm40;FFF)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/p02;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p02;->b:La/mm40;

    iput p2, p0, La/p02;->c:F

    iput p3, p0, La/p02;->d:F

    iput p4, p0, La/p02;->e:F

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;FFFI)V
    .locals 0

    .line 2
    const/4 p5, 0x1

    iput-byte p5, p0, La/p02;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p02;->b:La/mm40;

    iput p2, p0, La/p02;->c:F

    iput p3, p0, La/p02;->d:F

    iput p4, p0, La/p02;->e:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/p02;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    move-object v6, p1

    .line 8
    check-cast v6, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    iget-object v2, p0, La/p02;->b:La/mm40;

    .line 20
    .line 21
    iget v3, p0, La/p02;->c:F

    .line 22
    .line 23
    iget v4, p0, La/p02;->d:F

    .line 24
    .line 25
    iget v5, p0, La/p02;->e:F

    .line 26
    .line 27
    invoke-static/range {v2 .. v7}, La/oja0;->b(La/mm40;FFFLa/fet;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    move-object v9, p1

    .line 34
    check-cast v9, La/fet;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    and-int/lit8 p2, p1, 0x3

    .line 43
    .line 44
    const/4 v0, 0x2

    .line 45
    const/4 v12, 0x0

    .line 46
    if-eq p2, v0, :cond_0

    .line 47
    .line 48
    move p2, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move p2, v12

    .line 51
    :goto_0
    and-int/2addr p1, v1

    .line 52
    invoke-virtual {v9, p1, p2}, La/fet;->U(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    sget-object p1, La/qmk;->a:La/zcl;

    .line 59
    .line 60
    const/high16 p1, 0x43120000    # 146.0f

    .line 61
    .line 62
    iget-object p2, p0, La/p02;->b:La/mm40;

    .line 63
    .line 64
    invoke-static {p2, p1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const/high16 p2, 0x42b00000    # 88.0f

    .line 69
    .line 70
    invoke-static {p1, p2}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-wide v2, La/ijg;->e1:J

    .line 75
    .line 76
    sget-object p2, La/jd8;->n:La/ljc;

    .line 77
    .line 78
    invoke-static {p1, v2, v3, p2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    sget-object p2, La/gqw0;->b:La/zx7;

    .line 83
    .line 84
    invoke-static {p2, v12}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iget-wide v2, v9, La/fet;->T:J

    .line 89
    .line 90
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v9, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    sget-object v3, La/mkd;->c0:La/gqw0;

    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9}, La/fet;->i0()V

    .line 108
    .line 109
    .line 110
    iget-boolean v3, v9, La/fet;->S:Z

    .line 111
    .line 112
    if-eqz v3, :cond_1

    .line 113
    .line 114
    sget-object v3, La/e7z;->u1:La/pcy;

    .line 115
    .line 116
    invoke-virtual {v9, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    invoke-virtual {v9}, La/fet;->r0()V

    .line 121
    .line 122
    .line 123
    :goto_1
    sget-object v3, La/gqw0;->x:La/shd;

    .line 124
    .line 125
    invoke-static {v9, p2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 126
    .line 127
    .line 128
    sget-object p2, La/gqw0;->w:La/shd;

    .line 129
    .line 130
    invoke-static {v9, v2, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    sget-object v0, La/gqw0;->y:La/shd;

    .line 138
    .line 139
    invoke-static {v9, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 143
    .line 144
    .line 145
    sget-object p2, La/gqw0;->v:La/shd;

    .line 146
    .line 147
    invoke-static {v9, p1, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 148
    .line 149
    .line 150
    const p1, 0x7f080f7b

    .line 151
    .line 152
    .line 153
    invoke-static {p1, v12, v9}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    const/16 v11, 0x7c

    .line 158
    .line 159
    const/4 v3, 0x0

    .line 160
    const/4 v4, 0x0

    .line 161
    const/4 v5, 0x0

    .line 162
    const/4 v6, 0x0

    .line 163
    const/4 v7, 0x0

    .line 164
    const/4 v8, 0x0

    .line 165
    const/16 v10, 0x38

    .line 166
    .line 167
    invoke-static/range {v2 .. v11}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 168
    .line 169
    .line 170
    const p1, 0x7f080f7d

    .line 171
    .line 172
    .line 173
    invoke-static {p1, v12, v9}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const/16 v11, 0x5c

    .line 178
    .line 179
    iget v7, p0, La/p02;->c:F

    .line 180
    .line 181
    invoke-static/range {v2 .. v11}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 182
    .line 183
    .line 184
    const p1, 0x7f080f7c

    .line 185
    .line 186
    .line 187
    invoke-static {p1, v12, v9}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    iget v7, p0, La/p02;->d:F

    .line 192
    .line 193
    invoke-static/range {v2 .. v11}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 194
    .line 195
    .line 196
    const p1, 0x7f080f7e

    .line 197
    .line 198
    .line 199
    invoke-static {p1, v12, v9}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    iget v7, p0, La/p02;->e:F

    .line 204
    .line 205
    invoke-static/range {v2 .. v11}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v9, v1}, La/fet;->r(Z)V

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_2
    invoke-virtual {v9}, La/fet;->X()V

    .line 213
    .line 214
    .line 215
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object p0

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
