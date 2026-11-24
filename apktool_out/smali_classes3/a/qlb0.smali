.class public final synthetic La/qlb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/mza0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/mza0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qlb0;->a:B

    iput-object p1, p0, La/qlb0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/qlb0;->c:La/mza0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/qlb0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/qlb0;->c:La/mza0;

    .line 4
    .line 5
    iget-object p0, p0, La/qlb0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    check-cast p1, La/st0;

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
    new-instance v0, La/ck60;

    .line 16
    .line 17
    const/16 v2, 0xa

    .line 18
    .line 19
    invoke-direct {v0, p0, p1, v1, v2}, La/ck60;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 23
    .line 24
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, La/bjj;->a()V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v2, La/uya0;

    .line 38
    .line 39
    iget-wide v3, p1, La/st0;->a:J

    .line 40
    .line 41
    iget-wide v5, v1, La/mza0;->b:J

    .line 42
    .line 43
    iget-object v7, v1, La/mza0;->a:La/fza0;

    .line 44
    .line 45
    iget-object v8, p1, La/st0;->g:Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-direct/range {v2 .. v8}, La/uya0;-><init>(JJLa/fza0;Ljava/lang/Integer;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
