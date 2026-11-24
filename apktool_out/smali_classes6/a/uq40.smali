.class public final synthetic La/uq40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:Z

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(FZLkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/uq40;->a:F

    iput-boolean p2, p0, La/uq40;->b:Z

    iput-object p3, p0, La/uq40;->c:Lkotlin/jvm/functions/Function0;

    iput-boolean p4, p0, La/uq40;->d:Z

    iput-object p5, p0, La/uq40;->e:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, La/u63;

    .line 2
    .line 3
    check-cast p2, La/fet;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    and-int/lit8 p1, p3, 0x11

    .line 15
    .line 16
    const/16 v0, 0x10

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-eq p1, v0, :cond_0

    .line 21
    .line 22
    move p1, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v1

    .line 25
    :goto_0
    and-int/2addr p3, v2

    .line 26
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    sget-object p1, La/gqw0;->k:La/yx7;

    .line 33
    .line 34
    sget-object p3, La/uc9;->e:La/nw3;

    .line 35
    .line 36
    const/16 v0, 0x36

    .line 37
    .line 38
    invoke-static {p3, p1, p2, v0}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-wide v3, p2, La/fet;->T:J

    .line 43
    .line 44
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    invoke-virtual {p2}, La/fet;->m()La/bh90;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget-object v3, La/jm40;->b:La/jm40;

    .line 53
    .line 54
    invoke-static {p2, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, La/fet;->i0()V

    .line 64
    .line 65
    .line 66
    iget-boolean v5, p2, La/fet;->S:Z

    .line 67
    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 71
    .line 72
    invoke-virtual {p2, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-virtual {p2}, La/fet;->r0()V

    .line 77
    .line 78
    .line 79
    :goto_1
    sget-object v5, La/gqw0;->x:La/shd;

    .line 80
    .line 81
    invoke-static {p2, p1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 82
    .line 83
    .line 84
    sget-object p1, La/gqw0;->w:La/shd;

    .line 85
    .line 86
    invoke-static {p2, v0, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    sget-object p3, La/gqw0;->y:La/shd;

    .line 94
    .line 95
    invoke-static {p2, p1, p3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 96
    .line 97
    .line 98
    invoke-static {p2}, La/jpm0;->n(La/fet;)V

    .line 99
    .line 100
    .line 101
    sget-object p1, La/gqw0;->v:La/shd;

    .line 102
    .line 103
    invoke-static {p2, v4, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 104
    .line 105
    .line 106
    sget-object p1, La/qmk;->a:La/zcl;

    .line 107
    .line 108
    new-instance p1, La/xq40;

    .line 109
    .line 110
    iget p3, p0, La/uq40;->a:F

    .line 111
    .line 112
    iget-boolean v0, p0, La/uq40;->b:Z

    .line 113
    .line 114
    iget-object v4, p0, La/uq40;->c:Lkotlin/jvm/functions/Function0;

    .line 115
    .line 116
    invoke-direct {p1, p3, v0, v4, v1}, La/xq40;-><init>(FZLkotlin/jvm/functions/Function0;B)V

    .line 117
    .line 118
    .line 119
    const p3, -0x8979426

    .line 120
    .line 121
    .line 122
    invoke-static {p3, p1, p2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    const/16 p3, 0x30

    .line 127
    .line 128
    invoke-static {p1, p2, p3}, La/w9x;->m(La/ugd;La/fet;I)V

    .line 129
    .line 130
    .line 131
    const/high16 p1, 0x41000000    # 8.0f

    .line 132
    .line 133
    invoke-static {v3, p1}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-static {p2, p1}, La/qxw;->o(La/fet;La/mm40;)V

    .line 138
    .line 139
    .line 140
    new-instance p1, La/a0;

    .line 141
    .line 142
    const/4 v0, 0x3

    .line 143
    iget-boolean v1, p0, La/uq40;->d:Z

    .line 144
    .line 145
    iget-object p0, p0, La/uq40;->e:Lkotlin/jvm/functions/Function0;

    .line 146
    .line 147
    invoke-direct {p1, v1, p0, v0}, La/a0;-><init>(ZLkotlin/jvm/functions/Function0;B)V

    .line 148
    .line 149
    .line 150
    const p0, 0x77714d03

    .line 151
    .line 152
    .line 153
    invoke-static {p0, p1, p2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {p0, p2, p3}, La/w9x;->m(La/ugd;La/fet;I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2, v2}, La/fet;->r(Z)V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_2
    invoke-virtual {p2}, La/fet;->X()V

    .line 165
    .line 166
    .line 167
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0
.end method
