.class public final synthetic La/ut60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xt60;


# direct methods
.method public synthetic constructor <init>(La/xt60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ut60;->a:B

    iput-object p1, p0, La/ut60;->b:La/xt60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/ut60;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/ut60;->b:La/xt60;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/xt60;->V1:La/xuz;

    .line 10
    .line 11
    invoke-virtual {p0}, La/xt60;->G0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/ct60;->a:La/ct60;

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
    sget-object v0, La/xt60;->V1:La/xuz;

    .line 24
    .line 25
    invoke-virtual {p0}, La/xt60;->G0()La/k3t0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v0, La/dt60;->a:La/dt60;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_1
    sget-object v0, La/xt60;->V1:La/xuz;

    .line 38
    .line 39
    invoke-virtual {p0}, La/xt60;->G0()La/k3t0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object v0, La/jt60;->a:La/jt60;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_2
    sget-object v0, La/xt60;->V1:La/xuz;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    instance-of v2, v0, La/af3;

    .line 65
    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    check-cast v0, La/af3;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move-object v0, v1

    .line 72
    :goto_0
    const-class v2, La/zya;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, La/o5d0;

    .line 85
    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/ze3;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move-object v0, v1

    .line 96
    :goto_1
    instance-of v3, v0, La/zya;

    .line 97
    .line 98
    if-nez v3, :cond_2

    .line 99
    .line 100
    move-object v0, v1

    .line 101
    :cond_2
    check-cast v0, La/zya;

    .line 102
    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {v0, p0}, La/zya;->a(La/i1w0;)La/rbi;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    goto :goto_2

    .line 114
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 115
    .line 116
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :goto_2
    return-object v1

    .line 124
    :pswitch_3
    sget-object v0, La/xt60;->V1:La/xuz;

    .line 125
    .line 126
    iget-object p0, p0, La/xt60;->M1:La/fiu0;

    .line 127
    .line 128
    if-eqz p0, :cond_4

    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_4
    const-string p0, "viewModelFactory"

    .line 132
    .line 133
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v1

    .line 137
    :pswitch_4
    sget-object v0, La/xt60;->V1:La/xuz;

    .line 138
    .line 139
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iget-object v1, p0, La/xt60;->K1:La/phf0;

    .line 144
    .line 145
    sget-object v2, La/xt60;->W1:[La/iiy;

    .line 146
    .line 147
    const/4 v3, 0x0

    .line 148
    aget-object v2, v2, v3

    .line 149
    .line 150
    invoke-virtual {v1, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    sget-object v2, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;->a:Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;

    .line 158
    .line 159
    invoke-static {v0, v2, v1}, La/o2t;->c(Landroidx/fragment/app/e;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, La/xt60;->G0()La/k3t0;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    sget-object v0, La/at60;->a:La/at60;

    .line 167
    .line 168
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_5
    sget-object v0, La/xt60;->V1:La/xuz;

    .line 175
    .line 176
    invoke-static {p0}, La/qxw;->y(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
