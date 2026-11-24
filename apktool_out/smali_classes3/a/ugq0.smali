.class public final La/ugq0;
.super La/vw5;
.source "SourceFile"


# instance fields
.field public final d:La/drm0;

.field public final e:La/dpi0;

.field public final f:La/ls00;

.field public final g:La/mne;

.field public final h:La/kh3;

.field public final i:La/tc80;

.field public final j:La/p7m0;


# direct methods
.method public constructor <init>(La/o8f;La/drm0;La/dpi0;La/ls00;La/mne;La/duj;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p5, p6}, La/vw5;-><init>(La/o8f;La/mne;La/duj;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/ugq0;->d:La/drm0;

    .line 11
    .line 12
    iput-object p3, p0, La/ugq0;->e:La/dpi0;

    .line 13
    .line 14
    iput-object p4, p0, La/ugq0;->f:La/ls00;

    .line 15
    .line 16
    iput-object p5, p0, La/ugq0;->g:La/mne;

    .line 17
    .line 18
    sget-object p1, La/kh3;->k:La/kh3;

    .line 19
    .line 20
    iput-object p1, p0, La/ugq0;->h:La/kh3;

    .line 21
    .line 22
    sget-object p1, La/tc80;->e:La/tc80;

    .line 23
    .line 24
    iput-object p1, p0, La/ugq0;->i:La/tc80;

    .line 25
    .line 26
    sget-object p1, La/i8d;->a:La/i8d;

    .line 27
    .line 28
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, La/ugq0;->j:La/p7m0;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(La/sje;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/i8d;->b:La/i8d;

    .line 5
    .line 6
    iget-object v1, p0, La/ugq0;->j:La/p7m0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/ugq0;->g:La/mne;

    .line 13
    .line 14
    iget-object v6, v0, La/mne;->c:La/vs10;

    .line 15
    .line 16
    sget-object v4, La/tgq0;->a:La/tgq0;

    .line 17
    .line 18
    new-instance v5, La/h3q0;

    .line 19
    .line 20
    const/16 v0, 0xe

    .line 21
    .line 22
    invoke-direct {v5, p0, v0}, La/h3q0;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    new-instance v7, La/meq0;

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    invoke-direct {v7, p0, p1, v2, v0}, La/meq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    const/16 v8, 0x8

    .line 32
    .line 33
    move-object v3, p1

    .line 34
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final b()La/kh3;
    .locals 0

    .line 1
    iget-object p0, p0, La/ugq0;->h:La/kh3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/p7m0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ugq0;->j:La/p7m0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/util/List;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final e()La/fnf0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ugq0;->i:La/tc80;

    .line 2
    .line 3
    return-object p0
.end method
