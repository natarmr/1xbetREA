.class public final synthetic La/sxv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/txv0;


# direct methods
.method public synthetic constructor <init>(La/txv0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sxv0;->a:B

    iput-object p1, p0, La/sxv0;->b:La/txv0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/sxv0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/sxv0;->b:La/txv0;

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x1

    .line 8
    check-cast p1, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    and-int/lit8 v0, p2, 0x3

    .line 20
    .line 21
    if-eq v0, v2, :cond_0

    .line 22
    .line 23
    move v0, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v1

    .line 26
    :goto_0
    and-int/2addr p2, v3

    .line 27
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    iget-object p0, p0, La/txv0;->b:La/ob50;

    .line 34
    .line 35
    invoke-virtual {p0, v1, p1}, La/ob50;->a(ILa/fet;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 40
    .line 41
    .line 42
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 46
    .line 47
    if-eq v0, v2, :cond_2

    .line 48
    .line 49
    move v0, v3

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move v0, v1

    .line 52
    :goto_2
    and-int/2addr p2, v3

    .line 53
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eqz p2, :cond_5

    .line 58
    .line 59
    invoke-static {v1, p1}, La/tnq0;->f(ILa/fet;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-nez p2, :cond_3

    .line 71
    .line 72
    sget-object p2, La/ukd;->a:La/cl5;

    .line 73
    .line 74
    if-ne v0, p2, :cond_4

    .line 75
    .line 76
    :cond_3
    new-instance v0, La/jmv0;

    .line 77
    .line 78
    const/16 p2, 0xc

    .line 79
    .line 80
    invoke-direct {v0, p0, p2}, La/jmv0;-><init>(Ljava/lang/Object;B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 87
    .line 88
    invoke-static {v1, p1, v0}, La/iym0;->c(ILa/fet;Lkotlin/jvm/functions/Function0;)V

    .line 89
    .line 90
    .line 91
    const/4 p2, 0x0

    .line 92
    const/4 v0, 0x3

    .line 93
    invoke-static {p2, p1, v0}, La/r8x;->V(La/lkz;La/fet;I)La/wjd;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    sget-object v0, La/or00;->a:La/zfn;

    .line 98
    .line 99
    invoke-virtual {v0, p2}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    sget-object v0, La/ps00;->a:La/zfn;

    .line 104
    .line 105
    iget-object v1, p0, La/txv0;->e:La/mwv0;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sget-object v1, La/luv0;->a:La/zfn;

    .line 112
    .line 113
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {v1, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    filled-new-array {p2, v0, v1}, [La/l5d0;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    new-instance v0, La/sxv0;

    .line 124
    .line 125
    invoke-direct {v0, p0, v2}, La/sxv0;-><init>(La/txv0;B)V

    .line 126
    .line 127
    .line 128
    const p0, 0x21b1a9bf

    .line 129
    .line 130
    .line 131
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    const/16 v0, 0x30

    .line 136
    .line 137
    invoke-static {p2, p0, p1, v0}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 142
    .line 143
    .line 144
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_1
    and-int/lit8 v0, p2, 0x3

    .line 148
    .line 149
    if-eq v0, v2, :cond_6

    .line 150
    .line 151
    move v0, v3

    .line 152
    goto :goto_4

    .line 153
    :cond_6
    move v0, v1

    .line 154
    :goto_4
    and-int/2addr p2, v3

    .line 155
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    if-eqz p2, :cond_7

    .line 160
    .line 161
    iget-object p2, p0, La/txv0;->g:Lkotlin/jvm/functions/Function0;

    .line 162
    .line 163
    new-instance v0, La/fjk;

    .line 164
    .line 165
    const/16 v2, 0xe4

    .line 166
    .line 167
    invoke-direct {v0, v2, v1, v1, v1}, La/fjk;-><init>(IZZZ)V

    .line 168
    .line 169
    .line 170
    new-instance v1, La/sxv0;

    .line 171
    .line 172
    invoke-direct {v1, p0, v3}, La/sxv0;-><init>(La/txv0;B)V

    .line 173
    .line 174
    .line 175
    const p0, 0x513cb67f

    .line 176
    .line 177
    .line 178
    invoke-static {p0, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    const/16 v1, 0x180

    .line 183
    .line 184
    invoke-static {p2, v0, p0, p1, v1}, La/y9a;->q(Lkotlin/jvm/functions/Function0;La/fjk;La/ugd;La/fet;I)V

    .line 185
    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_7
    invoke-virtual {p1}, La/fet;->X()V

    .line 189
    .line 190
    .line 191
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p0

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
