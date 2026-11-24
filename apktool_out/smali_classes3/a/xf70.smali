.class public final La/xf70;
.super La/uf70;
.source "SourceFile"


# instance fields
.field public final d:La/fq;

.field public final e:La/lzt;

.field public final f:La/mne;


# direct methods
.method public constructor <init>(La/fq;La/xcc;La/mne;La/lzt;La/qa60;La/i1w0;)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p5, p2}, La/uf70;-><init>(La/qa60;La/xcc;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/xf70;->d:La/fq;

    .line 20
    .line 21
    iput-object p4, p0, La/xf70;->e:La/lzt;

    .line 22
    .line 23
    iput-object p3, p0, La/xf70;->f:La/mne;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final x()V
    .locals 7

    .line 1
    iget-object v0, p0, La/xf70;->e:La/lzt;

    .line 2
    .line 3
    invoke-virtual {v0}, La/lzt;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v0, p0, La/xf70;->f:La/mne;

    .line 14
    .line 15
    iget-object v4, v0, La/mne;->a:La/rwj;

    .line 16
    .line 17
    sget-object v2, La/wf70;->a:La/wf70;

    .line 18
    .line 19
    new-instance v5, La/c670;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-direct {v5, p0, v0, v3}, La/c670;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 24
    .line 25
    .line 26
    const/16 v6, 0xa

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method
