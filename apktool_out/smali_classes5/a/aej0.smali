.class public final synthetic La/aej0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zdj0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/zdj0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/aej0;->a:B

    iput-object p1, p0, La/aej0;->b:La/zdj0;

    iput-object p2, p0, La/aej0;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/aej0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/aej0;->b:La/zdj0;

    .line 7
    .line 8
    iget-object p0, p0, La/aej0;->c:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    invoke-static {v0, p0}, La/xdx;->F(La/zdj0;Lkotlin/jvm/functions/Function1;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    iget-object v0, p0, La/aej0;->b:La/zdj0;

    .line 17
    .line 18
    iget-object p0, p0, La/aej0;->c:Lkotlin/jvm/functions/Function1;

    .line 19
    .line 20
    invoke-static {v0, p0}, La/xdx;->F(La/zdj0;Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
