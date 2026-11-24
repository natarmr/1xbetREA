.class public final synthetic La/hmg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lmg0;


# direct methods
.method public synthetic constructor <init>(La/lmg0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hmg0;->a:B

    iput-object p1, p0, La/hmg0;->b:La/lmg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/hmg0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/hmg0;->b:La/lmg0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/lmg0;->M1:La/z7z;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-object v0, p0

    .line 21
    check-cast v0, La/sa10;

    .line 22
    .line 23
    sget-object v1, La/pb10;->g:La/pb10;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const/16 v5, 0x1c

    .line 27
    .line 28
    const v2, 0x7f130677

    .line 29
    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static/range {v0 .. v5}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_0
    const-string p0, "lottieConfigurator"

    .line 38
    .line 39
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :pswitch_0
    iget-object p0, p0, La/lmg0;->L1:La/fiu0;

    .line 44
    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_1
    const-string p0, "viewModelFactory"

    .line 49
    .line 50
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v1

    .line 54
    :pswitch_1
    sget-object v0, La/lmg0;->Y1:La/eke0;

    .line 55
    .line 56
    iget-object v0, p0, La/lmg0;->O1:La/kiu0;

    .line 57
    .line 58
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, La/umg0;

    .line 63
    .line 64
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    sget-object v3, La/smg0;->a:La/smg0;

    .line 69
    .line 70
    new-instance v6, La/rmg0;

    .line 71
    .line 72
    const/4 v4, 0x1

    .line 73
    invoke-direct {v6, v0, v1, v4}, La/rmg0;-><init>(La/umg0;La/yje;B)V

    .line 74
    .line 75
    .line 76
    const/16 v7, 0xe

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    const/4 v5, 0x0

    .line 80
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, La/lmg0;->G0()La/p6r;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object v0, v0, La/p6r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 88
    .line 89
    const-string v1, "REFRESH_BUTTON"

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const/4 v1, 0x0

    .line 96
    if-eqz v0, :cond_2

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-virtual {p0}, La/lmg0;->G0()La/p6r;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v0, v0, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 106
    .line 107
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->g()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, La/lmg0;->G0()La/p6r;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v0, v0, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 115
    .line 116
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const/16 v2, 0x8

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    :cond_3
    invoke-virtual {p0}, La/lmg0;->G0()La/p6r;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iget-object v0, v0, La/p6r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 132
    .line 133
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, La/lmg0;->G0()La/p6r;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-object v0, v0, La/p6r;->f:La/nq8;

    .line 141
    .line 142
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 143
    .line 144
    check-cast v0, Landroid/widget/ProgressBar;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, La/lmg0;->G0()La/p6r;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    iget-object p0, p0, La/p6r;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 154
    .line 155
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 156
    .line 157
    .line 158
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_2
    sget-object v0, La/lmg0;->Y1:La/eke0;

    .line 162
    .line 163
    invoke-virtual {p0}, La/lmg0;->I0()V

    .line 164
    .line 165
    .line 166
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    return-object p0

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
