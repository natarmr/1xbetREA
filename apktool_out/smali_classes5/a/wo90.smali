.class public final synthetic La/wo90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zo90;


# direct methods
.method public synthetic constructor <init>(La/zo90;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wo90;->a:B

    iput-object p1, p0, La/wo90;->b:La/zo90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/wo90;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wo90;->b:La/zo90;

    .line 4
    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/zo90;->p2:La/fl70;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/zo90;->W0()La/es90;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, La/yr80;

    .line 24
    .line 25
    const/4 p1, 0x4

    .line 26
    invoke-direct {v1, p0, p1}, La/yr80;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, La/es90;->c:La/mne;

    .line 30
    .line 31
    iget-object v3, p1, La/mne;->c:La/vs10;

    .line 32
    .line 33
    new-instance v4, La/ds90;

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-direct {v4, p0, p1}, La/ds90;-><init>(La/es90;La/yje;)V

    .line 37
    .line 38
    .line 39
    const/16 v5, 0xa

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    sget-object v0, La/zo90;->p2:La/fl70;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, La/zo90;->V0()La/djk;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object p1, p1, La/djk;->g:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, La/zo90;->V0()La/djk;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object p1, p1, La/djk;->g:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 67
    .line 68
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    const/4 v0, 0x0

    .line 80
    :goto_0
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setSelection(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p0}, La/zo90;->V0()La/djk;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v0, v0, La/djk;->h:Landroid/widget/TextView;

    .line 92
    .line 93
    new-instance v1, Landroid/os/Handler;

    .line 94
    .line 95
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 100
    .line 101
    .line 102
    new-instance v2, La/fy2;

    .line 103
    .line 104
    const/4 v3, 0x2

    .line 105
    invoke-direct {v2, p1, v0, v3}, La/fy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    const-wide/16 v3, 0x1f4

    .line 109
    .line 110
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, La/zo90;->W0()La/es90;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    iget-object p1, p0, La/es90;->i:La/g090;

    .line 118
    .line 119
    iget-object v0, p1, La/g090;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, La/p7m0;

    .line 122
    .line 123
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    move-object v2, v1

    .line 128
    check-cast v2, La/cr90;

    .line 129
    .line 130
    const/4 v8, 0x0

    .line 131
    const/16 v9, 0x1fd

    .line 132
    .line 133
    const/4 v3, 0x0

    .line 134
    const/4 v4, 0x0

    .line 135
    const/4 v5, 0x0

    .line 136
    const/4 v6, 0x0

    .line 137
    const/4 v7, 0x0

    .line 138
    invoke-static/range {v2 .. v9}, La/cr90;->a(La/cr90;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/lang/Throwable;Ljava/lang/Integer;I)La/cr90;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_1

    .line 147
    .line 148
    iget-object p1, p1, La/g090;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p1, La/vzg0;

    .line 151
    .line 152
    const-string v0, "KEY_ENTER_PHONE_CODE_BY_MANUALLY"

    .line 153
    .line 154
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 155
    .line 156
    invoke-virtual {p1, v0, v1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    iget-object p0, p0, La/es90;->j:La/cyu;

    .line 160
    .line 161
    invoke-virtual {p0}, La/cyu;->A()V

    .line 162
    .line 163
    .line 164
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
