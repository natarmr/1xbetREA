.class public final synthetic La/wo4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/xo4;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/xo4;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wo4;->a:B

    iput-object p1, p0, La/wo4;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/wo4;->c:La/xo4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wo4;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/wo4;->c:La/xo4;

    .line 7
    .line 8
    iget-object v0, v0, La/xo4;->c:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p0, p0, La/wo4;->b:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    iget-object v0, p0, La/wo4;->b:Lkotlin/jvm/functions/Function1;

    .line 19
    .line 20
    iget-object p0, p0, La/wo4;->c:La/xo4;

    .line 21
    .line 22
    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_1
    iget-object v0, p0, La/wo4;->b:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    iget-object p0, p0, La/wo4;->c:La/xo4;

    .line 31
    .line 32
    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
