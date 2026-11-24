.class public final synthetic La/nva;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nva;->a:B

    iput-object p1, p0, La/nva;->c:Ljava/lang/Object;

    iput p2, p0, La/nva;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-byte p1, p0, La/nva;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    iget v2, p0, La/nva;->b:I

    .line 6
    .line 7
    iget-object p0, p0, La/nva;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/b1a0;

    .line 13
    .line 14
    iget-object p1, p0, La/b1a0;->g:Landroidx/media3/ui/PlayerControlView;

    .line 15
    .line 16
    iget v0, p0, La/b1a0;->f:I

    .line 17
    .line 18
    if-eq v2, v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, La/b1a0;->e:[F

    .line 21
    .line 22
    aget p0, p0, v2

    .line 23
    .line 24
    invoke-static {p1, p0}, Landroidx/media3/ui/PlayerControlView;->a(Landroidx/media3/ui/PlayerControlView;F)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object p0, p1, Landroidx/media3/ui/PlayerControlView;->r:Landroid/widget/PopupWindow;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    check-cast p0, La/ox50;

    .line 34
    .line 35
    iget-object p1, p0, La/ox50;->b:La/rh60;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget-boolean v3, p0, La/ox50;->c:Z

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    move-object v1, p1

    .line 44
    :cond_1
    if-eqz v1, :cond_2

    .line 45
    .line 46
    iput-boolean v0, p0, La/ox50;->c:Z

    .line 47
    .line 48
    iput v2, p0, La/ox50;->d:I

    .line 49
    .line 50
    invoke-interface {p1, v2}, La/rh60;->c(I)V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void

    .line 54
    :pswitch_1
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 55
    .line 56
    sget p1, Lorg/xplatform/games_section/feature/weekly_reward/presentation/custom_veiw/DaysProgressView;->b:I

    .line 57
    .line 58
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_2
    check-cast p0, La/dbe;

    .line 67
    .line 68
    sget-object p1, La/dbe;->k2:La/kud;

    .line 69
    .line 70
    invoke-virtual {p0}, La/dbe;->U0()La/ibe;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    new-instance p1, La/h9e0;

    .line 75
    .line 76
    add-int/2addr v2, v0

    .line 77
    invoke-direct {p1, v2}, La/h9e0;-><init>(I)V

    .line 78
    .line 79
    .line 80
    iget-object v3, p0, La/ibe;->b:La/p7m0;

    .line 81
    .line 82
    :cond_3
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    move-object v2, p0

    .line 87
    check-cast v2, La/hbe;

    .line 88
    .line 89
    invoke-static {v2, v1, p1, v0}, La/hbe;->a(La/hbe;La/vsf0;La/h9e0;I)La/hbe;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v3, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_3

    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_3
    check-cast p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;

    .line 101
    .line 102
    sget p1, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->f:I

    .line 103
    .line 104
    invoke-virtual {p0, v2}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->setupViewIndex(I)V

    .line 105
    .line 106
    .line 107
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->d:Lkotlin/jvm/functions/Function1;

    .line 108
    .line 109
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
