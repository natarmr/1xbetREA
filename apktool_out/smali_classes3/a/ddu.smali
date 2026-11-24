.class public final La/ddu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pbt;


# direct methods
.method public constructor <init>(La/pbt;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ddu;->a:La/pbt;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a([ILa/bnn0;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p1}, La/tx3;->e0([I)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, La/ddu;->a:La/pbt;

    .line 6
    .line 7
    iget-object v0, p0, La/pbt;->m:La/mne;

    .line 8
    .line 9
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 10
    .line 11
    new-instance v1, La/fbt;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v1, p0, p1, v2, v3}, La/fbt;-><init>(La/pbt;Ljava/util/List;La/yje;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, p2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
