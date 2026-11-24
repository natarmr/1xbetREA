.class public final synthetic La/f7n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cqq;


# direct methods
.method public synthetic constructor <init>(La/cqq;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/f7n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/f7n;->b:La/cqq;

    return-void
.end method

.method public synthetic constructor <init>(La/y6q0;La/cqq;)V
    .locals 0

    .line 2
    const/4 p1, 0x0

    iput-byte p1, p0, La/f7n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/f7n;->b:La/cqq;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/f7n;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/f7n;->b:La/cqq;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-static {p0}, La/cqq;->a(La/cqq;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
