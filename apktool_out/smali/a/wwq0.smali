.class public final La/wwq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:J

.field public final synthetic c:La/ugd;


# direct methods
.method public constructor <init>(FJLa/ugd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/wwq0;->a:F

    .line 5
    .line 6
    iput-wide p2, p0, La/wwq0;->b:J

    .line 7
    .line 8
    iput-object p4, p0, La/wwq0;->c:La/ugd;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

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
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    :goto_0
    and-int/2addr p2, v3

    .line 20
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_4

    .line 25
    .line 26
    sget-object p2, La/xwq0;->a:La/lh80;

    .line 27
    .line 28
    const/high16 p2, 0x41c00000    # 24.0f

    .line 29
    .line 30
    iget v0, p0, La/wwq0;->a:F

    .line 31
    .line 32
    sget-object v1, La/jm40;->b:La/jm40;

    .line 33
    .line 34
    const/high16 v4, 0x42200000    # 40.0f

    .line 35
    .line 36
    const/16 v5, 0x8

    .line 37
    .line 38
    invoke-static {v1, v4, p2, v0, v5}, La/o7k0;->r(La/mm40;FFFI)La/mm40;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    sget-object v0, La/xwq0;->a:La/lh80;

    .line 43
    .line 44
    invoke-static {p2, v0}, La/s5x0;->I(La/mm40;La/hh80;)La/mm40;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    sget-object v0, La/gqw0;->a:La/zx7;

    .line 49
    .line 50
    invoke-static {v0, v2}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {p1}, La/e3c;->x(La/fet;)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {p1, p2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    sget-object v4, La/mkd;->c0:La/gqw0;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, La/fet;->i0()V

    .line 72
    .line 73
    .line 74
    iget-boolean v4, p1, La/fet;->S:Z

    .line 75
    .line 76
    if-eqz v4, :cond_1

    .line 77
    .line 78
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 79
    .line 80
    invoke-virtual {p1, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-virtual {p1}, La/fet;->r0()V

    .line 85
    .line 86
    .line 87
    :goto_1
    sget-object v4, La/gqw0;->x:La/shd;

    .line 88
    .line 89
    invoke-static {p1, v0, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 90
    .line 91
    .line 92
    sget-object v0, La/gqw0;->w:La/shd;

    .line 93
    .line 94
    invoke-static {p1, v2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 95
    .line 96
    .line 97
    sget-object v0, La/gqw0;->y:La/shd;

    .line 98
    .line 99
    iget-boolean v2, p1, La/fet;->S:Z

    .line 100
    .line 101
    if-nez v2, :cond_2

    .line 102
    .line 103
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_3

    .line 116
    .line 117
    :cond_2
    invoke-static {v1, p1, v1, v0}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    sget-object v0, La/gqw0;->v:La/shd;

    .line 121
    .line 122
    invoke-static {p1, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    sget-object p2, La/fv90;->d:La/i1t0;

    .line 126
    .line 127
    invoke-static {p2, p1}, La/k1t0;->a(La/i1t0;La/fet;)La/y9q0;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    sget-object v0, La/yde;->a:La/zfn;

    .line 132
    .line 133
    new-instance v1, La/y3d;

    .line 134
    .line 135
    iget-wide v6, p0, La/wwq0;->b:J

    .line 136
    .line 137
    invoke-direct {v1, v6, v7}, La/y3d;-><init>(J)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v1}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    sget-object v1, La/v8q0;->a:La/zfn;

    .line 145
    .line 146
    invoke-virtual {v1, p2}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    filled-new-array {v0, p2}, [La/l5d0;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    iget-object p0, p0, La/wwq0;->c:La/ugd;

    .line 155
    .line 156
    invoke-static {p2, p0, p1, v5}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    invoke-virtual {p1}, La/fet;->X()V

    .line 164
    .line 165
    .line 166
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    return-object p0
.end method
