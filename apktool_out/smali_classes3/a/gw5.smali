.class public final La/gw5;
.super La/po8;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gw5;->a:B

    iput-object p1, p0, La/gw5;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final d(Landroid/view/View;F)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(Landroid/view/View;F)V
    .locals 0

    .line 1
    return-void
.end method

.method private final f(Landroid/view/View;F)V
    .locals 0

    .line 1
    return-void
.end method

.method private final g(Landroid/view/View;F)V
    .locals 0

    .line 1
    return-void
.end method

.method private final h(Landroid/view/View;I)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;F)V
    .locals 2

    .line 1
    iget-byte p1, p0, La/gw5;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/gw5;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    return-void

    .line 9
    :pswitch_1
    check-cast p0, La/axe;

    .line 10
    .line 11
    sget-object p1, La/axe;->e2:La/kud;

    .line 12
    .line 13
    invoke-virtual {p0}, La/axe;->K0()La/kse;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0, p2}, La/kse;->c(F)V

    .line 20
    .line 21
    .line 22
    :cond_0
    :pswitch_2
    return-void

    .line 23
    :pswitch_3
    check-cast p0, La/iw5;

    .line 24
    .line 25
    iget-object p1, p0, La/iw5;->Z1:La/fw5;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    cmpg-float v1, p2, v0

    .line 36
    .line 37
    if-gez v1, :cond_3

    .line 38
    .line 39
    iget-object v0, p1, La/dw5;->b:Ljava/lang/Object;

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, La/fw5;->i()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p1, La/dw5;->b:Ljava/lang/Object;

    .line 48
    .line 49
    :cond_2
    check-cast v0, Landroidx/compose/ui/platform/ComposeView;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    neg-int v0, v0

    .line 56
    int-to-float v0, v0

    .line 57
    mul-float/2addr v0, p2

    .line 58
    :cond_3
    iget-object p2, p1, La/dw5;->b:Ljava/lang/Object;

    .line 59
    .line 60
    if-nez p2, :cond_4

    .line 61
    .line 62
    invoke-virtual {p1}, La/fw5;->i()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iput-object p2, p1, La/dw5;->b:Ljava/lang/Object;

    .line 67
    .line 68
    :cond_4
    check-cast p2, Landroidx/compose/ui/platform/ComposeView;

    .line 69
    .line 70
    invoke-virtual {p2, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, La/iw5;->d2:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 74
    .line 75
    if-eqz p0, :cond_5

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 78
    .line 79
    .line 80
    :cond_5
    :goto_0
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroid/view/View;I)V
    .locals 12

    .line 1
    iget-byte p1, p0, La/gw5;->a:B

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    const/4 v1, 0x3

    .line 5
    iget-object p0, p0, La/gw5;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, La/b5r0;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    if-eq p2, p1, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    if-eq p2, v0, :cond_1

    .line 17
    .line 18
    if-eq p2, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    iput-boolean p1, p0, La/b5r0;->l2:Z

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iput-boolean p1, p0, La/b5r0;->l2:Z

    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :pswitch_0
    if-eq p2, v1, :cond_2

    .line 29
    .line 30
    check-cast p0, La/et90;

    .line 31
    .line 32
    invoke-virtual {p0}, La/nw5;->J0()V

    .line 33
    .line 34
    .line 35
    :cond_2
    return-void

    .line 36
    :pswitch_1
    move-object p1, p0

    .line 37
    check-cast p1, La/zo90;

    .line 38
    .line 39
    sget-object p0, La/zo90;->p2:La/fl70;

    .line 40
    .line 41
    invoke-virtual {p1}, La/zo90;->W0()La/es90;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-object v2, p0, La/es90;->i:La/g090;

    .line 46
    .line 47
    iget-object p0, v2, La/g090;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, La/p7m0;

    .line 50
    .line 51
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, La/cr90;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object p0, v2, La/g090;->b:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v3, p0

    .line 63
    check-cast v3, La/p7m0;

    .line 64
    .line 65
    :cond_3
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    move-object v4, p0

    .line 70
    check-cast v4, La/cr90;

    .line 71
    .line 72
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    const/16 v11, 0xff

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v7, 0x0

    .line 81
    const/4 v8, 0x0

    .line 82
    const/4 v9, 0x0

    .line 83
    invoke-static/range {v4 .. v11}, La/cr90;->a(La/cr90;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/lang/Throwable;Ljava/lang/Integer;I)La/cr90;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v3, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_3

    .line 92
    .line 93
    iget-object p0, v2, La/g090;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p0, La/vzg0;

    .line 96
    .line 97
    const-string v1, "KEY_BOTTOM_SHEET_STATE_BY_MANUALLY"

    .line 98
    .line 99
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {p0, v1, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    if-ne p2, v0, :cond_4

    .line 107
    .line 108
    invoke-static {p1}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    return-void

    .line 112
    :pswitch_2
    check-cast p0, La/axe;

    .line 113
    .line 114
    if-ne p2, v0, :cond_5

    .line 115
    .line 116
    invoke-static {p0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 120
    .line 121
    if-eqz p1, :cond_5

    .line 122
    .line 123
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 124
    .line 125
    .line 126
    :cond_5
    sget-object p1, La/axe;->e2:La/kud;

    .line 127
    .line 128
    if-eq p2, v1, :cond_7

    .line 129
    .line 130
    if-eq p2, v0, :cond_6

    .line 131
    .line 132
    const/4 p1, 0x0

    .line 133
    goto :goto_1

    .line 134
    :cond_6
    const/4 p1, 0x0

    .line 135
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    goto :goto_1

    .line 140
    :cond_7
    const/high16 p1, 0x3f800000    # 1.0f

    .line 141
    .line 142
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    :goto_1
    if-eqz p1, :cond_8

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    invoke-virtual {p0}, La/axe;->K0()La/kse;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    if-eqz p0, :cond_8

    .line 157
    .line 158
    invoke-interface {p0, p1}, La/kse;->c(F)V

    .line 159
    .line 160
    .line 161
    :cond_8
    return-void

    .line 162
    :pswitch_3
    const/4 p1, 0x5

    .line 163
    if-ne p2, p1, :cond_9

    .line 164
    .line 165
    check-cast p0, La/wo8;

    .line 166
    .line 167
    invoke-virtual {p0}, La/wo8;->cancel()V

    .line 168
    .line 169
    .line 170
    :cond_9
    :pswitch_4
    return-void

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
