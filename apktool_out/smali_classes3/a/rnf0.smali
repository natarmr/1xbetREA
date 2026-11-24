.class public final La/rnf0;
.super La/vw5;
.source "SourceFile"


# instance fields
.field public final d:La/mne;

.field public final e:La/kh3;

.field public final f:La/yqt0;

.field public final g:La/p7m0;

.field public h:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(La/o8f;La/mne;La/htz;La/duj;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p4}, La/vw5;-><init>(La/o8f;La/mne;La/duj;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/rnf0;->d:La/mne;

    .line 8
    .line 9
    sget-object p1, La/kh3;->j:La/kh3;

    .line 10
    .line 11
    iput-object p1, p0, La/rnf0;->e:La/kh3;

    .line 12
    .line 13
    sget-object p1, La/yqt0;->b:La/yqt0;

    .line 14
    .line 15
    iput-object p1, p0, La/rnf0;->f:La/yqt0;

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
    iput-object p1, p0, La/rnf0;->g:La/p7m0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(La/sje;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :cond_0
    iget-object v0, p0, La/rnf0;->g:La/p7m0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, La/i8d;

    .line 12
    .line 13
    sget-object v2, La/i8d;->b:La/i8d;

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, La/rnf0;->d:La/mne;

    .line 22
    .line 23
    iget-object v4, v0, La/mne;->c:La/vs10;

    .line 24
    .line 25
    new-instance v2, La/dff0;

    .line 26
    .line 27
    const/4 v0, 0x6

    .line 28
    invoke-direct {v2, p0, p1, v0}, La/dff0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/coc0;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    const/16 v1, 0x17

    .line 35
    .line 36
    invoke-direct {v5, p0, v0, v1}, La/coc0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 37
    .line 38
    .line 39
    const/16 v6, 0xa

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    move-object v1, p1

    .line 43
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final b()La/kh3;
    .locals 0

    .line 1
    iget-object p0, p0, La/rnf0;->e:La/kh3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/p7m0;
    .locals 0

    .line 1
    iget-object p0, p0, La/rnf0;->g:La/p7m0;

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
    iget-object p0, p0, La/rnf0;->f:La/yqt0;

    .line 2
    .line 3
    return-object p0
.end method
