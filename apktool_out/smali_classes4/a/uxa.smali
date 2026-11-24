.class public final synthetic La/uxa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wxa;


# direct methods
.method public synthetic constructor <init>(La/wxa;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uxa;->a:B

    iput-object p1, p0, La/uxa;->b:La/wxa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/uxa;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/uxa;->b:La/wxa;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/wxa;->U1:La/kl5;

    .line 10
    .line 11
    invoke-virtual {p0}, La/wxa;->G0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/gxa;->a:La/gxa;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    sget-object v0, La/wxa;->U1:La/kl5;

    .line 24
    .line 25
    invoke-virtual {p0}, La/wxa;->G0()La/k3t0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, La/hxa;

    .line 30
    .line 31
    iget-object v2, p0, La/wxa;->K1:La/r34;

    .line 32
    .line 33
    sget-object v3, La/wxa;->V1:[La/iiy;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    aget-object v3, v3, v4

    .line 37
    .line 38
    invoke-virtual {v2, p0, v3}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    invoke-direct {v1, v2, v3}, La/hxa;-><init>(J)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_1
    sget-object v0, La/wxa;->U1:La/kl5;

    .line 56
    .line 57
    invoke-virtual {p0}, La/wxa;->G0()La/k3t0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    sget-object v0, La/pxa;->a:La/pxa;

    .line 62
    .line 63
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_2
    sget-object v0, La/wxa;->U1:La/kl5;

    .line 70
    .line 71
    invoke-virtual {p0}, La/wxa;->G0()La/k3t0;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    sget-object v0, La/nxa;->a:La/nxa;

    .line 76
    .line 77
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_3
    sget-object v0, La/wxa;->U1:La/kl5;

    .line 84
    .line 85
    invoke-virtual {p0}, La/wxa;->G0()La/k3t0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    sget-object v0, La/oxa;->a:La/oxa;

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
    :pswitch_4
    sget-object v0, La/wxa;->U1:La/kl5;

    .line 98
    .line 99
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    instance-of v2, v0, La/af3;

    .line 111
    .line 112
    if-eqz v2, :cond_0

    .line 113
    .line 114
    check-cast v0, La/af3;

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_0
    move-object v0, v1

    .line 118
    :goto_0
    const-class v2, La/zya;

    .line 119
    .line 120
    if-eqz v0, :cond_3

    .line 121
    .line 122
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, La/o5d0;

    .line 131
    .line 132
    if-eqz v0, :cond_1

    .line 133
    .line 134
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, La/ze3;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_1
    move-object v0, v1

    .line 142
    :goto_1
    instance-of v3, v0, La/zya;

    .line 143
    .line 144
    if-nez v3, :cond_2

    .line 145
    .line 146
    move-object v0, v1

    .line 147
    :cond_2
    check-cast v0, La/zya;

    .line 148
    .line 149
    if-eqz v0, :cond_3

    .line 150
    .line 151
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {v0, p0}, La/zya;->a(La/i1w0;)La/rbi;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    goto :goto_2

    .line 160
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 161
    .line 162
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :goto_2
    return-object v1

    .line 170
    :pswitch_5
    sget-object v0, La/wxa;->U1:La/kl5;

    .line 171
    .line 172
    iget-object p0, p0, La/wxa;->M1:La/fiu0;

    .line 173
    .line 174
    if-eqz p0, :cond_4

    .line 175
    .line 176
    return-object p0

    .line 177
    :cond_4
    const-string p0, "viewModelFactory"

    .line 178
    .line 179
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v1

    .line 183
    :pswitch_6
    sget-object v0, La/wxa;->U1:La/kl5;

    .line 184
    .line 185
    invoke-virtual {p0}, La/wxa;->G0()La/k3t0;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    sget-object v0, La/ixa;->a:La/ixa;

    .line 190
    .line 191
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object p0

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
