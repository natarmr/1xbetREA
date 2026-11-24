.class public final synthetic La/k71;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m71;


# direct methods
.method public synthetic constructor <init>(La/m71;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k71;->a:B

    iput-object p1, p0, La/k71;->b:La/m71;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/k71;->a:B

    .line 2
    .line 3
    sget-object v1, La/l61;->a:La/l61;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, La/q61;->a:La/q61;

    .line 7
    .line 8
    iget-object p0, p0, La/k71;->b:La/m71;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/m71;->e2:La/rek0;

    .line 14
    .line 15
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v0, La/k61;->a:La/k61;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    sget-object v0, La/m71;->e2:La/rek0;

    .line 28
    .line 29
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_1
    sget-object v0, La/m71;->e2:La/rek0;

    .line 40
    .line 41
    iget-object p0, p0, La/m71;->Z1:La/fiu0;

    .line 42
    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_0
    const-string p0, "viewModelFactory"

    .line 47
    .line 48
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v2

    .line 52
    :pswitch_2
    sget-object v0, La/m71;->e2:La/rek0;

    .line 53
    .line 54
    invoke-static {}, La/j120;->V()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/4 v1, 0x0

    .line 59
    new-array v1, v1, [Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p0, v0, v1}, La/m7x;->Q(Landroidx/fragment/app/Fragment;Ljava/lang/String;[Ljava/lang/String;)La/khf0;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-eqz p0, :cond_1

    .line 66
    .line 67
    invoke-virtual {p0}, La/khf0;->d()La/qog0;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    :cond_1
    return-object v2

    .line 72
    :pswitch_3
    sget-object v0, La/m71;->e2:La/rek0;

    .line 73
    .line 74
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_4
    sget-object v0, La/m71;->e2:La/rek0;

    .line 85
    .line 86
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_5
    sget-object v0, La/m71;->e2:La/rek0;

    .line 97
    .line 98
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    sget-object v0, La/n61;->a:La/n61;

    .line 103
    .line 104
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_6
    sget-object v0, La/m71;->e2:La/rek0;

    .line 111
    .line 112
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_7
    sget-object v0, La/m71;->e2:La/rek0;

    .line 123
    .line 124
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_8
    sget-object v0, La/m71;->e2:La/rek0;

    .line 135
    .line 136
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_9
    sget-object v0, La/m71;->e2:La/rek0;

    .line 147
    .line 148
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object p0

    .line 158
    :pswitch_a
    sget-object v0, La/m71;->e2:La/rek0;

    .line 159
    .line 160
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p0, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0

    .line 170
    :pswitch_b
    sget-object v0, La/m71;->e2:La/rek0;

    .line 171
    .line 172
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {p0, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_c
    sget-object v0, La/m71;->e2:La/rek0;

    .line 183
    .line 184
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    sget-object v0, La/s61;->a:La/s61;

    .line 189
    .line 190
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_d
    sget-object v0, La/m71;->e2:La/rek0;

    .line 197
    .line 198
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    sget-object v0, La/y61;->a:La/y61;

    .line 203
    .line 204
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object p0

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
