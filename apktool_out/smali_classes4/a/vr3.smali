.class public final La/vr3;
.super La/q1r;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vr3;->a:B

    iput-object p1, p0, La/vr3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;Landroid/content/Context;)V
    .locals 0

    .line 1
    iget-byte p1, p0, La/vr3;->a:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, La/vr3;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/wws;

    .line 10
    .line 11
    iget-object p1, p0, La/wws;->M1:La/roq0;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, p2}, La/roq0;->b(Landroidx/fragment/app/Fragment;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, La/wws;->H0()La/yys;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, La/yys;->z()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    const-string p0, "tipsDialogScreenFactory"

    .line 30
    .line 31
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    throw p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vr3;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :pswitch_0
    iget-object v0, v0, La/vr3;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/wws;

    .line 12
    .line 13
    iget-object v1, v0, La/wws;->M1:La/roq0;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    move-object/from16 v2, p2

    .line 18
    .line 19
    invoke-virtual {v1, v2}, La/roq0;->b(Landroidx/fragment/app/Fragment;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, La/wws;->H0()La/yys;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, v0, La/yys;->B:La/p7m0;

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    move-object v3, v2

    .line 36
    check-cast v3, La/ixs;

    .line 37
    .line 38
    const/16 v18, 0x0

    .line 39
    .line 40
    const v19, 0x6ffff

    .line 41
    .line 42
    .line 43
    const-wide/16 v4, 0x0

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v9, 0x0

    .line 49
    const/4 v10, 0x0

    .line 50
    const/4 v11, 0x0

    .line 51
    const/4 v12, 0x0

    .line 52
    const/4 v13, 0x0

    .line 53
    const/4 v14, 0x0

    .line 54
    const/4 v15, 0x0

    .line 55
    const/16 v16, 0x0

    .line 56
    .line 57
    const/16 v17, 0x0

    .line 58
    .line 59
    invoke-static/range {v3 .. v19}, La/ixs;->a(La/ixs;JLjava/lang/String;ZZZZLa/hl90;ZZLjava/lang/Throwable;ZLjava/lang/String;ZZI)La/ixs;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, La/ixs;

    .line 74
    .line 75
    iget-boolean v2, v1, La/ixs;->o:Z

    .line 76
    .line 77
    if-eqz v2, :cond_1

    .line 78
    .line 79
    iget-boolean v1, v1, La/ixs;->q:Z

    .line 80
    .line 81
    if-nez v1, :cond_1

    .line 82
    .line 83
    iget-object v0, v0, La/yys;->l:La/ljf0;

    .line 84
    .line 85
    iget-object v0, v0, La/ljf0;->a:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, La/neu0;

    .line 88
    .line 89
    iget-object v0, v0, La/neu0;->a:La/meu0;

    .line 90
    .line 91
    invoke-virtual {v0}, La/meu0;->a()V

    .line 92
    .line 93
    .line 94
    :cond_1
    return-void

    .line 95
    :cond_2
    const-string v0, "tipsDialogScreenFactory"

    .line 96
    .line 97
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    throw v0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public e(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;)V
    .locals 8

    .line 1
    iget-byte p1, p0, La/vr3;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vr3;->b:Ljava/lang/Object;

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
    check-cast p0, La/b5r0;

    .line 10
    .line 11
    sget-object p1, La/b5r0;->t2:La/j6m0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/b5r0;->Q0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/j4r0;->a:La/j4r0;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_2
    instance-of p1, p2, La/sik;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    check-cast p0, La/ez60;

    .line 28
    .line 29
    sget-object p1, La/ez60;->S1:[La/iiy;

    .line 30
    .line 31
    invoke-virtual {p0}, La/ez60;->H0()La/g670;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget-object p1, p0, La/g670;->w:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-lez p1, :cond_1

    .line 42
    .line 43
    iget-object p1, p0, La/g670;->E:La/p7m0;

    .line 44
    .line 45
    :cond_0
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    move-object v0, p2

    .line 50
    check-cast v0, La/gz60;

    .line 51
    .line 52
    iget-object v1, p0, La/g670;->w:Ljava/lang/String;

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    const/16 v7, 0x1fe

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v4, 0x0

    .line 60
    const/4 v5, 0x0

    .line 61
    invoke-static/range {v0 .. v7}, La/gz60;->a(La/gz60;Ljava/lang/String;ZZZZZI)La/gz60;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p1, p2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-eqz p2, :cond_0

    .line 70
    .line 71
    const-string p1, ""

    .line 72
    .line 73
    iput-object p1, p0, La/g670;->w:Ljava/lang/String;

    .line 74
    .line 75
    :cond_1
    return-void

    .line 76
    :pswitch_3
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->J()Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    check-cast p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_2

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-nez p2, :cond_2

    .line 95
    .line 96
    sget p1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 97
    .line 98
    const/4 p1, 0x0

    .line 99
    invoke-virtual {p0, p1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->I(Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    new-instance p2, La/w23;

    .line 104
    .line 105
    const/4 v0, 0x2

    .line 106
    invoke-direct {p2, p0, v0}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    :goto_0
    return-void

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public h(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;Landroid/view/View;)V
    .locals 9

    .line 1
    iget-byte p1, p0, La/vr3;->a:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p1, p0, La/vr3;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, La/bn70;

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of p2, p2, La/oe70;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, La/bn70;->Q0()La/to70;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    new-instance v0, La/gk70;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const/16 v7, 0xa

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    const-class v3, La/to70;

    .line 36
    .line 37
    const-string v4, "handleGameError"

    .line 38
    .line 39
    const-string v5, "handleGameError(Ljava/lang/Throwable;)V"

    .line 40
    .line 41
    invoke-direct/range {v0 .. v7}, La/gk70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 42
    .line 43
    .line 44
    iget-object p3, v2, La/to70;->g:La/mne;

    .line 45
    .line 46
    iget-object v6, p3, La/mne;->b:La/dvj;

    .line 47
    .line 48
    new-instance v7, La/lo70;

    .line 49
    .line 50
    const/4 p3, 0x0

    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v7, v2, p3, v1}, La/lo70;-><init>(La/to70;La/yje;B)V

    .line 53
    .line 54
    .line 55
    const/16 v8, 0xa

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    move-object v3, p2

    .line 59
    move-object v4, v0

    .line 60
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1, p0}, Landroidx/fragment/app/e;->B0(La/q1r;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public i(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    iget-byte p1, p0, La/vr3;->a:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, La/vr3;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/b5r0;

    .line 10
    .line 11
    sget-object p1, La/b5r0;->t2:La/j6m0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/b5r0;->Q0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/j4r0;->a:La/j4r0;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method
