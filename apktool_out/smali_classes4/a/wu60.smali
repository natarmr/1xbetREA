.class public final synthetic La/wu60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hv60;


# direct methods
.method public synthetic constructor <init>(La/hv60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wu60;->a:B

    iput-object p1, p0, La/wu60;->b:La/hv60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/wu60;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wu60;->b:La/hv60;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/hv60;->N(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, La/hv60;->I:La/uf3;

    .line 25
    .line 26
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, La/ru60;

    .line 31
    .line 32
    iget-wide v1, p0, La/ru60;->f:J

    .line 33
    .line 34
    iget-object p0, v0, La/uf3;->a:La/oct;

    .line 35
    .line 36
    iget-object p0, p0, La/oct;->b:La/r9u;

    .line 37
    .line 38
    sget-object v0, La/ygp;->y1:La/ygp;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, La/m1q0;->d(La/ygp;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_0

    .line 55
    .line 56
    new-instance p0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$CashbackChoosingFragmentScreen;

    .line 57
    .line 58
    invoke-direct {p0, v1, v2}, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$CashbackChoosingFragmentScreen;-><init>(J)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    new-instance p0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$CashbackChoosingFragmentScreenOld;

    .line 63
    .line 64
    invoke-direct {p0, v1, v2}, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$CashbackChoosingFragmentScreenOld;-><init>(J)V

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, La/hv60;->N:La/rjo;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    instance-of v0, p1, La/qct;

    .line 84
    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    instance-of v0, p1, La/zhi0;

    .line 89
    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-nez v0, :cond_2

    .line 97
    .line 98
    const-string v0, ""

    .line 99
    .line 100
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    :cond_3
    const/4 v0, 0x0

    .line 107
    :cond_4
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    .line 108
    .line 109
    if-nez v1, :cond_6

    .line 110
    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, La/ru60;

    .line 118
    .line 119
    iget-boolean v1, v1, La/ru60;->d:Z

    .line 120
    .line 121
    if-eqz v1, :cond_5

    .line 122
    .line 123
    new-instance p1, La/pu60;

    .line 124
    .line 125
    invoke-direct {p1, v0}, La/pu60;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    invoke-virtual {p0, p1}, La/hv60;->N(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    :goto_2
    const/4 p1, 0x0

    .line 136
    invoke-virtual {p0, p1}, La/hv60;->O(Z)V

    .line 137
    .line 138
    .line 139
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
