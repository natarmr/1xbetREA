.class public final synthetic La/zfn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bgn0;


# direct methods
.method public synthetic constructor <init>(La/bgn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zfn0;->a:B

    iput-object p1, p0, La/zfn0;->b:La/bgn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/zfn0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zfn0;->b:La/bgn0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/bgn0;->q2:La/j6m0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/bgn0;->P0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, La/rfn0;->a:La/rfn0;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    sget-object v0, La/bgn0;->q2:La/j6m0;

    .line 26
    .line 27
    invoke-virtual {p0}, La/bgn0;->P0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/sfn0;->a:La/sfn0;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_1
    sget-object v0, La/bgn0;->q2:La/j6m0;

    .line 43
    .line 44
    invoke-virtual {p0}, La/bgn0;->P0()La/k3t0;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    sget-object v0, La/tfn0;->a:La/tfn0;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_2
    sget-object v0, La/bgn0;->q2:La/j6m0;

    .line 57
    .line 58
    new-instance v0, La/q0h0;

    .line 59
    .line 60
    iget-object p0, p0, La/bgn0;->o2:La/a8z;

    .line 61
    .line 62
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/ivi;

    .line 67
    .line 68
    iget-object p0, p0, La/ivi;->c:La/n5d0;

    .line 69
    .line 70
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/hvi;

    .line 75
    .line 76
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_3
    sget-object v0, La/bgn0;->q2:La/j6m0;

    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    instance-of v1, v0, La/af3;

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    if-eqz v1, :cond_0

    .line 97
    .line 98
    check-cast v0, La/af3;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    move-object v0, v2

    .line 102
    :goto_0
    const-class v1, La/ign0;

    .line 103
    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, La/o5d0;

    .line 115
    .line 116
    if-eqz v0, :cond_1

    .line 117
    .line 118
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, La/ze3;

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_1
    move-object v0, v2

    .line 126
    :goto_1
    instance-of v3, v0, La/ign0;

    .line 127
    .line 128
    if-nez v3, :cond_2

    .line 129
    .line 130
    move-object v0, v2

    .line 131
    :cond_2
    check-cast v0, La/ign0;

    .line 132
    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    iget-object v1, p0, La/bgn0;->l2:La/khf0;

    .line 136
    .line 137
    sget-object v2, La/bgn0;->r2:[La/iiy;

    .line 138
    .line 139
    const/4 v3, 0x1

    .line 140
    aget-object v2, v2, v3

    .line 141
    .line 142
    invoke-virtual {v1, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    check-cast p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 147
    .line 148
    iget-object v0, v0, La/ign0;->a:La/sd60;

    .line 149
    .line 150
    new-instance v2, La/ivi;

    .line 151
    .line 152
    invoke-direct {v2, v0, p0}, La/ivi;-><init>(La/sd60;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 157
    .line 158
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :goto_2
    return-object v2

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
