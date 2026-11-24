.class public final synthetic La/m0z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/jam0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/jam0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/m0z;->a:B

    iput-object p1, p0, La/m0z;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/m0z;->c:La/jam0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/m0z;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/m0z;->c:La/jam0;

    .line 4
    .line 5
    iget-object p0, p0, La/m0z;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/pt30;

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/pt30;-><init>(La/jam0;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    new-instance v0, La/rt30;

    .line 22
    .line 23
    invoke-direct {v0, v1}, La/rt30;-><init>(La/jam0;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    new-instance v0, La/ot30;

    .line 33
    .line 34
    invoke-direct {v0, v1}, La/ot30;-><init>(La/jam0;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
