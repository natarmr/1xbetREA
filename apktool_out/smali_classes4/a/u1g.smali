.class public final synthetic La/u1g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w1g;


# direct methods
.method public synthetic constructor <init>(La/w1g;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u1g;->a:B

    iput-object p1, p0, La/u1g;->b:La/w1g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/u1g;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/u1g;->b:La/w1g;

    .line 4
    .line 5
    check-cast p1, La/abi0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/w1g;->d:La/v1g;

    .line 14
    .line 15
    iget-wide v0, p0, La/v1g;->c:J

    .line 16
    .line 17
    invoke-static {p1, v0, v1}, La/cbi0;->a(La/abi0;J)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, La/w1g;->c:La/v1g;

    .line 27
    .line 28
    iget-wide v0, p0, La/v1g;->c:J

    .line 29
    .line 30
    invoke-static {p1, v0, v1}, La/cbi0;->a(La/abi0;J)V

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
