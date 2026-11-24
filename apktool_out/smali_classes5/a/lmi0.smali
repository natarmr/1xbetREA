.class public final La/lmi0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vby;

.field public final b:La/vwb0;

.field public final c:La/a8z;

.field public d:J

.field public final e:La/a8z;

.field public final f:La/sje;

.field public g:La/bby;

.field public h:La/c4m0;

.field public volatile i:Z


# direct methods
.method public constructor <init>(La/mne;La/vby;La/vwb0;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/lmi0;->a:La/vby;

    .line 11
    .line 12
    iput-object p3, p0, La/lmi0;->b:La/vwb0;

    .line 13
    .line 14
    new-instance p2, La/jmi0;

    .line 15
    .line 16
    const/4 p3, 0x0

    .line 17
    invoke-direct {p2, p0, p3}, La/jmi0;-><init>(La/lmi0;B)V

    .line 18
    .line 19
    .line 20
    sget-object p3, La/wez;->b:La/wez;

    .line 21
    .line 22
    invoke-static {p3, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, La/lmi0;->c:La/a8z;

    .line 27
    .line 28
    new-instance p2, La/jmi0;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-direct {p2, p0, v0}, La/jmi0;-><init>(La/lmi0;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {p3, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    iput-object p2, p0, La/lmi0;->e:La/a8z;

    .line 39
    .line 40
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 45
    .line 46
    invoke-static {p2, p1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, La/lmi0;->f:La/sje;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a()La/qz40;
    .locals 0

    .line 1
    iget-object p0, p0, La/lmi0;->e:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/qz40;

    .line 8
    .line 9
    return-object p0
.end method

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, La/lmi0;->h:La/c4m0;

    .line 2
    .line 3
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/lmi0;->a()La/qz40;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, La/kmi0;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, p0, v3, v2}, La/kmi0;-><init>(La/lmi0;La/yje;B)V

    .line 15
    .line 16
    .line 17
    new-instance v2, La/fnq;

    .line 18
    .line 19
    const/4 v4, 0x4

    .line 20
    invoke-direct {v2, v0, v1, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 21
    .line 22
    .line 23
    new-instance v0, La/bai0;

    .line 24
    .line 25
    const/4 v1, 0x7

    .line 26
    invoke-direct {v0, p0, v3, v1}, La/bai0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, La/lmi0;->f:La/sje;

    .line 30
    .line 31
    invoke-static {v2, v1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, La/lmi0;->h:La/c4m0;

    .line 36
    .line 37
    return-void
.end method

.method public final c()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/lmi0;->a()La/qz40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/p7m0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/smi0;

    .line 12
    .line 13
    iget-object v1, v0, La/smi0;->a:La/umi0;

    .line 14
    .line 15
    sget-object v2, La/umi0;->c:La/umi0;

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    iget-boolean v0, v0, La/smi0;->b:Z

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, La/lmi0;->i:Z

    .line 25
    .line 26
    iget-object v1, p0, La/lmi0;->g:La/bby;

    .line 27
    .line 28
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, La/lmi0;->f:La/sje;

    .line 32
    .line 33
    new-instance v6, La/rai0;

    .line 34
    .line 35
    const/4 v1, 0x6

    .line 36
    invoke-direct {v6, p0, v1}, La/rai0;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    new-instance v7, La/kmi0;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-direct {v7, p0, v1, v0}, La/kmi0;-><init>(La/lmi0;La/yje;B)V

    .line 43
    .line 44
    .line 45
    const/4 v8, 0x4

    .line 46
    const-wide/16 v3, 0x1

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-static/range {v2 .. v8}, La/sac;->Y(La/vne;JLkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/lmi0;->g:La/bby;

    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    invoke-virtual {p0}, La/lmi0;->b()V

    .line 57
    .line 58
    .line 59
    return-void
.end method
