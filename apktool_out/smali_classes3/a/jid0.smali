.class public final La/jid0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/ctf0;

.field public final c:La/i1w0;

.field public final d:La/yox;

.field public final e:La/mne;

.field public final f:Lorg/xplatform/authqr/impl/qr/presentation/confirmation/secret_question/params/QrConfirmSecretQuestionFragmentScreenParams;

.field public final g:La/rou;

.field public final h:La/ubu;

.field public final i:La/zoi0;

.field public final j:La/m1e;

.field public final k:La/p7m0;

.field public final l:La/ol60;

.field public m:La/c4m0;


# direct methods
.method public constructor <init>(La/ctf0;La/i1w0;La/yox;La/mne;Lorg/xplatform/authqr/impl/qr/presentation/confirmation/secret_question/params/QrConfirmSecretQuestionFragmentScreenParams;La/rou;La/ubu;La/zoi0;La/m1e;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, La/w46;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/jid0;->b:La/ctf0;

    .line 14
    .line 15
    iput-object p2, p0, La/jid0;->c:La/i1w0;

    .line 16
    .line 17
    iput-object p3, p0, La/jid0;->d:La/yox;

    .line 18
    .line 19
    iput-object p4, p0, La/jid0;->e:La/mne;

    .line 20
    .line 21
    iput-object p5, p0, La/jid0;->f:Lorg/xplatform/authqr/impl/qr/presentation/confirmation/secret_question/params/QrConfirmSecretQuestionFragmentScreenParams;

    .line 22
    .line 23
    iput-object p6, p0, La/jid0;->g:La/rou;

    .line 24
    .line 25
    iput-object p7, p0, La/jid0;->h:La/ubu;

    .line 26
    .line 27
    iput-object p8, p0, La/jid0;->i:La/zoi0;

    .line 28
    .line 29
    iput-object p9, p0, La/jid0;->j:La/m1e;

    .line 30
    .line 31
    new-instance p2, La/iid0;

    .line 32
    .line 33
    const/4 p3, 0x0

    .line 34
    new-array p4, p3, [Ljava/lang/Object;

    .line 35
    .line 36
    const p6, 0x7f13010d

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p6, p4}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object p4, p5, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/secret_question/params/QrConfirmSecretQuestionFragmentScreenParams;->a:Ljava/lang/String;

    .line 44
    .line 45
    const-string p5, ": "

    .line 46
    .line 47
    invoke-static {p1, p5, p4}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p4, ""

    .line 52
    .line 53
    const/4 p5, 0x1

    .line 54
    invoke-direct {p2, p1, p4, p3, p5}, La/iid0;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 55
    .line 56
    .line 57
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, La/jid0;->k:La/p7m0;

    .line 62
    .line 63
    new-instance p1, La/ol60;

    .line 64
    .line 65
    const/4 p2, 0x3

    .line 66
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, La/jid0;->l:La/ol60;

    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 4

    .line 1
    iget-object p0, p0, La/jid0;->c:La/i1w0;

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

.method public final x()V
    .locals 8

    .line 1
    iget-object v0, p0, La/jid0;->k:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/iid0;

    .line 8
    .line 9
    iget-boolean v1, v1, La/iid0;->d:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, La/jid0;->l:La/ol60;

    .line 14
    .line 15
    sget-object v0, La/aid0;->a:La/aid0;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, La/iid0;

    .line 26
    .line 27
    iget-object v0, v0, La/iid0;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v1, p0, La/jid0;->e:La/mne;

    .line 41
    .line 42
    iget-object v5, v1, La/mne;->b:La/dvj;

    .line 43
    .line 44
    new-instance v3, La/v6d0;

    .line 45
    .line 46
    const/4 v1, 0x6

    .line 47
    invoke-direct {v3, p0, v1}, La/v6d0;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    new-instance v6, La/er60;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    const/16 v4, 0x19

    .line 54
    .line 55
    invoke-direct {v6, p0, v0, v1, v4}, La/er60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 56
    .line 57
    .line 58
    const/16 v7, 0xa

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final y(La/hid0;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/jid0;->e:La/mne;

    .line 6
    .line 7
    iget-object v3, v1, La/mne;->c:La/vs10;

    .line 8
    .line 9
    new-instance v1, La/ljc0;

    .line 10
    .line 11
    const/16 v2, 0x18

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
    const/16 v5, 0xd

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
