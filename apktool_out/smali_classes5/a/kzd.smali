.class public final La/kzd;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/i1w0;

.field public final c:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;

.field public final d:La/mne;

.field public final e:La/nr;

.field public final f:La/s64;

.field public final g:La/cyh;

.field public final h:La/ort;

.field public final i:La/zg;

.field public final j:La/au0;

.field public final k:La/f5c;

.field public final l:La/z4w0;

.field public final m:La/n5c;

.field public final n:La/duj;

.field public final o:La/xzb;

.field public final p:La/m1e;

.field public final q:La/ctf0;

.field public final r:La/ol60;

.field public final s:La/p7m0;

.field public t:La/bby;

.field public u:La/c4m0;


# direct methods
.method public constructor <init>(La/vzg0;La/i1w0;Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;La/mne;La/nr;La/s64;La/zg;La/cyh;La/ort;La/zg;La/au0;La/f5c;La/z4w0;La/n5c;La/duj;La/xzb;La/m1e;La/ctf0;)V
    .locals 0

    .line 1
    move-object/from16 p1, p18

    .line 2
    .line 3
    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, La/w46;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, La/kzd;->b:La/i1w0;

    .line 13
    .line 14
    iput-object p3, p0, La/kzd;->c:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;

    .line 15
    .line 16
    iput-object p4, p0, La/kzd;->d:La/mne;

    .line 17
    .line 18
    iput-object p5, p0, La/kzd;->e:La/nr;

    .line 19
    .line 20
    iput-object p6, p0, La/kzd;->f:La/s64;

    .line 21
    .line 22
    iput-object p8, p0, La/kzd;->g:La/cyh;

    .line 23
    .line 24
    iput-object p9, p0, La/kzd;->h:La/ort;

    .line 25
    .line 26
    iput-object p10, p0, La/kzd;->i:La/zg;

    .line 27
    .line 28
    iput-object p11, p0, La/kzd;->j:La/au0;

    .line 29
    .line 30
    iput-object p12, p0, La/kzd;->k:La/f5c;

    .line 31
    .line 32
    iput-object p13, p0, La/kzd;->l:La/z4w0;

    .line 33
    .line 34
    iput-object p14, p0, La/kzd;->m:La/n5c;

    .line 35
    .line 36
    iput-object p15, p0, La/kzd;->n:La/duj;

    .line 37
    .line 38
    move-object/from16 p2, p16

    .line 39
    .line 40
    iput-object p2, p0, La/kzd;->o:La/xzb;

    .line 41
    .line 42
    move-object/from16 p2, p17

    .line 43
    .line 44
    iput-object p2, p0, La/kzd;->p:La/m1e;

    .line 45
    .line 46
    iput-object p1, p0, La/kzd;->q:La/ctf0;

    .line 47
    .line 48
    new-instance p2, La/ol60;

    .line 49
    .line 50
    const/4 p4, 0x3

    .line 51
    invoke-direct {p2, p4}, La/ol60;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iput-object p2, p0, La/kzd;->r:La/ol60;

    .line 55
    .line 56
    new-instance p2, La/ezd;

    .line 57
    .line 58
    invoke-interface {p3}, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;->w()Lorg/xplatform/security/api/presentation/models/SendEmailIntention;

    .line 59
    .line 60
    .line 61
    move-result-object p4

    .line 62
    invoke-interface {p4}, Lorg/xplatform/security/api/presentation/models/SendEmailIntention;->getEmail()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    invoke-interface {p3}, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;->w()Lorg/xplatform/security/api/presentation/models/SendEmailIntention;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    instance-of p3, p3, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;

    .line 74
    .line 75
    if-eqz p3, :cond_0

    .line 76
    .line 77
    const p3, 0x7f1304dc

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    const p3, 0x7f130775

    .line 82
    .line 83
    .line 84
    :goto_0
    const/4 p5, 0x0

    .line 85
    new-array p6, p5, [Ljava/lang/Object;

    .line 86
    .line 87
    invoke-virtual {p1, p3, p6}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-direct {p2, p4, p5, p1}, La/ezd;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, La/kzd;->s:La/p7m0;

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final A(Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$RestorePassword;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/jzd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/jzd;

    .line 7
    .line 8
    iget v1, v0, La/jzd;->l:I

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
    iput v1, v0, La/jzd;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/jzd;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/jzd;-><init>(La/kzd;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/jzd;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/jzd;->l:I

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
    iget-object p1, v0, La/jzd;->i:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$RestorePassword;

    .line 37
    .line 38
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p1, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$RestorePassword;->b:La/swp0;

    .line 53
    .line 54
    iput-object p1, v0, La/jzd;->i:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$RestorePassword;

    .line 55
    .line 56
    iput v3, v0, La/jzd;->l:I

    .line 57
    .line 58
    iget-object v2, p0, La/kzd;->o:La/xzb;

    .line 59
    .line 60
    invoke-virtual {v2, p2, v3, v0}, La/xzb;->a(La/swp0;ZLa/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-ne p2, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    check-cast p2, La/pfi0;

    .line 68
    .line 69
    new-instance v0, La/h6c;

    .line 70
    .line 71
    const/16 v1, 0x11

    .line 72
    .line 73
    invoke-direct {v0, p2, p1, v1}, La/h6c;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, La/kzd;->b:La/i1w0;

    .line 77
    .line 78
    invoke-virtual {p0, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0
.end method

.method public final w()V
    .locals 4

    .line 1
    iget-object p0, p0, La/kzd;->b:La/i1w0;

    .line 2
    .line 3
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, La/c8d;

    .line 8
    .line 9
    sget-object v2, La/y7d;->a:La/v7d;

    .line 10
    .line 11
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    move-object v1, v0

    .line 22
    check-cast v1, La/paw;

    .line 23
    .line 24
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/oe50;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method

.method public final x(Ljava/lang/Throwable;)V
    .locals 12

    .line 1
    iget-object v0, p0, La/kzd;->n:La/duj;

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    :cond_0
    move-object v5, p0

    .line 6
    goto :goto_1

    .line 7
    :cond_1
    instance-of v1, p1, Ljava/net/SocketTimeoutException;

    .line 8
    .line 9
    iget-object v2, p0, La/kzd;->r:La/ol60;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_2
    instance-of v1, p1, Ljava/net/UnknownHostException;

    .line 15
    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    :goto_0
    sget-object p0, La/bzd;->a:La/bzd;

    .line 19
    .line 20
    invoke-virtual {v2, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_3
    instance-of v1, p1, La/zhi0;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    move-object v1, p1

    .line 29
    check-cast v1, La/zhi0;

    .line 30
    .line 31
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 32
    .line 33
    sget-object v3, La/i2o;->i2:La/i2o;

    .line 34
    .line 35
    if-ne v1, v3, :cond_5

    .line 36
    .line 37
    new-instance p0, La/czd;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    const-string p1, ""

    .line 46
    .line 47
    :cond_4
    invoke-direct {p0, p1}, La/czd;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_5
    new-instance v3, La/mhc;

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x7

    .line 58
    const/4 v4, 0x2

    .line 59
    const-class v6, La/kzd;

    .line 60
    .line 61
    const-string v7, "onErrorHandlerCalled"

    .line 62
    .line 63
    const-string v8, "onErrorHandlerCalled(Ljava/lang/Throwable;Ljava/lang/String;)V"

    .line 64
    .line 65
    move-object v5, p0

    .line 66
    invoke-direct/range {v3 .. v10}, La/mhc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :goto_1
    new-instance v4, La/mhc;

    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    const/16 v11, 0x8

    .line 77
    .line 78
    move-object v6, v5

    .line 79
    const/4 v5, 0x2

    .line 80
    const-class v7, La/kzd;

    .line 81
    .line 82
    const-string v8, "onErrorHandlerCalled"

    .line 83
    .line 84
    const-string v9, "onErrorHandlerCalled(Ljava/lang/Throwable;Ljava/lang/String;)V"

    .line 85
    .line 86
    invoke-direct/range {v4 .. v11}, La/mhc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final y(Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$BindEmail;La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, La/hzd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/hzd;

    .line 7
    .line 8
    iget v1, v0, La/hzd;->l:I

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
    iput v1, v0, La/hzd;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/hzd;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/hzd;-><init>(La/kzd;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/hzd;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/hzd;->l:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-eq v2, v5, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, La/hzd;->i:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$BindEmail;

    .line 43
    .line 44
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v8, p0

    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    iget-object p1, v0, La/hzd;->i:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$BindEmail;

    .line 58
    .line 59
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object v8, p0

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    iget-object p1, v0, La/hzd;->i:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$BindEmail;

    .line 65
    .line 66
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v8, p0

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iput-object p1, v0, La/hzd;->i:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$BindEmail;

    .line 75
    .line 76
    iput v5, v0, La/hzd;->l:I

    .line 77
    .line 78
    new-instance v9, La/lie0;

    .line 79
    .line 80
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    iget-object p2, p0, La/kzd;->h:La/ort;

    .line 84
    .line 85
    invoke-virtual {p2}, La/ort;->b()J

    .line 86
    .line 87
    .line 88
    move-result-wide v5

    .line 89
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    new-instance v2, La/p6a;

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    const-string v5, "ActivateEmail"

    .line 99
    .line 100
    const-string v6, ""

    .line 101
    .line 102
    invoke-direct {v2, v5, v6, p2}, La/v0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object p2, p0, La/kzd;->g:La/cyh;

    .line 106
    .line 107
    invoke-virtual {p2, v2}, La/cyh;->a(La/v0;)La/p5a;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    new-instance v2, La/fzd;

    .line 112
    .line 113
    const/4 v7, 0x0

    .line 114
    invoke-direct {v2, p0, v9, v7}, La/fzd;-><init>(La/kzd;La/lie0;La/yje;)V

    .line 115
    .line 116
    .line 117
    new-instance v6, La/fnq;

    .line 118
    .line 119
    const/4 v5, 0x4

    .line 120
    invoke-direct {v6, p2, v2, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 121
    .line 122
    .line 123
    new-instance v5, La/ic1;

    .line 124
    .line 125
    const/16 v10, 0xe

    .line 126
    .line 127
    move-object v8, p0

    .line 128
    invoke-direct/range {v5 .. v10}, La/ic1;-><init>(La/gmq;La/yje;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 129
    .line 130
    .line 131
    new-instance p0, La/vsg0;

    .line 132
    .line 133
    invoke-direct {p0, v5}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p0, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    if-ne p2, v1, :cond_5

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_5
    :goto_1
    check-cast p2, La/ynb0;

    .line 144
    .line 145
    iget-object p0, p1, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$BindEmail;->a:Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Bind;

    .line 146
    .line 147
    iget-object p0, p0, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Bind;->a:Ljava/lang/String;

    .line 148
    .line 149
    iput-object p1, v0, La/hzd;->i:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$BindEmail;

    .line 150
    .line 151
    iput v4, v0, La/hzd;->l:I

    .line 152
    .line 153
    iget-object v2, v8, La/kzd;->k:La/f5c;

    .line 154
    .line 155
    iget-object v2, v2, La/f5c;->a:La/kd30;

    .line 156
    .line 157
    invoke-virtual {v2, v0, p2, p0}, La/kd30;->Z(La/zje;La/ynb0;Ljava/lang/String;)Ljava/io/Serializable;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    if-ne p2, v1, :cond_6

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    :goto_2
    check-cast p2, La/swp0;

    .line 165
    .line 166
    iput-object p1, v0, La/hzd;->i:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$BindEmail;

    .line 167
    .line 168
    iput v3, v0, La/hzd;->l:I

    .line 169
    .line 170
    iget-object p0, v8, La/kzd;->o:La/xzb;

    .line 171
    .line 172
    const/4 v2, 0x0

    .line 173
    invoke-virtual {p0, p2, v2, v0}, La/xzb;->a(La/swp0;ZLa/zje;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    if-ne p2, v1, :cond_7

    .line 178
    .line 179
    :goto_3
    return-object v1

    .line 180
    :cond_7
    :goto_4
    check-cast p2, La/pfi0;

    .line 181
    .line 182
    new-instance p0, La/h6c;

    .line 183
    .line 184
    const/16 v0, 0x12

    .line 185
    .line 186
    invoke-direct {p0, p2, p1, v0}, La/h6c;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 187
    .line 188
    .line 189
    iget-object p1, v8, La/kzd;->b:La/i1w0;

    .line 190
    .line 191
    invoke-virtual {p1, p0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 192
    .line 193
    .line 194
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object p0
.end method

.method public final z(Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$Registration;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/izd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/izd;

    .line 7
    .line 8
    iget v1, v0, La/izd;->l:I

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
    iput v1, v0, La/izd;->l:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/izd;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/izd;-><init>(La/kzd;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v7, La/izd;->j:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v7, La/izd;->l:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v2, :cond_1

    .line 37
    .line 38
    iget-object p1, v7, La/izd;->i:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$Registration;

    .line 39
    .line 40
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move p2, v2

    .line 55
    iget-object v2, p1, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$Registration;->b:La/swp0;

    .line 56
    .line 57
    sget-object v3, La/obk0;->c:La/obk0;

    .line 58
    .line 59
    iput-object p1, v7, La/izd;->i:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$Registration;

    .line 60
    .line 61
    iput p2, v7, La/izd;->l:I

    .line 62
    .line 63
    iget-object v1, p0, La/kzd;->m:La/n5c;

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x1

    .line 67
    const-string v6, ""

    .line 68
    .line 69
    invoke-virtual/range {v1 .. v7}, La/n5c;->a(La/swp0;La/obk0;IZLjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-ne p2, v0, :cond_3

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_3
    :goto_2
    check-cast p2, La/pfi0;

    .line 77
    .line 78
    new-instance v0, La/h6c;

    .line 79
    .line 80
    const/16 v1, 0x10

    .line 81
    .line 82
    invoke-direct {v0, p2, p1, v1}, La/h6c;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    iget-object p0, p0, La/kzd;->b:La/i1w0;

    .line 86
    .line 87
    invoke-virtual {p0, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0
.end method
