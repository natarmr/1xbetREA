.class public final synthetic La/d8j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/z8j0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/z8j0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/d8j0;->a:B

    iput-object p1, p0, La/d8j0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/d8j0;->c:La/z8j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/d8j0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/d8j0;->c:La/z8j0;

    .line 4
    .line 5
    iget-object p0, p0, La/d8j0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, La/gbj0;

    .line 14
    .line 15
    invoke-direct {v0, v1}, La/gbj0;-><init>(La/hej0;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v0, La/gbj0;

    .line 28
    .line 29
    invoke-direct {v0, v1}, La/gbj0;-><init>(La/hej0;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
        :pswitch_0
    .end packed-switch
.end method
