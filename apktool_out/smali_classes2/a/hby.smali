.class public final La/hby;
.super La/eby;
.source "SourceFile"


# instance fields
.field public final e:La/pby;

.field public final f:La/iby;

.field public final g:La/gac;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/pby;La/iby;La/gac;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/hu00;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hby;->e:La/pby;

    .line 5
    .line 6
    iput-object p2, p0, La/hby;->f:La/iby;

    .line 7
    .line 8
    iput-object p3, p0, La/hby;->g:La/gac;

    .line 9
    .line 10
    iput-object p4, p0, La/hby;->h:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final l()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final m(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    iget-object p1, p0, La/hby;->g:La/gac;

    .line 2
    .line 3
    invoke-static {p1}, La/pby;->Q(La/hu00;)La/gac;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, La/hby;->e:La/pby;

    .line 8
    .line 9
    iget-object v2, p0, La/hby;->f:La/iby;

    .line 10
    .line 11
    iget-object p0, p0, La/hby;->h:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v2, v0, p0}, La/pby;->a0(La/iby;La/gac;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, v2, La/iby;->a:La/u460;

    .line 23
    .line 24
    new-instance v3, La/wc00;

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    invoke-direct {v3, v4}, La/wc00;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v3, v4}, La/hu00;->d(La/hu00;I)Z

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, La/pby;->Q(La/hu00;)La/gac;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1, v2, p1, p0}, La/pby;->a0(La/iby;La/gac;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    :cond_1
    invoke-virtual {v1, v2, p0}, La/pby;->A(La/iby;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v1, p0}, La/pby;->o(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
