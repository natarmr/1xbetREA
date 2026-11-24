.class public final synthetic La/kod;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/pod;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/pod;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/kod;->a:B

    iput-object p1, p0, La/kod;->b:La/pz40;

    iput-object p2, p0, La/kod;->c:La/pod;

    iput-object p3, p0, La/kod;->d:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/kod;->a:B

    .line 2
    .line 3
    const/16 v1, 0x38

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    iget-object v4, p0, La/kod;->d:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    iget-object v5, p0, La/kod;->c:La/pod;

    .line 12
    .line 13
    iget-object p0, p0, La/kod;->b:La/pz40;

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    const/4 v7, 0x0

    .line 17
    check-cast p1, La/yhg0;

    .line 18
    .line 19
    check-cast p2, La/fet;

    .line 20
    .line 21
    check-cast p3, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    packed-switch v0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    and-int/lit8 p1, p3, 0x11

    .line 34
    .line 35
    if-eq p1, v3, :cond_0

    .line 36
    .line 37
    move p1, v6

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move p1, v7

    .line 40
    :goto_0
    and-int/2addr p3, v6

    .line 41
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    new-array p1, v7, [Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

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
    if-ne v0, v2, :cond_2

    .line 60
    .line 61
    :cond_1
    new-instance v0, La/xx;

    .line 62
    .line 63
    const/16 p3, 0x18

    .line 64
    .line 65
    invoke-direct {v0, p0, p3}, La/xx;-><init>(La/pz40;B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 72
    .line 73
    invoke-static {p1, v0, p2}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    sget-object p3, La/dgp0;->d:La/zfn;

    .line 78
    .line 79
    invoke-interface {p1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p3, p1}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance p3, La/lod;

    .line 88
    .line 89
    invoke-direct {p3, v5, v4, v7}, La/lod;-><init>(La/pod;Lkotlin/jvm/functions/Function2;B)V

    .line 90
    .line 91
    .line 92
    const v0, -0x530ec006

    .line 93
    .line 94
    .line 95
    invoke-static {v0, p3, p2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-static {p1, p3, p2, v1}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 100
    .line 101
    .line 102
    iget-object p1, v5, La/pod;->e:La/j83;

    .line 103
    .line 104
    invoke-static {p1, p0, p2}, La/m0x0;->i(La/j83;La/pz40;La/fet;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 109
    .line 110
    .line 111
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    and-int/lit8 p1, p3, 0x11

    .line 118
    .line 119
    if-eq p1, v3, :cond_4

    .line 120
    .line 121
    move p1, v6

    .line 122
    goto :goto_2

    .line 123
    :cond_4
    move p1, v7

    .line 124
    :goto_2
    and-int/2addr p3, v6

    .line 125
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_7

    .line 130
    .line 131
    new-array p1, v7, [Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-nez p3, :cond_5

    .line 142
    .line 143
    if-ne v0, v2, :cond_6

    .line 144
    .line 145
    :cond_5
    new-instance v0, La/xx;

    .line 146
    .line 147
    const/16 p3, 0x19

    .line 148
    .line 149
    invoke-direct {v0, p0, p3}, La/xx;-><init>(La/pz40;B)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_6
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 156
    .line 157
    invoke-static {p1, v0, p2}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    sget-object p3, La/dgp0;->d:La/zfn;

    .line 162
    .line 163
    invoke-interface {p1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p3, p1}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    new-instance p3, La/lod;

    .line 172
    .line 173
    invoke-direct {p3, v5, v4, v6}, La/lod;-><init>(La/pod;Lkotlin/jvm/functions/Function2;B)V

    .line 174
    .line 175
    .line 176
    const v0, -0x41697ee5

    .line 177
    .line 178
    .line 179
    invoke-static {v0, p3, p2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    invoke-static {p1, p3, p2, v1}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 184
    .line 185
    .line 186
    iget-object p1, v5, La/pod;->d:La/j83;

    .line 187
    .line 188
    invoke-static {p1, p0, p2}, La/m0x0;->i(La/j83;La/pz40;La/fet;)V

    .line 189
    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 193
    .line 194
    .line 195
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object p0

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
