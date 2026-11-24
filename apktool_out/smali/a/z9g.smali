.class public final synthetic La/z9g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kwd;

.field public final synthetic c:La/s7g;

.field public final synthetic d:La/hbg;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(La/kwd;La/s7g;La/hbg;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/z9g;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/z9g;->b:La/kwd;

    iput-object p2, p0, La/z9g;->c:La/s7g;

    iput-object p3, p0, La/z9g;->d:La/hbg;

    iput-boolean p4, p0, La/z9g;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(La/kwd;La/s7g;La/hbg;ZI)V
    .locals 0

    .line 2
    const/4 p5, 0x1

    iput-byte p5, p0, La/z9g;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/z9g;->b:La/kwd;

    iput-object p2, p0, La/z9g;->c:La/s7g;

    iput-object p3, p0, La/z9g;->d:La/hbg;

    iput-boolean p4, p0, La/z9g;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/z9g;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x41

    .line 15
    .line 16
    invoke-static {p1}, La/x8x;->L(I)I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    iget-object v1, p0, La/z9g;->b:La/kwd;

    .line 21
    .line 22
    iget-object v2, p0, La/z9g;->c:La/s7g;

    .line 23
    .line 24
    iget-object v3, p0, La/z9g;->d:La/hbg;

    .line 25
    .line 26
    iget-boolean v4, p0, La/z9g;->e:Z

    .line 27
    .line 28
    invoke-virtual/range {v1 .. v6}, La/kwd;->d(La/s7g;La/hbg;ZLa/fet;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    move-object v4, p1

    .line 35
    check-cast v4, La/fet;

    .line 36
    .line 37
    check-cast p2, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    and-int/lit8 p2, p1, 0x3

    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    const/4 v1, 0x0

    .line 47
    const/4 v6, 0x1

    .line 48
    if-eq p2, v0, :cond_0

    .line 49
    .line 50
    move p2, v6

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move p2, v1

    .line 53
    :goto_0
    and-int/2addr p1, v6

    .line 54
    invoke-virtual {v4, p1, p2}, La/fet;->U(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    sget-object p1, La/jm40;->b:La/jm40;

    .line 61
    .line 62
    const/high16 p2, 0x3f800000    # 1.0f

    .line 63
    .line 64
    invoke-static {p1, p2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget-object p2, La/zaq0;->b:La/zfn;

    .line 69
    .line 70
    invoke-virtual {v4, p2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    check-cast p2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 75
    .line 76
    invoke-virtual {p2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    sget-object p2, La/jd8;->n:La/ljc;

    .line 81
    .line 82
    invoke-static {p1, v2, v3, p2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    sget-object p2, La/uc9;->c:La/mw3;

    .line 87
    .line 88
    sget-object v0, La/gqw0;->m:La/xx7;

    .line 89
    .line 90
    invoke-static {p2, v0, v4, v1}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iget-wide v0, v4, La/fet;->T:J

    .line 95
    .line 96
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v4, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    sget-object v2, La/mkd;->c0:La/gqw0;

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, La/fet;->i0()V

    .line 114
    .line 115
    .line 116
    iget-boolean v2, v4, La/fet;->S:Z

    .line 117
    .line 118
    if-eqz v2, :cond_1

    .line 119
    .line 120
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 121
    .line 122
    invoke-virtual {v4, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_1
    invoke-virtual {v4}, La/fet;->r0()V

    .line 127
    .line 128
    .line 129
    :goto_1
    sget-object v2, La/gqw0;->x:La/shd;

    .line 130
    .line 131
    invoke-static {v4, p2, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    sget-object p2, La/gqw0;->w:La/shd;

    .line 135
    .line 136
    invoke-static {v4, v1, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    sget-object v0, La/gqw0;->y:La/shd;

    .line 144
    .line 145
    invoke-static {v4, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v4}, La/jpm0;->n(La/fet;)V

    .line 149
    .line 150
    .line 151
    sget-object p2, La/gqw0;->v:La/shd;

    .line 152
    .line 153
    invoke-static {v4, p1, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, La/z9g;->b:La/kwd;

    .line 157
    .line 158
    iget-object v1, p0, La/z9g;->c:La/s7g;

    .line 159
    .line 160
    iget-object v2, p0, La/z9g;->d:La/hbg;

    .line 161
    .line 162
    iget-boolean v3, p0, La/z9g;->e:Z

    .line 163
    .line 164
    const/16 v5, 0x40

    .line 165
    .line 166
    invoke-virtual/range {v0 .. v5}, La/kwd;->d(La/s7g;La/hbg;ZLa/fet;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1, v2, v4, v5}, La/kwd;->e(La/s7g;La/hbg;La/fet;I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v6}, La/fet;->r(Z)V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_2
    invoke-virtual {v4}, La/fet;->X()V

    .line 177
    .line 178
    .line 179
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p0

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
