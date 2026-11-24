.class public final synthetic La/p82;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/y82;


# direct methods
.method public synthetic constructor <init>(La/y82;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p82;->a:B

    iput-object p1, p0, La/p82;->b:La/y82;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/p82;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/p82;->b:La/y82;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Long;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sget-object p1, La/y82;->V1:La/qek0;

    .line 15
    .line 16
    invoke-virtual {p0}, La/y82;->I0()La/k3t0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, La/h82;

    .line 21
    .line 22
    invoke-direct {p1, v0, v1}, La/h82;-><init>(J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    sget-object v0, La/y82;->V1:La/qek0;

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, La/y82;->I0()La/k3t0;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object p1, La/c82;->a:La/c82;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
