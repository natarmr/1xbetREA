.class public final synthetic La/sbe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mie0;


# direct methods
.method public synthetic constructor <init>(La/mie0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sbe0;->a:B

    iput-object p1, p0, La/sbe0;->b:La/mie0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/sbe0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/sbe0;->b:La/mie0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/mie0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 11
    .line 12
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance v0, La/j6u0;

    .line 19
    .line 20
    invoke-direct {v0}, La/j6u0;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/mie0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_1
    sget-object v0, Lokhttp3/internal/ws/RealWebSocket;->x:Ljava/util/List;

    .line 29
    .line 30
    iget-object p0, p0, La/mie0;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ljava/io/Closeable;

    .line 33
    .line 34
    invoke-static {p0}, Lokhttp3/internal/_UtilCommonKt;->b(Ljava/io/Closeable;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
