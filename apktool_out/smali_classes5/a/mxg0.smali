.class public final La/mxg0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g090;


# direct methods
.method public synthetic constructor <init>(La/g090;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/mxg0;->a:La/g090;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/mxg0;->a:La/g090;

    .line 2
    .line 3
    iget-object v0, p0, La/g090;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/mne;

    .line 6
    .line 7
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 8
    .line 9
    new-instance v1, La/s980;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x7

    .line 13
    invoke-direct {v1, p0, p1, v2, v3}, La/s980;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object p1, La/wne;->a:La/wne;

    .line 21
    .line 22
    if-ne p0, p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    :goto_0
    if-ne p0, p1, :cond_1

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method

.method public b()V
    .locals 2

    .line 1
    sget-object v0, La/pwf0;->c:La/pwf0;

    .line 2
    .line 3
    iget-object p0, p0, La/mxg0;->a:La/g090;

    .line 4
    .line 5
    iget-object p0, p0, La/g090;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/d190;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v1, ""

    .line 13
    .line 14
    iput-object v1, p0, La/d190;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, La/d190;->e:La/pwf0;

    .line 17
    .line 18
    return-void
.end method
