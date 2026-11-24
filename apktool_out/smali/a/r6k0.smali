.class public final La/r6k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/k050;

.field public c:Landroid/javax/sip/SipStack;

.field public d:Landroid/javax/sip/SipProvider;

.field public e:Landroid/javax/sip/ListeningPoint;

.field public final f:Ljava/util/concurrent/atomic/AtomicReference;

.field public final g:Ljava/util/concurrent/atomic/AtomicReference;

.field public final h:Landroid/javax/sip/SipFactory;

.field public final i:La/n0o0;

.field public final j:La/n0o0;

.field public final k:La/n0o0;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/r6k0;->a:Ljava/lang/String;

    .line 8
    .line 9
    new-instance p1, La/k050;

    .line 10
    .line 11
    invoke-direct {p1}, La/k050;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/r6k0;->b:La/k050;

    .line 15
    .line 16
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/r6k0;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/r6k0;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 30
    .line 31
    invoke-static {}, Landroid/javax/sip/SipFactory;->getInstance()Landroid/javax/sip/SipFactory;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, La/r6k0;->h:Landroid/javax/sip/SipFactory;

    .line 39
    .line 40
    new-instance p1, La/o6k0;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-direct {p1, p0, v0}, La/o6k0;-><init>(La/r6k0;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, La/r6k0;->i:La/n0o0;

    .line 51
    .line 52
    new-instance p1, La/o6k0;

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-direct {p1, p0, v0}, La/o6k0;-><init>(La/r6k0;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, La/r6k0;->j:La/n0o0;

    .line 63
    .line 64
    new-instance p1, La/o6k0;

    .line 65
    .line 66
    const/4 v0, 0x2

    .line 67
    invoke-direct {p1, p0, v0}, La/o6k0;-><init>(La/r6k0;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, La/r6k0;->k:La/n0o0;

    .line 75
    .line 76
    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 5

    .line 1
    :try_start_0
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    new-instance v1, La/s3d;

    .line 8
    .line 9
    invoke-direct {v1, v0}, La/s3d;-><init>(Ljava/util/Enumeration;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, La/lgi0;->b(Ljava/util/Iterator;)La/v2e;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, La/thj0;

    .line 17
    .line 18
    const/16 v2, 0x10

    .line 19
    .line 20
    invoke-direct {v1, v2}, La/thj0;-><init>(B)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, La/thj0;

    .line 28
    .line 29
    const/16 v2, 0x11

    .line 30
    .line 31
    invoke-direct {v1, v2}, La/thj0;-><init>(B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, La/pgi0;->k(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, La/bkq;

    .line 39
    .line 40
    invoke-direct {v1, v0}, La/bkq;-><init>(La/ckq;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {v1}, La/bkq;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v1}, La/bkq;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v2, v0

    .line 54
    check-cast v2, Ljava/net/InetAddress;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-eqz v2, :cond_0

    .line 61
    .line 62
    const-string v3, "."

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-static {v2, v3, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    const/4 v3, 0x1

    .line 70
    if-ne v2, v3, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    const/4 v0, 0x0

    .line 74
    :goto_0
    check-cast v0, Ljava/net/InetAddress;

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    return-object v0

    .line 85
    :catch_0
    :cond_2
    const-string v0, "127.0.0.1"

    .line 86
    .line 87
    return-object v0
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/p6k0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/p6k0;

    .line 7
    .line 8
    iget v1, v0, La/p6k0;->l:I

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
    iput v1, v0, La/p6k0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/p6k0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/p6k0;-><init>(La/r6k0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/p6k0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/p6k0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, La/p6k0;->i:La/k050;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/r6k0;->b:La/k050;

    .line 53
    .line 54
    iput-object p1, v0, La/p6k0;->i:La/k050;

    .line 55
    .line 56
    iput v3, v0, La/p6k0;->l:I

    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    iput-object v4, p0, La/r6k0;->d:Landroid/javax/sip/SipProvider;

    .line 67
    .line 68
    iput-object v4, p0, La/r6k0;->e:Landroid/javax/sip/ListeningPoint;

    .line 69
    .line 70
    iget-object p1, p0, La/r6k0;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 71
    .line 72
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, La/r6k0;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 76
    .line 77
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    :try_start_1
    iget-object p1, p0, La/r6k0;->c:Landroid/javax/sip/SipStack;

    .line 81
    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    invoke-interface {p1}, Landroid/javax/sip/SipStack;->stop()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    .line 86
    .line 87
    :catch_0
    :cond_4
    :try_start_2
    iput-object v4, p0, La/r6k0;->c:Landroid/javax/sip/SipStack;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    .line 89
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    throw p0
.end method

.method public final c()Landroid/javax/sip/address/AddressFactory;
    .locals 0

    .line 1
    iget-object p0, p0, La/r6k0;->k:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/javax/sip/address/AddressFactory;

    .line 11
    .line 12
    return-object p0
.end method

.method public final d()Landroid/javax/sip/header/HeaderFactory;
    .locals 0

    .line 1
    iget-object p0, p0, La/r6k0;->i:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/javax/sip/header/HeaderFactory;

    .line 11
    .line 12
    return-object p0
.end method

.method public final e()Landroid/javax/sip/message/MessageFactory;
    .locals 0

    .line 1
    iget-object p0, p0, La/r6k0;->j:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/javax/sip/message/MessageFactory;

    .line 11
    .line 12
    return-object p0
.end method

.method public final f()Landroid/javax/sip/SipProvider;
    .locals 0

    .line 1
    iget-object p0, p0, La/r6k0;->d:Landroid/javax/sip/SipProvider;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "SipProvider not initialized. Call initSipStack() first."

    .line 7
    .line 8
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final g(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/q6k0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/q6k0;

    .line 7
    .line 8
    iget v1, v0, La/q6k0;->l:I

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
    iput v1, v0, La/q6k0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/q6k0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/q6k0;-><init>(La/r6k0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/q6k0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/q6k0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, La/q6k0;->i:La/k050;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/r6k0;->b:La/k050;

    .line 53
    .line 54
    iput-object p1, v0, La/q6k0;->i:La/k050;

    .line 55
    .line 56
    iput v3, v0, La/q6k0;->l:I

    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    invoke-virtual {p0}, La/r6k0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    throw p0
.end method

.method public final h()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La/r6k0;->d:Landroid/javax/sip/SipProvider;

    .line 3
    .line 4
    iput-object v0, p0, La/r6k0;->e:Landroid/javax/sip/ListeningPoint;

    .line 5
    .line 6
    iget-object v1, p0, La/r6k0;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, La/r6k0;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v1, p0, La/r6k0;->c:Landroid/javax/sip/SipStack;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Landroid/javax/sip/SipStack;->stop()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    :catch_0
    :cond_0
    iput-object v0, p0, La/r6k0;->c:Landroid/javax/sip/SipStack;

    .line 24
    .line 25
    const-string v1, "android.gov.nist"

    .line 26
    .line 27
    iget-object v2, p0, La/r6k0;->h:Landroid/javax/sip/SipFactory;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Landroid/javax/sip/SipFactory;->setPathName(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Ljava/util/Properties;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/util/Properties;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v3, "android.javax.sip.STACK_NAME"

    .line 38
    .line 39
    iget-object v4, p0, La/r6k0;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v1, v3, v4}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    const-string v3, "android.gov.nist.javax.sip.TRACE_LEVEL"

    .line 45
    .line 46
    const-string v4, "0"

    .line 47
    .line 48
    invoke-virtual {v1, v3, v4}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    const-string v3, "android.gov.nist.javax.sip.SERVER_LOG"

    .line 52
    .line 53
    const-string v4, ""

    .line 54
    .line 55
    invoke-virtual {v1, v3, v4}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    const-string v3, "android.gov.nist.javax.sip.DEBUG_LOG"

    .line 59
    .line 60
    invoke-virtual {v1, v3, v4}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    const-string v3, "android.gov.nist.javax.sip.LOG_MESSAGE_CONTENT"

    .line 64
    .line 65
    const-string v4, "false"

    .line 66
    .line 67
    invoke-virtual {v1, v3, v4}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    const-string v3, "android.javax.sip.ROUTER_PATH"

    .line 71
    .line 72
    const-string v5, "android.gov.nist.javax.sip.stack.DefaultRouter"

    .line 73
    .line 74
    invoke-virtual {v1, v3, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    const-string v3, "android.javax.sip.RETRANSMISSION_FILTER"

    .line 78
    .line 79
    const-string v5, "true"

    .line 80
    .line 81
    invoke-virtual {v1, v3, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    const-string v3, "android.javax.sip.TIMER_T1"

    .line 85
    .line 86
    const-string v5, "500"

    .line 87
    .line 88
    invoke-virtual {v1, v3, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    const-string v3, "android.javax.sip.TIMER_T2"

    .line 92
    .line 93
    const-string v5, "4000"

    .line 94
    .line 95
    invoke-virtual {v1, v3, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    const-string v3, "android.gov.nist.javax.sip.DELIVER_TERMINATED_EVENT_FOR_ACK"

    .line 99
    .line 100
    invoke-virtual {v1, v3, v4}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v1}, Landroid/javax/sip/SipFactory;->createSipStack(Ljava/util/Properties;)Landroid/javax/sip/SipStack;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-static {}, La/r6k0;->b()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const/4 v3, 0x0

    .line 115
    move v4, v3

    .line 116
    :goto_0
    const/4 v5, 0x5

    .line 117
    if-ge v4, v5, :cond_1

    .line 118
    .line 119
    :try_start_1
    new-instance v0, Ljava/net/DatagramSocket;

    .line 120
    .line 121
    invoke-direct {v0, v3}, Ljava/net/DatagramSocket;-><init>(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 122
    .line 123
    .line 124
    :try_start_2
    invoke-virtual {v0}, Ljava/net/DatagramSocket;->getLocalPort()I

    .line 125
    .line 126
    .line 127
    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    :try_start_3
    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    .line 129
    .line 130
    .line 131
    const-string v0, "UDP"

    .line 132
    .line 133
    invoke-interface {v1, v2, v5, v0}, Landroid/javax/sip/SipStack;->createListeningPoint(Ljava/lang/String;ILjava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 138
    .line 139
    .line 140
    iput-object v1, p0, La/r6k0;->c:Landroid/javax/sip/SipStack;

    .line 141
    .line 142
    iput-object v0, p0, La/r6k0;->e:Landroid/javax/sip/ListeningPoint;

    .line 143
    .line 144
    invoke-interface {v1, v0}, Landroid/javax/sip/SipStack;->createSipProvider(Landroid/javax/sip/ListeningPoint;)Landroid/javax/sip/SipProvider;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iput-object v0, p0, La/r6k0;->d:Landroid/javax/sip/SipProvider;

    .line 149
    .line 150
    return-void

    .line 151
    :catch_1
    move-exception v0

    .line 152
    goto :goto_1

    .line 153
    :catchall_0
    move-exception v5

    .line 154
    :try_start_4
    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 155
    :catchall_1
    move-exception v6

    .line 156
    :try_start_5
    invoke-static {v0, v5}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    throw v6
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 160
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_1
    if-nez v0, :cond_2

    .line 164
    .line 165
    const-string p0, "Failed to bind SIP listening point"

    .line 166
    .line 167
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_2
    throw v0
.end method

.method public final i()I
    .locals 0

    .line 1
    iget-object p0, p0, La/r6k0;->e:Landroid/javax/sip/ListeningPoint;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Landroid/javax/sip/ListeningPoint;->getPort()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method
