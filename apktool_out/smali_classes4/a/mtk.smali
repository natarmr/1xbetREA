.class public final synthetic La/mtk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ptk;


# direct methods
.method public synthetic constructor <init>(La/ptk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mtk;->a:B

    iput-object p1, p0, La/mtk;->b:La/ptk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/mtk;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/mtk;->b:La/ptk;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ltk;

    .line 9
    .line 10
    iget-object p0, p0, La/ptk;->R1:La/z9f;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/svj;

    .line 19
    .line 20
    const/16 v2, 0xe

    .line 21
    .line 22
    invoke-direct {v1, v2}, La/svj;-><init>(B)V

    .line 23
    .line 24
    .line 25
    new-instance v2, La/iok;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v2, p0, v3}, La/iok;-><init>(La/wyg;B)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/e9k;

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x5

    .line 35
    invoke-direct {p0, v3, v4}, La/e9k;-><init>(IB)V

    .line 36
    .line 37
    .line 38
    sget-object v3, La/zdh;->r:La/zdh;

    .line 39
    .line 40
    new-instance v4, La/gbn;

    .line 41
    .line 42
    invoke-direct {v4, v1, p0, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 43
    .line 44
    .line 45
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 46
    .line 47
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    iget-object p0, p0, La/ptk;->L1:La/fiu0;

    .line 52
    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_0
    const-string p0, "viewModelFactory"

    .line 57
    .line 58
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    throw p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
