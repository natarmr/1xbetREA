.class public final synthetic La/hzb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/rzb;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/rzb;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hzb;->a:B

    iput-object p1, p0, La/hzb;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/hzb;->c:La/rzb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/hzb;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/hzb;->c:La/rzb;

    .line 4
    .line 5
    iget-object p0, p0, La/hzb;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/w8f0;

    .line 11
    .line 12
    iget-object v1, v1, La/rzb;->a:La/u0f0;

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/w8f0;-><init>(La/u0f0;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    new-instance v0, La/w8f0;

    .line 24
    .line 25
    iget-object v1, v1, La/rzb;->a:La/u0f0;

    .line 26
    .line 27
    invoke-direct {v0, v1}, La/w8f0;-><init>(La/u0f0;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
