.class public final La/us10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/hvk0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/hvk0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/us10;->a:B

    iput-object p1, p0, La/us10;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/us10;->c:La/hvk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/us10;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/us10;->c:La/hvk0;

    .line 4
    .line 5
    iget-object p0, p0, La/us10;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v2, La/qqk0;

    .line 11
    .line 12
    check-cast v1, La/n010;

    .line 13
    .line 14
    iget-wide v3, v1, La/n010;->b:J

    .line 15
    .line 16
    iget-wide v5, v1, La/n010;->c:J

    .line 17
    .line 18
    iget-object v7, v1, La/n010;->f:Ljava/lang/String;

    .line 19
    .line 20
    invoke-direct/range {v2 .. v7}, La/qqk0;-><init>(JJLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    new-instance v0, La/qqk0;

    .line 30
    .line 31
    check-cast v1, La/o0h;

    .line 32
    .line 33
    move-object v3, v1

    .line 34
    iget-wide v1, v3, La/o0h;->b:J

    .line 35
    .line 36
    move-object v5, v3

    .line 37
    iget-wide v3, v5, La/o0h;->c:J

    .line 38
    .line 39
    iget-object v5, v5, La/o0h;->g:Ljava/lang/String;

    .line 40
    .line 41
    invoke-direct/range {v0 .. v5}, La/qqk0;-><init>(JJLjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
