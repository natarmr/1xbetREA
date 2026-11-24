.class public final synthetic La/sgh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/h7h;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/h7h;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sgh;->a:B

    iput-object p1, p0, La/sgh;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/sgh;->c:La/h7h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/sgh;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/sgh;->c:La/h7h;

    .line 4
    .line 5
    iget-object p0, p0, La/sgh;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-wide v0, v1, La/h7h;->a:J

    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    new-instance v0, La/sgh;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v0, p0, v1, v2}, La/sgh;-><init>(Lkotlin/jvm/functions/Function1;La/h7h;B)V

    .line 26
    .line 27
    .line 28
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 29
    .line 30
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, La/bjj;->a()V

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
        :pswitch_0
    .end packed-switch
.end method
