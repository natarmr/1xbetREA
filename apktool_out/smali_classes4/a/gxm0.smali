.class public final La/gxm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/mxm0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/mxm0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gxm0;->a:B

    iput-object p1, p0, La/gxm0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/gxm0;->c:La/mxm0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/gxm0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/gxm0;->c:La/mxm0;

    .line 4
    .line 5
    iget-object p0, p0, La/gxm0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/mvl;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p1, La/dxm0;

    .line 16
    .line 17
    iget-wide v0, v1, La/mxm0;->a:J

    .line 18
    .line 19
    invoke-direct {p1, v0, v1}, La/dxm0;-><init>(J)V

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
    check-cast p1, La/mvl;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance p1, La/dxm0;

    .line 34
    .line 35
    iget-wide v0, v1, La/mxm0;->a:J

    .line 36
    .line 37
    invoke-direct {p1, v0, v1}, La/dxm0;-><init>(J)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
