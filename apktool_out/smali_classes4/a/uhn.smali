.class public final synthetic La/uhn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uzq;

.field public final synthetic c:La/whn;


# direct methods
.method public synthetic constructor <init>(La/uzq;La/whn;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/uhn;->a:B

    iput-object p1, p0, La/uhn;->b:La/uzq;

    iput-object p2, p0, La/uhn;->c:La/whn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/uhn;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, La/uhn;->c:La/whn;

    .line 7
    .line 8
    iget-object p0, p0, La/uhn;->b:La/uzq;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/whn;->O1:[La/iiy;

    .line 14
    .line 15
    iget-object p0, p0, La/uzq;->b:Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;

    .line 16
    .line 17
    invoke-virtual {p0, v3}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->v(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v4}, La/whn;->H0()La/kin;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    iget-object v0, v7, La/kin;->d:La/lzt;

    .line 25
    .line 26
    invoke-virtual {v0}, La/lzt;->a()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, v7, La/kin;->t:La/bby;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-ne v0, v2, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v4, v7, La/kin;->f:La/mne;

    .line 49
    .line 50
    iget-object v4, v4, La/mne;->c:La/vs10;

    .line 51
    .line 52
    new-instance v5, La/hin;

    .line 53
    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v12, 0x0

    .line 56
    const/4 v6, 0x1

    .line 57
    const-class v8, La/kin;

    .line 58
    .line 59
    const-string v9, "handleGameError"

    .line 60
    .line 61
    const-string v10, "handleGameError(Ljava/lang/Throwable;)V"

    .line 62
    .line 63
    invoke-direct/range {v5 .. v12}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 64
    .line 65
    .line 66
    new-instance v12, La/gin;

    .line 67
    .line 68
    invoke-direct {v12, v7, v1, v2}, La/gin;-><init>(La/kin;La/yje;B)V

    .line 69
    .line 70
    .line 71
    const/16 v13, 0xa

    .line 72
    .line 73
    const/4 v10, 0x0

    .line 74
    move-object v8, v0

    .line 75
    move-object v11, v4

    .line 76
    move-object v9, v5

    .line 77
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, v7, La/kin;->t:La/bby;

    .line 82
    .line 83
    :goto_0
    iget-object p0, p0, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->s:Landroid/widget/Button;

    .line 84
    .line 85
    invoke-virtual {p0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_0
    sget-object v0, La/whn;->O1:[La/iiy;

    .line 92
    .line 93
    iget-object p0, p0, La/uzq;->b:Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;

    .line 94
    .line 95
    iget-object v0, p0, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->s:Landroid/widget/Button;

    .line 96
    .line 97
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v2}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->v(Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, La/whn;->H0()La/kin;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    iget-object p0, p0, La/kin;->y:La/p7m0;

    .line 108
    .line 109
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_1
    sget-object v0, La/whn;->O1:[La/iiy;

    .line 121
    .line 122
    iget-object p0, p0, La/uzq;->b:Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;

    .line 123
    .line 124
    invoke-virtual {p0, v3}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->C(Z)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4}, La/whn;->H0()La/kin;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iget-object v0, v7, La/kin;->f:La/mne;

    .line 136
    .line 137
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 138
    .line 139
    new-instance v5, La/k0l;

    .line 140
    .line 141
    const/4 v11, 0x0

    .line 142
    const/16 v12, 0x1c

    .line 143
    .line 144
    const/4 v6, 0x1

    .line 145
    const-class v8, La/kin;

    .line 146
    .line 147
    const-string v9, "handleEasternNightsError"

    .line 148
    .line 149
    const-string v10, "handleEasternNightsError(Ljava/lang/Throwable;)V"

    .line 150
    .line 151
    invoke-direct/range {v5 .. v12}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 152
    .line 153
    .line 154
    new-instance v12, La/gin;

    .line 155
    .line 156
    invoke-direct {v12, v7, v1, v3}, La/gin;-><init>(La/kin;La/yje;B)V

    .line 157
    .line 158
    .line 159
    const/16 v13, 0xa

    .line 160
    .line 161
    const/4 v10, 0x0

    .line 162
    move-object v8, p0

    .line 163
    move-object v11, v0

    .line 164
    move-object v9, v5

    .line 165
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 166
    .line 167
    .line 168
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
