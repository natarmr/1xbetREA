.class public final La/fkd0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/i1w0;

.field public final c:Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;

.field public final d:La/duj;

.field public final e:La/n5c;

.field public final f:La/mne;

.field public final g:La/rou;

.field public final h:La/m1e;

.field public final i:La/wpt;

.field public final j:La/s64;

.field public final k:La/p7m0;

.field public final l:La/ol60;

.field public m:La/c4m0;


# direct methods
.method public constructor <init>(La/i1w0;Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;La/duj;La/n5c;La/mne;La/rou;La/m1e;La/wpt;La/s64;)V
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
    iput-object p1, p0, La/fkd0;->b:La/i1w0;

    .line 11
    .line 12
    iput-object p2, p0, La/fkd0;->c:Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;

    .line 13
    .line 14
    iput-object p3, p0, La/fkd0;->d:La/duj;

    .line 15
    .line 16
    iput-object p4, p0, La/fkd0;->e:La/n5c;

    .line 17
    .line 18
    iput-object p5, p0, La/fkd0;->f:La/mne;

    .line 19
    .line 20
    iput-object p6, p0, La/fkd0;->g:La/rou;

    .line 21
    .line 22
    iput-object p7, p0, La/fkd0;->h:La/m1e;

    .line 23
    .line 24
    iput-object p8, p0, La/fkd0;->i:La/wpt;

    .line 25
    .line 26
    iput-object p9, p0, La/fkd0;->j:La/s64;

    .line 27
    .line 28
    new-instance p1, La/yjd0;

    .line 29
    .line 30
    sget-object p3, La/obk0;->b:La/zie0;

    .line 31
    .line 32
    iget-object p2, p2, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;->b:Ljava/util/List;

    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {p2}, La/zie0;->d(Ljava/util/List;)Z

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    invoke-static {p2}, La/zie0;->f(Ljava/util/List;)Z

    .line 42
    .line 43
    .line 44
    move-result p5

    .line 45
    invoke-static {p2}, La/zie0;->e(Ljava/util/List;)Z

    .line 46
    .line 47
    .line 48
    move-result p6

    .line 49
    invoke-static {p2}, La/zie0;->c(Ljava/util/List;)Z

    .line 50
    .line 51
    .line 52
    move-result p7

    .line 53
    const-string p2, ""

    .line 54
    .line 55
    const/4 p3, 0x1

    .line 56
    invoke-direct/range {p1 .. p7}, La/yjd0;-><init>(Ljava/lang/String;ZZZZZ)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, La/fkd0;->k:La/p7m0;

    .line 64
    .line 65
    new-instance p1, La/ol60;

    .line 66
    .line 67
    const/4 p2, 0x3

    .line 68
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, La/fkd0;->l:La/ol60;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final A(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/ckd0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/ckd0;

    .line 7
    .line 8
    iget v1, v0, La/ckd0;->k:I

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
    iput v1, v0, La/ckd0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ckd0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/ckd0;-><init>(La/fkd0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/ckd0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ckd0;->k:I

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
    iget-object p1, p0, La/fkd0;->c:Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;

    .line 51
    .line 52
    iget-object p1, p1, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;->a:La/swp0;

    .line 53
    .line 54
    sget-object v2, La/obk0;->c:La/obk0;

    .line 55
    .line 56
    iget-object v4, p0, La/fkd0;->i:La/wpt;

    .line 57
    .line 58
    invoke-virtual {v4}, La/wpt;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iput v3, v0, La/ckd0;->k:I

    .line 63
    .line 64
    iget-object v3, p0, La/fkd0;->e:La/n5c;

    .line 65
    .line 66
    invoke-static {v3, p1, v2, v4, v0}, La/n5c;->b(La/n5c;La/swp0;La/obk0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p1, La/pfi0;

    .line 74
    .line 75
    sget-object v0, La/yed0;->a:La/yed0;

    .line 76
    .line 77
    new-instance v1, La/zlb0;

    .line 78
    .line 79
    const/16 v2, 0x8

    .line 80
    .line 81
    invoke-direct {v1, p1, v0, p0, v2}, La/zlb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, La/fkd0;->b:La/i1w0;

    .line 85
    .line 86
    invoke-virtual {p0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0
.end method

.method public final B(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/dkd0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/dkd0;

    .line 7
    .line 8
    iget v1, v0, La/dkd0;->k:I

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
    iput v1, v0, La/dkd0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/dkd0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/dkd0;-><init>(La/fkd0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/dkd0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/dkd0;->k:I

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
    iget-object p1, p0, La/fkd0;->c:Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;

    .line 51
    .line 52
    iget-object p1, p1, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;->a:La/swp0;

    .line 53
    .line 54
    sget-object v2, La/obk0;->e:La/obk0;

    .line 55
    .line 56
    iget-object v4, p0, La/fkd0;->i:La/wpt;

    .line 57
    .line 58
    invoke-virtual {v4}, La/wpt;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iput v3, v0, La/dkd0;->k:I

    .line 63
    .line 64
    iget-object v3, p0, La/fkd0;->e:La/n5c;

    .line 65
    .line 66
    invoke-static {v3, p1, v2, v4, v0}, La/n5c;->b(La/n5c;La/swp0;La/obk0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p1, La/pfi0;

    .line 74
    .line 75
    sget-object v0, La/yed0;->c:La/yed0;

    .line 76
    .line 77
    new-instance v1, La/zlb0;

    .line 78
    .line 79
    const/16 v2, 0x8

    .line 80
    .line 81
    invoke-direct {v1, p1, v0, p0, v2}, La/zlb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, La/fkd0;->b:La/i1w0;

    .line 85
    .line 86
    invoke-virtual {p0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0
.end method

.method public final C(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/ekd0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/ekd0;

    .line 7
    .line 8
    iget v1, v0, La/ekd0;->k:I

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
    iput v1, v0, La/ekd0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ekd0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/ekd0;-><init>(La/fkd0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/ekd0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ekd0;->k:I

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
    iget-object p1, p0, La/fkd0;->c:Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;

    .line 51
    .line 52
    iget-object p1, p1, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;->a:La/swp0;

    .line 53
    .line 54
    sget-object v2, La/obk0;->d:La/obk0;

    .line 55
    .line 56
    iget-object v4, p0, La/fkd0;->i:La/wpt;

    .line 57
    .line 58
    invoke-virtual {v4}, La/wpt;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iput v3, v0, La/ekd0;->k:I

    .line 63
    .line 64
    iget-object v3, p0, La/fkd0;->e:La/n5c;

    .line 65
    .line 66
    invoke-static {v3, p1, v2, v4, v0}, La/n5c;->b(La/n5c;La/swp0;La/obk0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p1, La/pfi0;

    .line 74
    .line 75
    sget-object v0, La/yed0;->b:La/yed0;

    .line 76
    .line 77
    new-instance v1, La/zlb0;

    .line 78
    .line 79
    const/16 v2, 0x8

    .line 80
    .line 81
    invoke-direct {v1, p1, v0, p0, v2}, La/zlb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, La/fkd0;->b:La/i1w0;

    .line 85
    .line 86
    invoke-virtual {p0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0
.end method

.method public final w(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/akd0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/akd0;

    .line 7
    .line 8
    iget v1, v0, La/akd0;->k:I

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
    iput v1, v0, La/akd0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/akd0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/akd0;-><init>(La/fkd0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/akd0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/akd0;->k:I

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
    iput v4, v0, La/akd0;->k:I

    .line 52
    .line 53
    iget-object p1, p0, La/fkd0;->g:La/rou;

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
    iget-object p1, p1, La/m2c0;->Z:Ljava/lang/String;

    .line 65
    .line 66
    :cond_4
    iget-object v0, p0, La/fkd0;->k:La/p7m0;

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
    check-cast v2, La/yjd0;

    .line 74
    .line 75
    const/16 v4, 0x3e

    .line 76
    .line 77
    invoke-static {v2, p1, v3, v4}, La/yjd0;->a(La/yjd0;Ljava/lang/String;ZI)La/yjd0;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0
.end method

.method public final x(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    instance-of v0, p1, Ljava/net/UnknownHostException;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    :goto_0
    sget-object p1, La/tjd0;->a:La/tjd0;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, La/fkd0;->y(La/xjd0;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    instance-of v0, p1, La/zhi0;

    .line 17
    .line 18
    iget-object v1, p0, La/fkd0;->d:La/duj;

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    move-object v0, p1

    .line 23
    check-cast v0, La/zhi0;

    .line 24
    .line 25
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 26
    .line 27
    sget-object v2, La/i2o;->i2:La/i2o;

    .line 28
    .line 29
    if-ne v0, v2, :cond_3

    .line 30
    .line 31
    new-instance v0, La/qjd0;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    const-string p1, ""

    .line 40
    .line 41
    :cond_2
    invoke-direct {v0, p1}, La/qjd0;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0}, La/fkd0;->y(La/xjd0;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    new-instance v0, La/pjd0;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-direct {v0, p0, v2}, La/pjd0;-><init>(La/fkd0;B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_4
    new-instance v0, La/pjd0;

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    invoke-direct {v0, p0, v2}, La/pjd0;-><init>(La/fkd0;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final y(La/xjd0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/fkd0;->l:La/ol60;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final z(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/bkd0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/bkd0;

    .line 7
    .line 8
    iget v1, v0, La/bkd0;->k:I

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
    iput v1, v0, La/bkd0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/bkd0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/bkd0;-><init>(La/fkd0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/bkd0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/bkd0;->k:I

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
    iget-object p1, p0, La/fkd0;->c:Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;

    .line 51
    .line 52
    iget-object p1, p1, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;->a:La/swp0;

    .line 53
    .line 54
    sget-object v2, La/obk0;->f:La/obk0;

    .line 55
    .line 56
    iget-object v4, p0, La/fkd0;->i:La/wpt;

    .line 57
    .line 58
    invoke-virtual {v4}, La/wpt;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iput v3, v0, La/bkd0;->k:I

    .line 63
    .line 64
    iget-object v3, p0, La/fkd0;->e:La/n5c;

    .line 65
    .line 66
    invoke-static {v3, p1, v2, v4, v0}, La/n5c;->b(La/n5c;La/swp0;La/obk0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p1, La/pfi0;

    .line 74
    .line 75
    sget-object v0, La/yed0;->d:La/yed0;

    .line 76
    .line 77
    new-instance v1, La/zlb0;

    .line 78
    .line 79
    const/16 v2, 0x8

    .line 80
    .line 81
    invoke-direct {v1, p1, v0, p0, v2}, La/zlb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, La/fkd0;->b:La/i1w0;

    .line 85
    .line 86
    invoke-virtual {p0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0
.end method
