.class public final synthetic La/m3q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/e1w;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/e1w;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/m3q;->a:B

    iput-object p1, p0, La/m3q;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/m3q;->c:La/e1w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/m3q;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/m3q;->c:La/e1w;

    .line 4
    .line 5
    iget-object p0, p0, La/m3q;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, La/e1w;->a:La/jvw;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v1, La/yzv;

    .line 16
    .line 17
    invoke-direct {v1, v0}, La/yzv;-><init>(La/jvw;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    iget-object v0, v1, La/e1w;->a:La/jvw;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v1, La/yzv;

    .line 32
    .line 33
    invoke-direct {v1, v0}, La/yzv;-><init>(La/jvw;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
