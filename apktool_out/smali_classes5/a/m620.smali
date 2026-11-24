.class public final synthetic La/m620;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b720;


# direct methods
.method public synthetic constructor <init>(La/b720;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/m620;->a:B

    iput-object p1, p0, La/m620;->b:La/b720;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/m620;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/m620;->b:La/b720;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/b720;->w2:La/evz;

    .line 9
    .line 10
    invoke-virtual {p0}, La/b720;->Q0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/p320;->a:La/p320;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    sget-object v0, La/b720;->w2:La/evz;

    .line 23
    .line 24
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_1
    sget-object v0, La/b720;->w2:La/evz;

    .line 31
    .line 32
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_2
    sget-object v0, La/b720;->w2:La/evz;

    .line 39
    .line 40
    invoke-virtual {p0}, La/b720;->Q0()La/k3t0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    sget-object v0, La/y420;->a:La/y420;

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
    :pswitch_3
    sget-object v0, La/b720;->w2:La/evz;

    .line 53
    .line 54
    invoke-virtual {p0}, La/b720;->Q0()La/k3t0;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    sget-object v0, La/x420;->a:La/x420;

    .line 59
    .line 60
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_4
    new-instance v0, La/q0h0;

    .line 67
    .line 68
    iget-object p0, p0, La/b720;->k2:La/mli;

    .line 69
    .line 70
    if-eqz p0, :cond_0

    .line 71
    .line 72
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_0
    const-string p0, "viewModelFactory"

    .line 77
    .line 78
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const/4 p0, 0x0

    .line 82
    throw p0

    .line 83
    :pswitch_5
    sget-object v0, La/b720;->w2:La/evz;

    .line 84
    .line 85
    invoke-virtual {p0}, La/b720;->Q0()La/k3t0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    sget-object v0, La/m320;->a:La/m320;

    .line 90
    .line 91
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_6
    sget-object v0, La/b720;->w2:La/evz;

    .line 98
    .line 99
    invoke-virtual {p0}, La/b720;->Q0()La/k3t0;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    sget-object v0, La/e420;->a:La/e420;

    .line 104
    .line 105
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_7
    sget-object v0, La/b720;->w2:La/evz;

    .line 112
    .line 113
    invoke-virtual {p0}, La/b720;->Q0()La/k3t0;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    sget-object v0, La/q320;->a:La/q320;

    .line 118
    .line 119
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_8
    sget-object v0, La/b720;->w2:La/evz;

    .line 126
    .line 127
    invoke-virtual {p0}, La/b720;->Q0()La/k3t0;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    sget-object v0, La/f520;->a:La/f520;

    .line 132
    .line 133
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_9
    sget-object v0, La/b720;->w2:La/evz;

    .line 140
    .line 141
    invoke-virtual {p0}, La/b720;->Q0()La/k3t0;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    sget-object v0, La/e520;->a:La/e520;

    .line 146
    .line 147
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_a
    sget-object v0, La/b720;->w2:La/evz;

    .line 154
    .line 155
    invoke-virtual {p0}, La/b720;->Q0()La/k3t0;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    sget-object v0, La/g420;->a:La/g420;

    .line 160
    .line 161
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
