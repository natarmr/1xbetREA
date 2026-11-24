.class public final La/kjr;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ljr;


# direct methods
.method public synthetic constructor <init>(La/ljr;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kjr;->i:B

    iput-object p1, p0, La/kjr;->k:La/ljr;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/kjr;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/kjr;->k:La/ljr;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/kjr;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/kjr;-><init>(La/ljr;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/kjr;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/kjr;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/kjr;-><init>(La/ljr;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/kjr;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kjr;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ukr;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/kjr;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kjr;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kjr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/kjr;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/kjr;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/kjr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/kjr;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/kjr;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/ukr;

    .line 9
    .line 10
    sget-object v1, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    instance-of v1, v0, La/tkr;

    .line 19
    .line 20
    iget-object v4, p0, La/kjr;->k:La/ljr;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    sget-object p0, La/ljr;->Q1:[La/iiy;

    .line 25
    .line 26
    iget-object v2, v4, La/ljr;->M1:La/wdk0;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    new-instance v3, La/xdk0;

    .line 31
    .line 32
    sget-object v6, La/rek0;->b:La/rek0;

    .line 33
    .line 34
    const p0, 0x7f13131f

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/4 v11, 0x0

    .line 45
    const/16 v12, 0x7c

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v9, 0x0

    .line 49
    const/4 v10, 0x0

    .line 50
    move-object v5, v3

    .line 51
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 52
    .line 53
    .line 54
    const/16 v9, 0x3fc

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v7, 0x0

    .line 59
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const-string p0, "snackbarManager"

    .line 64
    .line 65
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_1
    instance-of p0, v0, La/rkr;

    .line 70
    .line 71
    if-eqz p0, :cond_2

    .line 72
    .line 73
    check-cast v0, La/rkr;

    .line 74
    .line 75
    iget-object p0, v0, La/rkr;->a:Ljava/lang/String;

    .line 76
    .line 77
    sget-object p1, La/ljr;->Q1:[La/iiy;

    .line 78
    .line 79
    invoke-virtual {v4, p0}, La/ljr;->I0(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    instance-of p0, v0, La/skr;

    .line 84
    .line 85
    if-eqz p0, :cond_3

    .line 86
    .line 87
    check-cast v0, La/skr;

    .line 88
    .line 89
    iget-object p0, v0, La/skr;->a:Ljava/lang/String;

    .line 90
    .line 91
    sget-object p1, La/ljr;->Q1:[La/iiy;

    .line 92
    .line 93
    invoke-virtual {v4, p0}, La/ljr;->I0(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 100
    .line 101
    .line 102
    :goto_1
    return-object p1

    .line 103
    :pswitch_0
    iget-object v0, p0, La/kjr;->j:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Ljava/util/List;

    .line 106
    .line 107
    sget-object v1, La/wne;->a:La/wne;

    .line 108
    .line 109
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    sget-object p1, La/ljr;->Q1:[La/iiy;

    .line 113
    .line 114
    iget-object p0, p0, La/kjr;->k:La/ljr;

    .line 115
    .line 116
    iget-object p0, p0, La/ljr;->P1:La/n0o0;

    .line 117
    .line 118
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, La/cjr;

    .line 123
    .line 124
    invoke-virtual {p0, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 125
    .line 126
    .line 127
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
