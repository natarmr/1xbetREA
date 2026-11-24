.class public final La/cg5;
.super La/vw5;
.source "SourceFile"


# instance fields
.field public final d:La/hcp0;

.field public final e:La/iqt;

.field public final f:La/mne;

.field public final g:La/kh3;

.field public final h:La/hst0;

.field public final i:Ljava/util/List;

.field public final j:La/p7m0;


# direct methods
.method public constructor <init>(La/o8f;La/xqt0;La/hcp0;La/iqt;La/mne;La/duj;)V
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
    invoke-direct {p0, p1, p5, p6}, La/vw5;-><init>(La/o8f;La/mne;La/duj;)V

    .line 8
    .line 9
    .line 10
    iput-object p3, p0, La/cg5;->d:La/hcp0;

    .line 11
    .line 12
    iput-object p4, p0, La/cg5;->e:La/iqt;

    .line 13
    .line 14
    iput-object p5, p0, La/cg5;->f:La/mne;

    .line 15
    .line 16
    sget-object p1, La/kh3;->h:La/kh3;

    .line 17
    .line 18
    iput-object p1, p0, La/cg5;->g:La/kh3;

    .line 19
    .line 20
    sget-object p1, La/hst0;->c:La/hst0;

    .line 21
    .line 22
    iput-object p1, p0, La/cg5;->h:La/hst0;

    .line 23
    .line 24
    invoke-static {p2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La/cg5;->i:Ljava/util/List;

    .line 29
    .line 30
    sget-object p1, La/i8d;->a:La/i8d;

    .line 31
    .line 32
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, La/cg5;->j:La/p7m0;

    .line 37
    .line 38
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
    iget-object v1, p0, La/cg5;->j:La/p7m0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/cg5;->f:La/mne;

    .line 13
    .line 14
    iget-object v6, v0, La/mne;->b:La/dvj;

    .line 15
    .line 16
    new-instance v4, La/ys3;

    .line 17
    .line 18
    const/16 v0, 0x1c

    .line 19
    .line 20
    invoke-direct {v4, p0, p1, v0}, La/ys3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    new-instance v7, La/qv3;

    .line 24
    .line 25
    const/4 v0, 0x7

    .line 26
    invoke-direct {v7, p0, v2, v0}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 27
    .line 28
    .line 29
    const/16 v8, 0xa

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    move-object v3, p1

    .line 33
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final b()La/kh3;
    .locals 0

    .line 1
    iget-object p0, p0, La/cg5;->g:La/kh3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/p7m0;
    .locals 0

    .line 1
    iget-object p0, p0, La/cg5;->j:La/p7m0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/cg5;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()La/fnf0;
    .locals 0

    .line 1
    iget-object p0, p0, La/cg5;->h:La/hst0;

    .line 2
    .line 3
    return-object p0
.end method
