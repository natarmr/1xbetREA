.class public final La/l570;
.super La/eiu0;
.source "SourceFile"


# instance fields
.field public final c:La/yoc;

.field public final d:La/yoc;

.field public final e:La/ugf0;

.field public final f:La/mne;

.field public final g:La/duj;

.field public h:La/bby;


# direct methods
.method public constructor <init>(La/yoc;La/yoc;La/ugf0;La/mne;La/duj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/l570;->c:La/yoc;

    .line 5
    .line 6
    iput-object p2, p0, La/l570;->d:La/yoc;

    .line 7
    .line 8
    iput-object p3, p0, La/l570;->e:La/ugf0;

    .line 9
    .line 10
    iput-object p4, p0, La/l570;->f:La/mne;

    .line 11
    .line 12
    iput-object p5, p0, La/l570;->g:La/duj;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final v(La/bvc;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 9

    .line 1
    iget-object v0, p0, La/l570;->h:La/bby;

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
    iget-object v0, p0, La/l570;->d:La/yoc;

    .line 14
    .line 15
    invoke-virtual {v0}, La/yoc;->a()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    iget-object v0, p0, La/l570;->f:La/mne;

    .line 20
    .line 21
    iget-object v7, v0, La/mne;->a:La/rwj;

    .line 22
    .line 23
    const-class v0, Ljava/net/UnknownHostException;

    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    new-instance v6, La/az60;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {v6, p0, p2, p4, v0}, La/az60;-><init>(La/l570;Ljava/util/List;Lkotlin/jvm/functions/Function1;La/yje;)V

    .line 33
    .line 34
    .line 35
    new-instance v8, La/jl40;

    .line 36
    .line 37
    const/16 v0, 0xf

    .line 38
    .line 39
    invoke-direct {v8, p0, p2, p4, v0}, La/jl40;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    move-object v1, p1

    .line 43
    move-object v2, p3

    .line 44
    invoke-static/range {v1 .. v8}, La/sac;->S(La/bvc;Ljava/lang/String;JLjava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;)La/bby;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, La/l570;->h:La/bby;

    .line 49
    .line 50
    return-void
.end method
