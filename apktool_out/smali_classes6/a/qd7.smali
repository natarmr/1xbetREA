.class public final synthetic La/qd7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qd7;->a:B

    iput-object p1, p0, La/qd7;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 12

    .line 1
    iget-byte p1, p0, La/qd7;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x3

    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/qd7;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La/bun0;

    .line 12
    .line 13
    sget-object p1, La/bun0;->g2:La/s2m0;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, La/bun0;->R0()La/pun0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v4, La/ndn0;

    .line 26
    .line 27
    iget-object v6, p0, La/pun0;->e:La/duj;

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const/16 v11, 0x14

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    const-class v7, La/duj;

    .line 34
    .line 35
    const-string v8, "handleError"

    .line 36
    .line 37
    const-string v9, "handleError(Ljava/lang/Throwable;)V"

    .line 38
    .line 39
    invoke-direct/range {v4 .. v11}, La/ndn0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 40
    .line 41
    .line 42
    new-instance v7, La/oun0;

    .line 43
    .line 44
    invoke-direct {v7, p0, v2, v1}, La/oun0;-><init>(La/pun0;La/yje;B)V

    .line 45
    .line 46
    .line 47
    const/16 v8, 0xe

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void

    .line 55
    :pswitch_0
    check-cast p0, La/ymd0;

    .line 56
    .line 57
    sget-object p1, La/ymd0;->o2:La/fl70;

    .line 58
    .line 59
    if-eqz p2, :cond_2

    .line 60
    .line 61
    iget-object p0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    check-cast p0, La/wo8;

    .line 67
    .line 68
    iget-object p1, p0, La/wo8;->g:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 69
    .line 70
    if-nez p1, :cond_1

    .line 71
    .line 72
    invoke-virtual {p0}, La/wo8;->g()V

    .line 73
    .line 74
    .line 75
    :cond_1
    iget-object p0, p0, La/wo8;->g:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 78
    .line 79
    .line 80
    :cond_2
    return-void

    .line 81
    :pswitch_1
    check-cast p0, La/til;

    .line 82
    .line 83
    iput-boolean p2, p0, La/til;->l:Z

    .line 84
    .line 85
    invoke-virtual {p0}, La/dxn;->p()V

    .line 86
    .line 87
    .line 88
    if-nez p2, :cond_3

    .line 89
    .line 90
    invoke-virtual {p0, v0}, La/til;->s(Z)V

    .line 91
    .line 92
    .line 93
    iput-boolean v0, p0, La/til;->m:Z

    .line 94
    .line 95
    :cond_3
    return-void

    .line 96
    :pswitch_2
    check-cast p0, La/cuk;

    .line 97
    .line 98
    sget-object p1, La/cuk;->l2:La/bek;

    .line 99
    .line 100
    if-eqz p2, :cond_4

    .line 101
    .line 102
    iget-object p0, p0, La/cuk;->g2:La/kiu0;

    .line 103
    .line 104
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, La/guk;

    .line 109
    .line 110
    iget-object p0, p0, La/guk;->f:La/dq00;

    .line 111
    .line 112
    sget-object p1, La/wgh0;->b:La/wgh0;

    .line 113
    .line 114
    iget-object p1, p0, La/dq00;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, La/yo4;

    .line 117
    .line 118
    const-string p2, "medal_table_bottom"

    .line 119
    .line 120
    invoke-virtual {p1, p2}, La/yo4;->m(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object p0, p0, La/dq00;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p0, La/zr1;

    .line 126
    .line 127
    invoke-virtual {p0, p2}, La/zr1;->q(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    return-void

    .line 131
    :pswitch_3
    check-cast p0, La/ssc;

    .line 132
    .line 133
    invoke-virtual {p0}, La/ssc;->t()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    invoke-virtual {p0, p1}, La/ssc;->s(Z)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :pswitch_4
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 142
    .line 143
    if-eqz p2, :cond_5

    .line 144
    .line 145
    iget-boolean p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->q:Z

    .line 146
    .line 147
    if-eqz p1, :cond_6

    .line 148
    .line 149
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 150
    .line 151
    iget-object p1, p1, La/vd7;->d:Landroid/view/View;

    .line 152
    .line 153
    check-cast p1, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 154
    .line 155
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    iput-boolean v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->q:Z

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_5
    sget p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->v:I

    .line 162
    .line 163
    :cond_6
    :goto_0
    return-void

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
