.class public final synthetic La/gcb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r4b0;


# direct methods
.method public synthetic constructor <init>(La/r4b0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gcb;->a:B

    iput-object p1, p0, La/gcb;->b:La/r4b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/gcb;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/gcb;->b:La/r4b0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, La/r4b0;->n:La/mne;

    .line 19
    .line 20
    iget-object v1, v1, La/mne;->c:La/vs10;

    .line 21
    .line 22
    new-instance v2, La/bh0;

    .line 23
    .line 24
    const/16 v3, 0x15

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-direct {v2, p0, p1, v4, v3}, La/bh0;-><init>(La/diu0;ILa/yje;B)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x2

    .line 31
    invoke-static {v0, v1, v4, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, La/r4b0;->f:La/ivn;

    .line 43
    .line 44
    new-instance v1, La/gcb;

    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    invoke-direct {v1, p0, v2}, La/gcb;-><init>(La/r4b0;B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1, v1}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_1
    check-cast p1, La/cp;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 62
    .line 63
    check-cast v0, La/z3b0;

    .line 64
    .line 65
    iget-object v1, v0, La/z3b0;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 66
    .line 67
    new-instance v2, La/icb;

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    invoke-direct {v2, p0, p1, v3}, La/icb;-><init>(La/r4b0;La/cp;B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setActionIconClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, v0, La/z3b0;->a:Lorg/xplatform/uikit_sport/sport_cell/DsSportCell;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v1, La/hcb;

    .line 82
    .line 83
    invoke-direct {v1, p0, p1, v3}, La/hcb;-><init>(La/r4b0;La/cp;B)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 87
    .line 88
    .line 89
    new-instance p0, La/ok;

    .line 90
    .line 91
    const/16 v0, 0x9

    .line 92
    .line 93
    invoke-direct {p0, p1, p1, v0}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 97
    .line 98
    .line 99
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_2
    check-cast p1, La/cp;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 108
    .line 109
    check-cast v0, La/o7b0;

    .line 110
    .line 111
    iget-object v1, v0, La/o7b0;->a:Lorg/xplatform/uikit_sport/sport_cell/DsSportCell;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v2, La/hcb;

    .line 117
    .line 118
    const/4 v3, 0x0

    .line 119
    invoke-direct {v2, p0, p1, v3}, La/hcb;-><init>(La/r4b0;La/cp;B)V

    .line 120
    .line 121
    .line 122
    invoke-static {v1, v2}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 123
    .line 124
    .line 125
    iget-object v0, v0, La/o7b0;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 126
    .line 127
    new-instance v1, La/icb;

    .line 128
    .line 129
    invoke-direct {v1, p0, p1, v3}, La/icb;-><init>(La/r4b0;La/cp;B)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setAccordionClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    .line 134
    .line 135
    new-instance p0, La/ok;

    .line 136
    .line 137
    const/16 v0, 0x8

    .line 138
    .line 139
    invoke-direct {p0, p1, p1, v0}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 143
    .line 144
    .line 145
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p0

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
