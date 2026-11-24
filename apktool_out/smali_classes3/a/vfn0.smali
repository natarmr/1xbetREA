.class public final synthetic La/vfn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wfn0;


# direct methods
.method public synthetic constructor <init>(La/wfn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vfn0;->a:B

    iput-object p1, p0, La/vfn0;->b:La/wfn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/vfn0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vfn0;->b:La/wfn0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wfn0;->e2:La/s2m0;

    .line 9
    .line 10
    iget-object v0, p0, La/wfn0;->d2:La/a8z;

    .line 11
    .line 12
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, La/k3t0;

    .line 17
    .line 18
    sget-object v1, La/rfn0;->a:La/rfn0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, La/sik;->y0()V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    sget-object v0, La/wfn0;->e2:La/s2m0;

    .line 30
    .line 31
    iget-object v0, p0, La/wfn0;->d2:La/a8z;

    .line 32
    .line 33
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, La/k3t0;

    .line 38
    .line 39
    sget-object v1, La/sfn0;->a:La/sfn0;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, La/sik;->y0()V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    sget-object v0, La/wfn0;->e2:La/s2m0;

    .line 51
    .line 52
    iget-object p0, p0, La/wfn0;->d2:La/a8z;

    .line 53
    .line 54
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/k3t0;

    .line 59
    .line 60
    sget-object v0, La/tfn0;->a:La/tfn0;

    .line 61
    .line 62
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_2
    sget-object v0, La/wfn0;->e2:La/s2m0;

    .line 69
    .line 70
    new-instance v0, La/q0h0;

    .line 71
    .line 72
    iget-object p0, p0, La/wfn0;->c2:La/a8z;

    .line 73
    .line 74
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, La/ivi;

    .line 79
    .line 80
    iget-object p0, p0, La/ivi;->c:La/n5d0;

    .line 81
    .line 82
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, La/hvi;

    .line 87
    .line 88
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 89
    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_3
    sget-object v0, La/wfn0;->e2:La/s2m0;

    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    instance-of v1, v0, La/af3;

    .line 106
    .line 107
    const/4 v2, 0x0

    .line 108
    if-eqz v1, :cond_0

    .line 109
    .line 110
    check-cast v0, La/af3;

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_0
    move-object v0, v2

    .line 114
    :goto_0
    const-class v1, La/ign0;

    .line 115
    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, La/o5d0;

    .line 127
    .line 128
    if-eqz v0, :cond_1

    .line 129
    .line 130
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, La/ze3;

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_1
    move-object v0, v2

    .line 138
    :goto_1
    instance-of v3, v0, La/ign0;

    .line 139
    .line 140
    if-nez v3, :cond_2

    .line 141
    .line 142
    move-object v0, v2

    .line 143
    :cond_2
    check-cast v0, La/ign0;

    .line 144
    .line 145
    if-eqz v0, :cond_3

    .line 146
    .line 147
    iget-object v1, p0, La/wfn0;->Z1:La/khf0;

    .line 148
    .line 149
    sget-object v2, La/wfn0;->f2:[La/iiy;

    .line 150
    .line 151
    const/4 v3, 0x1

    .line 152
    aget-object v2, v2, v3

    .line 153
    .line 154
    invoke-virtual {v1, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    check-cast p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 159
    .line 160
    iget-object v0, v0, La/ign0;->a:La/sd60;

    .line 161
    .line 162
    new-instance v2, La/ivi;

    .line 163
    .line 164
    invoke-direct {v2, v0, p0}, La/ivi;-><init>(La/sd60;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 169
    .line 170
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :goto_2
    return-object v2

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
