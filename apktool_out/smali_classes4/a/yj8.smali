.class public final La/yj8;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/jtj;

.field public final c:La/pru;

.field public final d:La/mne;

.field public final e:La/duj;

.field public final f:La/sa10;

.field public g:La/c4m0;

.field public final h:La/n0o0;

.field public final i:La/p7m0;


# direct methods
.method public constructor <init>(La/jtj;La/pru;La/mne;La/duj;La/i1w0;La/sa10;)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/yj8;->b:La/jtj;

    .line 8
    .line 9
    iput-object p2, p0, La/yj8;->c:La/pru;

    .line 10
    .line 11
    iput-object p3, p0, La/yj8;->d:La/mne;

    .line 12
    .line 13
    iput-object p4, p0, La/yj8;->e:La/duj;

    .line 14
    .line 15
    iput-object p6, p0, La/yj8;->f:La/sa10;

    .line 16
    .line 17
    new-instance p1, La/vb8;

    .line 18
    .line 19
    const/4 p2, 0x5

    .line 20
    invoke-direct {p1, p0, p2}, La/vb8;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, La/yj8;->h:La/n0o0;

    .line 28
    .line 29
    sget-object p1, La/vj8;->a:La/vj8;

    .line 30
    .line 31
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, La/yj8;->i:La/p7m0;

    .line 36
    .line 37
    invoke-virtual {p0}, La/yj8;->w()V

    .line 38
    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 6

    .line 1
    iget-object v0, p0, La/yj8;->g:La/c4m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, La/yj8;->d:La/mne;

    .line 18
    .line 19
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 20
    .line 21
    new-instance v2, La/d38;

    .line 22
    .line 23
    const/16 v3, 0x9

    .line 24
    .line 25
    invoke-direct {v2, p0, v3}, La/d38;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    new-instance v3, La/qv3;

    .line 29
    .line 30
    const/16 v4, 0x13

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-direct {v3, p0, v5, v4}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v2, v5, v1, v3}, La/sac;->R(La/bvc;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/yj8;->g:La/c4m0;

    .line 41
    .line 42
    return-void
.end method
