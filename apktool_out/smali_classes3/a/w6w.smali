.class public final La/w6w;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/x6w;


# direct methods
.method public synthetic constructor <init>(La/x6w;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/w6w;->i:B

    iput-object p1, p0, La/w6w;->k:La/x6w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/w6w;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/w6w;->k:La/x6w;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/w6w;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/w6w;-><init>(La/x6w;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/w6w;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/w6w;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/w6w;-><init>(La/x6w;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/w6w;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/w6w;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/w6w;-><init>(La/x6w;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/w6w;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/w6w;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vnm0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/w6w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/w6w;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/w6w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/o9h0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/w6w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/w6w;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/w6w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/gje;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/w6w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/w6w;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/w6w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/w6w;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/w6w;->k:La/x6w;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/w6w;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/vnm0;

    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, La/vnm0;->a:La/vnm0;

    .line 19
    .line 20
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    iget-object p0, v2, La/sik;->S1:Landroid/app/Dialog;

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/app/Dialog;->cancel()V

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-object v1

    .line 40
    :pswitch_0
    iget-object p0, p0, La/w6w;->j:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, La/o9h0;

    .line 43
    .line 44
    sget-object v0, La/wne;->a:La/wne;

    .line 45
    .line 46
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, La/x6w;->T0()La/c1w;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p1, p1, La/c1w;->c:La/jk3;

    .line 54
    .line 55
    iget-object p1, p1, La/jk3;->c:Landroid/view/View;

    .line 56
    .line 57
    check-cast p1, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;

    .line 58
    .line 59
    iget-boolean v0, p0, La/o9h0;->a:Z

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    if-ne v0, v3, :cond_2

    .line 63
    .line 64
    sget-object v0, La/awl;->c:La/awl;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    if-nez v0, :cond_3

    .line 68
    .line 69
    sget-object v0, La/awl;->d:La/awl;

    .line 70
    .line 71
    :goto_1
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->setCheckedState(La/awl;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, La/x6w;->T0()La/c1w;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object p1, p1, La/c1w;->b:Lcom/google/android/material/button/MaterialButton;

    .line 79
    .line 80
    iget-boolean p0, p0, La/o9h0;->b:Z

    .line 81
    .line 82
    invoke-virtual {p1, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 83
    .line 84
    .line 85
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 89
    .line 90
    .line 91
    :goto_2
    return-object v1

    .line 92
    :pswitch_1
    iget-object v0, v2, La/x6w;->h2:La/a8z;

    .line 93
    .line 94
    iget-object p0, p0, La/w6w;->j:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p0, La/gje;

    .line 97
    .line 98
    sget-object v2, La/wne;->a:La/wne;

    .line 99
    .line 100
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    sget-object p1, La/vie;->a:La/vie;

    .line 104
    .line 105
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_5

    .line 110
    .line 111
    instance-of p1, p0, La/tie;

    .line 112
    .line 113
    if-eqz p1, :cond_4

    .line 114
    .line 115
    sget-object p1, La/x6w;->k2:La/art;

    .line 116
    .line 117
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, La/y6w;

    .line 122
    .line 123
    check-cast p0, La/tie;

    .line 124
    .line 125
    iget-object p0, p0, La/tie;->a:Ljava/util/ArrayList;

    .line 126
    .line 127
    iput-object p0, p1, La/i26;->f:Ljava/lang/Object;

    .line 128
    .line 129
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, La/y6w;

    .line 134
    .line 135
    invoke-virtual {p0}, La/yge0;->g()V

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_5
    :goto_3
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    :goto_4
    return-object v1

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
