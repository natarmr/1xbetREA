.class public final synthetic La/con0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/don0;


# direct methods
.method public synthetic constructor <init>(La/don0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/con0;->a:B

    iput-object p1, p0, La/con0;->b:La/don0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/con0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/con0;->b:La/don0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/don0;->n2:La/m6m0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/don0;->Q0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/ion0;->a:La/ion0;

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
    sget-object v0, La/don0;->n2:La/m6m0;

    .line 23
    .line 24
    invoke-virtual {p0}, La/don0;->Q0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object v0, La/hon0;->a:La/hon0;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    sget-object v0, La/don0;->n2:La/m6m0;

    .line 37
    .line 38
    invoke-virtual {p0}, La/don0;->Q0()La/k3t0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object v0, La/gon0;->a:La/gon0;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_2
    new-instance v0, La/q0h0;

    .line 51
    .line 52
    iget-object p0, p0, La/don0;->l2:La/a8z;

    .line 53
    .line 54
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/ovi;

    .line 59
    .line 60
    iget-object p0, p0, La/ovi;->c:La/n5d0;

    .line 61
    .line 62
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/nvi;

    .line 67
    .line 68
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_3
    sget-object v0, La/don0;->n2:La/m6m0;

    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    instance-of v1, v0, La/af3;

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    if-eqz v1, :cond_0

    .line 89
    .line 90
    check-cast v0, La/af3;

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    move-object v0, v2

    .line 94
    :goto_0
    const-class v1, La/lon0;

    .line 95
    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, La/o5d0;

    .line 107
    .line 108
    if-eqz v0, :cond_1

    .line 109
    .line 110
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, La/ze3;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    move-object v0, v2

    .line 118
    :goto_1
    instance-of v3, v0, La/lon0;

    .line 119
    .line 120
    if-nez v3, :cond_2

    .line 121
    .line 122
    move-object v0, v2

    .line 123
    :cond_2
    check-cast v0, La/lon0;

    .line 124
    .line 125
    if-eqz v0, :cond_3

    .line 126
    .line 127
    iget-object v1, p0, La/don0;->k2:La/khf0;

    .line 128
    .line 129
    sget-object v2, La/don0;->o2:[La/iiy;

    .line 130
    .line 131
    const/4 v3, 0x0

    .line 132
    aget-object v2, v2, v3

    .line 133
    .line 134
    invoke-virtual {v1, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    check-cast p0, Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;

    .line 139
    .line 140
    iget-object v0, v0, La/lon0;->a:La/xzp;

    .line 141
    .line 142
    new-instance v2, La/ovi;

    .line 143
    .line 144
    invoke-direct {v2, v0, p0}, La/ovi;-><init>(La/xzp;Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 149
    .line 150
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :goto_2
    return-object v2

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
