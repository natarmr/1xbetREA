.class public final synthetic La/e820;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i820;


# direct methods
.method public synthetic constructor <init>(La/i820;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/e820;->a:B

    iput-object p1, p0, La/e820;->b:La/i820;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/e820;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/e820;->b:La/i820;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    sget-object v0, La/i820;->U1:La/atz;

    .line 16
    .line 17
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p0, p0, La/ozq;->u:Landroidx/viewpager2/widget/ViewPager2;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 30
    .line 31
    sget-object v0, La/i820;->U1:La/atz;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, La/i820;->H0()La/wze;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, La/wze;->D()V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 47
    .line 48
    sget-object v0, La/i820;->U1:La/atz;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, La/i820;->H0()La/wze;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, La/wze;->D()V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 64
    .line 65
    sget-object v0, La/i820;->U1:La/atz;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La/i820;->H0()La/wze;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    iget-object p1, p0, La/wze;->r:La/ag3;

    .line 75
    .line 76
    iget-object p1, p1, La/ag3;->a:La/kt2;

    .line 77
    .line 78
    const-string v0, "bet_place_settings"

    .line 79
    .line 80
    invoke-interface {p1, v0}, La/kt2;->c(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, La/wze;->x:La/x20;

    .line 84
    .line 85
    iget-object p1, p1, La/x20;->a:La/s1p;

    .line 86
    .line 87
    const-wide/16 v2, 0xc66

    .line 88
    .line 89
    sget-object v0, La/xun;->a:La/xun;

    .line 90
    .line 91
    invoke-virtual {p1, v0, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, La/wze;->I:La/p7m0;

    .line 95
    .line 96
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, La/wze;->t:La/i1w0;

    .line 105
    .line 106
    new-instance v0, La/ejd;

    .line 107
    .line 108
    const/16 v1, 0x10

    .line 109
    .line 110
    invoke-direct {v0, p0, v1}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_3
    check-cast p1, Landroid/view/View;

    .line 120
    .line 121
    sget-object v0, La/i820;->U1:La/atz;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, La/i820;->H0()La/wze;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    new-instance v2, La/z6e;

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    const/16 v9, 0x17

    .line 138
    .line 139
    const/4 v3, 0x1

    .line 140
    const-class v5, La/wze;

    .line 141
    .line 142
    const-string v6, "handleError"

    .line 143
    .line 144
    const-string v7, "handleError(Ljava/lang/Throwable;)V"

    .line 145
    .line 146
    invoke-direct/range {v2 .. v9}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 147
    .line 148
    .line 149
    iget-object p1, v4, La/wze;->o:La/mne;

    .line 150
    .line 151
    iget-object v8, p1, La/mne;->b:La/dvj;

    .line 152
    .line 153
    new-instance v9, La/oze;

    .line 154
    .line 155
    const/4 p1, 0x0

    .line 156
    invoke-direct {v9, v4, v1, p1}, La/oze;-><init>(La/wze;La/yje;B)V

    .line 157
    .line 158
    .line 159
    const/16 v10, 0xa

    .line 160
    .line 161
    const/4 v7, 0x0

    .line 162
    move-object v5, p0

    .line 163
    move-object v6, v2

    .line 164
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 165
    .line 166
    .line 167
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
