.class public final La/emn0;
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

.field public final synthetic f:F

.field public final synthetic g:La/ugd;


# direct methods
.method public constructor <init>(La/mm40;La/yjj0;JFLa/dn8;FLa/ugd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/emn0;->a:La/mm40;

    .line 5
    .line 6
    iput-object p2, p0, La/emn0;->b:La/yjj0;

    .line 7
    .line 8
    iput-wide p3, p0, La/emn0;->c:J

    .line 9
    .line 10
    iput p5, p0, La/emn0;->d:F

    .line 11
    .line 12
    iput-object p6, p0, La/emn0;->e:La/dn8;

    .line 13
    .line 14
    iput p7, p0, La/emn0;->f:F

    .line 15
    .line 16
    iput-object p8, p0, La/emn0;->g:La/ugd;

    .line 17
    .line 18
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
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v0, v3, :cond_0

    .line 15
    .line 16
    move v0, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    :goto_0
    and-int/2addr p2, v1

    .line 20
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_6

    .line 25
    .line 26
    iget-wide v4, p0, La/emn0;->c:J

    .line 27
    .line 28
    iget p2, p0, La/emn0;->d:F

    .line 29
    .line 30
    invoke-static {v4, v5, p2, p1}, La/gmn0;->d(JFLa/fet;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v8

    .line 34
    sget-object p2, La/bmd;->h:La/zfn;

    .line 35
    .line 36
    invoke-virtual {p1, p2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iget v0, p0, La/emn0;->f:F

    .line 41
    .line 42
    check-cast p2, La/w6k;

    .line 43
    .line 44
    invoke-interface {p2, v0}, La/w6k;->w0(F)F

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    iget-object v6, p0, La/emn0;->a:La/mm40;

    .line 49
    .line 50
    iget-object v7, p0, La/emn0;->b:La/yjj0;

    .line 51
    .line 52
    iget-object v10, p0, La/emn0;->e:La/dn8;

    .line 53
    .line 54
    invoke-static/range {v6 .. v11}, La/gmn0;->c(La/mm40;La/yjj0;JLa/dn8;F)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v4, La/ukd;->a:La/cl5;

    .line 63
    .line 64
    if-ne v0, v4, :cond_1

    .line 65
    .line 66
    new-instance v0, La/rgn0;

    .line 67
    .line 68
    invoke-direct {v0, v3}, La/rgn0;-><init>(B)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 75
    .line 76
    invoke-static {p2, v2, v0}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    if-ne v3, v4, :cond_2

    .line 87
    .line 88
    sget-object v3, La/i54;->m:La/i54;

    .line 89
    .line 90
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 94
    .line 95
    invoke-static {p2, v0, v3}, La/fnn0;->a(La/mm40;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)La/mm40;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    sget-object v0, La/gqw0;->a:La/zx7;

    .line 100
    .line 101
    invoke-static {v0, v1}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {p1}, La/e3c;->x(La/fet;)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-static {p1, p2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, La/fet;->i0()V

    .line 123
    .line 124
    .line 125
    iget-boolean v5, p1, La/fet;->S:Z

    .line 126
    .line 127
    if-eqz v5, :cond_3

    .line 128
    .line 129
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 130
    .line 131
    invoke-virtual {p1, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    invoke-virtual {p1}, La/fet;->r0()V

    .line 136
    .line 137
    .line 138
    :goto_1
    sget-object v5, La/gqw0;->x:La/shd;

    .line 139
    .line 140
    invoke-static {p1, v0, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    sget-object v0, La/gqw0;->w:La/shd;

    .line 144
    .line 145
    invoke-static {p1, v4, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 146
    .line 147
    .line 148
    sget-object v0, La/gqw0;->y:La/shd;

    .line 149
    .line 150
    iget-boolean v4, p1, La/fet;->S:Z

    .line 151
    .line 152
    if-nez v4, :cond_4

    .line 153
    .line 154
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-nez v4, :cond_5

    .line 167
    .line 168
    :cond_4
    invoke-static {v3, p1, v3, v0}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 169
    .line 170
    .line 171
    :cond_5
    sget-object v0, La/gqw0;->v:La/shd;

    .line 172
    .line 173
    invoke-static {p1, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 174
    .line 175
    .line 176
    iget-object p0, p0, La/emn0;->g:La/ugd;

    .line 177
    .line 178
    invoke-static {v2, p0, p1, v1}, La/twn;->v(ILa/ugd;La/fet;Z)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_6
    invoke-virtual {p1}, La/fet;->X()V

    .line 183
    .line 184
    .line 185
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object p0
.end method
