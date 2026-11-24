.class public final La/umt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/gr00;

.field public final b:La/xr;


# direct methods
.method public constructor <init>(La/gr00;La/xr;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/umt;->a:La/gr00;

    .line 5
    .line 6
    iput-object p2, p0, La/umt;->b:La/xr;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, La/umt;->b:La/xr;

    .line 2
    .line 3
    invoke-virtual {v0}, La/xr;->i()La/rl40;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, La/umt;->a:La/gr00;

    .line 8
    .line 9
    iget-object v1, p0, La/gr00;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/mne;

    .line 12
    .line 13
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 14
    .line 15
    new-instance v2, La/qa;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    invoke-direct {v2, p0, v0, v3, v4}, La/qa;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2, p1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
