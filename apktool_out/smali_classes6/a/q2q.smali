.class public final synthetic La/q2q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/u2q;


# direct methods
.method public synthetic constructor <init>(La/u2q;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q2q;->a:B

    iput-object p1, p0, La/q2q;->b:La/u2q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/q2q;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/q2q;->b:La/u2q;

    .line 5
    .line 6
    check-cast p1, Landroid/view/View;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/u2q;->h2:La/nek;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, La/u2q;->f2:La/phf0;

    .line 17
    .line 18
    sget-object v0, La/u2q;->i2:[La/iiy;

    .line 19
    .line 20
    aget-object v2, v0, v1

    .line 21
    .line 22
    invoke-virtual {p1, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    aget-object v0, v0, v1

    .line 27
    .line 28
    invoke-virtual {p1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v0, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionResultUiModel;

    .line 33
    .line 34
    invoke-virtual {p0}, La/u2q;->T0()Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-wide v3, v1, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;->b:J

    .line 39
    .line 40
    invoke-virtual {p0}, La/u2q;->T0()Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v1, v1, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;->d:La/ji;

    .line 45
    .line 46
    iget v1, v1, La/ji;->a:I

    .line 47
    .line 48
    invoke-direct {v0, v3, v4, v1}, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionResultUiModel;-><init>(JI)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Lkotlin/Pair;

    .line 52
    .line 53
    invoke-direct {v1, p1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1, p0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_0
    sget-object v0, La/u2q;->h2:La/nek;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, La/u2q;->f2:La/phf0;

    .line 79
    .line 80
    sget-object v0, La/u2q;->i2:[La/iiy;

    .line 81
    .line 82
    aget-object v2, v0, v1

    .line 83
    .line 84
    invoke-virtual {p1, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    aget-object v0, v0, v1

    .line 89
    .line 90
    invoke-virtual {p1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    new-instance v0, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionResultUiModel;

    .line 95
    .line 96
    invoke-virtual {p0}, La/u2q;->T0()Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-wide v3, v1, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;->b:J

    .line 101
    .line 102
    invoke-virtual {p0}, La/u2q;->T0()Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget-object v1, v1, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;->c:La/ji;

    .line 107
    .line 108
    iget v1, v1, La/ji;->a:I

    .line 109
    .line 110
    invoke-direct {v0, v3, v4, v1}, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionResultUiModel;-><init>(JI)V

    .line 111
    .line 112
    .line 113
    new-instance v1, Lkotlin/Pair;

    .line 114
    .line 115
    invoke-direct {v1, p1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-static {p1, p0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 130
    .line 131
    .line 132
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p0

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
