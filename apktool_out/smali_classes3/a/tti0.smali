.class public final La/tti0;
.super La/vw5;
.source "SourceFile"


# instance fields
.field public final d:La/mne;

.field public final e:La/kh3;

.field public final f:La/qsf0;

.field public final g:La/p7m0;


# direct methods
.method public constructor <init>(La/o8f;La/sqt;La/mne;La/duj;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p3, p4}, La/vw5;-><init>(La/o8f;La/mne;La/duj;)V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, La/tti0;->d:La/mne;

    .line 8
    .line 9
    sget-object p1, La/kh3;->c:La/kh3;

    .line 10
    .line 11
    iput-object p1, p0, La/tti0;->e:La/kh3;

    .line 12
    .line 13
    sget-object p1, La/qsf0;->b:La/qsf0;

    .line 14
    .line 15
    iput-object p1, p0, La/tti0;->f:La/qsf0;

    .line 16
    .line 17
    sget-object p1, La/i8d;->a:La/i8d;

    .line 18
    .line 19
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, La/tti0;->g:La/p7m0;

    .line 24
    .line 25
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
    iget-object v1, p0, La/tti0;->g:La/p7m0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/tti0;->d:La/mne;

    .line 13
    .line 14
    iget-object v6, v0, La/mne;->c:La/vs10;

    .line 15
    .line 16
    new-instance v4, La/huh0;

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    invoke-direct {v4, p0, p1, v0}, La/huh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    new-instance v7, La/yng0;

    .line 23
    .line 24
    const/16 v0, 0xe

    .line 25
    .line 26
    invoke-direct {v7, p0, v2, v0}, La/yng0;-><init>(Ljava/lang/Object;La/yje;B)V

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
    iget-object p0, p0, La/tti0;->e:La/kh3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/p7m0;
    .locals 0

    .line 1
    iget-object p0, p0, La/tti0;->g:La/p7m0;

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
    iget-object p0, p0, La/tti0;->f:La/qsf0;

    .line 2
    .line 3
    return-object p0
.end method
