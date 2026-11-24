.class public final La/ouf;
.super La/vw5;
.source "SourceFile"


# instance fields
.field public final d:La/lsn;

.field public final e:La/q0u;

.field public final f:La/o470;

.field public final g:La/mne;

.field public final h:La/kh3;

.field public final i:La/upe;

.field public final j:La/p7m0;


# direct methods
.method public constructor <init>(La/o8f;La/lsn;La/q0u;La/o470;La/mne;La/duj;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p5, p6}, La/vw5;-><init>(La/o8f;La/mne;La/duj;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/ouf;->d:La/lsn;

    .line 8
    .line 9
    iput-object p3, p0, La/ouf;->e:La/q0u;

    .line 10
    .line 11
    iput-object p4, p0, La/ouf;->f:La/o470;

    .line 12
    .line 13
    iput-object p5, p0, La/ouf;->g:La/mne;

    .line 14
    .line 15
    sget-object p1, La/kh3;->g:La/kh3;

    .line 16
    .line 17
    iput-object p1, p0, La/ouf;->h:La/kh3;

    .line 18
    .line 19
    sget-object p1, La/upe;->c:La/upe;

    .line 20
    .line 21
    iput-object p1, p0, La/ouf;->i:La/upe;

    .line 22
    .line 23
    sget-object p1, La/i8d;->a:La/i8d;

    .line 24
    .line 25
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, La/ouf;->j:La/p7m0;

    .line 30
    .line 31
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
    iget-object v1, p0, La/ouf;->j:La/p7m0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/ouf;->g:La/mne;

    .line 13
    .line 14
    iget-object v6, v0, La/mne;->c:La/vs10;

    .line 15
    .line 16
    new-instance v4, La/v4f;

    .line 17
    .line 18
    const/16 v0, 0xc

    .line 19
    .line 20
    invoke-direct {v4, p0, p1, v0}, La/v4f;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    new-instance v7, La/fr9;

    .line 24
    .line 25
    const/16 v0, 0xb

    .line 26
    .line 27
    invoke-direct {v7, p0, v2, v0}, La/fr9;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 28
    .line 29
    .line 30
    const/16 v8, 0xa

    .line 31
    .line 32
    const/4 v5, 0x0

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
    iget-object p0, p0, La/ouf;->h:La/kh3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/p7m0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ouf;->j:La/p7m0;

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
    iget-object p0, p0, La/ouf;->i:La/upe;

    .line 2
    .line 3
    return-object p0
.end method
