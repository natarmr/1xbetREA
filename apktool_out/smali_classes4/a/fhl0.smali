.class public final synthetic La/fhl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/ehl0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/ehl0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fhl0;->a:B

    iput-object p1, p0, La/fhl0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/fhl0;->c:La/ehl0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/fhl0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/fhl0;->c:La/ehl0;

    .line 4
    .line 5
    iget-object p0, p0, La/fhl0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    check-cast v1, La/chl0;

    .line 13
    .line 14
    iget-object v0, v1, La/chl0;->i:La/xgl0;

    .line 15
    .line 16
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    if-eqz p0, :cond_1

    .line 23
    .line 24
    check-cast v1, La/chl0;

    .line 25
    .line 26
    iget-object v0, v1, La/chl0;->i:La/xgl0;

    .line 27
    .line 28
    new-instance v1, La/vgl0;

    .line 29
    .line 30
    invoke-direct {v1, v0}, La/vgl0;-><init>(La/xgl0;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
