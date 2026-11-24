.class public final La/ijd0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/i1w0;

.field public final c:Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/send/params/QrSendConfirmationMailParams;

.field public final d:La/duj;

.field public final e:La/n5c;

.field public final f:La/mne;

.field public final g:La/rou;

.field public final h:La/p7m0;

.field public final i:La/ol60;

.field public final j:La/c4m0;


# direct methods
.method public constructor <init>(La/i1w0;Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/send/params/QrSendConfirmationMailParams;La/duj;La/n5c;La/mne;La/rou;La/m1e;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/ijd0;->b:La/i1w0;

    .line 11
    .line 12
    iput-object p2, p0, La/ijd0;->c:Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/send/params/QrSendConfirmationMailParams;

    .line 13
    .line 14
    iput-object p3, p0, La/ijd0;->d:La/duj;

    .line 15
    .line 16
    iput-object p4, p0, La/ijd0;->e:La/n5c;

    .line 17
    .line 18
    iput-object p5, p0, La/ijd0;->f:La/mne;

    .line 19
    .line 20
    iput-object p6, p0, La/ijd0;->g:La/rou;

    .line 21
    .line 22
    new-instance p1, La/fjd0;

    .line 23
    .line 24
    const-string p2, ""

    .line 25
    .line 26
    const/4 p3, 0x1

    .line 27
    invoke-direct {p1, p2, p3}, La/fjd0;-><init>(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, La/ijd0;->h:La/p7m0;

    .line 35
    .line 36
    new-instance p1, La/ol60;

    .line 37
    .line 38
    const/4 p2, 0x3

    .line 39
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, La/ijd0;->i:La/ol60;

    .line 43
    .line 44
    iget-object p1, p0, La/ijd0;->j:La/c4m0;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-ne p1, p3, :cond_0

    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    invoke-interface {p7}, La/m1e;->b()La/gmq;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance p2, La/a220;

    .line 60
    .line 61
    const/16 p3, 0xf

    .line 62
    .line 63
    const/4 p4, 0x0

    .line 64
    invoke-direct {p2, p0, p4, p3}, La/a220;-><init>(La/diu0;La/yje;B)V

    .line 65
    .line 66
    .line 67
    new-instance p3, La/fnq;

    .line 68
    .line 69
    const/4 p6, 0x4

    .line 70
    invoke-direct {p3, p1, p2, p6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object p2, p5, La/mne;->a:La/rwj;

    .line 78
    .line 79
    invoke-static {p1, p2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance p2, La/st20;

    .line 84
    .line 85
    const/4 p5, 0x2

    .line 86
    const/16 p6, 0x14

    .line 87
    .line 88
    invoke-direct {p2, p5, p4, p6}, La/st20;-><init>(ILa/yje;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {p3, p1, p2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, p0, La/ijd0;->j:La/c4m0;

    .line 96
    .line 97
    return-void
.end method


# virtual methods
.method public final w(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/gjd0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/gjd0;

    .line 7
    .line 8
    iget v1, v0, La/gjd0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/gjd0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/gjd0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/gjd0;-><init>(La/ijd0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/gjd0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/gjd0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0

    .line 48
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput v4, v0, La/gjd0;->k:I

    .line 52
    .line 53
    iget-object p1, p0, La/ijd0;->g:La/rou;

    .line 54
    .line 55
    invoke-virtual {p1, v3, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    :goto_1
    check-cast p1, La/m2c0;

    .line 63
    .line 64
    iget-object p1, p1, La/m2c0;->T:Ljava/lang/String;

    .line 65
    .line 66
    :cond_4
    iget-object v0, p0, La/ijd0;->h:La/p7m0;

    .line 67
    .line 68
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    move-object v2, v1

    .line 73
    check-cast v2, La/fjd0;

    .line 74
    .line 75
    const/4 v4, 0x2

    .line 76
    invoke-static {v2, p1, v3, v4}, La/fjd0;->a(La/fjd0;Ljava/lang/String;ZI)La/fjd0;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0
.end method

.method public final x(La/ejd0;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/ijd0;->f:La/mne;

    .line 6
    .line 7
    iget-object v3, v1, La/mne;->c:La/vs10;

    .line 8
    .line 9
    new-instance v1, La/ljc0;

    .line 10
    .line 11
    const/16 v2, 0x19

    .line 12
    .line 13
    invoke-direct {v1, v2}, La/ljc0;-><init>(B)V

    .line 14
    .line 15
    .line 16
    new-instance v4, La/s9c0;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/16 v5, 0xe

    .line 20
    .line 21
    invoke-direct {v4, p0, p1, v2, v5}, La/s9c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 22
    .line 23
    .line 24
    const/16 v5, 0xa

    .line 25
    .line 26
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final y(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/hjd0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/hjd0;

    .line 7
    .line 8
    iget v1, v0, La/hjd0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/hjd0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/hjd0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/hjd0;-><init>(La/ijd0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/hjd0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/hjd0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/ijd0;->c:Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/send/params/QrSendConfirmationMailParams;

    .line 51
    .line 52
    iget-object p1, p1, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/send/params/QrSendConfirmationMailParams;->a:La/swp0;

    .line 53
    .line 54
    sget-object v2, La/obk0;->c:La/obk0;

    .line 55
    .line 56
    iput v3, v0, La/hjd0;->k:I

    .line 57
    .line 58
    iget-object v3, p0, La/ijd0;->e:La/n5c;

    .line 59
    .line 60
    const-string v4, ""

    .line 61
    .line 62
    invoke-static {v3, p1, v2, v4, v0}, La/n5c;->b(La/n5c;La/swp0;La/obk0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p1, La/pfi0;

    .line 70
    .line 71
    iget-object p0, p0, La/ijd0;->b:La/i1w0;

    .line 72
    .line 73
    invoke-static {p0, p0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v1, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/check/QrCheckCodeByMailScreen;

    .line 78
    .line 79
    iget-object v2, p1, La/pfi0;->b:La/swp0;

    .line 80
    .line 81
    iget p1, p1, La/pfi0;->a:I

    .line 82
    .line 83
    int-to-long v3, p1

    .line 84
    invoke-direct {v1, v2, v3, v4}, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/mail/check/QrCheckCodeByMailScreen;-><init>(La/swp0;J)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 88
    .line 89
    .line 90
    iget-object p1, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    invoke-static {p0, p1, v0}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :goto_2
    move-object v0, p1

    .line 98
    check-cast v0, La/paw;

    .line 99
    .line 100
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, La/oe50;

    .line 111
    .line 112
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0
.end method
