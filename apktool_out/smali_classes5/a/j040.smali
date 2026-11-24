.class public final synthetic La/j040;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/my30;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/my30;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/j040;->a:B

    iput-object p1, p0, La/j040;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/j040;->c:La/my30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/j040;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/j040;->c:La/my30;

    .line 4
    .line 5
    iget-object p0, p0, La/j040;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v1, La/jy30;

    .line 11
    .line 12
    iget-object v0, v1, La/jy30;->d:La/wy30;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    check-cast v1, La/ky30;

    .line 21
    .line 22
    iget-object v0, v1, La/ky30;->e:La/wy30;

    .line 23
    .line 24
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
