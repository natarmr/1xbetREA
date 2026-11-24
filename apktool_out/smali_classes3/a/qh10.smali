.class public final synthetic La/qh10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/d250;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/d250;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qh10;->a:B

    iput-object p1, p0, La/qh10;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/qh10;->c:La/d250;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qh10;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/qh10;->c:La/d250;

    .line 4
    .line 5
    iget-object p0, p0, La/qh10;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p1, La/p050;

    .line 16
    .line 17
    iget-object v0, v1, La/d250;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {p1, v0}, La/p050;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v0, La/k150;

    .line 32
    .line 33
    iget-object v1, v1, La/d250;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-direct {v0, p1, v1}, La/k150;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
