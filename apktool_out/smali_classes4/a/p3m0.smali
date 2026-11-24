.class public final synthetic La/p3m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dp20;


# direct methods
.method public synthetic constructor <init>(La/dp20;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p3m0;->a:B

    iput-object p1, p0, La/p3m0;->b:La/dp20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/p3m0;->a:B

    .line 2
    .line 3
    check-cast p1, La/w6k;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-wide v0, La/r3m0;->b:J

    .line 12
    .line 13
    iget-object p0, p0, La/p3m0;->b:La/dp20;

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, La/dp20;->b(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    new-instance v0, La/adl;

    .line 20
    .line 21
    invoke-direct {v0, p0, p1}, La/adl;-><init>(J)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget-wide v0, La/r3m0;->c:J

    .line 29
    .line 30
    iget-object p0, p0, La/p3m0;->b:La/dp20;

    .line 31
    .line 32
    invoke-virtual {p0, v0, v1}, La/dp20;->b(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    new-instance v0, La/adl;

    .line 37
    .line 38
    invoke-direct {v0, p0, p1}, La/adl;-><init>(J)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
