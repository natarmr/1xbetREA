.class public final synthetic La/umd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ymd0;


# direct methods
.method public synthetic constructor <init>(La/ymd0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/umd0;->a:B

    iput-object p1, p0, La/umd0;->b:La/ymd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/umd0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/umd0;->b:La/ymd0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/ymd0;->o2:La/fl70;

    .line 9
    .line 10
    new-instance v0, La/da0;

    .line 11
    .line 12
    new-instance v1, La/tmd0;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, p0, v2}, La/tmd0;-><init>(La/ymd0;B)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, La/da0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    iget-object p0, p0, La/ymd0;->h2:La/fiu0;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    const-string p0, "viewModelFactory"

    .line 28
    .line 29
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
