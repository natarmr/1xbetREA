.class public final synthetic La/b5m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/b5m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b5m;->b:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, La/b5m;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/b5m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b5m;->c:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/b5m;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/b5m;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/b5m;->c:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p0, p0, La/b5m;->b:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/mm40;

    .line 11
    .line 12
    check-cast p2, La/fet;

    .line 13
    .line 14
    check-cast p3, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const p1, 0x2d4acc1b

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p1}, La/fet;->e0(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sget-object p3, La/ukd;->a:La/cl5;

    .line 30
    .line 31
    if-ne p1, p3, :cond_0

    .line 32
    .line 33
    invoke-static {p0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p2, p1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    check-cast p1, La/l7m0;

    .line 41
    .line 42
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const/16 v0, 0x8

    .line 47
    .line 48
    if-ne p0, p3, :cond_1

    .line 49
    .line 50
    new-instance p0, La/t33;

    .line 51
    .line 52
    invoke-interface {p1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, La/ne60;

    .line 57
    .line 58
    iget-wide v3, v2, La/ne60;->a:J

    .line 59
    .line 60
    sget-object v3, La/i5i0;->b:La/lxs0;

    .line 61
    .line 62
    sget-wide v4, La/i5i0;->c:J

    .line 63
    .line 64
    new-instance v6, La/ne60;

    .line 65
    .line 66
    invoke-direct {v6, v4, v5}, La/ne60;-><init>(J)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0, v2, v3, v6, v0}, La/t33;-><init>(Ljava/lang/Object;La/lxs0;Ljava/lang/Object;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, p0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    check-cast p0, La/t33;

    .line 76
    .line 77
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    if-nez v3, :cond_2

    .line 88
    .line 89
    if-ne v4, p3, :cond_3

    .line 90
    .line 91
    :cond_2
    new-instance v4, La/kmg0;

    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    const/16 v5, 0x1d

    .line 95
    .line 96
    invoke-direct {v4, p1, p0, v3, v5}, La/kmg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 103
    .line 104
    invoke-static {p2, v2, v4}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 105
    .line 106
    .line 107
    iget-object p0, p0, La/t33;->c:La/l73;

    .line 108
    .line 109
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    if-nez p1, :cond_4

    .line 118
    .line 119
    if-ne v2, p3, :cond_5

    .line 120
    .line 121
    :cond_4
    new-instance v2, La/f7f0;

    .line 122
    .line 123
    invoke-direct {v2, p0, v0}, La/f7f0;-><init>(La/l7m0;B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 130
    .line 131
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, La/mm40;

    .line 136
    .line 137
    const/4 p1, 0x0

    .line 138
    invoke-virtual {p2, p1}, La/fet;->r(Z)V

    .line 139
    .line 140
    .line 141
    return-object p0

    .line 142
    :pswitch_0
    check-cast p1, La/vj30;

    .line 143
    .line 144
    check-cast p2, La/pj30;

    .line 145
    .line 146
    check-cast p3, La/p4e;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-wide v2, p3, La/p4e;->a:J

    .line 155
    .line 156
    invoke-interface {p2, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    iget p3, p2, La/pu90;->b:I

    .line 161
    .line 162
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object p3

    .line 166
    invoke-interface {v1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    check-cast p0, Ljava/lang/Number;

    .line 174
    .line 175
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    const/4 p3, 0x0

    .line 180
    const/high16 v0, 0x3f800000    # 1.0f

    .line 181
    .line 182
    invoke-static {p0, p3, v0}, La/l1e0;->c(FFF)F

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    sub-float/2addr v0, p0

    .line 187
    iget p3, p2, La/pu90;->b:I

    .line 188
    .line 189
    int-to-float p3, p3

    .line 190
    mul-float/2addr v0, p3

    .line 191
    invoke-static {v0}, La/si30;->b(F)I

    .line 192
    .line 193
    .line 194
    move-result p3

    .line 195
    iget v0, p2, La/pu90;->a:I

    .line 196
    .line 197
    new-instance v1, La/j3d;

    .line 198
    .line 199
    invoke-direct {v1, p0, p2}, La/j3d;-><init>(FLa/pu90;)V

    .line 200
    .line 201
    .line 202
    invoke-static {p1, v0, p3, v1}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    return-object p0

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
