.class public final synthetic La/bnc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gnc;


# direct methods
.method public synthetic constructor <init>(La/gnc;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bnc;->a:B

    iput-object p1, p0, La/bnc;->b:La/gnc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/bnc;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/bnc;->b:La/gnc;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/on60;

    .line 9
    .line 10
    sget-object p0, La/gnc;->Z1:La/kl5;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, La/gnc;->O0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, La/kb80;

    .line 20
    .line 21
    invoke-direct {v0, p1}, La/kb80;-><init>(La/on60;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, La/dn60;

    .line 31
    .line 32
    sget-object p0, La/gnc;->Z1:La/kl5;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, La/gnc;->O0()La/k3t0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v0, La/rb80;

    .line 42
    .line 43
    invoke-direct {v0, p1}, La/rb80;-><init>(La/dn60;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_1
    check-cast p1, Ljava/lang/Long;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide p0

    .line 58
    sget-object v0, La/gnc;->Z1:La/kl5;

    .line 59
    .line 60
    invoke-virtual {v1}, La/gnc;->O0()La/k3t0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v2, La/lb80;->a:La/lb80;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, La/gnc;->R0()La/k3t0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v1, La/dm2;

    .line 74
    .line 75
    invoke-direct {v1, p0, p1}, La/dm2;-><init>(J)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_2
    check-cast p1, La/lwk;

    .line 85
    .line 86
    sget-object v0, La/gnc;->Z1:La/kl5;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object v2, p0, La/bnc;->b:La/gnc;

    .line 92
    .line 93
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    new-instance v3, La/bnc;

    .line 98
    .line 99
    const/4 p0, 0x3

    .line 100
    invoke-direct {v3, v2, p0}, La/bnc;-><init>(La/gnc;B)V

    .line 101
    .line 102
    .line 103
    new-instance v4, La/zmc;

    .line 104
    .line 105
    const/16 p0, 0xb

    .line 106
    .line 107
    invoke-direct {v4, v2, p0}, La/zmc;-><init>(La/gnc;B)V

    .line 108
    .line 109
    .line 110
    const/4 v5, 0x0

    .line 111
    const/16 v6, 0x12

    .line 112
    .line 113
    invoke-static/range {v1 .. v6}, La/o2t;->e(Landroidx/fragment/app/e;La/clz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/bm60;I)V

    .line 114
    .line 115
    .line 116
    new-instance p0, La/ty2;

    .line 117
    .line 118
    const/4 p1, 0x7

    .line 119
    invoke-direct {p0, v2, p1}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_3
    check-cast p1, La/dn60;

    .line 124
    .line 125
    sget-object p0, La/gnc;->Z1:La/kl5;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, La/gnc;->O0()La/k3t0;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    new-instance v0, La/rb80;

    .line 135
    .line 136
    invoke-direct {v0, p1}, La/rb80;-><init>(La/dn60;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_4
    check-cast p1, La/uid;

    .line 146
    .line 147
    sget-object p0, La/gnc;->Z1:La/kl5;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, La/gnc;->R0()La/k3t0;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    new-instance v0, La/jm2;

    .line 157
    .line 158
    invoke-direct {v0, p1}, La/jm2;-><init>(La/uid;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, La/gnc;->O0()La/k3t0;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    new-instance v0, La/xb80;

    .line 169
    .line 170
    invoke-direct {v0, p1}, La/xb80;-><init>(La/uid;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1}, La/gnc;->P0()La/k3t0;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    new-instance v0, La/sf2;

    .line 181
    .line 182
    invoke-direct {v0, p1}, La/sf2;-><init>(La/uid;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
