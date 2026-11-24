.class public final synthetic La/dsa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fsa0;


# direct methods
.method public synthetic constructor <init>(La/fsa0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dsa0;->a:B

    iput-object p1, p0, La/dsa0;->b:La/fsa0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/dsa0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/dsa0;->b:La/fsa0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/asa0;

    .line 9
    .line 10
    sget-object v0, La/fsa0;->V1:La/nh70;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/fsa0;->G0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p1, La/uid;

    .line 26
    .line 27
    sget-object v0, La/fsa0;->V1:La/nh70;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/fsa0;->G0()La/k3t0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v0, La/qra0;

    .line 37
    .line 38
    invoke-direct {v0, p1}, La/qra0;-><init>(La/uid;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
