.class public final synthetic La/miw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/piw;


# direct methods
.method public synthetic constructor <init>(La/piw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/miw;->a:B

    iput-object p1, p0, La/miw;->b:La/piw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/miw;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/miw;->b:La/piw;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/piw;->Y1:La/sqt;

    .line 10
    .line 11
    invoke-virtual {p0}, La/piw;->H0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/dgw;->a:La/dgw;

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
    sget-object v0, La/piw;->Y1:La/sqt;

    .line 24
    .line 25
    invoke-virtual {p0}, La/piw;->H0()La/k3t0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v0, La/fgw;->a:La/fgw;

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
    sget-object v0, La/piw;->Y1:La/sqt;

    .line 38
    .line 39
    invoke-virtual {p0}, La/piw;->H0()La/k3t0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object v0, La/ogw;->a:La/ogw;

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
    iget-object p0, p0, La/piw;->M1:La/pru;

    .line 52
    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget-object p0, p0, La/sff0;->c:La/ech;

    .line 60
    .line 61
    iget-object p0, p0, La/ech;->o:La/g5h;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_0
    const-string p0, "getRemoteConfigUseCase"

    .line 65
    .line 66
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v1

    .line 70
    :pswitch_3
    sget-object v0, La/piw;->Y1:La/sqt;

    .line 71
    .line 72
    iget-object p0, p0, La/piw;->K1:La/fiu0;

    .line 73
    .line 74
    if-eqz p0, :cond_1

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_1
    const-string p0, "viewModelFactory"

    .line 78
    .line 79
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :pswitch_4
    sget-object v0, La/piw;->Y1:La/sqt;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    instance-of v2, v0, La/af3;

    .line 97
    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    check-cast v0, La/af3;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    move-object v0, v1

    .line 104
    :goto_0
    const-class v2, La/k1h;

    .line 105
    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, La/o5d0;

    .line 117
    .line 118
    if-eqz v0, :cond_3

    .line 119
    .line 120
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, La/ze3;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    move-object v0, v1

    .line 128
    :goto_1
    instance-of v3, v0, La/k1h;

    .line 129
    .line 130
    if-nez v3, :cond_4

    .line 131
    .line 132
    move-object v0, v1

    .line 133
    :cond_4
    check-cast v0, La/k1h;

    .line 134
    .line 135
    if-eqz v0, :cond_5

    .line 136
    .line 137
    invoke-virtual {p0}, La/piw;->G0()Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {v0, p0}, La/k1h;->a(Lorg/xplatform/cyber/section/api/home/CyberHomeParams;)La/yii;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    goto :goto_2

    .line 146
    :cond_5
    const-string p0, "Cannot create dependency "

    .line 147
    .line 148
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :goto_2
    return-object v1

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
