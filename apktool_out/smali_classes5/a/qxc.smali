.class public final La/qxc;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/mvc;

.field public final c:La/duj;

.field public final d:La/m1e;

.field public final e:La/mne;

.field public final f:La/i1w0;

.field public final g:La/lyt;

.field public final h:La/ntu;

.field public final i:La/ctf0;

.field public final j:La/grj;

.field public final k:La/n0o0;

.field public final l:La/ol60;

.field public final m:La/p7m0;

.field public n:La/c4m0;

.field public o:La/bby;


# direct methods
.method public constructor <init>(La/mvc;La/duj;La/m1e;La/mne;La/i1w0;La/lyt;La/ntu;La/ctf0;La/grj;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, La/w46;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/qxc;->b:La/mvc;

    .line 14
    .line 15
    iput-object p2, p0, La/qxc;->c:La/duj;

    .line 16
    .line 17
    iput-object p3, p0, La/qxc;->d:La/m1e;

    .line 18
    .line 19
    iput-object p4, p0, La/qxc;->e:La/mne;

    .line 20
    .line 21
    iput-object p5, p0, La/qxc;->f:La/i1w0;

    .line 22
    .line 23
    iput-object p6, p0, La/qxc;->g:La/lyt;

    .line 24
    .line 25
    iput-object p7, p0, La/qxc;->h:La/ntu;

    .line 26
    .line 27
    iput-object p8, p0, La/qxc;->i:La/ctf0;

    .line 28
    .line 29
    iput-object p9, p0, La/qxc;->j:La/grj;

    .line 30
    .line 31
    new-instance p1, La/lxc;

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    invoke-direct {p1, p0, p2}, La/lxc;-><init>(La/qxc;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, La/qxc;->k:La/n0o0;

    .line 42
    .line 43
    new-instance p1, La/ol60;

    .line 44
    .line 45
    const/4 p2, 0x3

    .line 46
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, La/qxc;->l:La/ol60;

    .line 50
    .line 51
    new-instance p3, La/yvc;

    .line 52
    .line 53
    sget-object p4, La/iun;->a:La/iun;

    .line 54
    .line 55
    const/4 p7, 0x0

    .line 56
    const-wide/16 p8, 0x0

    .line 57
    .line 58
    const/4 p5, 0x1

    .line 59
    const/4 p6, -0x1

    .line 60
    invoke-direct/range {p3 .. p9}, La/yvc;-><init>(Ljava/util/List;ZILa/jkm;J)V

    .line 61
    .line 62
    .line 63
    invoke-static {p3}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, La/qxc;->m:La/p7m0;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 13

    .line 1
    iget-object v0, p0, La/qxc;->o:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/bby;->isActive()Z

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
    move-result-object v2

    .line 17
    iget-object v0, p0, La/qxc;->e:La/mne;

    .line 18
    .line 19
    iget-object v4, v0, La/mne;->a:La/rwj;

    .line 20
    .line 21
    new-instance v5, La/enc;

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    const/16 v12, 0xa

    .line 25
    .line 26
    const/4 v6, 0x1

    .line 27
    const-class v8, La/qxc;

    .line 28
    .line 29
    const-string v9, "handleError"

    .line 30
    .line 31
    const-string v10, "handleError(Ljava/lang/Throwable;)V"

    .line 32
    .line 33
    move-object v7, p0

    .line 34
    invoke-direct/range {v5 .. v12}, La/enc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 35
    .line 36
    .line 37
    new-instance v6, La/mxc;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {v6, p0, v0, v1}, La/mxc;-><init>(La/qxc;La/yje;B)V

    .line 42
    .line 43
    .line 44
    const/16 v7, 0x56

    .line 45
    .line 46
    const-string v3, "CmsNewsMainViewModel.getBanners"

    .line 47
    .line 48
    invoke-static/range {v2 .. v7}, La/sac;->g0(La/bvc;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, La/qxc;->o:La/bby;

    .line 53
    .line 54
    return-void
.end method

.method public final x()V
    .locals 9

    .line 1
    :cond_0
    iget-object v0, p0, La/qxc;->m:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/yvc;

    .line 9
    .line 10
    const-wide/16 v6, 0x2710

    .line 11
    .line 12
    const/16 v8, 0xf

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    invoke-static/range {v2 .. v8}, La/yvc;->a(La/yvc;Ljava/util/ArrayList;ILa/jkm;JI)La/yvc;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, La/qxc;->w()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final y()V
    .locals 11

    .line 1
    :cond_0
    iget-object v0, p0, La/qxc;->m:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/yvc;

    .line 9
    .line 10
    sget-object v4, La/okm;->a:La/okm;

    .line 11
    .line 12
    sget-object v5, La/ikm;->a:La/ikm;

    .line 13
    .line 14
    new-instance v3, La/jkm;

    .line 15
    .line 16
    new-instance v10, La/lxc;

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    invoke-direct {v10, p0, v6}, La/lxc;-><init>(La/qxc;B)V

    .line 20
    .line 21
    .line 22
    const v6, 0x7f130bc3

    .line 23
    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    const v8, 0x7f130677

    .line 27
    .line 28
    .line 29
    const v9, 0x7f131690

    .line 30
    .line 31
    .line 32
    invoke-direct/range {v3 .. v10}, La/jkm;-><init>(La/okm;La/ikm;IIIILkotlin/jvm/functions/Function0;)V

    .line 33
    .line 34
    .line 35
    const-wide/16 v6, 0x0

    .line 36
    .line 37
    const/4 v8, 0x5

    .line 38
    move-object v5, v3

    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-static/range {v2 .. v8}, La/yvc;->a(La/yvc;Ljava/util/ArrayList;ILa/jkm;JI)La/yvc;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    return-void
.end method
