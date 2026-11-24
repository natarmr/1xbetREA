.class public final La/fmn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/yjj0;

.field public final synthetic c:J

.field public final synthetic d:F

.field public final synthetic e:La/dn8;

.field public final synthetic f:La/gy40;

.field public final synthetic g:Z

.field public final synthetic h:Lkotlin/jvm/functions/Function0;

.field public final synthetic i:F

.field public final synthetic j:La/ugd;


# direct methods
.method public constructor <init>(La/mm40;La/yjj0;JFLa/dn8;La/gy40;ZLkotlin/jvm/functions/Function0;FLa/ugd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/fmn0;->a:La/mm40;

    .line 5
    .line 6
    iput-object p2, p0, La/fmn0;->b:La/yjj0;

    .line 7
    .line 8
    iput-wide p3, p0, La/fmn0;->c:J

    .line 9
    .line 10
    iput p5, p0, La/fmn0;->d:F

    .line 11
    .line 12
    iput-object p6, p0, La/fmn0;->e:La/dn8;

    .line 13
    .line 14
    iput-object p7, p0, La/fmn0;->f:La/gy40;

    .line 15
    .line 16
    iput-boolean p8, p0, La/fmn0;->g:Z

    .line 17
    .line 18
    iput-object p9, p0, La/fmn0;->h:Lkotlin/jvm/functions/Function0;

    .line 19
    .line 20
    iput p10, p0, La/fmn0;->i:F

    .line 21
    .line 22
    iput-object p11, p0, La/fmn0;->j:La/ugd;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/fet;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-eq v3, v4, :cond_0

    .line 21
    .line 22
    move v3, v6

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, v5

    .line 25
    :goto_0
    and-int/2addr v2, v6

    .line 26
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_4

    .line 31
    .line 32
    sget-object v2, La/rlx;->a:La/ykw;

    .line 33
    .line 34
    sget-object v2, La/tg40;->b:La/tg40;

    .line 35
    .line 36
    iget-object v3, v0, La/fmn0;->a:La/mm40;

    .line 37
    .line 38
    invoke-interface {v3, v2}, La/mm40;->e(La/mm40;)La/mm40;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    iget-wide v2, v0, La/fmn0;->c:J

    .line 43
    .line 44
    iget v4, v0, La/fmn0;->d:F

    .line 45
    .line 46
    invoke-static {v2, v3, v4, v1}, La/gmn0;->d(JFLa/fet;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v9

    .line 50
    sget-object v2, La/bmd;->h:La/zfn;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget v3, v0, La/fmn0;->i:F

    .line 57
    .line 58
    check-cast v2, La/w6k;

    .line 59
    .line 60
    invoke-interface {v2, v3}, La/w6k;->w0(F)F

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    iget-object v8, v0, La/fmn0;->b:La/yjj0;

    .line 65
    .line 66
    iget-object v11, v0, La/fmn0;->e:La/dn8;

    .line 67
    .line 68
    invoke-static/range {v7 .. v12}, La/gmn0;->c(La/mm40;La/yjj0;JLa/dn8;F)La/mm40;

    .line 69
    .line 70
    .line 71
    move-result-object v13

    .line 72
    const/4 v2, 0x0

    .line 73
    const/4 v3, 0x7

    .line 74
    invoke-static {v2, v3}, La/lcg0;->a(FI)La/ncg0;

    .line 75
    .line 76
    .line 77
    move-result-object v15

    .line 78
    iget-object v2, v0, La/fmn0;->h:Lkotlin/jvm/functions/Function0;

    .line 79
    .line 80
    const/16 v19, 0x18

    .line 81
    .line 82
    iget-object v14, v0, La/fmn0;->f:La/gy40;

    .line 83
    .line 84
    iget-boolean v3, v0, La/fmn0;->g:Z

    .line 85
    .line 86
    const/16 v17, 0x0

    .line 87
    .line 88
    move-object/from16 v18, v2

    .line 89
    .line 90
    move/from16 v16, v3

    .line 91
    .line 92
    invoke-static/range {v13 .. v19}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    new-instance v3, La/e6c;

    .line 97
    .line 98
    const/4 v4, 0x4

    .line 99
    invoke-direct {v3, v4}, La/e6c;-><init>(B)V

    .line 100
    .line 101
    .line 102
    new-instance v4, La/mac;

    .line 103
    .line 104
    invoke-direct {v4, v3}, La/mac;-><init>(La/e6c;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v2, v4}, La/mm40;->e(La/mm40;)La/mm40;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    sget-object v3, La/gqw0;->a:La/zx7;

    .line 112
    .line 113
    invoke-static {v3, v6}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-static {v1}, La/e3c;->x(La/fet;)I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    invoke-static {v1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 130
    .line 131
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, La/fet;->i0()V

    .line 135
    .line 136
    .line 137
    iget-boolean v8, v1, La/fet;->S:Z

    .line 138
    .line 139
    if-eqz v8, :cond_1

    .line 140
    .line 141
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 142
    .line 143
    invoke-virtual {v1, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 148
    .line 149
    .line 150
    :goto_1
    sget-object v8, La/gqw0;->x:La/shd;

    .line 151
    .line 152
    invoke-static {v1, v3, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    sget-object v3, La/gqw0;->w:La/shd;

    .line 156
    .line 157
    invoke-static {v1, v7, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 158
    .line 159
    .line 160
    sget-object v3, La/gqw0;->y:La/shd;

    .line 161
    .line 162
    iget-boolean v7, v1, La/fet;->S:Z

    .line 163
    .line 164
    if-nez v7, :cond_2

    .line 165
    .line 166
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-nez v7, :cond_3

    .line 179
    .line 180
    :cond_2
    invoke-static {v4, v1, v4, v3}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 181
    .line 182
    .line 183
    :cond_3
    sget-object v3, La/gqw0;->v:La/shd;

    .line 184
    .line 185
    invoke-static {v1, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 186
    .line 187
    .line 188
    iget-object v0, v0, La/fmn0;->j:La/ugd;

    .line 189
    .line 190
    invoke-static {v5, v0, v1, v6}, La/twn;->v(ILa/ugd;La/fet;Z)V

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_4
    invoke-virtual {v1}, La/fet;->X()V

    .line 195
    .line 196
    .line 197
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object v0
.end method
